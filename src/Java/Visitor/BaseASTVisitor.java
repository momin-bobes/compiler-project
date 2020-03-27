package Java.Visitor;

import Java.AST.*;
import Java.AST.QueryStmt.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class BaseASTVisitor implements ASTVisitor {


    @Override
    public void visit(Parse p) {
        System.out.println("AST Parse");

    }

    @Override
    public void visit(FunctionDeclaration funcDec) {
        System.out.println("ast FunctionDeclaration ");
        if(funcDec.getParameter()!=null)
        visit(funcDec.getParameter());
//       visit(funcDec.getFun_body());
    }

    @Override
    public void visit(Statement stmt) {
        System.out.println("AST Statement");

    }

    @Override
    public void visit(SelectStmt selectStmt) {
        System.out.println("AST Factored_select_Stmt");
        //  System.out.println(factored_select_stmt.getSelect_core().getTable_or_subqueries().get(0).getTable_name());
        if(selectStmt.getSelect_or_values()!=null)
            visit(selectStmt.getSelect_or_values());
        if(selectStmt.getOrdering_terms()!=null)
            for(int i=0;i<selectStmt.getOrdering_terms().size();i++)
                visit(selectStmt.getOrdering_terms().get(i));
        if(selectStmt.isK_LIMIT()) {
            System.out.println("     Limit is    " + selectStmt.isK_LIMIT());

            visit(selectStmt.getLimit ());
        }
        if(selectStmt.isK_OFFSET()){
            System.out.println("      Offset is    " + selectStmt.isK_OFFSET());
            visit(selectStmt.getOffer());

    }}

    @Override
    public void visit(Factored_select_Stmt factored_select_stmt) {
        System.out.println("AST Factored_select_Stmt");
        //  System.out.println(factored_select_stmt.getSelect_core().getTable_or_subqueries().get(0).getTable_name());
        if(factored_select_stmt.getSelect_core()!=null)
            visit(factored_select_stmt.getSelect_core());
        if(factored_select_stmt.getOrdering_terms()!=null)
            for(int i=0;i<factored_select_stmt.getOrdering_terms().size();i++)
                visit(factored_select_stmt.getOrdering_terms().get(i));
        if(factored_select_stmt.isK_LIMIT())
            visit(factored_select_stmt.getLIMIT());
        if(factored_select_stmt.isK_OFFSET())
            visit(factored_select_stmt.getOFFSET());


    }

    @Override
    public void visit(UpdateStmt updateStmt) {
        System.out.println("AST UpdateStmt");
        if(updateStmt.getQualified_table()!=null)
            visit(updateStmt.getQualified_table());
        if(updateStmt.getColumnnames()!=null)
        {
            System.out.println("       Column names      ");
            for(int i=0;i<updateStmt.getColumnnames().size();i++)
                System.out.println("                     "+updateStmt.getColumnnames().get(i));

        }
        if(updateStmt.getExprs()!=null)
        {
            System.out.println("        Expr for column names");
            for(int i=0;i<updateStmt.getExprs().size();i++)
           visit(updateStmt.getExprs().get(i));
        }

    }

    @Override
    public void visit(alter_table_stmt alter_stmt) {
        System.out.println("AST alter_Table_Stmt");
        if(alter_stmt.getDatabease_name()!=null)
            System.out.println("      Data Base Name   "+alter_stmt.getDatabease_name());
        if(alter_stmt.getSource_name()!=null)
            System.out.println("       Source Name     "+alter_stmt.getSource_name());
        if(alter_stmt.getNew_table_name()!=null)
            System.out.println("       New  Table Name  "+alter_stmt.getNew_table_name());
        if(alter_stmt.getAlter_table_add()!=null)
            visit(alter_stmt.getAlter_table_add());
        if(alter_stmt.getAlter_table_add_costraint()!=null)
            visit(alter_stmt.getAlter_table_add_costraint());
        if(alter_stmt.isColumn())
        {
            System.out.println("       K_Column    "+alter_stmt.isColumn());
        }
        if(alter_stmt.getColumDef()!=null)
            visit(alter_stmt.getColumDef());

    }

    @Override
    public void visit(DeleteStmt deleteStmt) {
        System.out.println("AST DeleteStmt");
        if(deleteStmt.getQualified_table()!=null)
            visit(deleteStmt.getQualified_table());
        if(deleteStmt.getK_WHERE())
        {
            System.out.println("      K_where   "+deleteStmt.getK_WHERE());
            visit(deleteStmt.getExpr());
        }

    }

    @Override
    public void visit(Create_Stmt create_stmt) {
        System.out.println("AST CreateStmt");
        if (create_stmt.getDatabasename()!=null)
            System.out.println("      Databasename      " +create_stmt.getDatabasename());
        if(create_stmt.getTablename()!=null)
            System.out.println("      Tablename         " +create_stmt.getTablename());
        if(create_stmt.getColumn_defs()!=null)
            for(int i=0;i<create_stmt.getColumn_defs().size();i++)
                visit(create_stmt.getColumn_defs().get(i));
        if(create_stmt.getTable_constraints()!=null)
            for(int i =0;i<create_stmt.getTable_constraints().size();i++)
                visit(create_stmt.getTable_constraints().get(i));
        if(create_stmt.isAS())
            visit(create_stmt.getSelectStmt());



    }

    @Override
    public void visit(Drop_stmt drop_stmt) {
        System.out.println("AST DropStmt");
        if(drop_stmt.isK_IF())
            System.out.println("      found (IF)  "+drop_stmt.isK_IF ());
        if(drop_stmt.isK_EXISTS())
            System.out.println("      found (EXISTS)  "+drop_stmt.isK_EXISTS());
        if(drop_stmt.getDatabasename()!=null)
            System.out.println("       Data base name  "+drop_stmt.getDatabasename());
        if(drop_stmt.getTablname()!=null)
            System.out.println("        Table Name     "+drop_stmt.getTablname());


    }

    @Override
    public void visit(Insert_Stmt insert_stmt) {
        System.out.println("AST Inset stmt");
        if(insert_stmt.getDatabasename()!=null)
            System.out.println("        Data Base Name   "+insert_stmt.getDatabasename());
        if(insert_stmt.getTablename()!=null)
            System.out.println("        Table name        "+insert_stmt.getTablename());
        if(insert_stmt.getColomname()!=null)
        {
            System.out.println("    Column-Names     ");
            for(int i=0;i<insert_stmt.getColomname().size();i++)
                System.out.println("   "+insert_stmt.getColomname().get(i));

        }
        if(insert_stmt.isK_VALUES())
        {
            if(insert_stmt.getExps()!=null)
            {
                System.out.println("    Data  ");
                for(int i=0;i<insert_stmt.getExps().size();i++)
                   visit(insert_stmt.getExps().get(i));
            }

        }
        if(insert_stmt.getSelectStmt()!=null)
        {
            visit(insert_stmt.getSelectStmt());

        }


    }

    @Override
    public void visit(alter_table_add alter_table_add) {
        System.out.println("AST   Alter Table Add");
        if(alter_table_add.getTable_constraint()!=null)
            visit(alter_table_add.getTable_constraint());
    }

    @Override
    public void visit(alter_table_add_costraint alter_table_add_constraint) {
        System.out.println("AST Alter_Table_Add Constraint");
        if(alter_table_add_constraint.getName()!=null)
            System.out.println("          Constraint name  "+alter_table_add_constraint.getName());
        if(alter_table_add_constraint.getTable_constraint()!=null)
            visit(alter_table_add_constraint.getTable_constraint());


    }

    @Override
    public void visit(Column_Alias column_alias) {
        System.out.println("AST Column_Alias");
        if(column_alias.getIdenty()!=null)
            System.out.println("       Column_Alias :      "+ column_alias.getIdenty());
        if(column_alias.getSTRING_LITERAL()!=null)
            System.out.println("       Column_Alias :      "+ column_alias.getSTRING_LITERAL());


    }

    @Override
    public void visit(Column_constraint column_constraint) {
        System.out.println("AST Column_constraint");
        if(column_constraint.isConstrant())
            System.out.println("     Column_Constraint    "+column_constraint.getName());
        if(column_constraint.getColumn_constraint_pk()!=null)
            visit(column_constraint.getColumn_constraint_pk());
        if(column_constraint.getColumn_constraint_fk()!=null)
            visit(column_constraint.getColumn_constraint_fk());
        if(column_constraint.isColumn_constraint_null())
            System.out.println("       Column_constraint_null  "+column_constraint.isColumn_constraint_null());
        if(column_constraint.isColumn_constraint_not_null())
            System.out.println("       Column_constraint_not_null  "+column_constraint.isColumn_constraint_not_null());
        if(column_constraint.isIscheck())
            visit(column_constraint.getCheck());
        if(column_constraint.getColumn_default()!=null)
            visit(column_constraint.getColumn_default());
        if(column_constraint.isConstrant())
            System.out.println("     Column collation_name    "+column_constraint.getCollation_name());


    }

    @Override
    public void visit(Column_constraint_FK column_constraint_fk) {
        System.out.println("AST Column_constraint_FK");
        if(column_constraint_fk.getForeign_key_clause()!=null)
            visit(column_constraint_fk.getForeign_key_clause());

    }

    @Override
    public void visit(Column_constraint_PK column_constraint_pk) {
        System.out.println("AST Column_constraint_PK");
        if(column_constraint_pk.isASC())
            System.out.println("      column_constraint_pk  ASK  "+column_constraint_pk.isASC());
        if(column_constraint_pk.isDesc())
            System.out.println("      column_constraint_pk  DESK  "+column_constraint_pk.isASC());
        if(column_constraint_pk.isAUTOINCREMENT())
            System.out.println("      column_constraint_pk  AUTOINCREMENT  "+column_constraint_pk.isASC());

    }

    @Override
    public void visit(Column_def column_def) {
        System.out.println("AST Column_def");
        if(column_def.getColumnname()!=null)
            System.out.println("     Column name :    "+ column_def.getColumnname());
        if(column_def.getColumn_constraints()!=null)
            for(int i=0;i<column_def.getColumn_constraints().size();i++)
                visit(column_def.getColumn_constraints().get(i));
        if(column_def.getTypenames()!=null)
            for(int i=0;i<column_def.getTypenames().size();i++)
                visit(column_def.getTypenames().get(i));


    }

    @Override
    public void visit(column_default column_default) {
        System.out.println("AST column_default");

        boolean exisit=true;
        if(column_default.getColumn_default_value()!=null)
        {
            visit(column_default.getColumn_default_value());
            exisit=false;
        }
        if(column_default.getExpr()!=null)
            visit(column_default.getExpr());
        if(column_default.getK_NEXTVAL())
        {
            System.out.println("     column_default (Kextval)   "+column_default.getK_NEXTVAL());
            exisit=false;
        }
        if(exisit)
        {
            System.out.println("    Column Default  (name)  "+column_default.getName());
            ArrayList<String> copy=new ArrayList<>();
            if(column_default.isTOWPOINT())
            {
                System.out.println("         Column Defalt (any-names)");
                for (int i = 1; i < column_default.getAnynames().size(); i++)
                    System.out.println("[ "+column_default.getAnynames().get(i)+"]");


            }
        }


    }

    @Override
    public void visit(Column_default_value column_default_value) {
        System.out.println("AST Column_Default_Value");
        if(column_default_value.getLiteral_value()!=null)
            System.out.println("    Literal_Value "+column_default_value.getLiteral_value());
        if(column_default_value.getSigned_number()!=null)
            System.out.println("     SignedNumber "+column_default_value.getSigned_number());



    }

    @Override
    public void visit(database_name1 database_name1) {
        System.out.println("AST DatabaseName1");
        if (database_name1.getColumnname() != null)
            System.out.println("    ColumnName  " + database_name1.getColumnname());
        if (database_name1.getDatabasename() != null) {
            System.out.println("    DataNames   ");
            for (int i = 0; i < database_name1.getDatabasename().size(); i++)
                System.out.println(i+"  " + database_name1.getDatabasename());
        }
            if (database_name1.getTablenames() != null)
            {
                System.out.println("    TableNames   ");
                for (int i = 0; i < database_name1.getTablenames().size(); i++)
                    System.out.println(i+"  " + database_name1.getTablenames());
            }


        }


    @Override
    public void visit(existsselect existSelect)
    {
        System.out.println("AST ExistSelect  ");
        if(existSelect.isVar1())
        {
            System.out.println("    K_Not is  "+existSelect.isVar1());
        }
        if(existSelect.isVar2())
            System.out.println("   K_EXISTS"+existSelect.isVar2());
        if(existSelect.getSelectStmt()!=null)
            visit(existSelect.getSelectStmt());


    }

    @Override
    public void visit(expr expr) {
        System.out.println("AST Expression");
        if(expr.getLiterlvalue()!=null)
            System.out.println("        LiterlValue  "+expr.getLiterlvalue());
        if(expr.getIdenty()!=null)
            System.out.println("         Identity "+expr.getIdenty());
        if(expr.getUnary_operator()!=null)
          visit(expr.getUnary_operator());
        if(expr.getD()!=null)
            visit(expr.getD());
       if (expr.getF ()!=null)
       {
           visit ( expr.getF () );
       }
        if(expr.getO()!=null)
            visit(expr.getO());
        if(expr.getKword()!=null)
            visit(expr.getKword());
        if(expr.getMINUS_MINUS()!=null)
            System.out.println("          Expr : "+expr.getMINUS_MINUS());
        if(expr.getPlus_plus()!=null)
            System.out.println("          Expr : "+expr.getPlus_plus());
        if(expr.getExprselect()!=null)
            visit(expr.getExprselect());


        if(expr.getExprleft()!=null)
            visit(expr.getExprleft());


        if(expr.getOperator()!=null)
            System.out.println("          Operator :"+expr.getOperator());

        if(expr.getExpright()!=null)
            visit(expr.getExpright());

if(expr.getOpj()!=null)
{
    for (int i=0;i<expr.getOpj().size();i++)
        System.out.println("       obj"+expr.getOpj().get(i));
}
 if (expr.getExistsselect ()!=null)
 {
     visit ( expr.getExistsselect () );
 }

    }

    @Override
    public void visit(fk_target_column_name fk_target_column_name) {
        if(fk_target_column_name.getName()!=null)
            System.out.println("     Fk-Target-Column-Name "+fk_target_column_name.getName());


    }

    @Override
    public void visit(foreign_key_clause foreign_key_clause) {
        System.out.println("AST foreign_key_clause");
        if (foreign_key_clause.getDatabasename() != null)
            System.out.println("      Forgin key clause(Dadabase name)   " + foreign_key_clause.getDatabasename());
        if (foreign_key_clause.getForeign_table() != null)
            System.out.println("      Foreign Table    :" + foreign_key_clause.getForeign_table());
        if (foreign_key_clause.getFk_target_column_names() != null) {
            System.out.println("      Target Column Names  ");
            for (int i = 0; i < foreign_key_clause.getFk_target_column_names().size(); i++) {
                System.out.println("           [" + foreign_key_clause.getFk_target_column_names().get(i)+"]");
            }
        }


        if (foreign_key_clause.getMatch_names() != null)

        {
            System.out.println("      Match_Names Table:    " + foreign_key_clause.getForeign_table());
            for (int i = 0; i < foreign_key_clause.getMatch_names().size(); i++)
            {
                if(foreign_key_clause.getMatch_names().get(i).isK_ON())
                {
                    if(foreign_key_clause.getMatch_names().get(i).isK_DELETE())
                    {
                        System.out.print(" ON DELETE ");
                        if(foreign_key_clause.getMatch_names().get(i).isK_SET())
                        {
                            if(foreign_key_clause.getMatch_names().get(i).isK_NULL())
                                System.out.println(" SET NULL "+foreign_key_clause.getMatch_names().get(i).isK_NULL());
                            if(foreign_key_clause.getMatch_names().get(i).isK_DEFAULT())
                                System.out.println(" SET DEFAULT"+foreign_key_clause.getMatch_names().get(i).isK_DEFAULT());

                        }
                        if(foreign_key_clause.getMatch_names().get(i).isK_CASCADE())
                            System.out.println("  CASCADE "+foreign_key_clause.getMatch_names().get(i).isK_CASCADE());
                        if(foreign_key_clause.getMatch_names().get(i).isK_RESTRICT())
                            System.out.println("  RESTRICT "+foreign_key_clause.getMatch_names().get(i).isK_RESTRICT());
                        if(foreign_key_clause.getMatch_names().get(i).isK_NO())
                        {
                            if(foreign_key_clause.getMatch_names().get(i).isK_ACTION())
                            {
                                System.out.println("  NO ACTION "+foreign_key_clause.getMatch_names().get(i).isK_ACTION());
                            }

                        }
                        if(foreign_key_clause.getMatch_names().get(i).isK_MATCH())
                        {
                            System.out.println(" MATCH NAME IS :"+foreign_key_clause.getMatch_names().get(i).getName());
                        }
                    }
                    if(foreign_key_clause.getMatch_names().get(i).isK_UPDATE())
                    {
                        System.out.print(" ON UPDATE ");
                        if(foreign_key_clause.getMatch_names().get(i).isK_SET())
                        {
                            if(foreign_key_clause.getMatch_names().get(i).isK_NULL())
                                System.out.println(" SET NULL "+foreign_key_clause.getMatch_names().get(i).isK_NULL());
                            if(foreign_key_clause.getMatch_names().get(i).isK_DEFAULT())
                                System.out.println(" SET DEFAULT"+foreign_key_clause.getMatch_names().get(i).isK_DEFAULT());

                        }
                        if(foreign_key_clause.getMatch_names().get(i).isK_CASCADE())
                            System.out.println("  CASCADE "+foreign_key_clause.getMatch_names().get(i).isK_CASCADE());
                        if(foreign_key_clause.getMatch_names().get(i).isK_RESTRICT())
                            System.out.println("  RESTRICT "+foreign_key_clause.getMatch_names().get(i).isK_RESTRICT());
                        if(foreign_key_clause.getMatch_names().get(i).isK_NO())
                        {
                            if(foreign_key_clause.getMatch_names().get(i).isK_ACTION())
                            {
                                System.out.println("  NO ACTION "+foreign_key_clause.getMatch_names().get(i).isK_ACTION());
                            }

                        }
                        if(foreign_key_clause.getMatch_names().get(i).isK_MATCH())
                        {
                            System.out.println(" MATCH NAME IS :"+foreign_key_clause.getMatch_names().get(i).getName());
                        }
                    }
                }

            }

        }
    }


    @Override
    public void visit(function_name1 function_name1) {
        System.out.println("AST Function Name ");
        if(function_name1.getName()!=null)
        {
            System.out.println("     Function Name  "+function_name1.getName());
        }
        if(function_name1.isK_DISTINCT())
            System.out.println("   K_Distinct "+function_name1.isK_DISTINCT());
        if(function_name1.getStar())
            System.out.println("   STAR "+function_name1.getStar());
        if(function_name1.getExprs()!=null)
        {
            System.out.println("     Expre  ");
            for(int i=0;i<function_name1.getExprs().size();i++)
                visit(function_name1.getExprs().get(i));
        }


    }

    @Override
    public void visit(identy identy) {
        System.out.println("AST Identy");
        if(identy.getIdenty1()!=null)
            System.out.println("    IDENTIFIER ");

    }

    @Override
    public void visit(Index_column index_column) {
        System.out.println("AST Index_column");
        if(index_column.getColumnname()!=null)
        {
            System.out.println("        ColumnName  " +index_column.getColumnname());

        }
        if(index_column.isK_COLLATE()) {
            System.out.println("         INDEX COLUMN     Collate"+index_column.isAsc());
            System.out.println("         collation_name           "+index_column.getCollation_name());

        }
        if(index_column.isAsc())
        System.out.println("         Index    ASC  "+index_column.isAsc());
        if(index_column.isDesc())
            System.out.println("      Index   Desc "+index_column.isDesc());

    }

    @Override
    public void visit(Join join) {
        System.out.println("AST JOIN");

    }

    @Override
    public void visit(Join_Clause join_clause) {
        System.out.println("AST JoinClause   ");
        if(join_clause.getTable_or_subquery()!=null) {
            System.out.println("    TableOrSupQuery :   ");
            for(int i=0;i<join_clause.getTable_or_subquery().size();i++)
            visit(join_clause.getTable_or_subquery().get(i));
        }
        if(join_clause.getJoin_operators()!=null)
        {
            System.out.println("    JoinOperators   ");
            for(int i=0;i<join_clause.getJoin_operators().size();i++)
                visit(join_clause.getJoin_operators().get(i));
        }
        if(join_clause.getJoin_constraints()!=null)
        {
            System.out.println("    JoinConstraint   ");
            for(int i=0;i<join_clause.getJoin_constraints().size();i++)
                visit(join_clause.getJoin_constraints().get(i));
        }

    }

    @Override
    public void visit(Join_Constraint join_constraint) {
        System.out.println("AST JoinConstraint ");
        if(join_constraint.isK_ON()) {
            System.out.println("   ON " );
if(join_constraint.getExp()!=null)
    visit(join_constraint.getExp());
        }
    }

    @Override
    public void visit(Join_Operator join_operator) {
        System.out.println("AST Join_Operator");
        if(join_operator.isInner())
            System.out.println("      Join Inner "+join_operator.isInner());
        if(join_operator.isLeft()) {
            if (join_operator.isOuter())
                System.out.println("       Left Outer " + join_operator.isOuter());
            else
                System.out.println("       Left  " + join_operator.isOuter());
        }


    }

    @Override
    public void visit(Literal_value literal_value) {
        System.out.println("AST Literal Value");
        if(literal_value.getIdenty()!=null)
            System.out.println("      IDENTY  "+literal_value.getIdenty());
        if(literal_value.getName()!=null)
            System.out.println("       Name   "+literal_value.getName());
        if(literal_value.getType()!=null)
            System.out.println("        Type   "+literal_value.getType());


    }

    @Override
    public void visit(match_name match_name) {
        System.out.println("AST MatchName");
        if(match_name.isK_SET())
        {
            if(match_name.isK_NULL())
                System.out.println("          SET NULL    "+match_name.isK_NULL());
            if(match_name.isK_DEFAULT())
                System.out.println("           SET Default  "+match_name.isK_DEFAULT());

        }
        if(match_name.isK_CASCADE())
            System.out.println("           CACCADE      "+ match_name.isK_CASCADE());
        if(match_name.isK_RESTRICT())
            System.out.println("            RESTRICT    "+match_name.isK_RESTRICT());
        if(match_name.isK_NO())
        {
            if(match_name.isK_ACTION())
                System.out.println("          NO ACTION    "+match_name.isK_ACTION());
        }
        if(match_name.isK_MATCH()) {

            if (match_name.getName() != null)
                System.out.println("           Match name   "+match_name.getName());

        }

    }

    @Override
    public void visit(kword kword) {
        if (kword.isB ())
        {
            System.out.println( "true");

        }
        if (kword.isB2 ())
        {
            System.out.println( "false");

        }
        if (kword.isB3 ())
        {
            System.out.println( "BREAK");

        }
        if (kword.isB4 ())
        {
            System.out.println( " CONTINUE");

        }
    }

    @Override
    public void visit(Ordering_term ordering_term) {
        System.out.println("AST Ordering_term");
        if(ordering_term.getExp()!=null) {

            visit(ordering_term.getExp());

        }

        if(ordering_term.getCollation_name()!=null)
            System.out.println("    Order CollationName :"      + ordering_term.getCollation_name());
        if(ordering_term.isK_ASC())
            System.out.println("   Ordering  ASK" +ordering_term.isK_ASC());
        if(ordering_term.isK_DESC())
            System.out.println("   ordering DESK  "+ordering_term.isK_DESC());

    }



    @Override
    public void visit(qualified_table qualified_table) {
        System.out.println("AST qualified_table");
        if(qualified_table.getDatabasename()!=null)
            System.out.println("      Data base name is   "+qualified_table.getDatabasename());
        if(qualified_table.getTablename()!=null)
            System.out.println("      Table name is       "+qualified_table.getTablename());
        if(qualified_table.getIndexname()!=null)
            System.out.println("       Index name is      "+qualified_table.getIndexname());

    }

    @Override
    public void visit(Result_Column result_column) {
        System.out.println("AST Result_Column");
        if(result_column.getTable_name()!=null)
            System.out.println("table name");
        if(result_column.isSTAR())
            System.out.println("    Result column  *  "+result_column.isSTAR());
        if(result_column.getColumn_alias()!=null)
            visit(result_column.getColumn_alias());
        if(result_column.getExp()!=null)
            visit(result_column.getExp());//we must bield exp visit
        if(result_column.isK_AS())
            System.out.println("    Result column  AS  "+result_column.isK_AS());


    }

    @Override
    public void visit(Select_Core select_core) {
        System.out.println("AST Select_Core");
        if(select_core.isK_DISTINCT())
            System.out.println("      DISTINCT IS   "+select_core.isK_DISTINCT());
        if(select_core.isK_ALL())
            System.out.println("      ALL IS        "+select_core.isK_ALL());
        for (int i = 0; i < select_core.getResult_columns().size(); i++) {
            visit(select_core.getResult_columns().get(i));
        }
        if(select_core.getTable_or_subqueries()!=null)
            for (int i = 0; i < select_core.getTable_or_subqueries().size(); i++)
                visit(select_core.getTable_or_subqueries().get(i));

        if (select_core.getJoin_clause() != null)
            visit(select_core.getJoin_clause());

       // if(select_core.getWHERE()!=null) {
        //    System.out.println("Where :");
        //    visit(select_core.getWHERE());
       // }
        if (select_core.getGroupby() != null) {
            for (int i = 0; i < select_core.getGroupby().size(); i++) {
                visit(select_core.getGroupby().get(i));
            }
        }
        if (select_core.getHaving() != null)
            visit(select_core.getHaving());

        if (select_core.getVALUES() != null) {
            if (select_core.getVALUES() != null) {
                for (int i = 0; i < select_core.getVALUES().size(); i++) {
                    visit(select_core.getVALUES().get(i));

                }
            }
        }


    }

    @Override
    public void visit(select_or_values select_or_values) {
        System.out.println("AST select_or_values");
        if(select_or_values.isK_DISTINCT())
            System.out.println("      DISTINCT IS   "+select_or_values.isK_DISTINCT());
        if(select_or_values.isK_ALL())
            System.out.println("       ALL IS        "+select_or_values.isK_ALL());
        if(select_or_values.getResult_columns()!=null)
        for (int i = 0; i < select_or_values.getResult_columns().size(); i++) {
            visit(select_or_values.getResult_columns().get(i));
        }
        if(select_or_values.getTable_or_subqueries()!=null)
            for (int i = 0; i < select_or_values.getTable_or_subqueries().size(); i++)
                visit(select_or_values.getTable_or_subqueries().get(i));

        if (select_or_values.getExprs() != null) {
            for (int i = 0; i < select_or_values.getExprs().size(); i++) {
                visit(select_or_values.getExprs().get(i));
            }
        }
        if (select_or_values.getHaving() != null)
            visit(select_or_values.getHaving());
       // if (select_or_values.getJoin_clause() != null)
         //   visit(select_or_values.getJoin_clause());
        if (select_or_values.getValues() != null) {
            if (select_or_values.getValues() != null) {
                for (int i = 0; i < select_or_values.getValues().size(); i++) {
                    visit(select_or_values.getValues().get(i));

                }
            }
        }

        if(select_or_values.getWhere()!=null) {
            System.out.println(" Where :"+select_or_values.isK_WHERE());
            visit(select_or_values.getWhere());

        }
    }


    @Override
    public void visit(Signed_number signed_number) {
        System.out.println("AST Signed_number");
        if (signed_number.getNUMERIC_LITERAL()!=null)
            System.out.println("      Signed_number    "+signed_number.getNUMERIC_LITERAL());


    }

    @Override
    public void visit(Table_constraint table_constraint) {
        System.out.println("AST Table_constraint");
        if(table_constraint.isK_CONSTRAINT())
            System.out.println("      Constraint name  "+ table_constraint.getName());
        if(table_constraint.getTable_constraint_pk()!=null)
            visit(table_constraint.getTable_constraint_pk());
        if(table_constraint.getTable_constraint_foreign_key()!=null)
            visit(table_constraint.getTable_constraint_foreign_key());
        if(table_constraint.getTable_constraint_unique()!=null)
            visit(table_constraint.getTable_constraint_unique());
        if(table_constraint.isCheck())
            visit(table_constraint.getExpr());

    }

    @Override
    public void visit(Table_constraint_foreign_key table_constraint_foreign_key) {
        System.out.println("AST TableConstraint FOREIGN KEY ");
        if(table_constraint_foreign_key.getFk_origin_column_names()!=null)
        {
            System.out.println("            FOREIGN KEY COLUMN NAME   ");
            for(int i=0;i<table_constraint_foreign_key.getFk_origin_column_names().size();i++)
                System.out.println("                                  "+table_constraint_foreign_key.getFk_origin_column_names().get(i));

        }
        if(table_constraint_foreign_key.getForeign_key_clause()!=null)
            visit(table_constraint_foreign_key.getForeign_key_clause());


    }

    @Override
    public void visit(Table_constraint_key table_constraint_key) {
        System.out.println("AST TableConstraint key ");
        if(table_constraint_key.getName()!=null)
            System.out.println("          TableConstraint Key NAME  "+table_constraint_key.getName());
        if(table_constraint_key.getIndex_columns()!=null)
        {
            System.out.println("          Index_columns  ");
            for(int i=0;i<table_constraint_key.getIndex_columns().size();i++)
                System.out.println("       "+table_constraint_key.getIndex_columns().get(i));

        }


    }

    @Override
    public void visit(Table_constraint_PK table_constraint_pk) {
        System.out.println("AST Table_constraint_PK");
        if (table_constraint_pk.getIndex_columns() != null) {
            System.out.println("       Index Columns   ");

            for (int i = 0; i < table_constraint_pk.getIndex_columns().size(); i++)
                visit(table_constraint_pk.getIndex_columns().get(i));

        }

    }

    @Override
    public void visit(Table_constraint_unique table_constraint_unique) {
        System.out.println("AST Table Constraint Unique ");
        if(table_constraint_unique.getName()!=null)
            System.out.println("          TableConstraint Unique NAME  "+table_constraint_unique.getName());
        if(table_constraint_unique.getIndex_columns()!=null)
        {
            System.out.println("          Index_columns  ");
            for(int i=0;i<table_constraint_unique.getIndex_columns().size();i++)
                System.out.println("       "+table_constraint_unique.getIndex_columns().get(i).getColumnname());

        }

    }

    @Override
    public void visit(Table_Or_Subquery table_or_subquery)
    {
        System.out.println("AST Table Or Subquery");
        if(table_or_subquery.getDatabase_name()!=null)
            System.out.println("     Database Name    "+table_or_subquery.getDatabase_name());
        if(table_or_subquery.getTable_name()!=null)
            System.out.println("      TableName       "+table_or_subquery.getTable_name());
        if(table_or_subquery.isK_AS())
        {
            System.out.println("      AS     "+ table_or_subquery.isK_AS());
        }
        if(table_or_subquery.getTable_alias()!=null)
            System.out.println("      Table Alias     "+table_or_subquery.getTable_alias());
        if(table_or_subquery.isK_INDEXED())
        {
            if(table_or_subquery.isK_BY())
            {
                System.out.println("   Index By      "+table_or_subquery.isK_BY());
                System.out.println("   Index Name    "+table_or_subquery.getIndex_name());
            }

        }
        if(table_or_subquery.isK_NOT())
        {
            if(table_or_subquery.isK_INDEXED())
                System.out.println("   Not Index     "+table_or_subquery.isK_NOT());
        }
        if(table_or_subquery.getTable_or_subqueries()!=null)
        {
            System.out.println("       Table or supquerys   ");
            for(int i=0;i<table_or_subquery.getTable_or_subqueries().size();i++)
                visit(table_or_subquery.getTable_or_subqueries().get(i));


        }
        if(table_or_subquery.getJoin_clause()!=null)
        {

            visit(table_or_subquery.getJoin_clause());
        }
        if(table_or_subquery.getSelectStmt()!=null)
        {
            visit(table_or_subquery.getSelectStmt());
        }

    }

    @Override
    public void visit(Typename typename) {
        System.out.println("AST Typename");
        if(typename.getName()!=null)
            System.out.println("     Type Name    "+ typename.getName());
        if(typename.getType_name_reals()!=null)
            for (int i=0;i< typename.getType_name_reals().size();i++)
                visit(typename.getType_name_reals().get(i));

    }

    @Override
    public void visit(Type_name_real type_name_real) {
        System.out.println("AST Type_name_real");
        if(type_name_real.getSigned_number()!=null)
            visit(type_name_real.getSigned_number());
        if (type_name_real.getAnyName() !=null)
            System.out.println("    Type name Real (name)  "+type_name_real.getAnyName());



    }

    @Override
    public void visit(unary_operator1 unary_operator) {
        System.out.println("AST UnaryOperator1 ");
        if(unary_operator.getOp()!=null)
            System.out.println("         UnaryOperator   "+unary_operator.getOp());
        if(unary_operator.getExpr()!=null)
            visit(unary_operator.getExpr());

    }

    @Override
    public void visit(parameter param) {
        System.out.println("ast parameter");
        if(param.getFun_name()!=null);
        System.out.println("Function_name   "+param.getFun_name());
        if(param.getVarable()!=null){
            visit(param.getVarable());
        }


    }

    @Override
    public void visit(variable variab) {
        System.out.println("ast variable");
    }

    @Override
    public void visit(varable varab) {
        System.out.println("ast varable");
        if(varab.getVar()!=null)
        {
            System.out.print(varab.getVar()+"  ");
        }

        System.out.println(varab.getName_x());
        if(varab.getASSIGN()!=null){
            System.out.println(varab.getASSIGN());
            visit(varab.getExpr());
        }
        for (int i =0; i < varab.getList_var().size() ; i++) {
            visit(varab.getList_var().get(i));
        }
    }

    @Override
    public void visit(list_var list_var1) {
        System.out.println("ast list_var1");
        if(list_var1.getVar()!=null){
            System.out.print(list_var1.getVar()+"   ");
        }
        System.out.println(list_var1.getName_x());
        if(list_var1.getASSIGN()!=null){
            System.out.println(list_var1.getASSIGN());
            visit(list_var1.getExpr());}


    }

    @Override
    public void visit(oprint1 oprint1) {
        System.out.println(" ast oprint1");

        System.out.print( oprint1.getName_x()+" ");
        System.out.print(oprint1.getOp()+" ");
        if(oprint1.getName_x1()!=null)
        {
            System.out.println(oprint1.getName_x1());
        }


    }

    @Override
    public void visit(oprint2 oprint2) {
        System.out.println("ast oprint2");
        visit(oprint2.getExpr());

    }

    @Override
    public void visit(oprint3 oprint3) {
        System.out.println("ast oprint3");
        visit(oprint3.getExpr());

    }

    @Override
    public void visit(literal_value literal_value1) {

    }

    @Override
    public void visit(select_expr select_expr1) {

    }

    @Override
    public void visit(opexp opexp1) {
        System.out.println(opexp1.getOp ());
        visit (opexp1.getExpr () );
    }

    @Override
    public void visit(exprselect exprselect1) {

    }

    @Override
    public void visit(rele_ifcond roleif) {
        visit (roleif.getE1 () );
        System.out.println(roleif.getOp1 ());
        visit (roleif.getE2 () );
        System.out.println(roleif.getOp2 ());
        visit (roleif.getE3 ());

    }

    @Override
    public void visit(role_for role_for) {
        System.out.println("ast role_for");
        visit(role_for.getOprint1());
        visit(role_for.getOprint2());
        visit(role_for.getOprint3());
        if(role_for.getState_stmt()!=null)
        {
            for (int i =0; i < role_for.getState_stmt().size() ; i++) {
                visit(role_for.getState_stmt().get(i));
            }

        }


    }

    @Override
    public void visit(rele_dowhile role_dowhile1) {

    }

    @Override
    public void visit(role_forach role_forach1) {
        System.out.println("ast role_forach");
        visit(role_forach1.getE1());
        System.out.println(role_forach1.getOp());
        visit(role_forach1.getE2());
        if(role_forach1.getS()!=null){
            for (int i =0; i < role_forach1.getS().size() ; i++) {
                visit(role_forach1.getS().get(i));
            }
        }

    }

    @Override
    public void visit(role_switch role_switch1) {

            System.out.println("ast role_switch");
            visit(role_switch1.getExpe());
            for (int i =0; i < role_switch1.getRele_case1().size() ; i++) {
                visit(role_switch1.getRele_case1().get(i));
            }
            if(role_switch1.getDef()!=null)
            {
                System.out.println(role_switch1.getDef());
                System.out.println(role_switch1.getDot());
                visit(role_switch1.getRole_case());
            }
            if(role_switch1.isB()!=false)
            {   for (int i =0; i < role_switch1.getS().size() ; i++) {
                visit(role_switch1.getS().get(i));
            }

            }

    }


    @Override
    public void visit(role_re_con role_re_con1) {
        System.out.println("ast role_re_con");
        System.out.println(role_re_con1.getReturn1 ());
        if(role_re_con1.getRele_ifcond()!=null)
        {
            visit(role_re_con1.getRele_ifcond());
        }
        if(role_re_con1.getReturn_contunets()!=null) {
            for (int i = 0; i < role_re_con1.getReturn_contunets().size(); i++) {
                visit( role_re_con1.getReturn_contunets().get(i));
            }
        }

        if(role_re_con1.getReturn_cont2()!=null){
            visit( role_re_con1.getReturn_cont2());
        }

    }



    @Override
    public void visit(expr_or_rele_ifcond expr_or_rele_ifcond1) {
    if (expr_or_rele_ifcond1.getE ()!=null)
    {
        visit ( expr_or_rele_ifcond1.getE () );
    }
     if(expr_or_rele_ifcond1.getRele_ifcond ()!=null){
        visit ( expr_or_rele_ifcond1.getRele_ifcond () );
    }
    }

    @Override
    public void visit(rele_case1 rele_case1) {
        System.out.println("ast rele_case1");
        visit(rele_case1.getE());
        System.out.println(rele_case1.getDot());
        visit(rele_case1.getRole_case());

    }

    @Override
    public void visit(rolewhile rolewhile1) {
        System.out.println("ast rolewhile");
        visit(rolewhile1.getExpe());
        if(rolewhile1.getS()!=null)
        {
            for (int i =0; i < rolewhile1.getS().size() ; i++) {
                visit(rolewhile1.getS().get(i));
            }

        }}



    @Override
    public void visit(role_case role_case) {
        System.out.println("ast role_case");
        for (int i =0; i < role_case.getState_stmt().size() ; i++) {
            visit(role_case.getState_stmt().get(i));
        }


    }

    @Override
    public void visit(fun_body fun_body1) {

    }

    @Override
    public void visit(print_content print_content) {
        System.out.println("ast print_content");
        for (int i =0; i <print_content.getExprs().size() ; i++) {
            visit(print_content.getExprs().get(i));
        }
        if(print_content.isJson())
        {
            visit(print_content.getJson_call());
            for (int i =0; i <print_content.getOpjs().size() ; i++) {
                print_content.getOpjs();
                print_content.getS();
            }
        }

    }

    @Override
    public void visit(array_stmt array_stmt) {
        System.out.println("ast array_stmt");

        System.out.println("ast name_var:  " +array_stmt.getName_x ());

        if (array_stmt.isExpr1 ())
        {

            visit ( array_stmt.getExpr () );
        }
        if (array_stmt.isSelect_core1 ())
        {
            visit ( array_stmt.getSelect_core () );

        }
        if (array_stmt.isFunction_name2 () )
        {
            visit ( array_stmt.getFunction_name1 () );
        }
        if (array_stmt.isExprlist())
        {

            for (int i = 1; i < array_stmt.getExprs ().size(); i++) {
                visit ( array_stmt.getExprs ().get ( i ) );
            }

        }

    }

    @Override
    public void visit(state_stmt state_stmt) {
        System.out.println("AST state_stmt");
        if(state_stmt.isFor_1()){
            visit(state_stmt.getRole_for());
        }
        if(state_stmt.isIf_1()){
            visit(state_stmt.getRoleif());
        }
        if(state_stmt.isDo_while_1())
        {
            visit(state_stmt.getRole_dowhile());
        }
        if(state_stmt.isForach_1()){
            visit(state_stmt.getRole_forach());
        }
        if(state_stmt.isWhile_1()){
            visit(state_stmt.getRolewhile());
        }
        if(state_stmt.isSwitch_1()){

            visit(state_stmt.getRole_switch());
        }
        if(state_stmt.isRele_onco_1()){
            visit(state_stmt.getRele_onecond());
        }
        if(state_stmt.isRo_re_con()){
            visit(state_stmt.getRole_re_con());
        }
        if(state_stmt.isJsoncal_1()){
            visit(state_stmt.getJson_call());
        }
        if(state_stmt.isArray_stmt_1()){
            visit(state_stmt.getArray_stmt());
        }
        if(state_stmt.isExp_1()){
            visit(state_stmt.getExpr());
        }
        if(state_stmt.isPrint_1()){
            System.out.println("Print Stmt");
            for (int i =0; i <state_stmt.getPrint_content().size() ; i++) {
                visit(state_stmt.getPrint_content().get(i));
            }
        }
        if(state_stmt.isVar_1()){

            visit(state_stmt.getVar_stmt());
        }


    }

    @Override
    public void visit(return_cont2 return_cont2) {

    }

    @Override
    public void visit(return_contunet return_contunet) {
        System.out.println("ast return_contunet");
        if(return_contunet.isB1()){
            visit(return_contunet.getExpr());
        }
        if(return_contunet.isB2()){
            System.out.println(return_contunet.getAny_name());
        }
        if(return_contunet.isB3()){
            visit(return_contunet.getRele_onecond());
        }

    }

    @Override
    public void visit(Roleif Roleif) {
        System.out.println("AST Roleif");
        System.out.println("If con :");
        visit(Roleif.getExpr());
        if(Roleif.getState_stmt()!=null)
        {
            for (int i =0; i <Roleif.getState_stmt().size() ; i++) {
                visit(Roleif.getState_stmt().get(i));
            }
        }
        if(Roleif.getElse_state_stmt ()!=null) {
           for(int i=0;i<Roleif.getElse_state_stmt().size();i++)
             visit(Roleif.getElse_state_stmt().get(i));
            }
        }



    @Override
    public void visit(else_stmt else_stmt) {
        System.out.println("AST Else_Stmt");
        System.out.println("  Else is :"+else_stmt.isK_else());
        if (else_stmt.getArrayList() != null) {
            for (int i = 0; i < else_stmt.getArrayList().size(); i++) {
                visit(else_stmt.getArrayList().get(i));
            }

        }
    }

    @Override
    public void visit(role_dowhile role_dowhile1) {
        System.out.println("ast role_dowhile");
        if(role_dowhile1.getDo1()!=null)
        {
            System.out.println( role_dowhile1.getDo1());
            for (int i =0; i < role_dowhile1.getState_stmts().size() ; i++) {
                visit(role_dowhile1.getState_stmts().get(i));
            }
            System.out.println( role_dowhile1.getWhile1());
            visit(role_dowhile1.getE());
        }


    }

    @Override
    public void visit(rele_onecond rele_onecond) {
        System.out.println("ast rele_onecond");
        if(rele_onecond.isVar()!=false)
        {
            System.out.println("K_VAR");
        }
        visit(rele_onecond.getExpr());
        System.out.println(rele_onecond.getOp1());
        visit(rele_onecond.getExpr1());
        System.out.println(rele_onecond.getOp2());
        visit(rele_onecond.getExpr_or_rele_ifcond());
        System.out.println(rele_onecond.getOp3());
        for (int i =0; i <rele_onecond.getExpr_or_rele_ifconds().size() ; i++) {
            visit(rele_onecond.getExpr_or_rele_ifconds().get(i));
        }

    }

    @Override
    public void visit(value value1) {
        System.out.println("ast value");
        if (value1.isExp1 ())
        {
            visit ( value1.getExpr () );
        }
        if (value1.isArray1 ())
        {
            visit ( value1.getArray () );

        }
        if (value1.isObject2 ())
        {
            visit ( value1.getObject () );
        }

    }

    @Override
    public void visit(json_call3 json_call3) {
        System.out.println("ast json_call3");
        System.out.println(json_call3.getPoint());
        System.out.println(json_call3.getProperty1());


    }

    @Override
    public void visit(json_call json_call) {
        System.out.println("ast json_call");
        System.out.println(json_call.getProperty1());
        System.out.println(json_call.getPoint());
        System.out.println(json_call.getProperty2());
        if(json_call.isJa()!=false)
        { for (int i =0; i <json_call.getJson_call3s().size() ; i++) {
            visit(json_call.getJson_call3s().get(i));
        }
        }
        if(json_call.getASSIGN()!=null)
        {
            System.out.println(json_call.getASSIGN());
            if(json_call.getName()!=null)
            {
                System.out.println(json_call.getName());
            }
        }

    }

    @Override
    public void visit(var_stmt var_stmtr) {
        System.out.println("ast var_stmt");

        if (!var_stmtr.getName_x ().isEmpty ())
        {
            System.out.println( " variable_name: " +var_stmtr.getName_x ());
        }
        if(var_stmtr.isASSIGN ()){
        System.out.println("=");

        }
        if(var_stmtr.isArgument_stmt1 ())
        {
            visit ( var_stmtr.getArgument_stmt () );
        }
        if(var_stmtr.isHigher_stmt1 ())
        {
            visit ( var_stmtr.getHigher_stmt () );
        }
        if(var_stmtr.isJson_stmt1 ())
        {
            visit ( var_stmtr.getJson_stmt () );
        }
        if(var_stmtr.isExpr1 ())
        {
            visit ( var_stmtr.getExpr ());
        }
        if(var_stmtr.isSelect_Core ())
        {
            //   var_stmt.setSelect_core(visitSelect_core(ctx.select_core(0)));
        }


    }

    @Override
    public void visit(array array) {

        System.out.println(" ast visitArray");

        for (int i = 0; i < array.getValues().size(); i++) {
            visit(array.getValues().get(i));
        }

    }

    @Override
    public void visit(argument_stmt argument_stmt) {
        System.out.println("ast argument_stmt");
        System.out.println("ast Function_name :" + argument_stmt.getFunction_name ());
        for (int i = 0; i < argument_stmt.getExprs ().size (); i++) {
            visit ( argument_stmt.getExprs ().get ( i ) );}


    }

    @Override
    public void visit(ex_list ex_list) {

    }

    @Override
    public void visit(ex_op ex_op) {

    }

    @Override
    public void visit(exp2 exp2) {

    }

    @Override
    public void visit(expright expright) {

    }

    @Override
    public void visit(higher_stmt higher_stmt) {
        System.out.println(" ast visitHigher_stmt");
        System.out.println(" ast visitHigher_stmt :" + higher_stmt.getFunction_name ());
        System.out.println(" ast visitHigher_stmt :" + higher_stmt.getArry_name ());
        if (higher_stmt.getHigherStmt1s ()!=null)
        {
            visit ( higher_stmt.getHigherStmt1s () );
        }
        if (higher_stmt.getFun_body ()!=null)
        {
            visit ( higher_stmt.getFun_body () );
        }

    }

    @Override
    public void visit(higher_stmt1 higher_stmt1) {
        System.out.println(" ast visitHigher_stmt1");

        if (higher_stmt1.getExpr ()!=null)
        {
            visit ( higher_stmt1.getExpr () );
        }

        if(higher_stmt1.getExprs ()!=null)
        {
            for (int i = 1; i < higher_stmt1.getExprs ().size (); i++) {

                visit ( higher_stmt1.getExprs ().get ( i ));            }
        }

    }

    @Override
    public void visit(json_stmt json_stmt) {
        System.out.println(" ast visitJson_stmt");

        if (json_stmt.isArray1 ()) {
            visit ( json_stmt.getArray () );

        }
        if (json_stmt.isObject2 ()) {
            visit ( json_stmt.getObject () );

        }
        if (json_stmt.isPair_T1 ()) {
            visit ( json_stmt.getPair_t () );

        }

    }

    @Override
    public void visit(listopertion listopertion) {

    }

    @Override
    public void visit(numeric_literal numeric_literal) {

    }

    @Override
    public void visit(object1 object1) {
        for (int i = 0; i < object1.getPairs ().size (); i++) {
            visit ( object1.getPairs ().get ( i ) );
        }

    }

    @Override
    public void visit(op op) {

    }

    @Override
    public void visit(operations operations) {

    }

    @Override
    public void visit(pair pair) {
        System.out.println(" ast pair");
        System.out.println(" ast Property : " + pair.getProperty ());
        visit ( pair.getValue () );

    }

    @Override
    public void visit(pair_T pair_t) {

    }

    @Override
    public void visit(property property) {

    }

}
