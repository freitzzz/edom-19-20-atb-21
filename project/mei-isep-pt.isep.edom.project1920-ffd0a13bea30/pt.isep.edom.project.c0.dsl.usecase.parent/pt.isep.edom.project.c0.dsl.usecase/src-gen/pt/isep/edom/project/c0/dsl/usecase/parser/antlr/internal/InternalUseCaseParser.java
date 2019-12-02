package pt.isep.edom.project.c0.dsl.usecase.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.edom.project.c0.dsl.usecase.services.UseCaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUseCaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'UseCaseModel'", "'{'", "'actor'", "','", "'}'", "'association'", "'usecase'", "'Actor'", "'Association'", "'UseCase'", "'extend'", "'include'", "'Extend'", "'Include'"
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
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalUseCaseParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalUseCaseParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalUseCaseParser.tokenNames; }
    public String getGrammarFileName() { return "InternalUseCase.g"; }



     	private UseCaseGrammarAccess grammarAccess;

        public InternalUseCaseParser(TokenStream input, UseCaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "UseCaseModel";
       	}

       	@Override
       	protected UseCaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleUseCaseModel"
    // InternalUseCase.g:64:1: entryRuleUseCaseModel returns [EObject current=null] : iv_ruleUseCaseModel= ruleUseCaseModel EOF ;
    public final EObject entryRuleUseCaseModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCaseModel = null;


        try {
            // InternalUseCase.g:64:53: (iv_ruleUseCaseModel= ruleUseCaseModel EOF )
            // InternalUseCase.g:65:2: iv_ruleUseCaseModel= ruleUseCaseModel EOF
            {
             newCompositeNode(grammarAccess.getUseCaseModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCaseModel=ruleUseCaseModel();

            state._fsp--;

             current =iv_ruleUseCaseModel; 
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
    // $ANTLR end "entryRuleUseCaseModel"


    // $ANTLR start "ruleUseCaseModel"
    // InternalUseCase.g:71:1: ruleUseCaseModel returns [EObject current=null] : ( () otherlv_1= 'UseCaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '{' ( (lv_actor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'association' otherlv_11= '{' ( (lv_association_12_0= ruleAssociation ) ) (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )* otherlv_15= '}' )? (otherlv_16= 'usecase' otherlv_17= '{' ( (lv_usecase_18_0= ruleUseCase ) ) (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleUseCaseModel() throws RecognitionException {
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

        EObject lv_actor_6_0 = null;

        EObject lv_actor_8_0 = null;

        EObject lv_association_12_0 = null;

        EObject lv_association_14_0 = null;

        EObject lv_usecase_18_0 = null;

        EObject lv_usecase_20_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:77:2: ( ( () otherlv_1= 'UseCaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '{' ( (lv_actor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'association' otherlv_11= '{' ( (lv_association_12_0= ruleAssociation ) ) (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )* otherlv_15= '}' )? (otherlv_16= 'usecase' otherlv_17= '{' ( (lv_usecase_18_0= ruleUseCase ) ) (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalUseCase.g:78:2: ( () otherlv_1= 'UseCaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '{' ( (lv_actor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'association' otherlv_11= '{' ( (lv_association_12_0= ruleAssociation ) ) (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )* otherlv_15= '}' )? (otherlv_16= 'usecase' otherlv_17= '{' ( (lv_usecase_18_0= ruleUseCase ) ) (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalUseCase.g:78:2: ( () otherlv_1= 'UseCaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '{' ( (lv_actor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'association' otherlv_11= '{' ( (lv_association_12_0= ruleAssociation ) ) (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )* otherlv_15= '}' )? (otherlv_16= 'usecase' otherlv_17= '{' ( (lv_usecase_18_0= ruleUseCase ) ) (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalUseCase.g:79:3: () otherlv_1= 'UseCaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'actor' otherlv_5= '{' ( (lv_actor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )* otherlv_9= '}' )? (otherlv_10= 'association' otherlv_11= '{' ( (lv_association_12_0= ruleAssociation ) ) (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )* otherlv_15= '}' )? (otherlv_16= 'usecase' otherlv_17= '{' ( (lv_usecase_18_0= ruleUseCase ) ) (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalUseCase.g:79:3: ()
            // InternalUseCase.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseCaseModelAccess().getUseCaseModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUseCaseModelAccess().getUseCaseModelKeyword_1());
            		
            // InternalUseCase.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUseCase.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalUseCase.g:91:4: (lv_name_2_0= ruleEString )
            // InternalUseCase.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUseCaseModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c0.dsl.usecase.UseCase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUseCase.g:113:3: (otherlv_4= 'actor' otherlv_5= '{' ( (lv_actor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalUseCase.g:114:4: otherlv_4= 'actor' otherlv_5= '{' ( (lv_actor_6_0= ruleActor ) ) (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseCaseModelAccess().getActorKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUseCase.g:122:4: ( (lv_actor_6_0= ruleActor ) )
                    // InternalUseCase.g:123:5: (lv_actor_6_0= ruleActor )
                    {
                    // InternalUseCase.g:123:5: (lv_actor_6_0= ruleActor )
                    // InternalUseCase.g:124:6: lv_actor_6_0= ruleActor
                    {

                    						newCompositeNode(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_actor_6_0=ruleActor();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
                    						}
                    						add(
                    							current,
                    							"actor",
                    							lv_actor_6_0,
                    							"pt.isep.edom.project.c0.dsl.usecase.UseCase.Actor");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUseCase.g:141:4: (otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalUseCase.g:142:5: otherlv_7= ',' ( (lv_actor_8_0= ruleActor ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUseCaseModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUseCase.g:146:5: ( (lv_actor_8_0= ruleActor ) )
                    	    // InternalUseCase.g:147:6: (lv_actor_8_0= ruleActor )
                    	    {
                    	    // InternalUseCase.g:147:6: (lv_actor_8_0= ruleActor )
                    	    // InternalUseCase.g:148:7: lv_actor_8_0= ruleActor
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseModelAccess().getActorActorParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_actor_8_0=ruleActor();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"actor",
                    	    								lv_actor_8_0,
                    	    								"pt.isep.edom.project.c0.dsl.usecase.UseCase.Actor");
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

                    				newLeafNode(otherlv_9, grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:171:3: (otherlv_10= 'association' otherlv_11= '{' ( (lv_association_12_0= ruleAssociation ) ) (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )* otherlv_15= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalUseCase.g:172:4: otherlv_10= 'association' otherlv_11= '{' ( (lv_association_12_0= ruleAssociation ) ) (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getUseCaseModelAccess().getAssociationKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUseCase.g:180:4: ( (lv_association_12_0= ruleAssociation ) )
                    // InternalUseCase.g:181:5: (lv_association_12_0= ruleAssociation )
                    {
                    // InternalUseCase.g:181:5: (lv_association_12_0= ruleAssociation )
                    // InternalUseCase.g:182:6: lv_association_12_0= ruleAssociation
                    {

                    						newCompositeNode(grammarAccess.getUseCaseModelAccess().getAssociationAssociationParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_association_12_0=ruleAssociation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
                    						}
                    						add(
                    							current,
                    							"association",
                    							lv_association_12_0,
                    							"pt.isep.edom.project.c0.dsl.usecase.UseCase.Association");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUseCase.g:199:4: (otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalUseCase.g:200:5: otherlv_13= ',' ( (lv_association_14_0= ruleAssociation ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_9); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getUseCaseModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUseCase.g:204:5: ( (lv_association_14_0= ruleAssociation ) )
                    	    // InternalUseCase.g:205:6: (lv_association_14_0= ruleAssociation )
                    	    {
                    	    // InternalUseCase.g:205:6: (lv_association_14_0= ruleAssociation )
                    	    // InternalUseCase.g:206:7: lv_association_14_0= ruleAssociation
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseModelAccess().getAssociationAssociationParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_association_14_0=ruleAssociation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"association",
                    	    								lv_association_14_0,
                    	    								"pt.isep.edom.project.c0.dsl.usecase.UseCase.Association");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_15, grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:229:3: (otherlv_16= 'usecase' otherlv_17= '{' ( (lv_usecase_18_0= ruleUseCase ) ) (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )* otherlv_21= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalUseCase.g:230:4: otherlv_16= 'usecase' otherlv_17= '{' ( (lv_usecase_18_0= ruleUseCase ) ) (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getUseCaseModelAccess().getUsecaseKeyword_6_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getUseCaseModelAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalUseCase.g:238:4: ( (lv_usecase_18_0= ruleUseCase ) )
                    // InternalUseCase.g:239:5: (lv_usecase_18_0= ruleUseCase )
                    {
                    // InternalUseCase.g:239:5: (lv_usecase_18_0= ruleUseCase )
                    // InternalUseCase.g:240:6: lv_usecase_18_0= ruleUseCase
                    {

                    						newCompositeNode(grammarAccess.getUseCaseModelAccess().getUsecaseUseCaseParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_usecase_18_0=ruleUseCase();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
                    						}
                    						add(
                    							current,
                    							"usecase",
                    							lv_usecase_18_0,
                    							"pt.isep.edom.project.c0.dsl.usecase.UseCase.UseCase");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUseCase.g:257:4: (otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalUseCase.g:258:5: otherlv_19= ',' ( (lv_usecase_20_0= ruleUseCase ) )
                    	    {
                    	    otherlv_19=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getUseCaseModelAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalUseCase.g:262:5: ( (lv_usecase_20_0= ruleUseCase ) )
                    	    // InternalUseCase.g:263:6: (lv_usecase_20_0= ruleUseCase )
                    	    {
                    	    // InternalUseCase.g:263:6: (lv_usecase_20_0= ruleUseCase )
                    	    // InternalUseCase.g:264:7: lv_usecase_20_0= ruleUseCase
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseModelAccess().getUsecaseUseCaseParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_usecase_20_0=ruleUseCase();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"usecase",
                    	    								lv_usecase_20_0,
                    	    								"pt.isep.edom.project.c0.dsl.usecase.UseCase.UseCase");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_21, grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getUseCaseModelAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleUseCaseModel"


    // $ANTLR start "entryRuleActor"
    // InternalUseCase.g:295:1: entryRuleActor returns [EObject current=null] : iv_ruleActor= ruleActor EOF ;
    public final EObject entryRuleActor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActor = null;


        try {
            // InternalUseCase.g:295:46: (iv_ruleActor= ruleActor EOF )
            // InternalUseCase.g:296:2: iv_ruleActor= ruleActor EOF
            {
             newCompositeNode(grammarAccess.getActorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleActor=ruleActor();

            state._fsp--;

             current =iv_ruleActor; 
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
    // $ANTLR end "entryRuleActor"


    // $ANTLR start "ruleActor"
    // InternalUseCase.g:302:1: ruleActor returns [EObject current=null] : ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleActor() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:308:2: ( ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalUseCase.g:309:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalUseCase.g:309:2: ( () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) ) )
            // InternalUseCase.g:310:3: () otherlv_1= 'Actor' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalUseCase.g:310:3: ()
            // InternalUseCase.g:311:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getActorAccess().getActorAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getActorAccess().getActorKeyword_1());
            		
            // InternalUseCase.g:321:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUseCase.g:322:4: (lv_name_2_0= ruleEString )
            {
            // InternalUseCase.g:322:4: (lv_name_2_0= ruleEString )
            // InternalUseCase.g:323:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getActorAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getActorRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c0.dsl.usecase.UseCase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


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
    // $ANTLR end "ruleActor"


    // $ANTLR start "entryRuleAssociation"
    // InternalUseCase.g:344:1: entryRuleAssociation returns [EObject current=null] : iv_ruleAssociation= ruleAssociation EOF ;
    public final EObject entryRuleAssociation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssociation = null;


        try {
            // InternalUseCase.g:344:52: (iv_ruleAssociation= ruleAssociation EOF )
            // InternalUseCase.g:345:2: iv_ruleAssociation= ruleAssociation EOF
            {
             newCompositeNode(grammarAccess.getAssociationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssociation=ruleAssociation();

            state._fsp--;

             current =iv_ruleAssociation; 
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
    // $ANTLR end "entryRuleAssociation"


    // $ANTLR start "ruleAssociation"
    // InternalUseCase.g:351:1: ruleAssociation returns [EObject current=null] : (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actor' ( ( ruleEString ) ) otherlv_5= 'usecase' ( ( ruleEString ) ) otherlv_7= '}' ) ;
    public final EObject ruleAssociation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:357:2: ( (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actor' ( ( ruleEString ) ) otherlv_5= 'usecase' ( ( ruleEString ) ) otherlv_7= '}' ) )
            // InternalUseCase.g:358:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actor' ( ( ruleEString ) ) otherlv_5= 'usecase' ( ( ruleEString ) ) otherlv_7= '}' )
            {
            // InternalUseCase.g:358:2: (otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actor' ( ( ruleEString ) ) otherlv_5= 'usecase' ( ( ruleEString ) ) otherlv_7= '}' )
            // InternalUseCase.g:359:3: otherlv_0= 'Association' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'actor' ( ( ruleEString ) ) otherlv_5= 'usecase' ( ( ruleEString ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAssociationAccess().getAssociationKeyword_0());
            		
            // InternalUseCase.g:363:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUseCase.g:364:4: (lv_name_1_0= ruleEString )
            {
            // InternalUseCase.g:364:4: (lv_name_1_0= ruleEString )
            // InternalUseCase.g:365:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getAssociationAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAssociationRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.edom.project.c0.dsl.usecase.UseCase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAssociationAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getAssociationAccess().getActorKeyword_3());
            		
            // InternalUseCase.g:390:3: ( ( ruleEString ) )
            // InternalUseCase.g:391:4: ( ruleEString )
            {
            // InternalUseCase.g:391:4: ( ruleEString )
            // InternalUseCase.g:392:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getActorActorCrossReference_4_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getAssociationAccess().getUsecaseKeyword_5());
            		
            // InternalUseCase.g:410:3: ( ( ruleEString ) )
            // InternalUseCase.g:411:4: ( ruleEString )
            {
            // InternalUseCase.g:411:4: ( ruleEString )
            // InternalUseCase.g:412:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAssociationRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAssociationAccess().getUsecaseUseCaseCrossReference_6_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getAssociationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleAssociation"


    // $ANTLR start "entryRuleUseCase"
    // InternalUseCase.g:434:1: entryRuleUseCase returns [EObject current=null] : iv_ruleUseCase= ruleUseCase EOF ;
    public final EObject entryRuleUseCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUseCase = null;


        try {
            // InternalUseCase.g:434:48: (iv_ruleUseCase= ruleUseCase EOF )
            // InternalUseCase.g:435:2: iv_ruleUseCase= ruleUseCase EOF
            {
             newCompositeNode(grammarAccess.getUseCaseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUseCase=ruleUseCase();

            state._fsp--;

             current =iv_ruleUseCase; 
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
    // $ANTLR end "entryRuleUseCase"


    // $ANTLR start "ruleUseCase"
    // InternalUseCase.g:441:1: ruleUseCase returns [EObject current=null] : ( () otherlv_1= 'UseCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extend' otherlv_5= '{' ( (lv_extend_6_0= ruleExtend ) ) (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )* otherlv_9= '}' )? (otherlv_10= 'include' otherlv_11= '{' ( (lv_include_12_0= ruleInclude ) ) (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) ;
    public final EObject ruleUseCase() throws RecognitionException {
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
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_extend_6_0 = null;

        EObject lv_extend_8_0 = null;

        EObject lv_include_12_0 = null;

        EObject lv_include_14_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:447:2: ( ( () otherlv_1= 'UseCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extend' otherlv_5= '{' ( (lv_extend_6_0= ruleExtend ) ) (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )* otherlv_9= '}' )? (otherlv_10= 'include' otherlv_11= '{' ( (lv_include_12_0= ruleInclude ) ) (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )* otherlv_15= '}' )? otherlv_16= '}' ) )
            // InternalUseCase.g:448:2: ( () otherlv_1= 'UseCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extend' otherlv_5= '{' ( (lv_extend_6_0= ruleExtend ) ) (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )* otherlv_9= '}' )? (otherlv_10= 'include' otherlv_11= '{' ( (lv_include_12_0= ruleInclude ) ) (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            {
            // InternalUseCase.g:448:2: ( () otherlv_1= 'UseCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extend' otherlv_5= '{' ( (lv_extend_6_0= ruleExtend ) ) (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )* otherlv_9= '}' )? (otherlv_10= 'include' otherlv_11= '{' ( (lv_include_12_0= ruleInclude ) ) (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )* otherlv_15= '}' )? otherlv_16= '}' )
            // InternalUseCase.g:449:3: () otherlv_1= 'UseCase' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'extend' otherlv_5= '{' ( (lv_extend_6_0= ruleExtend ) ) (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )* otherlv_9= '}' )? (otherlv_10= 'include' otherlv_11= '{' ( (lv_include_12_0= ruleInclude ) ) (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )* otherlv_15= '}' )? otherlv_16= '}'
            {
            // InternalUseCase.g:449:3: ()
            // InternalUseCase.g:450:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getUseCaseAccess().getUseCaseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getUseCaseAccess().getUseCaseKeyword_1());
            		
            // InternalUseCase.g:460:3: ( (lv_name_2_0= ruleEString ) )
            // InternalUseCase.g:461:4: (lv_name_2_0= ruleEString )
            {
            // InternalUseCase.g:461:4: (lv_name_2_0= ruleEString )
            // InternalUseCase.g:462:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUseCaseAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUseCaseRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c0.dsl.usecase.UseCase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalUseCase.g:483:3: (otherlv_4= 'extend' otherlv_5= '{' ( (lv_extend_6_0= ruleExtend ) ) (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )* otherlv_9= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalUseCase.g:484:4: otherlv_4= 'extend' otherlv_5= '{' ( (lv_extend_6_0= ruleExtend ) ) (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getUseCaseAccess().getExtendKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalUseCase.g:492:4: ( (lv_extend_6_0= ruleExtend ) )
                    // InternalUseCase.g:493:5: (lv_extend_6_0= ruleExtend )
                    {
                    // InternalUseCase.g:493:5: (lv_extend_6_0= ruleExtend )
                    // InternalUseCase.g:494:6: lv_extend_6_0= ruleExtend
                    {

                    						newCompositeNode(grammarAccess.getUseCaseAccess().getExtendExtendParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_extend_6_0=ruleExtend();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    						}
                    						add(
                    							current,
                    							"extend",
                    							lv_extend_6_0,
                    							"pt.isep.edom.project.c0.dsl.usecase.UseCase.Extend");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUseCase.g:511:4: (otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==14) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalUseCase.g:512:5: otherlv_7= ',' ( (lv_extend_8_0= ruleExtend ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_16); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getUseCaseAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalUseCase.g:516:5: ( (lv_extend_8_0= ruleExtend ) )
                    	    // InternalUseCase.g:517:6: (lv_extend_8_0= ruleExtend )
                    	    {
                    	    // InternalUseCase.g:517:6: (lv_extend_8_0= ruleExtend )
                    	    // InternalUseCase.g:518:7: lv_extend_8_0= ruleExtend
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseAccess().getExtendExtendParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_extend_8_0=ruleExtend();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"extend",
                    	    								lv_extend_8_0,
                    	    								"pt.isep.edom.project.c0.dsl.usecase.UseCase.Extend");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,15,FOLLOW_17); 

                    				newLeafNode(otherlv_9, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalUseCase.g:541:3: (otherlv_10= 'include' otherlv_11= '{' ( (lv_include_12_0= ruleInclude ) ) (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )* otherlv_15= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalUseCase.g:542:4: otherlv_10= 'include' otherlv_11= '{' ( (lv_include_12_0= ruleInclude ) ) (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )* otherlv_15= '}'
                    {
                    otherlv_10=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_10, grammarAccess.getUseCaseAccess().getIncludeKeyword_5_0());
                    			
                    otherlv_11=(Token)match(input,12,FOLLOW_18); 

                    				newLeafNode(otherlv_11, grammarAccess.getUseCaseAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalUseCase.g:550:4: ( (lv_include_12_0= ruleInclude ) )
                    // InternalUseCase.g:551:5: (lv_include_12_0= ruleInclude )
                    {
                    // InternalUseCase.g:551:5: (lv_include_12_0= ruleInclude )
                    // InternalUseCase.g:552:6: lv_include_12_0= ruleInclude
                    {

                    						newCompositeNode(grammarAccess.getUseCaseAccess().getIncludeIncludeParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_include_12_0=ruleInclude();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    						}
                    						add(
                    							current,
                    							"include",
                    							lv_include_12_0,
                    							"pt.isep.edom.project.c0.dsl.usecase.UseCase.Include");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalUseCase.g:569:4: (otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalUseCase.g:570:5: otherlv_13= ',' ( (lv_include_14_0= ruleInclude ) )
                    	    {
                    	    otherlv_13=(Token)match(input,14,FOLLOW_18); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getUseCaseAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalUseCase.g:574:5: ( (lv_include_14_0= ruleInclude ) )
                    	    // InternalUseCase.g:575:6: (lv_include_14_0= ruleInclude )
                    	    {
                    	    // InternalUseCase.g:575:6: (lv_include_14_0= ruleInclude )
                    	    // InternalUseCase.g:576:7: lv_include_14_0= ruleInclude
                    	    {

                    	    							newCompositeNode(grammarAccess.getUseCaseAccess().getIncludeIncludeParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_include_14_0=ruleInclude();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUseCaseRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"include",
                    	    								lv_include_14_0,
                    	    								"pt.isep.edom.project.c0.dsl.usecase.UseCase.Include");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_15, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_16=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_16, grammarAccess.getUseCaseAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleUseCase"


    // $ANTLR start "entryRuleEString"
    // InternalUseCase.g:607:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalUseCase.g:607:47: (iv_ruleEString= ruleEString EOF )
            // InternalUseCase.g:608:2: iv_ruleEString= ruleEString EOF
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
    // InternalUseCase.g:614:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalUseCase.g:620:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalUseCase.g:621:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalUseCase.g:621:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalUseCase.g:622:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalUseCase.g:630:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleExtend"
    // InternalUseCase.g:641:1: entryRuleExtend returns [EObject current=null] : iv_ruleExtend= ruleExtend EOF ;
    public final EObject entryRuleExtend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExtend = null;


        try {
            // InternalUseCase.g:641:47: (iv_ruleExtend= ruleExtend EOF )
            // InternalUseCase.g:642:2: iv_ruleExtend= ruleExtend EOF
            {
             newCompositeNode(grammarAccess.getExtendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExtend=ruleExtend();

            state._fsp--;

             current =iv_ruleExtend; 
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
    // $ANTLR end "entryRuleExtend"


    // $ANTLR start "ruleExtend"
    // InternalUseCase.g:648:1: ruleExtend returns [EObject current=null] : (otherlv_0= 'Extend' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleExtend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:654:2: ( (otherlv_0= 'Extend' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalUseCase.g:655:2: (otherlv_0= 'Extend' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalUseCase.g:655:2: (otherlv_0= 'Extend' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalUseCase.g:656:3: otherlv_0= 'Extend' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExtendAccess().getExtendKeyword_0());
            		
            // InternalUseCase.g:660:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUseCase.g:661:4: (lv_name_1_0= ruleEString )
            {
            // InternalUseCase.g:661:4: (lv_name_1_0= ruleEString )
            // InternalUseCase.g:662:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getExtendAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExtendRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.edom.project.c0.dsl.usecase.UseCase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getExtendAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getExtendAccess().getUsecaseKeyword_3());
            		
            // InternalUseCase.g:687:3: ( ( ruleEString ) )
            // InternalUseCase.g:688:4: ( ruleEString )
            {
            // InternalUseCase.g:688:4: ( ruleEString )
            // InternalUseCase.g:689:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExtendRule());
            					}
            				

            					newCompositeNode(grammarAccess.getExtendAccess().getUsecaseUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getExtendAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleExtend"


    // $ANTLR start "entryRuleInclude"
    // InternalUseCase.g:711:1: entryRuleInclude returns [EObject current=null] : iv_ruleInclude= ruleInclude EOF ;
    public final EObject entryRuleInclude() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInclude = null;


        try {
            // InternalUseCase.g:711:48: (iv_ruleInclude= ruleInclude EOF )
            // InternalUseCase.g:712:2: iv_ruleInclude= ruleInclude EOF
            {
             newCompositeNode(grammarAccess.getIncludeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInclude=ruleInclude();

            state._fsp--;

             current =iv_ruleInclude; 
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
    // $ANTLR end "entryRuleInclude"


    // $ANTLR start "ruleInclude"
    // InternalUseCase.g:718:1: ruleInclude returns [EObject current=null] : (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleInclude() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;



        	enterRule();

        try {
            // InternalUseCase.g:724:2: ( (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' ) )
            // InternalUseCase.g:725:2: (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' )
            {
            // InternalUseCase.g:725:2: (otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}' )
            // InternalUseCase.g:726:3: otherlv_0= 'Include' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'usecase' ( ( ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIncludeAccess().getIncludeKeyword_0());
            		
            // InternalUseCase.g:730:3: ( (lv_name_1_0= ruleEString ) )
            // InternalUseCase.g:731:4: (lv_name_1_0= ruleEString )
            {
            // InternalUseCase.g:731:4: (lv_name_1_0= ruleEString )
            // InternalUseCase.g:732:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getIncludeAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIncludeRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"pt.isep.edom.project.c0.dsl.usecase.UseCase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getIncludeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getIncludeAccess().getUsecaseKeyword_3());
            		
            // InternalUseCase.g:757:3: ( ( ruleEString ) )
            // InternalUseCase.g:758:4: ( ruleEString )
            {
            // InternalUseCase.g:758:4: ( ruleEString )
            // InternalUseCase.g:759:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIncludeRule());
            					}
            				

            					newCompositeNode(grammarAccess.getIncludeAccess().getUsecaseUseCaseCrossReference_4_0());
            				
            pushFollow(FOLLOW_12);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getIncludeAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleInclude"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000408000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});

}