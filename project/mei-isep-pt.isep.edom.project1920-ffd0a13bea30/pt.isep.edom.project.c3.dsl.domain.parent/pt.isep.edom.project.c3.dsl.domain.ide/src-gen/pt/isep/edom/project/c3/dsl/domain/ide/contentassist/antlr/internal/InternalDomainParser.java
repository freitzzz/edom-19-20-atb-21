package pt.isep.edom.project.c3.dsl.domain.ide.contentassist.antlr.internal;

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
import pt.isep.edom.project.c3.dsl.domain.services.DomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'STRING'", "'INTEGER'", "'REAL'", "'DomainModel'", "'{'", "'}'", "'entities'", "','", "'Entity'", "'fields'", "'subentities'", "'references'", "'Field'", "'type'", "'SubEntity'", "'upperBound'", "'entity'", "'Reference'", "'-'"
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
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalDomainParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDomainParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDomainParser.tokenNames; }
    public String getGrammarFileName() { return "InternalDomain.g"; }


    	private DomainGrammarAccess grammarAccess;

    	public void setGrammarAccess(DomainGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleDomainModel"
    // InternalDomain.g:53:1: entryRuleDomainModel : ruleDomainModel EOF ;
    public final void entryRuleDomainModel() throws RecognitionException {
        try {
            // InternalDomain.g:54:1: ( ruleDomainModel EOF )
            // InternalDomain.g:55:1: ruleDomainModel EOF
            {
             before(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            ruleDomainModel();

            state._fsp--;

             after(grammarAccess.getDomainModelRule()); 
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
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalDomain.g:62:1: ruleDomainModel : ( ( rule__DomainModel__Group__0 ) ) ;
    public final void ruleDomainModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:66:2: ( ( ( rule__DomainModel__Group__0 ) ) )
            // InternalDomain.g:67:2: ( ( rule__DomainModel__Group__0 ) )
            {
            // InternalDomain.g:67:2: ( ( rule__DomainModel__Group__0 ) )
            // InternalDomain.g:68:3: ( rule__DomainModel__Group__0 )
            {
             before(grammarAccess.getDomainModelAccess().getGroup()); 
            // InternalDomain.g:69:3: ( rule__DomainModel__Group__0 )
            // InternalDomain.g:69:4: rule__DomainModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getGroup()); 

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
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleEString"
    // InternalDomain.g:78:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalDomain.g:79:1: ( ruleEString EOF )
            // InternalDomain.g:80:1: ruleEString EOF
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
    // InternalDomain.g:87:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:91:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalDomain.g:92:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalDomain.g:92:2: ( ( rule__EString__Alternatives ) )
            // InternalDomain.g:93:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalDomain.g:94:3: ( rule__EString__Alternatives )
            // InternalDomain.g:94:4: rule__EString__Alternatives
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


    // $ANTLR start "entryRuleEntity"
    // InternalDomain.g:103:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalDomain.g:104:1: ( ruleEntity EOF )
            // InternalDomain.g:105:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomain.g:112:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:116:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalDomain.g:117:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalDomain.g:117:2: ( ( rule__Entity__Group__0 ) )
            // InternalDomain.g:118:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalDomain.g:119:3: ( rule__Entity__Group__0 )
            // InternalDomain.g:119:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalDomain.g:128:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalDomain.g:129:1: ( ruleField EOF )
            // InternalDomain.g:130:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalDomain.g:137:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:141:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalDomain.g:142:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalDomain.g:142:2: ( ( rule__Field__Group__0 ) )
            // InternalDomain.g:143:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalDomain.g:144:3: ( rule__Field__Group__0 )
            // InternalDomain.g:144:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleSubEntity"
    // InternalDomain.g:153:1: entryRuleSubEntity : ruleSubEntity EOF ;
    public final void entryRuleSubEntity() throws RecognitionException {
        try {
            // InternalDomain.g:154:1: ( ruleSubEntity EOF )
            // InternalDomain.g:155:1: ruleSubEntity EOF
            {
             before(grammarAccess.getSubEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSubEntity();

            state._fsp--;

             after(grammarAccess.getSubEntityRule()); 
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
    // $ANTLR end "entryRuleSubEntity"


    // $ANTLR start "ruleSubEntity"
    // InternalDomain.g:162:1: ruleSubEntity : ( ( rule__SubEntity__Group__0 ) ) ;
    public final void ruleSubEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:166:2: ( ( ( rule__SubEntity__Group__0 ) ) )
            // InternalDomain.g:167:2: ( ( rule__SubEntity__Group__0 ) )
            {
            // InternalDomain.g:167:2: ( ( rule__SubEntity__Group__0 ) )
            // InternalDomain.g:168:3: ( rule__SubEntity__Group__0 )
            {
             before(grammarAccess.getSubEntityAccess().getGroup()); 
            // InternalDomain.g:169:3: ( rule__SubEntity__Group__0 )
            // InternalDomain.g:169:4: rule__SubEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleSubEntity"


    // $ANTLR start "entryRuleReference"
    // InternalDomain.g:178:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalDomain.g:179:1: ( ruleReference EOF )
            // InternalDomain.g:180:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDomain.g:187:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:191:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalDomain.g:192:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalDomain.g:192:2: ( ( rule__Reference__Group__0 ) )
            // InternalDomain.g:193:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalDomain.g:194:3: ( rule__Reference__Group__0 )
            // InternalDomain.g:194:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEInt"
    // InternalDomain.g:203:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalDomain.g:204:1: ( ruleEInt EOF )
            // InternalDomain.g:205:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDomain.g:212:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:216:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalDomain.g:217:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalDomain.g:217:2: ( ( rule__EInt__Group__0 ) )
            // InternalDomain.g:218:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalDomain.g:219:3: ( rule__EInt__Group__0 )
            // InternalDomain.g:219:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleFieldType"
    // InternalDomain.g:228:1: ruleFieldType : ( ( rule__FieldType__Alternatives ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:232:1: ( ( ( rule__FieldType__Alternatives ) ) )
            // InternalDomain.g:233:2: ( ( rule__FieldType__Alternatives ) )
            {
            // InternalDomain.g:233:2: ( ( rule__FieldType__Alternatives ) )
            // InternalDomain.g:234:3: ( rule__FieldType__Alternatives )
            {
             before(grammarAccess.getFieldTypeAccess().getAlternatives()); 
            // InternalDomain.g:235:3: ( rule__FieldType__Alternatives )
            // InternalDomain.g:235:4: rule__FieldType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalDomain.g:243:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:247:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // InternalDomain.g:248:2: ( RULE_STRING )
                    {
                    // InternalDomain.g:248:2: ( RULE_STRING )
                    // InternalDomain.g:249:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:254:2: ( RULE_ID )
                    {
                    // InternalDomain.g:254:2: ( RULE_ID )
                    // InternalDomain.g:255:3: RULE_ID
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


    // $ANTLR start "rule__FieldType__Alternatives"
    // InternalDomain.g:264:1: rule__FieldType__Alternatives : ( ( ( 'STRING' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) );
    public final void rule__FieldType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:268:1: ( ( ( 'STRING' ) ) | ( ( 'INTEGER' ) ) | ( ( 'REAL' ) ) )
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
                    // InternalDomain.g:269:2: ( ( 'STRING' ) )
                    {
                    // InternalDomain.g:269:2: ( ( 'STRING' ) )
                    // InternalDomain.g:270:3: ( 'STRING' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 
                    // InternalDomain.g:271:3: ( 'STRING' )
                    // InternalDomain.g:271:4: 'STRING'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:275:2: ( ( 'INTEGER' ) )
                    {
                    // InternalDomain.g:275:2: ( ( 'INTEGER' ) )
                    // InternalDomain.g:276:3: ( 'INTEGER' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 
                    // InternalDomain.g:277:3: ( 'INTEGER' )
                    // InternalDomain.g:277:4: 'INTEGER'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:281:2: ( ( 'REAL' ) )
                    {
                    // InternalDomain.g:281:2: ( ( 'REAL' ) )
                    // InternalDomain.g:282:3: ( 'REAL' )
                    {
                     before(grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2()); 
                    // InternalDomain.g:283:3: ( 'REAL' )
                    // InternalDomain.g:283:4: 'REAL'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__FieldType__Alternatives"


    // $ANTLR start "rule__DomainModel__Group__0"
    // InternalDomain.g:291:1: rule__DomainModel__Group__0 : rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 ;
    public final void rule__DomainModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:295:1: ( rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1 )
            // InternalDomain.g:296:2: rule__DomainModel__Group__0__Impl rule__DomainModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DomainModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__1();

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
    // $ANTLR end "rule__DomainModel__Group__0"


    // $ANTLR start "rule__DomainModel__Group__0__Impl"
    // InternalDomain.g:303:1: rule__DomainModel__Group__0__Impl : ( () ) ;
    public final void rule__DomainModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:307:1: ( ( () ) )
            // InternalDomain.g:308:1: ( () )
            {
            // InternalDomain.g:308:1: ( () )
            // InternalDomain.g:309:2: ()
            {
             before(grammarAccess.getDomainModelAccess().getDomainModelAction_0()); 
            // InternalDomain.g:310:2: ()
            // InternalDomain.g:310:3: 
            {
            }

             after(grammarAccess.getDomainModelAccess().getDomainModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DomainModel__Group__0__Impl"


    // $ANTLR start "rule__DomainModel__Group__1"
    // InternalDomain.g:318:1: rule__DomainModel__Group__1 : rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 ;
    public final void rule__DomainModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:322:1: ( rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2 )
            // InternalDomain.g:323:2: rule__DomainModel__Group__1__Impl rule__DomainModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__DomainModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__2();

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
    // $ANTLR end "rule__DomainModel__Group__1"


    // $ANTLR start "rule__DomainModel__Group__1__Impl"
    // InternalDomain.g:330:1: rule__DomainModel__Group__1__Impl : ( 'DomainModel' ) ;
    public final void rule__DomainModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:334:1: ( ( 'DomainModel' ) )
            // InternalDomain.g:335:1: ( 'DomainModel' )
            {
            // InternalDomain.g:335:1: ( 'DomainModel' )
            // InternalDomain.g:336:2: 'DomainModel'
            {
             before(grammarAccess.getDomainModelAccess().getDomainModelKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getDomainModelKeyword_1()); 

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
    // $ANTLR end "rule__DomainModel__Group__1__Impl"


    // $ANTLR start "rule__DomainModel__Group__2"
    // InternalDomain.g:345:1: rule__DomainModel__Group__2 : rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 ;
    public final void rule__DomainModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:349:1: ( rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3 )
            // InternalDomain.g:350:2: rule__DomainModel__Group__2__Impl rule__DomainModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__DomainModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__3();

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
    // $ANTLR end "rule__DomainModel__Group__2"


    // $ANTLR start "rule__DomainModel__Group__2__Impl"
    // InternalDomain.g:357:1: rule__DomainModel__Group__2__Impl : ( ( rule__DomainModel__NameAssignment_2 ) ) ;
    public final void rule__DomainModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:361:1: ( ( ( rule__DomainModel__NameAssignment_2 ) ) )
            // InternalDomain.g:362:1: ( ( rule__DomainModel__NameAssignment_2 ) )
            {
            // InternalDomain.g:362:1: ( ( rule__DomainModel__NameAssignment_2 ) )
            // InternalDomain.g:363:2: ( rule__DomainModel__NameAssignment_2 )
            {
             before(grammarAccess.getDomainModelAccess().getNameAssignment_2()); 
            // InternalDomain.g:364:2: ( rule__DomainModel__NameAssignment_2 )
            // InternalDomain.g:364:3: rule__DomainModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__DomainModel__Group__2__Impl"


    // $ANTLR start "rule__DomainModel__Group__3"
    // InternalDomain.g:372:1: rule__DomainModel__Group__3 : rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 ;
    public final void rule__DomainModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:376:1: ( rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4 )
            // InternalDomain.g:377:2: rule__DomainModel__Group__3__Impl rule__DomainModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__DomainModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__4();

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
    // $ANTLR end "rule__DomainModel__Group__3"


    // $ANTLR start "rule__DomainModel__Group__3__Impl"
    // InternalDomain.g:384:1: rule__DomainModel__Group__3__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:388:1: ( ( '{' ) )
            // InternalDomain.g:389:1: ( '{' )
            {
            // InternalDomain.g:389:1: ( '{' )
            // InternalDomain.g:390:2: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__DomainModel__Group__3__Impl"


    // $ANTLR start "rule__DomainModel__Group__4"
    // InternalDomain.g:399:1: rule__DomainModel__Group__4 : rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 ;
    public final void rule__DomainModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:403:1: ( rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5 )
            // InternalDomain.g:404:2: rule__DomainModel__Group__4__Impl rule__DomainModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__DomainModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__5();

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
    // $ANTLR end "rule__DomainModel__Group__4"


    // $ANTLR start "rule__DomainModel__Group__4__Impl"
    // InternalDomain.g:411:1: rule__DomainModel__Group__4__Impl : ( ( rule__DomainModel__Group_4__0 )? ) ;
    public final void rule__DomainModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:415:1: ( ( ( rule__DomainModel__Group_4__0 )? ) )
            // InternalDomain.g:416:1: ( ( rule__DomainModel__Group_4__0 )? )
            {
            // InternalDomain.g:416:1: ( ( rule__DomainModel__Group_4__0 )? )
            // InternalDomain.g:417:2: ( rule__DomainModel__Group_4__0 )?
            {
             before(grammarAccess.getDomainModelAccess().getGroup_4()); 
            // InternalDomain.g:418:2: ( rule__DomainModel__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomain.g:418:3: rule__DomainModel__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DomainModel__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDomainModelAccess().getGroup_4()); 

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
    // $ANTLR end "rule__DomainModel__Group__4__Impl"


    // $ANTLR start "rule__DomainModel__Group__5"
    // InternalDomain.g:426:1: rule__DomainModel__Group__5 : rule__DomainModel__Group__5__Impl ;
    public final void rule__DomainModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:430:1: ( rule__DomainModel__Group__5__Impl )
            // InternalDomain.g:431:2: rule__DomainModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group__5__Impl();

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
    // $ANTLR end "rule__DomainModel__Group__5"


    // $ANTLR start "rule__DomainModel__Group__5__Impl"
    // InternalDomain.g:437:1: rule__DomainModel__Group__5__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:441:1: ( ( '}' ) )
            // InternalDomain.g:442:1: ( '}' )
            {
            // InternalDomain.g:442:1: ( '}' )
            // InternalDomain.g:443:2: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__DomainModel__Group__5__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__0"
    // InternalDomain.g:453:1: rule__DomainModel__Group_4__0 : rule__DomainModel__Group_4__0__Impl rule__DomainModel__Group_4__1 ;
    public final void rule__DomainModel__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:457:1: ( rule__DomainModel__Group_4__0__Impl rule__DomainModel__Group_4__1 )
            // InternalDomain.g:458:2: rule__DomainModel__Group_4__0__Impl rule__DomainModel__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__DomainModel__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__1();

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
    // $ANTLR end "rule__DomainModel__Group_4__0"


    // $ANTLR start "rule__DomainModel__Group_4__0__Impl"
    // InternalDomain.g:465:1: rule__DomainModel__Group_4__0__Impl : ( 'entities' ) ;
    public final void rule__DomainModel__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:469:1: ( ( 'entities' ) )
            // InternalDomain.g:470:1: ( 'entities' )
            {
            // InternalDomain.g:470:1: ( 'entities' )
            // InternalDomain.g:471:2: 'entities'
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getEntitiesKeyword_4_0()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__0__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__1"
    // InternalDomain.g:480:1: rule__DomainModel__Group_4__1 : rule__DomainModel__Group_4__1__Impl rule__DomainModel__Group_4__2 ;
    public final void rule__DomainModel__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:484:1: ( rule__DomainModel__Group_4__1__Impl rule__DomainModel__Group_4__2 )
            // InternalDomain.g:485:2: rule__DomainModel__Group_4__1__Impl rule__DomainModel__Group_4__2
            {
            pushFollow(FOLLOW_7);
            rule__DomainModel__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__2();

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
    // $ANTLR end "rule__DomainModel__Group_4__1"


    // $ANTLR start "rule__DomainModel__Group_4__1__Impl"
    // InternalDomain.g:492:1: rule__DomainModel__Group_4__1__Impl : ( '{' ) ;
    public final void rule__DomainModel__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:496:1: ( ( '{' ) )
            // InternalDomain.g:497:1: ( '{' )
            {
            // InternalDomain.g:497:1: ( '{' )
            // InternalDomain.g:498:2: '{'
            {
             before(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__1__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__2"
    // InternalDomain.g:507:1: rule__DomainModel__Group_4__2 : rule__DomainModel__Group_4__2__Impl rule__DomainModel__Group_4__3 ;
    public final void rule__DomainModel__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:511:1: ( rule__DomainModel__Group_4__2__Impl rule__DomainModel__Group_4__3 )
            // InternalDomain.g:512:2: rule__DomainModel__Group_4__2__Impl rule__DomainModel__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__DomainModel__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__3();

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
    // $ANTLR end "rule__DomainModel__Group_4__2"


    // $ANTLR start "rule__DomainModel__Group_4__2__Impl"
    // InternalDomain.g:519:1: rule__DomainModel__Group_4__2__Impl : ( ( rule__DomainModel__EntitiesAssignment_4_2 ) ) ;
    public final void rule__DomainModel__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:523:1: ( ( ( rule__DomainModel__EntitiesAssignment_4_2 ) ) )
            // InternalDomain.g:524:1: ( ( rule__DomainModel__EntitiesAssignment_4_2 ) )
            {
            // InternalDomain.g:524:1: ( ( rule__DomainModel__EntitiesAssignment_4_2 ) )
            // InternalDomain.g:525:2: ( rule__DomainModel__EntitiesAssignment_4_2 )
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_2()); 
            // InternalDomain.g:526:2: ( rule__DomainModel__EntitiesAssignment_4_2 )
            // InternalDomain.g:526:3: rule__DomainModel__EntitiesAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__EntitiesAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_2()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__2__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__3"
    // InternalDomain.g:534:1: rule__DomainModel__Group_4__3 : rule__DomainModel__Group_4__3__Impl rule__DomainModel__Group_4__4 ;
    public final void rule__DomainModel__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:538:1: ( rule__DomainModel__Group_4__3__Impl rule__DomainModel__Group_4__4 )
            // InternalDomain.g:539:2: rule__DomainModel__Group_4__3__Impl rule__DomainModel__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__DomainModel__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__4();

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
    // $ANTLR end "rule__DomainModel__Group_4__3"


    // $ANTLR start "rule__DomainModel__Group_4__3__Impl"
    // InternalDomain.g:546:1: rule__DomainModel__Group_4__3__Impl : ( ( rule__DomainModel__Group_4_3__0 )* ) ;
    public final void rule__DomainModel__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:550:1: ( ( ( rule__DomainModel__Group_4_3__0 )* ) )
            // InternalDomain.g:551:1: ( ( rule__DomainModel__Group_4_3__0 )* )
            {
            // InternalDomain.g:551:1: ( ( rule__DomainModel__Group_4_3__0 )* )
            // InternalDomain.g:552:2: ( rule__DomainModel__Group_4_3__0 )*
            {
             before(grammarAccess.getDomainModelAccess().getGroup_4_3()); 
            // InternalDomain.g:553:2: ( rule__DomainModel__Group_4_3__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalDomain.g:553:3: rule__DomainModel__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__DomainModel__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDomainModelAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__3__Impl"


    // $ANTLR start "rule__DomainModel__Group_4__4"
    // InternalDomain.g:561:1: rule__DomainModel__Group_4__4 : rule__DomainModel__Group_4__4__Impl ;
    public final void rule__DomainModel__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:565:1: ( rule__DomainModel__Group_4__4__Impl )
            // InternalDomain.g:566:2: rule__DomainModel__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4__4__Impl();

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
    // $ANTLR end "rule__DomainModel__Group_4__4"


    // $ANTLR start "rule__DomainModel__Group_4__4__Impl"
    // InternalDomain.g:572:1: rule__DomainModel__Group_4__4__Impl : ( '}' ) ;
    public final void rule__DomainModel__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:576:1: ( ( '}' ) )
            // InternalDomain.g:577:1: ( '}' )
            {
            // InternalDomain.g:577:1: ( '}' )
            // InternalDomain.g:578:2: '}'
            {
             before(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__DomainModel__Group_4__4__Impl"


    // $ANTLR start "rule__DomainModel__Group_4_3__0"
    // InternalDomain.g:588:1: rule__DomainModel__Group_4_3__0 : rule__DomainModel__Group_4_3__0__Impl rule__DomainModel__Group_4_3__1 ;
    public final void rule__DomainModel__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:592:1: ( rule__DomainModel__Group_4_3__0__Impl rule__DomainModel__Group_4_3__1 )
            // InternalDomain.g:593:2: rule__DomainModel__Group_4_3__0__Impl rule__DomainModel__Group_4_3__1
            {
            pushFollow(FOLLOW_7);
            rule__DomainModel__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4_3__1();

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
    // $ANTLR end "rule__DomainModel__Group_4_3__0"


    // $ANTLR start "rule__DomainModel__Group_4_3__0__Impl"
    // InternalDomain.g:600:1: rule__DomainModel__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__DomainModel__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:604:1: ( ( ',' ) )
            // InternalDomain.g:605:1: ( ',' )
            {
            // InternalDomain.g:605:1: ( ',' )
            // InternalDomain.g:606:2: ','
            {
             before(grammarAccess.getDomainModelAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getDomainModelAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__DomainModel__Group_4_3__0__Impl"


    // $ANTLR start "rule__DomainModel__Group_4_3__1"
    // InternalDomain.g:615:1: rule__DomainModel__Group_4_3__1 : rule__DomainModel__Group_4_3__1__Impl ;
    public final void rule__DomainModel__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:619:1: ( rule__DomainModel__Group_4_3__1__Impl )
            // InternalDomain.g:620:2: rule__DomainModel__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__DomainModel__Group_4_3__1"


    // $ANTLR start "rule__DomainModel__Group_4_3__1__Impl"
    // InternalDomain.g:626:1: rule__DomainModel__Group_4_3__1__Impl : ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) ) ;
    public final void rule__DomainModel__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:630:1: ( ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) ) )
            // InternalDomain.g:631:1: ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) )
            {
            // InternalDomain.g:631:1: ( ( rule__DomainModel__EntitiesAssignment_4_3_1 ) )
            // InternalDomain.g:632:2: ( rule__DomainModel__EntitiesAssignment_4_3_1 )
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_3_1()); 
            // InternalDomain.g:633:2: ( rule__DomainModel__EntitiesAssignment_4_3_1 )
            // InternalDomain.g:633:3: rule__DomainModel__EntitiesAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__DomainModel__EntitiesAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_3_1()); 

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
    // $ANTLR end "rule__DomainModel__Group_4_3__1__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalDomain.g:642:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:646:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalDomain.g:647:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalDomain.g:654:1: rule__Entity__Group__0__Impl : ( () ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:658:1: ( ( () ) )
            // InternalDomain.g:659:1: ( () )
            {
            // InternalDomain.g:659:1: ( () )
            // InternalDomain.g:660:2: ()
            {
             before(grammarAccess.getEntityAccess().getEntityAction_0()); 
            // InternalDomain.g:661:2: ()
            // InternalDomain.g:661:3: 
            {
            }

             after(grammarAccess.getEntityAccess().getEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalDomain.g:669:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:673:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalDomain.g:674:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalDomain.g:681:1: rule__Entity__Group__1__Impl : ( 'Entity' ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:685:1: ( ( 'Entity' ) )
            // InternalDomain.g:686:1: ( 'Entity' )
            {
            // InternalDomain.g:686:1: ( 'Entity' )
            // InternalDomain.g:687:2: 'Entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalDomain.g:696:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:700:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalDomain.g:701:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalDomain.g:708:1: rule__Entity__Group__2__Impl : ( ( rule__Entity__NameAssignment_2 ) ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:712:1: ( ( ( rule__Entity__NameAssignment_2 ) ) )
            // InternalDomain.g:713:1: ( ( rule__Entity__NameAssignment_2 ) )
            {
            // InternalDomain.g:713:1: ( ( rule__Entity__NameAssignment_2 ) )
            // InternalDomain.g:714:2: ( rule__Entity__NameAssignment_2 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_2()); 
            // InternalDomain.g:715:2: ( rule__Entity__NameAssignment_2 )
            // InternalDomain.g:715:3: rule__Entity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalDomain.g:723:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl rule__Entity__Group__4 ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:727:1: ( rule__Entity__Group__3__Impl rule__Entity__Group__4 )
            // InternalDomain.g:728:2: rule__Entity__Group__3__Impl rule__Entity__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__4();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalDomain.g:735:1: rule__Entity__Group__3__Impl : ( '{' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:739:1: ( ( '{' ) )
            // InternalDomain.g:740:1: ( '{' )
            {
            // InternalDomain.g:740:1: ( '{' )
            // InternalDomain.g:741:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__Entity__Group__4"
    // InternalDomain.g:750:1: rule__Entity__Group__4 : rule__Entity__Group__4__Impl rule__Entity__Group__5 ;
    public final void rule__Entity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:754:1: ( rule__Entity__Group__4__Impl rule__Entity__Group__5 )
            // InternalDomain.g:755:2: rule__Entity__Group__4__Impl rule__Entity__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__5();

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
    // $ANTLR end "rule__Entity__Group__4"


    // $ANTLR start "rule__Entity__Group__4__Impl"
    // InternalDomain.g:762:1: rule__Entity__Group__4__Impl : ( ( rule__Entity__Group_4__0 )? ) ;
    public final void rule__Entity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:766:1: ( ( ( rule__Entity__Group_4__0 )? ) )
            // InternalDomain.g:767:1: ( ( rule__Entity__Group_4__0 )? )
            {
            // InternalDomain.g:767:1: ( ( rule__Entity__Group_4__0 )? )
            // InternalDomain.g:768:2: ( rule__Entity__Group_4__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_4()); 
            // InternalDomain.g:769:2: ( rule__Entity__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomain.g:769:3: rule__Entity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Entity__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__5"
    // InternalDomain.g:777:1: rule__Entity__Group__5 : rule__Entity__Group__5__Impl rule__Entity__Group__6 ;
    public final void rule__Entity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:781:1: ( rule__Entity__Group__5__Impl rule__Entity__Group__6 )
            // InternalDomain.g:782:2: rule__Entity__Group__5__Impl rule__Entity__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__6();

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
    // $ANTLR end "rule__Entity__Group__5"


    // $ANTLR start "rule__Entity__Group__5__Impl"
    // InternalDomain.g:789:1: rule__Entity__Group__5__Impl : ( ( rule__Entity__Group_5__0 )? ) ;
    public final void rule__Entity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:793:1: ( ( ( rule__Entity__Group_5__0 )? ) )
            // InternalDomain.g:794:1: ( ( rule__Entity__Group_5__0 )? )
            {
            // InternalDomain.g:794:1: ( ( rule__Entity__Group_5__0 )? )
            // InternalDomain.g:795:2: ( rule__Entity__Group_5__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_5()); 
            // InternalDomain.g:796:2: ( rule__Entity__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDomain.g:796:3: rule__Entity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Entity__Group__5__Impl"


    // $ANTLR start "rule__Entity__Group__6"
    // InternalDomain.g:804:1: rule__Entity__Group__6 : rule__Entity__Group__6__Impl rule__Entity__Group__7 ;
    public final void rule__Entity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:808:1: ( rule__Entity__Group__6__Impl rule__Entity__Group__7 )
            // InternalDomain.g:809:2: rule__Entity__Group__6__Impl rule__Entity__Group__7
            {
            pushFollow(FOLLOW_10);
            rule__Entity__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__7();

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
    // $ANTLR end "rule__Entity__Group__6"


    // $ANTLR start "rule__Entity__Group__6__Impl"
    // InternalDomain.g:816:1: rule__Entity__Group__6__Impl : ( ( rule__Entity__Group_6__0 )? ) ;
    public final void rule__Entity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:820:1: ( ( ( rule__Entity__Group_6__0 )? ) )
            // InternalDomain.g:821:1: ( ( rule__Entity__Group_6__0 )? )
            {
            // InternalDomain.g:821:1: ( ( rule__Entity__Group_6__0 )? )
            // InternalDomain.g:822:2: ( rule__Entity__Group_6__0 )?
            {
             before(grammarAccess.getEntityAccess().getGroup_6()); 
            // InternalDomain.g:823:2: ( rule__Entity__Group_6__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomain.g:823:3: rule__Entity__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Entity__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEntityAccess().getGroup_6()); 

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
    // $ANTLR end "rule__Entity__Group__6__Impl"


    // $ANTLR start "rule__Entity__Group__7"
    // InternalDomain.g:831:1: rule__Entity__Group__7 : rule__Entity__Group__7__Impl ;
    public final void rule__Entity__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:835:1: ( rule__Entity__Group__7__Impl )
            // InternalDomain.g:836:2: rule__Entity__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__7__Impl();

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
    // $ANTLR end "rule__Entity__Group__7"


    // $ANTLR start "rule__Entity__Group__7__Impl"
    // InternalDomain.g:842:1: rule__Entity__Group__7__Impl : ( '}' ) ;
    public final void rule__Entity__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:846:1: ( ( '}' ) )
            // InternalDomain.g:847:1: ( '}' )
            {
            // InternalDomain.g:847:1: ( '}' )
            // InternalDomain.g:848:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7()); 

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
    // $ANTLR end "rule__Entity__Group__7__Impl"


    // $ANTLR start "rule__Entity__Group_4__0"
    // InternalDomain.g:858:1: rule__Entity__Group_4__0 : rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 ;
    public final void rule__Entity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:862:1: ( rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1 )
            // InternalDomain.g:863:2: rule__Entity__Group_4__0__Impl rule__Entity__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__1();

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
    // $ANTLR end "rule__Entity__Group_4__0"


    // $ANTLR start "rule__Entity__Group_4__0__Impl"
    // InternalDomain.g:870:1: rule__Entity__Group_4__0__Impl : ( 'fields' ) ;
    public final void rule__Entity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:874:1: ( ( 'fields' ) )
            // InternalDomain.g:875:1: ( 'fields' )
            {
            // InternalDomain.g:875:1: ( 'fields' )
            // InternalDomain.g:876:2: 'fields'
            {
             before(grammarAccess.getEntityAccess().getFieldsKeyword_4_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getFieldsKeyword_4_0()); 

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
    // $ANTLR end "rule__Entity__Group_4__0__Impl"


    // $ANTLR start "rule__Entity__Group_4__1"
    // InternalDomain.g:885:1: rule__Entity__Group_4__1 : rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 ;
    public final void rule__Entity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:889:1: ( rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2 )
            // InternalDomain.g:890:2: rule__Entity__Group_4__1__Impl rule__Entity__Group_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__2();

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
    // $ANTLR end "rule__Entity__Group_4__1"


    // $ANTLR start "rule__Entity__Group_4__1__Impl"
    // InternalDomain.g:897:1: rule__Entity__Group_4__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:901:1: ( ( '{' ) )
            // InternalDomain.g:902:1: ( '{' )
            {
            // InternalDomain.g:902:1: ( '{' )
            // InternalDomain.g:903:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1()); 

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
    // $ANTLR end "rule__Entity__Group_4__1__Impl"


    // $ANTLR start "rule__Entity__Group_4__2"
    // InternalDomain.g:912:1: rule__Entity__Group_4__2 : rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 ;
    public final void rule__Entity__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:916:1: ( rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3 )
            // InternalDomain.g:917:2: rule__Entity__Group_4__2__Impl rule__Entity__Group_4__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__3();

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
    // $ANTLR end "rule__Entity__Group_4__2"


    // $ANTLR start "rule__Entity__Group_4__2__Impl"
    // InternalDomain.g:924:1: rule__Entity__Group_4__2__Impl : ( ( rule__Entity__FieldsAssignment_4_2 ) ) ;
    public final void rule__Entity__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:928:1: ( ( ( rule__Entity__FieldsAssignment_4_2 ) ) )
            // InternalDomain.g:929:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            {
            // InternalDomain.g:929:1: ( ( rule__Entity__FieldsAssignment_4_2 ) )
            // InternalDomain.g:930:2: ( rule__Entity__FieldsAssignment_4_2 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_2()); 
            // InternalDomain.g:931:2: ( rule__Entity__FieldsAssignment_4_2 )
            // InternalDomain.g:931:3: rule__Entity__FieldsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_2()); 

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
    // $ANTLR end "rule__Entity__Group_4__2__Impl"


    // $ANTLR start "rule__Entity__Group_4__3"
    // InternalDomain.g:939:1: rule__Entity__Group_4__3 : rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 ;
    public final void rule__Entity__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:943:1: ( rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4 )
            // InternalDomain.g:944:2: rule__Entity__Group_4__3__Impl rule__Entity__Group_4__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4();

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
    // $ANTLR end "rule__Entity__Group_4__3"


    // $ANTLR start "rule__Entity__Group_4__3__Impl"
    // InternalDomain.g:951:1: rule__Entity__Group_4__3__Impl : ( ( rule__Entity__Group_4_3__0 )* ) ;
    public final void rule__Entity__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:955:1: ( ( ( rule__Entity__Group_4_3__0 )* ) )
            // InternalDomain.g:956:1: ( ( rule__Entity__Group_4_3__0 )* )
            {
            // InternalDomain.g:956:1: ( ( rule__Entity__Group_4_3__0 )* )
            // InternalDomain.g:957:2: ( rule__Entity__Group_4_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_4_3()); 
            // InternalDomain.g:958:2: ( rule__Entity__Group_4_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalDomain.g:958:3: rule__Entity__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_4_3()); 

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
    // $ANTLR end "rule__Entity__Group_4__3__Impl"


    // $ANTLR start "rule__Entity__Group_4__4"
    // InternalDomain.g:966:1: rule__Entity__Group_4__4 : rule__Entity__Group_4__4__Impl ;
    public final void rule__Entity__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:970:1: ( rule__Entity__Group_4__4__Impl )
            // InternalDomain.g:971:2: rule__Entity__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_4__4"


    // $ANTLR start "rule__Entity__Group_4__4__Impl"
    // InternalDomain.g:977:1: rule__Entity__Group_4__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:981:1: ( ( '}' ) )
            // InternalDomain.g:982:1: ( '}' )
            {
            // InternalDomain.g:982:1: ( '}' )
            // InternalDomain.g:983:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4()); 

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
    // $ANTLR end "rule__Entity__Group_4__4__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__0"
    // InternalDomain.g:993:1: rule__Entity__Group_4_3__0 : rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 ;
    public final void rule__Entity__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:997:1: ( rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1 )
            // InternalDomain.g:998:2: rule__Entity__Group_4_3__0__Impl rule__Entity__Group_4_3__1
            {
            pushFollow(FOLLOW_11);
            rule__Entity__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_3__1();

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
    // $ANTLR end "rule__Entity__Group_4_3__0"


    // $ANTLR start "rule__Entity__Group_4_3__0__Impl"
    // InternalDomain.g:1005:1: rule__Entity__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1009:1: ( ( ',' ) )
            // InternalDomain.g:1010:1: ( ',' )
            {
            // InternalDomain.g:1010:1: ( ',' )
            // InternalDomain.g:1011:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_4_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_4_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_4_3__1"
    // InternalDomain.g:1020:1: rule__Entity__Group_4_3__1 : rule__Entity__Group_4_3__1__Impl ;
    public final void rule__Entity__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1024:1: ( rule__Entity__Group_4_3__1__Impl )
            // InternalDomain.g:1025:2: rule__Entity__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_4_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_4_3__1"


    // $ANTLR start "rule__Entity__Group_4_3__1__Impl"
    // InternalDomain.g:1031:1: rule__Entity__Group_4_3__1__Impl : ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) ;
    public final void rule__Entity__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1035:1: ( ( ( rule__Entity__FieldsAssignment_4_3_1 ) ) )
            // InternalDomain.g:1036:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            {
            // InternalDomain.g:1036:1: ( ( rule__Entity__FieldsAssignment_4_3_1 ) )
            // InternalDomain.g:1037:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            {
             before(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1()); 
            // InternalDomain.g:1038:2: ( rule__Entity__FieldsAssignment_4_3_1 )
            // InternalDomain.g:1038:3: rule__Entity__FieldsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__FieldsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_4_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__0"
    // InternalDomain.g:1047:1: rule__Entity__Group_5__0 : rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 ;
    public final void rule__Entity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1051:1: ( rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1 )
            // InternalDomain.g:1052:2: rule__Entity__Group_5__0__Impl rule__Entity__Group_5__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__1();

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
    // $ANTLR end "rule__Entity__Group_5__0"


    // $ANTLR start "rule__Entity__Group_5__0__Impl"
    // InternalDomain.g:1059:1: rule__Entity__Group_5__0__Impl : ( 'subentities' ) ;
    public final void rule__Entity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1063:1: ( ( 'subentities' ) )
            // InternalDomain.g:1064:1: ( 'subentities' )
            {
            // InternalDomain.g:1064:1: ( 'subentities' )
            // InternalDomain.g:1065:2: 'subentities'
            {
             before(grammarAccess.getEntityAccess().getSubentitiesKeyword_5_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getSubentitiesKeyword_5_0()); 

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
    // $ANTLR end "rule__Entity__Group_5__0__Impl"


    // $ANTLR start "rule__Entity__Group_5__1"
    // InternalDomain.g:1074:1: rule__Entity__Group_5__1 : rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 ;
    public final void rule__Entity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1078:1: ( rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2 )
            // InternalDomain.g:1079:2: rule__Entity__Group_5__1__Impl rule__Entity__Group_5__2
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__2();

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
    // $ANTLR end "rule__Entity__Group_5__1"


    // $ANTLR start "rule__Entity__Group_5__1__Impl"
    // InternalDomain.g:1086:1: rule__Entity__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1090:1: ( ( '{' ) )
            // InternalDomain.g:1091:1: ( '{' )
            {
            // InternalDomain.g:1091:1: ( '{' )
            // InternalDomain.g:1092:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1()); 

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
    // $ANTLR end "rule__Entity__Group_5__1__Impl"


    // $ANTLR start "rule__Entity__Group_5__2"
    // InternalDomain.g:1101:1: rule__Entity__Group_5__2 : rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 ;
    public final void rule__Entity__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1105:1: ( rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3 )
            // InternalDomain.g:1106:2: rule__Entity__Group_5__2__Impl rule__Entity__Group_5__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__3();

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
    // $ANTLR end "rule__Entity__Group_5__2"


    // $ANTLR start "rule__Entity__Group_5__2__Impl"
    // InternalDomain.g:1113:1: rule__Entity__Group_5__2__Impl : ( ( rule__Entity__SubentitiesAssignment_5_2 ) ) ;
    public final void rule__Entity__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1117:1: ( ( ( rule__Entity__SubentitiesAssignment_5_2 ) ) )
            // InternalDomain.g:1118:1: ( ( rule__Entity__SubentitiesAssignment_5_2 ) )
            {
            // InternalDomain.g:1118:1: ( ( rule__Entity__SubentitiesAssignment_5_2 ) )
            // InternalDomain.g:1119:2: ( rule__Entity__SubentitiesAssignment_5_2 )
            {
             before(grammarAccess.getEntityAccess().getSubentitiesAssignment_5_2()); 
            // InternalDomain.g:1120:2: ( rule__Entity__SubentitiesAssignment_5_2 )
            // InternalDomain.g:1120:3: rule__Entity__SubentitiesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SubentitiesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSubentitiesAssignment_5_2()); 

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
    // $ANTLR end "rule__Entity__Group_5__2__Impl"


    // $ANTLR start "rule__Entity__Group_5__3"
    // InternalDomain.g:1128:1: rule__Entity__Group_5__3 : rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 ;
    public final void rule__Entity__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1132:1: ( rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4 )
            // InternalDomain.g:1133:2: rule__Entity__Group_5__3__Impl rule__Entity__Group_5__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__4();

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
    // $ANTLR end "rule__Entity__Group_5__3"


    // $ANTLR start "rule__Entity__Group_5__3__Impl"
    // InternalDomain.g:1140:1: rule__Entity__Group_5__3__Impl : ( ( rule__Entity__Group_5_3__0 )* ) ;
    public final void rule__Entity__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1144:1: ( ( ( rule__Entity__Group_5_3__0 )* ) )
            // InternalDomain.g:1145:1: ( ( rule__Entity__Group_5_3__0 )* )
            {
            // InternalDomain.g:1145:1: ( ( rule__Entity__Group_5_3__0 )* )
            // InternalDomain.g:1146:2: ( rule__Entity__Group_5_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_5_3()); 
            // InternalDomain.g:1147:2: ( rule__Entity__Group_5_3__0 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDomain.g:1147:3: rule__Entity__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_5_3()); 

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
    // $ANTLR end "rule__Entity__Group_5__3__Impl"


    // $ANTLR start "rule__Entity__Group_5__4"
    // InternalDomain.g:1155:1: rule__Entity__Group_5__4 : rule__Entity__Group_5__4__Impl ;
    public final void rule__Entity__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1159:1: ( rule__Entity__Group_5__4__Impl )
            // InternalDomain.g:1160:2: rule__Entity__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_5__4"


    // $ANTLR start "rule__Entity__Group_5__4__Impl"
    // InternalDomain.g:1166:1: rule__Entity__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1170:1: ( ( '}' ) )
            // InternalDomain.g:1171:1: ( '}' )
            {
            // InternalDomain.g:1171:1: ( '}' )
            // InternalDomain.g:1172:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4()); 

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
    // $ANTLR end "rule__Entity__Group_5__4__Impl"


    // $ANTLR start "rule__Entity__Group_5_3__0"
    // InternalDomain.g:1182:1: rule__Entity__Group_5_3__0 : rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 ;
    public final void rule__Entity__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1186:1: ( rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1 )
            // InternalDomain.g:1187:2: rule__Entity__Group_5_3__0__Impl rule__Entity__Group_5_3__1
            {
            pushFollow(FOLLOW_12);
            rule__Entity__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_3__1();

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
    // $ANTLR end "rule__Entity__Group_5_3__0"


    // $ANTLR start "rule__Entity__Group_5_3__0__Impl"
    // InternalDomain.g:1194:1: rule__Entity__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1198:1: ( ( ',' ) )
            // InternalDomain.g:1199:1: ( ',' )
            {
            // InternalDomain.g:1199:1: ( ',' )
            // InternalDomain.g:1200:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_5_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_5_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_5_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_5_3__1"
    // InternalDomain.g:1209:1: rule__Entity__Group_5_3__1 : rule__Entity__Group_5_3__1__Impl ;
    public final void rule__Entity__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1213:1: ( rule__Entity__Group_5_3__1__Impl )
            // InternalDomain.g:1214:2: rule__Entity__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_5_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_5_3__1"


    // $ANTLR start "rule__Entity__Group_5_3__1__Impl"
    // InternalDomain.g:1220:1: rule__Entity__Group_5_3__1__Impl : ( ( rule__Entity__SubentitiesAssignment_5_3_1 ) ) ;
    public final void rule__Entity__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1224:1: ( ( ( rule__Entity__SubentitiesAssignment_5_3_1 ) ) )
            // InternalDomain.g:1225:1: ( ( rule__Entity__SubentitiesAssignment_5_3_1 ) )
            {
            // InternalDomain.g:1225:1: ( ( rule__Entity__SubentitiesAssignment_5_3_1 ) )
            // InternalDomain.g:1226:2: ( rule__Entity__SubentitiesAssignment_5_3_1 )
            {
             before(grammarAccess.getEntityAccess().getSubentitiesAssignment_5_3_1()); 
            // InternalDomain.g:1227:2: ( rule__Entity__SubentitiesAssignment_5_3_1 )
            // InternalDomain.g:1227:3: rule__Entity__SubentitiesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__SubentitiesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getSubentitiesAssignment_5_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_5_3__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__0"
    // InternalDomain.g:1236:1: rule__Entity__Group_6__0 : rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 ;
    public final void rule__Entity__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1240:1: ( rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1 )
            // InternalDomain.g:1241:2: rule__Entity__Group_6__0__Impl rule__Entity__Group_6__1
            {
            pushFollow(FOLLOW_5);
            rule__Entity__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__1();

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
    // $ANTLR end "rule__Entity__Group_6__0"


    // $ANTLR start "rule__Entity__Group_6__0__Impl"
    // InternalDomain.g:1248:1: rule__Entity__Group_6__0__Impl : ( 'references' ) ;
    public final void rule__Entity__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1252:1: ( ( 'references' ) )
            // InternalDomain.g:1253:1: ( 'references' )
            {
            // InternalDomain.g:1253:1: ( 'references' )
            // InternalDomain.g:1254:2: 'references'
            {
             before(grammarAccess.getEntityAccess().getReferencesKeyword_6_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getReferencesKeyword_6_0()); 

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
    // $ANTLR end "rule__Entity__Group_6__0__Impl"


    // $ANTLR start "rule__Entity__Group_6__1"
    // InternalDomain.g:1263:1: rule__Entity__Group_6__1 : rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 ;
    public final void rule__Entity__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1267:1: ( rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2 )
            // InternalDomain.g:1268:2: rule__Entity__Group_6__1__Impl rule__Entity__Group_6__2
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__2();

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
    // $ANTLR end "rule__Entity__Group_6__1"


    // $ANTLR start "rule__Entity__Group_6__1__Impl"
    // InternalDomain.g:1275:1: rule__Entity__Group_6__1__Impl : ( '{' ) ;
    public final void rule__Entity__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1279:1: ( ( '{' ) )
            // InternalDomain.g:1280:1: ( '{' )
            {
            // InternalDomain.g:1280:1: ( '{' )
            // InternalDomain.g:1281:2: '{'
            {
             before(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1()); 

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
    // $ANTLR end "rule__Entity__Group_6__1__Impl"


    // $ANTLR start "rule__Entity__Group_6__2"
    // InternalDomain.g:1290:1: rule__Entity__Group_6__2 : rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3 ;
    public final void rule__Entity__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1294:1: ( rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3 )
            // InternalDomain.g:1295:2: rule__Entity__Group_6__2__Impl rule__Entity__Group_6__3
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__3();

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
    // $ANTLR end "rule__Entity__Group_6__2"


    // $ANTLR start "rule__Entity__Group_6__2__Impl"
    // InternalDomain.g:1302:1: rule__Entity__Group_6__2__Impl : ( ( rule__Entity__ReferencesAssignment_6_2 ) ) ;
    public final void rule__Entity__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1306:1: ( ( ( rule__Entity__ReferencesAssignment_6_2 ) ) )
            // InternalDomain.g:1307:1: ( ( rule__Entity__ReferencesAssignment_6_2 ) )
            {
            // InternalDomain.g:1307:1: ( ( rule__Entity__ReferencesAssignment_6_2 ) )
            // InternalDomain.g:1308:2: ( rule__Entity__ReferencesAssignment_6_2 )
            {
             before(grammarAccess.getEntityAccess().getReferencesAssignment_6_2()); 
            // InternalDomain.g:1309:2: ( rule__Entity__ReferencesAssignment_6_2 )
            // InternalDomain.g:1309:3: rule__Entity__ReferencesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ReferencesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getReferencesAssignment_6_2()); 

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
    // $ANTLR end "rule__Entity__Group_6__2__Impl"


    // $ANTLR start "rule__Entity__Group_6__3"
    // InternalDomain.g:1317:1: rule__Entity__Group_6__3 : rule__Entity__Group_6__3__Impl rule__Entity__Group_6__4 ;
    public final void rule__Entity__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1321:1: ( rule__Entity__Group_6__3__Impl rule__Entity__Group_6__4 )
            // InternalDomain.g:1322:2: rule__Entity__Group_6__3__Impl rule__Entity__Group_6__4
            {
            pushFollow(FOLLOW_8);
            rule__Entity__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__4();

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
    // $ANTLR end "rule__Entity__Group_6__3"


    // $ANTLR start "rule__Entity__Group_6__3__Impl"
    // InternalDomain.g:1329:1: rule__Entity__Group_6__3__Impl : ( ( rule__Entity__Group_6_3__0 )* ) ;
    public final void rule__Entity__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1333:1: ( ( ( rule__Entity__Group_6_3__0 )* ) )
            // InternalDomain.g:1334:1: ( ( rule__Entity__Group_6_3__0 )* )
            {
            // InternalDomain.g:1334:1: ( ( rule__Entity__Group_6_3__0 )* )
            // InternalDomain.g:1335:2: ( rule__Entity__Group_6_3__0 )*
            {
             before(grammarAccess.getEntityAccess().getGroup_6_3()); 
            // InternalDomain.g:1336:2: ( rule__Entity__Group_6_3__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==18) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalDomain.g:1336:3: rule__Entity__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Entity__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getEntityAccess().getGroup_6_3()); 

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
    // $ANTLR end "rule__Entity__Group_6__3__Impl"


    // $ANTLR start "rule__Entity__Group_6__4"
    // InternalDomain.g:1344:1: rule__Entity__Group_6__4 : rule__Entity__Group_6__4__Impl ;
    public final void rule__Entity__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1348:1: ( rule__Entity__Group_6__4__Impl )
            // InternalDomain.g:1349:2: rule__Entity__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_6__4__Impl();

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
    // $ANTLR end "rule__Entity__Group_6__4"


    // $ANTLR start "rule__Entity__Group_6__4__Impl"
    // InternalDomain.g:1355:1: rule__Entity__Group_6__4__Impl : ( '}' ) ;
    public final void rule__Entity__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1359:1: ( ( '}' ) )
            // InternalDomain.g:1360:1: ( '}' )
            {
            // InternalDomain.g:1360:1: ( '}' )
            // InternalDomain.g:1361:2: '}'
            {
             before(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_4()); 

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
    // $ANTLR end "rule__Entity__Group_6__4__Impl"


    // $ANTLR start "rule__Entity__Group_6_3__0"
    // InternalDomain.g:1371:1: rule__Entity__Group_6_3__0 : rule__Entity__Group_6_3__0__Impl rule__Entity__Group_6_3__1 ;
    public final void rule__Entity__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1375:1: ( rule__Entity__Group_6_3__0__Impl rule__Entity__Group_6_3__1 )
            // InternalDomain.g:1376:2: rule__Entity__Group_6_3__0__Impl rule__Entity__Group_6_3__1
            {
            pushFollow(FOLLOW_13);
            rule__Entity__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group_6_3__1();

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
    // $ANTLR end "rule__Entity__Group_6_3__0"


    // $ANTLR start "rule__Entity__Group_6_3__0__Impl"
    // InternalDomain.g:1383:1: rule__Entity__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__Entity__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1387:1: ( ( ',' ) )
            // InternalDomain.g:1388:1: ( ',' )
            {
            // InternalDomain.g:1388:1: ( ',' )
            // InternalDomain.g:1389:2: ','
            {
             before(grammarAccess.getEntityAccess().getCommaKeyword_6_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getCommaKeyword_6_3_0()); 

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
    // $ANTLR end "rule__Entity__Group_6_3__0__Impl"


    // $ANTLR start "rule__Entity__Group_6_3__1"
    // InternalDomain.g:1398:1: rule__Entity__Group_6_3__1 : rule__Entity__Group_6_3__1__Impl ;
    public final void rule__Entity__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1402:1: ( rule__Entity__Group_6_3__1__Impl )
            // InternalDomain.g:1403:2: rule__Entity__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group_6_3__1__Impl();

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
    // $ANTLR end "rule__Entity__Group_6_3__1"


    // $ANTLR start "rule__Entity__Group_6_3__1__Impl"
    // InternalDomain.g:1409:1: rule__Entity__Group_6_3__1__Impl : ( ( rule__Entity__ReferencesAssignment_6_3_1 ) ) ;
    public final void rule__Entity__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1413:1: ( ( ( rule__Entity__ReferencesAssignment_6_3_1 ) ) )
            // InternalDomain.g:1414:1: ( ( rule__Entity__ReferencesAssignment_6_3_1 ) )
            {
            // InternalDomain.g:1414:1: ( ( rule__Entity__ReferencesAssignment_6_3_1 ) )
            // InternalDomain.g:1415:2: ( rule__Entity__ReferencesAssignment_6_3_1 )
            {
             before(grammarAccess.getEntityAccess().getReferencesAssignment_6_3_1()); 
            // InternalDomain.g:1416:2: ( rule__Entity__ReferencesAssignment_6_3_1 )
            // InternalDomain.g:1416:3: rule__Entity__ReferencesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__ReferencesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getReferencesAssignment_6_3_1()); 

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
    // $ANTLR end "rule__Entity__Group_6_3__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalDomain.g:1425:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1429:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalDomain.g:1430:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalDomain.g:1437:1: rule__Field__Group__0__Impl : ( () ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1441:1: ( ( () ) )
            // InternalDomain.g:1442:1: ( () )
            {
            // InternalDomain.g:1442:1: ( () )
            // InternalDomain.g:1443:2: ()
            {
             before(grammarAccess.getFieldAccess().getFieldAction_0()); 
            // InternalDomain.g:1444:2: ()
            // InternalDomain.g:1444:3: 
            {
            }

             after(grammarAccess.getFieldAccess().getFieldAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalDomain.g:1452:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1456:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalDomain.g:1457:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalDomain.g:1464:1: rule__Field__Group__1__Impl : ( 'Field' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1468:1: ( ( 'Field' ) )
            // InternalDomain.g:1469:1: ( 'Field' )
            {
            // InternalDomain.g:1469:1: ( 'Field' )
            // InternalDomain.g:1470:2: 'Field'
            {
             before(grammarAccess.getFieldAccess().getFieldKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFieldKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalDomain.g:1479:1: rule__Field__Group__2 : rule__Field__Group__2__Impl rule__Field__Group__3 ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1483:1: ( rule__Field__Group__2__Impl rule__Field__Group__3 )
            // InternalDomain.g:1484:2: rule__Field__Group__2__Impl rule__Field__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Field__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__3();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalDomain.g:1491:1: rule__Field__Group__2__Impl : ( ( rule__Field__NameAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1495:1: ( ( ( rule__Field__NameAssignment_2 ) ) )
            // InternalDomain.g:1496:1: ( ( rule__Field__NameAssignment_2 ) )
            {
            // InternalDomain.g:1496:1: ( ( rule__Field__NameAssignment_2 ) )
            // InternalDomain.g:1497:2: ( rule__Field__NameAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_2()); 
            // InternalDomain.g:1498:2: ( rule__Field__NameAssignment_2 )
            // InternalDomain.g:1498:3: rule__Field__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__Field__Group__3"
    // InternalDomain.g:1506:1: rule__Field__Group__3 : rule__Field__Group__3__Impl rule__Field__Group__4 ;
    public final void rule__Field__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1510:1: ( rule__Field__Group__3__Impl rule__Field__Group__4 )
            // InternalDomain.g:1511:2: rule__Field__Group__3__Impl rule__Field__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Field__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__4();

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
    // $ANTLR end "rule__Field__Group__3"


    // $ANTLR start "rule__Field__Group__3__Impl"
    // InternalDomain.g:1518:1: rule__Field__Group__3__Impl : ( '{' ) ;
    public final void rule__Field__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1522:1: ( ( '{' ) )
            // InternalDomain.g:1523:1: ( '{' )
            {
            // InternalDomain.g:1523:1: ( '{' )
            // InternalDomain.g:1524:2: '{'
            {
             before(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Field__Group__3__Impl"


    // $ANTLR start "rule__Field__Group__4"
    // InternalDomain.g:1533:1: rule__Field__Group__4 : rule__Field__Group__4__Impl rule__Field__Group__5 ;
    public final void rule__Field__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1537:1: ( rule__Field__Group__4__Impl rule__Field__Group__5 )
            // InternalDomain.g:1538:2: rule__Field__Group__4__Impl rule__Field__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__Field__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__5();

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
    // $ANTLR end "rule__Field__Group__4"


    // $ANTLR start "rule__Field__Group__4__Impl"
    // InternalDomain.g:1545:1: rule__Field__Group__4__Impl : ( ( rule__Field__Group_4__0 )? ) ;
    public final void rule__Field__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1549:1: ( ( ( rule__Field__Group_4__0 )? ) )
            // InternalDomain.g:1550:1: ( ( rule__Field__Group_4__0 )? )
            {
            // InternalDomain.g:1550:1: ( ( rule__Field__Group_4__0 )? )
            // InternalDomain.g:1551:2: ( rule__Field__Group_4__0 )?
            {
             before(grammarAccess.getFieldAccess().getGroup_4()); 
            // InternalDomain.g:1552:2: ( rule__Field__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==24) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomain.g:1552:3: rule__Field__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Field__Group__4__Impl"


    // $ANTLR start "rule__Field__Group__5"
    // InternalDomain.g:1560:1: rule__Field__Group__5 : rule__Field__Group__5__Impl ;
    public final void rule__Field__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1564:1: ( rule__Field__Group__5__Impl )
            // InternalDomain.g:1565:2: rule__Field__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__5__Impl();

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
    // $ANTLR end "rule__Field__Group__5"


    // $ANTLR start "rule__Field__Group__5__Impl"
    // InternalDomain.g:1571:1: rule__Field__Group__5__Impl : ( '}' ) ;
    public final void rule__Field__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1575:1: ( ( '}' ) )
            // InternalDomain.g:1576:1: ( '}' )
            {
            // InternalDomain.g:1576:1: ( '}' )
            // InternalDomain.g:1577:2: '}'
            {
             before(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Field__Group__5__Impl"


    // $ANTLR start "rule__Field__Group_4__0"
    // InternalDomain.g:1587:1: rule__Field__Group_4__0 : rule__Field__Group_4__0__Impl rule__Field__Group_4__1 ;
    public final void rule__Field__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1591:1: ( rule__Field__Group_4__0__Impl rule__Field__Group_4__1 )
            // InternalDomain.g:1592:2: rule__Field__Group_4__0__Impl rule__Field__Group_4__1
            {
            pushFollow(FOLLOW_15);
            rule__Field__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_4__1();

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
    // $ANTLR end "rule__Field__Group_4__0"


    // $ANTLR start "rule__Field__Group_4__0__Impl"
    // InternalDomain.g:1599:1: rule__Field__Group_4__0__Impl : ( 'type' ) ;
    public final void rule__Field__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1603:1: ( ( 'type' ) )
            // InternalDomain.g:1604:1: ( 'type' )
            {
            // InternalDomain.g:1604:1: ( 'type' )
            // InternalDomain.g:1605:2: 'type'
            {
             before(grammarAccess.getFieldAccess().getTypeKeyword_4_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getTypeKeyword_4_0()); 

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
    // $ANTLR end "rule__Field__Group_4__0__Impl"


    // $ANTLR start "rule__Field__Group_4__1"
    // InternalDomain.g:1614:1: rule__Field__Group_4__1 : rule__Field__Group_4__1__Impl ;
    public final void rule__Field__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1618:1: ( rule__Field__Group_4__1__Impl )
            // InternalDomain.g:1619:2: rule__Field__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_4__1__Impl();

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
    // $ANTLR end "rule__Field__Group_4__1"


    // $ANTLR start "rule__Field__Group_4__1__Impl"
    // InternalDomain.g:1625:1: rule__Field__Group_4__1__Impl : ( ( rule__Field__TypeAssignment_4_1 ) ) ;
    public final void rule__Field__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1629:1: ( ( ( rule__Field__TypeAssignment_4_1 ) ) )
            // InternalDomain.g:1630:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            {
            // InternalDomain.g:1630:1: ( ( rule__Field__TypeAssignment_4_1 ) )
            // InternalDomain.g:1631:2: ( rule__Field__TypeAssignment_4_1 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_4_1()); 
            // InternalDomain.g:1632:2: ( rule__Field__TypeAssignment_4_1 )
            // InternalDomain.g:1632:3: rule__Field__TypeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_4_1()); 

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
    // $ANTLR end "rule__Field__Group_4__1__Impl"


    // $ANTLR start "rule__SubEntity__Group__0"
    // InternalDomain.g:1641:1: rule__SubEntity__Group__0 : rule__SubEntity__Group__0__Impl rule__SubEntity__Group__1 ;
    public final void rule__SubEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1645:1: ( rule__SubEntity__Group__0__Impl rule__SubEntity__Group__1 )
            // InternalDomain.g:1646:2: rule__SubEntity__Group__0__Impl rule__SubEntity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SubEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__1();

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
    // $ANTLR end "rule__SubEntity__Group__0"


    // $ANTLR start "rule__SubEntity__Group__0__Impl"
    // InternalDomain.g:1653:1: rule__SubEntity__Group__0__Impl : ( () ) ;
    public final void rule__SubEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1657:1: ( ( () ) )
            // InternalDomain.g:1658:1: ( () )
            {
            // InternalDomain.g:1658:1: ( () )
            // InternalDomain.g:1659:2: ()
            {
             before(grammarAccess.getSubEntityAccess().getSubEntityAction_0()); 
            // InternalDomain.g:1660:2: ()
            // InternalDomain.g:1660:3: 
            {
            }

             after(grammarAccess.getSubEntityAccess().getSubEntityAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubEntity__Group__0__Impl"


    // $ANTLR start "rule__SubEntity__Group__1"
    // InternalDomain.g:1668:1: rule__SubEntity__Group__1 : rule__SubEntity__Group__1__Impl rule__SubEntity__Group__2 ;
    public final void rule__SubEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1672:1: ( rule__SubEntity__Group__1__Impl rule__SubEntity__Group__2 )
            // InternalDomain.g:1673:2: rule__SubEntity__Group__1__Impl rule__SubEntity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SubEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__2();

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
    // $ANTLR end "rule__SubEntity__Group__1"


    // $ANTLR start "rule__SubEntity__Group__1__Impl"
    // InternalDomain.g:1680:1: rule__SubEntity__Group__1__Impl : ( 'SubEntity' ) ;
    public final void rule__SubEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1684:1: ( ( 'SubEntity' ) )
            // InternalDomain.g:1685:1: ( 'SubEntity' )
            {
            // InternalDomain.g:1685:1: ( 'SubEntity' )
            // InternalDomain.g:1686:2: 'SubEntity'
            {
             before(grammarAccess.getSubEntityAccess().getSubEntityKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSubEntityAccess().getSubEntityKeyword_1()); 

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
    // $ANTLR end "rule__SubEntity__Group__1__Impl"


    // $ANTLR start "rule__SubEntity__Group__2"
    // InternalDomain.g:1695:1: rule__SubEntity__Group__2 : rule__SubEntity__Group__2__Impl rule__SubEntity__Group__3 ;
    public final void rule__SubEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1699:1: ( rule__SubEntity__Group__2__Impl rule__SubEntity__Group__3 )
            // InternalDomain.g:1700:2: rule__SubEntity__Group__2__Impl rule__SubEntity__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SubEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__3();

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
    // $ANTLR end "rule__SubEntity__Group__2"


    // $ANTLR start "rule__SubEntity__Group__2__Impl"
    // InternalDomain.g:1707:1: rule__SubEntity__Group__2__Impl : ( ( rule__SubEntity__NameAssignment_2 ) ) ;
    public final void rule__SubEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1711:1: ( ( ( rule__SubEntity__NameAssignment_2 ) ) )
            // InternalDomain.g:1712:1: ( ( rule__SubEntity__NameAssignment_2 ) )
            {
            // InternalDomain.g:1712:1: ( ( rule__SubEntity__NameAssignment_2 ) )
            // InternalDomain.g:1713:2: ( rule__SubEntity__NameAssignment_2 )
            {
             before(grammarAccess.getSubEntityAccess().getNameAssignment_2()); 
            // InternalDomain.g:1714:2: ( rule__SubEntity__NameAssignment_2 )
            // InternalDomain.g:1714:3: rule__SubEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SubEntity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSubEntityAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__SubEntity__Group__2__Impl"


    // $ANTLR start "rule__SubEntity__Group__3"
    // InternalDomain.g:1722:1: rule__SubEntity__Group__3 : rule__SubEntity__Group__3__Impl rule__SubEntity__Group__4 ;
    public final void rule__SubEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1726:1: ( rule__SubEntity__Group__3__Impl rule__SubEntity__Group__4 )
            // InternalDomain.g:1727:2: rule__SubEntity__Group__3__Impl rule__SubEntity__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__SubEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__4();

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
    // $ANTLR end "rule__SubEntity__Group__3"


    // $ANTLR start "rule__SubEntity__Group__3__Impl"
    // InternalDomain.g:1734:1: rule__SubEntity__Group__3__Impl : ( '{' ) ;
    public final void rule__SubEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1738:1: ( ( '{' ) )
            // InternalDomain.g:1739:1: ( '{' )
            {
            // InternalDomain.g:1739:1: ( '{' )
            // InternalDomain.g:1740:2: '{'
            {
             before(grammarAccess.getSubEntityAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubEntityAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__SubEntity__Group__3__Impl"


    // $ANTLR start "rule__SubEntity__Group__4"
    // InternalDomain.g:1749:1: rule__SubEntity__Group__4 : rule__SubEntity__Group__4__Impl rule__SubEntity__Group__5 ;
    public final void rule__SubEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1753:1: ( rule__SubEntity__Group__4__Impl rule__SubEntity__Group__5 )
            // InternalDomain.g:1754:2: rule__SubEntity__Group__4__Impl rule__SubEntity__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__SubEntity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__5();

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
    // $ANTLR end "rule__SubEntity__Group__4"


    // $ANTLR start "rule__SubEntity__Group__4__Impl"
    // InternalDomain.g:1761:1: rule__SubEntity__Group__4__Impl : ( ( rule__SubEntity__Group_4__0 )? ) ;
    public final void rule__SubEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1765:1: ( ( ( rule__SubEntity__Group_4__0 )? ) )
            // InternalDomain.g:1766:1: ( ( rule__SubEntity__Group_4__0 )? )
            {
            // InternalDomain.g:1766:1: ( ( rule__SubEntity__Group_4__0 )? )
            // InternalDomain.g:1767:2: ( rule__SubEntity__Group_4__0 )?
            {
             before(grammarAccess.getSubEntityAccess().getGroup_4()); 
            // InternalDomain.g:1768:2: ( rule__SubEntity__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomain.g:1768:3: rule__SubEntity__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubEntity__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubEntityAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SubEntity__Group__4__Impl"


    // $ANTLR start "rule__SubEntity__Group__5"
    // InternalDomain.g:1776:1: rule__SubEntity__Group__5 : rule__SubEntity__Group__5__Impl rule__SubEntity__Group__6 ;
    public final void rule__SubEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1780:1: ( rule__SubEntity__Group__5__Impl rule__SubEntity__Group__6 )
            // InternalDomain.g:1781:2: rule__SubEntity__Group__5__Impl rule__SubEntity__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__SubEntity__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__6();

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
    // $ANTLR end "rule__SubEntity__Group__5"


    // $ANTLR start "rule__SubEntity__Group__5__Impl"
    // InternalDomain.g:1788:1: rule__SubEntity__Group__5__Impl : ( ( rule__SubEntity__Group_5__0 )? ) ;
    public final void rule__SubEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1792:1: ( ( ( rule__SubEntity__Group_5__0 )? ) )
            // InternalDomain.g:1793:1: ( ( rule__SubEntity__Group_5__0 )? )
            {
            // InternalDomain.g:1793:1: ( ( rule__SubEntity__Group_5__0 )? )
            // InternalDomain.g:1794:2: ( rule__SubEntity__Group_5__0 )?
            {
             before(grammarAccess.getSubEntityAccess().getGroup_5()); 
            // InternalDomain.g:1795:2: ( rule__SubEntity__Group_5__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==27) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomain.g:1795:3: rule__SubEntity__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubEntity__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubEntityAccess().getGroup_5()); 

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
    // $ANTLR end "rule__SubEntity__Group__5__Impl"


    // $ANTLR start "rule__SubEntity__Group__6"
    // InternalDomain.g:1803:1: rule__SubEntity__Group__6 : rule__SubEntity__Group__6__Impl ;
    public final void rule__SubEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1807:1: ( rule__SubEntity__Group__6__Impl )
            // InternalDomain.g:1808:2: rule__SubEntity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubEntity__Group__6__Impl();

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
    // $ANTLR end "rule__SubEntity__Group__6"


    // $ANTLR start "rule__SubEntity__Group__6__Impl"
    // InternalDomain.g:1814:1: rule__SubEntity__Group__6__Impl : ( '}' ) ;
    public final void rule__SubEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1818:1: ( ( '}' ) )
            // InternalDomain.g:1819:1: ( '}' )
            {
            // InternalDomain.g:1819:1: ( '}' )
            // InternalDomain.g:1820:2: '}'
            {
             before(grammarAccess.getSubEntityAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubEntityAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__SubEntity__Group__6__Impl"


    // $ANTLR start "rule__SubEntity__Group_4__0"
    // InternalDomain.g:1830:1: rule__SubEntity__Group_4__0 : rule__SubEntity__Group_4__0__Impl rule__SubEntity__Group_4__1 ;
    public final void rule__SubEntity__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1834:1: ( rule__SubEntity__Group_4__0__Impl rule__SubEntity__Group_4__1 )
            // InternalDomain.g:1835:2: rule__SubEntity__Group_4__0__Impl rule__SubEntity__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__SubEntity__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group_4__1();

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
    // $ANTLR end "rule__SubEntity__Group_4__0"


    // $ANTLR start "rule__SubEntity__Group_4__0__Impl"
    // InternalDomain.g:1842:1: rule__SubEntity__Group_4__0__Impl : ( 'upperBound' ) ;
    public final void rule__SubEntity__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1846:1: ( ( 'upperBound' ) )
            // InternalDomain.g:1847:1: ( 'upperBound' )
            {
            // InternalDomain.g:1847:1: ( 'upperBound' )
            // InternalDomain.g:1848:2: 'upperBound'
            {
             before(grammarAccess.getSubEntityAccess().getUpperBoundKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSubEntityAccess().getUpperBoundKeyword_4_0()); 

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
    // $ANTLR end "rule__SubEntity__Group_4__0__Impl"


    // $ANTLR start "rule__SubEntity__Group_4__1"
    // InternalDomain.g:1857:1: rule__SubEntity__Group_4__1 : rule__SubEntity__Group_4__1__Impl ;
    public final void rule__SubEntity__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1861:1: ( rule__SubEntity__Group_4__1__Impl )
            // InternalDomain.g:1862:2: rule__SubEntity__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubEntity__Group_4__1__Impl();

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
    // $ANTLR end "rule__SubEntity__Group_4__1"


    // $ANTLR start "rule__SubEntity__Group_4__1__Impl"
    // InternalDomain.g:1868:1: rule__SubEntity__Group_4__1__Impl : ( ( rule__SubEntity__UpperBoundAssignment_4_1 ) ) ;
    public final void rule__SubEntity__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1872:1: ( ( ( rule__SubEntity__UpperBoundAssignment_4_1 ) ) )
            // InternalDomain.g:1873:1: ( ( rule__SubEntity__UpperBoundAssignment_4_1 ) )
            {
            // InternalDomain.g:1873:1: ( ( rule__SubEntity__UpperBoundAssignment_4_1 ) )
            // InternalDomain.g:1874:2: ( rule__SubEntity__UpperBoundAssignment_4_1 )
            {
             before(grammarAccess.getSubEntityAccess().getUpperBoundAssignment_4_1()); 
            // InternalDomain.g:1875:2: ( rule__SubEntity__UpperBoundAssignment_4_1 )
            // InternalDomain.g:1875:3: rule__SubEntity__UpperBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SubEntity__UpperBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSubEntityAccess().getUpperBoundAssignment_4_1()); 

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
    // $ANTLR end "rule__SubEntity__Group_4__1__Impl"


    // $ANTLR start "rule__SubEntity__Group_5__0"
    // InternalDomain.g:1884:1: rule__SubEntity__Group_5__0 : rule__SubEntity__Group_5__0__Impl rule__SubEntity__Group_5__1 ;
    public final void rule__SubEntity__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1888:1: ( rule__SubEntity__Group_5__0__Impl rule__SubEntity__Group_5__1 )
            // InternalDomain.g:1889:2: rule__SubEntity__Group_5__0__Impl rule__SubEntity__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__SubEntity__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubEntity__Group_5__1();

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
    // $ANTLR end "rule__SubEntity__Group_5__0"


    // $ANTLR start "rule__SubEntity__Group_5__0__Impl"
    // InternalDomain.g:1896:1: rule__SubEntity__Group_5__0__Impl : ( 'entity' ) ;
    public final void rule__SubEntity__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1900:1: ( ( 'entity' ) )
            // InternalDomain.g:1901:1: ( 'entity' )
            {
            // InternalDomain.g:1901:1: ( 'entity' )
            // InternalDomain.g:1902:2: 'entity'
            {
             before(grammarAccess.getSubEntityAccess().getEntityKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSubEntityAccess().getEntityKeyword_5_0()); 

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
    // $ANTLR end "rule__SubEntity__Group_5__0__Impl"


    // $ANTLR start "rule__SubEntity__Group_5__1"
    // InternalDomain.g:1911:1: rule__SubEntity__Group_5__1 : rule__SubEntity__Group_5__1__Impl ;
    public final void rule__SubEntity__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1915:1: ( rule__SubEntity__Group_5__1__Impl )
            // InternalDomain.g:1916:2: rule__SubEntity__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubEntity__Group_5__1__Impl();

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
    // $ANTLR end "rule__SubEntity__Group_5__1"


    // $ANTLR start "rule__SubEntity__Group_5__1__Impl"
    // InternalDomain.g:1922:1: rule__SubEntity__Group_5__1__Impl : ( ( rule__SubEntity__EntityAssignment_5_1 ) ) ;
    public final void rule__SubEntity__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1926:1: ( ( ( rule__SubEntity__EntityAssignment_5_1 ) ) )
            // InternalDomain.g:1927:1: ( ( rule__SubEntity__EntityAssignment_5_1 ) )
            {
            // InternalDomain.g:1927:1: ( ( rule__SubEntity__EntityAssignment_5_1 ) )
            // InternalDomain.g:1928:2: ( rule__SubEntity__EntityAssignment_5_1 )
            {
             before(grammarAccess.getSubEntityAccess().getEntityAssignment_5_1()); 
            // InternalDomain.g:1929:2: ( rule__SubEntity__EntityAssignment_5_1 )
            // InternalDomain.g:1929:3: rule__SubEntity__EntityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__SubEntity__EntityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSubEntityAccess().getEntityAssignment_5_1()); 

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
    // $ANTLR end "rule__SubEntity__Group_5__1__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalDomain.g:1938:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1942:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalDomain.g:1943:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalDomain.g:1950:1: rule__Reference__Group__0__Impl : ( () ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1954:1: ( ( () ) )
            // InternalDomain.g:1955:1: ( () )
            {
            // InternalDomain.g:1955:1: ( () )
            // InternalDomain.g:1956:2: ()
            {
             before(grammarAccess.getReferenceAccess().getReferenceAction_0()); 
            // InternalDomain.g:1957:2: ()
            // InternalDomain.g:1957:3: 
            {
            }

             after(grammarAccess.getReferenceAccess().getReferenceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalDomain.g:1965:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl rule__Reference__Group__2 ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1969:1: ( rule__Reference__Group__1__Impl rule__Reference__Group__2 )
            // InternalDomain.g:1970:2: rule__Reference__Group__1__Impl rule__Reference__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__2();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalDomain.g:1977:1: rule__Reference__Group__1__Impl : ( 'Reference' ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1981:1: ( ( 'Reference' ) )
            // InternalDomain.g:1982:1: ( 'Reference' )
            {
            // InternalDomain.g:1982:1: ( 'Reference' )
            // InternalDomain.g:1983:2: 'Reference'
            {
             before(grammarAccess.getReferenceAccess().getReferenceKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getReferenceKeyword_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Reference__Group__2"
    // InternalDomain.g:1992:1: rule__Reference__Group__2 : rule__Reference__Group__2__Impl rule__Reference__Group__3 ;
    public final void rule__Reference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:1996:1: ( rule__Reference__Group__2__Impl rule__Reference__Group__3 )
            // InternalDomain.g:1997:2: rule__Reference__Group__2__Impl rule__Reference__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Reference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__3();

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
    // $ANTLR end "rule__Reference__Group__2"


    // $ANTLR start "rule__Reference__Group__2__Impl"
    // InternalDomain.g:2004:1: rule__Reference__Group__2__Impl : ( ( rule__Reference__NameAssignment_2 ) ) ;
    public final void rule__Reference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2008:1: ( ( ( rule__Reference__NameAssignment_2 ) ) )
            // InternalDomain.g:2009:1: ( ( rule__Reference__NameAssignment_2 ) )
            {
            // InternalDomain.g:2009:1: ( ( rule__Reference__NameAssignment_2 ) )
            // InternalDomain.g:2010:2: ( rule__Reference__NameAssignment_2 )
            {
             before(grammarAccess.getReferenceAccess().getNameAssignment_2()); 
            // InternalDomain.g:2011:2: ( rule__Reference__NameAssignment_2 )
            // InternalDomain.g:2011:3: rule__Reference__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Reference__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Reference__Group__2__Impl"


    // $ANTLR start "rule__Reference__Group__3"
    // InternalDomain.g:2019:1: rule__Reference__Group__3 : rule__Reference__Group__3__Impl rule__Reference__Group__4 ;
    public final void rule__Reference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2023:1: ( rule__Reference__Group__3__Impl rule__Reference__Group__4 )
            // InternalDomain.g:2024:2: rule__Reference__Group__3__Impl rule__Reference__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Reference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__4();

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
    // $ANTLR end "rule__Reference__Group__3"


    // $ANTLR start "rule__Reference__Group__3__Impl"
    // InternalDomain.g:2031:1: rule__Reference__Group__3__Impl : ( '{' ) ;
    public final void rule__Reference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2035:1: ( ( '{' ) )
            // InternalDomain.g:2036:1: ( '{' )
            {
            // InternalDomain.g:2036:1: ( '{' )
            // InternalDomain.g:2037:2: '{'
            {
             before(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Reference__Group__3__Impl"


    // $ANTLR start "rule__Reference__Group__4"
    // InternalDomain.g:2046:1: rule__Reference__Group__4 : rule__Reference__Group__4__Impl rule__Reference__Group__5 ;
    public final void rule__Reference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2050:1: ( rule__Reference__Group__4__Impl rule__Reference__Group__5 )
            // InternalDomain.g:2051:2: rule__Reference__Group__4__Impl rule__Reference__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Reference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__5();

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
    // $ANTLR end "rule__Reference__Group__4"


    // $ANTLR start "rule__Reference__Group__4__Impl"
    // InternalDomain.g:2058:1: rule__Reference__Group__4__Impl : ( ( rule__Reference__Group_4__0 )? ) ;
    public final void rule__Reference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2062:1: ( ( ( rule__Reference__Group_4__0 )? ) )
            // InternalDomain.g:2063:1: ( ( rule__Reference__Group_4__0 )? )
            {
            // InternalDomain.g:2063:1: ( ( rule__Reference__Group_4__0 )? )
            // InternalDomain.g:2064:2: ( rule__Reference__Group_4__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_4()); 
            // InternalDomain.g:2065:2: ( rule__Reference__Group_4__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomain.g:2065:3: rule__Reference__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Reference__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__5"
    // InternalDomain.g:2073:1: rule__Reference__Group__5 : rule__Reference__Group__5__Impl rule__Reference__Group__6 ;
    public final void rule__Reference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2077:1: ( rule__Reference__Group__5__Impl rule__Reference__Group__6 )
            // InternalDomain.g:2078:2: rule__Reference__Group__5__Impl rule__Reference__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__Reference__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__6();

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
    // $ANTLR end "rule__Reference__Group__5"


    // $ANTLR start "rule__Reference__Group__5__Impl"
    // InternalDomain.g:2085:1: rule__Reference__Group__5__Impl : ( ( rule__Reference__Group_5__0 )? ) ;
    public final void rule__Reference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2089:1: ( ( ( rule__Reference__Group_5__0 )? ) )
            // InternalDomain.g:2090:1: ( ( rule__Reference__Group_5__0 )? )
            {
            // InternalDomain.g:2090:1: ( ( rule__Reference__Group_5__0 )? )
            // InternalDomain.g:2091:2: ( rule__Reference__Group_5__0 )?
            {
             before(grammarAccess.getReferenceAccess().getGroup_5()); 
            // InternalDomain.g:2092:2: ( rule__Reference__Group_5__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomain.g:2092:3: rule__Reference__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Reference__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getReferenceAccess().getGroup_5()); 

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
    // $ANTLR end "rule__Reference__Group__5__Impl"


    // $ANTLR start "rule__Reference__Group__6"
    // InternalDomain.g:2100:1: rule__Reference__Group__6 : rule__Reference__Group__6__Impl ;
    public final void rule__Reference__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2104:1: ( rule__Reference__Group__6__Impl )
            // InternalDomain.g:2105:2: rule__Reference__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__6__Impl();

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
    // $ANTLR end "rule__Reference__Group__6"


    // $ANTLR start "rule__Reference__Group__6__Impl"
    // InternalDomain.g:2111:1: rule__Reference__Group__6__Impl : ( '}' ) ;
    public final void rule__Reference__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2115:1: ( ( '}' ) )
            // InternalDomain.g:2116:1: ( '}' )
            {
            // InternalDomain.g:2116:1: ( '}' )
            // InternalDomain.g:2117:2: '}'
            {
             before(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_6()); 

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
    // $ANTLR end "rule__Reference__Group__6__Impl"


    // $ANTLR start "rule__Reference__Group_4__0"
    // InternalDomain.g:2127:1: rule__Reference__Group_4__0 : rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 ;
    public final void rule__Reference__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2131:1: ( rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1 )
            // InternalDomain.g:2132:2: rule__Reference__Group_4__0__Impl rule__Reference__Group_4__1
            {
            pushFollow(FOLLOW_17);
            rule__Reference__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1();

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
    // $ANTLR end "rule__Reference__Group_4__0"


    // $ANTLR start "rule__Reference__Group_4__0__Impl"
    // InternalDomain.g:2139:1: rule__Reference__Group_4__0__Impl : ( 'upperBound' ) ;
    public final void rule__Reference__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2143:1: ( ( 'upperBound' ) )
            // InternalDomain.g:2144:1: ( 'upperBound' )
            {
            // InternalDomain.g:2144:1: ( 'upperBound' )
            // InternalDomain.g:2145:2: 'upperBound'
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundKeyword_4_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getUpperBoundKeyword_4_0()); 

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
    // $ANTLR end "rule__Reference__Group_4__0__Impl"


    // $ANTLR start "rule__Reference__Group_4__1"
    // InternalDomain.g:2154:1: rule__Reference__Group_4__1 : rule__Reference__Group_4__1__Impl ;
    public final void rule__Reference__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2158:1: ( rule__Reference__Group_4__1__Impl )
            // InternalDomain.g:2159:2: rule__Reference__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_4__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_4__1"


    // $ANTLR start "rule__Reference__Group_4__1__Impl"
    // InternalDomain.g:2165:1: rule__Reference__Group_4__1__Impl : ( ( rule__Reference__UpperBoundAssignment_4_1 ) ) ;
    public final void rule__Reference__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2169:1: ( ( ( rule__Reference__UpperBoundAssignment_4_1 ) ) )
            // InternalDomain.g:2170:1: ( ( rule__Reference__UpperBoundAssignment_4_1 ) )
            {
            // InternalDomain.g:2170:1: ( ( rule__Reference__UpperBoundAssignment_4_1 ) )
            // InternalDomain.g:2171:2: ( rule__Reference__UpperBoundAssignment_4_1 )
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundAssignment_4_1()); 
            // InternalDomain.g:2172:2: ( rule__Reference__UpperBoundAssignment_4_1 )
            // InternalDomain.g:2172:3: rule__Reference__UpperBoundAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__UpperBoundAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getUpperBoundAssignment_4_1()); 

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
    // $ANTLR end "rule__Reference__Group_4__1__Impl"


    // $ANTLR start "rule__Reference__Group_5__0"
    // InternalDomain.g:2181:1: rule__Reference__Group_5__0 : rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 ;
    public final void rule__Reference__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2185:1: ( rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1 )
            // InternalDomain.g:2186:2: rule__Reference__Group_5__0__Impl rule__Reference__Group_5__1
            {
            pushFollow(FOLLOW_4);
            rule__Reference__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__1();

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
    // $ANTLR end "rule__Reference__Group_5__0"


    // $ANTLR start "rule__Reference__Group_5__0__Impl"
    // InternalDomain.g:2193:1: rule__Reference__Group_5__0__Impl : ( 'entity' ) ;
    public final void rule__Reference__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2197:1: ( ( 'entity' ) )
            // InternalDomain.g:2198:1: ( 'entity' )
            {
            // InternalDomain.g:2198:1: ( 'entity' )
            // InternalDomain.g:2199:2: 'entity'
            {
             before(grammarAccess.getReferenceAccess().getEntityKeyword_5_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getEntityKeyword_5_0()); 

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
    // $ANTLR end "rule__Reference__Group_5__0__Impl"


    // $ANTLR start "rule__Reference__Group_5__1"
    // InternalDomain.g:2208:1: rule__Reference__Group_5__1 : rule__Reference__Group_5__1__Impl ;
    public final void rule__Reference__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2212:1: ( rule__Reference__Group_5__1__Impl )
            // InternalDomain.g:2213:2: rule__Reference__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group_5__1__Impl();

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
    // $ANTLR end "rule__Reference__Group_5__1"


    // $ANTLR start "rule__Reference__Group_5__1__Impl"
    // InternalDomain.g:2219:1: rule__Reference__Group_5__1__Impl : ( ( rule__Reference__EntityAssignment_5_1 ) ) ;
    public final void rule__Reference__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2223:1: ( ( ( rule__Reference__EntityAssignment_5_1 ) ) )
            // InternalDomain.g:2224:1: ( ( rule__Reference__EntityAssignment_5_1 ) )
            {
            // InternalDomain.g:2224:1: ( ( rule__Reference__EntityAssignment_5_1 ) )
            // InternalDomain.g:2225:2: ( rule__Reference__EntityAssignment_5_1 )
            {
             before(grammarAccess.getReferenceAccess().getEntityAssignment_5_1()); 
            // InternalDomain.g:2226:2: ( rule__Reference__EntityAssignment_5_1 )
            // InternalDomain.g:2226:3: rule__Reference__EntityAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__EntityAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getEntityAssignment_5_1()); 

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
    // $ANTLR end "rule__Reference__Group_5__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalDomain.g:2235:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2239:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalDomain.g:2240:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalDomain.g:2247:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2251:1: ( ( ( '-' )? ) )
            // InternalDomain.g:2252:1: ( ( '-' )? )
            {
            // InternalDomain.g:2252:1: ( ( '-' )? )
            // InternalDomain.g:2253:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalDomain.g:2254:2: ( '-' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalDomain.g:2254:3: '-'
                    {
                    match(input,29,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalDomain.g:2262:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2266:1: ( rule__EInt__Group__1__Impl )
            // InternalDomain.g:2267:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalDomain.g:2273:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2277:1: ( ( RULE_INT ) )
            // InternalDomain.g:2278:1: ( RULE_INT )
            {
            // InternalDomain.g:2278:1: ( RULE_INT )
            // InternalDomain.g:2279:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__DomainModel__NameAssignment_2"
    // InternalDomain.g:2289:1: rule__DomainModel__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__DomainModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2293:1: ( ( ruleEString ) )
            // InternalDomain.g:2294:2: ( ruleEString )
            {
            // InternalDomain.g:2294:2: ( ruleEString )
            // InternalDomain.g:2295:3: ruleEString
            {
             before(grammarAccess.getDomainModelAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__DomainModel__NameAssignment_2"


    // $ANTLR start "rule__DomainModel__EntitiesAssignment_4_2"
    // InternalDomain.g:2304:1: rule__DomainModel__EntitiesAssignment_4_2 : ( ruleEntity ) ;
    public final void rule__DomainModel__EntitiesAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2308:1: ( ( ruleEntity ) )
            // InternalDomain.g:2309:2: ( ruleEntity )
            {
            // InternalDomain.g:2309:2: ( ruleEntity )
            // InternalDomain.g:2310:3: ruleEntity
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__DomainModel__EntitiesAssignment_4_2"


    // $ANTLR start "rule__DomainModel__EntitiesAssignment_4_3_1"
    // InternalDomain.g:2319:1: rule__DomainModel__EntitiesAssignment_4_3_1 : ( ruleEntity ) ;
    public final void rule__DomainModel__EntitiesAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2323:1: ( ( ruleEntity ) )
            // InternalDomain.g:2324:2: ( ruleEntity )
            {
            // InternalDomain.g:2324:2: ( ruleEntity )
            // InternalDomain.g:2325:3: ruleEntity
            {
             before(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__DomainModel__EntitiesAssignment_4_3_1"


    // $ANTLR start "rule__Entity__NameAssignment_2"
    // InternalDomain.g:2334:1: rule__Entity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Entity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2338:1: ( ( ruleEString ) )
            // InternalDomain.g:2339:2: ( ruleEString )
            {
            // InternalDomain.g:2339:2: ( ruleEString )
            // InternalDomain.g:2340:3: ruleEString
            {
             before(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_2"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_2"
    // InternalDomain.g:2349:1: rule__Entity__FieldsAssignment_4_2 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2353:1: ( ( ruleField ) )
            // InternalDomain.g:2354:2: ( ruleField )
            {
            // InternalDomain.g:2354:2: ( ruleField )
            // InternalDomain.g:2355:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0()); 

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
    // $ANTLR end "rule__Entity__FieldsAssignment_4_2"


    // $ANTLR start "rule__Entity__FieldsAssignment_4_3_1"
    // InternalDomain.g:2364:1: rule__Entity__FieldsAssignment_4_3_1 : ( ruleField ) ;
    public final void rule__Entity__FieldsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2368:1: ( ( ruleField ) )
            // InternalDomain.g:2369:2: ( ruleField )
            {
            // InternalDomain.g:2369:2: ( ruleField )
            // InternalDomain.g:2370:3: ruleField
            {
             before(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0()); 

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
    // $ANTLR end "rule__Entity__FieldsAssignment_4_3_1"


    // $ANTLR start "rule__Entity__SubentitiesAssignment_5_2"
    // InternalDomain.g:2379:1: rule__Entity__SubentitiesAssignment_5_2 : ( ruleSubEntity ) ;
    public final void rule__Entity__SubentitiesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2383:1: ( ( ruleSubEntity ) )
            // InternalDomain.g:2384:2: ( ruleSubEntity )
            {
            // InternalDomain.g:2384:2: ( ruleSubEntity )
            // InternalDomain.g:2385:3: ruleSubEntity
            {
             before(grammarAccess.getEntityAccess().getSubentitiesSubEntityParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubEntity();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSubentitiesSubEntityParserRuleCall_5_2_0()); 

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
    // $ANTLR end "rule__Entity__SubentitiesAssignment_5_2"


    // $ANTLR start "rule__Entity__SubentitiesAssignment_5_3_1"
    // InternalDomain.g:2394:1: rule__Entity__SubentitiesAssignment_5_3_1 : ( ruleSubEntity ) ;
    public final void rule__Entity__SubentitiesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2398:1: ( ( ruleSubEntity ) )
            // InternalDomain.g:2399:2: ( ruleSubEntity )
            {
            // InternalDomain.g:2399:2: ( ruleSubEntity )
            // InternalDomain.g:2400:3: ruleSubEntity
            {
             before(grammarAccess.getEntityAccess().getSubentitiesSubEntityParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSubEntity();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getSubentitiesSubEntityParserRuleCall_5_3_1_0()); 

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
    // $ANTLR end "rule__Entity__SubentitiesAssignment_5_3_1"


    // $ANTLR start "rule__Entity__ReferencesAssignment_6_2"
    // InternalDomain.g:2409:1: rule__Entity__ReferencesAssignment_6_2 : ( ruleReference ) ;
    public final void rule__Entity__ReferencesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2413:1: ( ( ruleReference ) )
            // InternalDomain.g:2414:2: ( ruleReference )
            {
            // InternalDomain.g:2414:2: ( ruleReference )
            // InternalDomain.g:2415:3: ruleReference
            {
             before(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_6_2_0()); 

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
    // $ANTLR end "rule__Entity__ReferencesAssignment_6_2"


    // $ANTLR start "rule__Entity__ReferencesAssignment_6_3_1"
    // InternalDomain.g:2424:1: rule__Entity__ReferencesAssignment_6_3_1 : ( ruleReference ) ;
    public final void rule__Entity__ReferencesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2428:1: ( ( ruleReference ) )
            // InternalDomain.g:2429:2: ( ruleReference )
            {
            // InternalDomain.g:2429:2: ( ruleReference )
            // InternalDomain.g:2430:3: ruleReference
            {
             before(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_6_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_6_3_1_0()); 

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
    // $ANTLR end "rule__Entity__ReferencesAssignment_6_3_1"


    // $ANTLR start "rule__Field__NameAssignment_2"
    // InternalDomain.g:2439:1: rule__Field__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Field__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2443:1: ( ( ruleEString ) )
            // InternalDomain.g:2444:2: ( ruleEString )
            {
            // InternalDomain.g:2444:2: ( ruleEString )
            // InternalDomain.g:2445:3: ruleEString
            {
             before(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_2"


    // $ANTLR start "rule__Field__TypeAssignment_4_1"
    // InternalDomain.g:2454:1: rule__Field__TypeAssignment_4_1 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2458:1: ( ( ruleFieldType ) )
            // InternalDomain.g:2459:2: ( ruleFieldType )
            {
            // InternalDomain.g:2459:2: ( ruleFieldType )
            // InternalDomain.g:2460:3: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_4_1"


    // $ANTLR start "rule__SubEntity__NameAssignment_2"
    // InternalDomain.g:2469:1: rule__SubEntity__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__SubEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2473:1: ( ( ruleEString ) )
            // InternalDomain.g:2474:2: ( ruleEString )
            {
            // InternalDomain.g:2474:2: ( ruleEString )
            // InternalDomain.g:2475:3: ruleEString
            {
             before(grammarAccess.getSubEntityAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubEntityAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__SubEntity__NameAssignment_2"


    // $ANTLR start "rule__SubEntity__UpperBoundAssignment_4_1"
    // InternalDomain.g:2484:1: rule__SubEntity__UpperBoundAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__SubEntity__UpperBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2488:1: ( ( ruleEInt ) )
            // InternalDomain.g:2489:2: ( ruleEInt )
            {
            // InternalDomain.g:2489:2: ( ruleEInt )
            // InternalDomain.g:2490:3: ruleEInt
            {
             before(grammarAccess.getSubEntityAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSubEntityAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__SubEntity__UpperBoundAssignment_4_1"


    // $ANTLR start "rule__SubEntity__EntityAssignment_5_1"
    // InternalDomain.g:2499:1: rule__SubEntity__EntityAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__SubEntity__EntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2503:1: ( ( ( ruleEString ) ) )
            // InternalDomain.g:2504:2: ( ( ruleEString ) )
            {
            // InternalDomain.g:2504:2: ( ( ruleEString ) )
            // InternalDomain.g:2505:3: ( ruleEString )
            {
             before(grammarAccess.getSubEntityAccess().getEntityEntityCrossReference_5_1_0()); 
            // InternalDomain.g:2506:3: ( ruleEString )
            // InternalDomain.g:2507:4: ruleEString
            {
             before(grammarAccess.getSubEntityAccess().getEntityEntityEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSubEntityAccess().getEntityEntityEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getSubEntityAccess().getEntityEntityCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__SubEntity__EntityAssignment_5_1"


    // $ANTLR start "rule__Reference__NameAssignment_2"
    // InternalDomain.g:2518:1: rule__Reference__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Reference__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2522:1: ( ( ruleEString ) )
            // InternalDomain.g:2523:2: ( ruleEString )
            {
            // InternalDomain.g:2523:2: ( ruleEString )
            // InternalDomain.g:2524:3: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Reference__NameAssignment_2"


    // $ANTLR start "rule__Reference__UpperBoundAssignment_4_1"
    // InternalDomain.g:2533:1: rule__Reference__UpperBoundAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__Reference__UpperBoundAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2537:1: ( ( ruleEInt ) )
            // InternalDomain.g:2538:2: ( ruleEInt )
            {
            // InternalDomain.g:2538:2: ( ruleEInt )
            // InternalDomain.g:2539:3: ruleEInt
            {
             before(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Reference__UpperBoundAssignment_4_1"


    // $ANTLR start "rule__Reference__EntityAssignment_5_1"
    // InternalDomain.g:2548:1: rule__Reference__EntityAssignment_5_1 : ( ( ruleEString ) ) ;
    public final void rule__Reference__EntityAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalDomain.g:2552:1: ( ( ( ruleEString ) ) )
            // InternalDomain.g:2553:2: ( ( ruleEString ) )
            {
            // InternalDomain.g:2553:2: ( ( ruleEString ) )
            // InternalDomain.g:2554:3: ( ruleEString )
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_5_1_0()); 
            // InternalDomain.g:2555:3: ( ruleEString )
            // InternalDomain.g:2556:4: ruleEString
            {
             before(grammarAccess.getReferenceAccess().getEntityEntityEStringParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getReferenceAccess().getEntityEntityEStringParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_5_1_0()); 

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
    // $ANTLR end "rule__Reference__EntityAssignment_5_1"

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
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000710000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000003800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000C010000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000020000040L});

}