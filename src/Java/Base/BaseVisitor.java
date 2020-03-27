package Java.Base;

import Java.AST.*;
import Java.AST.QueryStmt.*;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import gen.SQLBaseVisitor;
import gen.SQLParser;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class BaseVisitor  extends SQLBaseVisitor {

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Parse visitParse(SQLParser.ParseContext ctx) {
        //System.out.println("visitParse");
        Parse p = new Parse ();
        if(!ctx.sql_stmt_list().isEmpty()) {
            List<Statement> sqlStmts = visitSql_stmt_list(ctx.sql_stmt_list(0));
            p.setSqlStmts(sqlStmts);
            p.setLine(ctx.getStart().getLine()); //get line number
            p.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        }
        if(!ctx.functiondeclaration().isEmpty())
        {
            List<FunctionDeclaration> functionDeclarations = new ArrayList<FunctionDeclaration> (  ) ;
            for (int i =0; i < ctx.functiondeclaration ().size() ; i++){

                ;            functionDeclarations.add ( visitFunctiondeclaration ( ctx.functiondeclaration ( i ) ));

            }
            p.setFunctions (functionDeclarations);}

        if(ctx.var_stmt ()!=null) {
            List<var_stmt> var_stmts = new ArrayList<var_stmt>();
            for (int i = 0; i < ctx.var_stmt().size(); i++) {
                var_stmts.add(visitVar_stmt(ctx.var_stmt(i)));
                p.setVar_stmts(var_stmts);


            }
            p.setLine(ctx.getStart().getLine()); //get line number
            p.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        }



        return p;
    }

    @Override
    public var_stmt visitVar_stmt(SQLParser.Var_stmtContext ctx) {
        //System.out.println("visitVar_stmt");
        var_stmt var_stmt= new var_stmt ();
        if (ctx.K_VAR ()!= null)
        {

            var_stmt.setK_VAR (ctx.K_VAR ().getSymbol ().getText ());
        }
        if (ctx.name_x ()!=null)
        {
            var_stmt.setName_x ( ctx.name_x ().getText () );
        }
        if(ctx.ASSIGN(0)!=null)
        {
            System.out.println(ctx.ASSIGN());
        var_stmt.setASSIGN (true);

        if (ctx.json_stmt ()!= null)
        {
            var_stmt.setJson_stmt1(true);
            var_stmt.setJson_stmt ( visitJson_stmt ( ctx.json_stmt () ) );
        }
        if(ctx.argument_stmt ()!=null)
        {
            var_stmt.setArgument_stmt1(true);
            var_stmt.setArgument_stmt ( visitArgument_stmt ( ctx.argument_stmt () ) );
        }
        if (ctx.higher_stmt ()!= null)
        {
            var_stmt.setHigher_stmt1(true);
            var_stmt.setHigher_stmt ( visitHigher_stmt ( ctx.higher_stmt () ) );
        }
        if (ctx.expr()!=null)
        {
            var_stmt.setExpr1(true);
            var_stmt.setExpr(visitExpr(ctx.expr()));
        }
        if (ctx.select_core()!=null)
        {

            var_stmt.setSelect_Core(true);
            //   var_stmt.setSelect_core(visitSelect_core(ctx.select_core(0)));
        }}
        return  var_stmt;
        //    return visitChildren(ctx);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitError(SQLParser.ErrorContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public List<Statement> visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx) {

        //System.out.println("visitSql_stmt_list");

        List<Statement> sqlStmt = new ArrayList<Statement>();
        for (int i =0; i < ctx.sql_stmt().size() ; i++){
            sqlStmt.add(visitSql_stmt(ctx.sql_stmt(i)));
        }

        return sqlStmt;
//        return visitChildren(ctx);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Statement visitSql_stmt(SQLParser.Sql_stmtContext ctx) {

        //System.out.println("visitSql_stmt   ");
        Statement s = new Statement ();
        if (ctx.factored_select_stmt() != null) {
            s = visitFactored_select_stmt(ctx.factored_select_stmt());
        } else if (ctx.update_stmt() != null) {
            s = visitUpdate_stmt(ctx.update_stmt());
        }
        else if (ctx.delete_stmt() != null)
            s = visitDelete_stmt(ctx.delete_stmt());
        else if(ctx.drop_table_stmt()!=null)
            s=visitDrop_table_stmt(ctx.drop_table_stmt());
        else  if(ctx.create_table_stmt()!=null)
            s=visitCreate_table_stmt(ctx.create_table_stmt());
        else  if(ctx.alter_table_stmt ()!= null) {
            s=visitAlter_table_stmt ( ctx.alter_table_stmt () );

       }
        else if(ctx.insert_stmt()!=null) {
            s = visitInsert_stmt ( ctx.insert_stmt () );
        }
       return s;
//        return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        //System.out.println("visitSelect_stmt");

        SelectStmt selectStmt=new SelectStmt ();
        if(ctx.select_or_values()!=null)
            selectStmt.setSelect_or_values(visitSelect_or_values(ctx.select_or_values()));
        if(ctx.ordering_term()!=null)
        {
            ArrayList<Ordering_term>ordering_terms=new ArrayList<>();
            for(int i=0;i<ctx.ordering_term().size();i++)
                ordering_terms.add(visitOrdering_term(ctx.ordering_term(i)));

            selectStmt.setOrdering_terms(ordering_terms);

        }
        if(ctx.K_LIMIT()!=null)
        {
            selectStmt.setK_LIMIT(true);
            selectStmt.setLimit(visitExpr(ctx.expr(0)));
        }
        if(ctx.K_OFFSET()!=null)
        {
            selectStmt.setK_OFFSET(true);
            selectStmt.setOffer(visitExpr(ctx.expr(0)));
        }
        return selectStmt;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Factored_select_Stmt visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx)
    {
        //System.out.println("visitFactored_select_stmt");
        Factored_select_Stmt factored_select_stmt=new Factored_select_Stmt ();
        //SelectStmt select = new SelectStmt();
        factored_select_stmt.setName("Select_Stmt");
        if(ctx.select_core()!=null)
            factored_select_stmt.setSelect_core(visitSelect_core(ctx.select_core()));
        if(ctx.ordering_term()!=null)
        {
            ArrayList<Ordering_term>ordering_terms=new ArrayList<>();
            for(int i=0;i<ctx.ordering_term().size();i++)
                ordering_terms.add(visitOrdering_term(ctx.ordering_term(i)));

            factored_select_stmt.setOrdering_terms(ordering_terms);

        }
        if(ctx.K_LIMIT()!=null)
        {
            factored_select_stmt.setK_LIMIT(true);
            factored_select_stmt.setLIMIT(visitExpr(ctx.expr(0)));
        }
        if(ctx.K_OFFSET()!=null)
        {
            factored_select_stmt.setK_OFFSET(true);
            factored_select_stmt.setOFFSET(visitExpr(ctx.expr(0)));
        }

        return factored_select_stmt;

    }
    @Override public Select_Core visitSelect_core(SQLParser.Select_coreContext ctx) {
        //System.out.println("visitSelect_core");
        Select_Core select_core=new Select_Core ();
        if(ctx.K_DISTINCT()!=null)
            select_core.setK_DISTINCT(true);
        if(ctx.K_ALL()!=null)
            select_core.setK_ALL(true);
        if(ctx.result_column()!=null)
        {
            ArrayList<Result_Column>result_columns=new ArrayList<>();
            for (int  i=0; i<ctx.result_column().size();i++)
                result_columns.add(visitResult_column(ctx.result_column(i)));
            select_core.setResult_columns(result_columns);
        }
        if(ctx.K_FROM()!=null) {
            if (ctx.table_or_subquery() != null) {
                ArrayList<Table_Or_Subquery> table_or_subqueries = new ArrayList<>();
                for (int i = 0; i < ctx.table_or_subquery().size(); i++)
                    table_or_subqueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
                select_core.setTable_or_subqueries(table_or_subqueries);
            }
        }
        if(ctx.K_WHERE()!=null) {
            select_core.setK_WHERE(true);
            select_core.setWHERE(visitExpr(ctx.expr(0)));
        }
        if(ctx.K_GROUP()!=null&&ctx.K_BY()!=null)
        {
            select_core.setK_GROUPBY(true);
            ArrayList<expr>exps=new ArrayList<>();
            for(int i=0 ;i<ctx.expr().size();i++)
                exps.add(visitExpr(ctx.expr(i)));
            //if(ctx.K_HAVING()!=null)
               // select_core.setHaving(visitExpr(ctx.expr(0)));
            select_core.setGroupby(exps);
        }

        if(ctx.K_VALUES()!=null)
        {
            select_core.setK_VALUES(true);
            ArrayList<expr>exps=new ArrayList<>();
            for(int i=0 ;i<ctx.expr().size();i++)
                exps.add(visitExpr(ctx.expr(i)));
            select_core.setVALUES(exps);
        }
        if(ctx.join_clause()!=null)
        {
            select_core.setJoin_clause(visitJoin_clause(ctx.join_clause()));
        }

        return select_core;
    }
    @Override public Insert_Stmt visitInsert_stmt(SQLParser.Insert_stmtContext ctx) {

        //System.out.println("visitInsert_stmt");
        Insert_Stmt insert_stmt=new Insert_Stmt ();
        insert_stmt.setName("Insert");
        if(ctx.database_name()!=null)
            insert_stmt.setDatabasename(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.table_name()!=null)
            insert_stmt.setTablename(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.column_name()!=null)
        {
            ArrayList<String>copy=new ArrayList<>();
            for(int i=0;i<ctx.column_name().size();i++)
                copy.add(ctx.column_name(i).any_name().IDENTIFIER().getSymbol().getText());
            insert_stmt.setColomname(copy);

        }
        if(ctx.K_VALUES()!=null) {
            insert_stmt.setK_VALUES(true);
            if (ctx.expr() != null) {
                ArrayList<expr> exps = new ArrayList<expr>();
                for (int i = 0; i < ctx.expr().size(); i++)
                    exps.add(visitExpr(ctx.expr(i)));
                insert_stmt.setExps(exps);
            }


            if (ctx.K_DEFAULT() != null)
                if (ctx.K_VALUES() != null) {
                    insert_stmt.setK_DEFAULT(true);
                    insert_stmt.setK_VALUES(true);
                }
        }
        if(ctx.select_stmt()!=null)
        {
            insert_stmt.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        }






        return insert_stmt;


    }
    @Override public UpdateStmt visitUpdate_stmt(SQLParser.Update_stmtContext ctx) {
        //System.out.println("update_stmt");
        UpdateStmt update = new UpdateStmt ();
        update.setName("Update");
        update.setQualified_table(visitQualified_table_name(ctx.qualified_table_name()));
        // UpdateStmt test=new UpdateStmt();
        //test.setColumnnames(update.getColumnnames());

        if(ctx.column_name()!=null)
        {
            ArrayList<String> copy=new ArrayList<>();
            for(int i=0;i<ctx.column_name().size();i++)
            {
                //System.out.println(i);
                copy.add(ctx.column_name(i).any_name().IDENTIFIER().getSymbol().getText());
                // System.out.println(copy);
            }
            update.setColumnnames(copy);
            System.out.println(update.getColumnname());
            System.out.println(update.getColumnnames());
        }
        if(ctx.expr()!=null)
        {
            ArrayList<expr> cope=new ArrayList<>();
            for(int i=0;i<ctx.expr().size();i++)
            {
                cope.add(visitExpr(ctx.expr(i)));
            }
            update.setExprs(cope);
        }
        return update;

    }
    @Override public Create_Stmt visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx) {
        Create_Stmt create = new Create_Stmt ();
        //System.out.println("Create_Stmt");
        create.setName("Create");
        if (ctx.database_name() != null)
            create.setDatabasename(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
        if (ctx.table_name() != null){
            create.setTablename(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
          //  System.out.println(create.getTablename());
        }
        if(ctx.column_def()!=null)
        {
            ArrayList<Column_def> column_defs=new ArrayList<>();
            for (int i =0 ; i< ctx.column_def().size();i++)
                column_defs.add(visitColumn_def(ctx.column_def(i)));
            create.setColumn_defs(column_defs);
            // create.setColumn_def(visitColumn_def(ctx.column_def(0)));

        }
        if(ctx.table_constraint()!=null)
        {
            ArrayList<Table_constraint> table_constraints=new ArrayList<>();
            for (int i =0 ; i< ctx.table_constraint().size();i++)
                table_constraints.add(visitTable_constraint(ctx.table_constraint(i)));
            create.setTable_constraints(table_constraints);
        }
        if(ctx.K_AS()!=null)
            create.setAS(true);
        if(ctx.select_stmt()!=null)
        {
            create.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        }





        return create;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public select_or_values visitSelect_or_values(SQLParser.Select_or_valuesContext ctx) {
        //System.out.println("visitSelect_or_values");
        select_or_values select_or_values=new select_or_values ();
        if(ctx.K_DISTINCT()!=null)
            select_or_values.setK_DISTINCT(true);
        if(ctx.K_ALL()!=null)
            select_or_values.setK_ALL(true);
        if(ctx.result_column()!=null)
        {
            ArrayList<Result_Column>result_columns=new ArrayList<>();
            for (int  i=0; i<ctx.result_column().size();i++)
                result_columns.add(visitResult_column(ctx.result_column(i)));
            select_or_values.setResult_columns(result_columns);
        }
        if(ctx.K_FROM()!=null) {
            if (ctx.table_or_subquery() != null) {
                ArrayList<Table_Or_Subquery> table_or_subqueries = new ArrayList<>();
                for (int i = 0; i < ctx.table_or_subquery().size(); i++)
                    table_or_subqueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
                select_or_values.setTable_or_subqueries(table_or_subqueries);
            }
        }
        if(ctx.K_WHERE()!=null) {
            select_or_values.setK_WHERE(true);
            select_or_values.setWhere(visitExpr(ctx.expr(0)));
            //select_or_values.setExpr(visitExpr(ctx.expr(0)));
        }
        if(ctx.K_GROUP()!=null&&ctx.K_BY()!=null)
        {
            select_or_values.setK_groupby(true);
            ArrayList<expr>exps=new ArrayList<>();
            for(int i=0 ;i<ctx.expr().size();i++)
                exps.add(visitExpr(ctx.expr(i)));
            select_or_values.setExprs(exps);
        }
        if(ctx.K_HAVING()!=null)
            select_or_values.setHaving(visitExpr(ctx.expr(0)));
        if(ctx.K_VALUES()!=null)
        {
            select_or_values.setK_VALUES(true);
            ArrayList<expr>exps=new ArrayList<>();
            for(int i=0 ;i<ctx.expr().size();i++)
                exps.add(visitExpr(ctx.expr(i)));
            select_or_values.setValues(exps);
        }
        return select_or_values;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Ordering_term visitOrdering_term(SQLParser.Ordering_termContext ctx) {
        //System.out.println("visitOrdering_term");
        Ordering_term ordering_term=new Ordering_term ();
        if(ctx.expr()!=null)
        {
            ordering_term.setExp(visitExpr(ctx.expr()));
        }
        if(ctx.K_COLLATE()!=null) {
            ordering_term.setK_COLLATE(true);
            ordering_term.setCollation_name(ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        if(ctx.K_ASC()!=null)
            ordering_term.setK_ASC(true);
        if(ctx.K_DESC()!=null)
            ordering_term.setK_DESC(true);
        return ordering_term;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    //@Override public  Object visitExpr(SQLParser.ExprContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Result_Column visitResult_column(SQLParser.Result_columnContext ctx) {
        //System.out.println("visitResult_column");
        Result_Column result_column = new Result_Column ();
        if (ctx.table_name() != null) {
            result_column.setTable_name(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
            if(ctx.DOT()!=null&&ctx.STAR()!=null)
            {
                result_column.setDOT(true);
                result_column.setSTAR(true);

            }
        }
        if(ctx.expr()!=null)
        {
            result_column.setExp(visitExpr(ctx.expr()));
            if(ctx.K_AS()!=null)
                result_column.setK_AS(true);
            if(ctx. column_alias()!=null)
                result_column.setColumn_alias(visitColumn_alias(ctx.column_alias()));
        }
        return result_column;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Table_Or_Subquery visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx) {
        //System.out.println("visitTable_or_subquery");
        Table_Or_Subquery table_or_subquery=new Table_Or_Subquery();

        if (ctx.database_name() != null) {
            table_or_subquery.setDatabase_name(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());

        }
        if(ctx.table_name()!=null)
            table_or_subquery.setTable_name(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.K_AS()!=null)
            table_or_subquery.setK_AS(true);
        if(ctx.table_alias()!=null)
            table_or_subquery.setTable_alias(ctx.table_alias().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.K_INDEXED()!=null)
        {
            table_or_subquery.setK_INDEXED(true);
            if (ctx.K_BY() != null) {
                table_or_subquery.setK_BY(true);
                table_or_subquery.setIndex_name(ctx.index_name().any_name().IDENTIFIER().getSymbol().getText());

            } else if (ctx.K_NOT() != null) {
                table_or_subquery.setK_NOT(true);
                table_or_subquery.setK_INDEXED(true);
            }
        }
        if(ctx.table_or_subquery()!=null)
        {
            ArrayList<Table_Or_Subquery>table_or_subqueries=new ArrayList<>();
            for(int i=0;i<ctx.table_or_subquery().size();i++)
                table_or_subqueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            if(table_or_subqueries.size()>0)
            table_or_subquery.setTable_or_subqueries(table_or_subqueries);

        }
        if(ctx.join_clause()!=null)
        {
            table_or_subquery.setJoin_clause(visitJoin_clause(ctx.join_clause()));
        }
        if(ctx.K_AS()!=null)
            table_or_subquery.setK_AS(true);
        if(ctx.table_alias()!=null)
            table_or_subquery.setTable_alias(ctx.table_alias().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.select_stmt()!=null)
            table_or_subquery.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));

        return table_or_subquery;
    }
    @Override public Join_Clause visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        //System.out.println("visitJoin_clause");
        Join_Clause join_clause=new Join_Clause ();
        if(ctx.table_or_subquery()!=null)
        {
            ArrayList<Table_Or_Subquery>table_or_subqueries=new ArrayList<>();
            for(int i=0 ;i<ctx.table_or_subquery().size();i++)
                table_or_subqueries.add(visitTable_or_subquery(ctx.table_or_subquery(i)));
            join_clause.setTable_or_subquery(table_or_subqueries);

        }
        if(ctx.join_operator()!=null)
        {
            ArrayList<Join_Operator>join_operators=new ArrayList<>();
            for(int i=0 ;i<ctx.join_operator().size();i++)
                join_operators.add(visitJoin_operator(ctx.join_operator(i)));
            join_clause.setJoin_operators(join_operators);
        }
        if(ctx.join_constraint()!=null)
        {
            ArrayList <Join_Constraint> join_constraints=new ArrayList<>();
            for(int i=0 ;i<ctx.join_constraint().size();i++)
                join_constraints.add(visitJoin_constraint(ctx.join_constraint(i)));
            join_clause.setJoin_constraints(join_constraints);
        }
        return join_clause;

    }
    @Override public Join_Constraint visitJoin_constraint(SQLParser.Join_constraintContext ctx) {
        //System.out.println("visitJoin_constraint");
        Join_Constraint join_constraint=new Join_Constraint ();
        if(ctx.K_ON()!=null)
        {
            join_constraint.setK_ON(true);

        }
        if(ctx.expr()!=null)
            join_constraint.setExp(visitExpr(ctx.expr()));
        return join_constraint;
    }
    @Override public Join_Operator visitJoin_operator(SQLParser.Join_operatorContext ctx) {
        //System.out.println("visitJoin_operator");
        Join_Operator join_operator=new Join_Operator ();
        if(ctx.K_LEFT()!=null) {
            join_operator.setLeft(true);
            if(ctx.K_OUTER()!=null)
                join_operator.setOuter(true);
        }
        if(ctx.K_INNER()!=null)
            join_operator.setInner(true);

        return join_operator;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public Column_Alias visitColumn_alias(SQLParser.Column_aliasContext ctx) {

//        System.out.println("visitColumn_alias");
        Column_Alias column_alias=new Column_Alias ();
        if(ctx.STRING_LITERAL()!=null)
            column_alias.setSTRING_LITERAL(ctx.STRING_LITERAL().getSymbol().getText());
        if(ctx.IDENTIFIER()!=null)
            column_alias.setIdenty(ctx.IDENTIFIER().getSymbol().getText());
        return column_alias;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  String visitTable_name(SQLParser.Table_nameContext ctx) {
        //System.out.println(  ctx.any_name().IDENTIFIER().getText());
        return ctx.any_name().IDENTIFIER().getText();
        //return visitChildren(ctx);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public collation_name visitCollation_name(SQLParser.Collation_nameContext ctx) {
     collation_name collation_name = new collation_name ();
     collation_name.setColumn_name ( ctx.any_name ().IDENTIFIER ().getSymbol ().getText ());
        return collation_name;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
   // @Override public  Object visitLiteral_value(SQLParser.Literal_valueContext ctx) { return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  String visitAny_name(SQLParser.Any_nameContext ctx) {
        return  ctx.getText ();}
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public  Object visitKeyword(SQLParser.KeywordContext ctx) { return visitChildren(ctx); }
    @Override public Drop_stmt visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx) {
        System.out.println("visitDrop_table_stmt");

        Drop_stmt drop = new Drop_stmt ();
        drop.setName("drop");
         if(ctx.K_IF ()!= null) {
             drop.setK_IF ( true );
         }
        if(ctx.K_EXISTS ()!= null) {
            drop.setK_EXISTS ( true );
        }
         if(ctx.database_name ()!=null)
         {
             drop.setDatabasename ( ctx.database_name ().getText () );
         }
          if (ctx.table_name ()!= null){
        drop.setTablname ( ctx.table_name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
          }

        return drop;
    }

    @Override
    public Typename visitType_name(SQLParser.Type_nameContext ctx) {
  //      System.out.println("visitType_name");
        Typename typename=new Typename ();
        if(ctx.name()!=null)
         typename.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.type_name_real()!=null)
        {
            ArrayList<Type_name_real>type_name_reals=new ArrayList<>();
            for(int i=0; i<ctx.type_name_real().size();i++)
                type_name_reals.add(visitType_name_real(ctx.type_name_real(i)));
            typename.setType_name_reals(type_name_reals);
        }

        return  typename;

    }

    @Override
    public Type_name_real visitType_name_real(SQLParser.Type_name_realContext ctx) {
    //    System.out.println("visitType_name_real");
        Type_name_real type_name_real=new Type_name_real ();
        if(ctx.any_name()!=null)
            type_name_real.setAnyName(ctx.any_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.signed_number()!=null)
        {
            type_name_real.setSigned_number(visitSigned_number(ctx.signed_number()));
        }
        return type_name_real;
    }
    @Override public  String visitName(SQLParser.NameContext ctx) {
       String text="";
       text=ctx.any_name ().IDENTIFIER ().getSymbol ().getText ();
       return  text;
        //    return visitChildren(ctx);
    }
//    @Override public String visitSigned_number(SQLParser.Signed_numberContext ctx) {
//    return  ctx.getText ();
//        //    return visitChildren(ctx);
//    }
    @Override public  String visitDatabase_name(SQLParser.Database_nameContext ctx) {
      //  System.out.println("visitDatabase_name");
        return ctx.any_name().IDENTIFIER().getText();

      }

    @Override
    public database_name1 visitDatabase_name1(SQLParser.Database_name1Context ctx) {
        //System.out.println("visitDatabase_name1");
        database_name1 database_name=new database_name1 ();
        System.out.println("hello");
        System.out.println(ctx.column_name());
        if ((ctx.column_name()!=null))
            database_name.setColumnname(ctx.column_name().any_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.database_name()!=null)
        {
            ArrayList<String > cope=new ArrayList<>();
            for(int i=0;i<ctx.database_name().size();i++)
                cope.add(ctx.database_name(i).any_name().IDENTIFIER().getSymbol().getText());
            database_name.setDatabasename(cope);
        }
        if(ctx.table_name()!=null)
        {
            ArrayList<String > cope=new ArrayList<>();
            for(int i=0;i<ctx.table_name().size();i++)
                cope.add(ctx.table_name(i).any_name().IDENTIFIER().getSymbol().getText());
            database_name.setTablenames(cope);
        }
//        return visitChildren(ctx);
        return database_name;
    }

    @Override public alter_table_stmt visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx) {

        //System.out.println("visitAlter_table_stmt");

        alter_table_stmt alter = new alter_table_stmt ();
         if (ctx.database_name ()!= null)
         {
             alter.setDatabease_name ( ctx.database_name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
          //   System.out.println (  " databease_name: " +alter.getDatabease_name () );
         }
        alter.setSource_name ( visitSource_table_name ( ctx.source_table_name ()) );
        if (ctx.K_RENAME ()!= null)
        {
            alter.setRename ( ctx.K_RENAME ().getSymbol ().getText () );
            System.out.println ( alter.getRename () );
            alter.setTo ( ctx.K_TO ().getSymbol ().getText () );
            System.out.println ( alter.getTo () );
            alter.setNew_table_name ( ctx.new_table_name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
            System.out.println ( alter.getNew_table_name () );
        }
        if(ctx.alter_table_add ()!= null) {
            alter.setAlter_table_add ( visitAlter_table_add ( ctx.alter_table_add () ) );
        }
         if(ctx.alter_table_add_constraint ()!=null)
         {
             alter.setAlter_table_add_costraint ( visitAlter_table_add_constraint ( ctx.alter_table_add_constraint () ) );
         }

        if(ctx.K_COLUMN()!=null)
            alter.setColumn(true);
         if(ctx.column_def ()!=null){
             alter.setColumDef ( visitColumn_def ( ctx.column_def () ) );
         }


        alter.setName("alter");
        return alter;

      //  return visitChildren(ctx);

    }
    @Override public alter_table_add_costraint visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx) {
      alter_table_add_costraint alter_table_add_costraint= new alter_table_add_costraint ();
      alter_table_add_costraint.setName ( ctx.any_name ().IDENTIFIER ().getSymbol ().getText () );
        alter_table_add_costraint.setTable_constraint ( visitTable_constraint (ctx.table_constraint () ) );
         return alter_table_add_costraint;
    }
    @Override public alter_table_add visitAlter_table_add(SQLParser.Alter_table_addContext ctx) {
      //  System.out.println("visitAlter_table_add");
        alter_table_add alter_table_add = new alter_table_add ();
        Table_constraint tableConstraint= new Table_constraint ();
        alter_table_add.setAdd ( ctx.K_ADD ().getSymbol ().getText ());
        tableConstraint= ( visitTable_constraint ( ctx.table_constraint () ) );
        alter_table_add.setTable_constraint ( tableConstraint );
        return  alter_table_add;


        //return visitChildren(ctx);
        }
    @Override public Table_constraint visitTable_constraint(SQLParser.Table_constraintContext ctx) {
        //System.out.println("visitTable_constraint");
        Table_constraint table_constraint=new Table_constraint ();
        if(ctx.K_CONSTRAINT()!=null)
        {
            table_constraint.setK_CONSTRAINT(true);
            if (ctx.name() != null)
                table_constraint.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
        }
        if(ctx.K_CHECK()!=null) {
            table_constraint.setCheck(true);
            table_constraint.setExpr(visitExpr(ctx.expr()));

        }
        if(ctx.table_constraint_primary_key()!=null)
            table_constraint.setTable_constraint_pk(visitTable_constraint_primary_key(ctx.table_constraint_primary_key()));
        if(ctx.table_constraint_foreign_key()!=null)
            table_constraint.setTable_constraint_foreign_key(visitTable_constraint_foreign_key(ctx.table_constraint_foreign_key()));
        if(ctx.table_constraint_key()!=null)
            table_constraint.setTable_constraint_key(visitTable_constraint_key(ctx.table_constraint_key()));
        if(ctx.table_constraint_unique()!=null)
            table_constraint.setTable_constraint_unique(visitTable_constraint_unique(ctx.table_constraint_unique()));


        return table_constraint;
        //    return visitChildren(ctx);


    }
    @Override public Table_constraint_key visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx) {
        //System.out.println("visitTable_constraint_key");
        Table_constraint_key table_constraint_key=new Table_constraint_key ();
        if(ctx.name()!=null)
            table_constraint_key.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.indexed_column()!=null)
        {
            ArrayList<Index_column>index_columns=new ArrayList<>();
            for(int i=0;i<ctx.indexed_column().size();i++)
                index_columns.add(visitIndexed_column(ctx.indexed_column(i)));
            table_constraint_key.setIndex_columns(index_columns);

        }
        return table_constraint_key;
    }
    @Override public Table_constraint_PK visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx) {
        //System.out.println("visitTable_constraint_primary_key");
        Table_constraint_PK table_constraint_pk=new Table_constraint_PK ();
        if(ctx.indexed_column()!=null)
        {
            ArrayList<Index_column>index_columns=new ArrayList<>();
            for(int i=0;i<ctx.indexed_column().size();i++)
                index_columns.add(visitIndexed_column(ctx.indexed_column(i)));
            table_constraint_pk.setIndex_columns(index_columns);

        }

        return table_constraint_pk;
    }
    @Override public Table_constraint_foreign_key visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx) {
        //System.out.println("visitTable_constraint_foreign_key");
        Table_constraint_foreign_key table_constraint_foreign_key=new Table_constraint_foreign_key ();
        if(ctx.fk_origin_column_name()!=null)
        {
            ArrayList<String>copy=new ArrayList<>();
            for(int i=0;i<ctx.fk_origin_column_name().size();i++)
                copy.add(ctx.fk_origin_column_name(i).column_name().any_name().IDENTIFIER().getSymbol().getText());
            table_constraint_foreign_key.setFk_origin_column_names(copy);
        }
        if(ctx.foreign_key_clause()!=null)
            table_constraint_foreign_key.setForeign_key_clause(visitForeign_key_clause(ctx.foreign_key_clause()));

        return table_constraint_foreign_key ;
    }
    @Override public foreign_key_clause visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx) {
        //System.out.println("visitForeign_key_clause");
        foreign_key_clause foreign_key_clause=new foreign_key_clause ();
        if(ctx.database_name()!=null)
            foreign_key_clause.setDatabasename(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.foreign_table()!=null)
            foreign_key_clause.setForeign_table(ctx.foreign_table().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.match_name()!=null)
        {
            ArrayList<match_name>copy=new ArrayList<>();
            for(int i=0;i<ctx.match_name().size();i++)
                copy.add(visitMatch_name(ctx.match_name(i)));
           // for(int i=0;i<copy.size();i++)
            //    System.out.println(copy.get(i));
            foreign_key_clause.setMatch_names(copy);
        }

        if(ctx.fk_target_column_name()!=null)
        {
            ArrayList<String>copy=new ArrayList<>();
            for(int i=0;i<ctx.fk_target_column_name().size();i++)
                copy.add(ctx.fk_target_column_name(i).name().any_name().IDENTIFIER().getSymbol().getText());
            foreign_key_clause.setFk_target_column_names(copy);

        }


        return foreign_key_clause;
    }
    @Override public match_name visitMatch_name(SQLParser.Match_nameContext ctx) {
        //System.out.println("visitMatch_name");
        match_name match_name=new match_name ();
        if(ctx.K_ON()!=null)
        {
            match_name.setK_ON(true);
            if(ctx.K_DELETE()!=null)
            {
                match_name.setK_DELETE(true);
                if(ctx.K_SET()!=null)
                {
                    match_name.setK_SET(true);
                    if(ctx.K_NULL()!=null){
                        System.out.println("SET   NULL");
                        match_name.setK_NULL(true);}
                    if(ctx.K_DEFAULT()!=null){
                        System.out.println("SET     Defalt");
                        match_name.setK_DEFAULT(true);}
                }
                if(ctx.K_CASCADE()!=null) {
                    System.out.println(" CASCADE");
                    match_name.setK_CASCADE(true);
                }
                if(ctx.K_RESTRICT()!=null) {
                    System.out.println("RESTRICT");
                    match_name.setK_RESTRICT(true);
                }
                if(ctx.K_NO()!=null)
                {
                    match_name.setK_NO(true);
                    if (ctx.K_ACTION() != null) {
                        System.out.println("NO   ACTION");
                        match_name.setK_ACTION(true);
                    }
                }
                if(ctx.K_MATCH()!=null)
                {
                    match_name.setK_MATCH(true);
                    match_name.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
                }

            }
            if(ctx.K_UPDATE()!=null)
            {
                match_name.setK_UPDATE(true);
                if(ctx.K_SET()!=null)
                {
                    match_name.setK_SET(true);
                    if(ctx.K_NULL()!=null){
                        System.out.println("SET   NULL");
                        match_name.setK_NULL(true);}
                    if(ctx.K_DEFAULT()!=null){
                        System.out.println("SET     Defalt");
                        match_name.setK_DEFAULT(true);}
                }
                if(ctx.K_CASCADE()!=null) {
                    System.out.println(" CASCADE");
                    match_name.setK_CASCADE(true);
                }
                if(ctx.K_RESTRICT()!=null) {
                    System.out.println("RESTRICT");
                    match_name.setK_RESTRICT(true);
                }
                if(ctx.K_NO()!=null)
                {
                    match_name.setK_NO(true);
                    if (ctx.K_ACTION() != null) {
                        System.out.println("NO   ACTION");
                        match_name.setK_ACTION(true);
                    }
                }
                if(ctx.K_MATCH()!=null)
                {
                    match_name.setK_MATCH(true);
                    match_name.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
                }

            }
        }




        return match_name;
        //return visitChildren(ctx);
         }

    @Override public fk_target_column_name visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx) {
        fk_target_column_name fk_target_column_name = new fk_target_column_name ();
         fk_target_column_name.setName ( ctx.name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
         System.out.println (  ctx.name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
        return fk_target_column_name;
    }
    @Override public foreign_table visitForeign_table(SQLParser.Foreign_tableContext ctx) {
        //System.out.println("visitForeign_table");
        foreign_table foreign_table = new foreign_table ();
        foreign_table.setName ( ctx.any_name ().IDENTIFIER ().getSymbol ().getText () );
        System.out.println (  ctx.any_name ().IDENTIFIER ().getSymbol ().getText () );
         return  foreign_table;
    }
    @Override public fk_origin_colum visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx) {
        //System.out.println("visitFk_origin_column_name");
       fk_origin_colum fk_origin_colum = new fk_origin_colum ();

        fk_origin_colum.setColumn_names ( ctx.column_name().any_name().IDENTIFIER().getSymbol().getText() ) ;
     // fk_origin_colum.setColumn_name ( ctx.column_name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
      System.out.println ( ctx.column_name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
      return  fk_origin_colum;

    }
    @Override public Table_constraint_unique visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx) {
        //System.out.println("visitTable_constraint_unique");
        Table_constraint_unique table_constraint_unique=new Table_constraint_unique ();
        if(ctx.name()!=null)
            table_constraint_unique.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.indexed_column()!=null)
        {
            ArrayList<Index_column>index_columns=new ArrayList<>();
            for(int i=0;i<ctx.indexed_column().size();i++)
                index_columns.add(visitIndexed_column(ctx.indexed_column(i)));
            table_constraint_unique.setIndex_columns(index_columns);

        }
        return table_constraint_unique;    }
    @Override public Index_column visitIndexed_column(SQLParser.Indexed_columnContext ctx) {
        //System.out.println("visitIndexed_column");
        Index_column index_column=new Index_column ();
        if(ctx.column_name()!=null)
            index_column.setColumnname(ctx.column_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.collation_name()!=null)
            index_column.setCollation_name(ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.K_COLLATE()!=null)
            index_column.setK_COLLATE(true);
        if(ctx.K_ASC()!= null)
            index_column.setAsc(true);
        if(ctx.K_DESC()!=null)
            index_column.setDesc(true);
        return index_column;
    }
    @Override public String visitSource_table_name(SQLParser.Source_table_nameContext ctx) {
        //System.out.println("visitSource_table_name");
        String sourceName = "";


            sourceName = ctx.any_name().IDENTIFIER().getSymbol().getText();
            System.out.println (sourceName );

        return sourceName;
    }
    @Override public Column_def visitColumn_def(SQLParser.Column_defContext ctx) {
        Column_def column_def = new Column_def ();
        //System.out.println("visit_Column-def");
        if (ctx.column_name() != null) {
            column_def.setColumnname(ctx.column_name().any_name().IDENTIFIER().getSymbol().getText());
            column_def.getColumnname();
           // System.out.println( "name of column" +column_def.getColumnname());
        }
        if (ctx.column_constraint() != null)
        {
            //visit
            //arraylist of col
            ArrayList<Column_constraint> column_constraints=new ArrayList<>();
            for (int i =0 ; i< ctx.column_constraint().size();i++)
                column_constraints.add(visitColumn_constraint(ctx.column_constraint(i)));
            column_def.setColumn_constraints(column_constraints);
            //  System.out.println(column_def.getColumn_constraints());


        }
        if (ctx.type_name()!=null)
        {
            ArrayList<Typename>typenames=new ArrayList<>();
            for(int i=0;i<ctx.type_name().size();i++)
                typenames.add(visitType_name(ctx.type_name(i)));
            column_def.setTypenames(typenames);

        }
        return column_def;

    }
    @Override public Column_constraint visitColumn_constraint(SQLParser.Column_constraintContext ctx) {
        //System.out.println("visit_Column-Constraint");
        Column_constraint column_constraint=new Column_constraint ();
        if(ctx.K_CONSTRAINT()!=null)
            column_constraint.setConstrant(true);
        if (ctx.name() != null)
        {
            column_constraint.setName(ctx.name().any_name().IDENTIFIER().getSymbol().getText());
        }
        if (ctx.column_constraint_primary_key()!=null)
        {
            column_constraint.setColumn_constraint_pk(visitColumn_constraint_primary_key(ctx.column_constraint_primary_key()));


        }
        if(ctx.column_constraint_foreign_key()!=null)
        {
            column_constraint.setColumn_constraint_fk(visitColumn_constraint_foreign_key(ctx.column_constraint_foreign_key()));
        }
        if(ctx.column_constraint_null()!=null) {
            column_constraint.setColumn_constraint_null(true);
          //  System.out.println("column constraint NULL");
        }
        if(ctx.column_constraint_not_null()!=null)
        {
            column_constraint.setColumn_constraint_not_null(true);
            //System.out.println("column constraint NUT NULL");
        }
        if(ctx.column_default()!=null)
        {
            column_constraint.setColumn_default(visitColumn_default(ctx.column_default()));
        }
        if(ctx.K_CHECK()!=null)
        {
            column_constraint.setIscheck(true);
            column_constraint.setCheck(visitExpr(ctx.expr()));
        }
        if(ctx.collation_name()!=null)
            column_constraint.setCollation_name(ctx.collation_name().any_name().IDENTIFIER().getSymbol().getText());

        return column_constraint;
    }

    @Override public column_default visitColumn_default(SQLParser.Column_defaultContext ctx) {
        //System.out.println("visitColumn_default");
        column_default column_default=new column_default ();

        boolean exisit=true;
        if(ctx.column_default_value()!=null)
        {
            column_default.setColumn_default_value(visitColumn_default_value(ctx.column_default_value()));
            exisit=false;
        }
        if(ctx.expr()!=null)
            column_default.setExpr(visitExpr(ctx.expr()));
        if(ctx.K_NEXTVAL()!=null)
        {
            column_default.setK_NEXTVAL(true);
            exisit=false;
        }
        if(exisit)
        {
            column_default.setName(ctx.any_name(0).IDENTIFIER().getSymbol().getText());
            ArrayList<String> copy=new ArrayList<>();

            if(ctx.TOW_POINT() != null) {
                column_default.setTOWPOINT(true);
                for (int i = 1; i < ctx.any_name().size(); i++)
                    copy.add(ctx.any_name(i).any_name().IDENTIFIER().getSymbol().getText());//Qes
                column_default.setAnynames(copy);
            }
        }
        return column_default;
    }
    @Override public Column_default_value visitColumn_default_value(SQLParser.Column_default_valueContext ctx) {
       // System.out.println("visitColumn_default_value");
        Column_default_value column_default_value=new Column_default_value ();
        if(ctx.signed_number()!=null)
            column_default_value.setSigned_number(visitSigned_number(ctx.signed_number()));
        if(ctx.literal_value()!=null)
            column_default_value.setLiteral_value(visitLiteral_value(ctx.literal_value()));
        return column_default_value;

    }
    @Override public Signed_number visitSigned_number(SQLParser.Signed_numberContext ctx) {

        //System.out.println("visitSigned_number");
        Signed_number signed_number=new Signed_number ();
        if(ctx.NUMERIC_LITERAL()!=null) {
            signed_number.setNUMERIC_LITERAL(ctx.NUMERIC_LITERAL().getSymbol().getText());
            System.out.println(" signed_number is");
            System.out.println(signed_number.getNUMERIC_LITERAL());
        }
        return signed_number;
    }

    @Override public column_constraint_null visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx) {
        //System.out.println ( "visitColumn_constraint_null" );
      column_constraint_null column_constraint_null= new column_constraint_null ();
      column_constraint_null.setKnull ( ctx.K_NULL ().getSymbol ().getText () );

        return column_constraint_null;
    }
    @Override public column_constraint_not_null visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx) {
        //System.out.println ( "visitColumn_constraint_not_null" );
        column_constraint_not_null column_constraint_not_null = new column_constraint_not_null ();
        column_constraint_not_null.setK_not ( ctx.K_NOT ().getSymbol ().getText () );
        column_constraint_not_null.setK_null ( ctx.K_NULL ().getSymbol ().getText () );
            return  column_constraint_not_null;
    }
    @Override public Column_constraint_FK visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx) {
        //System.out.println("visitColumn_constraint_foreign_key");
        Column_constraint_FK column_constraint_fk=new Column_constraint_FK ();
        if(ctx.foreign_key_clause()!=null)
        {
            column_constraint_fk.setForeign_key_clause(visitForeign_key_clause(ctx.foreign_key_clause()));
        }
        return column_constraint_fk ;
    }
    @Override public Column_constraint_PK visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx) {
        //System.out.println("Visit_Column_constraint_PK");
        Column_constraint_PK column_constraint_pk=new Column_constraint_PK ();
        if(ctx.K_ASC()!=null) {
            column_constraint_pk.setASC(true);
            System.out.println(column_constraint_pk.isASC());
        }
        if(ctx.K_DESC() !=null) {
            column_constraint_pk.setDesc(true);
            System.out.println(column_constraint_pk.isDesc());
        }
        if(ctx.K_AUTOINCREMENT()!=null) {
            column_constraint_pk.setAUTOINCREMENT(true);
            System.out.println(column_constraint_pk.isAUTOINCREMENT());
        }
        return column_constraint_pk;

    }
    @Override public Statement visitDelete_stmt(SQLParser.Delete_stmtContext ctx) {
        //System.out.println ( "visitDelete_stmt" );
        DeleteStmt delet = new DeleteStmt ();
         delet.setQualified_table ( visitQualified_table_name ( ctx.qualified_table_name () ) );
          if(ctx.K_WHERE ()!= null)
          {
              delet.setK_WHERE(true);

           if(ctx.expr ()!=null)
           {
               delet.setExpr ( visitExpr ( ctx.expr () ) );
           }}
        delet.setName ( "delet");

    //    return visitChildren(ctx);
         return  delet;

    }
    @Override public qualified_table visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx) {
        //System.out.println("visitQualified_table_name");
        qualified_table qualified_table=new qualified_table ();

        if (ctx.database_name()!= null)
            qualified_table.setDatabasename(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.table_name() !=null)
            qualified_table.setTablename(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        if (ctx.index_name() != null)
            qualified_table.setIndexname(ctx.index_name().any_name().IDENTIFIER().getSymbol().getText());
        return qualified_table;

    }
    @Override public expr visitExpr(SQLParser.ExprContext ctx) {
        //System.out.println("visitExpr");
        expr e = new expr ();

   //     ex_op ex_op=new ex_op ();
        if (ctx.literal_value() != null) {

          //  System.out.println("literal value  ");
            if(ctx.literal_value().NUMERIC_LITERAL()!=null)
            e.setLiterlvalue(ctx.literal_value().NUMERIC_LITERAL().getSymbol().getText());
            if(ctx.literal_value().STRING_LITERAL()!=null)
            e.setLiterlvalue(ctx.literal_value().STRING_LITERAL().getSymbol().getText());
            if(ctx.literal_value().BLOB_LITERAL()!=null)
                e.setLiter2(ctx.literal_value().BLOB_LITERAL().getSymbol().getText());
            if(ctx.literal_value().K_NULL()!=null)
                e.setLiterlvalue(ctx.literal_value().K_NULL().getSymbol().getText());

        }
         if (ctx.identy() != null) {
//            identy.setIdenty(ctx.identy().IDENTIFIER().getSymbol().getText());
//            System.out.println(identy.getIdenty1());
           // System.out.println("IDENTIFER  ");
            e.setIdenty(ctx.identy().IDENTIFIER().getSymbol().getText());
        } else if (ctx.function_name1() != null) {
            e.setF(visitFunction_name1(ctx.function_name1()));
//            function_name1 f = new function_name1();
//
//            f.setName(ctx.function_name1().function_name().getText());
//            if (ctx.function_name1().expr() != null) {
//
//                List<expr>o=new ArrayList<expr>();
//                for (int i =0; i < ctx.expr().size() ; i++) {
//                    o.add(visitExpr(ctx.expr(i)));
//                }
//                f.setExprs(o);
//
//            }
//            else if(ctx.function_name1().STAR()!=null){
//                f.setStar(ctx.function_name1().STAR().getSymbol().getText());
//            }
        } else if (ctx.existsselect() != null) {
            e.setExistsselect(visitExistsselect(ctx.existsselect()));


        }

        else if(ctx.database_name1()!=null)
        {
            e.setD(visitDatabase_name1(ctx.database_name1()));
//            database_name1 d=new database_name1();
//            if(ctx.database_name1().database_name()!=null||ctx.database_name1().table_name()!=null)
//            {List<String>l=new ArrayList<>();
//                List<String>l1=new ArrayList<>();
//                for (int i =0; i < ctx.database_name1 ().table_name().size() ; i++) {
//                    l.add(ctx.database_name1().database_name().get(i).any_name().IDENTIFIER().getSymbol().getText());
//                    l1.add(ctx.database_name1().table_name().get(i).any_name().IDENTIFIER().getSymbol().getText());
//                }
//                d.setN1(l);
//                d.setN2(l1);
//            }
//            d.setN3(ctx.database_name1().column_name().getText());

        }
        else if(ctx.kword1()!=null)
        {
            e.setKword(visitKword1(ctx.kword1()));

        }
        else if(ctx.unary_operator1()!=null)
        {
            e.setUnary_operator(visitUnary_operator1(ctx.unary_operator1()));
        }
        else if(ctx.opexp()!=null)
        {
            e.setO(visitOpexp(ctx.opexp()));
        }
        else if(ctx.MINUS_MINUS()!=null){
            e.setMINUS_MINUS(ctx.MINUS_MINUS().getSymbol().getText());
        }
        else if(ctx.PLUS_PLUS()!=null){
            e.setPlus_plus(ctx.PLUS_PLUS().getSymbol().getText());

        }
        else if (ctx.exprselect()!= null)
        {
            exprselect exprselect= new exprselect ();
            exprselect.setExpr(visitExpr(ctx.expr(0)));
            e.setExprselect(visitExprselect(ctx.exprselect()));
        }
//        else if(ctx.ex_op()!=null)
//        {
//            ex_op.setExpr(visitExpr(ctx.expr(0)));
//            ex_op.setS(ctx.getChild(1).getText());
//
//        }
//        else if(ctx.expr().size()==0){
//           exp2 l=new exp2();
//           l.setE(visitExpr(ctx.expr(0)));
//            l.setE2(visitExpr(ctx.expr(1)));
//        }
        else if(ctx.expr ().size ()==1)
        {


            operations operations = new operations();

            operations.setOpreation(ctx.getChild(1).getText());

            //System.out.println(operations.getOpreation());

            operations.setExprleft(visitExpr(ctx.expr(0)));
            e.setOperator(ctx.getChild(1).getText());
            //System.out.println(e.getOperator());
            e.setExprleft(visitExpr(ctx.expr(0)));



        }
//
//        else if(ctx.expr().size ()==2) {
//
//            operations operations = new operations();
//            expright expright = new expright();
//
//                operations.setOpreation(ctx.getChild(1).getText());
//
//
//                System.out.println(operations.getOpreation());
//                operations.setExprleft(visitExpr(ctx.expr(0)));
//                expright.setExprright(visitExpr(ctx.expr(1)));
//
//            }
        if(ctx.expr().size()>=2) {
            listopertion listopertion = new listopertion ();
            operations operations = new operations();
            expright expright = new expright ();
            listopertion.setExprleft(visitExpr(ctx.expr(0)));
            e.setExprleft(visitExpr(ctx.expr(0)));
            if (ctx.op() != null) {
                List<op> s = new ArrayList<op>();

                for (int i = 0; i < ctx.op().size(); i++) {
                    s.add(visitOp(ctx.op(i)));

                }
                e.setOpj(s);
            }
            if (ctx.opre_all() != null) {
                operations.setOpreation(ctx.getChild(1).getText());
                e.setOperator(ctx.getChild(1).getText());
              //  System.out.println(operations.getOpreation());
                //System.out.println(e.getOperator());
            }

            expright.setExprright(visitExpr(ctx.expr(1)));
            e.setExpright(visitExpr(ctx.expr(1)));

        }


        return e;
        //  return visitChildren(ctx);
    }
    @Override public exprselect visitExprselect(SQLParser.ExprselectContext ctx) {
        exprselect exprselect= new exprselect ();


        if (ctx.K_NOT()!=null)
        {
            exprselect.setK_NOT(ctx.K_NOT().getSymbol().getText());   }
        exprselect.setK_IN(ctx.K_IN().getSymbol().getText());
        exprselect.setSelect_expr(visitSelect_expr(ctx.select_expr()));

        return  exprselect;
    }
    @Override public select_expr visitSelect_expr(SQLParser.Select_exprContext ctx) {
        //System.out.println("visitSelect_expr");
        select_expr select_expr = new select_expr ();
        if(ctx.select_stmt()!= null) {
            select_expr.setSelectStmt(visitSelect_stmt(ctx.select_stmt())); }
        if (ctx.expr()!=null)
        { List<expr> exprs= new ArrayList<>();
            for (int i =0; i < ctx.expr().size() ; i++) {
                exprs.add(visitExpr(ctx.expr(i))); }
            select_expr.setExprs(exprs);
        }
        else {
            if (ctx.database_name() != null) {
                select_expr.setDatabase_name(ctx.database_name().any_name().IDENTIFIER().getSymbol().getText());
                select_expr.setDot(ctx.DOT().getText());
          //      System.out.println(ctx.DOT().getText());
            }
            select_expr.setTable_name(ctx.table_name().any_name().IDENTIFIER().getSymbol().getText());
        }
        return  select_expr;
    }
    @Override public op visitOp(SQLParser.OpContext ctx) {

        op op = new op ();
        op.setOpreation(ctx.getText());
        System.out.println(op.getOpreation());
        return  op;

    }

    @Override public opexp visitOpexp(SQLParser.OpexpContext ctx) {
        //System.out.println("visitOpexp");
        opexp opexp=new opexp ();
        opexp.setOp(ctx.getChild(0).getText());
        System.out.println(opexp.getOp());
        opexp.setExpr(visitExpr(ctx.expr()));
        return  opexp;

        // return visitChildren(ctx);
    }
    @Override public unary_operator1 visitUnary_operator1(SQLParser.Unary_operator1Context ctx) {
        //System.out.println("visitUnary_operator1");
        unary_operator1 unary_operator=new unary_operator1 ();
        unary_operator.setOp(ctx.getChild(0).getText());

        unary_operator.setExpr(visitExpr(ctx.expr()));
        return  unary_operator;
        //   return visitChildren(ctx);
    }
    @Override public existsselect visitExistsselect(SQLParser.ExistsselectContext ctx) {
        existsselect existsselect=new existsselect ();
        if(ctx.K_NOT()!=null)
        {
            existsselect.setVar1(true);
            System.out.println("K_NOT");
        }
        if(ctx.K_EXISTS()!=null)
        {
            existsselect.setVar2(true);
            System.out.println("K_IN");
        }
        existsselect.setSelectStmt(visitSelect_stmt(ctx.select_stmt()));
        //   return visitChildren(ctx);
        return  existsselect;
    }
    @Override public String visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        //System.out.println("visitLiteral_value");
        String  name="";
        name=ctx.getChild (0 ).getText ();
        //System.out.println ( name );
        return name ;
        // return visitChildren(ctx);
    }

    @Override
    public function_name1 visitFunction_name1(SQLParser.Function_name1Context ctx) {
        //System.out.println("visitFunction_name");
        function_name1 function_name1= new function_name1 ();
        function_name1.setName ( ctx.function_name ().any_name ().IDENTIFIER ().getSymbol ().getText () );
        if (ctx.expr ()!= null)
        {
            List<expr> exprs= new ArrayList<> (  );
            for (int i = 0; i < ctx.expr ().size(); i++) {
                exprs.add(visitExpr (ctx.expr ( i )  ));
            }
            function_name1.setExprs ( exprs );

        }
        if (ctx.STAR ()!=null)
        {
            function_name1.setStar ( true);
        }
        if(ctx.K_DISTINCT()!=null)
            function_name1.setK_DISTINCT(true);
        return  function_name1;

    }

    @Override
    public kword visitKword1(SQLParser.Kword1Context ctx) {
        //System.out.println("visit K wards");
        kword kword=new kword ();
        if(ctx.K_TRUE ()!=null)
        {
            kword.setB(true);
        }
        if(ctx.K_FALSE ()!=null)
        {
            kword.setB2(true);
        }
        if(ctx.K_BREAK()!=null)
        {
            kword.setB3(true);
        }
        if(ctx.K_CONTINUE()!=null)
        {
            kword.setB4(true);
        }
        return kword;
    }
    //java
    //
    //
    //
    //
    //


    @Override
    public higher_stmt visitHigher_stmt(SQLParser.Higher_stmtContext ctx) {
        //System.out.println("visitHigher_stmt");
        higher_stmt higher_stmt = new higher_stmt ();
        higher_stmt.setFunction_name ( visitFunction_name ( ctx.function_name () ) );
        higher_stmt.setArry_name ( visitArry_name ( ctx.arry_name () ) );
        higher_stmt.setK_FUNCTION ( true );
        higher_stmt.setHigherStmt1s ( visitHigher_stmt1 ( ctx.higher_stmt1 () ) );

        return higher_stmt;
    }

    @Override
    public String  visitArry_name(SQLParser.Arry_nameContext ctx) {
        //System.out.println("visitArry_name");
        String result="";
        result= ctx.any_name ().IDENTIFIER ().getSymbol ().getText ();
        return result;

    }

    @Override
    public pair_T visitPair_T(SQLParser.Pair_TContext ctx) {
        pair_T pair_t= new pair_T ();
        pair_t.setPair ( visitPair ( ctx.pair () ) );
        return  pair_t;
    }
    @Override public array visitArray(SQLParser.ArrayContext ctx) {
        //System.out.println("visitArray");
        array array = new array ();
        List<value> values= new ArrayList<> (  );
        for (int i = 0; i < ctx.value ().size (); i++) {
            values.add ( visitValue ( ctx.value ( i )  ));
        }
        array.setValues ( values );

        return  array;
        //    return visitChildren(ctx);
    }
    @Override public value visitValue(SQLParser.ValueContext ctx) {
        //System.out.println("visitValue");
        value value = new value ();
        if (ctx.expr ()!=null)
        {
            value.setExp1(true);
            value.setExpr ( visitExpr ( ctx.expr () ) );
        }
        if (ctx.array ()!= null)
        {
            value.setArray1(true);
            value.setArray ( visitArray ( ctx.array () ) );
        }
        if (ctx.object1 ()!= null)
        {
            value.setObject2(true);
            value.setObject ( visitObject1 ( ctx.object1() ) );
        }
        return  value;
    }
    @Override public object1 visitObject1(SQLParser.Object1Context ctx) {
        //System.out.println("visitObject");
        object1 object= new object1 ();
        List<pair> pairs= new ArrayList<> (  );
        for (int i = 0; i < ctx.pair ().size (); i++) {
            pairs.add ( visitPair ( ctx.pair ( i )  ));
        }
        object.setPairs ( pairs );
        return  object;

    }
    @Override public pair visitPair(SQLParser.PairContext ctx) {
        pair pair= new pair ();
        pair.setProperty ( ctx.property ().IDENTIFIER ().getSymbol ().getText () );
        pair.setValue ( visitValue ( ctx.value () ) );
        return  pair;
        //    return visitChildren(ctx);
    }
    @Override public higher_stmt1 visitHigher_stmt1(SQLParser.Higher_stmt1Context ctx) {
        //System.out.println("visitHigher_stmt1");
        higher_stmt1 higher_stmt1= new higher_stmt1 ();
        expr expr= new expr ();
        if (ctx.K_VAR ()!=null)
        {

            higher_stmt1.setK_var ( true );
        }
        if (ctx.expr ()!=null)
        {
            higher_stmt1.setExpr ( visitExpr ( ctx.expr ( 0 ) ) );
            higher_stmt1.setExpr ( expr );
        }
        List<Java.AST.expr> exprs= new ArrayList<> (  );
        if(ctx.expr ()!=null)
        {

            for (int i = 1; i < ctx.expr ().size (); i++) {
                if (ctx.K_VAR ()!=null){higher_stmt1.setK_var ( true );}
                exprs.add ( visitExpr ( ctx.expr ( i )  ));
            }
        }
        higher_stmt1.setExprs ( exprs );

        return higher_stmt1;
    }
    @Override public json_stmt visitJson_stmt(SQLParser.Json_stmtContext ctx) {
        //System.out.println("visitJson_stmt");
        json_stmt json_stmt  = new json_stmt ();
        if (ctx.array ()!=null) {
            json_stmt.setArray1(true);
            json_stmt.setArray ( visitArray ( ctx.array () ) );

        }
        if (ctx.object1 ()!= null) {
            json_stmt.setObject2(true);
            json_stmt.setObject ( visitObject1 ( ctx.object1 () ) );

        }
        if (ctx.pair_T ()!= null) {
            json_stmt.setPair_T1(true);
            json_stmt.setPair_t ( visitPair_T ( ctx.pair_T () ) );

        }
        return  json_stmt;
        //    return visitChildren(ctx);
    }
    @Override public argument_stmt visitArgument_stmt(SQLParser.Argument_stmtContext ctx) {
        //System.out.println("visitArgument_stmt");
        argument_stmt argument_stmt= new argument_stmt ();
        argument_stmt.setFunction_name ( visitFunction_name ( ctx.function_name () ) );
        List<expr> exprs = new ArrayList<> (  );
        for (int i = 0; i < ctx.expr ().size (); i++) {
            exprs.add ( visitExpr ( ctx.expr ( i )  ));
        }
        argument_stmt.setExprs ( exprs );
        return argument_stmt;

    }
    @Override public FunctionDeclaration visitFunctiondeclaration(SQLParser.FunctiondeclarationContext ctx) {
        //System.out.println("visitfunctiondeclaration");
        parameter parameters=new parameter (  );
        fun_body fun_body= new fun_body ();
        FunctionDeclaration functionDeclaration =new FunctionDeclaration ();
        if(ctx.parameter ()!= null) {
            parameters = visitParameter (ctx.parameter ());
            functionDeclaration.setParameter ( parameters );

        }
        if(ctx.fun_body ()!= null)
        {
            fun_body = visitFun_body ( ctx.fun_body () );
            functionDeclaration.setFun_body(fun_body);
        }

        //return visitChildren(ctx);
        return  functionDeclaration;
    }
    @Override public fun_body visitFun_body(SQLParser.Fun_bodyContext ctx) {
        //System.out.println("visitFun_body");
        fun_body fun_body = new fun_body ();
//        List<state_stmt> s = new ArrayList<state_stmt>();
        if (ctx.state_stmt()!=null)
        {
            List<state_stmt>fun_b=new ArrayList<>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                //s.add(visitState_stmt(ctx.state_stmt(i)));
              fun_b.add(visitState_stmt(ctx.state_stmt(i)));
              fun_body.setState_stmt(fun_b);

            }
        }
        // fun_body.setState_stmt(s);
        return  fun_body;
        //    return visitChildren(ctx);
    }
    @Override public return_cont2 visitReturn_cont2(SQLParser.Return_cont2Context ctx) {
        return_cont2 return_cont2= new return_cont2 ();
        if (ctx.expr()!=null)
        {
            return_cont2.setExpr(visitExpr(ctx.expr()));}
        if (ctx.select_core()!=null)
        {
            return_cont2.setSelect_core(visitSelect_core(ctx.select_core()));
        }
        return  return_cont2;
    }


    @Override public return_contunet visitReturn_contunet(SQLParser.Return_contunetContext ctx) {
        //System.out.println("visitReturn_contunet");
        return_contunet return_contunets=new return_contunet ();
        if(ctx.expr()!=null){
            return_contunets.setB1(true);
            return_contunets.setExpr(visitExpr(ctx.expr()));
        }
        if(ctx.any_name()!=null)
        { return_contunets.setB2(true);
            return_contunets.setAny_name(ctx.any_name().IDENTIFIER().getSymbol().getText());
            System.out.println(return_contunets.getAny_name());
        }
        if(ctx.rele_onecond()!=null)
        {return_contunets.setB3(true);
            return_contunets.setRele_onecond(visitRele_onecond(ctx.rele_onecond()));
        }
        return return_contunets;
    }
    @Override public state_stmt visitState_stmt(SQLParser.State_stmtContext ctx) {
        //System.out.println("visitState_stmt");
        state_stmt state_stmt = new state_stmt ();

        if(ctx.rele_for ()!=null){
            state_stmt.setFor_1(true);
            state_stmt.setRole_for ( visitRele_for ( ctx.rele_for () ) );}
        if(ctx.rele_if()!=null)
        {   state_stmt.setIf_1(true);
            state_stmt.setRoleif(visitRele_if(ctx.rele_if()));
        }
        if(ctx.rele_while()!=null)
        {   state_stmt.setWhile_1(true);
            state_stmt.setRolewhile(visitRele_while(ctx.rele_while()));
        }
        if(ctx.rele_switch()!=null)
        {
            state_stmt.setSwitch_1(true);
            state_stmt.setRole_switch(visitRele_switch(ctx.rele_switch()));
        }
        if(ctx.rele_dowhile()!=null)
        {
            state_stmt.setDo_while_1(true);
            state_stmt.setRole_dowhile(visitRele_dowhile(ctx.rele_dowhile()));

        }
        if(ctx.rele_forach()!=null)
        {
            state_stmt.setForach_1(true);
            state_stmt.setRole_forach(visitRele_forach(ctx.rele_forach()));
        }
        if(ctx.rele_onecond()!=null){
            state_stmt.setRele_onco_1(true);

            state_stmt.setRele_onecond(visitRele_onecond(ctx.rele_onecond()));

        }
        if(ctx.K_PRINT()!=null){
            state_stmt.setPrint_1(true);
            state_stmt.setS(ctx.K_PRINT().getSymbol().getText());
            ArrayList<print_content> print_contents=new ArrayList<print_content>();
            for(int i=0;i<ctx.print_content().size();i++)     {
                print_contents.add(visitPrint_content(ctx.print_content(i)));
            }
            state_stmt.setPrint_content(print_contents);
        }
        if(ctx.role_re_con()!=null)
        {
            state_stmt.setRo_re_con(true);
            state_stmt.setRole_re_con(visitRole_re_con(ctx.role_re_con()));
        }
        if (ctx.json_call()!=null)
        {
            state_stmt.setJsoncal_1(true);
            state_stmt.setJson_call(visitJson_call(ctx.json_call()));
        }
        if (ctx.array_stmt()!=null)
        {
            state_stmt.setArray_stmt_1(true);
            state_stmt.setArray_stmt(visitArray_stmt(ctx.array_stmt()));
        }
        if(ctx.expr()!=null){
            state_stmt.setExp_1(true);
            state_stmt.setExpr(visitExpr(ctx.expr()));

        }
        if(ctx.var_stmt()!=null)
        {
            state_stmt.setVar_1(true);
            state_stmt.setVar_stmt(visitVar_stmt(ctx.var_stmt()));
        }

        return  state_stmt;


    }
    @Override public array_stmt visitArray_stmt(SQLParser.Array_stmtContext ctx) {
        //System.out.println("visitArray_stmt");
        array_stmt array_stmt = new array_stmt ();
        array_stmt.setK_VAR (true);

        if(ctx.name_x()!=null)
        array_stmt.setName_x ( ctx.name_x ().any_name ().IDENTIFIER ().getSymbol ().getText () );
        if(array_stmt.getString()!=null){
            if(array_stmt.getString2()!=null)
            {

        array_stmt.setASSIGN ( true );

        if (ctx.select_core ()!=null)
        {
            array_stmt.setSelect_core1(true);
            array_stmt.setSelect_core ( visitSelect_core ( ctx.select_core () ) );
        }
                if (ctx.expr ()!= null)
                {
                    array_stmt.setExprlist(true);
                    List<expr> exprs= new ArrayList<> (  );
                    for (int i = 0; i < ctx.expr ().size(); i++) {
                        exprs.add(visitExpr (ctx.expr ( i )  ));
                    }
                    array_stmt.setExprs ( exprs );

                }
                if (ctx.expr (  )!=null)
                {
                    array_stmt.setExpr1(true);
                    array_stmt.setExpr ( visitExpr ( ctx.expr ( 0 ) ) );
                }
        if (ctx.function_name1 ()!=null)
        {
            array_stmt.setFunction_name2(true);
            array_stmt.setFunction_name1 ( visitFunction_name1 ( ctx.function_name1 () ) );
        }}}
        return  array_stmt;
    }


    @Override public role_re_con visitRole_re_con(SQLParser.Role_re_conContext ctx) {
        //System.out.println("visitRole_re_con");
        role_re_con role_re_con=new role_re_con ();
        role_re_con.setReturn1(ctx.K_RETURN().getSymbol().getText());
        if(ctx.rele_ifcond()!=null){
            role_re_con.setRele_ifcond(visitRele_ifcond(ctx.rele_ifcond()));
        }
        if (ctx.return_contunet()!=null) {
            List<return_contunet> return_contunets = new ArrayList<return_contunet>();
            for (int i = 0; i < ctx.return_contunet().size(); i++) {
                return_contunets.add(visitReturn_contunet(ctx.return_contunet(i)));
                // fun_body.setReturn_contunets(return_contunets);
            }
            role_re_con.setReturn_contunets(return_contunets);
        }
        if (ctx.return_cont2()!=null)
        {
            role_re_con.setReturn_cont2(visitReturn_cont2(ctx.return_cont2()));

        }
        return role_re_con;

        // return visitChildren(ctx);
    }
    @Override public print_content visitPrint_content(SQLParser.Print_contentContext ctx) {
        //System.out.println("visitPrint_content");
        print_content print_content=new print_content ();

        List<expr>e=new ArrayList<>();
        for (int i = 0; i < ctx.expr().size(); i++) {
            e.add(visitExpr(ctx.expr(i)));
        }
        print_content.setExprs(e);
        if(ctx.json_call()!=null)
        {print_content.setJson(true);
            print_content.setJson_call(visitJson_call(ctx.json_call()));
            List<String>sjson=new ArrayList<String>();
            List<String>sjson1=new ArrayList<String>();
            for (int i = 0; i < ctx.expr().size(); i++) {
                sjson.add(ctx.PLUS().get(i).getSymbol().getText());
                sjson1.add(ctx.IDENTIFIER().get(i).getSymbol().getText());
            }
            print_content.setOpjs(sjson);
            print_content.setS(sjson1);
        }


        return  print_content;
        // return visitChildren(ctx);
    }
    //    @Override public ex_list visitEx_list(SQLParser.Ex_listContext ctx) {
