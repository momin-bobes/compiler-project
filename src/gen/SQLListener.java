package gen;// Generated from C:/Users/ASUS/Desktop/untitled1123/src\SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(SQLParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(SQLParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError(SQLParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError(SQLParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#argument_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArgument_stmt(SQLParser.Argument_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#argument_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArgument_stmt(SQLParser.Argument_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#higher_stmt}.
	 * @param ctx the parse tree
	 */
	void enterHigher_stmt(SQLParser.Higher_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#higher_stmt}.
	 * @param ctx the parse tree
	 */
	void exitHigher_stmt(SQLParser.Higher_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#higher_stmt1}.
	 * @param ctx the parse tree
	 */
	void enterHigher_stmt1(SQLParser.Higher_stmt1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#higher_stmt1}.
	 * @param ctx the parse tree
	 */
	void exitHigher_stmt1(SQLParser.Higher_stmt1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(SQLParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(SQLParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(SQLParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(SQLParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#object1}.
	 * @param ctx the parse tree
	 */
	void enterObject1(SQLParser.Object1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#object1}.
	 * @param ctx the parse tree
	 */
	void exitObject1(SQLParser.Object1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pair_T}.
	 * @param ctx the parse tree
	 */
	void enterPair_T(SQLParser.Pair_TContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pair_T}.
	 * @param ctx the parse tree
	 */
	void exitPair_T(SQLParser.Pair_TContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_stmt}.
	 * @param ctx the parse tree
	 */
	void enterJson_stmt(SQLParser.Json_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_stmt}.
	 * @param ctx the parse tree
	 */
	void exitJson_stmt(SQLParser.Json_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_call}.
	 * @param ctx the parse tree
	 */
	void enterJson_call(SQLParser.Json_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_call}.
	 * @param ctx the parse tree
	 */
	void exitJson_call(SQLParser.Json_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#json_call3}.
	 * @param ctx the parse tree
	 */
	void enterJson_call3(SQLParser.Json_call3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#json_call3}.
	 * @param ctx the parse tree
	 */
	void exitJson_call3(SQLParser.Json_call3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondeclaration(SQLParser.FunctiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondeclaration(SQLParser.FunctiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fun_body}.
	 * @param ctx the parse tree
	 */
	void enterFun_body(SQLParser.Fun_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fun_body}.
	 * @param ctx the parse tree
	 */
	void exitFun_body(SQLParser.Fun_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_cont2}.
	 * @param ctx the parse tree
	 */
	void enterReturn_cont2(SQLParser.Return_cont2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_cont2}.
	 * @param ctx the parse tree
	 */
	void exitReturn_cont2(SQLParser.Return_cont2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#return_contunet}.
	 * @param ctx the parse tree
	 */
	void enterReturn_contunet(SQLParser.Return_contunetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#return_contunet}.
	 * @param ctx the parse tree
	 */
	void exitReturn_contunet(SQLParser.Return_contunetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#state_stmt}.
	 * @param ctx the parse tree
	 */
	void enterState_stmt(SQLParser.State_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#state_stmt}.
	 * @param ctx the parse tree
	 */
	void exitState_stmt(SQLParser.State_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#role_re_con}.
	 * @param ctx the parse tree
	 */
	void enterRole_re_con(SQLParser.Role_re_conContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#role_re_con}.
	 * @param ctx the parse tree
	 */
	void exitRole_re_con(SQLParser.Role_re_conContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#print_content}.
	 * @param ctx the parse tree
	 */
	void enterPrint_content(SQLParser.Print_contentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#print_content}.
	 * @param ctx the parse tree
	 */
	void exitPrint_content(SQLParser.Print_contentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_if}.
	 * @param ctx the parse tree
	 */
	void enterRele_if(SQLParser.Rele_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_if}.
	 * @param ctx the parse tree
	 */
	void exitRele_if(SQLParser.Rele_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void enterElse_stmt(SQLParser.Else_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#else_stmt}.
	 * @param ctx the parse tree
	 */
	void exitElse_stmt(SQLParser.Else_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_onecond}.
	 * @param ctx the parse tree
	 */
	void enterRele_onecond(SQLParser.Rele_onecondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_onecond}.
	 * @param ctx the parse tree
	 */
	void exitRele_onecond(SQLParser.Rele_onecondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr_or_rele_ifcond}.
	 * @param ctx the parse tree
	 */
	void enterExpr_or_rele_ifcond(SQLParser.Expr_or_rele_ifcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr_or_rele_ifcond}.
	 * @param ctx the parse tree
	 */
	void exitExpr_or_rele_ifcond(SQLParser.Expr_or_rele_ifcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_ifcond}.
	 * @param ctx the parse tree
	 */
	void enterRele_ifcond(SQLParser.Rele_ifcondContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_ifcond}.
	 * @param ctx the parse tree
	 */
	void exitRele_ifcond(SQLParser.Rele_ifcondContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_for}.
	 * @param ctx the parse tree
	 */
	void enterRele_for(SQLParser.Rele_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_for}.
	 * @param ctx the parse tree
	 */
	void exitRele_for(SQLParser.Rele_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#oprint1}.
	 * @param ctx the parse tree
	 */
	void enterOprint1(SQLParser.Oprint1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#oprint1}.
	 * @param ctx the parse tree
	 */
	void exitOprint1(SQLParser.Oprint1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#namef}.
	 * @param ctx the parse tree
	 */
	void enterNamef(SQLParser.NamefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#namef}.
	 * @param ctx the parse tree
	 */
	void exitNamef(SQLParser.NamefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#operations}.
	 * @param ctx the parse tree
	 */
	void enterOperations(SQLParser.OperationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#operations}.
	 * @param ctx the parse tree
	 */
	void exitOperations(SQLParser.OperationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#oprint2}.
	 * @param ctx the parse tree
	 */
	void enterOprint2(SQLParser.Oprint2Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#oprint2}.
	 * @param ctx the parse tree
	 */
	void exitOprint2(SQLParser.Oprint2Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#oprint3}.
	 * @param ctx the parse tree
	 */
	void enterOprint3(SQLParser.Oprint3Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#oprint3}.
	 * @param ctx the parse tree
	 */
	void exitOprint3(SQLParser.Oprint3Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_while}.
	 * @param ctx the parse tree
	 */
	void enterRele_while(SQLParser.Rele_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_while}.
	 * @param ctx the parse tree
	 */
	void exitRele_while(SQLParser.Rele_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_switch}.
	 * @param ctx the parse tree
	 */
	void enterRele_switch(SQLParser.Rele_switchContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_switch}.
	 * @param ctx the parse tree
	 */
	void exitRele_switch(SQLParser.Rele_switchContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_case1}.
	 * @param ctx the parse tree
	 */
	void enterRele_case1(SQLParser.Rele_case1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_case1}.
	 * @param ctx the parse tree
	 */
	void exitRele_case1(SQLParser.Rele_case1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_case}.
	 * @param ctx the parse tree
	 */
	void enterRele_case(SQLParser.Rele_caseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_case}.
	 * @param ctx the parse tree
	 */
	void exitRele_case(SQLParser.Rele_caseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_dowhile}.
	 * @param ctx the parse tree
	 */
	void enterRele_dowhile(SQLParser.Rele_dowhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_dowhile}.
	 * @param ctx the parse tree
	 */
	void exitRele_dowhile(SQLParser.Rele_dowhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#rele_forach}.
	 * @param ctx the parse tree
	 */
	void enterRele_forach(SQLParser.Rele_forachContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#rele_forach}.
	 * @param ctx the parse tree
	 */
	void exitRele_forach(SQLParser.Rele_forachContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void enterVar_stmt(SQLParser.Var_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#var_stmt}.
	 * @param ctx the parse tree
	 */
	void exitVar_stmt(SQLParser.Var_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#array_stmt}.
	 * @param ctx the parse tree
	 */
	void enterArray_stmt(SQLParser.Array_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#array_stmt}.
	 * @param ctx the parse tree
	 */
	void exitArray_stmt(SQLParser.Array_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void enterType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 */
	void exitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#type_name_real}.
	 * @param ctx the parse tree
	 */
	void enterType_name_real(SQLParser.Type_name_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#type_name_real}.
	 * @param ctx the parse tree
	 */
	void exitType_name_real(SQLParser.Type_name_realContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void enterColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 */
	void exitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SQLParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SQLParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#varable}.
	 * @param ctx the parse tree
	 */
	void enterVarable(SQLParser.VarableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#varable}.
	 * @param ctx the parse tree
	 */
	void exitVarable(SQLParser.VarableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#list_var}.
	 * @param ctx the parse tree
	 */
	void enterList_var(SQLParser.List_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#list_var}.
	 * @param ctx the parse tree
	 */
	void exitList_var(SQLParser.List_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(SQLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(SQLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#opre_all}.
	 * @param ctx the parse tree
	 */
	void enterOpre_all(SQLParser.Opre_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#opre_all}.
	 * @param ctx the parse tree
	 */
	void exitOpre_all(SQLParser.Opre_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(SQLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(SQLParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#opexp}.
	 * @param ctx the parse tree
	 */
	void enterOpexp(SQLParser.OpexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#opexp}.
	 * @param ctx the parse tree
	 */
	void exitOpexp(SQLParser.OpexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#kword1}.
	 * @param ctx the parse tree
	 */
	void enterKword1(SQLParser.Kword1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#kword1}.
	 * @param ctx the parse tree
	 */
	void exitKword1(SQLParser.Kword1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#existsselect}.
	 * @param ctx the parse tree
	 */
	void enterExistsselect(SQLParser.ExistsselectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#existsselect}.
	 * @param ctx the parse tree
	 */
	void exitExistsselect(SQLParser.ExistsselectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#exprselect}.
	 * @param ctx the parse tree
	 */
	void enterExprselect(SQLParser.ExprselectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#exprselect}.
	 * @param ctx the parse tree
	 */
	void exitExprselect(SQLParser.ExprselectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr(SQLParser.Select_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr(SQLParser.Select_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#identy}.
	 * @param ctx the parse tree
	 */
	void enterIdenty(SQLParser.IdentyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#identy}.
	 * @param ctx the parse tree
	 */
	void exitIdenty(SQLParser.IdentyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name1}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name1(SQLParser.Database_name1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name1}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name1(SQLParser.Database_name1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator1}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator1(SQLParser.Unary_operator1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator1}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator1(SQLParser.Unary_operator1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name1}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name1(SQLParser.Function_name1Context ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name1}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name1(SQLParser.Function_name1Context ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void enterForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 */
	void exitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#match_name}.
	 * @param ctx the parse tree
	 */
	void enterMatch_name(SQLParser.Match_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#match_name}.
	 * @param ctx the parse tree
	 */
	void exitMatch_name(SQLParser.Match_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void enterIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 */
	void exitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void enterQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 */
	void exitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void enterOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 */
	void exitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void enterPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 */
	void exitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void enterResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 */
	void exitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void enterJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 */
	void exitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void enterJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 */
	void exitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void enterSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 */
	void exitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void enterCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 */
	void exitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void enterLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 */
	void exitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void enterError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 */
	void exitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void enterModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 */
	void exitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(SQLParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(SQLParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#name_x}.
	 * @param ctx the parse tree
	 */
	void enterName_x(SQLParser.Name_xContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#name_x}.
	 * @param ctx the parse tree
	 */
	void exitName_x(SQLParser.Name_xContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#arry_name}.
	 * @param ctx the parse tree
	 */
	void enterArry_name(SQLParser.Arry_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#arry_name}.
	 * @param ctx the parse tree
	 */
	void exitArry_name(SQLParser.Arry_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void enterSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 */
	void exitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void enterNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 */
	void exitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void enterCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 */
	void exitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void enterForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 */
	void exitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void enterView_name(SQLParser.View_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 */
	void exitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void enterPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 */
	void exitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void enterSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 */
	void exitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void enterAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 */
	void exitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(SQLParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(SQLParser.PropertyContext ctx);
}