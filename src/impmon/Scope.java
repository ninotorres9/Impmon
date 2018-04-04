package impmon;

import java.lang.reflect.Array;
import java.util.*;

public class Scope {
    public static class Variable{
        public Variable(String type, String name){
            type_ = type;
            name_ = name;
        }
        public String type_;
        public String name_;
    }

    public static class BaseScope{
        public String name_;
        public BaseScope parent_;
        public ArrayList<BaseScope> children_ = new ArrayList<BaseScope>();
        public Hashtable<String, Variable> variableTable_ = new Hashtable<String, Variable>();
        BaseScope(BaseScope parent, String name){
            parent_ = parent;
            name_ = name;
        }
    }

    public static class TopScope{
        public BaseScope currentScope_ = new BaseScope(null, "");
        public Hashtable<String, String> variableTable_ = new Hashtable<String, String>();

        private String currentName(){
            return currentScope_.name_;
        }
        public void createVariable(String key, Variable variable){
            if(!currentName().equals("")){
                // varname -> scope_varname
                // 为避免局部作用域重名
                variable.name_ = currentName() + "_" + variable.name_;
            }
            currentScope_.variableTable_.put(key, variable);
        }
        public Variable findVariable(String key){
            return findVariable(key, currentScope_);
        }
        public String getType(String key){
            return findVariable(key, currentScope_).type_;
        }
        public String getName(String key){
            return findVariable(key, currentScope_).name_;
        }
        public ArrayList<String> getNames(){
            // 返回当前scope中所有name
            ArrayList<String> result = new ArrayList<String>();
            for(Map.Entry<String, Variable> entry : currentScope_.variableTable_.entrySet()){
                // result.add(entry.getValue())
                result.add(entry.getValue().name_);
            }
            return result;
        }
        public boolean hasVariable(String key){
            if(findVariable(key, currentScope_) != null) {
                return true;
            }else{
                return false;
            }
        }
        public void addSubScope(String name){
            addChild(name);
            enterNewChild();
        }
        public void exitScope(){
            returnParent();
        }

        private void addChild(String name){
            BaseScope child = new BaseScope(currentScope_, name);
            currentScope_.children_.add(child);
        }
        private void enterNewChild(){
            int lastIndex = currentScope_.children_.size() - 1;
            currentScope_ = currentScope_.children_.get(lastIndex);
        }
        private void returnParent(){
            currentScope_ = currentScope_.parent_;
        }
        private Variable findVariable(String key, BaseScope scope){
            boolean result = scope.variableTable_.containsKey(key);
            /*
			首先在当前scope搜索，无结果转向parent scope继续搜索，
			均无结果返回null
			*/
            if(result){
                return scope.variableTable_.get(key);
            }else if(scope.parent_ != null){
                return findVariable(key, scope.parent_);
            }else{
                return null;
            }
        }
    }
}