//        System.out.println("visitEx_list");
//        ex_list ex_list=new ex_list();
//        ex_list.setOp(ctx.PLUS().getSymbol().getText());
//        ex_list.setE(visitExpr(ctx.expr()));
//        return ex_list;
//       // return visitChildren(ctx);
//    }
    @Override public json_call visitJson_call(SQLParser.Json_callContext ctx) {
        //System.out.println("visitJson_call");
        json_call json_call=new json_call ();
        json_call.setProperty1(visitProperty(ctx.property(0)));
        json_call.setPoint(ctx.getChild(1).getText());
        System.out.println(json_call.getPoint());
        json_call.setProperty2(visitProperty(ctx.property(1)));

        if(ctx.json_call3()!=null )
        {
            json_call.setJa(true);
            List<json_call3> json_call3s= new ArrayList<>();

            for(int j=0 ;j<ctx.json_call3().size();j++){
                json_call3s.add(visitJson_call3(ctx.json_call3(j)));

            }
            json_call.setJson_call3s(json_call3s);
        }
        if (ctx.ASSIGN()!=null)
        {
            json_call.setASSIGN(ctx.ASSIGN().getSymbol().getText());
          //  System.out.println(json_call.getASSIGN());
            if(ctx.IDENTIFIER()!=null)
            {
                json_call.setName(ctx.IDENTIFIER().getSymbol().getText());
                System.out.println(ctx.IDENTIFIER().getSymbol().getText());}
            else if (ctx.NUMERIC_LITERAL()!=null)
            {
                json_call.setName(ctx.NUMERIC_LITERAL().getSymbol().getText());
            //    System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
            }
        }


        return json_call;
//        return visitChildren(ctx);
    }
    @Override public json_call3 visitJson_call3(SQLParser.Json_call3Context ctx) {
        //System.out.println("visitJson_call3");
        json_call3 json_call3= new json_call3 ();
        json_call3.setPoint(ctx.getChild(0).getText());
        System.out.println(json_call3.getPoint());
        json_call3.setProperty1(ctx.getChild(1).getText());
        System.out.println(json_call3.getProperty1());
        return  json_call3;
    }
    @Override public String visitProperty(SQLParser.PropertyContext ctx) {
        //System.out.println("visitProperty");
        String result;
        result= ctx.IDENTIFIER().getSymbol().getText();
        property property= new property();
        property.setProperty1(result);

        System.out.println(property.getProperty1());

        return  result;
    }
    @Override public rele_onecond visitRele_onecond(SQLParser.Rele_onecondContext ctx) {
        //System.out.println("visitRele_onecond");
        rele_onecond rele_onecond=new rele_onecond ();
        List<expr_or_rele_ifcond>expr_or_rele_ifconds=new ArrayList<expr_or_rele_ifcond>() ;
        if(ctx.K_VAR()!=null)
        {
            rele_onecond.setVar(true);
        }
        rele_onecond.setExpr(visitExpr(ctx.expr(0)));
        rele_onecond.setOp1(ctx.ASSIGN().getSymbol().getText());

        rele_onecond.setExpr1(visitExpr(ctx.expr(1)));
        rele_onecond.setOp2(ctx.QUESTION().getSymbol().getText());
        rele_onecond.setExpr_or_rele_ifcond(visitExpr_or_rele_ifcond(ctx.expr_or_rele_ifcond(0)));
        rele_onecond.setOp3(ctx.COLON().getSymbol().getText());
        for(int i=1;i<ctx.expr_or_rele_ifcond().size();i++){
            expr_or_rele_ifconds.add(visitExpr_or_rele_ifcond(ctx.expr_or_rele_ifcond(i)));
        }
        rele_onecond.setExpr_or_rele_ifconds(expr_or_rele_ifconds);
        return rele_onecond;
        // return visitChildren(ctx);
    }
    @Override public expr_or_rele_ifcond visitExpr_or_rele_ifcond(SQLParser.Expr_or_rele_ifcondContext ctx) {
        //System.out.println("visitExpr_or_rele_ifcond");
        expr_or_rele_ifcond expr_or_rele_ifcond=new expr_or_rele_ifcond();
        if(ctx.expr()!=null){
            expr_or_rele_ifcond.setE(visitExpr(ctx.expr()));
        }
        else if(ctx.rele_ifcond()!=null){
            expr_or_rele_ifcond.setRele_ifcond(visitRele_ifcond(ctx.rele_ifcond()));
        }
        return expr_or_rele_ifcond;
        // return visitChildren(ctx);
    }
    @Override public rele_ifcond visitRele_ifcond(SQLParser.Rele_ifcondContext ctx) {
        //System.out.println("visitRele_ifcond");
        rele_ifcond rele_ifcond=new rele_ifcond ();
        rele_ifcond.setE1(visitExpr(ctx.expr(0)));
        rele_ifcond.setOp1(ctx.QUESTION().getSymbol().getText());
        rele_ifcond.setE2(visitExpr(ctx.expr(1)));
        rele_ifcond.setOp2(ctx.COLON().getSymbol().getText());
        rele_ifcond.setE3(visitExpr(ctx.expr(2)));
        return rele_ifcond;
        // return visitChildren(ctx);
    }
    @Override public role_forach visitRele_forach(SQLParser.Rele_forachContext ctx) {

        //System.out.println("visitRele_forach");
        role_forach role_forach=new role_forach ();
        role_forach.setE1(visitExpr(ctx.expr(0)));
        role_forach.setOp(ctx.getChild(3).getText());
        role_forach.setE2(visitExpr(ctx.expr(1)));
        if(ctx.state_stmt()!=null)
        {
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
            role_forach.setS(s);
        }
        return role_forach;
        //return visitChildren(ctx);
    }
    @Override public role_dowhile visitRele_dowhile(SQLParser.Rele_dowhileContext ctx) {
        //System.out.println("visitRele_dowhile");
        role_dowhile role_dowhile=new role_dowhile ();
        if(ctx.K_DO()!=null)
        {
            role_dowhile.setDo1(ctx.K_DO().getSymbol().getText());
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
            role_dowhile.setState_stmts(s);
            role_dowhile.setWhile1(ctx.K_WHILE().getSymbol().getText());
            System.out.println(role_dowhile.getWhile1());
            role_dowhile.setE(visitExpr(ctx.expr()));
        }
        return  role_dowhile;
        //return visitChildren(ctx);
    }
    @Override public role_switch visitRele_switch(SQLParser.Rele_switchContext ctx) {
        //System.out.println("visitRele_switch");
        role_switch role_switch1=new role_switch ();
        role_switch1.setExpe ( visitExpr(ctx.expr()) );
        List <rele_case1> rele_case1=new ArrayList<Java.AST.rele_case1>() ;
        for (int i = 0; i < ctx.rele_case1().size(); i++) {
            rele_case1.add(visitRele_case1(ctx.rele_case1(i)));
        }
        role_switch1.setRele_case1(rele_case1);
        if(ctx.K_DEFAULT()!=null)
        {
            role_switch1.setDef(ctx.K_DEFAULT().getSymbol().getText());
            role_switch1.setDot(ctx.getChild(1).getText());
            role_switch1.setRole_case(visitRele_case(ctx.rele_case()));
        }
        if(ctx.state_stmt()!=null)
        {
            role_switch1.setB(true);
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
            role_switch1.setS(s);
        }



        return role_switch1;
        // return visitChildren(ctx);
    }
    @Override public rele_case1 visitRele_case1(SQLParser.Rele_case1Context ctx) {
        //System.out.println(" visitRele_case1");
        rele_case1 rele_case1=new rele_case1 ();
//        role_case role_case=new role_case();
        rele_case1.setE(visitExpr(ctx.expr()));
        rele_case1.setDot(ctx.getChild(2).getText());
        rele_case1.setRole_case(visitRele_case(ctx.rele_case()));
//        role_switch1.setDot( ctx.getChild ( 1 ).getText ());
        // return visitChildren(ctx);
        return  rele_case1;
    }
    @Override public role_case visitRele_case(SQLParser.Rele_caseContext ctx) {
        //System.out.println(" visitRele_case");
        role_case role_case=new role_case ();
        List <state_stmt>s=new ArrayList<state_stmt>();
        for(int i=0;i<ctx.state_stmt().size();i++){
            s.add(visitState_stmt(ctx.state_stmt(i)));
        }
        role_case.setState_stmt(s);
        return role_case;

        //return visitChildren(ctx);
    }
    @Override public rolewhile visitRele_while(SQLParser.Rele_whileContext ctx) {
        //System.out.println("visitRele_while");
        rolewhile rolewhile=new rolewhile ();
        rolewhile.setExpe ( visitExpr(ctx.expr()) );
        if(ctx.state_stmt()!=null){
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
            rolewhile.setS(s);
        }
        // return visitChildren(ctx);
        return rolewhile;
    }

    @Override public Roleif visitRele_if(SQLParser.Rele_ifContext ctx) {
        //System.out.println("visitRele_if");
        Roleif roleif=new Roleif ();
        if(ctx.expr()!=null)
        roleif.setExpr ( visitExpr(ctx.expr()) );
        if(ctx.state_stmt()!=null){
            ArrayList <state_stmt>s= new ArrayList<>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                System.out.println(ctx.state_stmt().size());
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
            roleif.setState_stmt(s);
        }
        if(ctx.else_stmt()!=null)
        {


            ArrayList <else_stmt>s= new ArrayList<>();
            for(int j=0;j<ctx.else_stmt().size();j++){

                s.add(visitElse_stmt(ctx.else_stmt(j)));

            }
            roleif.setElse_state_stmt(s);
        }



        return roleif;

        // return visitChildren(ctx);
    }

    @Override
    public else_stmt visitElse_stmt(SQLParser.Else_stmtContext ctx) {
        else_stmt else_stmt=new else_stmt();
        if(ctx.K_ELSE()!=null)
        {
            else_stmt.setK_else(true);
            ArrayList <state_stmt>s= new ArrayList<>();
            for(int j=0;j<ctx.state_stmt().size();j++){

                s.add(visitState_stmt(ctx.state_stmt(j)));

            }
            else_stmt.setArrayList(s);
        }
        return else_stmt;
    }

    @Override public role_for visitRele_for(SQLParser.Rele_forContext ctx) {
        //System.out.println("visitRele_for");

        role_for role_for = new role_for ();
        role_for.setOprint1 ( visitOprint1 ( ctx.oprint1 () ) );
        role_for.setOprint2 ( visitOprint2 ( ctx.oprint2 () ) );
        role_for.setOprint3 ( visitOprint3 ( ctx.oprint3 () ) );

        if(ctx.state_stmt()!=null){
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
            role_for.setState_stmt(s);
        }

        return role_for;

        //return visitChildren(ctx);
    }
    @Override public oprint3 visitOprint3(SQLParser.Oprint3Context ctx) {
        //System.out.println("visitOprint3");
        oprint3 oprint3=new oprint3 ();

        oprint3.setExpr(visitExpr(ctx.expr()));
        return  oprint3;
        //  return visitChildren(ctx);
    }
    @Override public oprint2 visitOprint2(SQLParser.Oprint2Context ctx) {
        //System.out.println("visitOprint2");
        oprint2 oprint2=new oprint2();
        oprint2.setExpr ( visitExpr ( ctx.expr () ) );

        return oprint2;
        //return visitChildren(ctx);
    }
    @Override public oprint1 visitOprint1(SQLParser.Oprint1Context ctx) {
        //System.out.println("visitOprint1");
        oprint1 oprint1= new oprint1 ();
        operations operations=new operations();

        // System.out.println(ctx.ASSIGN ().getSymbol ().getText ());
        oprint1.setName_x (visitNamef (ctx.namef ( 0)) );
        oprint1.setOp(ctx.ASSIGN().getSymbol().getText());
//         System.out.println(oprint1.getOp());

        if(ctx.NUMERIC_LITERAL()!=null)
        {
            oprint1.setName_x1(ctx.NUMERIC_LITERAL().getSymbol().getText());
            System.out.println(oprint1.getName_x1());
        }
        else if(ctx.namef()!=null){
            oprint1.setName_x1(visitNamef(ctx.namef(1)));}
        return  oprint1;
        //  return visitChildren(ctx);
    }
    @Override public String visitNamef(SQLParser.NamefContext ctx) {
        //System.out.println("visitNamef");
        String var="";

        var=  (ctx.any_name ().IDENTIFIER ().getSymbol ().getText ());
        System.out.println(ctx.any_name ().IDENTIFIER ().getSymbol ().getText ());
        return var;
//        return visitChildren(ctx);
    }
    @Override public parameter visitParameter(SQLParser.ParameterContext ctx) {
        //System.out.println("visitParameter");
        parameter parameter =new parameter ();

        parameter.setFun_name ( visitFunction_name ( ctx.function_name () ) );

        if(ctx.varable()!=null){
            parameter.setVarable(visitVarable(ctx.varable()));

        }
//        List<variable> variables = new ArrayList<variable>  ();
//
//        if(ctx.name_x ()!=null) {
//            for (int i =0; i < ctx.name_x ().size() ; i++) {
//                List<String>s=new ArrayList<>();
//
//
//                variables.add ( visitName_x ( ctx.name_x (i) ));
//                if(ctx.expr()!=null)
//                {  List<expr> ex = new ArrayList<>();
//                    s.add(ctx.ASSIGN().get(i).getSymbol().getText());
//                    System.out.println(ctx.ASSIGN().get(i).getSymbol().getText());
//                    ex.add(visitExpr(ctx.expr(i)));
//
//
//                parameter.setExpr(ex);}
//                parameter.setS(s);
//               // parameter.setvarible ( ctx.getText () );
//            }
//
//             parameter.getVariable (variables);
//        }


//       System.out.println (  parameter.getvarible ());

        return parameter;
        //  return visitChildren(ctx);
    }
    @Override public varable visitVarable(SQLParser.VarableContext ctx) {
        //System.out.println("visitVarable");
        varable varable=new varable ();
        if(ctx.K_VAR()!=null){
            varable.setVar(ctx.K_VAR().getSymbol().getText());
        }
        varable.setName_x(ctx.name_x().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.ASSIGN()!=null)
        {
            varable.setASSIGN(ctx.ASSIGN().getSymbol().getText());
            varable.setExpr(visitExpr(ctx.expr()));
        }
        List<list_var> list_vars= new ArrayList<>();
        for (int i =0; i < ctx.list_var().size() ; i++) {
            list_vars.add(visitList_var(ctx.list_var(i)));
        }
        varable.setList_var(list_vars);
        return varable;
        // return visitChildren(ctx);
    }
    @Override public list_var visitList_var(SQLParser.List_varContext ctx) {
        //System.out.println(" visitList_var");
        list_var list_var=new list_var ();
        if(ctx.K_VAR()!=null){
            list_var.setVar(ctx.K_VAR().getSymbol().getText());
        }
        list_var.setName_x(ctx.name_x().any_name().IDENTIFIER().getSymbol().getText());
        if(ctx.ASSIGN()!=null)
        {
            list_var.setASSIGN(ctx.ASSIGN().getSymbol().getText());
            list_var.setExpr(visitExpr(ctx.expr()));
        }
        //return visitChildren(ctx);
        return  list_var;
    }
    @Override public variable visitName_x(SQLParser.Name_xContext ctx) {
        //System.out.println("visitName_x");
        variable variable= new variable ();
        String var="";
        if(ctx.any_name()!= null){
            var=  (ctx.any_name ().IDENTIFIER ().getSymbol ().getText ());
        }
        variable.setvarible ( var );
        System.out.println (  variable.getvarible ());
        return   variable ;
        //    return visitChildren(ctx);
    }

    @Override public String visitFunction_name(SQLParser.Function_nameContext ctx) {

        //System.out.println("visitFunction_name");
        String function_name = " ";
        if(ctx.any_name()!= null){
            function_name = ctx.any_name().IDENTIFIER().getSymbol().getText();
        }
        System.out.println ( function_name );
        return function_name ;
    }
}



