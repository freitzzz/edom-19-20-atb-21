package pt.isep.edom.project.c3.dsl.domain.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.edom.project.c3.dsl.domain.services.DomainGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDomainParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DomainModel'", "'{'", "'entities'", "','", "'}'", "'Entity'", "'fields'", "'subentities'", "'references'", "'Field'", "'type'", "'SubEntity'", "'upperBound'", "'entity'", "'Reference'", "'-'", "'STRING'", "'INTEGER'", "'REAL'"
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

        public InternalDomainParser(TokenStream input, DomainGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DomainModel";
       	}

       	@Override
       	protected DomainGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDomainModel"
    // InternalDomain.g:65:1: entryRuleDomainModel returns [EObject current=null] : iv_ruleDomainModel= ruleDomainModel EOF ;
    public final EObject entryRuleDomainModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomainModel = null;


        try {
            // InternalDomain.g:65:52: (iv_ruleDomainModel= ruleDomainModel EOF )
            // InternalDomain.g:66:2: iv_ruleDomainModel= ruleDomainModel EOF
            {
             newCompositeNode(grammarAccess.getDomainModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainModel=ruleDomainModel();

            state._fsp--;

             current =iv_ruleDomainModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainModel"


    // $ANTLR start "ruleDomainModel"
    // InternalDomain.g:72:1: ruleDomainModel returns [EObject current=null] : ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleDomainModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_entities_6_0 = null;

        EObject lv_entities_8_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:78:2: ( ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDomain.g:79:2: ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDomain.g:79:2: ( () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDomain.g:80:3: () otherlv_1= 'DomainModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDomain.g:80:3: ()
            // InternalDomain.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDomainModelAccess().getDomainModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDomainModelAccess().getDomainModelKeyword_1());
            		
            // InternalDomain.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:92:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDomainModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDomainModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.domain.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:114:3: (otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDomain.g:115:4: otherlv_4= 'entities' otherlv_5= '{' ( (lv_entities_6_0= ruleEntity ) ) (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDomainModelAccess().getEntitiesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getDomainModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDomain.g:123:4: ( (lv_entities_6_0= ruleEntity ) )
                    // InternalDomain.g:124:5: (lv_entities_6_0= ruleEntity )
                    {
                    // InternalDomain.g:124:5: (lv_entities_6_0= ruleEntity )
                    // InternalDomain.g:125:6: lv_entities_6_0= ruleEntity
                    {

                    						newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_entities_6_0=ruleEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    						}
                    						add(
                    							current,
                    							"entities",
                    							lv_entities_6_0,
                    							"pt.isep.edom.project.c3.dsl.domain.Domain.Entity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:142:4: (otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDomain.g:143:5: otherlv_7= ',' ( (lv_entities_8_0= ruleEntity ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDomainModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDomain.g:147:5: ( (lv_entities_8_0= ruleEntity ) )
                    	    // InternalDomain.g:148:6: (lv_entities_8_0= ruleEntity )
                    	    {
                    	    // InternalDomain.g:148:6: (lv_entities_8_0= ruleEntity )
                    	    // InternalDomain.g:149:7: lv_entities_8_0= ruleEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getDomainModelAccess().getEntitiesEntityParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_entities_8_0=ruleEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDomainModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entities",
                    	    								lv_entities_8_0,
                    	    								"pt.isep.edom.project.c3.dsl.domain.Domain.Entity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_9, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDomainModelAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainModel"


    // $ANTLR start "entryRuleEString"
    // InternalDomain.g:180:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDomain.g:180:47: (iv_ruleEString= ruleEString EOF )
            // InternalDomain.g:181:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalDomain.g:187:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDomain.g:193:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDomain.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDomain.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalDomain.g:195:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDomain.g:203:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEntity"
    // InternalDomain.g:214:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalDomain.g:214:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalDomain.g:215:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalDomain.g:221:1: ruleEntity returns [EObject current=null] : ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'subentities' otherlv_11= '{' ( (lv_subentities_12_0= ruleSubEntity ) ) (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )* otherlv_15= '}' )? (otherlv_16= 'references' otherlv_17= '{' ( (lv_references_18_0= ruleReference ) ) (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_fields_6_0 = null;

        EObject lv_fields_8_0 = null;

        EObject lv_subentities_12_0 = null;

        EObject lv_subentities_14_0 = null;

        EObject lv_references_18_0 = null;

        EObject lv_references_20_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:227:2: ( ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'subentities' otherlv_11= '{' ( (lv_subentities_12_0= ruleSubEntity ) ) (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )* otherlv_15= '}' )? (otherlv_16= 'references' otherlv_17= '{' ( (lv_references_18_0= ruleReference ) ) (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalDomain.g:228:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'subentities' otherlv_11= '{' ( (lv_subentities_12_0= ruleSubEntity ) ) (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )* otherlv_15= '}' )? (otherlv_16= 'references' otherlv_17= '{' ( (lv_references_18_0= ruleReference ) ) (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalDomain.g:228:2: ( () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'subentities' otherlv_11= '{' ( (lv_subentities_12_0= ruleSubEntity ) ) (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )* otherlv_15= '}' )? (otherlv_16= 'references' otherlv_17= '{' ( (lv_references_18_0= ruleReference ) ) (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalDomain.g:229:3: () otherlv_1= 'Entity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )? (otherlv_10= 'subentities' otherlv_11= '{' ( (lv_subentities_12_0= ruleSubEntity ) ) (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )* otherlv_15= '}' )? (otherlv_16= 'references' otherlv_17= '{' ( (lv_references_18_0= ruleReference ) ) (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalDomain.g:229:3: ()
            // InternalDomain.g:230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEntityAccess().getEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getEntityAccess().getEntityKeyword_1());
            		
            // InternalDomain.g:240:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:241:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:241:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:242:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.domain.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:263:3: (otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalDomain.g:264:4: otherlv_4= 'fields' otherlv_5= '{' ( (lv_fields_6_0= ruleField ) ) (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getFieldsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDomain.g:272:4: ( (lv_fields_6_0= ruleField ) )
                    // InternalDomain.g:273:5: (lv_fields_6_0= ruleField )
                    {
                    // InternalDomain.g:273:5: (lv_fields_6_0= ruleField )
                    // InternalDomain.g:274:6: lv_fields_6_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_fields_6_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_6_0,
                    							"pt.isep.edom.project.c3.dsl.domain.Domain.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:291:4: (otherlv_7= ',' ( (lv_fields_8_0= ruleField ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalDomain.g:292:5: otherlv_7= ',' ( (lv_fields_8_0= ruleField ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDomain.g:296:5: ( (lv_fields_8_0= ruleField ) )
                    	    // InternalDomain.g:297:6: (lv_fields_8_0= ruleField )
                    	    {
                    	    // InternalDomain.g:297:6: (lv_fields_8_0= ruleField )
                    	    // InternalDomain.g:298:7: lv_fields_8_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getFieldsFieldParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_fields_8_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_8_0,
                    	    								"pt.isep.edom.project.c3.dsl.domain.Domain.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_11); 

                    				newLeafNode(otherlv_9, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalDomain.g:321:3: (otherlv_10= 'subentities' otherlv_11= '{' ( (lv_subentities_12_0= ruleSubEntity ) ) (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )* otherlv_15= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDomain.g:322:4: otherlv_10= 'subentities' otherlv_11= '{' ( (lv_subentities_12_0= ruleSubEntity ) ) (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getEntityAccess().getSubentitiesKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_12); 

                    				newLeafNode(otherlv_11, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDomain.g:330:4: ( (lv_subentities_12_0= ruleSubEntity ) )
                    // InternalDomain.g:331:5: (lv_subentities_12_0= ruleSubEntity )
                    {
                    // InternalDomain.g:331:5: (lv_subentities_12_0= ruleSubEntity )
                    // InternalDomain.g:332:6: lv_subentities_12_0= ruleSubEntity
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getSubentitiesSubEntityParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_subentities_12_0=ruleSubEntity();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"subentities",
                    							lv_subentities_12_0,
                    							"pt.isep.edom.project.c3.dsl.domain.Domain.SubEntity");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:349:4: (otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalDomain.g:350:5: otherlv_13= ',' ( (lv_subentities_14_0= ruleSubEntity ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_12); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getEntityAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDomain.g:354:5: ( (lv_subentities_14_0= ruleSubEntity ) )
                    	    // InternalDomain.g:355:6: (lv_subentities_14_0= ruleSubEntity )
                    	    {
                    	    // InternalDomain.g:355:6: (lv_subentities_14_0= ruleSubEntity )
                    	    // InternalDomain.g:356:7: lv_subentities_14_0= ruleSubEntity
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getSubentitiesSubEntityParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_subentities_14_0=ruleSubEntity();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subentities",
                    	    								lv_subentities_14_0,
                    	    								"pt.isep.edom.project.c3.dsl.domain.Domain.SubEntity");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_13); 

                    				newLeafNode(otherlv_15, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalDomain.g:379:3: (otherlv_16= 'references' otherlv_17= '{' ( (lv_references_18_0= ruleReference ) ) (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )* otherlv_21= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalDomain.g:380:4: otherlv_16= 'references' otherlv_17= '{' ( (lv_references_18_0= ruleReference ) ) (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,19,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getEntityAccess().getReferencesKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_17, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDomain.g:388:4: ( (lv_references_18_0= ruleReference ) )
                    // InternalDomain.g:389:5: (lv_references_18_0= ruleReference )
                    {
                    // InternalDomain.g:389:5: (lv_references_18_0= ruleReference )
                    // InternalDomain.g:390:6: lv_references_18_0= ruleReference
                    {

                    						newCompositeNode(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_references_18_0=ruleReference();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEntityRule());
                    						}
                    						add(
                    							current,
                    							"references",
                    							lv_references_18_0,
                    							"pt.isep.edom.project.c3.dsl.domain.Domain.Reference");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDomain.g:407:4: (otherlv_19= ',' ( (lv_references_20_0= ruleReference ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==14) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalDomain.g:408:5: otherlv_19= ',' ( (lv_references_20_0= ruleReference ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_14); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getEntityAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDomain.g:412:5: ( (lv_references_20_0= ruleReference ) )
                    	    // InternalDomain.g:413:6: (lv_references_20_0= ruleReference )
                    	    {
                    	    // InternalDomain.g:413:6: (lv_references_20_0= ruleReference )
                    	    // InternalDomain.g:414:7: lv_references_20_0= ruleReference
                    	    {

                    	    							newCompositeNode(grammarAccess.getEntityAccess().getReferencesReferenceParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_references_20_0=ruleReference();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEntityRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"references",
                    	    								lv_references_20_0,
                    	    								"pt.isep.edom.project.c3.dsl.domain.Domain.Reference");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_21, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleField"
    // InternalDomain.g:445:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalDomain.g:445:46: (iv_ruleField= ruleField EOF )
            // InternalDomain.g:446:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalDomain.g:452:1: ruleField returns [EObject current=null] : ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_5_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:458:2: ( ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' ) )
            // InternalDomain.g:459:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' )
            {
            // InternalDomain.g:459:2: ( () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}' )
            // InternalDomain.g:460:3: () otherlv_1= 'Field' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )? otherlv_6= '}'
            {
            // InternalDomain.g:460:3: ()
            // InternalDomain.g:461:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFieldAccess().getFieldAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getFieldKeyword_1());
            		
            // InternalDomain.g:471:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:472:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:472:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:473:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.domain.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getFieldAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:494:3: (otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDomain.g:495:4: otherlv_4= 'type' ( (lv_type_5_0= ruleFieldType ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_4, grammarAccess.getFieldAccess().getTypeKeyword_4_0());
                    			
                    // InternalDomain.g:499:4: ( (lv_type_5_0= ruleFieldType ) )
                    // InternalDomain.g:500:5: (lv_type_5_0= ruleFieldType )
                    {
                    // InternalDomain.g:500:5: (lv_type_5_0= ruleFieldType )
                    // InternalDomain.g:501:6: lv_type_5_0= ruleFieldType
                    {

                    						newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_type_5_0=ruleFieldType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFieldRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_5_0,
                    							"pt.isep.edom.project.c3.dsl.domain.Domain.FieldType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getFieldAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleSubEntity"
    // InternalDomain.g:527:1: entryRuleSubEntity returns [EObject current=null] : iv_ruleSubEntity= ruleSubEntity EOF ;
    public final EObject entryRuleSubEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubEntity = null;


        try {
            // InternalDomain.g:527:50: (iv_ruleSubEntity= ruleSubEntity EOF )
            // InternalDomain.g:528:2: iv_ruleSubEntity= ruleSubEntity EOF
            {
             newCompositeNode(grammarAccess.getSubEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubEntity=ruleSubEntity();

            state._fsp--;

             current =iv_ruleSubEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubEntity"


    // $ANTLR start "ruleSubEntity"
    // InternalDomain.g:534:1: ruleSubEntity returns [EObject current=null] : ( () otherlv_1= 'SubEntity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleSubEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_5_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:540:2: ( ( () otherlv_1= 'SubEntity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalDomain.g:541:2: ( () otherlv_1= 'SubEntity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalDomain.g:541:2: ( () otherlv_1= 'SubEntity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalDomain.g:542:3: () otherlv_1= 'SubEntity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalDomain.g:542:3: ()
            // InternalDomain.g:543:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubEntityAccess().getSubEntityAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSubEntityAccess().getSubEntityKeyword_1());
            		
            // InternalDomain.g:553:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:554:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:554:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:555:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getSubEntityAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubEntityRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.domain.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getSubEntityAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:576:3: (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDomain.g:577:4: otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubEntityAccess().getUpperBoundKeyword_4_0());
                    			
                    // InternalDomain.g:581:4: ( (lv_upperBound_5_0= ruleEInt ) )
                    // InternalDomain.g:582:5: (lv_upperBound_5_0= ruleEInt )
                    {
                    // InternalDomain.g:582:5: (lv_upperBound_5_0= ruleEInt )
                    // InternalDomain.g:583:6: lv_upperBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getSubEntityAccess().getUpperBoundEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_upperBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubEntityRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"pt.isep.edom.project.c3.dsl.domain.Domain.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomain.g:601:3: (otherlv_6= 'entity' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalDomain.g:602:4: otherlv_6= 'entity' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubEntityAccess().getEntityKeyword_5_0());
                    			
                    // InternalDomain.g:606:4: ( ( ruleEString ) )
                    // InternalDomain.g:607:5: ( ruleEString )
                    {
                    // InternalDomain.g:607:5: ( ruleEString )
                    // InternalDomain.g:608:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubEntityRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getSubEntityAccess().getEntityEntityCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getSubEntityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubEntity"


    // $ANTLR start "entryRuleReference"
    // InternalDomain.g:631:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalDomain.g:631:50: (iv_ruleReference= ruleReference EOF )
            // InternalDomain.g:632:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalDomain.g:638:1: ruleReference returns [EObject current=null] : ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_upperBound_5_0 = null;



        	enterRule();

        try {
            // InternalDomain.g:644:2: ( ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' ) )
            // InternalDomain.g:645:2: ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' )
            {
            // InternalDomain.g:645:2: ( () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}' )
            // InternalDomain.g:646:3: () otherlv_1= 'Reference' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )? (otherlv_6= 'entity' ( ( ruleEString ) ) )? otherlv_8= '}'
            {
            // InternalDomain.g:646:3: ()
            // InternalDomain.g:647:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReferenceAccess().getReferenceAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getReferenceKeyword_1());
            		
            // InternalDomain.g:657:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDomain.g:658:4: (lv_name_2_0= ruleEString )
            {
            // InternalDomain.g:658:4: (lv_name_2_0= ruleEString )
            // InternalDomain.g:659:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getReferenceAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getReferenceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c3.dsl.domain.Domain.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getReferenceAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDomain.g:680:3: (otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDomain.g:681:4: otherlv_4= 'upperBound' ( (lv_upperBound_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_4, grammarAccess.getReferenceAccess().getUpperBoundKeyword_4_0());
                    			
                    // InternalDomain.g:685:4: ( (lv_upperBound_5_0= ruleEInt ) )
                    // InternalDomain.g:686:5: (lv_upperBound_5_0= ruleEInt )
                    {
                    // InternalDomain.g:686:5: (lv_upperBound_5_0= ruleEInt )
                    // InternalDomain.g:687:6: lv_upperBound_5_0= ruleEInt
                    {

                    						newCompositeNode(grammarAccess.getReferenceAccess().getUpperBoundEIntParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_upperBound_5_0=ruleEInt();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getReferenceRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_5_0,
                    							"pt.isep.edom.project.c3.dsl.domain.Domain.EInt");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDomain.g:705:3: (otherlv_6= 'entity' ( ( ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalDomain.g:706:4: otherlv_6= 'entity' ( ( ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getReferenceAccess().getEntityKeyword_5_0());
                    			
                    // InternalDomain.g:710:4: ( ( ruleEString ) )
                    // InternalDomain.g:711:5: ( ruleEString )
                    {
                    // InternalDomain.g:711:5: ( ruleEString )
                    // InternalDomain.g:712:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getReferenceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getReferenceAccess().getEntityEntityCrossReference_5_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getReferenceAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReference"


    // $ANTLR start "entryRuleEInt"
    // InternalDomain.g:735:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalDomain.g:735:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalDomain.g:736:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalDomain.g:742:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalDomain.g:748:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalDomain.g:749:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalDomain.g:749:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalDomain.g:750:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalDomain.g:750:3: (kw= '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==26) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalDomain.g:751:4: kw= '-'
                    {
                    kw=(Token)match(input,26,FOLLOW_20); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_1);
            		

            			newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleFieldType"
    // InternalDomain.g:768:1: ruleFieldType returns [Enumerator current=null] : ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) ;
    public final Enumerator ruleFieldType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDomain.g:774:2: ( ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) )
            // InternalDomain.g:775:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            {
            // InternalDomain.g:775:2: ( (enumLiteral_0= 'STRING' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt16=1;
                }
                break;
            case 28:
                {
                alt16=2;
                }
                break;
            case 29:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalDomain.g:776:3: (enumLiteral_0= 'STRING' )
                    {
                    // InternalDomain.g:776:3: (enumLiteral_0= 'STRING' )
                    // InternalDomain.g:777:4: enumLiteral_0= 'STRING'
                    {
                    enumLiteral_0=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getFieldTypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDomain.g:784:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalDomain.g:784:3: (enumLiteral_1= 'INTEGER' )
                    // InternalDomain.g:785:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getFieldTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDomain.g:792:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalDomain.g:792:3: (enumLiteral_2= 'REAL' )
                    // InternalDomain.g:793:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getFieldTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000E8000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000000C8000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000208000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000038000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001008000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});

}