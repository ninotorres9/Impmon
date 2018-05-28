TAG_NUMBER = 0


def resetTagNumber():
    global TAG_NUMBER
    TAG_NUMBER = 0


def getTagNumber():
    global TAG_NUMBER
    result = TAG_NUMBER
    TAG_NUMBER += 1
    return result


def joinLineBreak(strs):
    return "\n  ".join(strs)


def getPushCode(value, prefix=""):
    return "push {prefix}{value}".format(prefix=prefix, value=value)


def getTagCode(name, number=None):
    if (number is None):
        return "tag @{name}".format(name=name)
    else:
        return "tag @{name}_{number}".format(name=name, number=number)


def getAssignCode(name):
    return "assign %{name}".format(name=name)


def getJumpCode(instruction, tag, number):
    return "{instruction} @{tag}_{number}".format(
        instruction=instruction, tag=tag, number=number)


def generateStmtsCode(getStatements):
    def decorate(self, ctx):
        return joinLineBreak(getStatements(self, ctx))

    return decorate


def generateDefuncCode(getContext):
    def decorate(self, ctx):
        name, body = getContext(self, ctx)
        return joinLineBreak([getTagCode(name), body])

    return decorate


def generateIfCode(getContext):
    def decorate(self, ctx):
        condition, ifBody, elseBody = getContext(self, ctx)
        number = getTagNumber()
        return joinLineBreak([
            getTagCode("IF_CONDITION", number), condition,
            getJumpCode("jz", "ELSE_BODY", number),
            getTagCode("IF_BODY", number), ifBody,
            getJumpCode("jmp", "END_IF", number),
            getTagCode("ELSE_BODY", number), elseBody,
            getTagCode("END_IF", number)
        ])

    return decorate


def generateForCode(getContext):
    def decorate(self, ctx):
        initialization, conditon, increment, body = getContext(self, ctx)
        number = getTagNumber()
        return joinLineBreak([
            getTagCode("FOR_INITIALIZATION", number), initialization,
            getTagCode("FOR_CONDITION", number), conditon,
            getJumpCode("jz", "END_FOR", number),
            getTagCode("FOR_BODY", number), body,
            getTagCode("FOR_INCREMENT", number), increment,
            getJumpCode("jmp", "FOR_CONDITION", number),
            getTagCode("END_FOR", number),
        ])

    return decorate


def generateWhileCode(getContext):
    def decorate(self, ctx):
        condition, whileBody = getContext(self, ctx)
        number = getTagNumber()
        return joinLineBreak([
            getTagCode("WHILE_CONDITION", number), condition,
            getJumpCode("jz", "END_WHILE", number),
            getTagCode("WHILE_BODY", number), whileBody,
            getJumpCode("jmp", "WHILE_CONDITION", number),
            getTagCode("END_WHILE", number)
        ])

    return decorate


def generateBinaryCode(op):
    def decorate(getContext):
        def wrapper(self, ctx):
            lhs, rhs = getContext(self, ctx)
            return joinLineBreak([lhs, rhs, op])

        return wrapper

    return decorate


def generatePrintCode(getContext):
    def decorate(self, ctx):
        value = getContext(self, ctx)
        return joinLineBreak([value, "print"])

    return decorate


def generateAssignCode(getContext):
    def decorate(self, ctx):
        name, value = getContext(self, ctx)
        return joinLineBreak([value, getAssignCode(name)])

    return decorate


def generateCallArrayCode(getContext):
    def decorate(self, ctx):
        name, index = getContext(self, ctx)
        return joinLineBreak([index, getPushCode("&"), getPushCode(name, "%")])

    return decorate


def generateArrayCode(getContext):
    def decorate(self, ctx):
        args, length = getContext(self, ctx)
        return joinLineBreak(args + [getPushCode(length), getPushCode("&")])

    return decorate


def generateOperationAssignCode(op):
    def decorate(getContext):
        def wrapper(self, ctx):
            name, value = getContext(self, ctx)
            return joinLineBreak(
                [getPushCode(name, "%"), value, op,
                 getAssignCode(name)])

        return wrapper

    return decorate


def generateIntCode(getValue):
    def decorate(self, ctx):
        return getPushCode(getValue(self, ctx))

    return decorate


def generateIdenCode(getValue):
    def decorate(self, ctx):
        return getPushCode(getValue(self, ctx), "%")

    return decorate
