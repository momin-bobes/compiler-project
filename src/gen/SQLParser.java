package gen;// Generated from C:/Users/ASUS/Desktop/untitled1123/src\SQL.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, COLON=3, QUESTION=4, T__7=5, LBRACK=6, T__9=7, RBRACK=8, 
		SCOL=9, DOT=10, OPEN_PAR=11, CLOSE_PAR=12, COMMA=13, ASSIGN=14, STAR=15, 
		PLUS=16, MINUS=17, TILDE=18, PIPE2=19, DIV=20, MOD=21, LT2=22, GT2=23, 
		AMP=24, AMP_AMP=25, PIPE=26, LT=27, LT_EQ=28, GT=29, GT_EQ=30, EQ=31, 
		NOT_EQ1=32, NOT_EQ2=33, PLUS_PLUS=34, MINUS_MINUS=35, NOT_EQ3=36, TOW_POINT=37, 
		K_NEW=38, K_TRUE=39, K_FALSE=40, K_VAR=41, K_RETURN=42, K_ABORT=43, K_ACTION=44, 
		K_ADD=45, K_AFTER=46, K_ALL=47, K_ALTER=48, K_ANALYZE=49, K_AND=50, K_AS=51, 
		K_ASC=52, K_ATTACH=53, K_AUTOINCREMENT=54, K_BEFORE=55, K_BEGIN=56, K_BETWEEN=57, 
		K_BY=58, K_CASCADE=59, K_CASE=60, K_CAST=61, K_CHECK=62, K_COLLATE=63, 
		K_COLUMN=64, K_COMMIT=65, K_CONFLICT=66, K_CONSTRAINT=67, K_CREATE=68, 
		K_CROSS=69, K_CURRENT_DATE=70, K_CURRENT_TIME=71, K_CURRENT_TIMESTAMP=72, 
		K_DATABASE=73, K_DEFAULT=74, K_BREAK=75, K_DEFERRABLE=76, K_DEFERRED=77, 
		K_DELETE=78, K_DESC=79, K_DETACH=80, K_DISTINCT=81, K_DROP=82, K_EACH=83, 
		K_ELSE=84, K_END=85, K_ENABLE=86, K_ESCAPE=87, K_EXCEPT=88, K_EXCLUSIVE=89, 
		K_EXISTS=90, K_EXPLAIN=91, K_FAIL=92, K_FOR=93, K_FOREIGN=94, K_FROM=95, 
		K_FULL=96, K_GLOB=97, K_GROUP=98, K_HAVING=99, K_IF=100, K_WHILE=101, 
		K_IGNORE=102, K_IMMEDIATE=103, K_IN=104, K_INDEX=105, K_INDEXED=106, K_INITIALLY=107, 
		K_INNER=108, K_INSERT=109, K_INSTEAD=110, K_INTERSECT=111, K_INTO=112, 
		K_IS=113, K_ISNULL=114, K_JOIN=115, K_KEY=116, K_LEFT=117, K_LIKE=118, 
		K_LIMIT=119, K_MATCH=120, K_NATURAL=121, K_NEXTVAL=122, K_NO=123, K_NOT=124, 
		K_NOTNULL=125, K_NULL=126, K_OF=127, K_OFFSET=128, K_ON=129, K_ONLY=130, 
		K_OR=131, K_ORDER=132, K_OUTER=133, K_PLAN=134, K_PRAGMA=135, K_PRIMARY=136, 
		K_QUERY=137, K_RAISE=138, K_RECURSIVE=139, K_REFERENCES=140, K_REGEXP=141, 
		K_REINDEX=142, K_RELEASE=143, K_RENAME=144, K_REPLACE=145, K_RESTRICT=146, 
		K_RIGHT=147, K_ROLLBACK=148, K_ROW=149, K_SAVEPOINT=150, K_SELECT=151, 
		K_SET=152, K_TABLE=153, K_TEMP=154, K_TEMPORARY=155, K_THEN=156, K_TO=157, 
		K_TRANSACTION=158, K_TRIGGER=159, K_UNION=160, K_UNIQUE=161, K_UPDATE=162, 
		K_USING=163, K_VACUUM=164, K_VALUES=165, K_VIEW=166, K_VIRTUAL=167, K_WHEN=168, 
		K_WHERE=169, K_WITH=170, K_WITHOUT=171, K_SWITCH=172, K_DO=173, K_CONTINUE=174, 
		K_PRINT=175, K_FOREACH=176, K_ARRAY=177, K_FUNCTION=178, IDENTIFIER=179, 
		NUMERIC_LITERAL=180, BIND_PARAMETER=181, STRING_LITERAL=182, BLOB_LITERAL=183, 
		MULTILINE_COMMENT=184, SPACES=185, UNEXPECTED_CHAR=186;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_sql_stmt_list = 2, RULE_sql_stmt = 3, 
		RULE_argument_stmt = 4, RULE_higher_stmt = 5, RULE_higher_stmt1 = 6, RULE_value = 7, 
		RULE_array = 8, RULE_pair = 9, RULE_object1 = 10, RULE_pair_T = 11, RULE_json_stmt = 12, 
		RULE_json_call = 13, RULE_json_call3 = 14, RULE_functiondeclaration = 15, 
		RULE_fun_body = 16, RULE_return_cont2 = 17, RULE_return_contunet = 18, 
		RULE_state_stmt = 19, RULE_role_re_con = 20, RULE_print_content = 21, 
		RULE_rele_if = 22, RULE_else_stmt = 23, RULE_rele_onecond = 24, RULE_expr_or_rele_ifcond = 25, 
		RULE_rele_ifcond = 26, RULE_rele_for = 27, RULE_oprint1 = 28, RULE_namef = 29, 
		RULE_operations = 30, RULE_oprint2 = 31, RULE_oprint3 = 32, RULE_rele_while = 33, 
		RULE_rele_switch = 34, RULE_rele_case1 = 35, RULE_rele_case = 36, RULE_rele_dowhile = 37, 
		RULE_rele_forach = 38, RULE_var_stmt = 39, RULE_array_stmt = 40, RULE_alter_table_stmt = 41, 
		RULE_alter_table_add_constraint = 42, RULE_alter_table_add = 43, RULE_create_table_stmt = 44, 
		RULE_delete_stmt = 45, RULE_drop_table_stmt = 46, RULE_factored_select_stmt = 47, 
		RULE_insert_stmt = 48, RULE_select_stmt = 49, RULE_select_or_values = 50, 
		RULE_update_stmt = 51, RULE_column_def = 52, RULE_type_name = 53, RULE_type_name_real = 54, 
		RULE_column_constraint = 55, RULE_column_constraint_primary_key = 56, 
		RULE_column_constraint_foreign_key = 57, RULE_column_constraint_not_null = 58, 
		RULE_column_constraint_null = 59, RULE_column_default = 60, RULE_column_default_value = 61, 
		RULE_parameter = 62, RULE_varable = 63, RULE_list_var = 64, RULE_expr = 65, 
		RULE_opre_all = 66, RULE_op = 67, RULE_opexp = 68, RULE_kword1 = 69, RULE_existsselect = 70, 
		RULE_exprselect = 71, RULE_select_expr = 72, RULE_identy = 73, RULE_database_name1 = 74, 
		RULE_unary_operator1 = 75, RULE_function_name1 = 76, RULE_foreign_key_clause = 77, 
		RULE_match_name = 78, RULE_fk_target_column_name = 79, RULE_indexed_column = 80, 
		RULE_table_constraint = 81, RULE_table_constraint_primary_key = 82, RULE_table_constraint_foreign_key = 83, 
		RULE_table_constraint_unique = 84, RULE_table_constraint_key = 85, RULE_fk_origin_column_name = 86, 
		RULE_qualified_table_name = 87, RULE_ordering_term = 88, RULE_pragma_value = 89, 
		RULE_common_table_expression = 90, RULE_result_column = 91, RULE_table_or_subquery = 92, 
		RULE_join_clause = 93, RULE_join_operator = 94, RULE_join_constraint = 95, 
		RULE_select_core = 96, RULE_cte_table_name = 97, RULE_signed_number = 98, 
		RULE_literal_value = 99, RULE_unary_operator = 100, RULE_error_message = 101, 
		RULE_module_argument = 102, RULE_column_alias = 103, RULE_keyword = 104, 
		RULE_unknown = 105, RULE_name = 106, RULE_name_x = 107, RULE_function_name = 108, 
		RULE_arry_name = 109, RULE_database_name = 110, RULE_source_table_name = 111, 
		RULE_table_name = 112, RULE_table_or_index_name = 113, RULE_new_table_name = 114, 
		RULE_column_name = 115, RULE_collation_name = 116, RULE_foreign_table = 117, 
		RULE_index_name = 118, RULE_trigger_name = 119, RULE_view_name = 120, 
		RULE_module_name = 121, RULE_pragma_name = 122, RULE_savepoint_name = 123, 
		RULE_table_alias = 124, RULE_transaction_name = 125, RULE_any_name = 126, 
		RULE_property = 127;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "sql_stmt_list", "sql_stmt", "argument_stmt", "higher_stmt", 
			"higher_stmt1", "value", "array", "pair", "object1", "pair_T", "json_stmt", 
			"json_call", "json_call3", "functiondeclaration", "fun_body", "return_cont2", 
			"return_contunet", "state_stmt", "role_re_con", "print_content", "rele_if", 
			"else_stmt", "rele_onecond", "expr_or_rele_ifcond", "rele_ifcond", "rele_for", 
			"oprint1", "namef", "operations", "oprint2", "oprint3", "rele_while", 
			"rele_switch", "rele_case1", "rele_case", "rele_dowhile", "rele_forach", 
			"var_stmt", "array_stmt", "alter_table_stmt", "alter_table_add_constraint", 
			"alter_table_add", "create_table_stmt", "delete_stmt", "drop_table_stmt", 
			"factored_select_stmt", "insert_stmt", "select_stmt", "select_or_values", 
			"update_stmt", "column_def", "type_name", "type_name_real", "column_constraint", 
			"column_constraint_primary_key", "column_constraint_foreign_key", "column_constraint_not_null", 
			"column_constraint_null", "column_default", "column_default_value", "parameter", 
			"varable", "list_var", "expr", "opre_all", "op", "opexp", "kword1", "existsselect", 
			"exprselect", "select_expr", "identy", "database_name1", "unary_operator1", 
			"function_name1", "foreign_key_clause", "match_name", "fk_target_column_name", 
			"indexed_column", "table_constraint", "table_constraint_primary_key", 
			"table_constraint_foreign_key", "table_constraint_unique", "table_constraint_key", 
			"fk_origin_column_name", "qualified_table_name", "ordering_term", "pragma_value", 
			"common_table_expression", "result_column", "table_or_subquery", "join_clause", 
			"join_operator", "join_constraint", "select_core", "cte_table_name", 
			"signed_number", "literal_value", "unary_operator", "error_message", 
			"module_argument", "column_alias", "keyword", "unknown", "name", "name_x", 
			"function_name", "arry_name", "database_name", "source_table_name", "table_name", 
			"table_or_index_name", "new_table_name", "column_name", "collation_name", 
			"foreign_table", "index_name", "trigger_name", "view_name", "module_name", 
			"pragma_name", "savepoint_name", "table_alias", "transaction_name", "any_name", 
			"property"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "':'", "'?'", null, "'['", "'\"'", "']'", "';'", 
			"'.'", "'('", "')'", "','", "'='", "'*'", "'+'", "'-'", "'~'", "'||'", 
			"'/'", "'%'", "'<<'", "'>>'", "'&'", "'&&'", "'|'", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'<>'", "'++'", "'--'", "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "COLON", "QUESTION", null, "LBRACK", null, 
			"RBRACK", "SCOL", "DOT", "OPEN_PAR", "CLOSE_PAR", "COMMA", "ASSIGN", 
			"STAR", "PLUS", "MINUS", "TILDE", "PIPE2", "DIV", "MOD", "LT2", "GT2", 
			"AMP", "AMP_AMP", "PIPE", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ1", 
			"NOT_EQ2", "PLUS_PLUS", "MINUS_MINUS", "NOT_EQ3", "TOW_POINT", "K_NEW", 
			"K_TRUE", "K_FALSE", "K_VAR", "K_RETURN", "K_ABORT", "K_ACTION", "K_ADD", 
			"K_AFTER", "K_ALL", "K_ALTER", "K_ANALYZE", "K_AND", "K_AS", "K_ASC", 
			"K_ATTACH", "K_AUTOINCREMENT", "K_BEFORE", "K_BEGIN", "K_BETWEEN", "K_BY", 
			"K_CASCADE", "K_CASE", "K_CAST", "K_CHECK", "K_COLLATE", "K_COLUMN", 
			"K_COMMIT", "K_CONFLICT", "K_CONSTRAINT", "K_CREATE", "K_CROSS", "K_CURRENT_DATE", 
			"K_CURRENT_TIME", "K_CURRENT_TIMESTAMP", "K_DATABASE", "K_DEFAULT", "K_BREAK", 
			"K_DEFERRABLE", "K_DEFERRED", "K_DELETE", "K_DESC", "K_DETACH", "K_DISTINCT", 
			"K_DROP", "K_EACH", "K_ELSE", "K_END", "K_ENABLE", "K_ESCAPE", "K_EXCEPT", 
			"K_EXCLUSIVE", "K_EXISTS", "K_EXPLAIN", "K_FAIL", "K_FOR", "K_FOREIGN", 
			"K_FROM", "K_FULL", "K_GLOB", "K_GROUP", "K_HAVING", "K_IF", "K_WHILE", 
			"K_IGNORE", "K_IMMEDIATE", "K_IN", "K_INDEX", "K_INDEXED", "K_INITIALLY", 
			"K_INNER", "K_INSERT", "K_INSTEAD", "K_INTERSECT", "K_INTO", "K_IS", 
			"K_ISNULL", "K_JOIN", "K_KEY", "K_LEFT", "K_LIKE", "K_LIMIT", "K_MATCH", 
			"K_NATURAL", "K_NEXTVAL", "K_NO", "K_NOT", "K_NOTNULL", "K_NULL", "K_OF", 
			"K_OFFSET", "K_ON", "K_ONLY", "K_OR", "K_ORDER", "K_OUTER", "K_PLAN", 
			"K_PRAGMA", "K_PRIMARY", "K_QUERY", "K_RAISE", "K_RECURSIVE", "K_REFERENCES", 
			"K_REGEXP", "K_REINDEX", "K_RELEASE", "K_RENAME", "K_REPLACE", "K_RESTRICT", 
			"K_RIGHT", "K_ROLLBACK", "K_ROW", "K_SAVEPOINT", "K_SELECT", "K_SET", 
			"K_TABLE", "K_TEMP", "K_TEMPORARY", "K_THEN", "K_TO", "K_TRANSACTION", 
			"K_TRIGGER", "K_UNION", "K_UNIQUE", "K_UPDATE", "K_USING", "K_VACUUM", 
			"K_VALUES", "K_VIEW", "K_VIRTUAL", "K_WHEN", "K_WHERE", "K_WITH", "K_WITHOUT", 
			"K_SWITCH", "K_DO", "K_CONTINUE", "K_PRINT", "K_FOREACH", "K_ARRAY", 
			"K_FUNCTION", "IDENTIFIER", "NUMERIC_LITERAL", "BIND_PARAMETER", "STRING_LITERAL", 
			"BLOB_LITERAL", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Sql_stmt_listContext> sql_stmt_list() {
			return getRuleContexts(Sql_stmt_listContext.class);
		}
		public Sql_stmt_listContext sql_stmt_list(int i) {
			return getRuleContext(Sql_stmt_listContext.class,i);
		}
		public List<FunctiondeclarationContext> functiondeclaration() {
			return getRuleContexts(FunctiondeclarationContext.class);
		}
		public FunctiondeclarationContext functiondeclaration(int i) {
			return getRuleContext(FunctiondeclarationContext.class,i);
		}
		public List<Var_stmtContext> var_stmt() {
			return getRuleContexts(Var_stmtContext.class);
		}
		public Var_stmtContext var_stmt(int i) {
			return getRuleContext(Var_stmtContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SCOL) | (1L << OPEN_PAR) | (1L << K_VAR) | (1L << K_ALTER))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (K_CREATE - 68)) | (1L << (K_DELETE - 68)) | (1L << (K_DROP - 68)) | (1L << (K_INSERT - 68)))) != 0) || ((((_la - 151)) & ~0x3f) == 0 && ((1L << (_la - 151)) & ((1L << (K_SELECT - 151)) | (1L << (K_UPDATE - 151)) | (1L << (K_VALUES - 151)) | (1L << (IDENTIFIER - 151)) | (1L << (STRING_LITERAL - 151)) | (1L << (UNEXPECTED_CHAR - 151)))) != 0)) {
				{
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(256);
					sql_stmt_list();
					}
					break;
				case 2:
					{
					setState(257);
					functiondeclaration();
					}
					break;
				case 3:
					{
					setState(258);
					var_stmt();
					}
					break;
				case 4:
					{
					setState(259);
					error();
					}
					break;
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmt_listContext extends ParserRuleContext {
		public List<Sql_stmtContext> sql_stmt() {
			return getRuleContexts(Sql_stmtContext.class);
		}
		public Sql_stmtContext sql_stmt(int i) {
			return getRuleContext(Sql_stmtContext.class,i);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Sql_stmt_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmt_listContext sql_stmt_list() throws RecognitionException {
		Sql_stmt_listContext _localctx = new Sql_stmt_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_sql_stmt_list);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SCOL) {
				{
				{
				setState(270);
				match(SCOL);
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			sql_stmt();
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(278); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(277);
						match(SCOL);
						}
						}
						setState(280); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==SCOL );
					setState(282);
					sql_stmt();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(SCOL);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sql_stmtContext extends ParserRuleContext {
		public Alter_table_stmtContext alter_table_stmt() {
			return getRuleContext(Alter_table_stmtContext.class,0);
		}
		public Create_table_stmtContext create_table_stmt() {
			return getRuleContext(Create_table_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Drop_table_stmtContext drop_table_stmt() {
			return getRuleContext(Drop_table_stmtContext.class,0);
		}
		public Factored_select_stmtContext factored_select_stmt() {
			return getRuleContext(Factored_select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Sql_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_stmtContext sql_stmt() throws RecognitionException {
		Sql_stmtContext _localctx = new Sql_stmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sql_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ALTER:
				{
				setState(294);
				alter_table_stmt();
				}
				break;
			case K_CREATE:
				{
				setState(295);
				create_table_stmt();
				}
				break;
			case K_DELETE:
				{
				setState(296);
				delete_stmt();
				}
				break;
			case K_DROP:
				{
				setState(297);
				drop_table_stmt();
				}
				break;
			case K_SELECT:
			case K_VALUES:
				{
				setState(298);
				factored_select_stmt();
				}
				break;
			case K_INSERT:
				{
				setState(299);
				insert_stmt();
				}
				break;
			case K_UPDATE:
				{
				setState(300);
				update_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argument_stmtContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Argument_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArgument_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArgument_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArgument_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argument_stmtContext argument_stmt() throws RecognitionException {
		Argument_stmtContext _localctx = new Argument_stmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_argument_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			function_name();
			setState(304);
			match(OPEN_PAR);
			setState(305);
			expr(0);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(306);
				match(COMMA);
				setState(307);
				expr(0);
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(313);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Higher_stmtContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Arry_nameContext arry_name() {
			return getRuleContext(Arry_nameContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public Higher_stmt1Context higher_stmt1() {
			return getRuleContext(Higher_stmt1Context.class,0);
		}
		public Fun_bodyContext fun_body() {
			return getRuleContext(Fun_bodyContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Higher_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHigher_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHigher_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHigher_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_stmtContext higher_stmt() throws RecognitionException {
		Higher_stmtContext _localctx = new Higher_stmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_higher_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			function_name();
			setState(316);
			match(OPEN_PAR);
			setState(317);
			arry_name();
			setState(318);
			match(COMMA);
			setState(319);
			match(K_FUNCTION);
			setState(320);
			higher_stmt1();
			setState(321);
			fun_body();
			setState(322);
			match(CLOSE_PAR);
			setState(323);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Higher_stmt1Context extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> K_VAR() { return getTokens(SQLParser.K_VAR); }
		public TerminalNode K_VAR(int i) {
			return getToken(SQLParser.K_VAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Higher_stmt1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_higher_stmt1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterHigher_stmt1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitHigher_stmt1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitHigher_stmt1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Higher_stmt1Context higher_stmt1() throws RecognitionException {
		Higher_stmt1Context _localctx = new Higher_stmt1Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_higher_stmt1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(OPEN_PAR);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(326);
				match(K_VAR);
				}
			}

			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_CONTINUE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (NUMERIC_LITERAL - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (BLOB_LITERAL - 174)))) != 0)) {
				{
				setState(329);
				expr(0);
				}
			}

			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(332);
				match(COMMA);
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_VAR) {
					{
					setState(333);
					match(K_VAR);
					}
				}

				setState(336);
				expr(0);
				}
				}
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(342);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Object1Context object1() {
			return getRuleContext(Object1Context.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(346);
				object1();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(SQLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SQLParser.RBRACK, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_array);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(360);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
				case 1:
					{
					setState(349);
					match(LBRACK);
					{
					setState(350);
					value();
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(351);
						match(COMMA);
						setState(352);
						value();
						}
						}
						setState(357);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(358);
					match(RBRACK);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				match(LBRACK);
				setState(363);
				match(RBRACK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pair);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			property();
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(367);
				match(COLON);
				setState(368);
				value();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Object1Context extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Object1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterObject1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitObject1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitObject1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Object1Context object1() throws RecognitionException {
		Object1Context _localctx = new Object1Context(_ctx, getState());
		enterRule(_localctx, 20, RULE_object1);
		int _la;
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE) {
					{
					setState(371);
					match(LBRACE);
					{
					setState(372);
					pair();
					setState(377);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(373);
						match(COMMA);
						setState(374);
						pair();
						}
						}
						setState(379);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					setState(380);
					match(RBRACE);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(384);
				match(LBRACE);
				setState(385);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pair_TContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public Pair_TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair_T; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPair_T(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPair_T(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPair_T(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pair_TContext pair_T() throws RecognitionException {
		Pair_TContext _localctx = new Pair_TContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pair_T);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			match(DOT);
			setState(389);
			pair();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_stmtContext extends ParserRuleContext {
		public Object1Context object1() {
			return getRuleContext(Object1Context.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Pair_TContext pair_T() {
			return getRuleContext(Pair_TContext.class,0);
		}
		public Json_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_stmtContext json_stmt() throws RecognitionException {
		Json_stmtContext _localctx = new Json_stmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_json_stmt);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				object1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				array();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				pair_T();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_callContext extends ParserRuleContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Json_call3Context> json_call3() {
			return getRuleContexts(Json_call3Context.class);
		}
		public Json_call3Context json_call3(int i) {
			return getRuleContext(Json_call3Context.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public Json_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_callContext json_call() throws RecognitionException {
		Json_callContext _localctx = new Json_callContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_json_call);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			property();
			setState(397);
			match(DOT);
			setState(398);
			property();
			setState(402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(399);
					json_call3();
					}
					} 
				}
				setState(404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(405);
				match(ASSIGN);
				setState(406);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==NUMERIC_LITERAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Json_call3Context extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public Json_call3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json_call3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJson_call3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJson_call3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJson_call3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Json_call3Context json_call3() throws RecognitionException {
		Json_call3Context _localctx = new Json_call3Context(_ctx, getState());
		enterRule(_localctx, 28, RULE_json_call3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(409);
			match(DOT);
			setState(410);
			property();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctiondeclarationContext extends ParserRuleContext {
		public ParameterContext parameter() {
			return getRuleContext(ParameterContext.class,0);
		}
		public Fun_bodyContext fun_body() {
			return getRuleContext(Fun_bodyContext.class,0);
		}
		public FunctiondeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functiondeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunctiondeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunctiondeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunctiondeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctiondeclarationContext functiondeclaration() throws RecognitionException {
		FunctiondeclarationContext _localctx = new FunctiondeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_functiondeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(412);
			parameter();
			setState(413);
			fun_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fun_bodyContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<Argument_stmtContext> argument_stmt() {
			return getRuleContexts(Argument_stmtContext.class);
		}
		public Argument_stmtContext argument_stmt(int i) {
			return getRuleContext(Argument_stmtContext.class,i);
		}
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public Fun_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fun_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFun_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFun_body(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFun_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fun_bodyContext fun_body() throws RecognitionException {
		Fun_bodyContext _localctx = new Fun_bodyContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_fun_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(LBRACE);
			setState(422);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
				{
				{
				setState(418);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(416);
					argument_stmt();
					}
					break;
				case 2:
					{
					setState(417);
					state_stmt();
					}
					break;
				}
				}
				}
				setState(424);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(425);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_cont2Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Return_cont2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_cont2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_cont2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_cont2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_cont2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_cont2Context return_cont2() throws RecognitionException {
		Return_cont2Context _localctx = new Return_cont2Context(_ctx, getState());
		enterRule(_localctx, 34, RULE_return_cont2);
		try {
			setState(429);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case DOT:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case NOT_EQ3:
			case K_TRUE:
			case K_FALSE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_BREAK:
			case K_EXISTS:
			case K_NOT:
			case K_NULL:
			case K_CONTINUE:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(427);
				expr(0);
				}
				}
				break;
			case K_SELECT:
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(428);
				select_core();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Return_contunetContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Rele_onecondContext rele_onecond() {
			return getRuleContext(Rele_onecondContext.class,0);
		}
		public Return_contunetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_return_contunet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterReturn_contunet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitReturn_contunet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitReturn_contunet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Return_contunetContext return_contunet() throws RecognitionException {
		Return_contunetContext _localctx = new Return_contunetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_return_contunet);
		try {
			setState(434);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				any_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				rele_onecond();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class State_stmtContext extends ParserRuleContext {
		public Rele_ifContext rele_if() {
			return getRuleContext(Rele_ifContext.class,0);
		}
		public Rele_forContext rele_for() {
			return getRuleContext(Rele_forContext.class,0);
		}
		public Rele_whileContext rele_while() {
			return getRuleContext(Rele_whileContext.class,0);
		}
		public Rele_switchContext rele_switch() {
			return getRuleContext(Rele_switchContext.class,0);
		}
		public Rele_dowhileContext rele_dowhile() {
			return getRuleContext(Rele_dowhileContext.class,0);
		}
		public Rele_forachContext rele_forach() {
			return getRuleContext(Rele_forachContext.class,0);
		}
		public Json_callContext json_call() {
			return getRuleContext(Json_callContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Print_contentContext> print_content() {
			return getRuleContexts(Print_contentContext.class);
		}
		public Print_contentContext print_content(int i) {
			return getRuleContext(Print_contentContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Var_stmtContext var_stmt() {
			return getRuleContext(Var_stmtContext.class,0);
		}
		public Array_stmtContext array_stmt() {
			return getRuleContext(Array_stmtContext.class,0);
		}
		public Rele_onecondContext rele_onecond() {
			return getRuleContext(Rele_onecondContext.class,0);
		}
		public Role_re_conContext role_re_con() {
			return getRuleContext(Role_re_conContext.class,0);
		}
		public State_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterState_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitState_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitState_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_stmtContext state_stmt() throws RecognitionException {
		State_stmtContext _localctx = new State_stmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_state_stmt);
		int _la;
		try {
			setState(467);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				rele_if();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				rele_for();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(438);
				rele_while();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(439);
				rele_switch();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(440);
				rele_dowhile();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(441);
				rele_forach();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(442);
				json_call();
				setState(443);
				match(SCOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(445);
				match(K_PRINT);
				setState(446);
				match(OPEN_PAR);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_CONTINUE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (NUMERIC_LITERAL - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (BLOB_LITERAL - 174)))) != 0)) {
					{
					{
					setState(447);
					print_content();
					}
					}
					setState(452);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(453);
				match(CLOSE_PAR);
				setState(454);
				match(SCOL);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(455);
				expr(0);
				setState(456);
				match(SCOL);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(458);
				var_stmt();
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SCOL) {
					{
					setState(459);
					match(SCOL);
					}
				}

				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(462);
				array_stmt();
				}
				setState(463);
				match(SCOL);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(465);
				rele_onecond();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(466);
				role_re_con();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Role_re_conContext extends ParserRuleContext {
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Return_cont2Context return_cont2() {
			return getRuleContext(Return_cont2Context.class,0);
		}
		public Rele_ifcondContext rele_ifcond() {
			return getRuleContext(Rele_ifcondContext.class,0);
		}
		public List<Return_contunetContext> return_contunet() {
			return getRuleContexts(Return_contunetContext.class);
		}
		public Return_contunetContext return_contunet(int i) {
			return getRuleContext(Return_contunetContext.class,i);
		}
		public Role_re_conContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_role_re_con; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRole_re_con(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRole_re_con(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRole_re_con(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Role_re_conContext role_re_con() throws RecognitionException {
		Role_re_conContext _localctx = new Role_re_conContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_role_re_con);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			match(K_RETURN);
			{
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_CONTINUE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (NUMERIC_LITERAL - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (BLOB_LITERAL - 174)))) != 0)) {
					{
					setState(470);
					rele_ifcond();
					}
				}

				setState(474);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(473);
					match(SCOL);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_CONTINUE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (NUMERIC_LITERAL - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (BLOB_LITERAL - 174)))) != 0)) {
					{
					{
					setState(476);
					return_contunet();
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(484);
			match(SCOL);
			}
			setState(487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(486);
				return_cont2();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Print_contentContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(SQLParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(SQLParser.PLUS, i);
		}
		public Json_callContext json_call() {
			return getRuleContext(Json_callContext.class,0);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(SQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(SQLParser.IDENTIFIER, i);
		}
		public Print_contentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPrint_content(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPrint_content(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPrint_content(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Print_contentContext print_content() throws RecognitionException {
		Print_contentContext _localctx = new Print_contentContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_print_content);
		try {
			int _alt;
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(489);
				expr(0);
				setState(494);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(490);
						match(PLUS);
						setState(491);
						expr(0);
						}
						} 
					}
					setState(496);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(497);
				json_call();
				setState(502);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(498);
						match(PLUS);
						setState(499);
						match(IDENTIFIER);
						}
						} 
					}
					setState(504);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_ifContext extends ParserRuleContext {
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<Else_stmtContext> else_stmt() {
			return getRuleContexts(Else_stmtContext.class);
		}
		public Else_stmtContext else_stmt(int i) {
			return getRuleContext(Else_stmtContext.class,i);
		}
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public Rele_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_ifContext rele_if() throws RecognitionException {
		Rele_ifContext _localctx = new Rele_ifContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_rele_if);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			match(K_IF);
			{
			{
			setState(508);
			match(OPEN_PAR);
			setState(509);
			expr(0);
			setState(510);
			match(CLOSE_PAR);
			}
			setState(521);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(512);
				match(LBRACE);
				setState(516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
					{
					{
					{
					setState(513);
					state_stmt();
					}
					}
					}
					setState(518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(519);
				match(RBRACE);
				}
				break;
			case LBRACK:
			case DOT:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case NOT_EQ3:
			case K_TRUE:
			case K_FALSE:
			case K_VAR:
			case K_RETURN:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_BREAK:
			case K_EXISTS:
			case K_FOR:
			case K_IF:
			case K_WHILE:
			case K_NOT:
			case K_NULL:
			case K_SWITCH:
			case K_DO:
			case K_CONTINUE:
			case K_PRINT:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				{
				{
				setState(520);
				state_stmt();
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(530);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				{
				setState(523);
				else_stmt();
				}
				}
				break;
			case 2:
				{
				setState(527);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(524);
						else_stmt();
						}
						} 
					}
					setState(529);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
				}
				}
				break;
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Else_stmtContext extends ParserRuleContext {
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public Else_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElse_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElse_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElse_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_stmtContext else_stmt() throws RecognitionException {
		Else_stmtContext _localctx = new Else_stmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_else_stmt);
		int _la;
		try {
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(532);
				match(K_ELSE);
				setState(533);
				state_stmt();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(534);
				match(K_ELSE);
				{
				setState(535);
				match(LBRACE);
				setState(539);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
					{
					{
					setState(536);
					state_stmt();
					}
					}
					setState(541);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(542);
				match(RBRACE);
				}
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_onecondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode QUESTION() { return getToken(SQLParser.QUESTION, 0); }
		public List<Expr_or_rele_ifcondContext> expr_or_rele_ifcond() {
			return getRuleContexts(Expr_or_rele_ifcondContext.class);
		}
		public Expr_or_rele_ifcondContext expr_or_rele_ifcond(int i) {
			return getRuleContext(Expr_or_rele_ifcondContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public Rele_onecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_onecond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_onecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_onecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_onecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_onecondContext rele_onecond() throws RecognitionException {
		Rele_onecondContext _localctx = new Rele_onecondContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_rele_onecond);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(545);
				match(K_VAR);
				}
			}

			setState(548);
			expr(0);
			setState(549);
			match(ASSIGN);
			{
			setState(550);
			expr(0);
			setState(551);
			match(QUESTION);
			setState(552);
			expr_or_rele_ifcond();
			setState(553);
			match(COLON);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_CONTINUE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (NUMERIC_LITERAL - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (BLOB_LITERAL - 174)))) != 0)) {
				{
				{
				setState(554);
				expr_or_rele_ifcond();
				}
				}
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(560);
			match(SCOL);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expr_or_rele_ifcondContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Rele_ifcondContext rele_ifcond() {
			return getRuleContext(Rele_ifcondContext.class,0);
		}
		public Expr_or_rele_ifcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_or_rele_ifcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr_or_rele_ifcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr_or_rele_ifcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr_or_rele_ifcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expr_or_rele_ifcondContext expr_or_rele_ifcond() throws RecognitionException {
		Expr_or_rele_ifcondContext _localctx = new Expr_or_rele_ifcondContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_expr_or_rele_ifcond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(562);
				expr(0);
				}
				break;
			case 2:
				{
				setState(563);
				rele_ifcond();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_ifcondContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(SQLParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Rele_ifcondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_ifcond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_ifcond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_ifcond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_ifcond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_ifcondContext rele_ifcond() throws RecognitionException {
		Rele_ifcondContext _localctx = new Rele_ifcondContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_rele_ifcond);
		try {
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(566);
				expr(0);
				setState(567);
				match(QUESTION);
				setState(568);
				expr(0);
				setState(569);
				match(COLON);
				setState(570);
				expr(0);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(572);
				match(OPEN_PAR);
				setState(573);
				expr(0);
				setState(574);
				match(QUESTION);
				setState(575);
				expr(0);
				setState(576);
				match(COLON);
				setState(577);
				expr(0);
				setState(578);
				match(CLOSE_PAR);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_forContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public Oprint1Context oprint1() {
			return getRuleContext(Oprint1Context.class,0);
		}
		public List<TerminalNode> SCOL() { return getTokens(SQLParser.SCOL); }
		public TerminalNode SCOL(int i) {
			return getToken(SQLParser.SCOL, i);
		}
		public Oprint2Context oprint2() {
			return getRuleContext(Oprint2Context.class,0);
		}
		public Oprint3Context oprint3() {
			return getRuleContext(Oprint3Context.class,0);
		}
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public Rele_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_forContext rele_for() throws RecognitionException {
		Rele_forContext _localctx = new Rele_forContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rele_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(K_FOR);
			{
			setState(583);
			oprint1();
			setState(584);
			match(SCOL);
			setState(585);
			oprint2();
			setState(586);
			match(SCOL);
			setState(587);
			oprint3();
			}
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(589);
				match(LBRACE);
				setState(593);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
					{
					{
					setState(590);
					state_stmt();
					}
					}
					setState(595);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(596);
				match(RBRACE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oprint1Context extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<NamefContext> namef() {
			return getRuleContexts(NamefContext.class);
		}
		public NamefContext namef(int i) {
			return getRuleContext(NamefContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public OperationsContext operations() {
			return getRuleContext(OperationsContext.class,0);
		}
		public Oprint1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprint1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOprint1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOprint1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOprint1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oprint1Context oprint1() throws RecognitionException {
		Oprint1Context _localctx = new Oprint1Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_oprint1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(OPEN_PAR);
			setState(601);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(600);
				match(K_VAR);
				}
			}

			setState(603);
			namef();
			setState(605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0)) {
				{
				setState(604);
				operations();
				}
			}

			setState(607);
			match(ASSIGN);
			setState(610);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
			case IDENTIFIER:
			case STRING_LITERAL:
				{
				setState(608);
				namef();
				}
				break;
			case NUMERIC_LITERAL:
				{
				setState(609);
				match(NUMERIC_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamefContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NamefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNamef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNamef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNamef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamefContext namef() throws RecognitionException {
		NamefContext _localctx = new NamefContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_namef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(612);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode PLUS_PLUS() { return getToken(SQLParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SQLParser.MINUS_MINUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public OperationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOperations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOperations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOperations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationsContext operations() throws RecognitionException {
		OperationsContext _localctx = new OperationsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_operations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oprint2Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Oprint2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprint2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOprint2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOprint2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOprint2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oprint2Context oprint2() throws RecognitionException {
		Oprint2Context _localctx = new Oprint2Context(_ctx, getState());
		enterRule(_localctx, 62, RULE_oprint2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(616);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Oprint3Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Oprint3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprint3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOprint3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOprint3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOprint3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Oprint3Context oprint3() throws RecognitionException {
		Oprint3Context _localctx = new Oprint3Context(_ctx, getState());
		enterRule(_localctx, 64, RULE_oprint3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(618);
			expr(0);
			setState(619);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_whileContext extends ParserRuleContext {
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public Rele_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_whileContext rele_while() throws RecognitionException {
		Rele_whileContext _localctx = new Rele_whileContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_rele_while);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			match(K_WHILE);
			setState(622);
			match(OPEN_PAR);
			setState(623);
			expr(0);
			setState(624);
			match(CLOSE_PAR);
			setState(634);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				{
				setState(625);
				match(LBRACE);
				{
				setState(629);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
					{
					{
					setState(626);
					state_stmt();
					}
					}
					setState(631);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				setState(632);
				match(RBRACE);
				}
				}
				}
				break;
			case LBRACK:
			case DOT:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case NOT_EQ3:
			case K_TRUE:
			case K_FALSE:
			case K_VAR:
			case K_RETURN:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_BREAK:
			case K_EXISTS:
			case K_FOR:
			case K_IF:
			case K_WHILE:
			case K_NOT:
			case K_NULL:
			case K_SWITCH:
			case K_DO:
			case K_CONTINUE:
			case K_PRINT:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				{
				setState(633);
				state_stmt();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_switchContext extends ParserRuleContext {
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<Rele_case1Context> rele_case1() {
			return getRuleContexts(Rele_case1Context.class);
		}
		public Rele_case1Context rele_case1(int i) {
			return getRuleContext(Rele_case1Context.class,i);
		}
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public Rele_caseContext rele_case() {
			return getRuleContext(Rele_caseContext.class,0);
		}
		public Rele_switchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_switch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_switch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_switch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_switchContext rele_switch() throws RecognitionException {
		Rele_switchContext _localctx = new Rele_switchContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_rele_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			match(K_SWITCH);
			setState(637);
			match(OPEN_PAR);
			setState(638);
			expr(0);
			setState(639);
			match(CLOSE_PAR);
			setState(640);
			match(LBRACE);
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_CASE) {
				{
				{
				setState(641);
				rele_case1();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DEFAULT) {
				{
				{
				setState(647);
				match(K_DEFAULT);
				setState(648);
				match(COLON);
				setState(649);
				rele_case();
				}
				}
			}

			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
				{
				{
				setState(652);
				state_stmt();
				}
				}
				setState(657);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(658);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_case1Context extends ParserRuleContext {
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public Rele_caseContext rele_case() {
			return getRuleContext(Rele_caseContext.class,0);
		}
		public Rele_case1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_case1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_case1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_case1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_case1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_case1Context rele_case1() throws RecognitionException {
		Rele_case1Context _localctx = new Rele_case1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_rele_case1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			match(K_CASE);
			setState(661);
			expr(0);
			setState(662);
			match(COLON);
			setState(663);
			rele_case();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_caseContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public Rele_caseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_case; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_case(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_case(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_case(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_caseContext rele_case() throws RecognitionException {
		Rele_caseContext _localctx = new Rele_caseContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_rele_case);
		int _la;
		try {
			int _alt;
			setState(679);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(665);
				match(LBRACE);
				setState(669);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
					{
					{
					setState(666);
					state_stmt();
					}
					}
					setState(671);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(672);
				match(RBRACE);
				}
				break;
			case RBRACE:
			case LBRACK:
			case DOT:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case NOT_EQ3:
			case K_TRUE:
			case K_FALSE:
			case K_VAR:
			case K_RETURN:
			case K_CASE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_DEFAULT:
			case K_BREAK:
			case K_EXISTS:
			case K_FOR:
			case K_IF:
			case K_WHILE:
			case K_NOT:
			case K_NULL:
			case K_SWITCH:
			case K_DO:
			case K_CONTINUE:
			case K_PRINT:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(676);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(673);
						state_stmt();
						}
						} 
					}
					setState(678);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_dowhileContext extends ParserRuleContext {
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public Rele_dowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_dowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_dowhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_dowhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_dowhileContext rele_dowhile() throws RecognitionException {
		Rele_dowhileContext _localctx = new Rele_dowhileContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_rele_dowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(K_DO);
			setState(682);
			match(LBRACE);
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
				{
				{
				setState(683);
				state_stmt();
				}
				}
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(689);
			match(RBRACE);
			setState(690);
			match(K_WHILE);
			setState(691);
			match(OPEN_PAR);
			setState(692);
			expr(0);
			setState(693);
			match(CLOSE_PAR);
			setState(694);
			match(SCOL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Rele_forachContext extends ParserRuleContext {
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode COLON() { return getToken(SQLParser.COLON, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<State_stmtContext> state_stmt() {
			return getRuleContexts(State_stmtContext.class);
		}
		public State_stmtContext state_stmt(int i) {
			return getRuleContext(State_stmtContext.class,i);
		}
		public Rele_forachContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rele_forach; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRele_forach(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRele_forach(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRele_forach(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rele_forachContext rele_forach() throws RecognitionException {
		Rele_forachContext _localctx = new Rele_forachContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_rele_forach);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			match(K_FOR);
			setState(697);
			match(OPEN_PAR);
			setState(698);
			expr(0);
			setState(699);
			match(COLON);
			setState(700);
			expr(0);
			setState(701);
			match(CLOSE_PAR);
			setState(710);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACE) {
				{
				setState(702);
				match(LBRACE);
				setState(706);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_FOR - 70)) | (1L << (K_IF - 70)) | (1L << (K_WHILE - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (K_SWITCH - 172)) | (1L << (K_DO - 172)) | (1L << (K_CONTINUE - 172)) | (1L << (K_PRINT - 172)) | (1L << (IDENTIFIER - 172)) | (1L << (NUMERIC_LITERAL - 172)) | (1L << (STRING_LITERAL - 172)) | (1L << (BLOB_LITERAL - 172)))) != 0)) {
					{
					{
					setState(703);
					state_stmt();
					}
					}
					setState(708);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(709);
				match(RBRACE);
				}
			}

			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(712);
					state_stmt();
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_stmtContext extends ParserRuleContext {
		public Name_xContext name_x() {
			return getRuleContext(Name_xContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SCOL() { return getToken(SQLParser.SCOL, 0); }
		public Argument_stmtContext argument_stmt() {
			return getRuleContext(Argument_stmtContext.class,0);
		}
		public List<Select_coreContext> select_core() {
			return getRuleContexts(Select_coreContext.class);
		}
		public Select_coreContext select_core(int i) {
			return getRuleContext(Select_coreContext.class,i);
		}
		public Higher_stmtContext higher_stmt() {
			return getRuleContext(Higher_stmtContext.class,0);
		}
		public Json_stmtContext json_stmt() {
			return getRuleContext(Json_stmtContext.class,0);
		}
		public Var_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVar_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVar_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVar_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_stmtContext var_stmt() throws RecognitionException {
		Var_stmtContext _localctx = new Var_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_var_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(718);
				match(K_VAR);
				}
			}

			{
			setState(721);
			name_x();
			}
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(723);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
				case 1:
					{
					setState(722);
					match(ASSIGN);
					}
					break;
				}
				setState(730);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					{
					setState(725);
					argument_stmt();
					}
					}
					break;
				case 2:
					{
					setState(726);
					expr(0);
					}
					break;
				case 3:
					{
					{
					setState(727);
					select_core();
					}
					}
					break;
				case 4:
					{
					{
					setState(728);
					higher_stmt();
					}
					}
					break;
				case 5:
					{
					{
					setState(729);
					json_stmt();
					}
					}
					break;
				}
				setState(733);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(732);
					match(SCOL);
					}
					break;
				}
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(735);
					match(ASSIGN);
					{
					setState(736);
					select_core();
					}
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Array_stmtContext extends ParserRuleContext {
		public Name_xContext name_x() {
			return getRuleContext(Name_xContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(SQLParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(SQLParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(SQLParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(SQLParser.RBRACK, i);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public Function_name1Context function_name1() {
			return getRuleContext(Function_name1Context.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(SQLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(SQLParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Array_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArray_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArray_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArray_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_stmtContext array_stmt() throws RecognitionException {
		Array_stmtContext _localctx = new Array_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_array_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(742);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(741);
				match(K_VAR);
				}
			}

			setState(744);
			name_x();
			setState(745);
			match(LBRACK);
			setState(746);
			match(RBRACK);
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(747);
				match(ASSIGN);
				setState(776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(771);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LBRACE:
						{
						{
						setState(748);
						match(LBRACE);
						setState(757);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LBRACK) | (1L << DOT) | (1L << OPEN_PAR) | (1L << PLUS) | (1L << MINUS) | (1L << TILDE) | (1L << PLUS_PLUS) | (1L << MINUS_MINUS) | (1L << NOT_EQ3) | (1L << K_TRUE) | (1L << K_FALSE))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_BREAK - 70)) | (1L << (K_EXISTS - 70)) | (1L << (K_NOT - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & ((1L << (K_CONTINUE - 174)) | (1L << (IDENTIFIER - 174)) | (1L << (NUMERIC_LITERAL - 174)) | (1L << (STRING_LITERAL - 174)) | (1L << (BLOB_LITERAL - 174)))) != 0)) {
							{
							setState(749);
							expr(0);
							setState(754);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==COMMA) {
								{
								{
								setState(750);
								match(COMMA);
								setState(751);
								expr(0);
								}
								}
								setState(756);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(759);
						match(RBRACE);
						}
						}
						break;
					case LBRACK:
						{
						setState(760);
						match(LBRACK);
						{
						setState(761);
						expr(0);
						setState(766);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(762);
							match(COMMA);
							setState(763);
							expr(0);
							}
							}
							setState(768);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						setState(769);
						match(RBRACK);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					break;
				case 2:
					{
					{
					setState(773);
					select_core();
					}
					}
					break;
				case 3:
					{
					{
					setState(774);
					function_name1();
					}
					}
					break;
				case 4:
					{
					{
					setState(775);
					expr(0);
					}
					}
					break;
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Source_table_nameContext source_table_name() {
			return getRuleContext(Source_table_nameContext.class,0);
		}
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public New_table_nameContext new_table_name() {
			return getRuleContext(New_table_nameContext.class,0);
		}
		public Alter_table_addContext alter_table_add() {
			return getRuleContext(Alter_table_addContext.class,0);
		}
		public Alter_table_add_constraintContext alter_table_add_constraint() {
			return getRuleContext(Alter_table_add_constraintContext.class,0);
		}
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public Alter_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_stmtContext alter_table_stmt() throws RecognitionException {
		Alter_table_stmtContext _localctx = new Alter_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_alter_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			match(K_ALTER);
			setState(781);
			match(K_TABLE);
			setState(785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(782);
				database_name();
				setState(783);
				match(DOT);
				}
				break;
			}
			setState(787);
			source_table_name();
			setState(798);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(788);
				match(K_RENAME);
				setState(789);
				match(K_TO);
				setState(790);
				new_table_name();
				}
				break;
			case 2:
				{
				setState(791);
				alter_table_add();
				}
				break;
			case 3:
				{
				setState(792);
				alter_table_add_constraint();
				}
				break;
			case 4:
				{
				setState(793);
				match(K_ADD);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_COLUMN) {
					{
					setState(794);
					match(K_COLUMN);
					}
				}

				setState(797);
				column_def();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_add_constraintContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_add_constraintContext alter_table_add_constraint() throws RecognitionException {
		Alter_table_add_constraintContext _localctx = new Alter_table_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_alter_table_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(K_ADD);
			setState(801);
			match(K_CONSTRAINT);
			setState(802);
			any_name();
			setState(803);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alter_table_addContext extends ParserRuleContext {
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public Table_constraintContext table_constraint() {
			return getRuleContext(Table_constraintContext.class,0);
		}
		public Alter_table_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_table_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_table_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_table_add(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_table_add(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_table_addContext alter_table_add() throws RecognitionException {
		Alter_table_addContext _localctx = new Alter_table_addContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_alter_table_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(805);
			match(K_ADD);
			setState(806);
			table_constraint();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Create_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_defContext> column_def() {
			return getRuleContexts(Column_defContext.class);
		}
		public Column_defContext column_def(int i) {
			return getRuleContext(Column_defContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public List<Table_constraintContext> table_constraint() {
			return getRuleContexts(Table_constraintContext.class);
		}
		public Table_constraintContext table_constraint(int i) {
			return getRuleContext(Table_constraintContext.class,i);
		}
		public Create_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_table_stmtContext create_table_stmt() throws RecognitionException {
		Create_table_stmtContext _localctx = new Create_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_create_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(K_CREATE);
			setState(809);
			match(K_TABLE);
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(810);
				match(K_IF);
				setState(811);
				match(K_NOT);
				setState(812);
				match(K_EXISTS);
				}
			}

			setState(818);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(815);
				database_name();
				setState(816);
				match(DOT);
				}
				break;
			}
			setState(820);
			table_name();
			setState(836);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				{
				setState(821);
				match(OPEN_PAR);
				setState(822);
				column_def();
				setState(829);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					setState(827);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						setState(823);
						match(COMMA);
						setState(824);
						table_constraint();
						}
						break;
					case 2:
						{
						setState(825);
						match(COMMA);
						setState(826);
						column_def();
						}
						break;
					}
					}
					setState(831);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(832);
				match(CLOSE_PAR);
				}
				break;
			case K_AS:
				{
				setState(834);
				match(K_AS);
				setState(835);
				select_stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_delete_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(838);
			match(K_DELETE);
			setState(839);
			match(K_FROM);
			setState(840);
			qualified_table_name();
			setState(843);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(841);
				match(K_WHERE);
				setState(842);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Drop_table_stmtContext extends ParserRuleContext {
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Drop_table_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_table_stmtContext drop_table_stmt() throws RecognitionException {
		Drop_table_stmtContext _localctx = new Drop_table_stmtContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_drop_table_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(845);
			match(K_DROP);
			setState(846);
			match(K_TABLE);
			setState(849);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_IF) {
				{
				setState(847);
				match(K_IF);
				setState(848);
				match(K_EXISTS);
				}
			}

			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(851);
				database_name();
				setState(852);
				match(DOT);
				}
				break;
			}
			setState(856);
			table_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Factored_select_stmtContext extends ParserRuleContext {
		public Select_coreContext select_core() {
			return getRuleContext(Select_coreContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Factored_select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factored_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFactored_select_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFactored_select_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFactored_select_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Factored_select_stmtContext factored_select_stmt() throws RecognitionException {
		Factored_select_stmtContext _localctx = new Factored_select_stmtContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_factored_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(858);
			select_core();
			setState(869);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(859);
				match(K_ORDER);
				setState(860);
				match(K_BY);
				setState(861);
				ordering_term();
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(862);
					match(COMMA);
					setState(863);
					ordering_term();
					}
					}
					setState(868);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(877);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(871);
				match(K_LIMIT);
				setState(872);
				expr(0);
				setState(875);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(873);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(874);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_insert_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(879);
			match(K_INSERT);
			setState(880);
			match(K_INTO);
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				{
				setState(881);
				database_name();
				setState(882);
				match(DOT);
				}
				break;
			}
			setState(886);
			table_name();
			setState(898);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(887);
				match(OPEN_PAR);
				setState(888);
				column_name();
				setState(893);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(889);
					match(COMMA);
					setState(890);
					column_name();
					}
					}
					setState(895);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(896);
				match(CLOSE_PAR);
				}
			}

			setState(931);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(900);
				match(K_VALUES);
				setState(901);
				match(OPEN_PAR);
				setState(902);
				expr(0);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(903);
					match(COMMA);
					setState(904);
					expr(0);
					}
					}
					setState(909);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(910);
				match(CLOSE_PAR);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(911);
					match(COMMA);
					setState(912);
					match(OPEN_PAR);
					setState(913);
					expr(0);
					setState(918);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(914);
						match(COMMA);
						setState(915);
						expr(0);
						}
						}
						setState(920);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(921);
					match(CLOSE_PAR);
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(928);
				select_stmt();
				}
				break;
			case 3:
				{
				setState(929);
				match(K_DEFAULT);
				setState(930);
				match(K_VALUES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_stmtContext extends ParserRuleContext {
		public Select_or_valuesContext select_or_values() {
			return getRuleContext(Select_or_valuesContext.class,0);
		}
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public List<Ordering_termContext> ordering_term() {
			return getRuleContexts(Ordering_termContext.class);
		}
		public Ordering_termContext ordering_term(int i) {
			return getRuleContext(Ordering_termContext.class,i);
		}
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(933);
			select_or_values();
			setState(944);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ORDER) {
				{
				setState(934);
				match(K_ORDER);
				setState(935);
				match(K_BY);
				setState(936);
				ordering_term();
				setState(941);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(937);
					match(COMMA);
					setState(938);
					ordering_term();
					}
					}
					setState(943);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_LIMIT) {
				{
				setState(946);
				match(K_LIMIT);
				setState(947);
				expr(0);
				setState(950);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==K_OFFSET) {
					{
					setState(948);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==K_OFFSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(949);
					expr(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_or_valuesContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_or_valuesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_or_values; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_or_values(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_or_values(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_or_values(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_or_valuesContext select_or_values() throws RecognitionException {
		Select_or_valuesContext _localctx = new Select_or_valuesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_select_or_values);
		int _la;
		try {
			setState(1028);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(954);
				match(K_SELECT);
				setState(956);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(955);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(958);
				result_column();
				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(959);
					match(COMMA);
					setState(960);
					result_column();
					}
					}
					setState(965);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(978);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(966);
					match(K_FROM);
					setState(976);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
					case 1:
						{
						setState(967);
						table_or_subquery();
						setState(972);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(968);
							match(COMMA);
							setState(969);
							table_or_subquery();
							}
							}
							setState(974);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(975);
						join_clause();
						}
						break;
					}
					}
				}

				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(980);
					match(K_WHERE);
					setState(981);
					expr(0);
					}
				}

				setState(998);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(984);
					match(K_GROUP);
					setState(985);
					match(K_BY);
					setState(986);
					expr(0);
					setState(991);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(987);
						match(COMMA);
						setState(988);
						expr(0);
						}
						}
						setState(993);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(996);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(994);
						match(K_HAVING);
						setState(995);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1000);
				match(K_VALUES);
				setState(1001);
				match(OPEN_PAR);
				setState(1002);
				expr(0);
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1003);
					match(COMMA);
					setState(1004);
					expr(0);
					}
					}
					setState(1009);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1010);
				match(CLOSE_PAR);
				setState(1025);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1011);
					match(COMMA);
					setState(1012);
					match(OPEN_PAR);
					setState(1013);
					expr(0);
					setState(1018);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1014);
						match(COMMA);
						setState(1015);
						expr(0);
						}
						}
						setState(1020);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1021);
					match(CLOSE_PAR);
					}
					}
					setState(1027);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public Qualified_table_nameContext qualified_table_name() {
			return getRuleContext(Qualified_table_nameContext.class,0);
		}
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(SQLParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(SQLParser.ASSIGN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_update_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1030);
			match(K_UPDATE);
			setState(1031);
			qualified_table_name();
			setState(1032);
			match(K_SET);
			setState(1033);
			column_name();
			setState(1034);
			match(ASSIGN);
			setState(1035);
			expr(0);
			setState(1043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1036);
				match(COMMA);
				setState(1037);
				column_name();
				setState(1038);
				match(ASSIGN);
				setState(1039);
				expr(0);
				}
				}
				setState(1045);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_WHERE) {
				{
				setState(1046);
				match(K_WHERE);
				setState(1047);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Column_constraintContext> column_constraint() {
			return getRuleContexts(Column_constraintContext.class);
		}
		public Column_constraintContext column_constraint(int i) {
			return getRuleContext(Column_constraintContext.class,i);
		}
		public List<Type_nameContext> type_name() {
			return getRuleContexts(Type_nameContext.class);
		}
		public Type_nameContext type_name(int i) {
			return getRuleContext(Type_nameContext.class,i);
		}
		public Column_defContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_def; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_def(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_def(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_def(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defContext column_def() throws RecognitionException {
		Column_defContext _localctx = new Column_defContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_column_def);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1050);
			column_name();
			setState(1055);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1053);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case K_CHECK:
					case K_COLLATE:
					case K_CONSTRAINT:
					case K_DEFAULT:
					case K_NOT:
					case K_NULL:
					case K_PRIMARY:
					case K_REFERENCES:
						{
						setState(1051);
						column_constraint();
						}
						break;
					case OPEN_PAR:
					case IDENTIFIER:
					case STRING_LITERAL:
						{
						setState(1052);
						type_name();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,120,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Type_name_realContext> type_name_real() {
			return getRuleContexts(Type_name_realContext.class);
		}
		public Type_name_realContext type_name_real(int i) {
			return getRuleContext(Type_name_realContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Type_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_nameContext type_name() throws RecognitionException {
		Type_nameContext _localctx = new Type_nameContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_type_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1058);
			name();
			setState(1069);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				{
				setState(1059);
				match(OPEN_PAR);
				setState(1060);
				type_name_real();
				setState(1061);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1063);
				match(OPEN_PAR);
				setState(1064);
				type_name_real();
				setState(1065);
				match(COMMA);
				setState(1066);
				type_name_real();
				setState(1067);
				match(CLOSE_PAR);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Type_name_realContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Type_name_realContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type_name_real; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterType_name_real(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitType_name_real(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitType_name_real(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Type_name_realContext type_name_real() throws RecognitionException {
		Type_name_realContext _localctx = new Type_name_realContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_type_name_real);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1071);
			signed_number();
			setState(1073);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1072);
				any_name();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraintContext extends ParserRuleContext {
		public Column_constraint_primary_keyContext column_constraint_primary_key() {
			return getRuleContext(Column_constraint_primary_keyContext.class,0);
		}
		public Column_constraint_foreign_keyContext column_constraint_foreign_key() {
			return getRuleContext(Column_constraint_foreign_keyContext.class,0);
		}
		public Column_constraint_not_nullContext column_constraint_not_null() {
			return getRuleContext(Column_constraint_not_nullContext.class,0);
		}
		public Column_constraint_nullContext column_constraint_null() {
			return getRuleContext(Column_constraint_nullContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Column_defaultContext column_default() {
			return getRuleContext(Column_defaultContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Column_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraintContext column_constraint() throws RecognitionException {
		Column_constraintContext _localctx = new Column_constraintContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_column_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1075);
				match(K_CONSTRAINT);
				setState(1076);
				name();
				}
			}

			setState(1091);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1079);
				column_constraint_primary_key();
				}
				break;
			case K_REFERENCES:
				{
				setState(1080);
				column_constraint_foreign_key();
				}
				break;
			case K_NOT:
				{
				setState(1081);
				column_constraint_not_null();
				}
				break;
			case K_NULL:
				{
				setState(1082);
				column_constraint_null();
				}
				break;
			case K_CHECK:
				{
				setState(1083);
				match(K_CHECK);
				setState(1084);
				match(OPEN_PAR);
				setState(1085);
				expr(0);
				setState(1086);
				match(CLOSE_PAR);
				}
				break;
			case K_DEFAULT:
				{
				setState(1088);
				column_default();
				}
				break;
			case K_COLLATE:
				{
				setState(1089);
				match(K_COLLATE);
				setState(1090);
				collation_name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Column_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_primary_keyContext column_constraint_primary_key() throws RecognitionException {
		Column_constraint_primary_keyContext _localctx = new Column_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_column_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1093);
			match(K_PRIMARY);
			setState(1094);
			match(K_KEY);
			setState(1096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1095);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1099);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_AUTOINCREMENT) {
				{
				setState(1098);
				match(K_AUTOINCREMENT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_foreign_keyContext extends ParserRuleContext {
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public Column_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_foreign_keyContext column_constraint_foreign_key() throws RecognitionException {
		Column_constraint_foreign_keyContext _localctx = new Column_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_column_constraint_foreign_key);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_not_nullContext extends ParserRuleContext {
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_not_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_not_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_not_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_not_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_not_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_not_nullContext column_constraint_not_null() throws RecognitionException {
		Column_constraint_not_nullContext _localctx = new Column_constraint_not_nullContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_column_constraint_not_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(K_NOT);
			setState(1104);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_constraint_nullContext extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public Column_constraint_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_constraint_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_constraint_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_constraint_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_constraint_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_constraint_nullContext column_constraint_null() throws RecognitionException {
		Column_constraint_nullContext _localctx = new Column_constraint_nullContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_column_constraint_null);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1106);
			match(K_NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_defaultContext extends ParserRuleContext {
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public Column_default_valueContext column_default_value() {
			return getRuleContext(Column_default_valueContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public List<Any_nameContext> any_name() {
			return getRuleContexts(Any_nameContext.class);
		}
		public Any_nameContext any_name(int i) {
			return getRuleContext(Any_nameContext.class,i);
		}
		public TerminalNode TOW_POINT() { return getToken(SQLParser.TOW_POINT, 0); }
		public Column_defaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_defaultContext column_default() throws RecognitionException {
		Column_defaultContext _localctx = new Column_defaultContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_column_default);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1108);
			match(K_DEFAULT);
			setState(1120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				{
				setState(1109);
				column_default_value();
				}
				break;
			case 2:
				{
				setState(1110);
				match(OPEN_PAR);
				setState(1111);
				expr(0);
				setState(1112);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(1114);
				match(K_NEXTVAL);
				setState(1115);
				match(OPEN_PAR);
				setState(1116);
				expr(0);
				setState(1117);
				match(CLOSE_PAR);
				}
				break;
			case 4:
				{
				setState(1119);
				any_name();
				}
				break;
			}
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TOW_POINT) {
				{
				setState(1122);
				match(TOW_POINT);
				setState(1124); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(1123);
						any_name();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(1126); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_default_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public Column_default_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_default_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_default_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_default_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_default_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_default_valueContext column_default_value() throws RecognitionException {
		Column_default_valueContext _localctx = new Column_default_valueContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_column_default_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				{
				setState(1130);
				signed_number();
				}
				break;
			case 2:
				{
				setState(1131);
				literal_value();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public VarableContext varable() {
			return getRuleContext(VarableContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			{
			setState(1134);
			function_name();
			setState(1135);
			match(OPEN_PAR);
			setState(1137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR || _la==K_VAR || _la==K_DISTINCT || _la==IDENTIFIER || _la==STRING_LITERAL) {
				{
				setState(1136);
				varable();
				}
			}

			setState(1139);
			match(CLOSE_PAR);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarableContext extends ParserRuleContext {
		public Name_xContext name_x() {
			return getRuleContext(Name_xContext.class,0);
		}
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<List_varContext> list_var() {
			return getRuleContexts(List_varContext.class);
		}
		public List_varContext list_var(int i) {
			return getRuleContext(List_varContext.class,i);
		}
		public VarableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterVarable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitVarable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitVarable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarableContext varable() throws RecognitionException {
		VarableContext _localctx = new VarableContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_varable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_DISTINCT) {
				{
				setState(1141);
				match(K_DISTINCT);
				}
			}

			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1144);
				match(K_VAR);
				}
			}

			{
			setState(1147);
			name_x();
			}
			setState(1150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1148);
				match(ASSIGN);
				setState(1149);
				expr(0);
				}
			}

			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1152);
				list_var();
				}
				}
				setState(1157);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class List_varContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public Name_xContext name_x() {
			return getRuleContext(Name_xContext.class,0);
		}
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterList_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitList_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitList_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_varContext list_var() throws RecognitionException {
		List_varContext _localctx = new List_varContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_list_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1158);
			match(COMMA);
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_VAR) {
				{
				setState(1159);
				match(K_VAR);
				}
			}

			setState(1162);
			name_x();
			setState(1165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(1163);
				match(ASSIGN);
				setState(1164);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public Literal_valueContext literal_value() {
			return getRuleContext(Literal_valueContext.class,0);
		}
		public IdentyContext identy() {
			return getRuleContext(IdentyContext.class,0);
		}
		public Unary_operator1Context unary_operator1() {
			return getRuleContext(Unary_operator1Context.class,0);
		}
		public Database_name1Context database_name1() {
			return getRuleContext(Database_name1Context.class,0);
		}
		public Function_name1Context function_name1() {
			return getRuleContext(Function_name1Context.class,0);
		}
		public OpexpContext opexp() {
			return getRuleContext(OpexpContext.class,0);
		}
		public Kword1Context kword1() {
			return getRuleContext(Kword1Context.class,0);
		}
		public TerminalNode PLUS_PLUS() { return getToken(SQLParser.PLUS_PLUS, 0); }
		public TerminalNode MINUS_MINUS() { return getToken(SQLParser.MINUS_MINUS, 0); }
		public ExistsselectContext existsselect() {
			return getRuleContext(ExistsselectContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode LBRACK() { return getToken(SQLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(SQLParser.RBRACK, 0); }
		public Opre_allContext opre_all() {
			return getRuleContext(Opre_allContext.class,0);
		}
		public List<OpContext> op() {
			return getRuleContexts(OpContext.class);
		}
		public OpContext op(int i) {
			return getRuleContext(OpContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public ExprselectContext exprselect() {
			return getRuleContext(ExprselectContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 130;
		enterRecursionRule(_localctx, 130, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				{
				setState(1168);
				literal_value();
				}
				break;
			case 2:
				{
				setState(1169);
				identy();
				}
				break;
			case 3:
				{
				setState(1170);
				unary_operator1();
				}
				break;
			case 4:
				{
				setState(1171);
				database_name1();
				}
				break;
			case 5:
				{
				setState(1172);
				function_name1();
				}
				break;
			case 6:
				{
				setState(1173);
				opexp();
				}
				break;
			case 7:
				{
				setState(1174);
				kword1();
				}
				break;
			case 8:
				{
				setState(1177);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_PLUS:
					{
					{
					setState(1175);
					match(PLUS_PLUS);
					}
					}
					break;
				case MINUS_MINUS:
					{
					{
					setState(1176);
					match(MINUS_MINUS);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 9:
				{
				setState(1179);
				existsselect();
				}
				break;
			case 10:
				{
				setState(1180);
				match(OPEN_PAR);
				setState(1181);
				expr(0);
				setState(1182);
				match(CLOSE_PAR);
				}
				break;
			case 11:
				{
				setState(1184);
				match(LBRACK);
				setState(1185);
				expr(0);
				setState(1186);
				match(RBRACK);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1208);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1190);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1191);
						opre_all();
						setState(1192);
						expr(11);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1194);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1198);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1195);
								op();
								}
								} 
							}
							setState(1200);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,140,_ctx);
						}
						setState(1201);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1202);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1203);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1204);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1205);
						_la = _input.LA(1);
						if ( !(_la==PLUS_PLUS || _la==MINUS_MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(1206);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1207);
						exprselect();
						}
						break;
					}
					} 
				}
				setState(1212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Opre_allContext extends ParserRuleContext {
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode ASSIGN() { return getToken(SQLParser.ASSIGN, 0); }
		public TerminalNode EQ() { return getToken(SQLParser.EQ, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode LT() { return getToken(SQLParser.LT, 0); }
		public TerminalNode LT_EQ() { return getToken(SQLParser.LT_EQ, 0); }
		public TerminalNode GT() { return getToken(SQLParser.GT, 0); }
		public TerminalNode GT_EQ() { return getToken(SQLParser.GT_EQ, 0); }
		public TerminalNode LT2() { return getToken(SQLParser.LT2, 0); }
		public TerminalNode GT2() { return getToken(SQLParser.GT2, 0); }
		public TerminalNode AMP() { return getToken(SQLParser.AMP, 0); }
		public TerminalNode PIPE() { return getToken(SQLParser.PIPE, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(SQLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode AMP_AMP() { return getToken(SQLParser.AMP_AMP, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public Opre_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opre_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOpre_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOpre_all(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOpre_all(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Opre_allContext opre_all() throws RecognitionException {
		Opre_allContext _localctx = new Opre_allContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_opre_all);
		int _la;
		try {
			setState(1236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1213);
				match(K_OR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1214);
				match(K_AND);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1227);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1215);
					match(ASSIGN);
					}
					break;
				case 2:
					{
					setState(1216);
					match(EQ);
					}
					break;
				case 3:
					{
					setState(1217);
					match(NOT_EQ1);
					}
					break;
				case 4:
					{
					setState(1218);
					match(NOT_EQ2);
					}
					break;
				case 5:
					{
					setState(1219);
					match(K_IS);
					}
					break;
				case 6:
					{
					setState(1220);
					match(K_IS);
					setState(1221);
					match(K_NOT);
					}
					break;
				case 7:
					{
					setState(1222);
					match(K_IN);
					}
					break;
				case 8:
					{
					setState(1223);
					match(K_LIKE);
					}
					break;
				case 9:
					{
					setState(1224);
					match(K_GLOB);
					}
					break;
				case 10:
					{
					setState(1225);
					match(K_MATCH);
					}
					break;
				case 11:
					{
					setState(1226);
					match(K_REGEXP);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1229);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << LT_EQ) | (1L << GT) | (1L << GT_EQ))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1230);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT2) | (1L << GT2) | (1L << AMP) | (1L << PIPE))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1231);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1232);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STAR) | (1L << DIV) | (1L << MOD))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1233);
				match(AMP_AMP);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1234);
				match(PIPE2);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1235);
				match(ASSIGN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpContext extends ParserRuleContext {
		public TerminalNode AMP_AMP() { return getToken(SQLParser.AMP_AMP, 0); }
		public TerminalNode PIPE2() { return getToken(SQLParser.PIPE2, 0); }
		public TerminalNode NOT_EQ1() { return getToken(SQLParser.NOT_EQ1, 0); }
		public TerminalNode NOT_EQ2() { return getToken(SQLParser.NOT_EQ2, 0); }
		public TerminalNode NOT_EQ3() { return getToken(SQLParser.NOT_EQ3, 0); }
		public OpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpContext op() throws RecognitionException {
		OpContext _localctx = new OpContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PIPE2) | (1L << AMP_AMP) | (1L << NOT_EQ1) | (1L << NOT_EQ2) | (1L << NOT_EQ3))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OpexpContext extends ParserRuleContext {
		public TerminalNode NOT_EQ3() { return getToken(SQLParser.NOT_EQ3, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public OpexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOpexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOpexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOpexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpexpContext opexp() throws RecognitionException {
		OpexpContext _localctx = new OpexpContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_opexp);
		try {
			setState(1244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT_EQ3:
				enterOuterAlt(_localctx, 1);
				{
				setState(1240);
				match(NOT_EQ3);
				setState(1241);
				expr(0);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1242);
				match(DOT);
				setState(1243);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Kword1Context extends ParserRuleContext {
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public Kword1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kword1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKword1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKword1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKword1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Kword1Context kword1() throws RecognitionException {
		Kword1Context _localctx = new Kword1Context(_ctx, getState());
		enterRule(_localctx, 138, RULE_kword1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1246);
			_la = _input.LA(1);
			if ( !(((((_la - 39)) & ~0x3f) == 0 && ((1L << (_la - 39)) & ((1L << (K_TRUE - 39)) | (1L << (K_FALSE - 39)) | (1L << (K_BREAK - 39)))) != 0) || _la==K_NULL || _la==K_CONTINUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExistsselectContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public ExistsselectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_existsselect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExistsselect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExistsselect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExistsselect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExistsselectContext existsselect() throws RecognitionException {
		ExistsselectContext _localctx = new ExistsselectContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_existsselect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_EXISTS || _la==K_NOT) {
				{
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1248);
					match(K_NOT);
					}
				}

				setState(1251);
				match(K_EXISTS);
				}
			}

			setState(1254);
			match(OPEN_PAR);
			setState(1255);
			select_stmt();
			setState(1256);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprselectContext extends ParserRuleContext {
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public Select_exprContext select_expr() {
			return getRuleContext(Select_exprContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public ExprselectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprselect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterExprselect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitExprselect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitExprselect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprselectContext exprselect() throws RecognitionException {
		ExprselectContext _localctx = new ExprselectContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_exprselect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_NOT) {
				{
				setState(1258);
				match(K_NOT);
				}
			}

			setState(1261);
			match(K_IN);
			setState(1262);
			select_expr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_exprContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_exprContext select_expr() throws RecognitionException {
		Select_exprContext _localctx = new Select_exprContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_select_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
			case 1:
				{
				setState(1264);
				match(OPEN_PAR);
				setState(1274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case K_SELECT:
				case K_VALUES:
					{
					setState(1265);
					select_stmt();
					}
					break;
				case LBRACK:
				case DOT:
				case OPEN_PAR:
				case PLUS:
				case MINUS:
				case TILDE:
				case PLUS_PLUS:
				case MINUS_MINUS:
				case NOT_EQ3:
				case K_TRUE:
				case K_FALSE:
				case K_CURRENT_DATE:
				case K_CURRENT_TIME:
				case K_CURRENT_TIMESTAMP:
				case K_BREAK:
				case K_EXISTS:
				case K_NOT:
				case K_NULL:
				case K_CONTINUE:
				case IDENTIFIER:
				case NUMERIC_LITERAL:
				case STRING_LITERAL:
				case BLOB_LITERAL:
					{
					setState(1266);
					expr(0);
					setState(1271);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1267);
						match(COMMA);
						setState(1268);
						expr(0);
						}
						}
						setState(1273);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case CLOSE_PAR:
					break;
				default:
					break;
				}
				setState(1276);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1280);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1277);
					database_name();
					setState(1278);
					match(DOT);
					}
					break;
				}
				setState(1282);
				table_name();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public IdentyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIdenty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIdenty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIdenty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentyContext identy() throws RecognitionException {
		IdentyContext _localctx = new IdentyContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_identy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_name1Context extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public List<Table_nameContext> table_name() {
			return getRuleContexts(Table_nameContext.class);
		}
		public Table_nameContext table_name(int i) {
			return getRuleContext(Table_nameContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SQLParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SQLParser.DOT, i);
		}
		public List<Database_nameContext> database_name() {
			return getRuleContexts(Database_nameContext.class);
		}
		public Database_nameContext database_name(int i) {
			return getRuleContext(Database_nameContext.class,i);
		}
		public Database_name1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_name1Context database_name1() throws RecognitionException {
		Database_name1Context _localctx = new Database_name1Context(_ctx, getState());
		enterRule(_localctx, 148, RULE_database_name1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
					case 1:
						{
						setState(1287);
						database_name();
						setState(1288);
						match(DOT);
						}
						break;
					}
					setState(1292);
					table_name();
					setState(1293);
					match(DOT);
					}
					} 
				}
				setState(1299);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,154,_ctx);
			}
			setState(1300);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operator1Context extends ParserRuleContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Unary_operator1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operator1Context unary_operator1() throws RecognitionException {
		Unary_operator1Context _localctx = new Unary_operator1Context(_ctx, getState());
		enterRule(_localctx, 150, RULE_unary_operator1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1302);
			unary_operator();
			setState(1303);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_name1Context extends ParserRuleContext {
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Function_name1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_name1Context function_name1() throws RecognitionException {
		Function_name1Context _localctx = new Function_name1Context(_ctx, getState());
		enterRule(_localctx, 152, RULE_function_name1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1305);
			function_name();
			setState(1306);
			match(OPEN_PAR);
			setState(1319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACK:
			case DOT:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case TILDE:
			case PLUS_PLUS:
			case MINUS_MINUS:
			case NOT_EQ3:
			case K_TRUE:
			case K_FALSE:
			case K_CURRENT_DATE:
			case K_CURRENT_TIME:
			case K_CURRENT_TIMESTAMP:
			case K_BREAK:
			case K_DISTINCT:
			case K_EXISTS:
			case K_NOT:
			case K_NULL:
			case K_CONTINUE:
			case IDENTIFIER:
			case NUMERIC_LITERAL:
			case STRING_LITERAL:
			case BLOB_LITERAL:
				{
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_DISTINCT) {
					{
					setState(1307);
					match(K_DISTINCT);
					}
				}

				setState(1310);
				expr(0);
				setState(1315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1311);
					match(COMMA);
					setState(1312);
					expr(0);
					}
					}
					setState(1317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STAR:
				{
				setState(1318);
				match(STAR);
				}
				break;
			case CLOSE_PAR:
				break;
			default:
				break;
			}
			setState(1321);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_key_clauseContext extends ParserRuleContext {
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public Foreign_tableContext foreign_table() {
			return getRuleContext(Foreign_tableContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_target_column_nameContext> fk_target_column_name() {
			return getRuleContexts(Fk_target_column_nameContext.class);
		}
		public Fk_target_column_nameContext fk_target_column_name(int i) {
			return getRuleContext(Fk_target_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Match_nameContext> match_name() {
			return getRuleContexts(Match_nameContext.class);
		}
		public Match_nameContext match_name(int i) {
			return getRuleContext(Match_nameContext.class,i);
		}
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public Foreign_key_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_key_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_key_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_key_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_key_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_key_clauseContext foreign_key_clause() throws RecognitionException {
		Foreign_key_clauseContext _localctx = new Foreign_key_clauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_foreign_key_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(K_REFERENCES);
			setState(1327);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1324);
				database_name();
				setState(1325);
				match(DOT);
				}
				break;
			}
			setState(1329);
			foreign_table();
			setState(1341);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
			case 1:
				{
				setState(1330);
				match(OPEN_PAR);
				setState(1331);
				fk_target_column_name();
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1332);
					match(COMMA);
					setState(1333);
					fk_target_column_name();
					}
					}
					setState(1338);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1339);
				match(CLOSE_PAR);
				}
				break;
			}
			setState(1346);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==K_MATCH || _la==K_ON) {
				{
				{
				setState(1343);
				match_name();
				}
				}
				setState(1348);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1362);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				{
				setState(1350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_NOT) {
					{
					setState(1349);
					match(K_NOT);
					}
				}

				setState(1352);
				match(K_DEFERRABLE);
				setState(1357);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,163,_ctx) ) {
				case 1:
					{
					setState(1353);
					match(K_INITIALLY);
					setState(1354);
					match(K_DEFERRED);
					}
					break;
				case 2:
					{
					setState(1355);
					match(K_INITIALLY);
					setState(1356);
					match(K_IMMEDIATE);
					}
					break;
				}
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ENABLE) {
					{
					setState(1359);
					match(K_ENABLE);
					}
				}

				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Match_nameContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public Match_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_match_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterMatch_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitMatch_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitMatch_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Match_nameContext match_name() throws RecognitionException {
		Match_nameContext _localctx = new Match_nameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_match_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_ON:
				{
				setState(1364);
				match(K_ON);
				setState(1365);
				_la = _input.LA(1);
				if ( !(_la==K_DELETE || _la==K_UPDATE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1374);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1366);
					match(K_SET);
					setState(1367);
					match(K_NULL);
					}
					break;
				case 2:
					{
					setState(1368);
					match(K_SET);
					setState(1369);
					match(K_DEFAULT);
					}
					break;
				case 3:
					{
					setState(1370);
					match(K_CASCADE);
					}
					break;
				case 4:
					{
					setState(1371);
					match(K_RESTRICT);
					}
					break;
				case 5:
					{
					setState(1372);
					match(K_NO);
					setState(1373);
					match(K_ACTION);
					}
					break;
				}
				}
				break;
			case K_MATCH:
				{
				setState(1376);
				match(K_MATCH);
				setState(1377);
				name();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_target_column_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Fk_target_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_target_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_target_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_target_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_target_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_target_column_nameContext fk_target_column_name() throws RecognitionException {
		Fk_target_column_nameContext _localctx = new Fk_target_column_nameContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_fk_target_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1380);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Indexed_columnContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Indexed_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexed_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndexed_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndexed_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndexed_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Indexed_columnContext indexed_column() throws RecognitionException {
		Indexed_columnContext _localctx = new Indexed_columnContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_indexed_column);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			column_name();
			setState(1385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1383);
				match(K_COLLATE);
				setState(1384);
				collation_name();
				}
			}

			setState(1388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1387);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraintContext extends ParserRuleContext {
		public Table_constraint_primary_keyContext table_constraint_primary_key() {
			return getRuleContext(Table_constraint_primary_keyContext.class,0);
		}
		public Table_constraint_keyContext table_constraint_key() {
			return getRuleContext(Table_constraint_keyContext.class,0);
		}
		public Table_constraint_uniqueContext table_constraint_unique() {
			return getRuleContext(Table_constraint_uniqueContext.class,0);
		}
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Table_constraint_foreign_keyContext table_constraint_foreign_key() {
			return getRuleContext(Table_constraint_foreign_keyContext.class,0);
		}
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Table_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraintContext table_constraint() throws RecognitionException {
		Table_constraintContext _localctx = new Table_constraintContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_table_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_CONSTRAINT) {
				{
				setState(1390);
				match(K_CONSTRAINT);
				setState(1391);
				name();
				}
			}

			setState(1403);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_PRIMARY:
				{
				setState(1394);
				table_constraint_primary_key();
				}
				break;
			case K_KEY:
				{
				setState(1395);
				table_constraint_key();
				}
				break;
			case K_UNIQUE:
				{
				setState(1396);
				table_constraint_unique();
				}
				break;
			case K_CHECK:
				{
				setState(1397);
				match(K_CHECK);
				setState(1398);
				match(OPEN_PAR);
				setState(1399);
				expr(0);
				setState(1400);
				match(CLOSE_PAR);
				}
				break;
			case K_FOREIGN:
				{
				setState(1402);
				table_constraint_foreign_key();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_primary_keyContext extends ParserRuleContext {
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_primary_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_primary_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_primary_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_primary_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_primary_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_primary_keyContext table_constraint_primary_key() throws RecognitionException {
		Table_constraint_primary_keyContext _localctx = new Table_constraint_primary_keyContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_table_constraint_primary_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(K_PRIMARY);
			setState(1406);
			match(K_KEY);
			setState(1407);
			match(OPEN_PAR);
			setState(1408);
			indexed_column();
			setState(1413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1409);
				match(COMMA);
				setState(1410);
				indexed_column();
				}
				}
				setState(1415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1416);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_foreign_keyContext extends ParserRuleContext {
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Fk_origin_column_nameContext> fk_origin_column_name() {
			return getRuleContexts(Fk_origin_column_nameContext.class);
		}
		public Fk_origin_column_nameContext fk_origin_column_name(int i) {
			return getRuleContext(Fk_origin_column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Foreign_key_clauseContext foreign_key_clause() {
			return getRuleContext(Foreign_key_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_foreign_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_foreign_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_foreign_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_foreign_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_foreign_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_foreign_keyContext table_constraint_foreign_key() throws RecognitionException {
		Table_constraint_foreign_keyContext _localctx = new Table_constraint_foreign_keyContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_table_constraint_foreign_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			match(K_FOREIGN);
			setState(1419);
			match(K_KEY);
			setState(1420);
			match(OPEN_PAR);
			setState(1421);
			fk_origin_column_name();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1422);
				match(COMMA);
				setState(1423);
				fk_origin_column_name();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1429);
			match(CLOSE_PAR);
			setState(1430);
			foreign_key_clause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_uniqueContext extends ParserRuleContext {
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_uniqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_unique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_unique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_unique(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_unique(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_uniqueContext table_constraint_unique() throws RecognitionException {
		Table_constraint_uniqueContext _localctx = new Table_constraint_uniqueContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_table_constraint_unique);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1432);
			match(K_UNIQUE);
			setState(1434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_KEY) {
				{
				setState(1433);
				match(K_KEY);
				}
			}

			setState(1437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				{
				setState(1436);
				name();
				}
				break;
			}
			setState(1439);
			match(OPEN_PAR);
			setState(1440);
			indexed_column();
			setState(1445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1441);
				match(COMMA);
				setState(1442);
				indexed_column();
				}
				}
				setState(1447);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1448);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_constraint_keyContext extends ParserRuleContext {
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Indexed_columnContext> indexed_column() {
			return getRuleContexts(Indexed_columnContext.class);
		}
		public Indexed_columnContext indexed_column(int i) {
			return getRuleContext(Indexed_columnContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Table_constraint_keyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_constraint_key; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_constraint_key(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_constraint_key(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_constraint_key(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_constraint_keyContext table_constraint_key() throws RecognitionException {
		Table_constraint_keyContext _localctx = new Table_constraint_keyContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_table_constraint_key);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			match(K_KEY);
			setState(1452);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
			case 1:
				{
				setState(1451);
				name();
				}
				break;
			}
			setState(1454);
			match(OPEN_PAR);
			setState(1455);
			indexed_column();
			setState(1460);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1456);
				match(COMMA);
				setState(1457);
				indexed_column();
				}
				}
				setState(1462);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1463);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fk_origin_column_nameContext extends ParserRuleContext {
		public Column_nameContext column_name() {
			return getRuleContext(Column_nameContext.class,0);
		}
		public Fk_origin_column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fk_origin_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFk_origin_column_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFk_origin_column_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFk_origin_column_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fk_origin_column_nameContext fk_origin_column_name() throws RecognitionException {
		Fk_origin_column_nameContext _localctx = new Fk_origin_column_nameContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_fk_origin_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			column_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Qualified_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Qualified_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualified_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterQualified_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitQualified_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitQualified_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Qualified_table_nameContext qualified_table_name() throws RecognitionException {
		Qualified_table_nameContext _localctx = new Qualified_table_nameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_qualified_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1470);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
			case 1:
				{
				setState(1467);
				database_name();
				setState(1468);
				match(DOT);
				}
				break;
			}
			setState(1472);
			table_name();
			setState(1478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_INDEXED:
				{
				setState(1473);
				match(K_INDEXED);
				setState(1474);
				match(K_BY);
				setState(1475);
				index_name();
				}
				break;
			case K_NOT:
				{
				setState(1476);
				match(K_NOT);
				setState(1477);
				match(K_INDEXED);
				}
				break;
			case EOF:
			case SCOL:
			case OPEN_PAR:
			case K_VAR:
			case K_ALTER:
			case K_CREATE:
			case K_DELETE:
			case K_DROP:
			case K_INSERT:
			case K_SELECT:
			case K_SET:
			case K_UPDATE:
			case K_VALUES:
			case K_WHERE:
			case IDENTIFIER:
			case STRING_LITERAL:
			case UNEXPECTED_CHAR:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ordering_termContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public Collation_nameContext collation_name() {
			return getRuleContext(Collation_nameContext.class,0);
		}
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public Ordering_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ordering_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOrdering_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOrdering_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOrdering_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ordering_termContext ordering_term() throws RecognitionException {
		Ordering_termContext _localctx = new Ordering_termContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_ordering_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1480);
			expr(0);
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_COLLATE) {
				{
				setState(1481);
				match(K_COLLATE);
				setState(1482);
				collation_name();
				}
			}

			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ASC || _la==K_DESC) {
				{
				setState(1485);
				_la = _input.LA(1);
				if ( !(_la==K_ASC || _la==K_DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_valueContext extends ParserRuleContext {
		public Signed_numberContext signed_number() {
			return getRuleContext(Signed_numberContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Pragma_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_valueContext pragma_value() throws RecognitionException {
		Pragma_valueContext _localctx = new Pragma_valueContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_pragma_value);
		try {
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1488);
				signed_number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1489);
				name();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1490);
				match(STRING_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Common_table_expressionContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Common_table_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_common_table_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCommon_table_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCommon_table_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCommon_table_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Common_table_expressionContext common_table_expression() throws RecognitionException {
		Common_table_expressionContext _localctx = new Common_table_expressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_common_table_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			table_name();
			setState(1505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1494);
				match(OPEN_PAR);
				setState(1495);
				column_name();
				setState(1500);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1496);
					match(COMMA);
					setState(1497);
					column_name();
					}
					}
					setState(1502);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1503);
				match(CLOSE_PAR);
				}
			}

			setState(1507);
			match(K_AS);
			setState(1508);
			match(OPEN_PAR);
			setState(1509);
			select_stmt();
			setState(1510);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Result_columnContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_aliasContext column_alias() {
			return getRuleContext(Column_aliasContext.class,0);
		}
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public Result_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_result_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterResult_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitResult_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitResult_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Result_columnContext result_column() throws RecognitionException {
		Result_columnContext _localctx = new Result_columnContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_result_column);
		int _la;
		try {
			setState(1524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				table_name();
				setState(1514);
				match(DOT);
				setState(1515);
				match(STAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1517);
				expr(0);
				setState(1522);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1519);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1518);
						match(K_AS);
						}
					}

					setState(1521);
					column_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_subqueryContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public Database_nameContext database_name() {
			return getRuleContext(Database_nameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Table_aliasContext table_alias() {
			return getRuleContext(Table_aliasContext.class,0);
		}
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Table_or_subqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_subquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_subquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_subquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_subqueryContext table_or_subquery() throws RecognitionException {
		Table_or_subqueryContext _localctx = new Table_or_subqueryContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_table_or_subquery);
		int _la;
		try {
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1529);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1526);
					database_name();
					setState(1527);
					match(DOT);
					}
					break;
				}
				setState(1531);
				table_name();
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1533);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1532);
						match(K_AS);
						}
					}

					setState(1535);
					table_alias();
					}
					break;
				}
				setState(1543);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1538);
					match(K_INDEXED);
					setState(1539);
					match(K_BY);
					setState(1540);
					index_name();
					}
					break;
				case 2:
					{
					setState(1541);
					match(K_NOT);
					setState(1542);
					match(K_INDEXED);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1545);
				match(OPEN_PAR);
				setState(1555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1546);
					table_or_subquery();
					setState(1551);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1547);
						match(COMMA);
						setState(1548);
						table_or_subquery();
						}
						}
						setState(1553);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(1554);
					join_clause();
					}
					break;
				}
				setState(1557);
				match(CLOSE_PAR);
				setState(1562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1559);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1558);
						match(K_AS);
						}
					}

					setState(1561);
					table_alias();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1564);
				match(OPEN_PAR);
				setState(1565);
				select_stmt();
				setState(1566);
				match(CLOSE_PAR);
				setState(1571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1568);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_AS) {
						{
						setState(1567);
						match(K_AS);
						}
					}

					setState(1570);
					table_alias();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_clauseContext extends ParserRuleContext {
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public List<Join_operatorContext> join_operator() {
			return getRuleContexts(Join_operatorContext.class);
		}
		public Join_operatorContext join_operator(int i) {
			return getRuleContext(Join_operatorContext.class,i);
		}
		public List<Join_constraintContext> join_constraint() {
			return getRuleContexts(Join_constraintContext.class);
		}
		public Join_constraintContext join_constraint(int i) {
			return getRuleContext(Join_constraintContext.class,i);
		}
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_join_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1575);
			table_or_subquery();
			setState(1582);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1576);
				join_operator();
				setState(1577);
				table_or_subquery();
				setState(1578);
				join_constraint();
				}
				}
				setState(1584);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_operatorContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public Join_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_operatorContext join_operator() throws RecognitionException {
		Join_operatorContext _localctx = new Join_operatorContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_join_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1585);
			match(COMMA);
			setState(1591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_LEFT:
				{
				setState(1586);
				match(K_LEFT);
				setState(1588);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_OUTER) {
					{
					setState(1587);
					match(K_OUTER);
					}
				}

				}
				break;
			case K_INNER:
				{
				setState(1590);
				match(K_INNER);
				}
				break;
			case K_JOIN:
				break;
			default:
				break;
			}
			setState(1593);
			match(K_JOIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_constraintContext extends ParserRuleContext {
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Join_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_constraintContext join_constraint() throws RecognitionException {
		Join_constraintContext _localctx = new Join_constraintContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_join_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==K_ON) {
				{
				setState(1595);
				match(K_ON);
				setState(1596);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Select_coreContext extends ParserRuleContext {
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public List<Result_columnContext> result_column() {
			return getRuleContexts(Result_columnContext.class);
		}
		public Result_columnContext result_column(int i) {
			return getRuleContext(Result_columnContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public List<Table_or_subqueryContext> table_or_subquery() {
			return getRuleContexts(Table_or_subqueryContext.class);
		}
		public Table_or_subqueryContext table_or_subquery(int i) {
			return getRuleContext(Table_or_subqueryContext.class,i);
		}
		public Join_clauseContext join_clause() {
			return getRuleContext(Join_clauseContext.class,0);
		}
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(SQLParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(SQLParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(SQLParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(SQLParser.CLOSE_PAR, i);
		}
		public Select_coreContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_core; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_core(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_core(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_core(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_coreContext select_core() throws RecognitionException {
		Select_coreContext _localctx = new Select_coreContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_select_core);
		int _la;
		try {
			setState(1673);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1599);
				match(K_SELECT);
				setState(1601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_ALL || _la==K_DISTINCT) {
					{
					setState(1600);
					_la = _input.LA(1);
					if ( !(_la==K_ALL || _la==K_DISTINCT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1603);
				result_column();
				setState(1608);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1604);
					match(COMMA);
					setState(1605);
					result_column();
					}
					}
					setState(1610);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1623);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_FROM) {
					{
					setState(1611);
					match(K_FROM);
					setState(1621);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
					case 1:
						{
						setState(1612);
						table_or_subquery();
						setState(1617);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(1613);
							match(COMMA);
							setState(1614);
							table_or_subquery();
							}
							}
							setState(1619);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						break;
					case 2:
						{
						setState(1620);
						join_clause();
						}
						break;
					}
					}
				}

				setState(1627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_WHERE) {
					{
					setState(1625);
					match(K_WHERE);
					setState(1626);
					expr(0);
					}
				}

				setState(1643);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==K_GROUP) {
					{
					setState(1629);
					match(K_GROUP);
					setState(1630);
					match(K_BY);
					setState(1631);
					expr(0);
					setState(1636);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1632);
						match(COMMA);
						setState(1633);
						expr(0);
						}
						}
						setState(1638);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1641);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==K_HAVING) {
						{
						setState(1639);
						match(K_HAVING);
						setState(1640);
						expr(0);
						}
					}

					}
				}

				}
				break;
			case K_VALUES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1645);
				match(K_VALUES);
				setState(1646);
				match(OPEN_PAR);
				setState(1647);
				expr(0);
				setState(1652);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1648);
					match(COMMA);
					setState(1649);
					expr(0);
					}
					}
					setState(1654);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1655);
				match(CLOSE_PAR);
				setState(1670);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1656);
					match(COMMA);
					setState(1657);
					match(OPEN_PAR);
					setState(1658);
					expr(0);
					setState(1663);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(1659);
						match(COMMA);
						setState(1660);
						expr(0);
						}
						}
						setState(1665);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1666);
					match(CLOSE_PAR);
					}
					}
					setState(1672);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Cte_table_nameContext extends ParserRuleContext {
		public Table_nameContext table_name() {
			return getRuleContext(Table_nameContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public List<Column_nameContext> column_name() {
			return getRuleContexts(Column_nameContext.class);
		}
		public Column_nameContext column_name(int i) {
			return getRuleContext(Column_nameContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Cte_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCte_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCte_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCte_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cte_table_nameContext cte_table_name() throws RecognitionException {
		Cte_table_nameContext _localctx = new Cte_table_nameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_cte_table_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1675);
			table_name();
			setState(1687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(1676);
				match(OPEN_PAR);
				setState(1677);
				column_name();
				setState(1682);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1678);
					match(COMMA);
					setState(1679);
					column_name();
					}
					}
					setState(1684);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1685);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_numberContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public Signed_numberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSigned_number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSigned_number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSigned_number(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_numberContext signed_number() throws RecognitionException {
		Signed_numberContext _localctx = new Signed_numberContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_signed_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NUMERIC_LITERAL:
				{
				setState(1690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PLUS || _la==MINUS) {
					{
					setState(1689);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1692);
				match(NUMERIC_LITERAL);
				}
				break;
			case STAR:
				{
				setState(1693);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Literal_valueContext extends ParserRuleContext {
		public TerminalNode NUMERIC_LITERAL() { return getToken(SQLParser.NUMERIC_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode BLOB_LITERAL() { return getToken(SQLParser.BLOB_LITERAL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public Literal_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLiteral_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLiteral_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLiteral_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Literal_valueContext literal_value() throws RecognitionException {
		Literal_valueContext _localctx = new Literal_valueContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_literal_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (K_CURRENT_DATE - 70)) | (1L << (K_CURRENT_TIME - 70)) | (1L << (K_CURRENT_TIMESTAMP - 70)) | (1L << (K_NULL - 70)))) != 0) || ((((_la - 180)) & ~0x3f) == 0 && ((1L << (_la - 180)) & ((1L << (NUMERIC_LITERAL - 180)) | (1L << (STRING_LITERAL - 180)) | (1L << (BLOB_LITERAL - 180)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SQLParser.TILDE, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << TILDE))) != 0) || _la==K_NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Error_messageContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Error_messageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error_message; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterError_message(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitError_message(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitError_message(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Error_messageContext error_message() throws RecognitionException {
		Error_messageContext _localctx = new Error_messageContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_error_message);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1700);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_argumentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Column_defContext column_def() {
			return getRuleContext(Column_defContext.class,0);
		}
		public Module_argumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_argumentContext module_argument() throws RecognitionException {
		Module_argumentContext _localctx = new Module_argumentContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_module_argument);
		try {
			setState(1704);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1702);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1703);
				column_def();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_aliasContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public Column_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_aliasContext column_alias() throws RecognitionException {
		Column_aliasContext _localctx = new Column_aliasContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_column_alias);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1706);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode K_ABORT() { return getToken(SQLParser.K_ABORT, 0); }
		public TerminalNode K_VAR() { return getToken(SQLParser.K_VAR, 0); }
		public TerminalNode K_ACTION() { return getToken(SQLParser.K_ACTION, 0); }
		public TerminalNode K_ADD() { return getToken(SQLParser.K_ADD, 0); }
		public TerminalNode K_AFTER() { return getToken(SQLParser.K_AFTER, 0); }
		public TerminalNode K_ALL() { return getToken(SQLParser.K_ALL, 0); }
		public TerminalNode K_ALTER() { return getToken(SQLParser.K_ALTER, 0); }
		public TerminalNode K_ANALYZE() { return getToken(SQLParser.K_ANALYZE, 0); }
		public TerminalNode K_AND() { return getToken(SQLParser.K_AND, 0); }
		public TerminalNode K_AS() { return getToken(SQLParser.K_AS, 0); }
		public TerminalNode K_ASC() { return getToken(SQLParser.K_ASC, 0); }
		public TerminalNode K_ATTACH() { return getToken(SQLParser.K_ATTACH, 0); }
		public TerminalNode K_AUTOINCREMENT() { return getToken(SQLParser.K_AUTOINCREMENT, 0); }
		public TerminalNode K_BEFORE() { return getToken(SQLParser.K_BEFORE, 0); }
		public TerminalNode K_BEGIN() { return getToken(SQLParser.K_BEGIN, 0); }
		public TerminalNode K_BETWEEN() { return getToken(SQLParser.K_BETWEEN, 0); }
		public TerminalNode K_BY() { return getToken(SQLParser.K_BY, 0); }
		public TerminalNode K_CASCADE() { return getToken(SQLParser.K_CASCADE, 0); }
		public TerminalNode K_CASE() { return getToken(SQLParser.K_CASE, 0); }
		public TerminalNode K_CAST() { return getToken(SQLParser.K_CAST, 0); }
		public TerminalNode K_CHECK() { return getToken(SQLParser.K_CHECK, 0); }
		public TerminalNode K_COLLATE() { return getToken(SQLParser.K_COLLATE, 0); }
		public TerminalNode K_COLUMN() { return getToken(SQLParser.K_COLUMN, 0); }
		public TerminalNode K_COMMIT() { return getToken(SQLParser.K_COMMIT, 0); }
		public TerminalNode K_CONFLICT() { return getToken(SQLParser.K_CONFLICT, 0); }
		public TerminalNode K_CONSTRAINT() { return getToken(SQLParser.K_CONSTRAINT, 0); }
		public TerminalNode K_CREATE() { return getToken(SQLParser.K_CREATE, 0); }
		public TerminalNode K_CROSS() { return getToken(SQLParser.K_CROSS, 0); }
		public TerminalNode K_CURRENT_DATE() { return getToken(SQLParser.K_CURRENT_DATE, 0); }
		public TerminalNode K_CURRENT_TIME() { return getToken(SQLParser.K_CURRENT_TIME, 0); }
		public TerminalNode K_CURRENT_TIMESTAMP() { return getToken(SQLParser.K_CURRENT_TIMESTAMP, 0); }
		public TerminalNode K_DATABASE() { return getToken(SQLParser.K_DATABASE, 0); }
		public TerminalNode K_DEFAULT() { return getToken(SQLParser.K_DEFAULT, 0); }
		public TerminalNode K_DEFERRABLE() { return getToken(SQLParser.K_DEFERRABLE, 0); }
		public TerminalNode K_DEFERRED() { return getToken(SQLParser.K_DEFERRED, 0); }
		public TerminalNode K_DELETE() { return getToken(SQLParser.K_DELETE, 0); }
		public TerminalNode K_DESC() { return getToken(SQLParser.K_DESC, 0); }
		public TerminalNode K_DETACH() { return getToken(SQLParser.K_DETACH, 0); }
		public TerminalNode K_DISTINCT() { return getToken(SQLParser.K_DISTINCT, 0); }
		public TerminalNode K_DROP() { return getToken(SQLParser.K_DROP, 0); }
		public TerminalNode K_EACH() { return getToken(SQLParser.K_EACH, 0); }
		public TerminalNode K_ELSE() { return getToken(SQLParser.K_ELSE, 0); }
		public TerminalNode K_END() { return getToken(SQLParser.K_END, 0); }
		public TerminalNode K_ENABLE() { return getToken(SQLParser.K_ENABLE, 0); }
		public TerminalNode K_ESCAPE() { return getToken(SQLParser.K_ESCAPE, 0); }
		public TerminalNode K_EXCEPT() { return getToken(SQLParser.K_EXCEPT, 0); }
		public TerminalNode K_EXCLUSIVE() { return getToken(SQLParser.K_EXCLUSIVE, 0); }
		public TerminalNode K_EXISTS() { return getToken(SQLParser.K_EXISTS, 0); }
		public TerminalNode K_EXPLAIN() { return getToken(SQLParser.K_EXPLAIN, 0); }
		public TerminalNode K_FAIL() { return getToken(SQLParser.K_FAIL, 0); }
		public TerminalNode K_FOR() { return getToken(SQLParser.K_FOR, 0); }
		public TerminalNode K_FOREIGN() { return getToken(SQLParser.K_FOREIGN, 0); }
		public TerminalNode K_FROM() { return getToken(SQLParser.K_FROM, 0); }
		public TerminalNode K_FULL() { return getToken(SQLParser.K_FULL, 0); }
		public TerminalNode K_GLOB() { return getToken(SQLParser.K_GLOB, 0); }
		public TerminalNode K_GROUP() { return getToken(SQLParser.K_GROUP, 0); }
		public TerminalNode K_HAVING() { return getToken(SQLParser.K_HAVING, 0); }
		public TerminalNode K_IF() { return getToken(SQLParser.K_IF, 0); }
		public TerminalNode K_IGNORE() { return getToken(SQLParser.K_IGNORE, 0); }
		public TerminalNode K_IMMEDIATE() { return getToken(SQLParser.K_IMMEDIATE, 0); }
		public TerminalNode K_IN() { return getToken(SQLParser.K_IN, 0); }
		public TerminalNode K_INDEX() { return getToken(SQLParser.K_INDEX, 0); }
		public TerminalNode K_INDEXED() { return getToken(SQLParser.K_INDEXED, 0); }
		public TerminalNode K_INITIALLY() { return getToken(SQLParser.K_INITIALLY, 0); }
		public TerminalNode K_INNER() { return getToken(SQLParser.K_INNER, 0); }
		public TerminalNode K_INSERT() { return getToken(SQLParser.K_INSERT, 0); }
		public TerminalNode K_INSTEAD() { return getToken(SQLParser.K_INSTEAD, 0); }
		public TerminalNode K_INTERSECT() { return getToken(SQLParser.K_INTERSECT, 0); }
		public TerminalNode K_INTO() { return getToken(SQLParser.K_INTO, 0); }
		public TerminalNode K_IS() { return getToken(SQLParser.K_IS, 0); }
		public TerminalNode K_ISNULL() { return getToken(SQLParser.K_ISNULL, 0); }
		public TerminalNode K_JOIN() { return getToken(SQLParser.K_JOIN, 0); }
		public TerminalNode K_KEY() { return getToken(SQLParser.K_KEY, 0); }
		public TerminalNode K_LEFT() { return getToken(SQLParser.K_LEFT, 0); }
		public TerminalNode K_LIKE() { return getToken(SQLParser.K_LIKE, 0); }
		public TerminalNode K_LIMIT() { return getToken(SQLParser.K_LIMIT, 0); }
		public TerminalNode K_MATCH() { return getToken(SQLParser.K_MATCH, 0); }
		public TerminalNode K_NATURAL() { return getToken(SQLParser.K_NATURAL, 0); }
		public TerminalNode K_NO() { return getToken(SQLParser.K_NO, 0); }
		public TerminalNode K_NOT() { return getToken(SQLParser.K_NOT, 0); }
		public TerminalNode K_NOTNULL() { return getToken(SQLParser.K_NOTNULL, 0); }
		public TerminalNode K_NULL() { return getToken(SQLParser.K_NULL, 0); }
		public TerminalNode K_OF() { return getToken(SQLParser.K_OF, 0); }
		public TerminalNode K_OFFSET() { return getToken(SQLParser.K_OFFSET, 0); }
		public TerminalNode K_ON() { return getToken(SQLParser.K_ON, 0); }
		public TerminalNode K_OR() { return getToken(SQLParser.K_OR, 0); }
		public TerminalNode K_ORDER() { return getToken(SQLParser.K_ORDER, 0); }
		public TerminalNode K_OUTER() { return getToken(SQLParser.K_OUTER, 0); }
		public TerminalNode K_PLAN() { return getToken(SQLParser.K_PLAN, 0); }
		public TerminalNode K_PRAGMA() { return getToken(SQLParser.K_PRAGMA, 0); }
		public TerminalNode K_PRIMARY() { return getToken(SQLParser.K_PRIMARY, 0); }
		public TerminalNode K_QUERY() { return getToken(SQLParser.K_QUERY, 0); }
		public TerminalNode K_RAISE() { return getToken(SQLParser.K_RAISE, 0); }
		public TerminalNode K_RECURSIVE() { return getToken(SQLParser.K_RECURSIVE, 0); }
		public TerminalNode K_REFERENCES() { return getToken(SQLParser.K_REFERENCES, 0); }
		public TerminalNode K_REGEXP() { return getToken(SQLParser.K_REGEXP, 0); }
		public TerminalNode K_REINDEX() { return getToken(SQLParser.K_REINDEX, 0); }
		public TerminalNode K_RELEASE() { return getToken(SQLParser.K_RELEASE, 0); }
		public TerminalNode K_RENAME() { return getToken(SQLParser.K_RENAME, 0); }
		public TerminalNode K_REPLACE() { return getToken(SQLParser.K_REPLACE, 0); }
		public TerminalNode K_RESTRICT() { return getToken(SQLParser.K_RESTRICT, 0); }
		public TerminalNode K_RIGHT() { return getToken(SQLParser.K_RIGHT, 0); }
		public TerminalNode K_ROLLBACK() { return getToken(SQLParser.K_ROLLBACK, 0); }
		public TerminalNode K_ROW() { return getToken(SQLParser.K_ROW, 0); }
		public TerminalNode K_SAVEPOINT() { return getToken(SQLParser.K_SAVEPOINT, 0); }
		public TerminalNode K_SELECT() { return getToken(SQLParser.K_SELECT, 0); }
		public TerminalNode K_SET() { return getToken(SQLParser.K_SET, 0); }
		public TerminalNode K_TABLE() { return getToken(SQLParser.K_TABLE, 0); }
		public TerminalNode K_TEMP() { return getToken(SQLParser.K_TEMP, 0); }
		public TerminalNode K_TEMPORARY() { return getToken(SQLParser.K_TEMPORARY, 0); }
		public TerminalNode K_THEN() { return getToken(SQLParser.K_THEN, 0); }
		public TerminalNode K_TO() { return getToken(SQLParser.K_TO, 0); }
		public TerminalNode K_TRANSACTION() { return getToken(SQLParser.K_TRANSACTION, 0); }
		public TerminalNode K_TRIGGER() { return getToken(SQLParser.K_TRIGGER, 0); }
		public TerminalNode K_UNION() { return getToken(SQLParser.K_UNION, 0); }
		public TerminalNode K_UNIQUE() { return getToken(SQLParser.K_UNIQUE, 0); }
		public TerminalNode K_UPDATE() { return getToken(SQLParser.K_UPDATE, 0); }
		public TerminalNode K_USING() { return getToken(SQLParser.K_USING, 0); }
		public TerminalNode K_VACUUM() { return getToken(SQLParser.K_VACUUM, 0); }
		public TerminalNode K_VALUES() { return getToken(SQLParser.K_VALUES, 0); }
		public TerminalNode K_VIEW() { return getToken(SQLParser.K_VIEW, 0); }
		public TerminalNode K_VIRTUAL() { return getToken(SQLParser.K_VIRTUAL, 0); }
		public TerminalNode K_WHEN() { return getToken(SQLParser.K_WHEN, 0); }
		public TerminalNode K_WHERE() { return getToken(SQLParser.K_WHERE, 0); }
		public TerminalNode K_WITH() { return getToken(SQLParser.K_WITH, 0); }
		public TerminalNode K_WITHOUT() { return getToken(SQLParser.K_WITHOUT, 0); }
		public TerminalNode K_NEXTVAL() { return getToken(SQLParser.K_NEXTVAL, 0); }
		public TerminalNode K_NEW() { return getToken(SQLParser.K_NEW, 0); }
		public TerminalNode K_FALSE() { return getToken(SQLParser.K_FALSE, 0); }
		public TerminalNode K_TRUE() { return getToken(SQLParser.K_TRUE, 0); }
		public TerminalNode K_WHILE() { return getToken(SQLParser.K_WHILE, 0); }
		public TerminalNode K_RETURN() { return getToken(SQLParser.K_RETURN, 0); }
		public TerminalNode K_SWITCH() { return getToken(SQLParser.K_SWITCH, 0); }
		public TerminalNode K_BREAK() { return getToken(SQLParser.K_BREAK, 0); }
		public TerminalNode K_DO() { return getToken(SQLParser.K_DO, 0); }
		public TerminalNode K_CONTINUE() { return getToken(SQLParser.K_CONTINUE, 0); }
		public TerminalNode K_PRINT() { return getToken(SQLParser.K_PRINT, 0); }
		public TerminalNode K_FOREACH() { return getToken(SQLParser.K_FOREACH, 0); }
		public TerminalNode K_ARRAY() { return getToken(SQLParser.K_ARRAY, 0); }
		public TerminalNode K_FUNCTION() { return getToken(SQLParser.K_FUNCTION, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1708);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << K_NEW) | (1L << K_TRUE) | (1L << K_FALSE) | (1L << K_VAR) | (1L << K_RETURN) | (1L << K_ABORT) | (1L << K_ACTION) | (1L << K_ADD) | (1L << K_AFTER) | (1L << K_ALL) | (1L << K_ALTER) | (1L << K_ANALYZE) | (1L << K_AND) | (1L << K_AS) | (1L << K_ASC) | (1L << K_ATTACH) | (1L << K_AUTOINCREMENT) | (1L << K_BEFORE) | (1L << K_BEGIN) | (1L << K_BETWEEN) | (1L << K_BY) | (1L << K_CASCADE) | (1L << K_CASE) | (1L << K_CAST) | (1L << K_CHECK) | (1L << K_COLLATE))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (K_COLUMN - 64)) | (1L << (K_COMMIT - 64)) | (1L << (K_CONFLICT - 64)) | (1L << (K_CONSTRAINT - 64)) | (1L << (K_CREATE - 64)) | (1L << (K_CROSS - 64)) | (1L << (K_CURRENT_DATE - 64)) | (1L << (K_CURRENT_TIME - 64)) | (1L << (K_CURRENT_TIMESTAMP - 64)) | (1L << (K_DATABASE - 64)) | (1L << (K_DEFAULT - 64)) | (1L << (K_BREAK - 64)) | (1L << (K_DEFERRABLE - 64)) | (1L << (K_DEFERRED - 64)) | (1L << (K_DELETE - 64)) | (1L << (K_DESC - 64)) | (1L << (K_DETACH - 64)) | (1L << (K_DISTINCT - 64)) | (1L << (K_DROP - 64)) | (1L << (K_EACH - 64)) | (1L << (K_ELSE - 64)) | (1L << (K_END - 64)) | (1L << (K_ENABLE - 64)) | (1L << (K_ESCAPE - 64)) | (1L << (K_EXCEPT - 64)) | (1L << (K_EXCLUSIVE - 64)) | (1L << (K_EXISTS - 64)) | (1L << (K_EXPLAIN - 64)) | (1L << (K_FAIL - 64)) | (1L << (K_FOR - 64)) | (1L << (K_FOREIGN - 64)) | (1L << (K_FROM - 64)) | (1L << (K_FULL - 64)) | (1L << (K_GLOB - 64)) | (1L << (K_GROUP - 64)) | (1L << (K_HAVING - 64)) | (1L << (K_IF - 64)) | (1L << (K_WHILE - 64)) | (1L << (K_IGNORE - 64)) | (1L << (K_IMMEDIATE - 64)) | (1L << (K_IN - 64)) | (1L << (K_INDEX - 64)) | (1L << (K_INDEXED - 64)) | (1L << (K_INITIALLY - 64)) | (1L << (K_INNER - 64)) | (1L << (K_INSERT - 64)) | (1L << (K_INSTEAD - 64)) | (1L << (K_INTERSECT - 64)) | (1L << (K_INTO - 64)) | (1L << (K_IS - 64)) | (1L << (K_ISNULL - 64)) | (1L << (K_JOIN - 64)) | (1L << (K_KEY - 64)) | (1L << (K_LEFT - 64)) | (1L << (K_LIKE - 64)) | (1L << (K_LIMIT - 64)) | (1L << (K_MATCH - 64)) | (1L << (K_NATURAL - 64)) | (1L << (K_NEXTVAL - 64)) | (1L << (K_NO - 64)) | (1L << (K_NOT - 64)) | (1L << (K_NOTNULL - 64)) | (1L << (K_NULL - 64)) | (1L << (K_OF - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (K_OFFSET - 128)) | (1L << (K_ON - 128)) | (1L << (K_OR - 128)) | (1L << (K_ORDER - 128)) | (1L << (K_OUTER - 128)) | (1L << (K_PLAN - 128)) | (1L << (K_PRAGMA - 128)) | (1L << (K_PRIMARY - 128)) | (1L << (K_QUERY - 128)) | (1L << (K_RAISE - 128)) | (1L << (K_RECURSIVE - 128)) | (1L << (K_REFERENCES - 128)) | (1L << (K_REGEXP - 128)) | (1L << (K_REINDEX - 128)) | (1L << (K_RELEASE - 128)) | (1L << (K_RENAME - 128)) | (1L << (K_REPLACE - 128)) | (1L << (K_RESTRICT - 128)) | (1L << (K_RIGHT - 128)) | (1L << (K_ROLLBACK - 128)) | (1L << (K_ROW - 128)) | (1L << (K_SAVEPOINT - 128)) | (1L << (K_SELECT - 128)) | (1L << (K_SET - 128)) | (1L << (K_TABLE - 128)) | (1L << (K_TEMP - 128)) | (1L << (K_TEMPORARY - 128)) | (1L << (K_THEN - 128)) | (1L << (K_TO - 128)) | (1L << (K_TRANSACTION - 128)) | (1L << (K_TRIGGER - 128)) | (1L << (K_UNION - 128)) | (1L << (K_UNIQUE - 128)) | (1L << (K_UPDATE - 128)) | (1L << (K_USING - 128)) | (1L << (K_VACUUM - 128)) | (1L << (K_VALUES - 128)) | (1L << (K_VIEW - 128)) | (1L << (K_VIRTUAL - 128)) | (1L << (K_WHEN - 128)) | (1L << (K_WHERE - 128)) | (1L << (K_WITH - 128)) | (1L << (K_WITHOUT - 128)) | (1L << (K_SWITCH - 128)) | (1L << (K_DO - 128)) | (1L << (K_CONTINUE - 128)) | (1L << (K_PRINT - 128)) | (1L << (K_FOREACH - 128)) | (1L << (K_ARRAY - 128)) | (1L << (K_FUNCTION - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownContext extends ParserRuleContext {
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUnknown(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUnknown(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_unknown);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1711); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(1710);
					matchWildcard();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1713); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1715);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Name_xContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Name_xContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_x; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterName_x(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitName_x(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitName_x(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_xContext name_x() throws RecognitionException {
		Name_xContext _localctx = new Name_xContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_name_x);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterFunction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitFunction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1719);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arry_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Arry_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arry_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterArry_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitArry_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitArry_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arry_nameContext arry_name() throws RecognitionException {
		Arry_nameContext _localctx = new Arry_nameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_arry_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Database_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Database_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_database_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDatabase_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDatabase_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDatabase_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Database_nameContext database_name() throws RecognitionException {
		Database_nameContext _localctx = new Database_nameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_database_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Source_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSource_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSource_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSource_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_table_nameContext source_table_name() throws RecognitionException {
		Source_table_nameContext _localctx = new Source_table_nameContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_source_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1725);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_nameContext table_name() throws RecognitionException {
		Table_nameContext _localctx = new Table_nameContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1727);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_or_index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_or_index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_or_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_or_index_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_or_index_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_or_index_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_or_index_nameContext table_or_index_name() throws RecognitionException {
		Table_or_index_nameContext _localctx = new Table_or_index_nameContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_table_or_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1729);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class New_table_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public New_table_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_new_table_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterNew_table_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitNew_table_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitNew_table_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final New_table_nameContext new_table_name() throws RecognitionException {
		New_table_nameContext _localctx = new New_table_nameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_new_table_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Column_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Column_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumn_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumn_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumn_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Column_nameContext column_name() throws RecognitionException {
		Column_nameContext _localctx = new Column_nameContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_column_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Collation_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Collation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCollation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCollation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCollation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Collation_nameContext collation_name() throws RecognitionException {
		Collation_nameContext _localctx = new Collation_nameContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_collation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Foreign_tableContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Foreign_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreign_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterForeign_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitForeign_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitForeign_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Foreign_tableContext foreign_table() throws RecognitionException {
		Foreign_tableContext _localctx = new Foreign_tableContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_foreign_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1737);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Index_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterIndex_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitIndex_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitIndex_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_index_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1739);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTrigger_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTrigger_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class View_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public View_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_view_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterView_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitView_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitView_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final View_nameContext view_name() throws RecognitionException {
		View_nameContext _localctx = new View_nameContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_view_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1743);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Module_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Module_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterModule_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitModule_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitModule_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_nameContext module_name() throws RecognitionException {
		Module_nameContext _localctx = new Module_nameContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_module_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1745);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pragma_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Pragma_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pragma_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPragma_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPragma_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPragma_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pragma_nameContext pragma_name() throws RecognitionException {
		Pragma_nameContext _localctx = new Pragma_nameContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_pragma_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Savepoint_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Savepoint_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_savepoint_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSavepoint_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSavepoint_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSavepoint_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Savepoint_nameContext savepoint_name() throws RecognitionException {
		Savepoint_nameContext _localctx = new Savepoint_nameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_savepoint_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1749);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Table_aliasContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Table_aliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_table_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTable_alias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTable_alias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTable_alias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Table_aliasContext table_alias() throws RecognitionException {
		Table_aliasContext _localctx = new Table_aliasContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_table_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1751);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Transaction_nameContext extends ParserRuleContext {
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public Transaction_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTransaction_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTransaction_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTransaction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transaction_nameContext transaction_name() throws RecognitionException {
		Transaction_nameContext _localctx = new Transaction_nameContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_transaction_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1753);
			any_name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Any_nameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode OPEN_PAR() { return getToken(SQLParser.OPEN_PAR, 0); }
		public Any_nameContext any_name() {
			return getRuleContext(Any_nameContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(SQLParser.CLOSE_PAR, 0); }
		public Any_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_any_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAny_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAny_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAny_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Any_nameContext any_name() throws RecognitionException {
		Any_nameContext _localctx = new Any_nameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_any_name);
		try {
			setState(1761);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				match(IDENTIFIER);
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				match(STRING_LITERAL);
				}
				break;
			case OPEN_PAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1757);
				match(OPEN_PAR);
				setState(1758);
				any_name();
				setState(1759);
				match(CLOSE_PAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SQLParser.IDENTIFIER, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 65:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00bc\u06e8\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\3\2\3\2\3\2\3\2\7\2\u0107\n\2\f\2\16\2\u010a\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\7\4\u0112\n\4\f\4\16\4\u0115\13\4\3\4\3\4\6\4\u0119"+
		"\n\4\r\4\16\4\u011a\3\4\7\4\u011e\n\4\f\4\16\4\u0121\13\4\3\4\7\4\u0124"+
		"\n\4\f\4\16\4\u0127\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0130\n\5\3\6"+
		"\3\6\3\6\3\6\3\6\7\6\u0137\n\6\f\6\16\6\u013a\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u014a\n\b\3\b\5\b\u014d\n\b\3"+
		"\b\3\b\5\b\u0151\n\b\3\b\7\b\u0154\n\b\f\b\16\b\u0157\13\b\3\b\3\b\3\t"+
		"\3\t\3\t\5\t\u015e\n\t\3\n\3\n\3\n\3\n\7\n\u0164\n\n\f\n\16\n\u0167\13"+
		"\n\3\n\3\n\5\n\u016b\n\n\3\n\3\n\5\n\u016f\n\n\3\13\3\13\3\13\5\13\u0174"+
		"\n\13\3\f\3\f\3\f\3\f\7\f\u017a\n\f\f\f\16\f\u017d\13\f\3\f\3\f\5\f\u0181"+
		"\n\f\3\f\3\f\5\f\u0185\n\f\3\r\3\r\3\r\3\16\3\16\3\16\5\16\u018d\n\16"+
		"\3\17\3\17\3\17\3\17\7\17\u0193\n\17\f\17\16\17\u0196\13\17\3\17\3\17"+
		"\5\17\u019a\n\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u01a5"+
		"\n\22\7\22\u01a7\n\22\f\22\16\22\u01aa\13\22\3\22\3\22\3\23\3\23\5\23"+
		"\u01b0\n\23\3\24\3\24\3\24\5\24\u01b5\n\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u01c3\n\25\f\25\16\25\u01c6\13"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01cf\n\25\3\25\3\25\3\25"+
		"\3\25\3\25\5\25\u01d6\n\25\3\26\3\26\5\26\u01da\n\26\3\26\5\26\u01dd\n"+
		"\26\3\26\7\26\u01e0\n\26\f\26\16\26\u01e3\13\26\5\26\u01e5\n\26\3\26\3"+
		"\26\3\26\5\26\u01ea\n\26\3\27\3\27\3\27\7\27\u01ef\n\27\f\27\16\27\u01f2"+
		"\13\27\3\27\3\27\3\27\7\27\u01f7\n\27\f\27\16\27\u01fa\13\27\5\27\u01fc"+
		"\n\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0205\n\30\f\30\16\30\u0208"+
		"\13\30\3\30\3\30\5\30\u020c\n\30\3\30\3\30\7\30\u0210\n\30\f\30\16\30"+
		"\u0213\13\30\5\30\u0215\n\30\3\31\3\31\3\31\3\31\3\31\7\31\u021c\n\31"+
		"\f\31\16\31\u021f\13\31\3\31\5\31\u0222\n\31\3\32\5\32\u0225\n\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\7\32\u022e\n\32\f\32\16\32\u0231\13\32"+
		"\3\32\3\32\3\33\3\33\5\33\u0237\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0247\n\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\7\35\u0252\n\35\f\35\16\35\u0255\13\35\3\35"+
		"\5\35\u0258\n\35\3\36\3\36\5\36\u025c\n\36\3\36\3\36\5\36\u0260\n\36\3"+
		"\36\3\36\3\36\5\36\u0265\n\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#"+
		"\3#\3#\3#\3#\7#\u0276\n#\f#\16#\u0279\13#\3#\3#\5#\u027d\n#\3$\3$\3$\3"+
		"$\3$\3$\7$\u0285\n$\f$\16$\u0288\13$\3$\3$\3$\5$\u028d\n$\3$\7$\u0290"+
		"\n$\f$\16$\u0293\13$\3$\3$\3%\3%\3%\3%\3%\3&\3&\7&\u029e\n&\f&\16&\u02a1"+
		"\13&\3&\3&\7&\u02a5\n&\f&\16&\u02a8\13&\5&\u02aa\n&\3\'\3\'\3\'\7\'\u02af"+
		"\n\'\f\'\16\'\u02b2\13\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3"+
		"(\3(\3(\7(\u02c3\n(\f(\16(\u02c6\13(\3(\5(\u02c9\n(\3(\7(\u02cc\n(\f("+
		"\16(\u02cf\13(\3)\5)\u02d2\n)\3)\3)\5)\u02d6\n)\3)\3)\3)\3)\3)\5)\u02dd"+
		"\n)\3)\5)\u02e0\n)\3)\3)\5)\u02e4\n)\5)\u02e6\n)\3*\5*\u02e9\n*\3*\3*"+
		"\3*\3*\3*\3*\3*\3*\7*\u02f3\n*\f*\16*\u02f6\13*\5*\u02f8\n*\3*\3*\3*\3"+
		"*\3*\7*\u02ff\n*\f*\16*\u0302\13*\3*\3*\5*\u0306\n*\3*\3*\3*\5*\u030b"+
		"\n*\5*\u030d\n*\3+\3+\3+\3+\3+\5+\u0314\n+\3+\3+\3+\3+\3+\3+\3+\3+\5+"+
		"\u031e\n+\3+\5+\u0321\n+\3,\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3.\5.\u0330"+
		"\n.\3.\3.\3.\5.\u0335\n.\3.\3.\3.\3.\3.\3.\3.\7.\u033e\n.\f.\16.\u0341"+
		"\13.\3.\3.\3.\3.\5.\u0347\n.\3/\3/\3/\3/\3/\5/\u034e\n/\3\60\3\60\3\60"+
		"\3\60\5\60\u0354\n\60\3\60\3\60\3\60\5\60\u0359\n\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\61\3\61\7\61\u0363\n\61\f\61\16\61\u0366\13\61\5\61\u0368"+
		"\n\61\3\61\3\61\3\61\3\61\5\61\u036e\n\61\5\61\u0370\n\61\3\62\3\62\3"+
		"\62\3\62\3\62\5\62\u0377\n\62\3\62\3\62\3\62\3\62\3\62\7\62\u037e\n\62"+
		"\f\62\16\62\u0381\13\62\3\62\3\62\5\62\u0385\n\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u038c\n\62\f\62\16\62\u038f\13\62\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\7\62\u0397\n\62\f\62\16\62\u039a\13\62\3\62\3\62\7\62\u039e\n\62"+
		"\f\62\16\62\u03a1\13\62\3\62\3\62\3\62\5\62\u03a6\n\62\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\7\63\u03ae\n\63\f\63\16\63\u03b1\13\63\5\63\u03b3\n\63"+
		"\3\63\3\63\3\63\3\63\5\63\u03b9\n\63\5\63\u03bb\n\63\3\64\3\64\5\64\u03bf"+
		"\n\64\3\64\3\64\3\64\7\64\u03c4\n\64\f\64\16\64\u03c7\13\64\3\64\3\64"+
		"\3\64\3\64\7\64\u03cd\n\64\f\64\16\64\u03d0\13\64\3\64\5\64\u03d3\n\64"+
		"\5\64\u03d5\n\64\3\64\3\64\5\64\u03d9\n\64\3\64\3\64\3\64\3\64\3\64\7"+
		"\64\u03e0\n\64\f\64\16\64\u03e3\13\64\3\64\3\64\5\64\u03e7\n\64\5\64\u03e9"+
		"\n\64\3\64\3\64\3\64\3\64\3\64\7\64\u03f0\n\64\f\64\16\64\u03f3\13\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\7\64\u03fb\n\64\f\64\16\64\u03fe\13\64"+
		"\3\64\3\64\7\64\u0402\n\64\f\64\16\64\u0405\13\64\5\64\u0407\n\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\7\65\u0414\n\65\f\65"+
		"\16\65\u0417\13\65\3\65\3\65\5\65\u041b\n\65\3\66\3\66\3\66\7\66\u0420"+
		"\n\66\f\66\16\66\u0423\13\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\5\67\u0430\n\67\38\38\58\u0434\n8\39\39\59\u0438\n9\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\59\u0446\n9\3:\3:\3:\5:\u044b\n:\3:\5"+
		":\u044e\n:\3;\3;\3<\3<\3<\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5"+
		">\u0463\n>\3>\3>\6>\u0467\n>\r>\16>\u0468\5>\u046b\n>\3?\3?\5?\u046f\n"+
		"?\3@\3@\3@\5@\u0474\n@\3@\3@\3A\5A\u0479\nA\3A\5A\u047c\nA\3A\3A\3A\5"+
		"A\u0481\nA\3A\7A\u0484\nA\fA\16A\u0487\13A\3B\3B\5B\u048b\nB\3B\3B\3B"+
		"\5B\u0490\nB\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u049c\nC\3C\3C\3C\3C\3C"+
		"\3C\3C\3C\3C\5C\u04a7\nC\3C\3C\3C\3C\3C\3C\7C\u04af\nC\fC\16C\u04b2\13"+
		"C\3C\3C\3C\3C\3C\3C\3C\7C\u04bb\nC\fC\16C\u04be\13C\3D\3D\3D\3D\3D\3D"+
		"\3D\3D\3D\3D\3D\3D\3D\3D\5D\u04ce\nD\3D\3D\3D\3D\3D\3D\3D\5D\u04d7\nD"+
		"\3E\3E\3F\3F\3F\3F\5F\u04df\nF\3G\3G\3H\5H\u04e4\nH\3H\5H\u04e7\nH\3H"+
		"\3H\3H\3H\3I\5I\u04ee\nI\3I\3I\3I\3J\3J\3J\3J\3J\7J\u04f8\nJ\fJ\16J\u04fb"+
		"\13J\5J\u04fd\nJ\3J\3J\3J\3J\5J\u0503\nJ\3J\5J\u0506\nJ\3K\3K\3L\3L\3"+
		"L\5L\u050d\nL\3L\3L\3L\7L\u0512\nL\fL\16L\u0515\13L\3L\3L\3M\3M\3M\3N"+
		"\3N\3N\5N\u051f\nN\3N\3N\3N\7N\u0524\nN\fN\16N\u0527\13N\3N\5N\u052a\n"+
		"N\3N\3N\3O\3O\3O\3O\5O\u0532\nO\3O\3O\3O\3O\3O\7O\u0539\nO\fO\16O\u053c"+
		"\13O\3O\3O\5O\u0540\nO\3O\7O\u0543\nO\fO\16O\u0546\13O\3O\5O\u0549\nO"+
		"\3O\3O\3O\3O\3O\5O\u0550\nO\3O\5O\u0553\nO\5O\u0555\nO\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\3P\5P\u0561\nP\3P\3P\5P\u0565\nP\3Q\3Q\3R\3R\3R\5R\u056c"+
		"\nR\3R\5R\u056f\nR\3S\3S\5S\u0573\nS\3S\3S\3S\3S\3S\3S\3S\3S\3S\5S\u057e"+
		"\nS\3T\3T\3T\3T\3T\3T\7T\u0586\nT\fT\16T\u0589\13T\3T\3T\3U\3U\3U\3U\3"+
		"U\3U\7U\u0593\nU\fU\16U\u0596\13U\3U\3U\3U\3V\3V\5V\u059d\nV\3V\5V\u05a0"+
		"\nV\3V\3V\3V\3V\7V\u05a6\nV\fV\16V\u05a9\13V\3V\3V\3W\3W\5W\u05af\nW\3"+
		"W\3W\3W\3W\7W\u05b5\nW\fW\16W\u05b8\13W\3W\3W\3X\3X\3Y\3Y\3Y\5Y\u05c1"+
		"\nY\3Y\3Y\3Y\3Y\3Y\3Y\5Y\u05c9\nY\3Z\3Z\3Z\5Z\u05ce\nZ\3Z\5Z\u05d1\nZ"+
		"\3[\3[\3[\5[\u05d6\n[\3\\\3\\\3\\\3\\\3\\\7\\\u05dd\n\\\f\\\16\\\u05e0"+
		"\13\\\3\\\3\\\5\\\u05e4\n\\\3\\\3\\\3\\\3\\\3\\\3]\3]\3]\3]\3]\3]\3]\5"+
		"]\u05f2\n]\3]\5]\u05f5\n]\5]\u05f7\n]\3^\3^\3^\5^\u05fc\n^\3^\3^\5^\u0600"+
		"\n^\3^\5^\u0603\n^\3^\3^\3^\3^\3^\5^\u060a\n^\3^\3^\3^\3^\7^\u0610\n^"+
		"\f^\16^\u0613\13^\3^\5^\u0616\n^\3^\3^\5^\u061a\n^\3^\5^\u061d\n^\3^\3"+
		"^\3^\3^\5^\u0623\n^\3^\5^\u0626\n^\5^\u0628\n^\3_\3_\3_\3_\3_\7_\u062f"+
		"\n_\f_\16_\u0632\13_\3`\3`\3`\5`\u0637\n`\3`\5`\u063a\n`\3`\3`\3a\3a\5"+
		"a\u0640\na\3b\3b\5b\u0644\nb\3b\3b\3b\7b\u0649\nb\fb\16b\u064c\13b\3b"+
		"\3b\3b\3b\7b\u0652\nb\fb\16b\u0655\13b\3b\5b\u0658\nb\5b\u065a\nb\3b\3"+
		"b\5b\u065e\nb\3b\3b\3b\3b\3b\7b\u0665\nb\fb\16b\u0668\13b\3b\3b\5b\u066c"+
		"\nb\5b\u066e\nb\3b\3b\3b\3b\3b\7b\u0675\nb\fb\16b\u0678\13b\3b\3b\3b\3"+
		"b\3b\3b\7b\u0680\nb\fb\16b\u0683\13b\3b\3b\7b\u0687\nb\fb\16b\u068a\13"+
		"b\5b\u068c\nb\3c\3c\3c\3c\3c\7c\u0693\nc\fc\16c\u0696\13c\3c\3c\5c\u069a"+
		"\nc\3d\5d\u069d\nd\3d\3d\5d\u06a1\nd\3e\3e\3f\3f\3g\3g\3h\3h\5h\u06ab"+
		"\nh\3i\3i\3j\3j\3k\6k\u06b2\nk\rk\16k\u06b3\3l\3l\3m\3m\3n\3n\3o\3o\3"+
		"p\3p\3q\3q\3r\3r\3s\3s\3t\3t\3u\3u\3v\3v\3w\3w\3x\3x\3y\3y\3z\3z\3{\3"+
		"{\3|\3|\3}\3}\3~\3~\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0080\3\u0080"+
		"\3\u0080\5\u0080\u06e4\n\u0080\3\u0081\3\u0081\3\u0081\3\u06b3\3\u0084"+
		"\u0082\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<"+
		">@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a"+
		"\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2"+
		"\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba"+
		"\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2"+
		"\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea"+
		"\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\2\23"+
		"\3\2\u00b5\u00b6\4\2\22\23$%\4\2\17\17\u0082\u0082\4\2\61\61SS\4\2\66"+
		"\66QQ\3\2\22\23\3\2$%\3\2\35 \4\2\30\32\34\34\4\2\21\21\26\27\6\2\25\25"+
		"\33\33\"#&&\6\2)*MM\u0080\u0080\u00b0\u00b0\4\2PP\u00a4\u00a4\6\2HJ\u0080"+
		"\u0080\u00b6\u00b6\u00b8\u00b9\4\2\22\24~~\4\2\u00b5\u00b5\u00b8\u00b8"+
		"\4\2(\u0083\u0085\u00b4\2\u079a\2\u0108\3\2\2\2\4\u010d\3\2\2\2\6\u0113"+
		"\3\2\2\2\b\u012f\3\2\2\2\n\u0131\3\2\2\2\f\u013d\3\2\2\2\16\u0147\3\2"+
		"\2\2\20\u015d\3\2\2\2\22\u016e\3\2\2\2\24\u0170\3\2\2\2\26\u0184\3\2\2"+
		"\2\30\u0186\3\2\2\2\32\u018c\3\2\2\2\34\u018e\3\2\2\2\36\u019b\3\2\2\2"+
		" \u019e\3\2\2\2\"\u01a1\3\2\2\2$\u01af\3\2\2\2&\u01b4\3\2\2\2(\u01d5\3"+
		"\2\2\2*\u01d7\3\2\2\2,\u01fb\3\2\2\2.\u01fd\3\2\2\2\60\u0221\3\2\2\2\62"+
		"\u0224\3\2\2\2\64\u0236\3\2\2\2\66\u0246\3\2\2\28\u0248\3\2\2\2:\u0259"+
		"\3\2\2\2<\u0266\3\2\2\2>\u0268\3\2\2\2@\u026a\3\2\2\2B\u026c\3\2\2\2D"+
		"\u026f\3\2\2\2F\u027e\3\2\2\2H\u0296\3\2\2\2J\u02a9\3\2\2\2L\u02ab\3\2"+
		"\2\2N\u02ba\3\2\2\2P\u02d1\3\2\2\2R\u02e8\3\2\2\2T\u030e\3\2\2\2V\u0322"+
		"\3\2\2\2X\u0327\3\2\2\2Z\u032a\3\2\2\2\\\u0348\3\2\2\2^\u034f\3\2\2\2"+
		"`\u035c\3\2\2\2b\u0371\3\2\2\2d\u03a7\3\2\2\2f\u0406\3\2\2\2h\u0408\3"+
		"\2\2\2j\u041c\3\2\2\2l\u0424\3\2\2\2n\u0431\3\2\2\2p\u0437\3\2\2\2r\u0447"+
		"\3\2\2\2t\u044f\3\2\2\2v\u0451\3\2\2\2x\u0454\3\2\2\2z\u0456\3\2\2\2|"+
		"\u046e\3\2\2\2~\u0470\3\2\2\2\u0080\u0478\3\2\2\2\u0082\u0488\3\2\2\2"+
		"\u0084\u04a6\3\2\2\2\u0086\u04d6\3\2\2\2\u0088\u04d8\3\2\2\2\u008a\u04de"+
		"\3\2\2\2\u008c\u04e0\3\2\2\2\u008e\u04e6\3\2\2\2\u0090\u04ed\3\2\2\2\u0092"+
		"\u0505\3\2\2\2\u0094\u0507\3\2\2\2\u0096\u0513\3\2\2\2\u0098\u0518\3\2"+
		"\2\2\u009a\u051b\3\2\2\2\u009c\u052d\3\2\2\2\u009e\u0564\3\2\2\2\u00a0"+
		"\u0566\3\2\2\2\u00a2\u0568\3\2\2\2\u00a4\u0572\3\2\2\2\u00a6\u057f\3\2"+
		"\2\2\u00a8\u058c\3\2\2\2\u00aa\u059a\3\2\2\2\u00ac\u05ac\3\2\2\2\u00ae"+
		"\u05bb\3\2\2\2\u00b0\u05c0\3\2\2\2\u00b2\u05ca\3\2\2\2\u00b4\u05d5\3\2"+
		"\2\2\u00b6\u05d7\3\2\2\2\u00b8\u05f6\3\2\2\2\u00ba\u0627\3\2\2\2\u00bc"+
		"\u0629\3\2\2\2\u00be\u0633\3\2\2\2\u00c0\u063f\3\2\2\2\u00c2\u068b\3\2"+
		"\2\2\u00c4\u068d\3\2\2\2\u00c6\u06a0\3\2\2\2\u00c8\u06a2\3\2\2\2\u00ca"+
		"\u06a4\3\2\2\2\u00cc\u06a6\3\2\2\2\u00ce\u06aa\3\2\2\2\u00d0\u06ac\3\2"+
		"\2\2\u00d2\u06ae\3\2\2\2\u00d4\u06b1\3\2\2\2\u00d6\u06b5\3\2\2\2\u00d8"+
		"\u06b7\3\2\2\2\u00da\u06b9\3\2\2\2\u00dc\u06bb\3\2\2\2\u00de\u06bd\3\2"+
		"\2\2\u00e0\u06bf\3\2\2\2\u00e2\u06c1\3\2\2\2\u00e4\u06c3\3\2\2\2\u00e6"+
		"\u06c5\3\2\2\2\u00e8\u06c7\3\2\2\2\u00ea\u06c9\3\2\2\2\u00ec\u06cb\3\2"+
		"\2\2\u00ee\u06cd\3\2\2\2\u00f0\u06cf\3\2\2\2\u00f2\u06d1\3\2\2\2\u00f4"+
		"\u06d3\3\2\2\2\u00f6\u06d5\3\2\2\2\u00f8\u06d7\3\2\2\2\u00fa\u06d9\3\2"+
		"\2\2\u00fc\u06db\3\2\2\2\u00fe\u06e3\3\2\2\2\u0100\u06e5\3\2\2\2\u0102"+
		"\u0107\5\6\4\2\u0103\u0107\5 \21\2\u0104\u0107\5P)\2\u0105\u0107\5\4\3"+
		"\2\u0106\u0102\3\2\2\2\u0106\u0103\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0105"+
		"\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\2\2\3\u010c\3\3\2\2\2"+
		"\u010d\u010e\7\u00bc\2\2\u010e\u010f\b\3\1\2\u010f\5\3\2\2\2\u0110\u0112"+
		"\7\13\2\2\u0111\u0110\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3\2\2\2"+
		"\u0113\u0114\3\2\2\2\u0114\u0116\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u011f"+
		"\5\b\5\2\u0117\u0119\7\13\2\2\u0118\u0117\3\2\2\2\u0119\u011a\3\2\2\2"+
		"\u011a\u0118\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e"+
		"\5\b\5\2\u011d\u0118\3\2\2\2\u011e\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f"+
		"\u0120\3\2\2\2\u0120\u0125\3\2\2\2\u0121\u011f\3\2\2\2\u0122\u0124\7\13"+
		"\2\2\u0123\u0122\3\2\2\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125"+
		"\u0126\3\2\2\2\u0126\7\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0130\5T+\2\u0129"+
		"\u0130\5Z.\2\u012a\u0130\5\\/\2\u012b\u0130\5^\60\2\u012c\u0130\5`\61"+
		"\2\u012d\u0130\5b\62\2\u012e\u0130\5h\65\2\u012f\u0128\3\2\2\2\u012f\u0129"+
		"\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\t\3\2\2\2\u0131\u0132\5\u00da"+
		"n\2\u0132\u0133\7\r\2\2\u0133\u0138\5\u0084C\2\u0134\u0135\7\17\2\2\u0135"+
		"\u0137\5\u0084C\2\u0136\u0134\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7\16\2\2\u013c\13\3\2\2\2\u013d\u013e\5\u00dan\2\u013e\u013f\7"+
		"\r\2\2\u013f\u0140\5\u00dco\2\u0140\u0141\7\17\2\2\u0141\u0142\7\u00b4"+
		"\2\2\u0142\u0143\5\16\b\2\u0143\u0144\5\"\22\2\u0144\u0145\7\16\2\2\u0145"+
		"\u0146\7\13\2\2\u0146\r\3\2\2\2\u0147\u0149\7\r\2\2\u0148\u014a\7+\2\2"+
		"\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u014d"+
		"\5\u0084C\2\u014c\u014b\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0155\3\2\2"+
		"\2\u014e\u0150\7\17\2\2\u014f\u0151\7+\2\2\u0150\u014f\3\2\2\2\u0150\u0151"+
		"\3\2\2\2\u0151\u0152\3\2\2\2\u0152\u0154\5\u0084C\2\u0153\u014e\3\2\2"+
		"\2\u0154\u0157\3\2\2\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0158"+
		"\3\2\2\2\u0157\u0155\3\2\2\2\u0158\u0159\7\16\2\2\u0159\17\3\2\2\2\u015a"+
		"\u015e\5\u0084C\2\u015b\u015e\5\22\n\2\u015c\u015e\5\26\f\2\u015d\u015a"+
		"\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015c\3\2\2\2\u015e\21\3\2\2\2\u015f"+
		"\u0160\7\b\2\2\u0160\u0165\5\20\t\2\u0161\u0162\7\17\2\2\u0162\u0164\5"+
		"\20\t\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2\2\u0165\u0163\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165\3\2\2\2\u0168\u0169\7\n"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u015f\3\2\2\2\u016a\u016b\3\2\2\2\u016b"+
		"\u016f\3\2\2\2\u016c\u016d\7\b\2\2\u016d\u016f\7\n\2\2\u016e\u016a\3\2"+
		"\2\2\u016e\u016c\3\2\2\2\u016f\23\3\2\2\2\u0170\u0173\5\u0100\u0081\2"+
		"\u0171\u0172\7\5\2\2\u0172\u0174\5\20\t\2\u0173\u0171\3\2\2\2\u0173\u0174"+
		"\3\2\2\2\u0174\25\3\2\2\2\u0175\u0176\7\3\2\2\u0176\u017b\5\24\13\2\u0177"+
		"\u0178\7\17\2\2\u0178\u017a\5\24\13\2\u0179\u0177\3\2\2\2\u017a\u017d"+
		"\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017e\3\2\2\2\u017d"+
		"\u017b\3\2\2\2\u017e\u017f\7\4\2\2\u017f\u0181\3\2\2\2\u0180\u0175\3\2"+
		"\2\2\u0180\u0181\3\2\2\2\u0181\u0185\3\2\2\2\u0182\u0183\7\3\2\2\u0183"+
		"\u0185\7\4\2\2\u0184\u0180\3\2\2\2\u0184\u0182\3\2\2\2\u0185\27\3\2\2"+
		"\2\u0186\u0187\7\f\2\2\u0187\u0188\5\24\13\2\u0188\31\3\2\2\2\u0189\u018d"+
		"\5\26\f\2\u018a\u018d\5\22\n\2\u018b\u018d\5\30\r\2\u018c\u0189\3\2\2"+
		"\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\33\3\2\2\2\u018e\u018f"+
		"\5\u0100\u0081\2\u018f\u0190\7\f\2\2\u0190\u0194\5\u0100\u0081\2\u0191"+
		"\u0193\5\36\20\2\u0192\u0191\3\2\2\2\u0193\u0196\3\2\2\2\u0194\u0192\3"+
		"\2\2\2\u0194\u0195\3\2\2\2\u0195\u0199\3\2\2\2\u0196\u0194\3\2\2\2\u0197"+
		"\u0198\7\20\2\2\u0198\u019a\t\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3"+
		"\2\2\2\u019a\35\3\2\2\2\u019b\u019c\7\f\2\2\u019c\u019d\5\u0100\u0081"+
		"\2\u019d\37\3\2\2\2\u019e\u019f\5~@\2\u019f\u01a0\5\"\22\2\u01a0!\3\2"+
		"\2\2\u01a1\u01a8\7\3\2\2\u01a2\u01a5\5\n\6\2\u01a3\u01a5\5(\25\2\u01a4"+
		"\u01a2\3\2\2\2\u01a4\u01a3\3\2\2\2\u01a5\u01a7\3\2\2\2\u01a6\u01a4\3\2"+
		"\2\2\u01a7\u01aa\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9"+
		"\u01ab\3\2\2\2\u01aa\u01a8\3\2\2\2\u01ab\u01ac\7\4\2\2\u01ac#\3\2\2\2"+
		"\u01ad\u01b0\5\u0084C\2\u01ae\u01b0\5\u00c2b\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01ae\3\2\2\2\u01b0%\3\2\2\2\u01b1\u01b5\5\u00fe\u0080\2\u01b2\u01b5"+
		"\5\u0084C\2\u01b3\u01b5\5\62\32\2\u01b4\u01b1\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b4\u01b3\3\2\2\2\u01b5\'\3\2\2\2\u01b6\u01d6\5.\30\2\u01b7\u01d6"+
		"\58\35\2\u01b8\u01d6\5D#\2\u01b9\u01d6\5F$\2\u01ba\u01d6\5L\'\2\u01bb"+
		"\u01d6\5N(\2\u01bc\u01bd\5\34\17\2\u01bd\u01be\7\13\2\2\u01be\u01d6\3"+
		"\2\2\2\u01bf\u01c0\7\u00b1\2\2\u01c0\u01c4\7\r\2\2\u01c1\u01c3\5,\27\2"+
		"\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c7\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c8\7\16\2\2"+
		"\u01c8\u01d6\7\13\2\2\u01c9\u01ca\5\u0084C\2\u01ca\u01cb\7\13\2\2\u01cb"+
		"\u01d6\3\2\2\2\u01cc\u01ce\5P)\2\u01cd\u01cf\7\13\2\2\u01ce\u01cd\3\2"+
		"\2\2\u01ce\u01cf\3\2\2\2\u01cf\u01d6\3\2\2\2\u01d0\u01d1\5R*\2\u01d1\u01d2"+
		"\7\13\2\2\u01d2\u01d6\3\2\2\2\u01d3\u01d6\5\62\32\2\u01d4\u01d6\5*\26"+
		"\2\u01d5\u01b6\3\2\2\2\u01d5\u01b7\3\2\2\2\u01d5\u01b8\3\2\2\2\u01d5\u01b9"+
		"\3\2\2\2\u01d5\u01ba\3\2\2\2\u01d5\u01bb\3\2\2\2\u01d5\u01bc\3\2\2\2\u01d5"+
		"\u01bf\3\2\2\2\u01d5\u01c9\3\2\2\2\u01d5\u01cc\3\2\2\2\u01d5\u01d0\3\2"+
		"\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d4\3\2\2\2\u01d6)\3\2\2\2\u01d7\u01e4"+
		"\7,\2\2\u01d8\u01da\5\66\34\2\u01d9\u01d8\3\2\2\2\u01d9\u01da\3\2\2\2"+
		"\u01da\u01dc\3\2\2\2\u01db\u01dd\7\13\2\2\u01dc\u01db\3\2\2\2\u01dc\u01dd"+
		"\3\2\2\2\u01dd\u01e5\3\2\2\2\u01de\u01e0\5&\24\2\u01df\u01de\3\2\2\2\u01e0"+
		"\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e5\3\2"+
		"\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01d9\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\7\13\2\2\u01e7\u01e9\3\2\2\2\u01e8\u01ea\5"+
		"$\23\2\u01e9\u01e8\3\2\2\2\u01e9\u01ea\3\2\2\2\u01ea+\3\2\2\2\u01eb\u01f0"+
		"\5\u0084C\2\u01ec\u01ed\7\22\2\2\u01ed\u01ef\5\u0084C\2\u01ee\u01ec\3"+
		"\2\2\2\u01ef\u01f2\3\2\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1"+
		"\u01fc\3\2\2\2\u01f2\u01f0\3\2\2\2\u01f3\u01f8\5\34\17\2\u01f4\u01f5\7"+
		"\22\2\2\u01f5\u01f7\7\u00b5\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01fa\3\2\2"+
		"\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8"+
		"\3\2\2\2\u01fb\u01eb\3\2\2\2\u01fb\u01f3\3\2\2\2\u01fc-\3\2\2\2\u01fd"+
		"\u01fe\7f\2\2\u01fe\u01ff\7\r\2\2\u01ff\u0200\5\u0084C\2\u0200\u0201\7"+
		"\16\2\2\u0201\u020b\3\2\2\2\u0202\u0206\7\3\2\2\u0203\u0205\5(\25\2\u0204"+
		"\u0203\3\2\2\2\u0205\u0208\3\2\2\2\u0206\u0204\3\2\2\2\u0206\u0207\3\2"+
		"\2\2\u0207\u0209\3\2\2\2\u0208\u0206\3\2\2\2\u0209\u020c\7\4\2\2\u020a"+
		"\u020c\5(\25\2\u020b\u0202\3\2\2\2\u020b\u020a\3\2\2\2\u020c\u0214\3\2"+
		"\2\2\u020d\u0215\5\60\31\2\u020e\u0210\5\60\31\2\u020f\u020e\3\2\2\2\u0210"+
		"\u0213\3\2\2\2\u0211\u020f\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2"+
		"\2\2\u0213\u0211\3\2\2\2\u0214\u020d\3\2\2\2\u0214\u0211\3\2\2\2\u0215"+
		"/\3\2\2\2\u0216\u0217\7V\2\2\u0217\u0222\5(\25\2\u0218\u0219\7V\2\2\u0219"+
		"\u021d\7\3\2\2\u021a\u021c\5(\25\2\u021b\u021a\3\2\2\2\u021c\u021f\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u0220\3\2\2\2\u021f"+
		"\u021d\3\2\2\2\u0220\u0222\7\4\2\2\u0221\u0216\3\2\2\2\u0221\u0218\3\2"+
		"\2\2\u0222\61\3\2\2\2\u0223\u0225\7+\2\2\u0224\u0223\3\2\2\2\u0224\u0225"+
		"\3\2\2\2\u0225\u0226\3\2\2\2\u0226\u0227\5\u0084C\2\u0227\u0228\7\20\2"+
		"\2\u0228\u0229\5\u0084C\2\u0229\u022a\7\6\2\2\u022a\u022b\5\64\33\2\u022b"+
		"\u022f\7\5\2\2\u022c\u022e\5\64\33\2\u022d\u022c\3\2\2\2\u022e\u0231\3"+
		"\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u0232\3\2\2\2\u0231"+
		"\u022f\3\2\2\2\u0232\u0233\7\13\2\2\u0233\63\3\2\2\2\u0234\u0237\5\u0084"+
		"C\2\u0235\u0237\5\66\34\2\u0236\u0234\3\2\2\2\u0236\u0235\3\2\2\2\u0237"+
		"\65\3\2\2\2\u0238\u0239\5\u0084C\2\u0239\u023a\7\6\2\2\u023a\u023b\5\u0084"+
		"C\2\u023b\u023c\7\5\2\2\u023c\u023d\5\u0084C\2\u023d\u0247\3\2\2\2\u023e"+
		"\u023f\7\r\2\2\u023f\u0240\5\u0084C\2\u0240\u0241\7\6\2\2\u0241\u0242"+
		"\5\u0084C\2\u0242\u0243\7\5\2\2\u0243\u0244\5\u0084C\2\u0244\u0245\7\16"+
		"\2\2\u0245\u0247\3\2\2\2\u0246\u0238\3\2\2\2\u0246\u023e\3\2\2\2\u0247"+
		"\67\3\2\2\2\u0248\u0249\7_\2\2\u0249\u024a\5:\36\2\u024a\u024b\7\13\2"+
		"\2\u024b\u024c\5@!\2\u024c\u024d\7\13\2\2\u024d\u024e\5B\"\2\u024e\u0257"+
		"\3\2\2\2\u024f\u0253\7\3\2\2\u0250\u0252\5(\25\2\u0251\u0250\3\2\2\2\u0252"+
		"\u0255\3\2\2\2\u0253\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2"+
		"\2\2\u0255\u0253\3\2\2\2\u0256\u0258\7\4\2\2\u0257\u024f\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u02589\3\2\2\2\u0259\u025b\7\r\2\2\u025a\u025c\7+\2\2\u025b"+
		"\u025a\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\5<"+
		"\37\2\u025e\u0260\5> \2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260"+
		"\u0261\3\2\2\2\u0261\u0264\7\20\2\2\u0262\u0265\5<\37\2\u0263\u0265\7"+
		"\u00b6\2\2\u0264\u0262\3\2\2\2\u0264\u0263\3\2\2\2\u0265;\3\2\2\2\u0266"+
		"\u0267\5\u00fe\u0080\2\u0267=\3\2\2\2\u0268\u0269\t\3\2\2\u0269?\3\2\2"+
		"\2\u026a\u026b\5\u0084C\2\u026bA\3\2\2\2\u026c\u026d\5\u0084C\2\u026d"+
		"\u026e\7\16\2\2\u026eC\3\2\2\2\u026f\u0270\7g\2\2\u0270\u0271\7\r\2\2"+
		"\u0271\u0272\5\u0084C\2\u0272\u027c\7\16\2\2\u0273\u0277\7\3\2\2\u0274"+
		"\u0276\5(\25\2\u0275\u0274\3\2\2\2\u0276\u0279\3\2\2\2\u0277\u0275\3\2"+
		"\2\2\u0277\u0278\3\2\2\2\u0278\u027a\3\2\2\2\u0279\u0277\3\2\2\2\u027a"+
		"\u027d\7\4\2\2\u027b\u027d\5(\25\2\u027c\u0273\3\2\2\2\u027c\u027b\3\2"+
		"\2\2\u027dE\3\2\2\2\u027e\u027f\7\u00ae\2\2\u027f\u0280\7\r\2\2\u0280"+
		"\u0281\5\u0084C\2\u0281\u0282\7\16\2\2\u0282\u0286\7\3\2\2\u0283\u0285"+
		"\5H%\2\u0284\u0283\3\2\2\2\u0285\u0288\3\2\2\2\u0286\u0284\3\2\2\2\u0286"+
		"\u0287\3\2\2\2\u0287\u028c\3\2\2\2\u0288\u0286\3\2\2\2\u0289\u028a\7L"+
		"\2\2\u028a\u028b\7\5\2\2\u028b\u028d\5J&\2\u028c\u0289\3\2\2\2\u028c\u028d"+
		"\3\2\2\2\u028d\u0291\3\2\2\2\u028e\u0290\5(\25\2\u028f\u028e\3\2\2\2\u0290"+
		"\u0293\3\2\2\2\u0291\u028f\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0294\3\2"+
		"\2\2\u0293\u0291\3\2\2\2\u0294\u0295\7\4\2\2\u0295G\3\2\2\2\u0296\u0297"+
		"\7>\2\2\u0297\u0298\5\u0084C\2\u0298\u0299\7\5\2\2\u0299\u029a\5J&\2\u029a"+
		"I\3\2\2\2\u029b\u029f\7\3\2\2\u029c\u029e\5(\25\2\u029d\u029c\3\2\2\2"+
		"\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a2"+
		"\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02aa\7\4\2\2\u02a3\u02a5\5(\25\2\u02a4"+
		"\u02a3\3\2\2\2\u02a5\u02a8\3\2\2\2\u02a6\u02a4\3\2\2\2\u02a6\u02a7\3\2"+
		"\2\2\u02a7\u02aa\3\2\2\2\u02a8\u02a6\3\2\2\2\u02a9\u029b\3\2\2\2\u02a9"+
		"\u02a6\3\2\2\2\u02aaK\3\2\2\2\u02ab\u02ac\7\u00af\2\2\u02ac\u02b0\7\3"+
		"\2\2\u02ad\u02af\5(\25\2\u02ae\u02ad\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02b3\3\2\2\2\u02b2\u02b0\3\2"+
		"\2\2\u02b3\u02b4\7\4\2\2\u02b4\u02b5\7g\2\2\u02b5\u02b6\7\r\2\2\u02b6"+
		"\u02b7\5\u0084C\2\u02b7\u02b8\7\16\2\2\u02b8\u02b9\7\13\2\2\u02b9M\3\2"+
		"\2\2\u02ba\u02bb\7_\2\2\u02bb\u02bc\7\r\2\2\u02bc\u02bd\5\u0084C\2\u02bd"+
		"\u02be\7\5\2\2\u02be\u02bf\5\u0084C\2\u02bf\u02c8\7\16\2\2\u02c0\u02c4"+
		"\7\3\2\2\u02c1\u02c3\5(\25\2\u02c2\u02c1\3\2\2\2\u02c3\u02c6\3\2\2\2\u02c4"+
		"\u02c2\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02c7\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c7\u02c9\7\4\2\2\u02c8\u02c0\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02cd\3\2\2\2\u02ca\u02cc\5(\25\2\u02cb\u02ca\3\2\2\2\u02cc\u02cf\3\2"+
		"\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ceO\3\2\2\2\u02cf\u02cd"+
		"\3\2\2\2\u02d0\u02d2\7+\2\2\u02d1\u02d0\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2"+
		"\u02d3\3\2\2\2\u02d3\u02e5\5\u00d8m\2\u02d4\u02d6\7\20\2\2\u02d5\u02d4"+
		"\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6\u02dc\3\2\2\2\u02d7\u02dd\5\n\6\2\u02d8"+
		"\u02dd\5\u0084C\2\u02d9\u02dd\5\u00c2b\2\u02da\u02dd\5\f\7\2\u02db\u02dd"+
		"\5\32\16\2\u02dc\u02d7\3\2\2\2\u02dc\u02d8\3\2\2\2\u02dc\u02d9\3\2\2\2"+
		"\u02dc\u02da\3\2\2\2\u02dc\u02db\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u02df"+
		"\3\2\2\2\u02de\u02e0\7\13\2\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2"+
		"\u02e0\u02e3\3\2\2\2\u02e1\u02e2\7\20\2\2\u02e2\u02e4\5\u00c2b\2\u02e3"+
		"\u02e1\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02d5\3\2"+
		"\2\2\u02e5\u02e6\3\2\2\2\u02e6Q\3\2\2\2\u02e7\u02e9\7+\2\2\u02e8\u02e7"+
		"\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea\u02eb\5\u00d8m"+
		"\2\u02eb\u02ec\7\b\2\2\u02ec\u030c\7\n\2\2\u02ed\u030a\7\20\2\2\u02ee"+
		"\u02f7\7\3\2\2\u02ef\u02f4\5\u0084C\2\u02f0\u02f1\7\17\2\2\u02f1\u02f3"+
		"\5\u0084C\2\u02f2\u02f0\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2"+
		"\2\u02f4\u02f5\3\2\2\2\u02f5\u02f8\3\2\2\2\u02f6\u02f4\3\2\2\2\u02f7\u02ef"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u0306\7\4\2\2\u02fa"+
		"\u02fb\7\b\2\2\u02fb\u0300\5\u0084C\2\u02fc\u02fd\7\17\2\2\u02fd\u02ff"+
		"\5\u0084C\2\u02fe\u02fc\3\2\2\2\u02ff\u0302\3\2\2\2\u0300\u02fe\3\2\2"+
		"\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2\2\2\u0302\u0300\3\2\2\2\u0303\u0304"+
		"\7\n\2\2\u0304\u0306\3\2\2\2\u0305\u02ee\3\2\2\2\u0305\u02fa\3\2\2\2\u0306"+
		"\u030b\3\2\2\2\u0307\u030b\5\u00c2b\2\u0308\u030b\5\u009aN\2\u0309\u030b"+
		"\5\u0084C\2\u030a\u0305\3\2\2\2\u030a\u0307\3\2\2\2\u030a\u0308\3\2\2"+
		"\2\u030a\u0309\3\2\2\2\u030b\u030d\3\2\2\2\u030c\u02ed\3\2\2\2\u030c\u030d"+
		"\3\2\2\2\u030dS\3\2\2\2\u030e\u030f\7\62\2\2\u030f\u0313\7\u009b\2\2\u0310"+
		"\u0311\5\u00dep\2\u0311\u0312\7\f\2\2\u0312\u0314\3\2\2\2\u0313\u0310"+
		"\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\3\2\2\2\u0315\u0320\5\u00e0q"+
		"\2\u0316\u0317\7\u0092\2\2\u0317\u0318\7\u009f\2\2\u0318\u0321\5\u00e6"+
		"t\2\u0319\u0321\5X-\2\u031a\u0321\5V,\2\u031b\u031d\7/\2\2\u031c\u031e"+
		"\7B\2\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0321\5j\66\2\u0320\u0316\3\2\2\2\u0320\u0319\3\2\2\2\u0320\u031a\3\2"+
		"\2\2\u0320\u031b\3\2\2\2\u0321U\3\2\2\2\u0322\u0323\7/\2\2\u0323\u0324"+
		"\7E\2\2\u0324\u0325\5\u00fe\u0080\2\u0325\u0326\5\u00a4S\2\u0326W\3\2"+
		"\2\2\u0327\u0328\7/\2\2\u0328\u0329\5\u00a4S\2\u0329Y\3\2\2\2\u032a\u032b"+
		"\7F\2\2\u032b\u032f\7\u009b\2\2\u032c\u032d\7f\2\2\u032d\u032e\7~\2\2"+
		"\u032e\u0330\7\\\2\2\u032f\u032c\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0334"+
		"\3\2\2\2\u0331\u0332\5\u00dep\2\u0332\u0333\7\f\2\2\u0333\u0335\3\2\2"+
		"\2\u0334\u0331\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0346"+
		"\5\u00e2r\2\u0337\u0338\7\r\2\2\u0338\u033f\5j\66\2\u0339\u033a\7\17\2"+
		"\2\u033a\u033e\5\u00a4S\2\u033b\u033c\7\17\2\2\u033c\u033e\5j\66\2\u033d"+
		"\u0339\3\2\2\2\u033d\u033b\3\2\2\2\u033e\u0341\3\2\2\2\u033f\u033d\3\2"+
		"\2\2\u033f\u0340\3\2\2\2\u0340\u0342\3\2\2\2\u0341\u033f\3\2\2\2\u0342"+
		"\u0343\7\16\2\2\u0343\u0347\3\2\2\2\u0344\u0345\7\65\2\2\u0345\u0347\5"+
		"d\63\2\u0346\u0337\3\2\2\2\u0346\u0344\3\2\2\2\u0347[\3\2\2\2\u0348\u0349"+
		"\7P\2\2\u0349\u034a\7a\2\2\u034a\u034d\5\u00b0Y\2\u034b\u034c\7\u00ab"+
		"\2\2\u034c\u034e\5\u0084C\2\u034d\u034b\3\2\2\2\u034d\u034e\3\2\2\2\u034e"+
		"]\3\2\2\2\u034f\u0350\7T\2\2\u0350\u0353\7\u009b\2\2\u0351\u0352\7f\2"+
		"\2\u0352\u0354\7\\\2\2\u0353\u0351\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0358"+
		"\3\2\2\2\u0355\u0356\5\u00dep\2\u0356\u0357\7\f\2\2\u0357\u0359\3\2\2"+
		"\2\u0358\u0355\3\2\2\2\u0358\u0359\3\2\2\2\u0359\u035a\3\2\2\2\u035a\u035b"+
		"\5\u00e2r\2\u035b_\3\2\2\2\u035c\u0367\5\u00c2b\2\u035d\u035e\7\u0086"+
		"\2\2\u035e\u035f\7<\2\2\u035f\u0364\5\u00b2Z\2\u0360\u0361\7\17\2\2\u0361"+
		"\u0363\5\u00b2Z\2\u0362\u0360\3\2\2\2\u0363\u0366\3\2\2\2\u0364\u0362"+
		"\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0367"+
		"\u035d\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036f\3\2\2\2\u0369\u036a\7y"+
		"\2\2\u036a\u036d\5\u0084C\2\u036b\u036c\t\4\2\2\u036c\u036e\5\u0084C\2"+
		"\u036d\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e\u0370\3\2\2\2\u036f\u0369"+
		"\3\2\2\2\u036f\u0370\3\2\2\2\u0370a\3\2\2\2\u0371\u0372\7o\2\2\u0372\u0376"+
		"\7r\2\2\u0373\u0374\5\u00dep\2\u0374\u0375\7\f\2\2\u0375\u0377\3\2\2\2"+
		"\u0376\u0373\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0384"+
		"\5\u00e2r\2\u0379\u037a\7\r\2\2\u037a\u037f\5\u00e8u\2\u037b\u037c\7\17"+
		"\2\2\u037c\u037e\5\u00e8u\2\u037d\u037b\3\2\2\2\u037e\u0381\3\2\2\2\u037f"+
		"\u037d\3\2\2\2\u037f\u0380\3\2\2\2\u0380\u0382\3\2\2\2\u0381\u037f\3\2"+
		"\2\2\u0382\u0383\7\16\2\2\u0383\u0385\3\2\2\2\u0384\u0379\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u03a5\3\2\2\2\u0386\u0387\7\u00a7\2\2\u0387\u0388"+
		"\7\r\2\2\u0388\u038d\5\u0084C\2\u0389\u038a\7\17\2\2\u038a\u038c\5\u0084"+
		"C\2\u038b\u0389\3\2\2\2\u038c\u038f\3\2\2\2\u038d\u038b\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u038d\3\2\2\2\u0390\u039f\7\16"+
		"\2\2\u0391\u0392\7\17\2\2\u0392\u0393\7\r\2\2\u0393\u0398\5\u0084C\2\u0394"+
		"\u0395\7\17\2\2\u0395\u0397\5\u0084C\2\u0396\u0394\3\2\2\2\u0397\u039a"+
		"\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039b\3\2\2\2\u039a"+
		"\u0398\3\2\2\2\u039b\u039c\7\16\2\2\u039c\u039e\3\2\2\2\u039d\u0391\3"+
		"\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a6\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a6\5d\63\2\u03a3\u03a4\7L"+
		"\2\2\u03a4\u03a6\7\u00a7\2\2\u03a5\u0386\3\2\2\2\u03a5\u03a2\3\2\2\2\u03a5"+
		"\u03a3\3\2\2\2\u03a6c\3\2\2\2\u03a7\u03b2\5f\64\2\u03a8\u03a9\7\u0086"+
		"\2\2\u03a9\u03aa\7<\2\2\u03aa\u03af\5\u00b2Z\2\u03ab\u03ac\7\17\2\2\u03ac"+
		"\u03ae\5\u00b2Z\2\u03ad\u03ab\3\2\2\2\u03ae\u03b1\3\2\2\2\u03af\u03ad"+
		"\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b3\3\2\2\2\u03b1\u03af\3\2\2\2\u03b2"+
		"\u03a8\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b3\u03ba\3\2\2\2\u03b4\u03b5\7y"+
		"\2\2\u03b5\u03b8\5\u0084C\2\u03b6\u03b7\t\4\2\2\u03b7\u03b9\5\u0084C\2"+
		"\u03b8\u03b6\3\2\2\2\u03b8\u03b9\3\2\2\2\u03b9\u03bb\3\2\2\2\u03ba\u03b4"+
		"\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bbe\3\2\2\2\u03bc\u03be\7\u0099\2\2\u03bd"+
		"\u03bf\t\5\2\2\u03be\u03bd\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u03c0\3\2"+
		"\2\2\u03c0\u03c5\5\u00b8]\2\u03c1\u03c2\7\17\2\2\u03c2\u03c4\5\u00b8]"+
		"\2\u03c3\u03c1\3\2\2\2\u03c4\u03c7\3\2\2\2\u03c5\u03c3\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u03d4\3\2\2\2\u03c7\u03c5\3\2\2\2\u03c8\u03d2\7a\2\2\u03c9"+
		"\u03ce\5\u00ba^\2\u03ca\u03cb\7\17\2\2\u03cb\u03cd\5\u00ba^\2\u03cc\u03ca"+
		"\3\2\2\2\u03cd\u03d0\3\2\2\2\u03ce\u03cc\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf"+
		"\u03d3\3\2\2\2\u03d0\u03ce\3\2\2\2\u03d1\u03d3\5\u00bc_\2\u03d2\u03c9"+
		"\3\2\2\2\u03d2\u03d1\3\2\2\2\u03d3\u03d5\3\2\2\2\u03d4\u03c8\3\2\2\2\u03d4"+
		"\u03d5\3\2\2\2\u03d5\u03d8\3\2\2\2\u03d6\u03d7\7\u00ab\2\2\u03d7\u03d9"+
		"\5\u0084C\2\u03d8\u03d6\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03e8\3\2\2"+
		"\2\u03da\u03db\7d\2\2\u03db\u03dc\7<\2\2\u03dc\u03e1\5\u0084C\2\u03dd"+
		"\u03de\7\17\2\2\u03de\u03e0\5\u0084C\2\u03df\u03dd\3\2\2\2\u03e0\u03e3"+
		"\3\2\2\2\u03e1\u03df\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2\u03e6\3\2\2\2\u03e3"+
		"\u03e1\3\2\2\2\u03e4\u03e5\7e\2\2\u03e5\u03e7\5\u0084C\2\u03e6\u03e4\3"+
		"\2\2\2\u03e6\u03e7\3\2\2\2\u03e7\u03e9\3\2\2\2\u03e8\u03da\3\2\2\2\u03e8"+
		"\u03e9\3\2\2\2\u03e9\u0407\3\2\2\2\u03ea\u03eb\7\u00a7\2\2\u03eb\u03ec"+
		"\7\r\2\2\u03ec\u03f1\5\u0084C\2\u03ed\u03ee\7\17\2\2\u03ee\u03f0\5\u0084"+
		"C\2\u03ef\u03ed\3\2\2\2\u03f0\u03f3\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f1"+
		"\u03f2\3\2\2\2\u03f2\u03f4\3\2\2\2\u03f3\u03f1\3\2\2\2\u03f4\u0403\7\16"+
		"\2\2\u03f5\u03f6\7\17\2\2\u03f6\u03f7\7\r\2\2\u03f7\u03fc\5\u0084C\2\u03f8"+
		"\u03f9\7\17\2\2\u03f9\u03fb\5\u0084C\2\u03fa\u03f8\3\2\2\2\u03fb\u03fe"+
		"\3\2\2\2\u03fc\u03fa\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe"+
		"\u03fc\3\2\2\2\u03ff\u0400\7\16\2\2\u0400\u0402\3\2\2\2\u0401\u03f5\3"+
		"\2\2\2\u0402\u0405\3\2\2\2\u0403\u0401\3\2\2\2\u0403\u0404\3\2\2\2\u0404"+
		"\u0407\3\2\2\2\u0405\u0403\3\2\2\2\u0406\u03bc\3\2\2\2\u0406\u03ea\3\2"+
		"\2\2\u0407g\3\2\2\2\u0408\u0409\7\u00a4\2\2\u0409\u040a\5\u00b0Y\2\u040a"+
		"\u040b\7\u009a\2\2\u040b\u040c\5\u00e8u\2\u040c\u040d\7\20\2\2\u040d\u0415"+
		"\5\u0084C\2\u040e\u040f\7\17\2\2\u040f\u0410\5\u00e8u\2\u0410\u0411\7"+
		"\20\2\2\u0411\u0412\5\u0084C\2\u0412\u0414\3\2\2\2\u0413\u040e\3\2\2\2"+
		"\u0414\u0417\3\2\2\2\u0415\u0413\3\2\2\2\u0415\u0416\3\2\2\2\u0416\u041a"+
		"\3\2\2\2\u0417\u0415\3\2\2\2\u0418\u0419\7\u00ab\2\2\u0419\u041b\5\u0084"+
		"C\2\u041a\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041bi\3\2\2\2\u041c\u0421"+
		"\5\u00e8u\2\u041d\u0420\5p9\2\u041e\u0420\5l\67\2\u041f\u041d\3\2\2\2"+
		"\u041f\u041e\3\2\2\2\u0420\u0423\3\2\2\2\u0421\u041f\3\2\2\2\u0421\u0422"+
		"\3\2\2\2\u0422k\3\2\2\2\u0423\u0421\3\2\2\2\u0424\u042f\5\u00d6l\2\u0425"+
		"\u0426\7\r\2\2\u0426\u0427\5n8\2\u0427\u0428\7\16\2\2\u0428\u0430\3\2"+
		"\2\2\u0429\u042a\7\r\2\2\u042a\u042b\5n8\2\u042b\u042c\7\17\2\2\u042c"+
		"\u042d\5n8\2\u042d\u042e\7\16\2\2\u042e\u0430\3\2\2\2\u042f\u0425\3\2"+
		"\2\2\u042f\u0429\3\2\2\2\u042f\u0430\3\2\2\2\u0430m\3\2\2\2\u0431\u0433"+
		"\5\u00c6d\2\u0432\u0434\5\u00fe\u0080\2\u0433\u0432\3\2\2\2\u0433\u0434"+
		"\3\2\2\2\u0434o\3\2\2\2\u0435\u0436\7E\2\2\u0436\u0438\5\u00d6l\2\u0437"+
		"\u0435\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u0445\3\2\2\2\u0439\u0446\5r"+
		":\2\u043a\u0446\5t;\2\u043b\u0446\5v<\2\u043c\u0446\5x=\2\u043d\u043e"+
		"\7@\2\2\u043e\u043f\7\r\2\2\u043f\u0440\5\u0084C\2\u0440\u0441\7\16\2"+
		"\2\u0441\u0446\3\2\2\2\u0442\u0446\5z>\2\u0443\u0444\7A\2\2\u0444\u0446"+
		"\5\u00eav\2\u0445\u0439\3\2\2\2\u0445\u043a\3\2\2\2\u0445\u043b\3\2\2"+
		"\2\u0445\u043c\3\2\2\2\u0445\u043d\3\2\2\2\u0445\u0442\3\2\2\2\u0445\u0443"+
		"\3\2\2\2\u0446q\3\2\2\2\u0447\u0448\7\u008a\2\2\u0448\u044a\7v\2\2\u0449"+
		"\u044b\t\6\2\2\u044a\u0449\3\2\2\2\u044a\u044b\3\2\2\2\u044b\u044d\3\2"+
		"\2\2\u044c\u044e\78\2\2\u044d\u044c\3\2\2\2\u044d\u044e\3\2\2\2\u044e"+
		"s\3\2\2\2\u044f\u0450\5\u009cO\2\u0450u\3\2\2\2\u0451\u0452\7~\2\2\u0452"+
		"\u0453\7\u0080\2\2\u0453w\3\2\2\2\u0454\u0455\7\u0080\2\2\u0455y\3\2\2"+
		"\2\u0456\u0462\7L\2\2\u0457\u0463\5|?\2\u0458\u0459\7\r\2\2\u0459\u045a"+
		"\5\u0084C\2\u045a\u045b\7\16\2\2\u045b\u0463\3\2\2\2\u045c\u045d\7|\2"+
		"\2\u045d\u045e\7\r\2\2\u045e\u045f\5\u0084C\2\u045f\u0460\7\16\2\2\u0460"+
		"\u0463\3\2\2\2\u0461\u0463\5\u00fe\u0080\2\u0462\u0457\3\2\2\2\u0462\u0458"+
		"\3\2\2\2\u0462\u045c\3\2\2\2\u0462\u0461\3\2\2\2\u0463\u046a\3\2\2\2\u0464"+
		"\u0466\7\'\2\2\u0465\u0467\5\u00fe\u0080\2\u0466\u0465\3\2\2\2\u0467\u0468"+
		"\3\2\2\2\u0468\u0466\3\2\2\2\u0468\u0469\3\2\2\2\u0469\u046b\3\2\2\2\u046a"+
		"\u0464\3\2\2\2\u046a\u046b\3\2\2\2\u046b{\3\2\2\2\u046c\u046f\5\u00c6"+
		"d\2\u046d\u046f\5\u00c8e\2\u046e\u046c\3\2\2\2\u046e\u046d\3\2\2\2\u046f"+
		"}\3\2\2\2\u0470\u0471\5\u00dan\2\u0471\u0473\7\r\2\2\u0472\u0474\5\u0080"+
		"A\2\u0473\u0472\3\2\2\2\u0473\u0474\3\2\2\2\u0474\u0475\3\2\2\2\u0475"+
		"\u0476\7\16\2\2\u0476\177\3\2\2\2\u0477\u0479\7S\2\2\u0478\u0477\3\2\2"+
		"\2\u0478\u0479\3\2\2\2\u0479\u047b\3\2\2\2\u047a\u047c\7+\2\2\u047b\u047a"+
		"\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u0480\5\u00d8m"+
		"\2\u047e\u047f\7\20\2\2\u047f\u0481\5\u0084C\2\u0480\u047e\3\2\2\2\u0480"+
		"\u0481\3\2\2\2\u0481\u0485\3\2\2\2\u0482\u0484\5\u0082B\2\u0483\u0482"+
		"\3\2\2\2\u0484\u0487\3\2\2\2\u0485\u0483\3\2\2\2\u0485\u0486\3\2\2\2\u0486"+
		"\u0081\3\2\2\2\u0487\u0485\3\2\2\2\u0488\u048a\7\17\2\2\u0489\u048b\7"+
		"+\2\2\u048a\u0489\3\2\2\2\u048a\u048b\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"\u048f\5\u00d8m\2\u048d\u048e\7\20\2\2\u048e\u0490\5\u0084C\2\u048f\u048d"+
		"\3\2\2\2\u048f\u0490\3\2\2\2\u0490\u0083\3\2\2\2\u0491\u0492\bC\1\2\u0492"+
		"\u04a7\5\u00c8e\2\u0493\u04a7\5\u0094K\2\u0494\u04a7\5\u0098M\2\u0495"+
		"\u04a7\5\u0096L\2\u0496\u04a7\5\u009aN\2\u0497\u04a7\5\u008aF\2\u0498"+
		"\u04a7\5\u008cG\2\u0499\u049c\7$\2\2\u049a\u049c\7%\2\2\u049b\u0499\3"+
		"\2\2\2\u049b\u049a\3\2\2\2\u049c\u04a7\3\2\2\2\u049d\u04a7\5\u008eH\2"+
		"\u049e\u049f\7\r\2\2\u049f\u04a0\5\u0084C\2\u04a0\u04a1\7\16\2\2\u04a1"+
		"\u04a7\3\2\2\2\u04a2\u04a3\7\b\2\2\u04a3\u04a4\5\u0084C\2\u04a4\u04a5"+
		"\7\n\2\2\u04a5\u04a7\3\2\2\2\u04a6\u0491\3\2\2\2\u04a6\u0493\3\2\2\2\u04a6"+
		"\u0494\3\2\2\2\u04a6\u0495\3\2\2\2\u04a6\u0496\3\2\2\2\u04a6\u0497\3\2"+
		"\2\2\u04a6\u0498\3\2\2\2\u04a6\u049b\3\2\2\2\u04a6\u049d\3\2\2\2\u04a6"+
		"\u049e\3\2\2\2\u04a6\u04a2\3\2\2\2\u04a7\u04bc\3\2\2\2\u04a8\u04a9\f\f"+
		"\2\2\u04a9\u04aa\5\u0086D\2\u04aa\u04ab\5\u0084C\r\u04ab\u04bb\3\2\2\2"+
		"\u04ac\u04b0\f\13\2\2\u04ad\u04af\5\u0088E\2\u04ae\u04ad\3\2\2\2\u04af"+
		"\u04b2\3\2\2\2\u04b0\u04ae\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u04b3\3\2"+
		"\2\2\u04b2\u04b0\3\2\2\2\u04b3\u04bb\5\u0084C\f\u04b4\u04b5\f\b\2\2\u04b5"+
		"\u04bb\t\7\2\2\u04b6\u04b7\f\7\2\2\u04b7\u04bb\t\b\2\2\u04b8\u04b9\f\3"+
		"\2\2\u04b9\u04bb\5\u0090I\2\u04ba\u04a8\3\2\2\2\u04ba\u04ac\3\2\2\2\u04ba"+
		"\u04b4\3\2\2\2\u04ba\u04b6\3\2\2\2\u04ba\u04b8\3\2\2\2\u04bb\u04be\3\2"+
		"\2\2\u04bc\u04ba\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u0085\3\2\2\2\u04be"+
		"\u04bc\3\2\2\2\u04bf\u04d7\7\u0085\2\2\u04c0\u04d7\7\64\2\2\u04c1\u04ce"+
		"\7\20\2\2\u04c2\u04ce\7!\2\2\u04c3\u04ce\7\"\2\2\u04c4\u04ce\7#\2\2\u04c5"+
		"\u04ce\7s\2\2\u04c6\u04c7\7s\2\2\u04c7\u04ce\7~\2\2\u04c8\u04ce\7j\2\2"+
		"\u04c9\u04ce\7x\2\2\u04ca\u04ce\7c\2\2\u04cb\u04ce\7z\2\2\u04cc\u04ce"+
		"\7\u008f\2\2\u04cd\u04c1\3\2\2\2\u04cd\u04c2\3\2\2\2\u04cd\u04c3\3\2\2"+
		"\2\u04cd\u04c4\3\2\2\2\u04cd\u04c5\3\2\2\2\u04cd\u04c6\3\2\2\2\u04cd\u04c8"+
		"\3\2\2\2\u04cd\u04c9\3\2\2\2\u04cd\u04ca\3\2\2\2\u04cd\u04cb\3\2\2\2\u04cd"+
		"\u04cc\3\2\2\2\u04ce\u04d7\3\2\2\2\u04cf\u04d7\t\t\2\2\u04d0\u04d7\t\n"+
		"\2\2\u04d1\u04d7\t\7\2\2\u04d2\u04d7\t\13\2\2\u04d3\u04d7\7\33\2\2\u04d4"+
		"\u04d7\7\25\2\2\u04d5\u04d7\7\20\2\2\u04d6\u04bf\3\2\2\2\u04d6\u04c0\3"+
		"\2\2\2\u04d6\u04cd\3\2\2\2\u04d6\u04cf\3\2\2\2\u04d6\u04d0\3\2\2\2\u04d6"+
		"\u04d1\3\2\2\2\u04d6\u04d2\3\2\2\2\u04d6\u04d3\3\2\2\2\u04d6\u04d4\3\2"+
		"\2\2\u04d6\u04d5\3\2\2\2\u04d7\u0087\3\2\2\2\u04d8\u04d9\t\f\2\2\u04d9"+
		"\u0089\3\2\2\2\u04da\u04db\7&\2\2\u04db\u04df\5\u0084C\2\u04dc\u04dd\7"+
		"\f\2\2\u04dd\u04df\5\u0084C\2\u04de\u04da\3\2\2\2\u04de\u04dc\3\2\2\2"+
		"\u04df\u008b\3\2\2\2\u04e0\u04e1\t\r\2\2\u04e1\u008d\3\2\2\2\u04e2\u04e4"+
		"\7~\2\2\u04e3\u04e2\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\3\2\2\2\u04e5"+
		"\u04e7\7\\\2\2\u04e6\u04e3\3\2\2\2\u04e6\u04e7\3\2\2\2\u04e7\u04e8\3\2"+
		"\2\2\u04e8\u04e9\7\r\2\2\u04e9\u04ea\5d\63\2\u04ea\u04eb\7\16\2\2\u04eb"+
		"\u008f\3\2\2\2\u04ec\u04ee\7~\2\2\u04ed\u04ec\3\2\2\2\u04ed\u04ee\3\2"+
		"\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\7j\2\2\u04f0\u04f1\5\u0092J\2\u04f1"+
		"\u0091\3\2\2\2\u04f2\u04fc\7\r\2\2\u04f3\u04fd\5d\63\2\u04f4\u04f9\5\u0084"+
		"C\2\u04f5\u04f6\7\17\2\2\u04f6\u04f8\5\u0084C\2\u04f7\u04f5\3\2\2\2\u04f8"+
		"\u04fb\3\2\2\2\u04f9\u04f7\3\2\2\2\u04f9\u04fa\3\2\2\2\u04fa\u04fd\3\2"+
		"\2\2\u04fb\u04f9\3\2\2\2\u04fc\u04f3\3\2\2\2\u04fc\u04f4\3\2\2\2\u04fc"+
		"\u04fd\3\2\2\2\u04fd\u04fe\3\2\2\2\u04fe\u0506\7\16\2\2\u04ff\u0500\5"+
		"\u00dep\2\u0500\u0501\7\f\2\2\u0501\u0503\3\2\2\2\u0502\u04ff\3\2\2\2"+
		"\u0502\u0503\3\2\2\2\u0503\u0504\3\2\2\2\u0504\u0506\5\u00e2r\2\u0505"+
		"\u04f2\3\2\2\2\u0505\u0502\3\2\2\2\u0506\u0093\3\2\2\2\u0507\u0508\7\u00b5"+
		"\2\2\u0508\u0095\3\2\2\2\u0509\u050a\5\u00dep\2\u050a\u050b\7\f\2\2\u050b"+
		"\u050d\3\2\2\2\u050c\u0509\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e\3\2"+
		"\2\2\u050e\u050f\5\u00e2r\2\u050f\u0510\7\f\2\2\u0510\u0512\3\2\2\2\u0511"+
		"\u050c\3\2\2\2\u0512\u0515\3\2\2\2\u0513\u0511\3\2\2\2\u0513\u0514\3\2"+
		"\2\2\u0514\u0516\3\2\2\2\u0515\u0513\3\2\2\2\u0516\u0517\5\u00e8u\2\u0517"+
		"\u0097\3\2\2\2\u0518\u0519\5\u00caf\2\u0519\u051a\5\u0084C\2\u051a\u0099"+
		"\3\2\2\2\u051b\u051c\5\u00dan\2\u051c\u0529\7\r\2\2\u051d\u051f\7S\2\2"+
		"\u051e\u051d\3\2\2\2\u051e\u051f\3\2\2\2\u051f\u0520\3\2\2\2\u0520\u0525"+
		"\5\u0084C\2\u0521\u0522\7\17\2\2\u0522\u0524\5\u0084C\2\u0523\u0521\3"+
		"\2\2\2\u0524\u0527\3\2\2\2\u0525\u0523\3\2\2\2\u0525\u0526\3\2\2\2\u0526"+
		"\u052a\3\2\2\2\u0527\u0525\3\2\2\2\u0528\u052a\7\21\2\2\u0529\u051e\3"+
		"\2\2\2\u0529\u0528\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u052b\3\2\2\2\u052b"+
		"\u052c\7\16\2\2\u052c\u009b\3\2\2\2\u052d\u0531\7\u008e\2\2\u052e\u052f"+
		"\5\u00dep\2\u052f\u0530\7\f\2\2\u0530\u0532\3\2\2\2\u0531\u052e\3\2\2"+
		"\2\u0531\u0532\3\2\2\2\u0532\u0533\3\2\2\2\u0533\u053f\5\u00ecw\2\u0534"+
		"\u0535\7\r\2\2\u0535\u053a\5\u00a0Q\2\u0536\u0537\7\17\2\2\u0537\u0539"+
		"\5\u00a0Q\2\u0538\u0536\3\2\2\2\u0539\u053c\3\2\2\2\u053a\u0538\3\2\2"+
		"\2\u053a\u053b\3\2\2\2\u053b\u053d\3\2\2\2\u053c\u053a\3\2\2\2\u053d\u053e"+
		"\7\16\2\2\u053e\u0540\3\2\2\2\u053f\u0534\3\2\2\2\u053f\u0540\3\2\2\2"+
		"\u0540\u0544\3\2\2\2\u0541\u0543\5\u009eP\2\u0542\u0541\3\2\2\2\u0543"+
		"\u0546\3\2\2\2\u0544\u0542\3\2\2\2\u0544\u0545\3\2\2\2\u0545\u0554\3\2"+
		"\2\2\u0546\u0544\3\2\2\2\u0547\u0549\7~\2\2\u0548\u0547\3\2\2\2\u0548"+
		"\u0549\3\2\2\2\u0549\u054a\3\2\2\2\u054a\u054f\7N\2\2\u054b\u054c\7m\2"+
		"\2\u054c\u0550\7O\2\2\u054d\u054e\7m\2\2\u054e\u0550\7i\2\2\u054f\u054b"+
		"\3\2\2\2\u054f\u054d\3\2\2\2\u054f\u0550\3\2\2\2\u0550\u0552\3\2\2\2\u0551"+
		"\u0553\7X\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0555\3\2"+
		"\2\2\u0554\u0548\3\2\2\2\u0554\u0555\3\2\2\2\u0555\u009d\3\2\2\2\u0556"+
		"\u0557\7\u0083\2\2\u0557\u0560\t\16\2\2\u0558\u0559\7\u009a\2\2\u0559"+
		"\u0561\7\u0080\2\2\u055a\u055b\7\u009a\2\2\u055b\u0561\7L\2\2\u055c\u0561"+
		"\7=\2\2\u055d\u0561\7\u0094\2\2\u055e\u055f\7}\2\2\u055f\u0561\7.\2\2"+
		"\u0560\u0558\3\2\2\2\u0560\u055a\3\2\2\2\u0560\u055c\3\2\2\2\u0560\u055d"+
		"\3\2\2\2\u0560\u055e\3\2\2\2\u0561\u0565\3\2\2\2\u0562\u0563\7z\2\2\u0563"+
		"\u0565\5\u00d6l\2\u0564\u0556\3\2\2\2\u0564\u0562\3\2\2\2\u0565\u009f"+
		"\3\2\2\2\u0566\u0567\5\u00d6l\2\u0567\u00a1\3\2\2\2\u0568\u056b\5\u00e8"+
		"u\2\u0569\u056a\7A\2\2\u056a\u056c\5\u00eav\2\u056b\u0569\3\2\2\2\u056b"+
		"\u056c\3\2\2\2\u056c\u056e\3\2\2\2\u056d\u056f\t\6\2\2\u056e\u056d\3\2"+
		"\2\2\u056e\u056f\3\2\2\2\u056f\u00a3\3\2\2\2\u0570\u0571\7E\2\2\u0571"+
		"\u0573\5\u00d6l\2\u0572\u0570\3\2\2\2\u0572\u0573\3\2\2\2\u0573\u057d"+
		"\3\2\2\2\u0574\u057e\5\u00a6T\2\u0575\u057e\5\u00acW\2\u0576\u057e\5\u00aa"+
		"V\2\u0577\u0578\7@\2\2\u0578\u0579\7\r\2\2\u0579\u057a\5\u0084C\2\u057a"+
		"\u057b\7\16\2\2\u057b\u057e\3\2\2\2\u057c\u057e\5\u00a8U\2\u057d\u0574"+
		"\3\2\2\2\u057d\u0575\3\2\2\2\u057d\u0576\3\2\2\2\u057d\u0577\3\2\2\2\u057d"+
		"\u057c\3\2\2\2\u057e\u00a5\3\2\2\2\u057f\u0580\7\u008a\2\2\u0580\u0581"+
		"\7v\2\2\u0581\u0582\7\r\2\2\u0582\u0587\5\u00a2R\2\u0583\u0584\7\17\2"+
		"\2\u0584\u0586\5\u00a2R\2\u0585\u0583\3\2\2\2\u0586\u0589\3\2\2\2\u0587"+
		"\u0585\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058a\3\2\2\2\u0589\u0587\3\2"+
		"\2\2\u058a\u058b\7\16\2\2\u058b\u00a7\3\2\2\2\u058c\u058d\7`\2\2\u058d"+
		"\u058e\7v\2\2\u058e\u058f\7\r\2\2\u058f\u0594\5\u00aeX\2\u0590\u0591\7"+
		"\17\2\2\u0591\u0593\5\u00aeX\2\u0592\u0590\3\2\2\2\u0593\u0596\3\2\2\2"+
		"\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u0597\3\2\2\2\u0596\u0594"+
		"\3\2\2\2\u0597\u0598\7\16\2\2\u0598\u0599\5\u009cO\2\u0599\u00a9\3\2\2"+
		"\2\u059a\u059c\7\u00a3\2\2\u059b\u059d\7v\2\2\u059c\u059b\3\2\2\2\u059c"+
		"\u059d\3\2\2\2\u059d\u059f\3\2\2\2\u059e\u05a0\5\u00d6l\2\u059f\u059e"+
		"\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a1\3\2\2\2\u05a1\u05a2\7\r\2\2\u05a2"+
		"\u05a7\5\u00a2R\2\u05a3\u05a4\7\17\2\2\u05a4\u05a6\5\u00a2R\2\u05a5\u05a3"+
		"\3\2\2\2\u05a6\u05a9\3\2\2\2\u05a7\u05a5\3\2\2\2\u05a7\u05a8\3\2\2\2\u05a8"+
		"\u05aa\3\2\2\2\u05a9\u05a7\3\2\2\2\u05aa\u05ab\7\16\2\2\u05ab\u00ab\3"+
		"\2\2\2\u05ac\u05ae\7v\2\2\u05ad\u05af\5\u00d6l\2\u05ae\u05ad\3\2\2\2\u05ae"+
		"\u05af\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\7\r\2\2\u05b1\u05b6\5\u00a2"+
		"R\2\u05b2\u05b3\7\17\2\2\u05b3\u05b5\5\u00a2R\2\u05b4\u05b2\3\2\2\2\u05b5"+
		"\u05b8\3\2\2\2\u05b6\u05b4\3\2\2\2\u05b6\u05b7\3\2\2\2\u05b7\u05b9\3\2"+
		"\2\2\u05b8\u05b6\3\2\2\2\u05b9\u05ba\7\16\2\2\u05ba\u00ad\3\2\2\2\u05bb"+
		"\u05bc\5\u00e8u\2\u05bc\u00af\3\2\2\2\u05bd\u05be\5\u00dep\2\u05be\u05bf"+
		"\7\f\2\2\u05bf\u05c1\3\2\2\2\u05c0\u05bd\3\2\2\2\u05c0\u05c1\3\2\2\2\u05c1"+
		"\u05c2\3\2\2\2\u05c2\u05c8\5\u00e2r\2\u05c3\u05c4\7l\2\2\u05c4\u05c5\7"+
		"<\2\2\u05c5\u05c9\5\u00eex\2\u05c6\u05c7\7~\2\2\u05c7\u05c9\7l\2\2\u05c8"+
		"\u05c3\3\2\2\2\u05c8\u05c6\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u00b1\3\2"+
		"\2\2\u05ca\u05cd\5\u0084C\2\u05cb\u05cc\7A\2\2\u05cc\u05ce\5\u00eav\2"+
		"\u05cd\u05cb\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05d1"+
		"\t\6\2\2\u05d0\u05cf\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u00b3\3\2\2\2\u05d2"+
		"\u05d6\5\u00c6d\2\u05d3\u05d6\5\u00d6l\2\u05d4\u05d6\7\u00b8\2\2\u05d5"+
		"\u05d2\3\2\2\2\u05d5\u05d3\3\2\2\2\u05d5\u05d4\3\2\2\2\u05d6\u00b5\3\2"+
		"\2\2\u05d7\u05e3\5\u00e2r\2\u05d8\u05d9\7\r\2\2\u05d9\u05de\5\u00e8u\2"+
		"\u05da\u05db\7\17\2\2\u05db\u05dd\5\u00e8u\2\u05dc\u05da\3\2\2\2\u05dd"+
		"\u05e0\3\2\2\2\u05de\u05dc\3\2\2\2\u05de\u05df\3\2\2\2\u05df\u05e1\3\2"+
		"\2\2\u05e0\u05de\3\2\2\2\u05e1\u05e2\7\16\2\2\u05e2\u05e4\3\2\2\2\u05e3"+
		"\u05d8\3\2\2\2\u05e3\u05e4\3\2\2\2\u05e4\u05e5\3\2\2\2\u05e5\u05e6\7\65"+
		"\2\2\u05e6\u05e7\7\r\2\2\u05e7\u05e8\5d\63\2\u05e8\u05e9\7\16\2\2\u05e9"+
		"\u00b7\3\2\2\2\u05ea\u05f7\7\21\2\2\u05eb\u05ec\5\u00e2r\2\u05ec\u05ed"+
		"\7\f\2\2\u05ed\u05ee\7\21\2\2\u05ee\u05f7\3\2\2\2\u05ef\u05f4\5\u0084"+
		"C\2\u05f0\u05f2\7\65\2\2\u05f1\u05f0\3\2\2\2\u05f1\u05f2\3\2\2\2\u05f2"+
		"\u05f3\3\2\2\2\u05f3\u05f5\5\u00d0i\2\u05f4\u05f1\3\2\2\2\u05f4\u05f5"+
		"\3\2\2\2\u05f5\u05f7\3\2\2\2\u05f6\u05ea\3\2\2\2\u05f6\u05eb\3\2\2\2\u05f6"+
		"\u05ef\3\2\2\2\u05f7\u00b9\3\2\2\2\u05f8\u05f9\5\u00dep\2\u05f9\u05fa"+
		"\7\f\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05f8\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc"+
		"\u05fd\3\2\2\2\u05fd\u0602\5\u00e2r\2\u05fe\u0600\7\65\2\2\u05ff\u05fe"+
		"\3\2\2\2\u05ff\u0600\3\2\2\2\u0600\u0601\3\2\2\2\u0601\u0603\5\u00fa~"+
		"\2\u0602\u05ff\3\2\2\2\u0602\u0603\3\2\2\2\u0603\u0609\3\2\2\2\u0604\u0605"+
		"\7l\2\2\u0605\u0606\7<\2\2\u0606\u060a\5\u00eex\2\u0607\u0608\7~\2\2\u0608"+
		"\u060a\7l\2\2\u0609\u0604\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u060a\3\2"+
		"\2\2\u060a\u0628\3\2\2\2\u060b\u0615\7\r\2\2\u060c\u0611\5\u00ba^\2\u060d"+
		"\u060e\7\17\2\2\u060e\u0610\5\u00ba^\2\u060f\u060d\3\2\2\2\u0610\u0613"+
		"\3\2\2\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0616\3\2\2\2\u0613"+
		"\u0611\3\2\2\2\u0614\u0616\5\u00bc_\2\u0615\u060c\3\2\2\2\u0615\u0614"+
		"\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u061c\7\16\2\2\u0618\u061a\7\65\2\2"+
		"\u0619\u0618\3\2\2\2\u0619\u061a\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u061d"+
		"\5\u00fa~\2\u061c\u0619\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u0628\3\2\2"+
		"\2\u061e\u061f\7\r\2\2\u061f\u0620\5d\63\2\u0620\u0625\7\16\2\2\u0621"+
		"\u0623\7\65\2\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0624\3"+
		"\2\2\2\u0624\u0626\5\u00fa~\2\u0625\u0622\3\2\2\2\u0625\u0626\3\2\2\2"+
		"\u0626\u0628\3\2\2\2\u0627\u05fb\3\2\2\2\u0627\u060b\3\2\2\2\u0627\u061e"+
		"\3\2\2\2\u0628\u00bb\3\2\2\2\u0629\u0630\5\u00ba^\2\u062a\u062b\5\u00be"+
		"`\2\u062b\u062c\5\u00ba^\2\u062c\u062d\5\u00c0a\2\u062d\u062f\3\2\2\2"+
		"\u062e\u062a\3\2\2\2\u062f\u0632\3\2\2\2\u0630\u062e\3\2\2\2\u0630\u0631"+
		"\3\2\2\2\u0631\u00bd\3\2\2\2\u0632\u0630\3\2\2\2\u0633\u0639\7\17\2\2"+
		"\u0634\u0636\7w\2\2\u0635\u0637\7\u0087\2\2\u0636\u0635\3\2\2\2\u0636"+
		"\u0637\3\2\2\2\u0637\u063a\3\2\2\2\u0638\u063a\7n\2\2\u0639\u0634\3\2"+
		"\2\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2\2\2\u063a\u063b\3\2\2\2\u063b"+
		"\u063c\7u\2\2\u063c\u00bf\3\2\2\2\u063d\u063e\7\u0083\2\2\u063e\u0640"+
		"\5\u0084C\2\u063f\u063d\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u00c1\3\2\2"+
		"\2\u0641\u0643\7\u0099\2\2\u0642\u0644\t\5\2\2\u0643\u0642\3\2\2\2\u0643"+
		"\u0644\3\2\2\2\u0644\u0645\3\2\2\2\u0645\u064a\5\u00b8]\2\u0646\u0647"+
		"\7\17\2\2\u0647\u0649\5\u00b8]\2\u0648\u0646\3\2\2\2\u0649\u064c\3\2\2"+
		"\2\u064a\u0648\3\2\2\2\u064a\u064b\3\2\2\2\u064b\u0659\3\2\2\2\u064c\u064a"+
		"\3\2\2\2\u064d\u0657\7a\2\2\u064e\u0653\5\u00ba^\2\u064f\u0650\7\17\2"+
		"\2\u0650\u0652\5\u00ba^\2\u0651\u064f\3\2\2\2\u0652\u0655\3\2\2\2\u0653"+
		"\u0651\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0658\3\2\2\2\u0655\u0653\3\2"+
		"\2\2\u0656\u0658\5\u00bc_\2\u0657\u064e\3\2\2\2\u0657\u0656\3\2\2\2\u0658"+
		"\u065a\3\2\2\2\u0659\u064d\3\2\2\2\u0659\u065a\3\2\2\2\u065a\u065d\3\2"+
		"\2\2\u065b\u065c\7\u00ab\2\2\u065c\u065e\5\u0084C\2\u065d\u065b\3\2\2"+
		"\2\u065d\u065e\3\2\2\2\u065e\u066d\3\2\2\2\u065f\u0660\7d\2\2\u0660\u0661"+
		"\7<\2\2\u0661\u0666\5\u0084C\2\u0662\u0663\7\17\2\2\u0663\u0665\5\u0084"+
		"C\2\u0664\u0662\3\2\2\2\u0665\u0668\3\2\2\2\u0666\u0664\3\2\2\2\u0666"+
		"\u0667\3\2\2\2\u0667\u066b\3\2\2\2\u0668\u0666\3\2\2\2\u0669\u066a\7e"+
		"\2\2\u066a\u066c\5\u0084C\2\u066b\u0669\3\2\2\2\u066b\u066c\3\2\2\2\u066c"+
		"\u066e\3\2\2\2\u066d\u065f\3\2\2\2\u066d\u066e\3\2\2\2\u066e\u068c\3\2"+
		"\2\2\u066f\u0670\7\u00a7\2\2\u0670\u0671\7\r\2\2\u0671\u0676\5\u0084C"+
		"\2\u0672\u0673\7\17\2\2\u0673\u0675\5\u0084C\2\u0674\u0672\3\2\2\2\u0675"+
		"\u0678\3\2\2\2\u0676\u0674\3\2\2\2\u0676\u0677\3\2\2\2\u0677\u0679\3\2"+
		"\2\2\u0678\u0676\3\2\2\2\u0679\u0688\7\16\2\2\u067a\u067b\7\17\2\2\u067b"+
		"\u067c\7\r\2\2\u067c\u0681\5\u0084C\2\u067d\u067e\7\17\2\2\u067e\u0680"+
		"\5\u0084C\2\u067f\u067d\3\2\2\2\u0680\u0683\3\2\2\2\u0681\u067f\3\2\2"+
		"\2\u0681\u0682\3\2\2\2\u0682\u0684\3\2\2\2\u0683\u0681\3\2\2\2\u0684\u0685"+
		"\7\16\2\2\u0685\u0687\3\2\2\2\u0686\u067a\3\2\2\2\u0687\u068a\3\2\2\2"+
		"\u0688\u0686\3\2\2\2\u0688\u0689\3\2\2\2\u0689\u068c\3\2\2\2\u068a\u0688"+
		"\3\2\2\2\u068b\u0641\3\2\2\2\u068b\u066f\3\2\2\2\u068c\u00c3\3\2\2\2\u068d"+
		"\u0699\5\u00e2r\2\u068e\u068f\7\r\2\2\u068f\u0694\5\u00e8u\2\u0690\u0691"+
		"\7\17\2\2\u0691\u0693\5\u00e8u\2\u0692\u0690\3\2\2\2\u0693\u0696\3\2\2"+
		"\2\u0694\u0692\3\2\2\2\u0694\u0695\3\2\2\2\u0695\u0697\3\2\2\2\u0696\u0694"+
		"\3\2\2\2\u0697\u0698\7\16\2\2\u0698\u069a\3\2\2\2\u0699\u068e\3\2\2\2"+
		"\u0699\u069a\3\2\2\2\u069a\u00c5\3\2\2\2\u069b\u069d\t\7\2\2\u069c\u069b"+
		"\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069e\3\2\2\2\u069e\u06a1\7\u00b6\2"+
		"\2\u069f\u06a1\7\21\2\2\u06a0\u069c\3\2\2\2\u06a0\u069f\3\2\2\2\u06a1"+
		"\u00c7\3\2\2\2\u06a2\u06a3\t\17\2\2\u06a3\u00c9\3\2\2\2\u06a4\u06a5\t"+
		"\20\2\2\u06a5\u00cb\3\2\2\2\u06a6\u06a7\7\u00b8\2\2\u06a7\u00cd\3\2\2"+
		"\2\u06a8\u06ab\5\u0084C\2\u06a9\u06ab\5j\66\2\u06aa\u06a8\3\2\2\2\u06aa"+
		"\u06a9\3\2\2\2\u06ab\u00cf\3\2\2\2\u06ac\u06ad\t\21\2\2\u06ad\u00d1\3"+
		"\2\2\2\u06ae\u06af\t\22\2\2\u06af\u00d3\3\2\2\2\u06b0\u06b2\13\2\2\2\u06b1"+
		"\u06b0\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06b4\3\2\2\2\u06b3\u06b1\3\2"+
		"\2\2\u06b4\u00d5\3\2\2\2\u06b5\u06b6\5\u00fe\u0080\2\u06b6\u00d7\3\2\2"+
		"\2\u06b7\u06b8\5\u00fe\u0080\2\u06b8\u00d9\3\2\2\2\u06b9\u06ba\5\u00fe"+
		"\u0080\2\u06ba\u00db\3\2\2\2\u06bb\u06bc\5\u00fe\u0080\2\u06bc\u00dd\3"+
		"\2\2\2\u06bd\u06be\5\u00fe\u0080\2\u06be\u00df\3\2\2\2\u06bf\u06c0\5\u00fe"+
		"\u0080\2\u06c0\u00e1\3\2\2\2\u06c1\u06c2\5\u00fe\u0080\2\u06c2\u00e3\3"+
		"\2\2\2\u06c3\u06c4\5\u00fe\u0080\2\u06c4\u00e5\3\2\2\2\u06c5\u06c6\5\u00fe"+
		"\u0080\2\u06c6\u00e7\3\2\2\2\u06c7\u06c8\5\u00fe\u0080\2\u06c8\u00e9\3"+
		"\2\2\2\u06c9\u06ca\5\u00fe\u0080\2\u06ca\u00eb\3\2\2\2\u06cb\u06cc\5\u00fe"+
		"\u0080\2\u06cc\u00ed\3\2\2\2\u06cd\u06ce\5\u00fe\u0080\2\u06ce\u00ef\3"+
		"\2\2\2\u06cf\u06d0\5\u00fe\u0080\2\u06d0\u00f1\3\2\2\2\u06d1\u06d2\5\u00fe"+
		"\u0080\2\u06d2\u00f3\3\2\2\2\u06d3\u06d4\5\u00fe\u0080\2\u06d4\u00f5\3"+
		"\2\2\2\u06d5\u06d6\5\u00fe\u0080\2\u06d6\u00f7\3\2\2\2\u06d7\u06d8\5\u00fe"+
		"\u0080\2\u06d8\u00f9\3\2\2\2\u06d9\u06da\5\u00fe\u0080\2\u06da\u00fb\3"+
		"\2\2\2\u06db\u06dc\5\u00fe\u0080\2\u06dc\u00fd\3\2\2\2\u06dd\u06e4\7\u00b5"+
		"\2\2\u06de\u06e4\7\u00b8\2\2\u06df\u06e0\7\r\2\2\u06e0\u06e1\5\u00fe\u0080"+
		"\2\u06e1\u06e2\7\16\2\2\u06e2\u06e4\3\2\2\2\u06e3\u06dd\3\2\2\2\u06e3"+
		"\u06de\3\2\2\2\u06e3\u06df\3\2\2\2\u06e4\u00ff\3\2\2\2\u06e5\u06e6\7\u00b5"+
		"\2\2\u06e6\u0101\3\2\2\2\u00e2\u0106\u0108\u0113\u011a\u011f\u0125\u012f"+
		"\u0138\u0149\u014c\u0150\u0155\u015d\u0165\u016a\u016e\u0173\u017b\u0180"+
		"\u0184\u018c\u0194\u0199\u01a4\u01a8\u01af\u01b4\u01c4\u01ce\u01d5\u01d9"+
		"\u01dc\u01e1\u01e4\u01e9\u01f0\u01f8\u01fb\u0206\u020b\u0211\u0214\u021d"+
		"\u0221\u0224\u022f\u0236\u0246\u0253\u0257\u025b\u025f\u0264\u0277\u027c"+
		"\u0286\u028c\u0291\u029f\u02a6\u02a9\u02b0\u02c4\u02c8\u02cd\u02d1\u02d5"+
		"\u02dc\u02df\u02e3\u02e5\u02e8\u02f4\u02f7\u0300\u0305\u030a\u030c\u0313"+
		"\u031d\u0320\u032f\u0334\u033d\u033f\u0346\u034d\u0353\u0358\u0364\u0367"+
		"\u036d\u036f\u0376\u037f\u0384\u038d\u0398\u039f\u03a5\u03af\u03b2\u03b8"+
		"\u03ba\u03be\u03c5\u03ce\u03d2\u03d4\u03d8\u03e1\u03e6\u03e8\u03f1\u03fc"+
		"\u0403\u0406\u0415\u041a\u041f\u0421\u042f\u0433\u0437\u0445\u044a\u044d"+
		"\u0462\u0468\u046a\u046e\u0473\u0478\u047b\u0480\u0485\u048a\u048f\u049b"+
		"\u04a6\u04b0\u04ba\u04bc\u04cd\u04d6\u04de\u04e3\u04e6\u04ed\u04f9\u04fc"+
		"\u0502\u0505\u050c\u0513\u051e\u0525\u0529\u0531\u053a\u053f\u0544\u0548"+
		"\u054f\u0552\u0554\u0560\u0564\u056b\u056e\u0572\u057d\u0587\u0594\u059c"+
		"\u059f\u05a7\u05ae\u05b6\u05c0\u05c8\u05cd\u05d0\u05d5\u05de\u05e3\u05f1"+
		"\u05f4\u05f6\u05fb\u05ff\u0602\u0609\u0611\u0615\u0619\u061c\u0622\u0625"+
		"\u0627\u0630\u0636\u0639\u063f\u0643\u064a\u0653\u0657\u0659\u065d\u0666"+
		"\u066b\u066d\u0676\u0681\u0688\u068b\u0694\u0699\u069c\u06a0\u06aa\u06b3"+
		"\u06e3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}