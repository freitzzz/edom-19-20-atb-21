package pt.isep.edom.project.c2.dsl.rest.ide.contentassist.antlr.internal;

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
import pt.isep.edom.project.c2.dsl.rest.services.RestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestModel'", "'{'", "'}'", "'url'", "'resources'", "','", "'Resource'", "'entity'", "'reference'", "'('", "')'", "'subresource'", "'put'", "'post'", "'delete'", "'get'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRestParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRestParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRestParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRest.g"; }


    	private RestGrammarAccess grammarAccess;

    	public void setGrammarAccess(RestGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRestModel"
    // InternalRest.g:53:1: entryRuleRestModel : ruleRestModel EOF ;
    public final void entryRuleRestModel() throws RecognitionException {
        try {
            // InternalRest.g:54:1: ( ruleRestModel EOF )
            // InternalRest.g:55:1: ruleRestModel EOF
            {
             before(grammarAccess.getRestModelRule()); 
            pushFollow(FOLLOW_1);
            ruleRestModel();

            state._fsp--;

             after(grammarAccess.getRestModelRule()); 
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
    // $ANTLR end "entryRuleRestModel"


    // $ANTLR start "ruleRestModel"
    // InternalRest.g:62:1: ruleRestModel : ( ( rule__RestModel__Group__0 ) ) ;
    public final void ruleRestModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:66:2: ( ( ( rule__RestModel__Group__0 ) ) )
            // InternalRest.g:67:2: ( ( rule__RestModel__Group__0 ) )
            {
            // InternalRest.g:67:2: ( ( rule__RestModel__Group__0 ) )
            // InternalRest.g:68:3: ( rule__RestModel__Group__0 )
            {
             before(grammarAccess.getRestModelAccess().getGroup()); 
            // InternalRest.g:69:3: ( rule__RestModel__Group__0 )
            // InternalRest.g:69:4: rule__RestModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getGroup()); 

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
    // $ANTLR end "ruleRestModel"


    // $ANTLR start "entryRuleEString"
    // InternalRest.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRest.g:79:1: ( ruleEString EOF )
            // InternalRest.g:80:1: ruleEString EOF
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
    // InternalRest.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalRest.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalRest.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalRest.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalRest.g:94:3: ( rule__EString__Alternatives )
            // InternalRest.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleResource"
    // InternalRest.g:103:1: entryRuleResource : ruleResource EOF ;
    public final void entryRuleResource() throws RecognitionException {
        try {
            // InternalRest.g:104:1: ( ruleResource EOF )
            // InternalRest.g:105:1: ruleResource EOF
            {
             before(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceRule()); 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalRest.g:112:1: ruleResource : ( ( rule__Resource__Group__0 ) ) ;
    public final void ruleResource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:116:2: ( ( ( rule__Resource__Group__0 ) ) )
            // InternalRest.g:117:2: ( ( rule__Resource__Group__0 ) )
            {
            // InternalRest.g:117:2: ( ( rule__Resource__Group__0 ) )
            // InternalRest.g:118:3: ( rule__Resource__Group__0 )
            {
             before(grammarAccess.getResourceAccess().getGroup()); 
            // InternalRest.g:119:3: ( rule__Resource__Group__0 )
            // InternalRest.g:119:4: rule__Resource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getGroup()); 

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
    // $ANTLR end "ruleResource"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalRest.g:127:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:131:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalRest.g:132:2: ( RULE_STRING )
                    {
                    // InternalRest.g:132:2: ( RULE_STRING )
                    // InternalRest.g:133:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRest.g:138:2: ( RULE_ID )
                    {
                    // InternalRest.g:138:2: ( RULE_ID )
                    // InternalRest.g:139:3: RULE_ID
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


    // $ANTLR start "rule__RestModel__Group__0"
    // InternalRest.g:148:1: rule__RestModel__Group__0 : rule__RestModel__Group__0__Impl rule__RestModel__Group__1 ;
    public final void rule__RestModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:152:1: ( rule__RestModel__Group__0__Impl rule__RestModel__Group__1 )
            // InternalRest.g:153:2: rule__RestModel__Group__0__Impl rule__RestModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__RestModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group__1();

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
    // $ANTLR end "rule__RestModel__Group__0"


    // $ANTLR start "rule__RestModel__Group__0__Impl"
    // InternalRest.g:160:1: rule__RestModel__Group__0__Impl : ( () ) ;
    public final void rule__RestModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:164:1: ( ( () ) )
            // InternalRest.g:165:1: ( () )
            {
            // InternalRest.g:165:1: ( () )
            // InternalRest.g:166:2: ()
            {
             before(grammarAccess.getRestModelAccess().getRestModelAction_0()); 
            // InternalRest.g:167:2: ()
            // InternalRest.g:167:3: 
            {
            }

             after(grammarAccess.getRestModelAccess().getRestModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RestModel__Group__0__Impl"


    // $ANTLR start "rule__RestModel__Group__1"
    // InternalRest.g:175:1: rule__RestModel__Group__1 : rule__RestModel__Group__1__Impl rule__RestModel__Group__2 ;
    public final void rule__RestModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:179:1: ( rule__RestModel__Group__1__Impl rule__RestModel__Group__2 )
            // InternalRest.g:180:2: rule__RestModel__Group__1__Impl rule__RestModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RestModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group__2();

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
    // $ANTLR end "rule__RestModel__Group__1"


    // $ANTLR start "rule__RestModel__Group__1__Impl"
    // InternalRest.g:187:1: rule__RestModel__Group__1__Impl : ( 'RestModel' ) ;
    public final void rule__RestModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:191:1: ( ( 'RestModel' ) )
            // InternalRest.g:192:1: ( 'RestModel' )
            {
            // InternalRest.g:192:1: ( 'RestModel' )
            // InternalRest.g:193:2: 'RestModel'
            {
             before(grammarAccess.getRestModelAccess().getRestModelKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getRestModelKeyword_1()); 

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
    // $ANTLR end "rule__RestModel__Group__1__Impl"


    // $ANTLR start "rule__RestModel__Group__2"
    // InternalRest.g:202:1: rule__RestModel__Group__2 : rule__RestModel__Group__2__Impl rule__RestModel__Group__3 ;
    public final void rule__RestModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:206:1: ( rule__RestModel__Group__2__Impl rule__RestModel__Group__3 )
            // InternalRest.g:207:2: rule__RestModel__Group__2__Impl rule__RestModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RestModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group__3();

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
    // $ANTLR end "rule__RestModel__Group__2"


    // $ANTLR start "rule__RestModel__Group__2__Impl"
    // InternalRest.g:214:1: rule__RestModel__Group__2__Impl : ( ( rule__RestModel__NameAssignment_2 ) ) ;
    public final void rule__RestModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:218:1: ( ( ( rule__RestModel__NameAssignment_2 ) ) )
            // InternalRest.g:219:1: ( ( rule__RestModel__NameAssignment_2 ) )
            {
            // InternalRest.g:219:1: ( ( rule__RestModel__NameAssignment_2 ) )
            // InternalRest.g:220:2: ( rule__RestModel__NameAssignment_2 )
            {
             before(grammarAccess.getRestModelAccess().getNameAssignment_2()); 
            // InternalRest.g:221:2: ( rule__RestModel__NameAssignment_2 )
            // InternalRest.g:221:3: rule__RestModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__RestModel__Group__2__Impl"


    // $ANTLR start "rule__RestModel__Group__3"
    // InternalRest.g:229:1: rule__RestModel__Group__3 : rule__RestModel__Group__3__Impl rule__RestModel__Group__4 ;
    public final void rule__RestModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:233:1: ( rule__RestModel__Group__3__Impl rule__RestModel__Group__4 )
            // InternalRest.g:234:2: rule__RestModel__Group__3__Impl rule__RestModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__RestModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group__4();

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
    // $ANTLR end "rule__RestModel__Group__3"


    // $ANTLR start "rule__RestModel__Group__3__Impl"
    // InternalRest.g:241:1: rule__RestModel__Group__3__Impl : ( '{' ) ;
    public final void rule__RestModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:245:1: ( ( '{' ) )
            // InternalRest.g:246:1: ( '{' )
            {
            // InternalRest.g:246:1: ( '{' )
            // InternalRest.g:247:2: '{'
            {
             before(grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__RestModel__Group__3__Impl"


    // $ANTLR start "rule__RestModel__Group__4"
    // InternalRest.g:256:1: rule__RestModel__Group__4 : rule__RestModel__Group__4__Impl rule__RestModel__Group__5 ;
    public final void rule__RestModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:260:1: ( rule__RestModel__Group__4__Impl rule__RestModel__Group__5 )
            // InternalRest.g:261:2: rule__RestModel__Group__4__Impl rule__RestModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__RestModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group__5();

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
    // $ANTLR end "rule__RestModel__Group__4"


    // $ANTLR start "rule__RestModel__Group__4__Impl"
    // InternalRest.g:268:1: rule__RestModel__Group__4__Impl : ( ( rule__RestModel__Group_4__0 )? ) ;
    public final void rule__RestModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:272:1: ( ( ( rule__RestModel__Group_4__0 )? ) )
            // InternalRest.g:273:1: ( ( rule__RestModel__Group_4__0 )? )
            {
            // InternalRest.g:273:1: ( ( rule__RestModel__Group_4__0 )? )
            // InternalRest.g:274:2: ( rule__RestModel__Group_4__0 )?
            {
             before(grammarAccess.getRestModelAccess().getGroup_4()); 
            // InternalRest.g:275:2: ( rule__RestModel__Group_4__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalRest.g:275:3: rule__RestModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__RestModel__Group__4__Impl"


    // $ANTLR start "rule__RestModel__Group__5"
    // InternalRest.g:283:1: rule__RestModel__Group__5 : rule__RestModel__Group__5__Impl rule__RestModel__Group__6 ;
    public final void rule__RestModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:287:1: ( rule__RestModel__Group__5__Impl rule__RestModel__Group__6 )
            // InternalRest.g:288:2: rule__RestModel__Group__5__Impl rule__RestModel__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__RestModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group__6();

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
    // $ANTLR end "rule__RestModel__Group__5"


    // $ANTLR start "rule__RestModel__Group__5__Impl"
    // InternalRest.g:295:1: rule__RestModel__Group__5__Impl : ( ( rule__RestModel__Group_5__0 )? ) ;
    public final void rule__RestModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:299:1: ( ( ( rule__RestModel__Group_5__0 )? ) )
            // InternalRest.g:300:1: ( ( rule__RestModel__Group_5__0 )? )
            {
            // InternalRest.g:300:1: ( ( rule__RestModel__Group_5__0 )? )
            // InternalRest.g:301:2: ( rule__RestModel__Group_5__0 )?
            {
             before(grammarAccess.getRestModelAccess().getGroup_5()); 
            // InternalRest.g:302:2: ( rule__RestModel__Group_5__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRest.g:302:3: rule__RestModel__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RestModel__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRestModelAccess().getGroup_5()); 

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
    // $ANTLR end "rule__RestModel__Group__5__Impl"


    // $ANTLR start "rule__RestModel__Group__6"
    // InternalRest.g:310:1: rule__RestModel__Group__6 : rule__RestModel__Group__6__Impl ;
    public final void rule__RestModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:314:1: ( rule__RestModel__Group__6__Impl )
            // InternalRest.g:315:2: rule__RestModel__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__Group__6__Impl();

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
    // $ANTLR end "rule__RestModel__Group__6"


    // $ANTLR start "rule__RestModel__Group__6__Impl"
    // InternalRest.g:321:1: rule__RestModel__Group__6__Impl : ( '}' ) ;
    public final void rule__RestModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:325:1: ( ( '}' ) )
            // InternalRest.g:326:1: ( '}' )
            {
            // InternalRest.g:326:1: ( '}' )
            // InternalRest.g:327:2: '}'
            {
             before(grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__RestModel__Group__6__Impl"


    // $ANTLR start "rule__RestModel__Group_4__0"
    // InternalRest.g:337:1: rule__RestModel__Group_4__0 : rule__RestModel__Group_4__0__Impl rule__RestModel__Group_4__1 ;
    public final void rule__RestModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:341:1: ( rule__RestModel__Group_4__0__Impl rule__RestModel__Group_4__1 )
            // InternalRest.g:342:2: rule__RestModel__Group_4__0__Impl rule__RestModel__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__RestModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group_4__1();

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
    // $ANTLR end "rule__RestModel__Group_4__0"


    // $ANTLR start "rule__RestModel__Group_4__0__Impl"
    // InternalRest.g:349:1: rule__RestModel__Group_4__0__Impl : ( 'url' ) ;
    public final void rule__RestModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:353:1: ( ( 'url' ) )
            // InternalRest.g:354:1: ( 'url' )
            {
            // InternalRest.g:354:1: ( 'url' )
            // InternalRest.g:355:2: 'url'
            {
             before(grammarAccess.getRestModelAccess().getUrlKeyword_4_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getUrlKeyword_4_0()); 

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
    // $ANTLR end "rule__RestModel__Group_4__0__Impl"


    // $ANTLR start "rule__RestModel__Group_4__1"
    // InternalRest.g:364:1: rule__RestModel__Group_4__1 : rule__RestModel__Group_4__1__Impl ;
    public final void rule__RestModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:368:1: ( rule__RestModel__Group_4__1__Impl )
            // InternalRest.g:369:2: rule__RestModel__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__Group_4__1__Impl();

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
    // $ANTLR end "rule__RestModel__Group_4__1"


    // $ANTLR start "rule__RestModel__Group_4__1__Impl"
    // InternalRest.g:375:1: rule__RestModel__Group_4__1__Impl : ( ( rule__RestModel__UrlAssignment_4_1 ) ) ;
    public final void rule__RestModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:379:1: ( ( ( rule__RestModel__UrlAssignment_4_1 ) ) )
            // InternalRest.g:380:1: ( ( rule__RestModel__UrlAssignment_4_1 ) )
            {
            // InternalRest.g:380:1: ( ( rule__RestModel__UrlAssignment_4_1 ) )
            // InternalRest.g:381:2: ( rule__RestModel__UrlAssignment_4_1 )
            {
             before(grammarAccess.getRestModelAccess().getUrlAssignment_4_1()); 
            // InternalRest.g:382:2: ( rule__RestModel__UrlAssignment_4_1 )
            // InternalRest.g:382:3: rule__RestModel__UrlAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__UrlAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getUrlAssignment_4_1()); 

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
    // $ANTLR end "rule__RestModel__Group_4__1__Impl"


    // $ANTLR start "rule__RestModel__Group_5__0"
    // InternalRest.g:391:1: rule__RestModel__Group_5__0 : rule__RestModel__Group_5__0__Impl rule__RestModel__Group_5__1 ;
    public final void rule__RestModel__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:395:1: ( rule__RestModel__Group_5__0__Impl rule__RestModel__Group_5__1 )
            // InternalRest.g:396:2: rule__RestModel__Group_5__0__Impl rule__RestModel__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__RestModel__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group_5__1();

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
    // $ANTLR end "rule__RestModel__Group_5__0"


    // $ANTLR start "rule__RestModel__Group_5__0__Impl"
    // InternalRest.g:403:1: rule__RestModel__Group_5__0__Impl : ( 'resources' ) ;
    public final void rule__RestModel__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:407:1: ( ( 'resources' ) )
            // InternalRest.g:408:1: ( 'resources' )
            {
            // InternalRest.g:408:1: ( 'resources' )
            // InternalRest.g:409:2: 'resources'
            {
             before(grammarAccess.getRestModelAccess().getResourcesKeyword_5_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getResourcesKeyword_5_0()); 

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
    // $ANTLR end "rule__RestModel__Group_5__0__Impl"


    // $ANTLR start "rule__RestModel__Group_5__1"
    // InternalRest.g:418:1: rule__RestModel__Group_5__1 : rule__RestModel__Group_5__1__Impl rule__RestModel__Group_5__2 ;
    public final void rule__RestModel__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:422:1: ( rule__RestModel__Group_5__1__Impl rule__RestModel__Group_5__2 )
            // InternalRest.g:423:2: rule__RestModel__Group_5__1__Impl rule__RestModel__Group_5__2
            {
            pushFollow(FOLLOW_7);
            rule__RestModel__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group_5__2();

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
    // $ANTLR end "rule__RestModel__Group_5__1"


    // $ANTLR start "rule__RestModel__Group_5__1__Impl"
    // InternalRest.g:430:1: rule__RestModel__Group_5__1__Impl : ( '{' ) ;
    public final void rule__RestModel__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:434:1: ( ( '{' ) )
            // InternalRest.g:435:1: ( '{' )
            {
            // InternalRest.g:435:1: ( '{' )
            // InternalRest.g:436:2: '{'
            {
             before(grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__RestModel__Group_5__1__Impl"


    // $ANTLR start "rule__RestModel__Group_5__2"
    // InternalRest.g:445:1: rule__RestModel__Group_5__2 : rule__RestModel__Group_5__2__Impl rule__RestModel__Group_5__3 ;
    public final void rule__RestModel__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:449:1: ( rule__RestModel__Group_5__2__Impl rule__RestModel__Group_5__3 )
            // InternalRest.g:450:2: rule__RestModel__Group_5__2__Impl rule__RestModel__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__RestModel__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group_5__3();

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
    // $ANTLR end "rule__RestModel__Group_5__2"


    // $ANTLR start "rule__RestModel__Group_5__2__Impl"
    // InternalRest.g:457:1: rule__RestModel__Group_5__2__Impl : ( ( rule__RestModel__ResourcesAssignment_5_2 ) ) ;
    public final void rule__RestModel__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:461:1: ( ( ( rule__RestModel__ResourcesAssignment_5_2 ) ) )
            // InternalRest.g:462:1: ( ( rule__RestModel__ResourcesAssignment_5_2 ) )
            {
            // InternalRest.g:462:1: ( ( rule__RestModel__ResourcesAssignment_5_2 ) )
            // InternalRest.g:463:2: ( rule__RestModel__ResourcesAssignment_5_2 )
            {
             before(grammarAccess.getRestModelAccess().getResourcesAssignment_5_2()); 
            // InternalRest.g:464:2: ( rule__RestModel__ResourcesAssignment_5_2 )
            // InternalRest.g:464:3: rule__RestModel__ResourcesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__ResourcesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getResourcesAssignment_5_2()); 

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
    // $ANTLR end "rule__RestModel__Group_5__2__Impl"


    // $ANTLR start "rule__RestModel__Group_5__3"
    // InternalRest.g:472:1: rule__RestModel__Group_5__3 : rule__RestModel__Group_5__3__Impl rule__RestModel__Group_5__4 ;
    public final void rule__RestModel__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:476:1: ( rule__RestModel__Group_5__3__Impl rule__RestModel__Group_5__4 )
            // InternalRest.g:477:2: rule__RestModel__Group_5__3__Impl rule__RestModel__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__RestModel__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group_5__4();

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
    // $ANTLR end "rule__RestModel__Group_5__3"


    // $ANTLR start "rule__RestModel__Group_5__3__Impl"
    // InternalRest.g:484:1: rule__RestModel__Group_5__3__Impl : ( ( rule__RestModel__Group_5_3__0 )* ) ;
    public final void rule__RestModel__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:488:1: ( ( ( rule__RestModel__Group_5_3__0 )* ) )
            // InternalRest.g:489:1: ( ( rule__RestModel__Group_5_3__0 )* )
            {
            // InternalRest.g:489:1: ( ( rule__RestModel__Group_5_3__0 )* )
            // InternalRest.g:490:2: ( rule__RestModel__Group_5_3__0 )*
            {
             before(grammarAccess.getRestModelAccess().getGroup_5_3()); 
            // InternalRest.g:491:2: ( rule__RestModel__Group_5_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalRest.g:491:3: rule__RestModel__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__RestModel__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRestModelAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__RestModel__Group_5__3__Impl"


    // $ANTLR start "rule__RestModel__Group_5__4"
    // InternalRest.g:499:1: rule__RestModel__Group_5__4 : rule__RestModel__Group_5__4__Impl ;
    public final void rule__RestModel__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:503:1: ( rule__RestModel__Group_5__4__Impl )
            // InternalRest.g:504:2: rule__RestModel__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__Group_5__4__Impl();

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
    // $ANTLR end "rule__RestModel__Group_5__4"


    // $ANTLR start "rule__RestModel__Group_5__4__Impl"
    // InternalRest.g:510:1: rule__RestModel__Group_5__4__Impl : ( '}' ) ;
    public final void rule__RestModel__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:514:1: ( ( '}' ) )
            // InternalRest.g:515:1: ( '}' )
            {
            // InternalRest.g:515:1: ( '}' )
            // InternalRest.g:516:2: '}'
            {
             before(grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__RestModel__Group_5__4__Impl"


    // $ANTLR start "rule__RestModel__Group_5_3__0"
    // InternalRest.g:526:1: rule__RestModel__Group_5_3__0 : rule__RestModel__Group_5_3__0__Impl rule__RestModel__Group_5_3__1 ;
    public final void rule__RestModel__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:530:1: ( rule__RestModel__Group_5_3__0__Impl rule__RestModel__Group_5_3__1 )
            // InternalRest.g:531:2: rule__RestModel__Group_5_3__0__Impl rule__RestModel__Group_5_3__1
            {
            pushFollow(FOLLOW_7);
            rule__RestModel__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RestModel__Group_5_3__1();

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
    // $ANTLR end "rule__RestModel__Group_5_3__0"


    // $ANTLR start "rule__RestModel__Group_5_3__0__Impl"
    // InternalRest.g:538:1: rule__RestModel__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__RestModel__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:542:1: ( ( ',' ) )
            // InternalRest.g:543:1: ( ',' )
            {
            // InternalRest.g:543:1: ( ',' )
            // InternalRest.g:544:2: ','
            {
             before(grammarAccess.getRestModelAccess().getCommaKeyword_5_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRestModelAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__RestModel__Group_5_3__0__Impl"


    // $ANTLR start "rule__RestModel__Group_5_3__1"
    // InternalRest.g:553:1: rule__RestModel__Group_5_3__1 : rule__RestModel__Group_5_3__1__Impl ;
    public final void rule__RestModel__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:557:1: ( rule__RestModel__Group_5_3__1__Impl )
            // InternalRest.g:558:2: rule__RestModel__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__RestModel__Group_5_3__1"


    // $ANTLR start "rule__RestModel__Group_5_3__1__Impl"
    // InternalRest.g:564:1: rule__RestModel__Group_5_3__1__Impl : ( ( rule__RestModel__ResourcesAssignment_5_3_1 ) ) ;
    public final void rule__RestModel__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:568:1: ( ( ( rule__RestModel__ResourcesAssignment_5_3_1 ) ) )
            // InternalRest.g:569:1: ( ( rule__RestModel__ResourcesAssignment_5_3_1 ) )
            {
            // InternalRest.g:569:1: ( ( rule__RestModel__ResourcesAssignment_5_3_1 ) )
            // InternalRest.g:570:2: ( rule__RestModel__ResourcesAssignment_5_3_1 )
            {
             before(grammarAccess.getRestModelAccess().getResourcesAssignment_5_3_1()); 
            // InternalRest.g:571:2: ( rule__RestModel__ResourcesAssignment_5_3_1 )
            // InternalRest.g:571:3: rule__RestModel__ResourcesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__RestModel__ResourcesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getRestModelAccess().getResourcesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__RestModel__Group_5_3__1__Impl"


    // $ANTLR start "rule__Resource__Group__0"
    // InternalRest.g:580:1: rule__Resource__Group__0 : rule__Resource__Group__0__Impl rule__Resource__Group__1 ;
    public final void rule__Resource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:584:1: ( rule__Resource__Group__0__Impl rule__Resource__Group__1 )
            // InternalRest.g:585:2: rule__Resource__Group__0__Impl rule__Resource__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__1();

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
    // $ANTLR end "rule__Resource__Group__0"


    // $ANTLR start "rule__Resource__Group__0__Impl"
    // InternalRest.g:592:1: rule__Resource__Group__0__Impl : ( () ) ;
    public final void rule__Resource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:596:1: ( ( () ) )
            // InternalRest.g:597:1: ( () )
            {
            // InternalRest.g:597:1: ( () )
            // InternalRest.g:598:2: ()
            {
             before(grammarAccess.getResourceAccess().getResourceAction_0()); 
            // InternalRest.g:599:2: ()
            // InternalRest.g:599:3: 
            {
            }

             after(grammarAccess.getResourceAccess().getResourceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Resource__Group__0__Impl"


    // $ANTLR start "rule__Resource__Group__1"
    // InternalRest.g:607:1: rule__Resource__Group__1 : rule__Resource__Group__1__Impl rule__Resource__Group__2 ;
    public final void rule__Resource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:611:1: ( rule__Resource__Group__1__Impl rule__Resource__Group__2 )
            // InternalRest.g:612:2: rule__Resource__Group__1__Impl rule__Resource__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__2();

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
    // $ANTLR end "rule__Resource__Group__1"


    // $ANTLR start "rule__Resource__Group__1__Impl"
    // InternalRest.g:619:1: rule__Resource__Group__1__Impl : ( ( rule__Resource__PutAssignment_1 )? ) ;
    public final void rule__Resource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:623:1: ( ( ( rule__Resource__PutAssignment_1 )? ) )
            // InternalRest.g:624:1: ( ( rule__Resource__PutAssignment_1 )? )
            {
            // InternalRest.g:624:1: ( ( rule__Resource__PutAssignment_1 )? )
            // InternalRest.g:625:2: ( rule__Resource__PutAssignment_1 )?
            {
             before(grammarAccess.getResourceAccess().getPutAssignment_1()); 
            // InternalRest.g:626:2: ( rule__Resource__PutAssignment_1 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:626:3: rule__Resource__PutAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__PutAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getPutAssignment_1()); 

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
    // $ANTLR end "rule__Resource__Group__1__Impl"


    // $ANTLR start "rule__Resource__Group__2"
    // InternalRest.g:634:1: rule__Resource__Group__2 : rule__Resource__Group__2__Impl rule__Resource__Group__3 ;
    public final void rule__Resource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:638:1: ( rule__Resource__Group__2__Impl rule__Resource__Group__3 )
            // InternalRest.g:639:2: rule__Resource__Group__2__Impl rule__Resource__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__3();

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
    // $ANTLR end "rule__Resource__Group__2"


    // $ANTLR start "rule__Resource__Group__2__Impl"
    // InternalRest.g:646:1: rule__Resource__Group__2__Impl : ( ( rule__Resource__PostAssignment_2 )? ) ;
    public final void rule__Resource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:650:1: ( ( ( rule__Resource__PostAssignment_2 )? ) )
            // InternalRest.g:651:1: ( ( rule__Resource__PostAssignment_2 )? )
            {
            // InternalRest.g:651:1: ( ( rule__Resource__PostAssignment_2 )? )
            // InternalRest.g:652:2: ( rule__Resource__PostAssignment_2 )?
            {
             before(grammarAccess.getResourceAccess().getPostAssignment_2()); 
            // InternalRest.g:653:2: ( rule__Resource__PostAssignment_2 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:653:3: rule__Resource__PostAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__PostAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getPostAssignment_2()); 

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
    // $ANTLR end "rule__Resource__Group__2__Impl"


    // $ANTLR start "rule__Resource__Group__3"
    // InternalRest.g:661:1: rule__Resource__Group__3 : rule__Resource__Group__3__Impl rule__Resource__Group__4 ;
    public final void rule__Resource__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:665:1: ( rule__Resource__Group__3__Impl rule__Resource__Group__4 )
            // InternalRest.g:666:2: rule__Resource__Group__3__Impl rule__Resource__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__4();

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
    // $ANTLR end "rule__Resource__Group__3"


    // $ANTLR start "rule__Resource__Group__3__Impl"
    // InternalRest.g:673:1: rule__Resource__Group__3__Impl : ( ( rule__Resource__DeleteAssignment_3 )? ) ;
    public final void rule__Resource__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:677:1: ( ( ( rule__Resource__DeleteAssignment_3 )? ) )
            // InternalRest.g:678:1: ( ( rule__Resource__DeleteAssignment_3 )? )
            {
            // InternalRest.g:678:1: ( ( rule__Resource__DeleteAssignment_3 )? )
            // InternalRest.g:679:2: ( rule__Resource__DeleteAssignment_3 )?
            {
             before(grammarAccess.getResourceAccess().getDeleteAssignment_3()); 
            // InternalRest.g:680:2: ( rule__Resource__DeleteAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRest.g:680:3: rule__Resource__DeleteAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__DeleteAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getDeleteAssignment_3()); 

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
    // $ANTLR end "rule__Resource__Group__3__Impl"


    // $ANTLR start "rule__Resource__Group__4"
    // InternalRest.g:688:1: rule__Resource__Group__4 : rule__Resource__Group__4__Impl rule__Resource__Group__5 ;
    public final void rule__Resource__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:692:1: ( rule__Resource__Group__4__Impl rule__Resource__Group__5 )
            // InternalRest.g:693:2: rule__Resource__Group__4__Impl rule__Resource__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__5();

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
    // $ANTLR end "rule__Resource__Group__4"


    // $ANTLR start "rule__Resource__Group__4__Impl"
    // InternalRest.g:700:1: rule__Resource__Group__4__Impl : ( ( rule__Resource__GetAssignment_4 )? ) ;
    public final void rule__Resource__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:704:1: ( ( ( rule__Resource__GetAssignment_4 )? ) )
            // InternalRest.g:705:1: ( ( rule__Resource__GetAssignment_4 )? )
            {
            // InternalRest.g:705:1: ( ( rule__Resource__GetAssignment_4 )? )
            // InternalRest.g:706:2: ( rule__Resource__GetAssignment_4 )?
            {
             before(grammarAccess.getResourceAccess().getGetAssignment_4()); 
            // InternalRest.g:707:2: ( rule__Resource__GetAssignment_4 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==26) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRest.g:707:3: rule__Resource__GetAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__GetAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGetAssignment_4()); 

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
    // $ANTLR end "rule__Resource__Group__4__Impl"


    // $ANTLR start "rule__Resource__Group__5"
    // InternalRest.g:715:1: rule__Resource__Group__5 : rule__Resource__Group__5__Impl rule__Resource__Group__6 ;
    public final void rule__Resource__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:719:1: ( rule__Resource__Group__5__Impl rule__Resource__Group__6 )
            // InternalRest.g:720:2: rule__Resource__Group__5__Impl rule__Resource__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__6();

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
    // $ANTLR end "rule__Resource__Group__5"


    // $ANTLR start "rule__Resource__Group__5__Impl"
    // InternalRest.g:727:1: rule__Resource__Group__5__Impl : ( 'Resource' ) ;
    public final void rule__Resource__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:731:1: ( ( 'Resource' ) )
            // InternalRest.g:732:1: ( 'Resource' )
            {
            // InternalRest.g:732:1: ( 'Resource' )
            // InternalRest.g:733:2: 'Resource'
            {
             before(grammarAccess.getResourceAccess().getResourceKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getResourceKeyword_5()); 

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
    // $ANTLR end "rule__Resource__Group__5__Impl"


    // $ANTLR start "rule__Resource__Group__6"
    // InternalRest.g:742:1: rule__Resource__Group__6 : rule__Resource__Group__6__Impl rule__Resource__Group__7 ;
    public final void rule__Resource__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:746:1: ( rule__Resource__Group__6__Impl rule__Resource__Group__7 )
            // InternalRest.g:747:2: rule__Resource__Group__6__Impl rule__Resource__Group__7
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__7();

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
    // $ANTLR end "rule__Resource__Group__6"


    // $ANTLR start "rule__Resource__Group__6__Impl"
    // InternalRest.g:754:1: rule__Resource__Group__6__Impl : ( ( rule__Resource__NameAssignment_6 ) ) ;
    public final void rule__Resource__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:758:1: ( ( ( rule__Resource__NameAssignment_6 ) ) )
            // InternalRest.g:759:1: ( ( rule__Resource__NameAssignment_6 ) )
            {
            // InternalRest.g:759:1: ( ( rule__Resource__NameAssignment_6 ) )
            // InternalRest.g:760:2: ( rule__Resource__NameAssignment_6 )
            {
             before(grammarAccess.getResourceAccess().getNameAssignment_6()); 
            // InternalRest.g:761:2: ( rule__Resource__NameAssignment_6 )
            // InternalRest.g:761:3: rule__Resource__NameAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Resource__NameAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getNameAssignment_6()); 

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
    // $ANTLR end "rule__Resource__Group__6__Impl"


    // $ANTLR start "rule__Resource__Group__7"
    // InternalRest.g:769:1: rule__Resource__Group__7 : rule__Resource__Group__7__Impl rule__Resource__Group__8 ;
    public final void rule__Resource__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:773:1: ( rule__Resource__Group__7__Impl rule__Resource__Group__8 )
            // InternalRest.g:774:2: rule__Resource__Group__7__Impl rule__Resource__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__Resource__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__8();

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
    // $ANTLR end "rule__Resource__Group__7"


    // $ANTLR start "rule__Resource__Group__7__Impl"
    // InternalRest.g:781:1: rule__Resource__Group__7__Impl : ( '{' ) ;
    public final void rule__Resource__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:785:1: ( ( '{' ) )
            // InternalRest.g:786:1: ( '{' )
            {
            // InternalRest.g:786:1: ( '{' )
            // InternalRest.g:787:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Resource__Group__7__Impl"


    // $ANTLR start "rule__Resource__Group__8"
    // InternalRest.g:796:1: rule__Resource__Group__8 : rule__Resource__Group__8__Impl rule__Resource__Group__9 ;
    public final void rule__Resource__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:800:1: ( rule__Resource__Group__8__Impl rule__Resource__Group__9 )
            // InternalRest.g:801:2: rule__Resource__Group__8__Impl rule__Resource__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Resource__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__9();

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
    // $ANTLR end "rule__Resource__Group__8"


    // $ANTLR start "rule__Resource__Group__8__Impl"
    // InternalRest.g:808:1: rule__Resource__Group__8__Impl : ( ( rule__Resource__Group_8__0 )? ) ;
    public final void rule__Resource__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:812:1: ( ( ( rule__Resource__Group_8__0 )? ) )
            // InternalRest.g:813:1: ( ( rule__Resource__Group_8__0 )? )
            {
            // InternalRest.g:813:1: ( ( rule__Resource__Group_8__0 )? )
            // InternalRest.g:814:2: ( rule__Resource__Group_8__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_8()); 
            // InternalRest.g:815:2: ( rule__Resource__Group_8__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRest.g:815:3: rule__Resource__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Resource__Group__8__Impl"


    // $ANTLR start "rule__Resource__Group__9"
    // InternalRest.g:823:1: rule__Resource__Group__9 : rule__Resource__Group__9__Impl rule__Resource__Group__10 ;
    public final void rule__Resource__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:827:1: ( rule__Resource__Group__9__Impl rule__Resource__Group__10 )
            // InternalRest.g:828:2: rule__Resource__Group__9__Impl rule__Resource__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Resource__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__10();

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
    // $ANTLR end "rule__Resource__Group__9"


    // $ANTLR start "rule__Resource__Group__9__Impl"
    // InternalRest.g:835:1: rule__Resource__Group__9__Impl : ( ( rule__Resource__Group_9__0 )? ) ;
    public final void rule__Resource__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:839:1: ( ( ( rule__Resource__Group_9__0 )? ) )
            // InternalRest.g:840:1: ( ( rule__Resource__Group_9__0 )? )
            {
            // InternalRest.g:840:1: ( ( rule__Resource__Group_9__0 )? )
            // InternalRest.g:841:2: ( rule__Resource__Group_9__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_9()); 
            // InternalRest.g:842:2: ( rule__Resource__Group_9__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRest.g:842:3: rule__Resource__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_9()); 

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
    // $ANTLR end "rule__Resource__Group__9__Impl"


    // $ANTLR start "rule__Resource__Group__10"
    // InternalRest.g:850:1: rule__Resource__Group__10 : rule__Resource__Group__10__Impl rule__Resource__Group__11 ;
    public final void rule__Resource__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:854:1: ( rule__Resource__Group__10__Impl rule__Resource__Group__11 )
            // InternalRest.g:855:2: rule__Resource__Group__10__Impl rule__Resource__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Resource__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group__11();

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
    // $ANTLR end "rule__Resource__Group__10"


    // $ANTLR start "rule__Resource__Group__10__Impl"
    // InternalRest.g:862:1: rule__Resource__Group__10__Impl : ( ( rule__Resource__Group_10__0 )? ) ;
    public final void rule__Resource__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:866:1: ( ( ( rule__Resource__Group_10__0 )? ) )
            // InternalRest.g:867:1: ( ( rule__Resource__Group_10__0 )? )
            {
            // InternalRest.g:867:1: ( ( rule__Resource__Group_10__0 )? )
            // InternalRest.g:868:2: ( rule__Resource__Group_10__0 )?
            {
             before(grammarAccess.getResourceAccess().getGroup_10()); 
            // InternalRest.g:869:2: ( rule__Resource__Group_10__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==22) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:869:3: rule__Resource__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Resource__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResourceAccess().getGroup_10()); 

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
    // $ANTLR end "rule__Resource__Group__10__Impl"


    // $ANTLR start "rule__Resource__Group__11"
    // InternalRest.g:877:1: rule__Resource__Group__11 : rule__Resource__Group__11__Impl ;
    public final void rule__Resource__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:881:1: ( rule__Resource__Group__11__Impl )
            // InternalRest.g:882:2: rule__Resource__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group__11__Impl();

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
    // $ANTLR end "rule__Resource__Group__11"


    // $ANTLR start "rule__Resource__Group__11__Impl"
    // InternalRest.g:888:1: rule__Resource__Group__11__Impl : ( '}' ) ;
    public final void rule__Resource__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:892:1: ( ( '}' ) )
            // InternalRest.g:893:1: ( '}' )
            {
            // InternalRest.g:893:1: ( '}' )
            // InternalRest.g:894:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_11()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_11()); 

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
    // $ANTLR end "rule__Resource__Group__11__Impl"


    // $ANTLR start "rule__Resource__Group_8__0"
    // InternalRest.g:904:1: rule__Resource__Group_8__0 : rule__Resource__Group_8__0__Impl rule__Resource__Group_8__1 ;
    public final void rule__Resource__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:908:1: ( rule__Resource__Group_8__0__Impl rule__Resource__Group_8__1 )
            // InternalRest.g:909:2: rule__Resource__Group_8__0__Impl rule__Resource__Group_8__1
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_8__1();

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
    // $ANTLR end "rule__Resource__Group_8__0"


    // $ANTLR start "rule__Resource__Group_8__0__Impl"
    // InternalRest.g:916:1: rule__Resource__Group_8__0__Impl : ( 'entity' ) ;
    public final void rule__Resource__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:920:1: ( ( 'entity' ) )
            // InternalRest.g:921:1: ( 'entity' )
            {
            // InternalRest.g:921:1: ( 'entity' )
            // InternalRest.g:922:2: 'entity'
            {
             before(grammarAccess.getResourceAccess().getEntityKeyword_8_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getEntityKeyword_8_0()); 

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
    // $ANTLR end "rule__Resource__Group_8__0__Impl"


    // $ANTLR start "rule__Resource__Group_8__1"
    // InternalRest.g:931:1: rule__Resource__Group_8__1 : rule__Resource__Group_8__1__Impl ;
    public final void rule__Resource__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:935:1: ( rule__Resource__Group_8__1__Impl )
            // InternalRest.g:936:2: rule__Resource__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_8__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_8__1"


    // $ANTLR start "rule__Resource__Group_8__1__Impl"
    // InternalRest.g:942:1: rule__Resource__Group_8__1__Impl : ( ( rule__Resource__EntityAssignment_8_1 ) ) ;
    public final void rule__Resource__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:946:1: ( ( ( rule__Resource__EntityAssignment_8_1 ) ) )
            // InternalRest.g:947:1: ( ( rule__Resource__EntityAssignment_8_1 ) )
            {
            // InternalRest.g:947:1: ( ( rule__Resource__EntityAssignment_8_1 ) )
            // InternalRest.g:948:2: ( rule__Resource__EntityAssignment_8_1 )
            {
             before(grammarAccess.getResourceAccess().getEntityAssignment_8_1()); 
            // InternalRest.g:949:2: ( rule__Resource__EntityAssignment_8_1 )
            // InternalRest.g:949:3: rule__Resource__EntityAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__EntityAssignment_8_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getEntityAssignment_8_1()); 

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
    // $ANTLR end "rule__Resource__Group_8__1__Impl"


    // $ANTLR start "rule__Resource__Group_9__0"
    // InternalRest.g:958:1: rule__Resource__Group_9__0 : rule__Resource__Group_9__0__Impl rule__Resource__Group_9__1 ;
    public final void rule__Resource__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:962:1: ( rule__Resource__Group_9__0__Impl rule__Resource__Group_9__1 )
            // InternalRest.g:963:2: rule__Resource__Group_9__0__Impl rule__Resource__Group_9__1
            {
            pushFollow(FOLLOW_11);
            rule__Resource__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_9__1();

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
    // $ANTLR end "rule__Resource__Group_9__0"


    // $ANTLR start "rule__Resource__Group_9__0__Impl"
    // InternalRest.g:970:1: rule__Resource__Group_9__0__Impl : ( 'reference' ) ;
    public final void rule__Resource__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:974:1: ( ( 'reference' ) )
            // InternalRest.g:975:1: ( 'reference' )
            {
            // InternalRest.g:975:1: ( 'reference' )
            // InternalRest.g:976:2: 'reference'
            {
             before(grammarAccess.getResourceAccess().getReferenceKeyword_9_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getReferenceKeyword_9_0()); 

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
    // $ANTLR end "rule__Resource__Group_9__0__Impl"


    // $ANTLR start "rule__Resource__Group_9__1"
    // InternalRest.g:985:1: rule__Resource__Group_9__1 : rule__Resource__Group_9__1__Impl rule__Resource__Group_9__2 ;
    public final void rule__Resource__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:989:1: ( rule__Resource__Group_9__1__Impl rule__Resource__Group_9__2 )
            // InternalRest.g:990:2: rule__Resource__Group_9__1__Impl rule__Resource__Group_9__2
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_9__2();

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
    // $ANTLR end "rule__Resource__Group_9__1"


    // $ANTLR start "rule__Resource__Group_9__1__Impl"
    // InternalRest.g:997:1: rule__Resource__Group_9__1__Impl : ( '(' ) ;
    public final void rule__Resource__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1001:1: ( ( '(' ) )
            // InternalRest.g:1002:1: ( '(' )
            {
            // InternalRest.g:1002:1: ( '(' )
            // InternalRest.g:1003:2: '('
            {
             before(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_9_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftParenthesisKeyword_9_1()); 

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
    // $ANTLR end "rule__Resource__Group_9__1__Impl"


    // $ANTLR start "rule__Resource__Group_9__2"
    // InternalRest.g:1012:1: rule__Resource__Group_9__2 : rule__Resource__Group_9__2__Impl rule__Resource__Group_9__3 ;
    public final void rule__Resource__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1016:1: ( rule__Resource__Group_9__2__Impl rule__Resource__Group_9__3 )
            // InternalRest.g:1017:2: rule__Resource__Group_9__2__Impl rule__Resource__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__Resource__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_9__3();

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
    // $ANTLR end "rule__Resource__Group_9__2"


    // $ANTLR start "rule__Resource__Group_9__2__Impl"
    // InternalRest.g:1024:1: rule__Resource__Group_9__2__Impl : ( ( rule__Resource__ReferenceAssignment_9_2 ) ) ;
    public final void rule__Resource__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1028:1: ( ( ( rule__Resource__ReferenceAssignment_9_2 ) ) )
            // InternalRest.g:1029:1: ( ( rule__Resource__ReferenceAssignment_9_2 ) )
            {
            // InternalRest.g:1029:1: ( ( rule__Resource__ReferenceAssignment_9_2 ) )
            // InternalRest.g:1030:2: ( rule__Resource__ReferenceAssignment_9_2 )
            {
             before(grammarAccess.getResourceAccess().getReferenceAssignment_9_2()); 
            // InternalRest.g:1031:2: ( rule__Resource__ReferenceAssignment_9_2 )
            // InternalRest.g:1031:3: rule__Resource__ReferenceAssignment_9_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ReferenceAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getReferenceAssignment_9_2()); 

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
    // $ANTLR end "rule__Resource__Group_9__2__Impl"


    // $ANTLR start "rule__Resource__Group_9__3"
    // InternalRest.g:1039:1: rule__Resource__Group_9__3 : rule__Resource__Group_9__3__Impl rule__Resource__Group_9__4 ;
    public final void rule__Resource__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1043:1: ( rule__Resource__Group_9__3__Impl rule__Resource__Group_9__4 )
            // InternalRest.g:1044:2: rule__Resource__Group_9__3__Impl rule__Resource__Group_9__4
            {
            pushFollow(FOLLOW_12);
            rule__Resource__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_9__4();

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
    // $ANTLR end "rule__Resource__Group_9__3"


    // $ANTLR start "rule__Resource__Group_9__3__Impl"
    // InternalRest.g:1051:1: rule__Resource__Group_9__3__Impl : ( ( rule__Resource__Group_9_3__0 )* ) ;
    public final void rule__Resource__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1055:1: ( ( ( rule__Resource__Group_9_3__0 )* ) )
            // InternalRest.g:1056:1: ( ( rule__Resource__Group_9_3__0 )* )
            {
            // InternalRest.g:1056:1: ( ( rule__Resource__Group_9_3__0 )* )
            // InternalRest.g:1057:2: ( rule__Resource__Group_9_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_9_3()); 
            // InternalRest.g:1058:2: ( rule__Resource__Group_9_3__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==16) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRest.g:1058:3: rule__Resource__Group_9_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Resource__Group_9_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_9_3()); 

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
    // $ANTLR end "rule__Resource__Group_9__3__Impl"


    // $ANTLR start "rule__Resource__Group_9__4"
    // InternalRest.g:1066:1: rule__Resource__Group_9__4 : rule__Resource__Group_9__4__Impl ;
    public final void rule__Resource__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1070:1: ( rule__Resource__Group_9__4__Impl )
            // InternalRest.g:1071:2: rule__Resource__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_9__4__Impl();

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
    // $ANTLR end "rule__Resource__Group_9__4"


    // $ANTLR start "rule__Resource__Group_9__4__Impl"
    // InternalRest.g:1077:1: rule__Resource__Group_9__4__Impl : ( ')' ) ;
    public final void rule__Resource__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1081:1: ( ( ')' ) )
            // InternalRest.g:1082:1: ( ')' )
            {
            // InternalRest.g:1082:1: ( ')' )
            // InternalRest.g:1083:2: ')'
            {
             before(grammarAccess.getResourceAccess().getRightParenthesisKeyword_9_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightParenthesisKeyword_9_4()); 

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
    // $ANTLR end "rule__Resource__Group_9__4__Impl"


    // $ANTLR start "rule__Resource__Group_9_3__0"
    // InternalRest.g:1093:1: rule__Resource__Group_9_3__0 : rule__Resource__Group_9_3__0__Impl rule__Resource__Group_9_3__1 ;
    public final void rule__Resource__Group_9_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1097:1: ( rule__Resource__Group_9_3__0__Impl rule__Resource__Group_9_3__1 )
            // InternalRest.g:1098:2: rule__Resource__Group_9_3__0__Impl rule__Resource__Group_9_3__1
            {
            pushFollow(FOLLOW_4);
            rule__Resource__Group_9_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_9_3__1();

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
    // $ANTLR end "rule__Resource__Group_9_3__0"


    // $ANTLR start "rule__Resource__Group_9_3__0__Impl"
    // InternalRest.g:1105:1: rule__Resource__Group_9_3__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_9_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1109:1: ( ( ',' ) )
            // InternalRest.g:1110:1: ( ',' )
            {
            // InternalRest.g:1110:1: ( ',' )
            // InternalRest.g:1111:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_9_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_9_3_0()); 

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
    // $ANTLR end "rule__Resource__Group_9_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_9_3__1"
    // InternalRest.g:1120:1: rule__Resource__Group_9_3__1 : rule__Resource__Group_9_3__1__Impl ;
    public final void rule__Resource__Group_9_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1124:1: ( rule__Resource__Group_9_3__1__Impl )
            // InternalRest.g:1125:2: rule__Resource__Group_9_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_9_3__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_9_3__1"


    // $ANTLR start "rule__Resource__Group_9_3__1__Impl"
    // InternalRest.g:1131:1: rule__Resource__Group_9_3__1__Impl : ( ( rule__Resource__ReferenceAssignment_9_3_1 ) ) ;
    public final void rule__Resource__Group_9_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1135:1: ( ( ( rule__Resource__ReferenceAssignment_9_3_1 ) ) )
            // InternalRest.g:1136:1: ( ( rule__Resource__ReferenceAssignment_9_3_1 ) )
            {
            // InternalRest.g:1136:1: ( ( rule__Resource__ReferenceAssignment_9_3_1 ) )
            // InternalRest.g:1137:2: ( rule__Resource__ReferenceAssignment_9_3_1 )
            {
             before(grammarAccess.getResourceAccess().getReferenceAssignment_9_3_1()); 
            // InternalRest.g:1138:2: ( rule__Resource__ReferenceAssignment_9_3_1 )
            // InternalRest.g:1138:3: rule__Resource__ReferenceAssignment_9_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__ReferenceAssignment_9_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getReferenceAssignment_9_3_1()); 

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
    // $ANTLR end "rule__Resource__Group_9_3__1__Impl"


    // $ANTLR start "rule__Resource__Group_10__0"
    // InternalRest.g:1147:1: rule__Resource__Group_10__0 : rule__Resource__Group_10__0__Impl rule__Resource__Group_10__1 ;
    public final void rule__Resource__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1151:1: ( rule__Resource__Group_10__0__Impl rule__Resource__Group_10__1 )
            // InternalRest.g:1152:2: rule__Resource__Group_10__0__Impl rule__Resource__Group_10__1
            {
            pushFollow(FOLLOW_5);
            rule__Resource__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_10__1();

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
    // $ANTLR end "rule__Resource__Group_10__0"


    // $ANTLR start "rule__Resource__Group_10__0__Impl"
    // InternalRest.g:1159:1: rule__Resource__Group_10__0__Impl : ( 'subresource' ) ;
    public final void rule__Resource__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1163:1: ( ( 'subresource' ) )
            // InternalRest.g:1164:1: ( 'subresource' )
            {
            // InternalRest.g:1164:1: ( 'subresource' )
            // InternalRest.g:1165:2: 'subresource'
            {
             before(grammarAccess.getResourceAccess().getSubresourceKeyword_10_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getSubresourceKeyword_10_0()); 

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
    // $ANTLR end "rule__Resource__Group_10__0__Impl"


    // $ANTLR start "rule__Resource__Group_10__1"
    // InternalRest.g:1174:1: rule__Resource__Group_10__1 : rule__Resource__Group_10__1__Impl rule__Resource__Group_10__2 ;
    public final void rule__Resource__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1178:1: ( rule__Resource__Group_10__1__Impl rule__Resource__Group_10__2 )
            // InternalRest.g:1179:2: rule__Resource__Group_10__1__Impl rule__Resource__Group_10__2
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_10__2();

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
    // $ANTLR end "rule__Resource__Group_10__1"


    // $ANTLR start "rule__Resource__Group_10__1__Impl"
    // InternalRest.g:1186:1: rule__Resource__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Resource__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1190:1: ( ( '{' ) )
            // InternalRest.g:1191:1: ( '{' )
            {
            // InternalRest.g:1191:1: ( '{' )
            // InternalRest.g:1192:2: '{'
            {
             before(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_10_1()); 

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
    // $ANTLR end "rule__Resource__Group_10__1__Impl"


    // $ANTLR start "rule__Resource__Group_10__2"
    // InternalRest.g:1201:1: rule__Resource__Group_10__2 : rule__Resource__Group_10__2__Impl rule__Resource__Group_10__3 ;
    public final void rule__Resource__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1205:1: ( rule__Resource__Group_10__2__Impl rule__Resource__Group_10__3 )
            // InternalRest.g:1206:2: rule__Resource__Group_10__2__Impl rule__Resource__Group_10__3
            {
            pushFollow(FOLLOW_8);
            rule__Resource__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_10__3();

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
    // $ANTLR end "rule__Resource__Group_10__2"


    // $ANTLR start "rule__Resource__Group_10__2__Impl"
    // InternalRest.g:1213:1: rule__Resource__Group_10__2__Impl : ( ( rule__Resource__SubresourceAssignment_10_2 ) ) ;
    public final void rule__Resource__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1217:1: ( ( ( rule__Resource__SubresourceAssignment_10_2 ) ) )
            // InternalRest.g:1218:1: ( ( rule__Resource__SubresourceAssignment_10_2 ) )
            {
            // InternalRest.g:1218:1: ( ( rule__Resource__SubresourceAssignment_10_2 ) )
            // InternalRest.g:1219:2: ( rule__Resource__SubresourceAssignment_10_2 )
            {
             before(grammarAccess.getResourceAccess().getSubresourceAssignment_10_2()); 
            // InternalRest.g:1220:2: ( rule__Resource__SubresourceAssignment_10_2 )
            // InternalRest.g:1220:3: rule__Resource__SubresourceAssignment_10_2
            {
            pushFollow(FOLLOW_2);
            rule__Resource__SubresourceAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getSubresourceAssignment_10_2()); 

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
    // $ANTLR end "rule__Resource__Group_10__2__Impl"


    // $ANTLR start "rule__Resource__Group_10__3"
    // InternalRest.g:1228:1: rule__Resource__Group_10__3 : rule__Resource__Group_10__3__Impl rule__Resource__Group_10__4 ;
    public final void rule__Resource__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1232:1: ( rule__Resource__Group_10__3__Impl rule__Resource__Group_10__4 )
            // InternalRest.g:1233:2: rule__Resource__Group_10__3__Impl rule__Resource__Group_10__4
            {
            pushFollow(FOLLOW_8);
            rule__Resource__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_10__4();

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
    // $ANTLR end "rule__Resource__Group_10__3"


    // $ANTLR start "rule__Resource__Group_10__3__Impl"
    // InternalRest.g:1240:1: rule__Resource__Group_10__3__Impl : ( ( rule__Resource__Group_10_3__0 )* ) ;
    public final void rule__Resource__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1244:1: ( ( ( rule__Resource__Group_10_3__0 )* ) )
            // InternalRest.g:1245:1: ( ( rule__Resource__Group_10_3__0 )* )
            {
            // InternalRest.g:1245:1: ( ( rule__Resource__Group_10_3__0 )* )
            // InternalRest.g:1246:2: ( rule__Resource__Group_10_3__0 )*
            {
             before(grammarAccess.getResourceAccess().getGroup_10_3()); 
            // InternalRest.g:1247:2: ( rule__Resource__Group_10_3__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==16) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalRest.g:1247:3: rule__Resource__Group_10_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Resource__Group_10_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getResourceAccess().getGroup_10_3()); 

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
    // $ANTLR end "rule__Resource__Group_10__3__Impl"


    // $ANTLR start "rule__Resource__Group_10__4"
    // InternalRest.g:1255:1: rule__Resource__Group_10__4 : rule__Resource__Group_10__4__Impl ;
    public final void rule__Resource__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1259:1: ( rule__Resource__Group_10__4__Impl )
            // InternalRest.g:1260:2: rule__Resource__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_10__4__Impl();

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
    // $ANTLR end "rule__Resource__Group_10__4"


    // $ANTLR start "rule__Resource__Group_10__4__Impl"
    // InternalRest.g:1266:1: rule__Resource__Group_10__4__Impl : ( '}' ) ;
    public final void rule__Resource__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1270:1: ( ( '}' ) )
            // InternalRest.g:1271:1: ( '}' )
            {
            // InternalRest.g:1271:1: ( '}' )
            // InternalRest.g:1272:2: '}'
            {
             before(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_10_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_10_4()); 

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
    // $ANTLR end "rule__Resource__Group_10__4__Impl"


    // $ANTLR start "rule__Resource__Group_10_3__0"
    // InternalRest.g:1282:1: rule__Resource__Group_10_3__0 : rule__Resource__Group_10_3__0__Impl rule__Resource__Group_10_3__1 ;
    public final void rule__Resource__Group_10_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1286:1: ( rule__Resource__Group_10_3__0__Impl rule__Resource__Group_10_3__1 )
            // InternalRest.g:1287:2: rule__Resource__Group_10_3__0__Impl rule__Resource__Group_10_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Resource__Group_10_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Resource__Group_10_3__1();

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
    // $ANTLR end "rule__Resource__Group_10_3__0"


    // $ANTLR start "rule__Resource__Group_10_3__0__Impl"
    // InternalRest.g:1294:1: rule__Resource__Group_10_3__0__Impl : ( ',' ) ;
    public final void rule__Resource__Group_10_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1298:1: ( ( ',' ) )
            // InternalRest.g:1299:1: ( ',' )
            {
            // InternalRest.g:1299:1: ( ',' )
            // InternalRest.g:1300:2: ','
            {
             before(grammarAccess.getResourceAccess().getCommaKeyword_10_3_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getCommaKeyword_10_3_0()); 

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
    // $ANTLR end "rule__Resource__Group_10_3__0__Impl"


    // $ANTLR start "rule__Resource__Group_10_3__1"
    // InternalRest.g:1309:1: rule__Resource__Group_10_3__1 : rule__Resource__Group_10_3__1__Impl ;
    public final void rule__Resource__Group_10_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1313:1: ( rule__Resource__Group_10_3__1__Impl )
            // InternalRest.g:1314:2: rule__Resource__Group_10_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Resource__Group_10_3__1__Impl();

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
    // $ANTLR end "rule__Resource__Group_10_3__1"


    // $ANTLR start "rule__Resource__Group_10_3__1__Impl"
    // InternalRest.g:1320:1: rule__Resource__Group_10_3__1__Impl : ( ( rule__Resource__SubresourceAssignment_10_3_1 ) ) ;
    public final void rule__Resource__Group_10_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1324:1: ( ( ( rule__Resource__SubresourceAssignment_10_3_1 ) ) )
            // InternalRest.g:1325:1: ( ( rule__Resource__SubresourceAssignment_10_3_1 ) )
            {
            // InternalRest.g:1325:1: ( ( rule__Resource__SubresourceAssignment_10_3_1 ) )
            // InternalRest.g:1326:2: ( rule__Resource__SubresourceAssignment_10_3_1 )
            {
             before(grammarAccess.getResourceAccess().getSubresourceAssignment_10_3_1()); 
            // InternalRest.g:1327:2: ( rule__Resource__SubresourceAssignment_10_3_1 )
            // InternalRest.g:1327:3: rule__Resource__SubresourceAssignment_10_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Resource__SubresourceAssignment_10_3_1();

            state._fsp--;


            }

             after(grammarAccess.getResourceAccess().getSubresourceAssignment_10_3_1()); 

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
    // $ANTLR end "rule__Resource__Group_10_3__1__Impl"


    // $ANTLR start "rule__RestModel__NameAssignment_2"
    // InternalRest.g:1336:1: rule__RestModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__RestModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1340:1: ( ( ruleEString ) )
            // InternalRest.g:1341:2: ( ruleEString )
            {
            // InternalRest.g:1341:2: ( ruleEString )
            // InternalRest.g:1342:3: ruleEString
            {
             before(grammarAccess.getRestModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__RestModel__NameAssignment_2"


    // $ANTLR start "rule__RestModel__UrlAssignment_4_1"
    // InternalRest.g:1351:1: rule__RestModel__UrlAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RestModel__UrlAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1355:1: ( ( ruleEString ) )
            // InternalRest.g:1356:2: ( ruleEString )
            {
            // InternalRest.g:1356:2: ( ruleEString )
            // InternalRest.g:1357:3: ruleEString
            {
             before(grammarAccess.getRestModelAccess().getUrlEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRestModelAccess().getUrlEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__RestModel__UrlAssignment_4_1"


    // $ANTLR start "rule__RestModel__ResourcesAssignment_5_2"
    // InternalRest.g:1366:1: rule__RestModel__ResourcesAssignment_5_2 : ( ruleResource ) ;
    public final void rule__RestModel__ResourcesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1370:1: ( ( ruleResource ) )
            // InternalRest.g:1371:2: ( ruleResource )
            {
            // InternalRest.g:1371:2: ( ruleResource )
            // InternalRest.g:1372:3: ruleResource
            {
             before(grammarAccess.getRestModelAccess().getResourcesResourceParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getRestModelAccess().getResourcesResourceParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__RestModel__ResourcesAssignment_5_2"


    // $ANTLR start "rule__RestModel__ResourcesAssignment_5_3_1"
    // InternalRest.g:1381:1: rule__RestModel__ResourcesAssignment_5_3_1 : ( ruleResource ) ;
    public final void rule__RestModel__ResourcesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1385:1: ( ( ruleResource ) )
            // InternalRest.g:1386:2: ( ruleResource )
            {
            // InternalRest.g:1386:2: ( ruleResource )
            // InternalRest.g:1387:3: ruleResource
            {
             before(grammarAccess.getRestModelAccess().getResourcesResourceParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getRestModelAccess().getResourcesResourceParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__RestModel__ResourcesAssignment_5_3_1"


    // $ANTLR start "rule__Resource__PutAssignment_1"
    // InternalRest.g:1396:1: rule__Resource__PutAssignment_1 : ( ( 'put' ) ) ;
    public final void rule__Resource__PutAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1400:1: ( ( ( 'put' ) ) )
            // InternalRest.g:1401:2: ( ( 'put' ) )
            {
            // InternalRest.g:1401:2: ( ( 'put' ) )
            // InternalRest.g:1402:3: ( 'put' )
            {
             before(grammarAccess.getResourceAccess().getPutPutKeyword_1_0()); 
            // InternalRest.g:1403:3: ( 'put' )
            // InternalRest.g:1404:4: 'put'
            {
             before(grammarAccess.getResourceAccess().getPutPutKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getPutPutKeyword_1_0()); 

            }

             after(grammarAccess.getResourceAccess().getPutPutKeyword_1_0()); 

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
    // $ANTLR end "rule__Resource__PutAssignment_1"


    // $ANTLR start "rule__Resource__PostAssignment_2"
    // InternalRest.g:1415:1: rule__Resource__PostAssignment_2 : ( ( 'post' ) ) ;
    public final void rule__Resource__PostAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1419:1: ( ( ( 'post' ) ) )
            // InternalRest.g:1420:2: ( ( 'post' ) )
            {
            // InternalRest.g:1420:2: ( ( 'post' ) )
            // InternalRest.g:1421:3: ( 'post' )
            {
             before(grammarAccess.getResourceAccess().getPostPostKeyword_2_0()); 
            // InternalRest.g:1422:3: ( 'post' )
            // InternalRest.g:1423:4: 'post'
            {
             before(grammarAccess.getResourceAccess().getPostPostKeyword_2_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getPostPostKeyword_2_0()); 

            }

             after(grammarAccess.getResourceAccess().getPostPostKeyword_2_0()); 

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
    // $ANTLR end "rule__Resource__PostAssignment_2"


    // $ANTLR start "rule__Resource__DeleteAssignment_3"
    // InternalRest.g:1434:1: rule__Resource__DeleteAssignment_3 : ( ( 'delete' ) ) ;
    public final void rule__Resource__DeleteAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1438:1: ( ( ( 'delete' ) ) )
            // InternalRest.g:1439:2: ( ( 'delete' ) )
            {
            // InternalRest.g:1439:2: ( ( 'delete' ) )
            // InternalRest.g:1440:3: ( 'delete' )
            {
             before(grammarAccess.getResourceAccess().getDeleteDeleteKeyword_3_0()); 
            // InternalRest.g:1441:3: ( 'delete' )
            // InternalRest.g:1442:4: 'delete'
            {
             before(grammarAccess.getResourceAccess().getDeleteDeleteKeyword_3_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getDeleteDeleteKeyword_3_0()); 

            }

             after(grammarAccess.getResourceAccess().getDeleteDeleteKeyword_3_0()); 

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
    // $ANTLR end "rule__Resource__DeleteAssignment_3"


    // $ANTLR start "rule__Resource__GetAssignment_4"
    // InternalRest.g:1453:1: rule__Resource__GetAssignment_4 : ( ( 'get' ) ) ;
    public final void rule__Resource__GetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1457:1: ( ( ( 'get' ) ) )
            // InternalRest.g:1458:2: ( ( 'get' ) )
            {
            // InternalRest.g:1458:2: ( ( 'get' ) )
            // InternalRest.g:1459:3: ( 'get' )
            {
             before(grammarAccess.getResourceAccess().getGetGetKeyword_4_0()); 
            // InternalRest.g:1460:3: ( 'get' )
            // InternalRest.g:1461:4: 'get'
            {
             before(grammarAccess.getResourceAccess().getGetGetKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getResourceAccess().getGetGetKeyword_4_0()); 

            }

             after(grammarAccess.getResourceAccess().getGetGetKeyword_4_0()); 

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
    // $ANTLR end "rule__Resource__GetAssignment_4"


    // $ANTLR start "rule__Resource__NameAssignment_6"
    // InternalRest.g:1472:1: rule__Resource__NameAssignment_6 : ( ruleEString ) ;
    public final void rule__Resource__NameAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1476:1: ( ( ruleEString ) )
            // InternalRest.g:1477:2: ( ruleEString )
            {
            // InternalRest.g:1477:2: ( ruleEString )
            // InternalRest.g:1478:3: ruleEString
            {
             before(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Resource__NameAssignment_6"


    // $ANTLR start "rule__Resource__EntityAssignment_8_1"
    // InternalRest.g:1487:1: rule__Resource__EntityAssignment_8_1 : ( ruleEString ) ;
    public final void rule__Resource__EntityAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1491:1: ( ( ruleEString ) )
            // InternalRest.g:1492:2: ( ruleEString )
            {
            // InternalRest.g:1492:2: ( ruleEString )
            // InternalRest.g:1493:3: ruleEString
            {
             before(grammarAccess.getResourceAccess().getEntityEStringParserRuleCall_8_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getEntityEStringParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Resource__EntityAssignment_8_1"


    // $ANTLR start "rule__Resource__ReferenceAssignment_9_2"
    // InternalRest.g:1502:1: rule__Resource__ReferenceAssignment_9_2 : ( ( ruleEString ) ) ;
    public final void rule__Resource__ReferenceAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1506:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:1507:2: ( ( ruleEString ) )
            {
            // InternalRest.g:1507:2: ( ( ruleEString ) )
            // InternalRest.g:1508:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getReferenceResourceCrossReference_9_2_0()); 
            // InternalRest.g:1509:3: ( ruleEString )
            // InternalRest.g:1510:4: ruleEString
            {
             before(grammarAccess.getResourceAccess().getReferenceResourceEStringParserRuleCall_9_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getReferenceResourceEStringParserRuleCall_9_2_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getReferenceResourceCrossReference_9_2_0()); 

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
    // $ANTLR end "rule__Resource__ReferenceAssignment_9_2"


    // $ANTLR start "rule__Resource__ReferenceAssignment_9_3_1"
    // InternalRest.g:1521:1: rule__Resource__ReferenceAssignment_9_3_1 : ( ( ruleEString ) ) ;
    public final void rule__Resource__ReferenceAssignment_9_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1525:1: ( ( ( ruleEString ) ) )
            // InternalRest.g:1526:2: ( ( ruleEString ) )
            {
            // InternalRest.g:1526:2: ( ( ruleEString ) )
            // InternalRest.g:1527:3: ( ruleEString )
            {
             before(grammarAccess.getResourceAccess().getReferenceResourceCrossReference_9_3_1_0()); 
            // InternalRest.g:1528:3: ( ruleEString )
            // InternalRest.g:1529:4: ruleEString
            {
             before(grammarAccess.getResourceAccess().getReferenceResourceEStringParserRuleCall_9_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getReferenceResourceEStringParserRuleCall_9_3_1_0_1()); 

            }

             after(grammarAccess.getResourceAccess().getReferenceResourceCrossReference_9_3_1_0()); 

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
    // $ANTLR end "rule__Resource__ReferenceAssignment_9_3_1"


    // $ANTLR start "rule__Resource__SubresourceAssignment_10_2"
    // InternalRest.g:1540:1: rule__Resource__SubresourceAssignment_10_2 : ( ruleResource ) ;
    public final void rule__Resource__SubresourceAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1544:1: ( ( ruleResource ) )
            // InternalRest.g:1545:2: ( ruleResource )
            {
            // InternalRest.g:1545:2: ( ruleResource )
            // InternalRest.g:1546:3: ruleResource
            {
             before(grammarAccess.getResourceAccess().getSubresourceResourceParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getSubresourceResourceParserRuleCall_10_2_0()); 

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
    // $ANTLR end "rule__Resource__SubresourceAssignment_10_2"


    // $ANTLR start "rule__Resource__SubresourceAssignment_10_3_1"
    // InternalRest.g:1555:1: rule__Resource__SubresourceAssignment_10_3_1 : ( ruleResource ) ;
    public final void rule__Resource__SubresourceAssignment_10_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRest.g:1559:1: ( ( ruleResource ) )
            // InternalRest.g:1560:2: ( ruleResource )
            {
            // InternalRest.g:1560:2: ( ruleResource )
            // InternalRest.g:1561:3: ruleResource
            {
             before(grammarAccess.getResourceAccess().getSubresourceResourceParserRuleCall_10_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleResource();

            state._fsp--;

             after(grammarAccess.getResourceAccess().getSubresourceResourceParserRuleCall_10_3_1_0()); 

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
    // $ANTLR end "rule__Resource__SubresourceAssignment_10_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000007820000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000004C2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000210000L});

}