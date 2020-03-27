package Java.Base;
import Java.AST.*;
import Java.AST.QueryStmt.SelectStmt;
import Java.AST.QueryStmt.Select_Core;
import gen.SQLBaseVisitor;
import gen.SQLParser;

import java.util.ArrayList;
import java.util.List;

public class Basevisitor_fun extends SQLBaseVisitor {
    @Override public Parse visitParse(SQLParser.ParseContext ctx) {
        System.out.println("visitParse");
        Parse p = new Parse();
      if(ctx.functiondeclaration()!=null){
        List<FunctionDeclaration> functionDeclarations = new ArrayList<FunctionDeclaration> (  ) ;
        for (int i =0; i < ctx.functiondeclaration ().size() ; i++){

;            functionDeclarations.add ( visitFunctiondeclaration ( ctx.functiondeclaration ( i ) ));

        }
        p.setFunctions (functionDeclarations);}

       else if(ctx.var_stmt ()!=null){
            List<var_stmt> var_stmts = new ArrayList<var_stmt> ();
            for (int i = 0; i < ctx.var_stmt ().size (); i++) {
                var_stmts.add ( visitVar_stmt ( ctx.var_stmt ( i )  ));
                p.setVar_stmts ( var_stmts );


            }}
        p.setLine(ctx.getStart().getLine()); //get line number
        p.setCol(ctx.getStart().getCharPositionInLine()); // get col number
        return p;
    }

