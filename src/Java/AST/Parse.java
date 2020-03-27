package Java.AST;

import Java.AST.QueryStmt.Statement;
import Java.Visitor.ASTVisitor;

import java.util.ArrayList;
import java.util.List;

public class Parse extends Node {
    private List<Statement> sqlStmts = new ArrayList<Statement>();
    private List<FunctionDeclaration> functions = new ArrayList<FunctionDeclaration>();
    private List<var_stmt> var_stmts = new ArrayList<var_stmt>();

    public List<var_stmt> getVar_stmts() {
        return var_stmts;
    }

    public void setVar_stmts(List<var_stmt> var_stmts) {
        this.var_stmts = var_stmts;
    }

    public void addQuery(Statement query){
        this.sqlStmts.add(query);
    }

    public void setSqlStmts(List<Statement> sqlStmts) {
        this.sqlStmts = sqlStmts;
    }

    public void setFunctions(List<FunctionDeclaration> functions) {
        this.functions = functions;
    }

    public List<Statement> getSqlStmts() {
        return sqlStmts;
    }

    public List<FunctionDeclaration> getFunctions() {
        return functions;
    }

    @Override
    public String toString(){
        return "sql stmts = "+ getSqlStmts().get(0).getName();
    }
    @Override
    public void accept(ASTVisitor astVisitor){
        astVisitor.visit(this);
//        this.sqlStmts.forEach( stmt -> stmt.accept(astVisitor));
        for(int i = 0 ; i < this.sqlStmts.size() ; i++){
            this.sqlStmts.get(i).accept(astVisitor);
        }   for(int i = 0 ; i < this.functions.size() ; i++){
            this.functions.get(i).accept(astVisitor);
        }
    }
}
