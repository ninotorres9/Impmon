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


def getCallCode(name):
    return "call @{name}".format(name=name)


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


def generateTop_defsCode(getContext):
    def decorate(self, ctx):
        defs = getContext(self, ctx)
        return joinLineBreak(defs)

    return decorate


def generateStmtsCode(getStatements):
    def decorate(self, ctx):
        stmts = getStatements(self, ctx)
        return joinLineBreak(stmts)

    return decorate


def getBindCode(funcname):
    return "bind @{funcname}".format(funcname=funcname)


def generateDeclassCode(getContext):
    def decorate(self, ctx):
        name, variables, funcs, functionNames = getContext(self, ctx)
        return joinLineBreak(
            [getTagCode(name)] + variables +
            [getBindCode(funcname)
             for funcname in functionNames] + ["end_class"] + funcs)

    return decorate


def generateDefuncCode(getContext):
    def decorate(self, ctx):
        name, params, body = getContext(self, ctx)
        if (name == 'main'):
            return joinLineBreak([getTagCode(name), params, body])
        else:
            return joinLineBreak([getTagCode(name), params, body, "ret"])

    return decorate


def generateCallFuncCode(getContext):
    def decorate(self, ctx):
        name, args = getContext(self, ctx)
        return joinLineBreak(args + [getCallCode(name)])

    return decorate


def generateCallMember(getContext):
    def decorate(self, ctx):
        name, member = getContext(self, ctx)
        return joinLineBreak([
            getPushCode("{name}.{member}".format(name=name, member=member),
                        "%")
        ])

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
            getTagCode("FOR_INITIALIZATION", number),
            initialization,
            getTagCode("FOR_CONDITION", number),
            conditon,
            getJumpCode("jz", "END_FOR", number),
            getTagCode("FOR_BODY", number),
            body,
            getTagCode("FOR_INCREMENT", number),
            increment,
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


def generateReturnStmtCode(getContext):
    def decorate(self, ctx):
        value = getContext(self, ctx)
        return joinLineBreak([value])

    return decorate


def generatePrintCode(getContext):
    def decorate(self, ctx):
        value = getContext(self, ctx)
        return joinLineBreak([value, "print"])

    return decorate


def generateCreateclassCode(getContext):
    def decorate(self, ctx):
        classType, className = getContext(self, ctx)
        return "create_class {type} {name}".format(
            type=classType, name=className)

    return decorate


def generateAssignCode(getContext):
    def decorate(self, ctx):
        prefix, name, value = getContext(self, ctx)
        return joinLineBreak([value, prefix, getAssignCode(name)])

    return decorate


def generateOperationAssignCode(op):
    def decorate(getContext):
        def wrapper(self, ctx):
            prefix, name, value = getContext(self, ctx)
            return joinLineBreak([
                prefix,
                getPushCode(name, "%"), value, op, prefix,
                getAssignCode(name)
            ])

        return wrapper

    return decorate


def generateCallArrayCode(getContext):
    def decorate(self, ctx):
        name, index = getContext(self, ctx)
        return joinLineBreak([index, "index", getPushCode(name, "%")])

    return decorate


def generateArrayCode(getContext):
    def decorate(self, ctx):
        args, length = getContext(self, ctx)
        return joinLineBreak(args + [getPushCode(length), "array"])

    return decorate


def generateIntCode(getValue):
    def decorate(self, ctx):
        return getPushCode(getValue(self, ctx))

    return decorate


def generateIdenCode(getValue):
    def decorate(self, ctx):
        return getPushCode(getValue(self, ctx), "%")

    return decorate


def generateArgsCode(getContext):
    def decorate(self, ctx):
        args = getContext(self, ctx)
        return joinLineBreak(args)

    return decorate


def generateParamsCode(getContext):
    def decorate(self, ctx):
        params = getContext(self, ctx)
        return joinLineBreak(params)

    return decorate


def generateParamCode(getContext):
    def decorate(self, ctx):
        name = getContext(self, ctx)
        return getAssignCode(name)

    return decorate