    @Override public var_stmt visitVar_stmt(SQLParser.Var_stmtContext ctx) {
        System.out.println("visitVar_stmt");
        var_stmt var_stmt= new var_stmt ();
        if (ctx.K_VAR ()!= null)
        {
            var_stmt.setK_VAR (ctx.K_VAR ().getSymbol ().getText ());
        }
        if (ctx.name_x ()!=null)
        {
            var_stmt.setName_x ( ctx.name_x ().getText () );
        }
        if(ctx.ASSIGN (  )!=null) {
            var_stmt.setASSIGN ( true );

        if (ctx.json_stmt ()!= null)
        {
            var_stmt.setJson_stmt ( visitJson_stmt ( ctx.json_stmt () ) );
        }
        if(ctx.argument_stmt ()!=null)
        {
            var_stmt.setArgument_stmt ( visitArgument_stmt ( ctx.argument_stmt () ) );
        }
        if (ctx.higher_stmt ()!= null)
        {
            var_stmt.setHigher_stmt ( visitHigher_stmt ( ctx.higher_stmt () ) );
        }
        if (ctx.expr()!=null)
        {
            var_stmt.setExpr(visitExpr(ctx.expr()));
        }
        if (ctx.select_core()!=null)
        {
         //   var_stmt.setSelect_core(visitSelect_core(ctx.select_core(0)));
        }}
        return  var_stmt;
        //    return visitChildren(ctx);
    }
    @Override public higher_stmt visitHigher_stmt(SQLParser.Higher_stmtContext ctx) {
        System.out.println("visitHigher_stmt");
        higher_stmt higher_stmt = new higher_stmt ();
        higher_stmt.setFunction_name ( visitFunction_name ( ctx.function_name () ) );
        higher_stmt.setArry_name ( visitArry_name ( ctx.arry_name () ) );
        higher_stmt.setK_FUNCTION ( true );
        higher_stmt.setHigherStmt1s ( visitHigher_stmt1 ( ctx.higher_stmt1 () ) );

        return higher_stmt;
    }
    @Override public String  visitArry_name(SQLParser.Arry_nameContext ctx) {
        System.out.println("visitArry_name");
        String result="";
        result= ctx.any_name ().IDENTIFIER ().getSymbol ().getText ();
        return result;
    }
    @Override public pair_T visitPair_T(SQLParser.Pair_TContext ctx) {
        pair_T pair_t= new pair_T ();
        pair_t.setPair ( visitPair ( ctx.pair () ) );
        return  pair_t;
    }
    @Override public array visitArray(SQLParser.ArrayContext ctx) {
        System.out.println("visitArray");
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
        System.out.println("visitValue");
        value value = new value ();
        if (ctx.expr ()!=null)
        {
            value.setExpr ( visitExpr ( ctx.expr () ) );
        }
        if (ctx.array ()!= null)
        {
            value.setArray ( visitArray ( ctx.array () ) );
        }
        if (ctx.object1 ()!= null)
        {
            value.setObject ( visitObject1 ( ctx.object1() ) );
        }
        return  value;
    }
    @Override public object1 visitObject1(SQLParser.Object1Context ctx) {
        System.out.println("visitObject");
        object1 object= new object1 ();
        List<pair> pairs= new ArrayList<> (  );
        for (int i = 0; i < ctx.pair ().size (); i++) {
            pairs.add ( visitPair ( ctx.pair ( i )  ));
        }
        object.setPairs ( pairs );
        return  object;

    }
    @Override public  pair visitPair(SQLParser.PairContext ctx) {
        pair pair= new pair ();
        pair.setProperty ( ctx.property ().IDENTIFIER ().getSymbol ().getText () );
        pair.setValue ( visitValue ( ctx.value () ) );
        return  pair;
        //    return visitChildren(ctx);
    }
    @Override public higher_stmt1 visitHigher_stmt1(SQLParser.Higher_stmt1Context ctx) {
        System.out.println("visitHigher_stmt1");
        higher_stmt1 higher_stmt1= new higher_stmt1 ();
        expr expr= new expr();
        if (ctx.K_VAR ()!=null)
        {
            higher_stmt1.setK_var ( true );
        }
        if (ctx.expr ()!=null)
        {
            higher_stmt1.setExpr ( visitExpr ( ctx.expr ( 0 ) ) );
            higher_stmt1.setExpr ( expr );
        }
        List<expr> exprs= new ArrayList<> (  );
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
        System.out.println("visitJson_stmt");
        json_stmt json_stmt  = new json_stmt ();
        if (ctx.array ()!=null) {
            json_stmt.setArray ( visitArray ( ctx.array () ) );

        }
        if (ctx.object1 ()!= null) {
            json_stmt.setObject ( visitObject1 ( ctx.object1 () ) );

        }
        if (ctx.pair_T ()!= null) {
            json_stmt.setPair_t ( visitPair_T ( ctx.pair_T () ) );

        }
        return  json_stmt;
        //    return visitChildren(ctx);
    }
    @Override public argument_stmt visitArgument_stmt(SQLParser.Argument_stmtContext ctx) {
        System.out.println("visitArgument_stmt");
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
        System.out.println("visitfunctiondeclaration");
        parameter parameters=new parameter(  );
         fun_body fun_body= new fun_body();
        FunctionDeclaration functionDeclaration =new FunctionDeclaration();
        if(ctx.parameter ()!= null) {
             parameters = visitParameter (ctx.parameter ());
             functionDeclaration.setParameter ( parameters );

           }
         if(ctx.fun_body ()!= null)
         {
              fun_body = visitFun_body ( ctx.fun_body () );
         }
        //return visitChildren(ctx);
        return  functionDeclaration;
    }
    @Override public fun_body visitFun_body(SQLParser.Fun_bodyContext ctx) {
        System.out.println("visitFun_body");
       fun_body fun_body = new fun_body();
       if (ctx.state_stmt()!=null)
       {
        List<state_stmt> s = new ArrayList<state_stmt>();
        for(int i=0;i<ctx.state_stmt().size();i++){
            s.add(visitState_stmt(ctx.state_stmt(i)));
        }
       }



        return  fun_body;
    //    return visitChildren(ctx);
    }
    @Override public  return_cont2 visitReturn_cont2(SQLParser.Return_cont2Context ctx) {
        return_cont2 return_cont2= new return_cont2();
        if (ctx.expr()!=null)
        {
        return_cont2.setExpr(visitExpr(ctx.expr()));}
        if (ctx.select_core()!=null)
        {
            return_cont2.setSelect_core(visitSelect_core(ctx.select_core()));
        }
        return  return_cont2;
    }
    @Override public Select_Core visitSelect_core(SQLParser.Select_coreContext ctx) {
        return  null;
    }

