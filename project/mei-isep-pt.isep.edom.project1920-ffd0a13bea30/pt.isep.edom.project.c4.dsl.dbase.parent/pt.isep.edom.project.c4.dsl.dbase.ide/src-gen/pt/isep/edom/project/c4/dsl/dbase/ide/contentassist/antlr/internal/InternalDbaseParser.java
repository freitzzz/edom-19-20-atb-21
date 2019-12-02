package pt.isep.edom.project.c4.dsl.dbase.ide.contentassist.antlr.internal;

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
import pt.isep.edom.project.c4.dsl.dbase.services.DbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbaseParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VARCHAR'", "'INTEGER'", "'REAL'", "'DbaseModel'", "'{'", "'}'", "'tables'", "','", "'Table'", "'entity'", "'columns'", "'Column'", "'type'", "'foreignKey'", "'key'"
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


        public InternalDbaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDbaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDbaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDbase.g"; }


    	private DbaseGrammarAccess grammarAccess;

    	public void setGrammarAccess(DbaseGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDbaseModel"
    // InternalDbase.g:53:1: entryRuleDbaseModel : ruleDbaseModel EOF ;
    public final void entryRuleDbaseModel() throws RecognitionException {
        try {
            // InternalDbase.g:54:1: ( ruleDbaseModel EOF )
            // InternalDbase.g:55:1: ruleDbaseModel EOF
            {
             before(grammarAccess.getDbaseModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDbaseModel();

            state._fsp--;

             after(grammarAccess.getDbaseModelRule()); 
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
    // $ANTLR end "entryRuleDbaseModel"


    // $ANTLR start "ruleDbaseModel"
    // InternalDbase.g:62:1: ruleDbaseModel : ( ( rule__DbaseModel__Group__0 ) ) ;
    public final void ruleDbaseModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:66:2: ( ( ( rule__DbaseModel__Group__0 ) ) )
            // InternalDbase.g:67:2: ( ( rule__DbaseModel__Group__0 ) )
            {
            // InternalDbase.g:67:2: ( ( rule__DbaseModel__Group__0 ) )
            // InternalDbase.g:68:3: ( rule__DbaseModel__Group__0 )
            {
             before(grammarAccess.getDbaseModelAccess().getGroup()); 
            // InternalDbase.g:69:3: ( rule__DbaseModel__Group__0 )
            // InternalDbase.g:69:4: rule__DbaseModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getGroup()); 

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
    // $ANTLR end "ruleDbaseModel"


    // $ANTLR start "entryRuleEString"
    // InternalDbase.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDbase.g:79:1: ( ruleEString EOF )
            // InternalDbase.g:80:1: ruleEString EOF
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
    // InternalDbase.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDbase.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDbase.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDbase.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDbase.g:94:3: ( rule__EString__Alternatives )
            // InternalDbase.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleTable"
    // InternalDbase.g:103:1: entryRuleTable : ruleTable EOF ;
    public final void entryRuleTable() throws RecognitionException {
        try {
            // InternalDbase.g:104:1: ( ruleTable EOF )
            // InternalDbase.g:105:1: ruleTable EOF
            {
             before(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getTableRule()); 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDbase.g:112:1: ruleTable : ( ( rule__Table__Group__0 ) ) ;
    public final void ruleTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:116:2: ( ( ( rule__Table__Group__0 ) ) )
            // InternalDbase.g:117:2: ( ( rule__Table__Group__0 ) )
            {
            // InternalDbase.g:117:2: ( ( rule__Table__Group__0 ) )
            // InternalDbase.g:118:3: ( rule__Table__Group__0 )
            {
             before(grammarAccess.getTableAccess().getGroup()); 
            // InternalDbase.g:119:3: ( rule__Table__Group__0 )
            // InternalDbase.g:119:4: rule__Table__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getGroup()); 

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalDbase.g:128:1: entryRuleColumn : ruleColumn EOF ;
    public final void entryRuleColumn() throws RecognitionException {
        try {
            // InternalDbase.g:129:1: ( ruleColumn EOF )
            // InternalDbase.g:130:1: ruleColumn EOF
            {
             before(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnRule()); 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDbase.g:137:1: ruleColumn : ( ( rule__Column__Group__0 ) ) ;
    public final void ruleColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:141:2: ( ( ( rule__Column__Group__0 ) ) )
            // InternalDbase.g:142:2: ( ( rule__Column__Group__0 ) )
            {
            // InternalDbase.g:142:2: ( ( rule__Column__Group__0 ) )
            // InternalDbase.g:143:3: ( rule__Column__Group__0 )
            {
             before(grammarAccess.getColumnAccess().getGroup()); 
            // InternalDbase.g:144:3: ( rule__Column__Group__0 )
            // InternalDbase.g:144:4: rule__Column__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getGroup()); 

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "ruleColumnType"
    // InternalDbase.g:153:1: ruleColumnType : ( ( rule__ColumnType__Alternatives ) ) ;
    public final void ruleColumnType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:157:1: ( ( ( rule__ColumnType__Alternatives ) ) )
            // InternalDbase.g:158:2: ( ( rule__ColumnType__Alternatives ) )
            {
            // InternalDbase.g:158:2: ( ( rule__ColumnType__Alternatives ) )
            // InternalDbase.g:159:3: ( rule__ColumnType__Alternatives )
            {
             before(grammarAccess.getColumnTypeAccess().getAlternatives()); 
            // InternalDbase.g:160:3: ( rule__ColumnType__Alternatives )
            // InternalDbase.g:160:4: rule__ColumnType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ColumnType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getColumnTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleColumnType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDbase.g:168:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:172:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDbase.g:173:2: ( RULE_STRING )
                    {
                    // InternalDbase.g:173:2: ( RULE_STRING )
                    // InternalDbase.g:174:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:179:2: ( RULE_ID )
                    {
                    // InternalDbase.g:179:2: ( RULE_ID )
                    // InternalDbase.g:180:3: RULE_ID
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


    // $ANTLR start "rule__ColumnType__Alternatives"
    // InternalDbase.g:189:1: rule__ColumnType__Alternatives : ( ( ( 'VARCHAR' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) );
    public final void rule__ColumnType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:193:1: ( ( ( 'VARCHAR' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt2=1;
                }
                break;
            case 12:
                {
                alt2=2;
                }
                break;
            case 13:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalDbase.g:194:2: ( ( 'VARCHAR' ) )
                    {
                    // InternalDbase.g:194:2: ( ( 'VARCHAR' ) )
                    // InternalDbase.g:195:3: ( 'VARCHAR' )
                    {
                     before(grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 
                    // InternalDbase.g:196:3: ( 'VARCHAR' )
                    // InternalDbase.g:196:4: 'VARCHAR'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:200:2: ( ( 'INTEGER' ) )
                    {
                    // InternalDbase.g:200:2: ( ( 'INTEGER' ) )
                    // InternalDbase.g:201:3: ( 'INTEGER' )
                    {
                     before(grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // InternalDbase.g:202:3: ( 'INTEGER' )
                    // InternalDbase.g:202:4: 'INTEGER'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:206:2: ( ( 'REAL' ) )
                    {
                    // InternalDbase.g:206:2: ( ( 'REAL' ) )
                    // InternalDbase.g:207:3: ( 'REAL' )
                    {
                     before(grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // InternalDbase.g:208:3: ( 'REAL' )
                    // InternalDbase.g:208:4: 'REAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__ColumnType__Alternatives"


    // $ANTLR start "rule__DbaseModel__Group__0"
    // InternalDbase.g:216:1: rule__DbaseModel__Group__0 : rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1 ;
    public final void rule__DbaseModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:220:1: ( rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1 )
            // InternalDbase.g:221:2: rule__DbaseModel__Group__0__Impl rule__DbaseModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DbaseModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__1();

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
    // $ANTLR end "rule__DbaseModel__Group__0"


    // $ANTLR start "rule__DbaseModel__Group__0__Impl"
    // InternalDbase.g:228:1: rule__DbaseModel__Group__0__Impl : ( () ) ;
    public final void rule__DbaseModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:232:1: ( ( () ) )
            // InternalDbase.g:233:1: ( () )
            {
            // InternalDbase.g:233:1: ( () )
            // InternalDbase.g:234:2: ()
            {
             before(grammarAccess.getDbaseModelAccess().getDbaseModelAction_0()); 
            // InternalDbase.g:235:2: ()
            // InternalDbase.g:235:3: 
            {
            }

             after(grammarAccess.getDbaseModelAccess().getDbaseModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DbaseModel__Group__0__Impl"


    // $ANTLR start "rule__DbaseModel__Group__1"
    // InternalDbase.g:243:1: rule__DbaseModel__Group__1 : rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2 ;
    public final void rule__DbaseModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:247:1: ( rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2 )
            // InternalDbase.g:248:2: rule__DbaseModel__Group__1__Impl rule__DbaseModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DbaseModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__2();

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
    // $ANTLR end "rule__DbaseModel__Group__1"


    // $ANTLR start "rule__DbaseModel__Group__1__Impl"
    // InternalDbase.g:255:1: rule__DbaseModel__Group__1__Impl : ( 'DbaseModel' ) ;
    public final void rule__DbaseModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:259:1: ( ( 'DbaseModel' ) )
            // InternalDbase.g:260:1: ( 'DbaseModel' )
            {
            // InternalDbase.g:260:1: ( 'DbaseModel' )
            // InternalDbase.g:261:2: 'DbaseModel'
            {
             before(grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1()); 

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
    // $ANTLR end "rule__DbaseModel__Group__1__Impl"


    // $ANTLR start "rule__DbaseModel__Group__2"
    // InternalDbase.g:270:1: rule__DbaseModel__Group__2 : rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3 ;
    public final void rule__DbaseModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:274:1: ( rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3 )
            // InternalDbase.g:275:2: rule__DbaseModel__Group__2__Impl rule__DbaseModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DbaseModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__3();

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
    // $ANTLR end "rule__DbaseModel__Group__2"


    // $ANTLR start "rule__DbaseModel__Group__2__Impl"
    // InternalDbase.g:282:1: rule__DbaseModel__Group__2__Impl : ( ( rule__DbaseModel__NameAssignment_2 ) ) ;
    public final void rule__DbaseModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:286:1: ( ( ( rule__DbaseModel__NameAssignment_2 ) ) )
            // InternalDbase.g:287:1: ( ( rule__DbaseModel__NameAssignment_2 ) )
            {
            // InternalDbase.g:287:1: ( ( rule__DbaseModel__NameAssignment_2 ) )
            // InternalDbase.g:288:2: ( rule__DbaseModel__NameAssignment_2 )
            {
             before(grammarAccess.getDbaseModelAccess().getNameAssignment_2()); 
            // InternalDbase.g:289:2: ( rule__DbaseModel__NameAssignment_2 )
            // InternalDbase.g:289:3: rule__DbaseModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DbaseModel__Group__2__Impl"


    // $ANTLR start "rule__DbaseModel__Group__3"
    // InternalDbase.g:297:1: rule__DbaseModel__Group__3 : rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4 ;
    public final void rule__DbaseModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:301:1: ( rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4 )
            // InternalDbase.g:302:2: rule__DbaseModel__Group__3__Impl rule__DbaseModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DbaseModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__4();

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
    // $ANTLR end "rule__DbaseModel__Group__3"


    // $ANTLR start "rule__DbaseModel__Group__3__Impl"
    // InternalDbase.g:309:1: rule__DbaseModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DbaseModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:313:1: ( ( '{' ) )
            // InternalDbase.g:314:1: ( '{' )
            {
            // InternalDbase.g:314:1: ( '{' )
            // InternalDbase.g:315:2: '{'
            {
             before(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DbaseModel__Group__3__Impl"


    // $ANTLR start "rule__DbaseModel__Group__4"
    // InternalDbase.g:324:1: rule__DbaseModel__Group__4 : rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5 ;
    public final void rule__DbaseModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:328:1: ( rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5 )
            // InternalDbase.g:329:2: rule__DbaseModel__Group__4__Impl rule__DbaseModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DbaseModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__5();

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
    // $ANTLR end "rule__DbaseModel__Group__4"


    // $ANTLR start "rule__DbaseModel__Group__4__Impl"
    // InternalDbase.g:336:1: rule__DbaseModel__Group__4__Impl : ( ( rule__DbaseModel__Group_4__0 )? ) ;
    public final void rule__DbaseModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:340:1: ( ( ( rule__DbaseModel__Group_4__0 )? ) )
            // InternalDbase.g:341:1: ( ( rule__DbaseModel__Group_4__0 )? )
            {
            // InternalDbase.g:341:1: ( ( rule__DbaseModel__Group_4__0 )? )
            // InternalDbase.g:342:2: ( rule__DbaseModel__Group_4__0 )?
            {
             before(grammarAccess.getDbaseModelAccess().getGroup_4()); 
            // InternalDbase.g:343:2: ( rule__DbaseModel__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDbase.g:343:3: rule__DbaseModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DbaseModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDbaseModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DbaseModel__Group__4__Impl"


    // $ANTLR start "rule__DbaseModel__Group__5"
    // InternalDbase.g:351:1: rule__DbaseModel__Group__5 : rule__DbaseModel__Group__5__Impl ;
    public final void rule__DbaseModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:355:1: ( rule__DbaseModel__Group__5__Impl )
            // InternalDbase.g:356:2: rule__DbaseModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group__5__Impl();

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
    // $ANTLR end "rule__DbaseModel__Group__5"


    // $ANTLR start "rule__DbaseModel__Group__5__Impl"
    // InternalDbase.g:362:1: rule__DbaseModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DbaseModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:366:1: ( ( '}' ) )
            // InternalDbase.g:367:1: ( '}' )
            {
            // InternalDbase.g:367:1: ( '}' )
            // InternalDbase.g:368:2: '}'
            {
             before(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DbaseModel__Group__5__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__0"
    // InternalDbase.g:378:1: rule__DbaseModel__Group_4__0 : rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1 ;
    public final void rule__DbaseModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:382:1: ( rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1 )
            // InternalDbase.g:383:2: rule__DbaseModel__Group_4__0__Impl rule__DbaseModel__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DbaseModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__1();

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
    // $ANTLR end "rule__DbaseModel__Group_4__0"


    // $ANTLR start "rule__DbaseModel__Group_4__0__Impl"
    // InternalDbase.g:390:1: rule__DbaseModel__Group_4__0__Impl : ( 'tables' ) ;
    public final void rule__DbaseModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:394:1: ( ( 'tables' ) )
            // InternalDbase.g:395:1: ( 'tables' )
            {
            // InternalDbase.g:395:1: ( 'tables' )
            // InternalDbase.g:396:2: 'tables'
            {
             before(grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0()); 

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
    // $ANTLR end "rule__DbaseModel__Group_4__0__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__1"
    // InternalDbase.g:405:1: rule__DbaseModel__Group_4__1 : rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2 ;
    public final void rule__DbaseModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:409:1: ( rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2 )
            // InternalDbase.g:410:2: rule__DbaseModel__Group_4__1__Impl rule__DbaseModel__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__DbaseModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__2();

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
    // $ANTLR end "rule__DbaseModel__Group_4__1"


    // $ANTLR start "rule__DbaseModel__Group_4__1__Impl"
    // InternalDbase.g:417:1: rule__DbaseModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DbaseModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:421:1: ( ( '{' ) )
            // InternalDbase.g:422:1: ( '{' )
            {
            // InternalDbase.g:422:1: ( '{' )
            // InternalDbase.g:423:2: '{'
            {
             before(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__DbaseModel__Group_4__1__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__2"
    // InternalDbase.g:432:1: rule__DbaseModel__Group_4__2 : rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3 ;
    public final void rule__DbaseModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:436:1: ( rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3 )
            // InternalDbase.g:437:2: rule__DbaseModel__Group_4__2__Impl rule__DbaseModel__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__DbaseModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__3();

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
    // $ANTLR end "rule__DbaseModel__Group_4__2"


    // $ANTLR start "rule__DbaseModel__Group_4__2__Impl"
    // InternalDbase.g:444:1: rule__DbaseModel__Group_4__2__Impl : ( ( rule__DbaseModel__TablesAssignment_4_2 ) ) ;
    public final void rule__DbaseModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:448:1: ( ( ( rule__DbaseModel__TablesAssignment_4_2 ) ) )
            // InternalDbase.g:449:1: ( ( rule__DbaseModel__TablesAssignment_4_2 ) )
            {
            // InternalDbase.g:449:1: ( ( rule__DbaseModel__TablesAssignment_4_2 ) )
            // InternalDbase.g:450:2: ( rule__DbaseModel__TablesAssignment_4_2 )
            {
             before(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_2()); 
            // InternalDbase.g:451:2: ( rule__DbaseModel__TablesAssignment_4_2 )
            // InternalDbase.g:451:3: rule__DbaseModel__TablesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__TablesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_2()); 

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
    // $ANTLR end "rule__DbaseModel__Group_4__2__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__3"
    // InternalDbase.g:459:1: rule__DbaseModel__Group_4__3 : rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4 ;
    public final void rule__DbaseModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:463:1: ( rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4 )
            // InternalDbase.g:464:2: rule__DbaseModel__Group_4__3__Impl rule__DbaseModel__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__DbaseModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__4();

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
    // $ANTLR end "rule__DbaseModel__Group_4__3"


    // $ANTLR start "rule__DbaseModel__Group_4__3__Impl"
    // InternalDbase.g:471:1: rule__DbaseModel__Group_4__3__Impl : ( ( rule__DbaseModel__Group_4_3__0 )* ) ;
    public final void rule__DbaseModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:475:1: ( ( ( rule__DbaseModel__Group_4_3__0 )* ) )
            // InternalDbase.g:476:1: ( ( rule__DbaseModel__Group_4_3__0 )* )
            {
            // InternalDbase.g:476:1: ( ( rule__DbaseModel__Group_4_3__0 )* )
            // InternalDbase.g:477:2: ( rule__DbaseModel__Group_4_3__0 )*
            {
             before(grammarAccess.getDbaseModelAccess().getGroup_4_3()); 
            // InternalDbase.g:478:2: ( rule__DbaseModel__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDbase.g:478:3: rule__DbaseModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DbaseModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDbaseModelAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__DbaseModel__Group_4__3__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4__4"
    // InternalDbase.g:486:1: rule__DbaseModel__Group_4__4 : rule__DbaseModel__Group_4__4__Impl ;
    public final void rule__DbaseModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:490:1: ( rule__DbaseModel__Group_4__4__Impl )
            // InternalDbase.g:491:2: rule__DbaseModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4__4__Impl();

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
    // $ANTLR end "rule__DbaseModel__Group_4__4"


    // $ANTLR start "rule__DbaseModel__Group_4__4__Impl"
    // InternalDbase.g:497:1: rule__DbaseModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DbaseModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:501:1: ( ( '}' ) )
            // InternalDbase.g:502:1: ( '}' )
            {
            // InternalDbase.g:502:1: ( '}' )
            // InternalDbase.g:503:2: '}'
            {
             before(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__DbaseModel__Group_4__4__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4_3__0"
    // InternalDbase.g:513:1: rule__DbaseModel__Group_4_3__0 : rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1 ;
    public final void rule__DbaseModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:517:1: ( rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1 )
            // InternalDbase.g:518:2: rule__DbaseModel__Group_4_3__0__Impl rule__DbaseModel__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__DbaseModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4_3__1();

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
    // $ANTLR end "rule__DbaseModel__Group_4_3__0"


    // $ANTLR start "rule__DbaseModel__Group_4_3__0__Impl"
    // InternalDbase.g:525:1: rule__DbaseModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DbaseModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:529:1: ( ( ',' ) )
            // InternalDbase.g:530:1: ( ',' )
            {
            // InternalDbase.g:530:1: ( ',' )
            // InternalDbase.g:531:2: ','
            {
             before(grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__DbaseModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__DbaseModel__Group_4_3__1"
    // InternalDbase.g:540:1: rule__DbaseModel__Group_4_3__1 : rule__DbaseModel__Group_4_3__1__Impl ;
    public final void rule__DbaseModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:544:1: ( rule__DbaseModel__Group_4_3__1__Impl )
            // InternalDbase.g:545:2: rule__DbaseModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__DbaseModel__Group_4_3__1"


    // $ANTLR start "rule__DbaseModel__Group_4_3__1__Impl"
    // InternalDbase.g:551:1: rule__DbaseModel__Group_4_3__1__Impl : ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) ) ;
    public final void rule__DbaseModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:555:1: ( ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) ) )
            // InternalDbase.g:556:1: ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) )
            {
            // InternalDbase.g:556:1: ( ( rule__DbaseModel__TablesAssignment_4_3_1 ) )
            // InternalDbase.g:557:2: ( rule__DbaseModel__TablesAssignment_4_3_1 )
            {
             before(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_3_1()); 
            // InternalDbase.g:558:2: ( rule__DbaseModel__TablesAssignment_4_3_1 )
            // InternalDbase.g:558:3: rule__DbaseModel__TablesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DbaseModel__TablesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDbaseModelAccess().getTablesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__DbaseModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__Table__Group__0"
    // InternalDbase.g:567:1: rule__Table__Group__0 : rule__Table__Group__0__Impl rule__Table__Group__1 ;
    public final void rule__Table__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:571:1: ( rule__Table__Group__0__Impl rule__Table__Group__1 )
            // InternalDbase.g:572:2: rule__Table__Group__0__Impl rule__Table__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Table__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__1();

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
    // $ANTLR end "rule__Table__Group__0"


    // $ANTLR start "rule__Table__Group__0__Impl"
    // InternalDbase.g:579:1: rule__Table__Group__0__Impl : ( () ) ;
    public final void rule__Table__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:583:1: ( ( () ) )
            // InternalDbase.g:584:1: ( () )
            {
            // InternalDbase.g:584:1: ( () )
            // InternalDbase.g:585:2: ()
            {
             before(grammarAccess.getTableAccess().getTableAction_0()); 
            // InternalDbase.g:586:2: ()
            // InternalDbase.g:586:3: 
            {
            }

             after(grammarAccess.getTableAccess().getTableAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Table__Group__0__Impl"


    // $ANTLR start "rule__Table__Group__1"
    // InternalDbase.g:594:1: rule__Table__Group__1 : rule__Table__Group__1__Impl rule__Table__Group__2 ;
    public final void rule__Table__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:598:1: ( rule__Table__Group__1__Impl rule__Table__Group__2 )
            // InternalDbase.g:599:2: rule__Table__Group__1__Impl rule__Table__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__2();

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
    // $ANTLR end "rule__Table__Group__1"


    // $ANTLR start "rule__Table__Group__1__Impl"
    // InternalDbase.g:606:1: rule__Table__Group__1__Impl : ( 'Table' ) ;
    public final void rule__Table__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:610:1: ( ( 'Table' ) )
            // InternalDbase.g:611:1: ( 'Table' )
            {
            // InternalDbase.g:611:1: ( 'Table' )
            // InternalDbase.g:612:2: 'Table'
            {
             before(grammarAccess.getTableAccess().getTableKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getTableKeyword_1()); 

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
    // $ANTLR end "rule__Table__Group__1__Impl"


    // $ANTLR start "rule__Table__Group__2"
    // InternalDbase.g:621:1: rule__Table__Group__2 : rule__Table__Group__2__Impl rule__Table__Group__3 ;
    public final void rule__Table__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:625:1: ( rule__Table__Group__2__Impl rule__Table__Group__3 )
            // InternalDbase.g:626:2: rule__Table__Group__2__Impl rule__Table__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__3();

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
    // $ANTLR end "rule__Table__Group__2"


    // $ANTLR start "rule__Table__Group__2__Impl"
    // InternalDbase.g:633:1: rule__Table__Group__2__Impl : ( ( rule__Table__NameAssignment_2 ) ) ;
    public final void rule__Table__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:637:1: ( ( ( rule__Table__NameAssignment_2 ) ) )
            // InternalDbase.g:638:1: ( ( rule__Table__NameAssignment_2 ) )
            {
            // InternalDbase.g:638:1: ( ( rule__Table__NameAssignment_2 ) )
            // InternalDbase.g:639:2: ( rule__Table__NameAssignment_2 )
            {
             before(grammarAccess.getTableAccess().getNameAssignment_2()); 
            // InternalDbase.g:640:2: ( rule__Table__NameAssignment_2 )
            // InternalDbase.g:640:3: rule__Table__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Table__Group__2__Impl"


    // $ANTLR start "rule__Table__Group__3"
    // InternalDbase.g:648:1: rule__Table__Group__3 : rule__Table__Group__3__Impl rule__Table__Group__4 ;
    public final void rule__Table__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:652:1: ( rule__Table__Group__3__Impl rule__Table__Group__4 )
            // InternalDbase.g:653:2: rule__Table__Group__3__Impl rule__Table__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__4();

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
    // $ANTLR end "rule__Table__Group__3"


    // $ANTLR start "rule__Table__Group__3__Impl"
    // InternalDbase.g:660:1: rule__Table__Group__3__Impl : ( '{' ) ;
    public final void rule__Table__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:664:1: ( ( '{' ) )
            // InternalDbase.g:665:1: ( '{' )
            {
            // InternalDbase.g:665:1: ( '{' )
            // InternalDbase.g:666:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Table__Group__3__Impl"


    // $ANTLR start "rule__Table__Group__4"
    // InternalDbase.g:675:1: rule__Table__Group__4 : rule__Table__Group__4__Impl rule__Table__Group__5 ;
    public final void rule__Table__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:679:1: ( rule__Table__Group__4__Impl rule__Table__Group__5 )
            // InternalDbase.g:680:2: rule__Table__Group__4__Impl rule__Table__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__5();

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
    // $ANTLR end "rule__Table__Group__4"


    // $ANTLR start "rule__Table__Group__4__Impl"
    // InternalDbase.g:687:1: rule__Table__Group__4__Impl : ( ( rule__Table__Group_4__0 )? ) ;
    public final void rule__Table__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:691:1: ( ( ( rule__Table__Group_4__0 )? ) )
            // InternalDbase.g:692:1: ( ( rule__Table__Group_4__0 )? )
            {
            // InternalDbase.g:692:1: ( ( rule__Table__Group_4__0 )? )
            // InternalDbase.g:693:2: ( rule__Table__Group_4__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_4()); 
            // InternalDbase.g:694:2: ( rule__Table__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDbase.g:694:3: rule__Table__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Table__Group__4__Impl"


    // $ANTLR start "rule__Table__Group__5"
    // InternalDbase.g:702:1: rule__Table__Group__5 : rule__Table__Group__5__Impl rule__Table__Group__6 ;
    public final void rule__Table__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:706:1: ( rule__Table__Group__5__Impl rule__Table__Group__6 )
            // InternalDbase.g:707:2: rule__Table__Group__5__Impl rule__Table__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Table__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group__6();

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
    // $ANTLR end "rule__Table__Group__5"


    // $ANTLR start "rule__Table__Group__5__Impl"
    // InternalDbase.g:714:1: rule__Table__Group__5__Impl : ( ( rule__Table__Group_5__0 )? ) ;
    public final void rule__Table__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:718:1: ( ( ( rule__Table__Group_5__0 )? ) )
            // InternalDbase.g:719:1: ( ( rule__Table__Group_5__0 )? )
            {
            // InternalDbase.g:719:1: ( ( rule__Table__Group_5__0 )? )
            // InternalDbase.g:720:2: ( rule__Table__Group_5__0 )?
            {
             before(grammarAccess.getTableAccess().getGroup_5()); 
            // InternalDbase.g:721:2: ( rule__Table__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDbase.g:721:3: rule__Table__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Table__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTableAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Table__Group__5__Impl"


    // $ANTLR start "rule__Table__Group__6"
    // InternalDbase.g:729:1: rule__Table__Group__6 : rule__Table__Group__6__Impl ;
    public final void rule__Table__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:733:1: ( rule__Table__Group__6__Impl )
            // InternalDbase.g:734:2: rule__Table__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group__6__Impl();

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
    // $ANTLR end "rule__Table__Group__6"


    // $ANTLR start "rule__Table__Group__6__Impl"
    // InternalDbase.g:740:1: rule__Table__Group__6__Impl : ( '}' ) ;
    public final void rule__Table__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:744:1: ( ( '}' ) )
            // InternalDbase.g:745:1: ( '}' )
            {
            // InternalDbase.g:745:1: ( '}' )
            // InternalDbase.g:746:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Table__Group__6__Impl"


    // $ANTLR start "rule__Table__Group_4__0"
    // InternalDbase.g:756:1: rule__Table__Group_4__0 : rule__Table__Group_4__0__Impl rule__Table__Group_4__1 ;
    public final void rule__Table__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:760:1: ( rule__Table__Group_4__0__Impl rule__Table__Group_4__1 )
            // InternalDbase.g:761:2: rule__Table__Group_4__0__Impl rule__Table__Group_4__1
            {
            pushFollow(FOLLOW_4);
            rule__Table__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1();

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
    // $ANTLR end "rule__Table__Group_4__0"


    // $ANTLR start "rule__Table__Group_4__0__Impl"
    // InternalDbase.g:768:1: rule__Table__Group_4__0__Impl : ( 'entity' ) ;
    public final void rule__Table__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:772:1: ( ( 'entity' ) )
            // InternalDbase.g:773:1: ( 'entity' )
            {
            // InternalDbase.g:773:1: ( 'entity' )
            // InternalDbase.g:774:2: 'entity'
            {
             before(grammarAccess.getTableAccess().getEntityKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getEntityKeyword_4_0()); 

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
    // $ANTLR end "rule__Table__Group_4__0__Impl"


    // $ANTLR start "rule__Table__Group_4__1"
    // InternalDbase.g:783:1: rule__Table__Group_4__1 : rule__Table__Group_4__1__Impl ;
    public final void rule__Table__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:787:1: ( rule__Table__Group_4__1__Impl )
            // InternalDbase.g:788:2: rule__Table__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_4__1__Impl();

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
    // $ANTLR end "rule__Table__Group_4__1"


    // $ANTLR start "rule__Table__Group_4__1__Impl"
    // InternalDbase.g:794:1: rule__Table__Group_4__1__Impl : ( ( rule__Table__EntityAssignment_4_1 ) ) ;
    public final void rule__Table__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:798:1: ( ( ( rule__Table__EntityAssignment_4_1 ) ) )
            // InternalDbase.g:799:1: ( ( rule__Table__EntityAssignment_4_1 ) )
            {
            // InternalDbase.g:799:1: ( ( rule__Table__EntityAssignment_4_1 ) )
            // InternalDbase.g:800:2: ( rule__Table__EntityAssignment_4_1 )
            {
             before(grammarAccess.getTableAccess().getEntityAssignment_4_1()); 
            // InternalDbase.g:801:2: ( rule__Table__EntityAssignment_4_1 )
            // InternalDbase.g:801:3: rule__Table__EntityAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__EntityAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getEntityAssignment_4_1()); 

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
    // $ANTLR end "rule__Table__Group_4__1__Impl"


    // $ANTLR start "rule__Table__Group_5__0"
    // InternalDbase.g:810:1: rule__Table__Group_5__0 : rule__Table__Group_5__0__Impl rule__Table__Group_5__1 ;
    public final void rule__Table__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:814:1: ( rule__Table__Group_5__0__Impl rule__Table__Group_5__1 )
            // InternalDbase.g:815:2: rule__Table__Group_5__0__Impl rule__Table__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Table__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__1();

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
    // $ANTLR end "rule__Table__Group_5__0"


    // $ANTLR start "rule__Table__Group_5__0__Impl"
    // InternalDbase.g:822:1: rule__Table__Group_5__0__Impl : ( 'columns' ) ;
    public final void rule__Table__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:826:1: ( ( 'columns' ) )
            // InternalDbase.g:827:1: ( 'columns' )
            {
            // InternalDbase.g:827:1: ( 'columns' )
            // InternalDbase.g:828:2: 'columns'
            {
             before(grammarAccess.getTableAccess().getColumnsKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getColumnsKeyword_5_0()); 

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
    // $ANTLR end "rule__Table__Group_5__0__Impl"


    // $ANTLR start "rule__Table__Group_5__1"
    // InternalDbase.g:837:1: rule__Table__Group_5__1 : rule__Table__Group_5__1__Impl rule__Table__Group_5__2 ;
    public final void rule__Table__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:841:1: ( rule__Table__Group_5__1__Impl rule__Table__Group_5__2 )
            // InternalDbase.g:842:2: rule__Table__Group_5__1__Impl rule__Table__Group_5__2
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__2();

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
    // $ANTLR end "rule__Table__Group_5__1"


    // $ANTLR start "rule__Table__Group_5__1__Impl"
    // InternalDbase.g:849:1: rule__Table__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Table__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:853:1: ( ( '{' ) )
            // InternalDbase.g:854:1: ( '{' )
            {
            // InternalDbase.g:854:1: ( '{' )
            // InternalDbase.g:855:2: '{'
            {
             before(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Table__Group_5__1__Impl"


    // $ANTLR start "rule__Table__Group_5__2"
    // InternalDbase.g:864:1: rule__Table__Group_5__2 : rule__Table__Group_5__2__Impl rule__Table__Group_5__3 ;
    public final void rule__Table__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:868:1: ( rule__Table__Group_5__2__Impl rule__Table__Group_5__3 )
            // InternalDbase.g:869:2: rule__Table__Group_5__2__Impl rule__Table__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__3();

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
    // $ANTLR end "rule__Table__Group_5__2"


    // $ANTLR start "rule__Table__Group_5__2__Impl"
    // InternalDbase.g:876:1: rule__Table__Group_5__2__Impl : ( ( rule__Table__ColumnsAssignment_5_2 ) ) ;
    public final void rule__Table__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:880:1: ( ( ( rule__Table__ColumnsAssignment_5_2 ) ) )
            // InternalDbase.g:881:1: ( ( rule__Table__ColumnsAssignment_5_2 ) )
            {
            // InternalDbase.g:881:1: ( ( rule__Table__ColumnsAssignment_5_2 ) )
            // InternalDbase.g:882:2: ( rule__Table__ColumnsAssignment_5_2 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_2()); 
            // InternalDbase.g:883:2: ( rule__Table__ColumnsAssignment_5_2 )
            // InternalDbase.g:883:3: rule__Table__ColumnsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_5_2()); 

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
    // $ANTLR end "rule__Table__Group_5__2__Impl"


    // $ANTLR start "rule__Table__Group_5__3"
    // InternalDbase.g:891:1: rule__Table__Group_5__3 : rule__Table__Group_5__3__Impl rule__Table__Group_5__4 ;
    public final void rule__Table__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:895:1: ( rule__Table__Group_5__3__Impl rule__Table__Group_5__4 )
            // InternalDbase.g:896:2: rule__Table__Group_5__3__Impl rule__Table__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Table__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5__4();

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
    // $ANTLR end "rule__Table__Group_5__3"


    // $ANTLR start "rule__Table__Group_5__3__Impl"
    // InternalDbase.g:903:1: rule__Table__Group_5__3__Impl : ( ( rule__Table__Group_5_3__0 )* ) ;
    public final void rule__Table__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:907:1: ( ( ( rule__Table__Group_5_3__0 )* ) )
            // InternalDbase.g:908:1: ( ( rule__Table__Group_5_3__0 )* )
            {
            // InternalDbase.g:908:1: ( ( rule__Table__Group_5_3__0 )* )
            // InternalDbase.g:909:2: ( rule__Table__Group_5_3__0 )*
            {
             before(grammarAccess.getTableAccess().getGroup_5_3()); 
            // InternalDbase.g:910:2: ( rule__Table__Group_5_3__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalDbase.g:910:3: rule__Table__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Table__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getTableAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Table__Group_5__3__Impl"


    // $ANTLR start "rule__Table__Group_5__4"
    // InternalDbase.g:918:1: rule__Table__Group_5__4 : rule__Table__Group_5__4__Impl ;
    public final void rule__Table__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:922:1: ( rule__Table__Group_5__4__Impl )
            // InternalDbase.g:923:2: rule__Table__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_5__4__Impl();

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
    // $ANTLR end "rule__Table__Group_5__4"


    // $ANTLR start "rule__Table__Group_5__4__Impl"
    // InternalDbase.g:929:1: rule__Table__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Table__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:933:1: ( ( '}' ) )
            // InternalDbase.g:934:1: ( '}' )
            {
            // InternalDbase.g:934:1: ( '}' )
            // InternalDbase.g:935:2: '}'
            {
             before(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Table__Group_5__4__Impl"


    // $ANTLR start "rule__Table__Group_5_3__0"
    // InternalDbase.g:945:1: rule__Table__Group_5_3__0 : rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1 ;
    public final void rule__Table__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:949:1: ( rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1 )
            // InternalDbase.g:950:2: rule__Table__Group_5_3__0__Impl rule__Table__Group_5_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Table__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Table__Group_5_3__1();

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
    // $ANTLR end "rule__Table__Group_5_3__0"


    // $ANTLR start "rule__Table__Group_5_3__0__Impl"
    // InternalDbase.g:957:1: rule__Table__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Table__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:961:1: ( ( ',' ) )
            // InternalDbase.g:962:1: ( ',' )
            {
            // InternalDbase.g:962:1: ( ',' )
            // InternalDbase.g:963:2: ','
            {
             before(grammarAccess.getTableAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTableAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Table__Group_5_3__0__Impl"


    // $ANTLR start "rule__Table__Group_5_3__1"
    // InternalDbase.g:972:1: rule__Table__Group_5_3__1 : rule__Table__Group_5_3__1__Impl ;
    public final void rule__Table__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:976:1: ( rule__Table__Group_5_3__1__Impl )
            // InternalDbase.g:977:2: rule__Table__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Table__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Table__Group_5_3__1"


    // $ANTLR start "rule__Table__Group_5_3__1__Impl"
    // InternalDbase.g:983:1: rule__Table__Group_5_3__1__Impl : ( ( rule__Table__ColumnsAssignment_5_3_1 ) ) ;
    public final void rule__Table__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:987:1: ( ( ( rule__Table__ColumnsAssignment_5_3_1 ) ) )
            // InternalDbase.g:988:1: ( ( rule__Table__ColumnsAssignment_5_3_1 ) )
            {
            // InternalDbase.g:988:1: ( ( rule__Table__ColumnsAssignment_5_3_1 ) )
            // InternalDbase.g:989:2: ( rule__Table__ColumnsAssignment_5_3_1 )
            {
             before(grammarAccess.getTableAccess().getColumnsAssignment_5_3_1()); 
            // InternalDbase.g:990:2: ( rule__Table__ColumnsAssignment_5_3_1 )
            // InternalDbase.g:990:3: rule__Table__ColumnsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Table__ColumnsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTableAccess().getColumnsAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Table__Group_5_3__1__Impl"


    // $ANTLR start "rule__Column__Group__0"
    // InternalDbase.g:999:1: rule__Column__Group__0 : rule__Column__Group__0__Impl rule__Column__Group__1 ;
    public final void rule__Column__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1003:1: ( rule__Column__Group__0__Impl rule__Column__Group__1 )
            // InternalDbase.g:1004:2: rule__Column__Group__0__Impl rule__Column__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__1();

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
    // $ANTLR end "rule__Column__Group__0"


    // $ANTLR start "rule__Column__Group__0__Impl"
    // InternalDbase.g:1011:1: rule__Column__Group__0__Impl : ( () ) ;
    public final void rule__Column__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1015:1: ( ( () ) )
            // InternalDbase.g:1016:1: ( () )
            {
            // InternalDbase.g:1016:1: ( () )
            // InternalDbase.g:1017:2: ()
            {
             before(grammarAccess.getColumnAccess().getColumnAction_0()); 
            // InternalDbase.g:1018:2: ()
            // InternalDbase.g:1018:3: 
            {
            }

             after(grammarAccess.getColumnAccess().getColumnAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Column__Group__0__Impl"


    // $ANTLR start "rule__Column__Group__1"
    // InternalDbase.g:1026:1: rule__Column__Group__1 : rule__Column__Group__1__Impl rule__Column__Group__2 ;
    public final void rule__Column__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1030:1: ( rule__Column__Group__1__Impl rule__Column__Group__2 )
            // InternalDbase.g:1031:2: rule__Column__Group__1__Impl rule__Column__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__2();

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
    // $ANTLR end "rule__Column__Group__1"


    // $ANTLR start "rule__Column__Group__1__Impl"
    // InternalDbase.g:1038:1: rule__Column__Group__1__Impl : ( ( rule__Column__KeyAssignment_1 )? ) ;
    public final void rule__Column__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1042:1: ( ( ( rule__Column__KeyAssignment_1 )? ) )
            // InternalDbase.g:1043:1: ( ( rule__Column__KeyAssignment_1 )? )
            {
            // InternalDbase.g:1043:1: ( ( rule__Column__KeyAssignment_1 )? )
            // InternalDbase.g:1044:2: ( rule__Column__KeyAssignment_1 )?
            {
             before(grammarAccess.getColumnAccess().getKeyAssignment_1()); 
            // InternalDbase.g:1045:2: ( rule__Column__KeyAssignment_1 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==25) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDbase.g:1045:3: rule__Column__KeyAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__KeyAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getKeyAssignment_1()); 

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
    // $ANTLR end "rule__Column__Group__1__Impl"


    // $ANTLR start "rule__Column__Group__2"
    // InternalDbase.g:1053:1: rule__Column__Group__2 : rule__Column__Group__2__Impl rule__Column__Group__3 ;
    public final void rule__Column__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1057:1: ( rule__Column__Group__2__Impl rule__Column__Group__3 )
            // InternalDbase.g:1058:2: rule__Column__Group__2__Impl rule__Column__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Column__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__3();

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
    // $ANTLR end "rule__Column__Group__2"


    // $ANTLR start "rule__Column__Group__2__Impl"
    // InternalDbase.g:1065:1: rule__Column__Group__2__Impl : ( 'Column' ) ;
    public final void rule__Column__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1069:1: ( ( 'Column' ) )
            // InternalDbase.g:1070:1: ( 'Column' )
            {
            // InternalDbase.g:1070:1: ( 'Column' )
            // InternalDbase.g:1071:2: 'Column'
            {
             before(grammarAccess.getColumnAccess().getColumnKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getColumnKeyword_2()); 

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
    // $ANTLR end "rule__Column__Group__2__Impl"


    // $ANTLR start "rule__Column__Group__3"
    // InternalDbase.g:1080:1: rule__Column__Group__3 : rule__Column__Group__3__Impl rule__Column__Group__4 ;
    public final void rule__Column__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1084:1: ( rule__Column__Group__3__Impl rule__Column__Group__4 )
            // InternalDbase.g:1085:2: rule__Column__Group__3__Impl rule__Column__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__4();

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
    // $ANTLR end "rule__Column__Group__3"


    // $ANTLR start "rule__Column__Group__3__Impl"
    // InternalDbase.g:1092:1: rule__Column__Group__3__Impl : ( ( rule__Column__NameAssignment_3 ) ) ;
    public final void rule__Column__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1096:1: ( ( ( rule__Column__NameAssignment_3 ) ) )
            // InternalDbase.g:1097:1: ( ( rule__Column__NameAssignment_3 ) )
            {
            // InternalDbase.g:1097:1: ( ( rule__Column__NameAssignment_3 ) )
            // InternalDbase.g:1098:2: ( rule__Column__NameAssignment_3 )
            {
             before(grammarAccess.getColumnAccess().getNameAssignment_3()); 
            // InternalDbase.g:1099:2: ( rule__Column__NameAssignment_3 )
            // InternalDbase.g:1099:3: rule__Column__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Column__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getNameAssignment_3()); 

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
    // $ANTLR end "rule__Column__Group__3__Impl"


    // $ANTLR start "rule__Column__Group__4"
    // InternalDbase.g:1107:1: rule__Column__Group__4 : rule__Column__Group__4__Impl rule__Column__Group__5 ;
    public final void rule__Column__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1111:1: ( rule__Column__Group__4__Impl rule__Column__Group__5 )
            // InternalDbase.g:1112:2: rule__Column__Group__4__Impl rule__Column__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__5();

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
    // $ANTLR end "rule__Column__Group__4"


    // $ANTLR start "rule__Column__Group__4__Impl"
    // InternalDbase.g:1119:1: rule__Column__Group__4__Impl : ( '{' ) ;
    public final void rule__Column__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1123:1: ( ( '{' ) )
            // InternalDbase.g:1124:1: ( '{' )
            {
            // InternalDbase.g:1124:1: ( '{' )
            // InternalDbase.g:1125:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Column__Group__4__Impl"


    // $ANTLR start "rule__Column__Group__5"
    // InternalDbase.g:1134:1: rule__Column__Group__5 : rule__Column__Group__5__Impl rule__Column__Group__6 ;
    public final void rule__Column__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1138:1: ( rule__Column__Group__5__Impl rule__Column__Group__6 )
            // InternalDbase.g:1139:2: rule__Column__Group__5__Impl rule__Column__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__6();

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
    // $ANTLR end "rule__Column__Group__5"


    // $ANTLR start "rule__Column__Group__5__Impl"
    // InternalDbase.g:1146:1: rule__Column__Group__5__Impl : ( ( rule__Column__Group_5__0 )? ) ;
    public final void rule__Column__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1150:1: ( ( ( rule__Column__Group_5__0 )? ) )
            // InternalDbase.g:1151:1: ( ( rule__Column__Group_5__0 )? )
            {
            // InternalDbase.g:1151:1: ( ( rule__Column__Group_5__0 )? )
            // InternalDbase.g:1152:2: ( rule__Column__Group_5__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_5()); 
            // InternalDbase.g:1153:2: ( rule__Column__Group_5__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDbase.g:1153:3: rule__Column__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Column__Group__5__Impl"


    // $ANTLR start "rule__Column__Group__6"
    // InternalDbase.g:1161:1: rule__Column__Group__6 : rule__Column__Group__6__Impl rule__Column__Group__7 ;
    public final void rule__Column__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1165:1: ( rule__Column__Group__6__Impl rule__Column__Group__7 )
            // InternalDbase.g:1166:2: rule__Column__Group__6__Impl rule__Column__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__Column__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group__7();

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
    // $ANTLR end "rule__Column__Group__6"


    // $ANTLR start "rule__Column__Group__6__Impl"
    // InternalDbase.g:1173:1: rule__Column__Group__6__Impl : ( ( rule__Column__Group_6__0 )? ) ;
    public final void rule__Column__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1177:1: ( ( ( rule__Column__Group_6__0 )? ) )
            // InternalDbase.g:1178:1: ( ( rule__Column__Group_6__0 )? )
            {
            // InternalDbase.g:1178:1: ( ( rule__Column__Group_6__0 )? )
            // InternalDbase.g:1179:2: ( rule__Column__Group_6__0 )?
            {
             before(grammarAccess.getColumnAccess().getGroup_6()); 
            // InternalDbase.g:1180:2: ( rule__Column__Group_6__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==24) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDbase.g:1180:3: rule__Column__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Column__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getColumnAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Column__Group__6__Impl"


    // $ANTLR start "rule__Column__Group__7"
    // InternalDbase.g:1188:1: rule__Column__Group__7 : rule__Column__Group__7__Impl ;
    public final void rule__Column__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1192:1: ( rule__Column__Group__7__Impl )
            // InternalDbase.g:1193:2: rule__Column__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group__7__Impl();

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
    // $ANTLR end "rule__Column__Group__7"


    // $ANTLR start "rule__Column__Group__7__Impl"
    // InternalDbase.g:1199:1: rule__Column__Group__7__Impl : ( '}' ) ;
    public final void rule__Column__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1203:1: ( ( '}' ) )
            // InternalDbase.g:1204:1: ( '}' )
            {
            // InternalDbase.g:1204:1: ( '}' )
            // InternalDbase.g:1205:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Column__Group__7__Impl"


    // $ANTLR start "rule__Column__Group_5__0"
    // InternalDbase.g:1215:1: rule__Column__Group_5__0 : rule__Column__Group_5__0__Impl rule__Column__Group_5__1 ;
    public final void rule__Column__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1219:1: ( rule__Column__Group_5__0__Impl rule__Column__Group_5__1 )
            // InternalDbase.g:1220:2: rule__Column__Group_5__0__Impl rule__Column__Group_5__1
            {
            pushFollow(FOLLOW_13);
            rule__Column__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_5__1();

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
    // $ANTLR end "rule__Column__Group_5__0"


    // $ANTLR start "rule__Column__Group_5__0__Impl"
    // InternalDbase.g:1227:1: rule__Column__Group_5__0__Impl : ( 'type' ) ;
    public final void rule__Column__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1231:1: ( ( 'type' ) )
            // InternalDbase.g:1232:1: ( 'type' )
            {
            // InternalDbase.g:1232:1: ( 'type' )
            // InternalDbase.g:1233:2: 'type'
            {
             before(grammarAccess.getColumnAccess().getTypeKeyword_5_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getTypeKeyword_5_0()); 

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
    // $ANTLR end "rule__Column__Group_5__0__Impl"


    // $ANTLR start "rule__Column__Group_5__1"
    // InternalDbase.g:1242:1: rule__Column__Group_5__1 : rule__Column__Group_5__1__Impl ;
    public final void rule__Column__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1246:1: ( rule__Column__Group_5__1__Impl )
            // InternalDbase.g:1247:2: rule__Column__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_5__1__Impl();

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
    // $ANTLR end "rule__Column__Group_5__1"


    // $ANTLR start "rule__Column__Group_5__1__Impl"
    // InternalDbase.g:1253:1: rule__Column__Group_5__1__Impl : ( ( rule__Column__TypeAssignment_5_1 ) ) ;
    public final void rule__Column__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1257:1: ( ( ( rule__Column__TypeAssignment_5_1 ) ) )
            // InternalDbase.g:1258:1: ( ( rule__Column__TypeAssignment_5_1 ) )
            {
            // InternalDbase.g:1258:1: ( ( rule__Column__TypeAssignment_5_1 ) )
            // InternalDbase.g:1259:2: ( rule__Column__TypeAssignment_5_1 )
            {
             before(grammarAccess.getColumnAccess().getTypeAssignment_5_1()); 
            // InternalDbase.g:1260:2: ( rule__Column__TypeAssignment_5_1 )
            // InternalDbase.g:1260:3: rule__Column__TypeAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__TypeAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getTypeAssignment_5_1()); 

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
    // $ANTLR end "rule__Column__Group_5__1__Impl"


    // $ANTLR start "rule__Column__Group_6__0"
    // InternalDbase.g:1269:1: rule__Column__Group_6__0 : rule__Column__Group_6__0__Impl rule__Column__Group_6__1 ;
    public final void rule__Column__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1273:1: ( rule__Column__Group_6__0__Impl rule__Column__Group_6__1 )
            // InternalDbase.g:1274:2: rule__Column__Group_6__0__Impl rule__Column__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Column__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_6__1();

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
    // $ANTLR end "rule__Column__Group_6__0"


    // $ANTLR start "rule__Column__Group_6__0__Impl"
    // InternalDbase.g:1281:1: rule__Column__Group_6__0__Impl : ( 'foreignKey' ) ;
    public final void rule__Column__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1285:1: ( ( 'foreignKey' ) )
            // InternalDbase.g:1286:1: ( 'foreignKey' )
            {
            // InternalDbase.g:1286:1: ( 'foreignKey' )
            // InternalDbase.g:1287:2: 'foreignKey'
            {
             before(grammarAccess.getColumnAccess().getForeignKeyKeyword_6_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getForeignKeyKeyword_6_0()); 

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
    // $ANTLR end "rule__Column__Group_6__0__Impl"


    // $ANTLR start "rule__Column__Group_6__1"
    // InternalDbase.g:1296:1: rule__Column__Group_6__1 : rule__Column__Group_6__1__Impl rule__Column__Group_6__2 ;
    public final void rule__Column__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1300:1: ( rule__Column__Group_6__1__Impl rule__Column__Group_6__2 )
            // InternalDbase.g:1301:2: rule__Column__Group_6__1__Impl rule__Column__Group_6__2
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_6__2();

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
    // $ANTLR end "rule__Column__Group_6__1"


    // $ANTLR start "rule__Column__Group_6__1__Impl"
    // InternalDbase.g:1308:1: rule__Column__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Column__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1312:1: ( ( '{' ) )
            // InternalDbase.g:1313:1: ( '{' )
            {
            // InternalDbase.g:1313:1: ( '{' )
            // InternalDbase.g:1314:2: '{'
            {
             before(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Column__Group_6__1__Impl"


    // $ANTLR start "rule__Column__Group_6__2"
    // InternalDbase.g:1323:1: rule__Column__Group_6__2 : rule__Column__Group_6__2__Impl rule__Column__Group_6__3 ;
    public final void rule__Column__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1327:1: ( rule__Column__Group_6__2__Impl rule__Column__Group_6__3 )
            // InternalDbase.g:1328:2: rule__Column__Group_6__2__Impl rule__Column__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_6__3();

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
    // $ANTLR end "rule__Column__Group_6__2"


    // $ANTLR start "rule__Column__Group_6__2__Impl"
    // InternalDbase.g:1335:1: rule__Column__Group_6__2__Impl : ( ( rule__Column__ForeignKeyAssignment_6_2 ) ) ;
    public final void rule__Column__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1339:1: ( ( ( rule__Column__ForeignKeyAssignment_6_2 ) ) )
            // InternalDbase.g:1340:1: ( ( rule__Column__ForeignKeyAssignment_6_2 ) )
            {
            // InternalDbase.g:1340:1: ( ( rule__Column__ForeignKeyAssignment_6_2 ) )
            // InternalDbase.g:1341:2: ( rule__Column__ForeignKeyAssignment_6_2 )
            {
             before(grammarAccess.getColumnAccess().getForeignKeyAssignment_6_2()); 
            // InternalDbase.g:1342:2: ( rule__Column__ForeignKeyAssignment_6_2 )
            // InternalDbase.g:1342:3: rule__Column__ForeignKeyAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Column__ForeignKeyAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getForeignKeyAssignment_6_2()); 

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
    // $ANTLR end "rule__Column__Group_6__2__Impl"


    // $ANTLR start "rule__Column__Group_6__3"
    // InternalDbase.g:1350:1: rule__Column__Group_6__3 : rule__Column__Group_6__3__Impl rule__Column__Group_6__4 ;
    public final void rule__Column__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1354:1: ( rule__Column__Group_6__3__Impl rule__Column__Group_6__4 )
            // InternalDbase.g:1355:2: rule__Column__Group_6__3__Impl rule__Column__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Column__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_6__4();

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
    // $ANTLR end "rule__Column__Group_6__3"


    // $ANTLR start "rule__Column__Group_6__3__Impl"
    // InternalDbase.g:1362:1: rule__Column__Group_6__3__Impl : ( ( rule__Column__Group_6_3__0 )* ) ;
    public final void rule__Column__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1366:1: ( ( ( rule__Column__Group_6_3__0 )* ) )
            // InternalDbase.g:1367:1: ( ( rule__Column__Group_6_3__0 )* )
            {
            // InternalDbase.g:1367:1: ( ( rule__Column__Group_6_3__0 )* )
            // InternalDbase.g:1368:2: ( rule__Column__Group_6_3__0 )*
            {
             before(grammarAccess.getColumnAccess().getGroup_6_3()); 
            // InternalDbase.g:1369:2: ( rule__Column__Group_6_3__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==18) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalDbase.g:1369:3: rule__Column__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Column__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getColumnAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Column__Group_6__3__Impl"


    // $ANTLR start "rule__Column__Group_6__4"
    // InternalDbase.g:1377:1: rule__Column__Group_6__4 : rule__Column__Group_6__4__Impl ;
    public final void rule__Column__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1381:1: ( rule__Column__Group_6__4__Impl )
            // InternalDbase.g:1382:2: rule__Column__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_6__4__Impl();

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
    // $ANTLR end "rule__Column__Group_6__4"


    // $ANTLR start "rule__Column__Group_6__4__Impl"
    // InternalDbase.g:1388:1: rule__Column__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Column__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1392:1: ( ( '}' ) )
            // InternalDbase.g:1393:1: ( '}' )
            {
            // InternalDbase.g:1393:1: ( '}' )
            // InternalDbase.g:1394:2: '}'
            {
             before(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Column__Group_6__4__Impl"


    // $ANTLR start "rule__Column__Group_6_3__0"
    // InternalDbase.g:1404:1: rule__Column__Group_6_3__0 : rule__Column__Group_6_3__0__Impl rule__Column__Group_6_3__1 ;
    public final void rule__Column__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1408:1: ( rule__Column__Group_6_3__0__Impl rule__Column__Group_6_3__1 )
            // InternalDbase.g:1409:2: rule__Column__Group_6_3__0__Impl rule__Column__Group_6_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Column__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Column__Group_6_3__1();

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
    // $ANTLR end "rule__Column__Group_6_3__0"


    // $ANTLR start "rule__Column__Group_6_3__0__Impl"
    // InternalDbase.g:1416:1: rule__Column__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Column__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1420:1: ( ( ',' ) )
            // InternalDbase.g:1421:1: ( ',' )
            {
            // InternalDbase.g:1421:1: ( ',' )
            // InternalDbase.g:1422:2: ','
            {
             before(grammarAccess.getColumnAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Column__Group_6_3__0__Impl"


    // $ANTLR start "rule__Column__Group_6_3__1"
    // InternalDbase.g:1431:1: rule__Column__Group_6_3__1 : rule__Column__Group_6_3__1__Impl ;
    public final void rule__Column__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1435:1: ( rule__Column__Group_6_3__1__Impl )
            // InternalDbase.g:1436:2: rule__Column__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Column__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Column__Group_6_3__1"


    // $ANTLR start "rule__Column__Group_6_3__1__Impl"
    // InternalDbase.g:1442:1: rule__Column__Group_6_3__1__Impl : ( ( rule__Column__ForeignKeyAssignment_6_3_1 ) ) ;
    public final void rule__Column__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1446:1: ( ( ( rule__Column__ForeignKeyAssignment_6_3_1 ) ) )
            // InternalDbase.g:1447:1: ( ( rule__Column__ForeignKeyAssignment_6_3_1 ) )
            {
            // InternalDbase.g:1447:1: ( ( rule__Column__ForeignKeyAssignment_6_3_1 ) )
            // InternalDbase.g:1448:2: ( rule__Column__ForeignKeyAssignment_6_3_1 )
            {
             before(grammarAccess.getColumnAccess().getForeignKeyAssignment_6_3_1()); 
            // InternalDbase.g:1449:2: ( rule__Column__ForeignKeyAssignment_6_3_1 )
            // InternalDbase.g:1449:3: rule__Column__ForeignKeyAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Column__ForeignKeyAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getColumnAccess().getForeignKeyAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Column__Group_6_3__1__Impl"


    // $ANTLR start "rule__DbaseModel__NameAssignment_2"
    // InternalDbase.g:1458:1: rule__DbaseModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DbaseModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1462:1: ( ( ruleEString ) )
            // InternalDbase.g:1463:2: ( ruleEString )
            {
            // InternalDbase.g:1463:2: ( ruleEString )
            // InternalDbase.g:1464:3: ruleEString
            {
             before(grammarAccess.getDbaseModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDbaseModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DbaseModel__NameAssignment_2"


    // $ANTLR start "rule__DbaseModel__TablesAssignment_4_2"
    // InternalDbase.g:1473:1: rule__DbaseModel__TablesAssignment_4_2 : ( ruleTable ) ;
    public final void rule__DbaseModel__TablesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1477:1: ( ( ruleTable ) )
            // InternalDbase.g:1478:2: ( ruleTable )
            {
            // InternalDbase.g:1478:2: ( ruleTable )
            // InternalDbase.g:1479:3: ruleTable
            {
             before(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__DbaseModel__TablesAssignment_4_2"


    // $ANTLR start "rule__DbaseModel__TablesAssignment_4_3_1"
    // InternalDbase.g:1488:1: rule__DbaseModel__TablesAssignment_4_3_1 : ( ruleTable ) ;
    public final void rule__DbaseModel__TablesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1492:1: ( ( ruleTable ) )
            // InternalDbase.g:1493:2: ( ruleTable )
            {
            // InternalDbase.g:1493:2: ( ruleTable )
            // InternalDbase.g:1494:3: ruleTable
            {
             before(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTable();

            state._fsp--;

             after(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__DbaseModel__TablesAssignment_4_3_1"


    // $ANTLR start "rule__Table__NameAssignment_2"
    // InternalDbase.g:1503:1: rule__Table__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Table__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1507:1: ( ( ruleEString ) )
            // InternalDbase.g:1508:2: ( ruleEString )
            {
            // InternalDbase.g:1508:2: ( ruleEString )
            // InternalDbase.g:1509:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Table__NameAssignment_2"


    // $ANTLR start "rule__Table__EntityAssignment_4_1"
    // InternalDbase.g:1518:1: rule__Table__EntityAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Table__EntityAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1522:1: ( ( ruleEString ) )
            // InternalDbase.g:1523:2: ( ruleEString )
            {
            // InternalDbase.g:1523:2: ( ruleEString )
            // InternalDbase.g:1524:3: ruleEString
            {
             before(grammarAccess.getTableAccess().getEntityEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTableAccess().getEntityEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Table__EntityAssignment_4_1"


    // $ANTLR start "rule__Table__ColumnsAssignment_5_2"
    // InternalDbase.g:1533:1: rule__Table__ColumnsAssignment_5_2 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1537:1: ( ( ruleColumn ) )
            // InternalDbase.g:1538:2: ( ruleColumn )
            {
            // InternalDbase.g:1538:2: ( ruleColumn )
            // InternalDbase.g:1539:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_5_2"


    // $ANTLR start "rule__Table__ColumnsAssignment_5_3_1"
    // InternalDbase.g:1548:1: rule__Table__ColumnsAssignment_5_3_1 : ( ruleColumn ) ;
    public final void rule__Table__ColumnsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1552:1: ( ( ruleColumn ) )
            // InternalDbase.g:1553:2: ( ruleColumn )
            {
            // InternalDbase.g:1553:2: ( ruleColumn )
            // InternalDbase.g:1554:3: ruleColumn
            {
             before(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Table__ColumnsAssignment_5_3_1"


    // $ANTLR start "rule__Column__KeyAssignment_1"
    // InternalDbase.g:1563:1: rule__Column__KeyAssignment_1 : ( ( 'key' ) ) ;
    public final void rule__Column__KeyAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1567:1: ( ( ( 'key' ) ) )
            // InternalDbase.g:1568:2: ( ( 'key' ) )
            {
            // InternalDbase.g:1568:2: ( ( 'key' ) )
            // InternalDbase.g:1569:3: ( 'key' )
            {
             before(grammarAccess.getColumnAccess().getKeyKeyKeyword_1_0()); 
            // InternalDbase.g:1570:3: ( 'key' )
            // InternalDbase.g:1571:4: 'key'
            {
             before(grammarAccess.getColumnAccess().getKeyKeyKeyword_1_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getColumnAccess().getKeyKeyKeyword_1_0()); 

            }

             after(grammarAccess.getColumnAccess().getKeyKeyKeyword_1_0()); 

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
    // $ANTLR end "rule__Column__KeyAssignment_1"


    // $ANTLR start "rule__Column__NameAssignment_3"
    // InternalDbase.g:1582:1: rule__Column__NameAssignment_3 : ( ruleEString ) ;
    public final void rule__Column__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1586:1: ( ( ruleEString ) )
            // InternalDbase.g:1587:2: ( ruleEString )
            {
            // InternalDbase.g:1587:2: ( ruleEString )
            // InternalDbase.g:1588:3: ruleEString
            {
             before(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Column__NameAssignment_3"


    // $ANTLR start "rule__Column__TypeAssignment_5_1"
    // InternalDbase.g:1597:1: rule__Column__TypeAssignment_5_1 : ( ruleColumnType ) ;
    public final void rule__Column__TypeAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1601:1: ( ( ruleColumnType ) )
            // InternalDbase.g:1602:2: ( ruleColumnType )
            {
            // InternalDbase.g:1602:2: ( ruleColumnType )
            // InternalDbase.g:1603:3: ruleColumnType
            {
             before(grammarAccess.getColumnAccess().getTypeColumnTypeEnumRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumnType();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getTypeColumnTypeEnumRuleCall_5_1_0()); 

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
    // $ANTLR end "rule__Column__TypeAssignment_5_1"


    // $ANTLR start "rule__Column__ForeignKeyAssignment_6_2"
    // InternalDbase.g:1612:1: rule__Column__ForeignKeyAssignment_6_2 : ( ruleColumn ) ;
    public final void rule__Column__ForeignKeyAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1616:1: ( ( ruleColumn ) )
            // InternalDbase.g:1617:2: ( ruleColumn )
            {
            // InternalDbase.g:1617:2: ( ruleColumn )
            // InternalDbase.g:1618:3: ruleColumn
            {
             before(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Column__ForeignKeyAssignment_6_2"


    // $ANTLR start "rule__Column__ForeignKeyAssignment_6_3_1"
    // InternalDbase.g:1627:1: rule__Column__ForeignKeyAssignment_6_3_1 : ( ruleColumn ) ;
    public final void rule__Column__ForeignKeyAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDbase.g:1631:1: ( ( ruleColumn ) )
            // InternalDbase.g:1632:2: ( ruleColumn )
            {
            // InternalDbase.g:1632:2: ( ruleColumn )
            // InternalDbase.g:1633:3: ruleColumn
            {
             before(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleColumn();

            state._fsp--;

             after(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__Column__ForeignKeyAssignment_6_3_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001810000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000003800L});

}