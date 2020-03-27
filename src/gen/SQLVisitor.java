package gen;// Generated from C:/Users/ASUS/Desktop/untitled1123/src\SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt_list(SQLParser.Sql_stmt_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_stmt(SQLParser.Sql_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#argument_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument_stmt(SQLParser.Argument_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#higher_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigher_stmt(SQLParser.Higher_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#higher_stmt1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHigher_stmt1(SQLParser.Higher_stmt1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SQLParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(SQLParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(SQLParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#object1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject1(SQLParser.Object1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pair_T}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair_T(SQLParser.Pair_TContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_stmt(SQLParser.Json_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_call(SQLParser.Json_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#json_call3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson_call3(SQLParser.Json_call3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#functiondeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctiondeclaration(SQLParser.FunctiondeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fun_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFun_body(SQLParser.Fun_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_cont2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_cont2(SQLParser.Return_cont2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#return_contunet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_contunet(SQLParser.Return_contunetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#state_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_stmt(SQLParser.State_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#role_re_con}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_re_con(SQLParser.Role_re_conContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#print_content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_content(SQLParser.Print_contentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_if(SQLParser.Rele_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#else_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_stmt(SQLParser.Else_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_onecond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_onecond(SQLParser.Rele_onecondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr_or_rele_ifcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_or_rele_ifcond(SQLParser.Expr_or_rele_ifcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_ifcond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_ifcond(SQLParser.Rele_ifcondContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_for(SQLParser.Rele_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#oprint1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprint1(SQLParser.Oprint1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#namef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamef(SQLParser.NamefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#operations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperations(SQLParser.OperationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#oprint2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprint2(SQLParser.Oprint2Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#oprint3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOprint3(SQLParser.Oprint3Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_while(SQLParser.Rele_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_switch(SQLParser.Rele_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_case1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_case1(SQLParser.Rele_case1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_case}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_case(SQLParser.Rele_caseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_dowhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_dowhile(SQLParser.Rele_dowhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#rele_forach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRele_forach(SQLParser.Rele_forachContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#var_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_stmt(SQLParser.Var_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#array_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_stmt(SQLParser.Array_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_stmt(SQLParser.Alter_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add_constraint(SQLParser.Alter_table_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_table_add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_add(SQLParser.Alter_table_addContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_stmt(SQLParser.Create_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(SQLParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table_stmt(SQLParser.Drop_table_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#factored_select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactored_select_stmt(SQLParser.Factored_select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(SQLParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(SQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_or_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_values(SQLParser.Select_or_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(SQLParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def(SQLParser.Column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name(SQLParser.Type_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#type_name_real}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_name_real(SQLParser.Type_name_realContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(SQLParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_primary_key(SQLParser.Column_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_foreign_key(SQLParser.Column_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_not_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_not_null(SQLParser.Column_constraint_not_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_constraint_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint_null(SQLParser.Column_constraint_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default(SQLParser.Column_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_default_value(SQLParser.Column_default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(SQLParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#varable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarable(SQLParser.VarableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#list_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_var(SQLParser.List_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(SQLParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#opre_all}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpre_all(SQLParser.Opre_allContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(SQLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#opexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpexp(SQLParser.OpexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#kword1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKword1(SQLParser.Kword1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#existsselect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsselect(SQLParser.ExistsselectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#exprselect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprselect(SQLParser.ExprselectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expr(SQLParser.Select_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#identy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdenty(SQLParser.IdentyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name1(SQLParser.Database_name1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator1(SQLParser.Unary_operator1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name1(SQLParser.Function_name1Context ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_key_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_key_clause(SQLParser.Foreign_key_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#match_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatch_name(SQLParser.Match_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_target_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_target_column_name(SQLParser.Fk_target_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#indexed_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexed_column(SQLParser.Indexed_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(SQLParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_primary_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_primary_key(SQLParser.Table_constraint_primary_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_foreign_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_foreign_key(SQLParser.Table_constraint_foreign_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_unique}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_unique(SQLParser.Table_constraint_uniqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_constraint_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint_key(SQLParser.Table_constraint_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#fk_origin_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFk_origin_column_name(SQLParser.Fk_origin_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#qualified_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualified_table_name(SQLParser.Qualified_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ordering_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdering_term(SQLParser.Ordering_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_value(SQLParser.Pragma_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(SQLParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#result_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResult_column(SQLParser.Result_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_subquery(SQLParser.Table_or_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_operator(SQLParser.Join_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_constraint(SQLParser.Join_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_core}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_core(SQLParser.Select_coreContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#cte_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCte_table_name(SQLParser.Cte_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#signed_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number(SQLParser.Signed_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#literal_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral_value(SQLParser.Literal_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(SQLParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#error_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError_message(SQLParser.Error_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_argument(SQLParser.Module_argumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(SQLParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#unknown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnknown(SQLParser.UnknownContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#name_x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_x(SQLParser.Name_xContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#arry_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArry_name(SQLParser.Arry_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(SQLParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#source_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_table_name(SQLParser.Source_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(SQLParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_or_index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_or_index_name(SQLParser.Table_or_index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#new_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew_table_name(SQLParser.New_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(SQLParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#collation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_name(SQLParser.Collation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#foreign_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_table(SQLParser.Foreign_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_name(SQLParser.Index_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#view_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_name(SQLParser.View_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(SQLParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#pragma_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPragma_name(SQLParser.Pragma_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#savepoint_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepoint_name(SQLParser.Savepoint_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(SQLParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#transaction_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_name(SQLParser.Transaction_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#any_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAny_name(SQLParser.Any_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(SQLParser.PropertyContext ctx);
}