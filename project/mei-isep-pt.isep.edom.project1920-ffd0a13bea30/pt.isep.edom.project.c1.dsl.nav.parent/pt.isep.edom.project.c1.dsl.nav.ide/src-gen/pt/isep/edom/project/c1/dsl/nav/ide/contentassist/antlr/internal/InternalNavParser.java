package pt.isep.edom.project.c1.dsl.nav.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import pt.isep.edom.project.c1.dsl.nav.services.NavGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNavParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NavModel'", "'{'", "'}'", "'menu'", "'Menu'", "'pages'", "','", "'Page'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalNavParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalNavParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalNavParser.tokenNames; }
    public String getGrammarFileName() { return "InternalNav.g"; }


    	private NavGrammarAccess grammarAccess;

    	public void setGrammarAccess(NavGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleNavModel"
    // InternalNav.g:53:1: entryRuleNavModel : ruleNavModel EOF ;
    public final void entryRuleNavModel() throws RecognitionException {
        try {
            // InternalNav.g:54:1: ( ruleNavModel EOF )
            // InternalNav.g:55:1: ruleNavModel EOF
            {
             before(grammarAccess.getNavModelRule()); 
            pushFollow(FOLLOW_1);
            ruleNavModel();

            state._fsp--;

             after(grammarAccess.getNavModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavModel"


    // $ANTLR start "ruleNavModel"
    // InternalNav.g:62:1: ruleNavModel : ( ( rule__NavModel__Group__0 ) ) ;
    public final void ruleNavModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:66:2: ( ( ( rule__NavModel__Group__0 ) ) )
            // InternalNav.g:67:2: ( ( rule__NavModel__Group__0 ) )
            {
            // InternalNav.g:67:2: ( ( rule__NavModel__Group__0 ) )
            // InternalNav.g:68:3: ( rule__NavModel__Group__0 )
            {
             before(grammarAccess.getNavModelAccess().getGroup()); 
            // InternalNav.g:69:3: ( rule__NavModel__Group__0 )
            // InternalNav.g:69:4: rule__NavModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavModel"


    // $ANTLR start "entryRuleEString"
    // InternalNav.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalNav.g:79:1: ( ruleEString EOF )
            // InternalNav.g:80:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalNav.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalNav.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalNav.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalNav.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalNav.g:94:3: ( rule__EString__Alternatives )
            // InternalNav.g:94:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleMenu"
    // InternalNav.g:103:1: entryRuleMenu : ruleMenu EOF ;
    public final void entryRuleMenu() throws RecognitionException {
        try {
            // InternalNav.g:104:1: ( ruleMenu EOF )
            // InternalNav.g:105:1: ruleMenu EOF
            {
             before(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getMenuRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalNav.g:112:1: ruleMenu : ( ( rule__Menu__Group__0 ) ) ;
    public final void ruleMenu() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:116:2: ( ( ( rule__Menu__Group__0 ) ) )
            // InternalNav.g:117:2: ( ( rule__Menu__Group__0 ) )
            {
            // InternalNav.g:117:2: ( ( rule__Menu__Group__0 ) )
            // InternalNav.g:118:3: ( rule__Menu__Group__0 )
            {
             before(grammarAccess.getMenuAccess().getGroup()); 
            // InternalNav.g:119:3: ( rule__Menu__Group__0 )
            // InternalNav.g:119:4: rule__Menu__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRulePage"
    // InternalNav.g:128:1: entryRulePage : rulePage EOF ;
    public final void entryRulePage() throws RecognitionException {
        try {
            // InternalNav.g:129:1: ( rulePage EOF )
            // InternalNav.g:130:1: rulePage EOF
            {
             before(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            rulePage();

            state._fsp--;

             after(grammarAccess.getPageRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalNav.g:137:1: rulePage : ( ( rule__Page__Group__0 ) ) ;
    public final void rulePage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:141:2: ( ( ( rule__Page__Group__0 ) ) )
            // InternalNav.g:142:2: ( ( rule__Page__Group__0 ) )
            {
            // InternalNav.g:142:2: ( ( rule__Page__Group__0 ) )
            // InternalNav.g:143:3: ( rule__Page__Group__0 )
            {
             before(grammarAccess.getPageAccess().getGroup()); 
            // InternalNav.g:144:3: ( rule__Page__Group__0 )
            // InternalNav.g:144:4: rule__Page__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePage"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalNav.g:152:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:156:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalNav.g:157:2: ( RULE_STRING )
                    {
                    // InternalNav.g:157:2: ( RULE_STRING )
                    // InternalNav.g:158:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalNav.g:163:2: ( RULE_ID )
                    {
                    // InternalNav.g:163:2: ( RULE_ID )
                    // InternalNav.g:164:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__NavModel__Group__0"
    // InternalNav.g:173:1: rule__NavModel__Group__0 : rule__NavModel__Group__0__Impl rule__NavModel__Group__1 ;
    public final void rule__NavModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:177:1: ( rule__NavModel__Group__0__Impl rule__NavModel__Group__1 )
            // InternalNav.g:178:2: rule__NavModel__Group__0__Impl rule__NavModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NavModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__0"


    // $ANTLR start "rule__NavModel__Group__0__Impl"
    // InternalNav.g:185:1: rule__NavModel__Group__0__Impl : ( () ) ;
    public final void rule__NavModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:189:1: ( ( () ) )
            // InternalNav.g:190:1: ( () )
            {
            // InternalNav.g:190:1: ( () )
            // InternalNav.g:191:2: ()
            {
             before(grammarAccess.getNavModelAccess().getNavModelAction_0()); 
            // InternalNav.g:192:2: ()
            // InternalNav.g:192:3: 
            {
            }

             after(grammarAccess.getNavModelAccess().getNavModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__0__Impl"


    // $ANTLR start "rule__NavModel__Group__1"
    // InternalNav.g:200:1: rule__NavModel__Group__1 : rule__NavModel__Group__1__Impl rule__NavModel__Group__2 ;
    public final void rule__NavModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:204:1: ( rule__NavModel__Group__1__Impl rule__NavModel__Group__2 )
            // InternalNav.g:205:2: rule__NavModel__Group__1__Impl rule__NavModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NavModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__1"


    // $ANTLR start "rule__NavModel__Group__1__Impl"
    // InternalNav.g:212:1: rule__NavModel__Group__1__Impl : ( 'NavModel' ) ;
    public final void rule__NavModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:216:1: ( ( 'NavModel' ) )
            // InternalNav.g:217:1: ( 'NavModel' )
            {
            // InternalNav.g:217:1: ( 'NavModel' )
            // InternalNav.g:218:2: 'NavModel'
            {
             before(grammarAccess.getNavModelAccess().getNavModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getNavModelAccess().getNavModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__1__Impl"


    // $ANTLR start "rule__NavModel__Group__2"
    // InternalNav.g:227:1: rule__NavModel__Group__2 : rule__NavModel__Group__2__Impl rule__NavModel__Group__3 ;
    public final void rule__NavModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:231:1: ( rule__NavModel__Group__2__Impl rule__NavModel__Group__3 )
            // InternalNav.g:232:2: rule__NavModel__Group__2__Impl rule__NavModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__NavModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__2"


    // $ANTLR start "rule__NavModel__Group__2__Impl"
    // InternalNav.g:239:1: rule__NavModel__Group__2__Impl : ( ( rule__NavModel__NameAssignment_2 ) ) ;
    public final void rule__NavModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:243:1: ( ( ( rule__NavModel__NameAssignment_2 ) ) )
            // InternalNav.g:244:1: ( ( rule__NavModel__NameAssignment_2 ) )
            {
            // InternalNav.g:244:1: ( ( rule__NavModel__NameAssignment_2 ) )
            // InternalNav.g:245:2: ( rule__NavModel__NameAssignment_2 )
            {
             before(grammarAccess.getNavModelAccess().getNameAssignment_2()); 
            // InternalNav.g:246:2: ( rule__NavModel__NameAssignment_2 )
            // InternalNav.g:246:3: rule__NavModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NavModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNavModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__2__Impl"


    // $ANTLR start "rule__NavModel__Group__3"
    // InternalNav.g:254:1: rule__NavModel__Group__3 : rule__NavModel__Group__3__Impl rule__NavModel__Group__4 ;
    public final void rule__NavModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:258:1: ( rule__NavModel__Group__3__Impl rule__NavModel__Group__4 )
            // InternalNav.g:259:2: rule__NavModel__Group__3__Impl rule__NavModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__NavModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__3"


    // $ANTLR start "rule__NavModel__Group__3__Impl"
    // InternalNav.g:266:1: rule__NavModel__Group__3__Impl : ( '{' ) ;
    public final void rule__NavModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:270:1: ( ( '{' ) )
            // InternalNav.g:271:1: ( '{' )
            {
            // InternalNav.g:271:1: ( '{' )
            // InternalNav.g:272:2: '{'
            {
             before(grammarAccess.getNavModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getNavModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__3__Impl"


    // $ANTLR start "rule__NavModel__Group__4"
    // InternalNav.g:281:1: rule__NavModel__Group__4 : rule__NavModel__Group__4__Impl rule__NavModel__Group__5 ;
    public final void rule__NavModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:285:1: ( rule__NavModel__Group__4__Impl rule__NavModel__Group__5 )
            // InternalNav.g:286:2: rule__NavModel__Group__4__Impl rule__NavModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__NavModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__4"


    // $ANTLR start "rule__NavModel__Group__4__Impl"
    // InternalNav.g:293:1: rule__NavModel__Group__4__Impl : ( ( rule__NavModel__Group_4__0 )? ) ;
    public final void rule__NavModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:297:1: ( ( ( rule__NavModel__Group_4__0 )? ) )
            // InternalNav.g:298:1: ( ( rule__NavModel__Group_4__0 )? )
            {
            // InternalNav.g:298:1: ( ( rule__NavModel__Group_4__0 )? )
            // InternalNav.g:299:2: ( rule__NavModel__Group_4__0 )?
            {
             before(grammarAccess.getNavModelAccess().getGroup_4()); 
            // InternalNav.g:300:2: ( rule__NavModel__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalNav.g:300:3: rule__NavModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NavModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNavModelAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__4__Impl"


    // $ANTLR start "rule__NavModel__Group__5"
    // InternalNav.g:308:1: rule__NavModel__Group__5 : rule__NavModel__Group__5__Impl ;
    public final void rule__NavModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:312:1: ( rule__NavModel__Group__5__Impl )
            // InternalNav.g:313:2: rule__NavModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__5"


    // $ANTLR start "rule__NavModel__Group__5__Impl"
    // InternalNav.g:319:1: rule__NavModel__Group__5__Impl : ( '}' ) ;
    public final void rule__NavModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:323:1: ( ( '}' ) )
            // InternalNav.g:324:1: ( '}' )
            {
            // InternalNav.g:324:1: ( '}' )
            // InternalNav.g:325:2: '}'
            {
             before(grammarAccess.getNavModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getNavModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group__5__Impl"


    // $ANTLR start "rule__NavModel__Group_4__0"
    // InternalNav.g:335:1: rule__NavModel__Group_4__0 : rule__NavModel__Group_4__0__Impl rule__NavModel__Group_4__1 ;
    public final void rule__NavModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:339:1: ( rule__NavModel__Group_4__0__Impl rule__NavModel__Group_4__1 )
            // InternalNav.g:340:2: rule__NavModel__Group_4__0__Impl rule__NavModel__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__NavModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavModel__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group_4__0"


    // $ANTLR start "rule__NavModel__Group_4__0__Impl"
    // InternalNav.g:347:1: rule__NavModel__Group_4__0__Impl : ( 'menu' ) ;
    public final void rule__NavModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:351:1: ( ( 'menu' ) )
            // InternalNav.g:352:1: ( 'menu' )
            {
            // InternalNav.g:352:1: ( 'menu' )
            // InternalNav.g:353:2: 'menu'
            {
             before(grammarAccess.getNavModelAccess().getMenuKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getNavModelAccess().getMenuKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group_4__0__Impl"


    // $ANTLR start "rule__NavModel__Group_4__1"
    // InternalNav.g:362:1: rule__NavModel__Group_4__1 : rule__NavModel__Group_4__1__Impl ;
    public final void rule__NavModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:366:1: ( rule__NavModel__Group_4__1__Impl )
            // InternalNav.g:367:2: rule__NavModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavModel__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group_4__1"


    // $ANTLR start "rule__NavModel__Group_4__1__Impl"
    // InternalNav.g:373:1: rule__NavModel__Group_4__1__Impl : ( ( rule__NavModel__MenuAssignment_4_1 ) ) ;
    public final void rule__NavModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:377:1: ( ( ( rule__NavModel__MenuAssignment_4_1 ) ) )
            // InternalNav.g:378:1: ( ( rule__NavModel__MenuAssignment_4_1 ) )
            {
            // InternalNav.g:378:1: ( ( rule__NavModel__MenuAssignment_4_1 ) )
            // InternalNav.g:379:2: ( rule__NavModel__MenuAssignment_4_1 )
            {
             before(grammarAccess.getNavModelAccess().getMenuAssignment_4_1()); 
            // InternalNav.g:380:2: ( rule__NavModel__MenuAssignment_4_1 )
            // InternalNav.g:380:3: rule__NavModel__MenuAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__NavModel__MenuAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getNavModelAccess().getMenuAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__Group_4__1__Impl"


    // $ANTLR start "rule__Menu__Group__0"
    // InternalNav.g:389:1: rule__Menu__Group__0 : rule__Menu__Group__0__Impl rule__Menu__Group__1 ;
    public final void rule__Menu__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:393:1: ( rule__Menu__Group__0__Impl rule__Menu__Group__1 )
            // InternalNav.g:394:2: rule__Menu__Group__0__Impl rule__Menu__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Menu__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0"


    // $ANTLR start "rule__Menu__Group__0__Impl"
    // InternalNav.g:401:1: rule__Menu__Group__0__Impl : ( () ) ;
    public final void rule__Menu__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:405:1: ( ( () ) )
            // InternalNav.g:406:1: ( () )
            {
            // InternalNav.g:406:1: ( () )
            // InternalNav.g:407:2: ()
            {
             before(grammarAccess.getMenuAccess().getMenuAction_0()); 
            // InternalNav.g:408:2: ()
            // InternalNav.g:408:3: 
            {
            }

             after(grammarAccess.getMenuAccess().getMenuAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__0__Impl"


    // $ANTLR start "rule__Menu__Group__1"
    // InternalNav.g:416:1: rule__Menu__Group__1 : rule__Menu__Group__1__Impl rule__Menu__Group__2 ;
    public final void rule__Menu__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:420:1: ( rule__Menu__Group__1__Impl rule__Menu__Group__2 )
            // InternalNav.g:421:2: rule__Menu__Group__1__Impl rule__Menu__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Menu__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__1"


    // $ANTLR start "rule__Menu__Group__1__Impl"
    // InternalNav.g:428:1: rule__Menu__Group__1__Impl : ( 'Menu' ) ;
    public final void rule__Menu__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:432:1: ( ( 'Menu' ) )
            // InternalNav.g:433:1: ( 'Menu' )
            {
            // InternalNav.g:433:1: ( 'Menu' )
            // InternalNav.g:434:2: 'Menu'
            {
             before(grammarAccess.getMenuAccess().getMenuKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getMenuKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__1__Impl"


    // $ANTLR start "rule__Menu__Group__2"
    // InternalNav.g:443:1: rule__Menu__Group__2 : rule__Menu__Group__2__Impl rule__Menu__Group__3 ;
    public final void rule__Menu__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:447:1: ( rule__Menu__Group__2__Impl rule__Menu__Group__3 )
            // InternalNav.g:448:2: rule__Menu__Group__2__Impl rule__Menu__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Menu__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__2"


    // $ANTLR start "rule__Menu__Group__2__Impl"
    // InternalNav.g:455:1: rule__Menu__Group__2__Impl : ( ( rule__Menu__NameAssignment_2 ) ) ;
    public final void rule__Menu__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:459:1: ( ( ( rule__Menu__NameAssignment_2 ) ) )
            // InternalNav.g:460:1: ( ( rule__Menu__NameAssignment_2 ) )
            {
            // InternalNav.g:460:1: ( ( rule__Menu__NameAssignment_2 ) )
            // InternalNav.g:461:2: ( rule__Menu__NameAssignment_2 )
            {
             before(grammarAccess.getMenuAccess().getNameAssignment_2()); 
            // InternalNav.g:462:2: ( rule__Menu__NameAssignment_2 )
            // InternalNav.g:462:3: rule__Menu__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Menu__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__2__Impl"


    // $ANTLR start "rule__Menu__Group__3"
    // InternalNav.g:470:1: rule__Menu__Group__3 : rule__Menu__Group__3__Impl rule__Menu__Group__4 ;
    public final void rule__Menu__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:474:1: ( rule__Menu__Group__3__Impl rule__Menu__Group__4 )
            // InternalNav.g:475:2: rule__Menu__Group__3__Impl rule__Menu__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Menu__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__3"


    // $ANTLR start "rule__Menu__Group__3__Impl"
    // InternalNav.g:482:1: rule__Menu__Group__3__Impl : ( '{' ) ;
    public final void rule__Menu__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:486:1: ( ( '{' ) )
            // InternalNav.g:487:1: ( '{' )
            {
            // InternalNav.g:487:1: ( '{' )
            // InternalNav.g:488:2: '{'
            {
             before(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__3__Impl"


    // $ANTLR start "rule__Menu__Group__4"
    // InternalNav.g:497:1: rule__Menu__Group__4 : rule__Menu__Group__4__Impl rule__Menu__Group__5 ;
    public final void rule__Menu__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:501:1: ( rule__Menu__Group__4__Impl rule__Menu__Group__5 )
            // InternalNav.g:502:2: rule__Menu__Group__4__Impl rule__Menu__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Menu__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__4"


    // $ANTLR start "rule__Menu__Group__4__Impl"
    // InternalNav.g:509:1: rule__Menu__Group__4__Impl : ( ( rule__Menu__Group_4__0 )? ) ;
    public final void rule__Menu__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:513:1: ( ( ( rule__Menu__Group_4__0 )? ) )
            // InternalNav.g:514:1: ( ( rule__Menu__Group_4__0 )? )
            {
            // InternalNav.g:514:1: ( ( rule__Menu__Group_4__0 )? )
            // InternalNav.g:515:2: ( rule__Menu__Group_4__0 )?
            {
             before(grammarAccess.getMenuAccess().getGroup_4()); 
            // InternalNav.g:516:2: ( rule__Menu__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalNav.g:516:3: rule__Menu__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Menu__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMenuAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__4__Impl"


    // $ANTLR start "rule__Menu__Group__5"
    // InternalNav.g:524:1: rule__Menu__Group__5 : rule__Menu__Group__5__Impl ;
    public final void rule__Menu__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:528:1: ( rule__Menu__Group__5__Impl )
            // InternalNav.g:529:2: rule__Menu__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__5"


    // $ANTLR start "rule__Menu__Group__5__Impl"
    // InternalNav.g:535:1: rule__Menu__Group__5__Impl : ( '}' ) ;
    public final void rule__Menu__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:539:1: ( ( '}' ) )
            // InternalNav.g:540:1: ( '}' )
            {
            // InternalNav.g:540:1: ( '}' )
            // InternalNav.g:541:2: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group__5__Impl"


    // $ANTLR start "rule__Menu__Group_4__0"
    // InternalNav.g:551:1: rule__Menu__Group_4__0 : rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1 ;
    public final void rule__Menu__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:555:1: ( rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1 )
            // InternalNav.g:556:2: rule__Menu__Group_4__0__Impl rule__Menu__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Menu__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__0"


    // $ANTLR start "rule__Menu__Group_4__0__Impl"
    // InternalNav.g:563:1: rule__Menu__Group_4__0__Impl : ( 'pages' ) ;
    public final void rule__Menu__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:567:1: ( ( 'pages' ) )
            // InternalNav.g:568:1: ( 'pages' )
            {
            // InternalNav.g:568:1: ( 'pages' )
            // InternalNav.g:569:2: 'pages'
            {
             before(grammarAccess.getMenuAccess().getPagesKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getPagesKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__0__Impl"


    // $ANTLR start "rule__Menu__Group_4__1"
    // InternalNav.g:578:1: rule__Menu__Group_4__1 : rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2 ;
    public final void rule__Menu__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:582:1: ( rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2 )
            // InternalNav.g:583:2: rule__Menu__Group_4__1__Impl rule__Menu__Group_4__2
            {
            pushFollow(FOLLOW_9);
            rule__Menu__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__1"


    // $ANTLR start "rule__Menu__Group_4__1__Impl"
    // InternalNav.g:590:1: rule__Menu__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Menu__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:594:1: ( ( '{' ) )
            // InternalNav.g:595:1: ( '{' )
            {
            // InternalNav.g:595:1: ( '{' )
            // InternalNav.g:596:2: '{'
            {
             before(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__1__Impl"


    // $ANTLR start "rule__Menu__Group_4__2"
    // InternalNav.g:605:1: rule__Menu__Group_4__2 : rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3 ;
    public final void rule__Menu__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:609:1: ( rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3 )
            // InternalNav.g:610:2: rule__Menu__Group_4__2__Impl rule__Menu__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__Menu__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__2"


    // $ANTLR start "rule__Menu__Group_4__2__Impl"
    // InternalNav.g:617:1: rule__Menu__Group_4__2__Impl : ( ( rule__Menu__PagesAssignment_4_2 ) ) ;
    public final void rule__Menu__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:621:1: ( ( ( rule__Menu__PagesAssignment_4_2 ) ) )
            // InternalNav.g:622:1: ( ( rule__Menu__PagesAssignment_4_2 ) )
            {
            // InternalNav.g:622:1: ( ( rule__Menu__PagesAssignment_4_2 ) )
            // InternalNav.g:623:2: ( rule__Menu__PagesAssignment_4_2 )
            {
             before(grammarAccess.getMenuAccess().getPagesAssignment_4_2()); 
            // InternalNav.g:624:2: ( rule__Menu__PagesAssignment_4_2 )
            // InternalNav.g:624:3: rule__Menu__PagesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Menu__PagesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getPagesAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__2__Impl"


    // $ANTLR start "rule__Menu__Group_4__3"
    // InternalNav.g:632:1: rule__Menu__Group_4__3 : rule__Menu__Group_4__3__Impl rule__Menu__Group_4__4 ;
    public final void rule__Menu__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:636:1: ( rule__Menu__Group_4__3__Impl rule__Menu__Group_4__4 )
            // InternalNav.g:637:2: rule__Menu__Group_4__3__Impl rule__Menu__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__Menu__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__3"


    // $ANTLR start "rule__Menu__Group_4__3__Impl"
    // InternalNav.g:644:1: rule__Menu__Group_4__3__Impl : ( ( rule__Menu__Group_4_3__0 )* ) ;
    public final void rule__Menu__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:648:1: ( ( ( rule__Menu__Group_4_3__0 )* ) )
            // InternalNav.g:649:1: ( ( rule__Menu__Group_4_3__0 )* )
            {
            // InternalNav.g:649:1: ( ( rule__Menu__Group_4_3__0 )* )
            // InternalNav.g:650:2: ( rule__Menu__Group_4_3__0 )*
            {
             before(grammarAccess.getMenuAccess().getGroup_4_3()); 
            // InternalNav.g:651:2: ( rule__Menu__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalNav.g:651:3: rule__Menu__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Menu__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMenuAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__3__Impl"


    // $ANTLR start "rule__Menu__Group_4__4"
    // InternalNav.g:659:1: rule__Menu__Group_4__4 : rule__Menu__Group_4__4__Impl ;
    public final void rule__Menu__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:663:1: ( rule__Menu__Group_4__4__Impl )
            // InternalNav.g:664:2: rule__Menu__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__4"


    // $ANTLR start "rule__Menu__Group_4__4__Impl"
    // InternalNav.g:670:1: rule__Menu__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Menu__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:674:1: ( ( '}' ) )
            // InternalNav.g:675:1: ( '}' )
            {
            // InternalNav.g:675:1: ( '}' )
            // InternalNav.g:676:2: '}'
            {
             before(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4__4__Impl"


    // $ANTLR start "rule__Menu__Group_4_3__0"
    // InternalNav.g:686:1: rule__Menu__Group_4_3__0 : rule__Menu__Group_4_3__0__Impl rule__Menu__Group_4_3__1 ;
    public final void rule__Menu__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:690:1: ( rule__Menu__Group_4_3__0__Impl rule__Menu__Group_4_3__1 )
            // InternalNav.g:691:2: rule__Menu__Group_4_3__0__Impl rule__Menu__Group_4_3__1
            {
            pushFollow(FOLLOW_9);
            rule__Menu__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Menu__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4_3__0"


    // $ANTLR start "rule__Menu__Group_4_3__0__Impl"
    // InternalNav.g:698:1: rule__Menu__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Menu__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:702:1: ( ( ',' ) )
            // InternalNav.g:703:1: ( ',' )
            {
            // InternalNav.g:703:1: ( ',' )
            // InternalNav.g:704:2: ','
            {
             before(grammarAccess.getMenuAccess().getCommaKeyword_4_3_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMenuAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4_3__0__Impl"


    // $ANTLR start "rule__Menu__Group_4_3__1"
    // InternalNav.g:713:1: rule__Menu__Group_4_3__1 : rule__Menu__Group_4_3__1__Impl ;
    public final void rule__Menu__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:717:1: ( rule__Menu__Group_4_3__1__Impl )
            // InternalNav.g:718:2: rule__Menu__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Menu__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4_3__1"


    // $ANTLR start "rule__Menu__Group_4_3__1__Impl"
    // InternalNav.g:724:1: rule__Menu__Group_4_3__1__Impl : ( ( rule__Menu__PagesAssignment_4_3_1 ) ) ;
    public final void rule__Menu__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:728:1: ( ( ( rule__Menu__PagesAssignment_4_3_1 ) ) )
            // InternalNav.g:729:1: ( ( rule__Menu__PagesAssignment_4_3_1 ) )
            {
            // InternalNav.g:729:1: ( ( rule__Menu__PagesAssignment_4_3_1 ) )
            // InternalNav.g:730:2: ( rule__Menu__PagesAssignment_4_3_1 )
            {
             before(grammarAccess.getMenuAccess().getPagesAssignment_4_3_1()); 
            // InternalNav.g:731:2: ( rule__Menu__PagesAssignment_4_3_1 )
            // InternalNav.g:731:3: rule__Menu__PagesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Menu__PagesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMenuAccess().getPagesAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__Group_4_3__1__Impl"


    // $ANTLR start "rule__Page__Group__0"
    // InternalNav.g:740:1: rule__Page__Group__0 : rule__Page__Group__0__Impl rule__Page__Group__1 ;
    public final void rule__Page__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:744:1: ( rule__Page__Group__0__Impl rule__Page__Group__1 )
            // InternalNav.g:745:2: rule__Page__Group__0__Impl rule__Page__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Page__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0"


    // $ANTLR start "rule__Page__Group__0__Impl"
    // InternalNav.g:752:1: rule__Page__Group__0__Impl : ( () ) ;
    public final void rule__Page__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:756:1: ( ( () ) )
            // InternalNav.g:757:1: ( () )
            {
            // InternalNav.g:757:1: ( () )
            // InternalNav.g:758:2: ()
            {
             before(grammarAccess.getPageAccess().getPageAction_0()); 
            // InternalNav.g:759:2: ()
            // InternalNav.g:759:3: 
            {
            }

             after(grammarAccess.getPageAccess().getPageAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__0__Impl"


    // $ANTLR start "rule__Page__Group__1"
    // InternalNav.g:767:1: rule__Page__Group__1 : rule__Page__Group__1__Impl rule__Page__Group__2 ;
    public final void rule__Page__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:771:1: ( rule__Page__Group__1__Impl rule__Page__Group__2 )
            // InternalNav.g:772:2: rule__Page__Group__1__Impl rule__Page__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Page__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Page__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1"


    // $ANTLR start "rule__Page__Group__1__Impl"
    // InternalNav.g:779:1: rule__Page__Group__1__Impl : ( 'Page' ) ;
    public final void rule__Page__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:783:1: ( ( 'Page' ) )
            // InternalNav.g:784:1: ( 'Page' )
            {
            // InternalNav.g:784:1: ( 'Page' )
            // InternalNav.g:785:2: 'Page'
            {
             before(grammarAccess.getPageAccess().getPageKeyword_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPageAccess().getPageKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__1__Impl"


    // $ANTLR start "rule__Page__Group__2"
    // InternalNav.g:794:1: rule__Page__Group__2 : rule__Page__Group__2__Impl ;
    public final void rule__Page__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:798:1: ( rule__Page__Group__2__Impl )
            // InternalNav.g:799:2: rule__Page__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Page__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2"


    // $ANTLR start "rule__Page__Group__2__Impl"
    // InternalNav.g:805:1: rule__Page__Group__2__Impl : ( ( rule__Page__NameAssignment_2 ) ) ;
    public final void rule__Page__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:809:1: ( ( ( rule__Page__NameAssignment_2 ) ) )
            // InternalNav.g:810:1: ( ( rule__Page__NameAssignment_2 ) )
            {
            // InternalNav.g:810:1: ( ( rule__Page__NameAssignment_2 ) )
            // InternalNav.g:811:2: ( rule__Page__NameAssignment_2 )
            {
             before(grammarAccess.getPageAccess().getNameAssignment_2()); 
            // InternalNav.g:812:2: ( rule__Page__NameAssignment_2 )
            // InternalNav.g:812:3: rule__Page__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Page__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPageAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__Group__2__Impl"


    // $ANTLR start "rule__NavModel__NameAssignment_2"
    // InternalNav.g:821:1: rule__NavModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__NavModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:825:1: ( ( ruleEString ) )
            // InternalNav.g:826:2: ( ruleEString )
            {
            // InternalNav.g:826:2: ( ruleEString )
            // InternalNav.g:827:3: ruleEString
            {
             before(grammarAccess.getNavModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNavModelAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__NameAssignment_2"


    // $ANTLR start "rule__NavModel__MenuAssignment_4_1"
    // InternalNav.g:836:1: rule__NavModel__MenuAssignment_4_1 : ( ruleMenu ) ;
    public final void rule__NavModel__MenuAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:840:1: ( ( ruleMenu ) )
            // InternalNav.g:841:2: ( ruleMenu )
            {
            // InternalNav.g:841:2: ( ruleMenu )
            // InternalNav.g:842:3: ruleMenu
            {
             before(grammarAccess.getNavModelAccess().getMenuMenuParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMenu();

            state._fsp--;

             after(grammarAccess.getNavModelAccess().getMenuMenuParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavModel__MenuAssignment_4_1"


    // $ANTLR start "rule__Menu__NameAssignment_2"
    // InternalNav.g:851:1: rule__Menu__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Menu__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:855:1: ( ( ruleEString ) )
            // InternalNav.g:856:2: ( ruleEString )
            {
            // InternalNav.g:856:2: ( ruleEString )
            // InternalNav.g:857:3: ruleEString
            {
             before(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__NameAssignment_2"


    // $ANTLR start "rule__Menu__PagesAssignment_4_2"
    // InternalNav.g:866:1: rule__Menu__PagesAssignment_4_2 : ( rulePage ) ;
    public final void rule__Menu__PagesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:870:1: ( ( rulePage ) )
            // InternalNav.g:871:2: ( rulePage )
            {
            // InternalNav.g:871:2: ( rulePage )
            // InternalNav.g:872:3: rulePage
            {
             before(grammarAccess.getMenuAccess().getPagesPageParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            rulePage();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getPagesPageParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__PagesAssignment_4_2"


    // $ANTLR start "rule__Menu__PagesAssignment_4_3_1"
    // InternalNav.g:881:1: rule__Menu__PagesAssignment_4_3_1 : ( rulePage ) ;
    public final void rule__Menu__PagesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:885:1: ( ( rulePage ) )
            // InternalNav.g:886:2: ( rulePage )
            {
            // InternalNav.g:886:2: ( rulePage )
            // InternalNav.g:887:3: rulePage
            {
             before(grammarAccess.getMenuAccess().getPagesPageParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePage();

            state._fsp--;

             after(grammarAccess.getMenuAccess().getPagesPageParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Menu__PagesAssignment_4_3_1"


    // $ANTLR start "rule__Page__NameAssignment_2"
    // InternalNav.g:896:1: rule__Page__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Page__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalNav.g:900:1: ( ( ruleEString ) )
            // InternalNav.g:901:2: ( ruleEString )
            {
            // InternalNav.g:901:2: ( ruleEString )
            // InternalNav.g:902:3: ruleEString
            {
             before(grammarAccess.getPageAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPageAccess().getNameEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Page__NameAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020002L});

}