    @Override public return_contunet visitReturn_contunet(SQLParser.Return_contunetContext ctx) {
        System.out.println("visitReturn_contunet");
        return_contunet return_contunets=new return_contunet();
        if(ctx.expr()!=null){
        return_contunets.setExpr(visitExpr(ctx.expr()));
        }
        if(ctx.any_name()!=null)
        {
            return_contunets.setAny_name(ctx.any_name().IDENTIFIER().getSymbol().getText());
            System.out.println(return_contunets.getAny_name());
        }
        if(ctx.rele_onecond()!=null)
        {
            return_contunets.setRele_onecond(visitRele_onecond(ctx.rele_onecond()));
        }
        return return_contunets;
    }
    @Override public state_stmt visitState_stmt(SQLParser.State_stmtContext ctx) {
        System.out.println("visitState_stmt");
        state_stmt state_stmt = new state_stmt();

         if(ctx.rele_for ()!=null){
         state_stmt.setRole_for ( visitRele_for ( ctx.rele_for () ) );}
         if(ctx.rele_if()!=null)
         {
             state_stmt.setRoleif(visitRele_if(ctx.rele_if()));
         }
         if(ctx.rele_while()!=null)
         {
             state_stmt.setRolewhile(visitRele_while(ctx.rele_while()));
         }
         if(ctx.rele_switch()!=null)
         {
             state_stmt.setRole_switch(visitRele_switch(ctx.rele_switch()));
         }
         if(ctx.rele_dowhile()!=null)
         {
             state_stmt.setRole_dowhile(visitRele_dowhile(ctx.rele_dowhile()));

         }
         if(ctx.rele_forach()!=null)
         {
             state_stmt.setRole_forach(visitRele_forach(ctx.rele_forach()));
         }
         if(ctx.rele_onecond()!=null){

                 state_stmt.setRele_onecond(visitRele_onecond(ctx.rele_onecond()));

         }
         if(ctx.K_PRINT()!=null){
             state_stmt.setS(ctx.K_PRINT().getSymbol().getText());
             ArrayList<print_content> print_contents=new ArrayList<print_content>();
             for(int i=0;i<ctx.print_content().size();i++)     {
                 print_contents.add(visitPrint_content(ctx.print_content(i)));
             }
             state_stmt.setPrint_content(print_contents);
         }
         if(ctx.role_re_con()!=null)
        {
            state_stmt.setRole_re_con(visitRole_re_con(ctx.role_re_con()));
        }
         if (ctx.json_call()!=null)
         {
             state_stmt.setJson_call(visitJson_call(ctx.json_call()));
         }
         if (ctx.array_stmt()!=null)
         {
             state_stmt.setArray_stmt(visitArray_stmt(ctx.array_stmt()));
         }
        if(ctx.expr()!=null){
             state_stmt.setExpr(visitExpr(ctx.expr()));

         }
        if(ctx.var_stmt()!=null)
        {
            state_stmt.setVar_stmt(visitVar_stmt(ctx.var_stmt()));
        }

          return  state_stmt;


    }
    @Override public  array_stmt visitArray_stmt(SQLParser.Array_stmtContext ctx) {
        System.out.println("visitArray_stmt");
        array_stmt array_stmt = new array_stmt ();
        array_stmt.setK_VAR (true);
        array_stmt.setName_x ( ctx.name_x ().any_name ().IDENTIFIER ().getSymbol ().getText () );
        array_stmt.setASSIGN ( true );
        if (ctx.expr ()!= null)
        {
            List<expr> exprs= new ArrayList<> (  );
            for (int i = 0; i < ctx.expr ().size(); i++) {
                exprs.add(visitExpr (ctx.expr ( i )  ));
            }
            array_stmt.setExprs ( exprs );

        }
        if (ctx.expr (  )!=null)
        {
            array_stmt.setExpr ( visitExpr ( ctx.expr ( 0 ) ) );
        }
        if (ctx.select_core ()!=null)
        {
            array_stmt.setSelect_core ( visitSelect_core ( ctx.select_core () ) );
        }
        if (ctx.function_name1 ()!=null)
        {
            array_stmt.setFunction_name1 ( visitFunction_name1 ( ctx.function_name1 () ) );
        }
        return  array_stmt;
    }
    @Override public function_name1 visitFunction_name1(SQLParser.Function_name1Context ctx) {
        System.out.println("visitFunction_name1");
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
        return  function_name1;
    }
    @Override public role_re_con visitRole_re_con(SQLParser.Role_re_conContext ctx) {
        System.out.println("visitRole_re_con");
        role_re_con role_re_con=new role_re_con();
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
        System.out.println("visitPrint_content");
        print_content print_content=new print_content();

      List<expr>e=new ArrayList<>();
        for (int i = 0; i < ctx.expr().size(); i++) {
             e.add(visitExpr(ctx.expr(i)));
                }

        if(ctx.json_call()!=null)
        {
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
       System.out.println("visitJson_call");
        json_call json_call=new json_call();
         json_call.setProperty1(visitProperty(ctx.property(0)));
         json_call.setPoint(ctx.getChild(1).getText());
         System.out.println(json_call.getPoint());
         json_call.setProperty2(visitProperty(ctx.property(1)));

         if(ctx.json_call3()!=null )
         {List<json_call3> json_call3s= new ArrayList<>();

             for(int j=0 ;j<ctx.json_call3().size();j++){
                     json_call3s.add(visitJson_call3(ctx.json_call3(j)));

             }
             json_call.setJson_call3s(json_call3s);
             }
         if (ctx.ASSIGN()!=null)
         {
             json_call.setASSIGN(ctx.ASSIGN().getSymbol().getText());
             System.out.println(json_call.getASSIGN());
             if(ctx.IDENTIFIER()!=null)
             {
             json_call.setName(ctx.IDENTIFIER().getSymbol().getText());
             System.out.println(ctx.IDENTIFIER().getSymbol().getText());}
             else if (ctx.NUMERIC_LITERAL()!=null)
             {
                 json_call.setName(ctx.NUMERIC_LITERAL().getSymbol().getText());
                 System.out.println(ctx.NUMERIC_LITERAL().getSymbol().getText());
             }
         }


        return json_call;
//        return visitChildren(ctx);
    }
    @Override public json_call3 visitJson_call3(SQLParser.Json_call3Context ctx) {
        System.out.println("visitJson_call3");
        json_call3 json_call3= new json_call3();
        json_call3.setPoint(ctx.getChild(0).getText());
        System.out.println(json_call3.getPoint());
        json_call3.setProperty1(ctx.getChild(1).getText());
        System.out.println(json_call3.getProperty1());
        return  json_call3;
    }
    @Override public String visitProperty(SQLParser.PropertyContext ctx) {
        System.out.println("visitProperty");
        String result;
        result= ctx.IDENTIFIER().getSymbol().getText();
        property property= new property();
        property.setProperty1(result);

        System.out.println(property.getProperty1());

        return  result;
    }
    @Override public rele_onecond visitRele_onecond(SQLParser.Rele_onecondContext ctx) {
        System.out.println("visitRele_onecond");
        rele_onecond rele_onecond=new rele_onecond();
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

        return rele_onecond;
       // return visitChildren(ctx);
    }
    @Override public expr_or_rele_ifcond visitExpr_or_rele_ifcond(SQLParser.Expr_or_rele_ifcondContext ctx) {
        System.out.println("visitExpr_or_rele_ifcond");
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
        System.out.println("visitRele_ifcond");
        rele_ifcond rele_ifcond=new rele_ifcond();
        rele_ifcond.setE1(visitExpr(ctx.expr(0)));
        rele_ifcond.setOp1(ctx.QUESTION().getSymbol().getText());
        rele_ifcond.setE2(visitExpr(ctx.expr(1)));
        rele_ifcond.setOp2(ctx.COLON().getSymbol().getText());
        rele_ifcond.setE3(visitExpr(ctx.expr(2)));
        return rele_ifcond;
       // return visitChildren(ctx);
    }
    @Override public role_forach visitRele_forach(SQLParser.Rele_forachContext ctx) {

        System.out.println("visitRele_forach");
        role_forach role_forach=new role_forach();
        role_forach.setE1(visitExpr(ctx.expr(0)));
        role_forach.setOp(ctx.getChild(3).getText());
        role_forach.setE2(visitExpr(ctx.expr(1)));
if(ctx.state_stmt()!=null)
{
    List <state_stmt>s=new ArrayList<state_stmt>();
    for(int i=0;i<ctx.state_stmt().size();i++){
        s.add(visitState_stmt(ctx.state_stmt(i)));
    }
}
        return role_forach;
        //return visitChildren(ctx);
    }
    @Override public role_dowhile visitRele_dowhile(SQLParser.Rele_dowhileContext ctx) {
        System.out.println("visitRele_dowhile");
        role_dowhile role_dowhile=new role_dowhile();
        if(ctx.K_DO()!=null)
        {
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
            role_dowhile.setE(visitExpr(ctx.expr()));
        }
        return  role_dowhile;
        //return visitChildren(ctx);
    }
    @Override public role_switch visitRele_switch(SQLParser.Rele_switchContext ctx) {
        System.out.println("visitRele_switch");
        role_switch role_switch1=new role_switch();
        role_switch1.setExpe ( visitExpr(ctx.expr()) );
     List <rele_case1> rele_case1=new ArrayList<rele_case1>() ;
        for (int i = 0; i < ctx.rele_case1().size(); i++) {
            rele_case1.add(visitRele_case1(ctx.rele_case1(i)));
        }
        if(ctx.K_DEFAULT()!=null)
        {
            role_switch1.setDef(ctx.K_DEFAULT().getSymbol().getText());
            role_switch1.setDot(ctx.getChild(1).getText());
            role_switch1.setRole_case(visitRele_case(ctx.rele_case()));
        }
        if(ctx.state_stmt()!=null)
        {
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }

        }



       return role_switch1;
       // return visitChildren(ctx);
    }
    @Override public rele_case1 visitRele_case1(SQLParser.Rele_case1Context ctx) {
        System.out.println(" visitRele_case1");
        rele_case1 rele_case1=new rele_case1();
//        role_case role_case=new role_case();
        rele_case1.setE(visitExpr(ctx.expr()));
        rele_case1.setDot(ctx.getChild(2).getText());
        rele_case1.setRole_case(visitRele_case(ctx.rele_case()));
//        role_switch1.setDot( ctx.getChild ( 1 ).getText ());
       // return visitChildren(ctx);
        return  rele_case1;
    }
    @Override public role_case visitRele_case(SQLParser.Rele_caseContext ctx) {
        System.out.println(" visitRele_case");
        role_case role_case=new role_case();
        List <state_stmt>s=new ArrayList<state_stmt>();
        for(int i=0;i<ctx.state_stmt().size();i++){
            s.add(visitState_stmt(ctx.state_stmt(i)));
        }
        return role_case;

        //return visitChildren(ctx);
    }
    @Override public rolewhile visitRele_while(SQLParser.Rele_whileContext ctx) {
        System.out.println("visitRele_while");
        rolewhile rolewhile=new rolewhile();
        rolewhile.setExpe ( visitExpr(ctx.expr()) );
        if(ctx.state_stmt()!=null){
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }}
        // return visitChildren(ctx);
        return rolewhile;
    }

    @Override public Roleif visitRele_if(SQLParser.Rele_ifContext ctx) {
        System.out.println("visitRele_if");
        Roleif roleif=new Roleif();
        roleif.setExpr ( visitExpr(ctx.expr()) );
        if(ctx.state_stmt()!=null){
            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));
            }
        }
        if(ctx.else_stmt()!=null)
        {

            List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
                s.add(visitState_stmt(ctx.state_stmt(i)));

            }
        }
        return roleif;

       // return visitChildren(ctx);
    }
    @Override public role_for visitRele_for(SQLParser.Rele_forContext ctx) {
        System.out.println("visitRele_for");
         role_for role_for = new role_for();
         role_for.setOprint1 ( visitOprint1 ( ctx.oprint1 () ) );
         role_for.setOprint2 ( visitOprint2 ( ctx.oprint2 () ) );
          role_for.setOprint3 ( visitOprint3 ( ctx.oprint3 () ) );

          if(ctx.state_stmt()!=null){
              List <state_stmt>s=new ArrayList<state_stmt>();
            for(int i=0;i<ctx.state_stmt().size();i++){
              s.add(visitState_stmt(ctx.state_stmt(i)));
             }
          }

          return role_for;

        //return visitChildren(ctx);
        }
    @Override public oprint3 visitOprint3(SQLParser.Oprint3Context ctx) {
        System.out.println("visitOprint3");
        oprint3 oprint3=new oprint3 ();

      oprint3.setExpr(visitExpr(ctx.expr()));
         return  oprint3;
      //  return visitChildren(ctx);
    }
    @Override public oprint2 visitOprint2(SQLParser.Oprint2Context ctx) {
        System.out.println("visitOprint2");
        oprint2 oprint2=new oprint2();
        oprint2.setExpr ( visitExpr ( ctx.expr () ) );

        return oprint2;
        //return visitChildren(ctx);
        }
    @Override public expr visitExpr(SQLParser.ExprContext ctx) {
        System.out.println("visitExpr");
      //  System.out.println("visitExpr");
        expr e = new expr();
//        literal_value literal_value = new literal_value();
//        function_name1 f = new function_name1();
//        identy identy = new identy();
        ex_op ex_op=new ex_op();
        if (ctx.literal_value() != null) {

            System.out.println("literal value  ");

            e.setLiterlvalue(ctx.literal_value().STRING_LITERAL().getSymbol().getText());
//            System.out.println(e.getLiterlvalue());
        } else if (ctx.identy() != null) {
//            identy.setIdenty(ctx.identy().IDENTIFIER().getSymbol().getText());
//            System.out.println(identy.getIdenty1());
            System.out.println("IDENTIFER  ");
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
            exprselect exprselect= new exprselect();
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

            System.out.println(operations.getOpreation());

            operations.setExprleft(visitExpr(ctx.expr(0)));


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
            listopertion listopertion = new listopertion();
            operations operations = new operations();
            expright expright = new expright();
            listopertion.setExprleft(visitExpr(ctx.expr(0)));
            if (ctx.op() != null) {
                List<op> s = new ArrayList<op>();

                for (int i = 0; i < ctx.op().size(); i++) {
                    s.add(visitOp(ctx.op(i)));

                }}
            if (ctx.opre_all() != null) {
                operations.setOpreation(ctx.getChild(1).getText());
                System.out.println(operations.getOpreation());
            }

            expright.setExprright(visitExpr(ctx.expr(1)));

        }


        return e;
        //  return visitChildren(ctx);
    }
    @Override public exprselect visitExprselect(SQLParser.ExprselectContext ctx) {
        exprselect exprselect= new exprselect();


        if (ctx.K_NOT()!=null)
        {
            exprselect.setK_NOT(ctx.K_NOT().getSymbol().getText());   }
        exprselect.setK_IN(ctx.K_IN().getSymbol().getText());
        exprselect.setSelect_expr(visitSelect_expr(ctx.select_expr()));

        return  exprselect;
    }
    @Override public select_expr visitSelect_expr(SQLParser.Select_exprContext ctx) {
        System.out.println("visitSelect_expr");
        select_expr select_expr = new select_expr();
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
                System.out.println(ctx.DOT().getText());
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
        System.out.println("visitOpexp");
        opexp opexp=new opexp();
        opexp.setOp(ctx.getChild(0).getText());
        System.out.println(opexp.getOp());
        opexp.setExpr(visitExpr(ctx.expr()));
        return  opexp;

        // return visitChildren(ctx);
    }
    @Override public unary_operator1 visitUnary_operator1(SQLParser.Unary_operator1Context ctx) {
        System.out.println("visitUnary_operator1");
        unary_operator1 unary_operator=new unary_operator1();
        unary_operator.setOp(ctx.getChild(0).getText());

        unary_operator.setExpr(visitExpr(ctx.expr()));
        return  unary_operator;
        //   return visitChildren(ctx);
    }
    @Override public existsselect visitExistsselect(SQLParser.ExistsselectContext ctx) {
        existsselect existsselect=new existsselect();
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
    @Override public SelectStmt visitSelect_stmt(SQLParser.Select_stmtContext ctx) {
        System.out.println("visitSelect_stmt");
SelectStmt selectStmt=new SelectStmt();
        return selectStmt; }

    @Override public literal_value visitLiteral_value(SQLParser.Literal_valueContext ctx) {
        System.out.println("visitLiteral_value");
        literal_value literal_value = new literal_value();
        if (ctx.NUMERIC_LITERAL() != null)
            literal_value.setNUMERIC_LITERAL(String.valueOf(ctx.NUMERIC_LITERAL()));
        //System.out.println(literal_value.getNUMERIC_LITERAL());
        if (ctx.STRING_LITERAL() != null)//ques
            literal_value.setSTRING_LITERAL(String.valueOf(ctx.STRING_LITERAL()));
        if (ctx.BLOB_LITERAL() != null)//qus
            System.out.println(literal_value.getBLOB_LITERAL());
        if (ctx.K_CURRENT_DATE() != null)
            literal_value.setK_CURRENT_DATE(true);
        if (ctx.K_CURRENT_TIMESTAMP() != null)
            literal_value.setK_CURRENT_TIMESTAMP(true);
        if (ctx.K_CURRENT_TIME() != null)
            literal_value.setK_CURRENT_TIME(true);
        if (ctx.K_NULL() != null)
            literal_value.setK_NULL(true);


        return literal_value;
    }




    @Override public oprint1 visitOprint1(SQLParser.Oprint1Context ctx) {
        System.out.println("visitOprint1");
         oprint1 oprint1= new oprint1();
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
        System.out.println("visitNamef");
        String var="";

            var=  (ctx.any_name ().IDENTIFIER ().getSymbol ().getText ());
            System.out.println(ctx.any_name ().IDENTIFIER ().getSymbol ().getText ());
        return var;
//        return visitChildren(ctx);
    }
    @Override public parameter visitParameter(SQLParser.ParameterContext ctx) {
        System.out.println("visitParameter");
        parameter parameter =new parameter();

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
        System.out.println("visitVarable");
        varable varable=new varable();
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
        return varable;
       // return visitChildren(ctx);
    }
    @Override public list_var visitList_var(SQLParser.List_varContext ctx) {
        System.out.println(" visitList_var");
        list_var list_var=new list_var();
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
        System.out.println("visitName_x");
        variable variable= new variable();
         String var="";
        if(ctx.any_name()!= null){
            var=  (ctx.any_name ().IDENTIFIER ().getSymbol ().getText ());
        }
        variable.setvarible ( var );
        System.out.println (  variable.getvarible ());
        return   variable ;
        //    return visitChildren(ctx);
    }
    @Override public String visitAny_name(SQLParser.Any_nameContext ctx) {
     return  ctx.IDENTIFIER ().getSymbol ().getText ();
        //    return visitChildren(ctx);
    }

    @Override public String visitFunction_name(SQLParser.Function_nameContext ctx) {

        System.out.println("visitFunction_name");
        String function_name = " ";
        if(ctx.any_name()!= null){
            function_name = ctx.any_name().IDENTIFIER().getSymbol().getText();
        }
System.out.println ( function_name );
        return function_name ;
    }

    @Override
    public database_name1 visitDatabase_name1(SQLParser.Database_name1Context ctx) {
        System.out.println("visitDatabase_name1");
        database_name1 database_name=new database_name1();
        if ((ctx.column_name()!=null))
            database_name.setColumnname(ctx.column_name().any_name().IDENTIFIER().getSymbol().getText());
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
        return database_name;
    }

    @Override
    public kword visitKword1(SQLParser.Kword1Context ctx) {
        System.out.println("visit K wards");
        kword kword=new kword();
        if(ctx.K_TRUE()!=null)
        {
            kword.setB(true);
        }
        if(ctx.K_FALSE()!=null)
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
}
