package requirements.dsl.parser.antlr.internal;

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
import requirements.dsl.services.RDSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRDSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_CUSTOM_DATE_SINGLE_QUOTE", "RULE_CUSTOM_DATE_DOUBLE_QUOTE", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'title'", "'groups'", "','", "'}'", "'RequirementGroup'", "'description'", "'id'", "'requirements'", "'children'", "'Requirement'", "'type'", "'priority'", "'author'", "'created'", "'state'", "'resolution'", "'dependencies'", "'('", "')'", "'version'", "'comments'", "'Version'", "'major'", "'minor'", "'service'", "'Comment'", "'subject'", "'body'", "'-'", "'FUNCTIONAL'", "'NONFUNCTIONAL'", "'HIGH'", "'MEDIUM'", "'LOW'", "'NEW'", "'REVIEWED'", "'APPROVED'", "'RESOLVED'", "'INVALID'", "'ACCEPTED'", "'IMPLEMENTED'", "'LATER'"
    };
    public static final int RULE_CUSTOM_DATE_SINGLE_QUOTE=6;
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int RULE_CUSTOM_DATE_DOUBLE_QUOTE=7;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalRDSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRDSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRDSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRDSL.g"; }



     	private RDSLGrammarAccess grammarAccess;

        public InternalRDSLParser(TokenStream input, RDSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RDSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRDSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRDSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalRDSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalRDSL.g:72:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        EObject lv_groups_7_0 = null;

        EObject lv_groups_9_0 = null;



        	enterRule();

        try {
            // InternalRDSL.g:78:2: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalRDSL.g:79:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalRDSL.g:79:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalRDSL.g:80:3: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalRDSL.g:80:3: ()
            // InternalRDSL.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRDSL.g:95:3: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==15) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRDSL.g:96:4: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getTitleKeyword_3_0());
                    			
                    // InternalRDSL.g:100:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalRDSL.g:101:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalRDSL.g:101:5: (lv_title_4_0= ruleEString )
                    // InternalRDSL.g:102:6: lv_title_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:120:3: (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRDSL.g:121:4: otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getGroupsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRDSL.g:129:4: ( (lv_groups_7_0= ruleRequirementGroup ) )
                    // InternalRDSL.g:130:5: (lv_groups_7_0= ruleRequirementGroup )
                    {
                    // InternalRDSL.g:130:5: (lv_groups_7_0= ruleRequirementGroup )
                    // InternalRDSL.g:131:6: lv_groups_7_0= ruleRequirementGroup
                    {

                    						newCompositeNode(grammarAccess.getModelAccess().getGroupsRequirementGroupParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_groups_7_0=ruleRequirementGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getModelRule());
                    						}
                    						add(
                    							current,
                    							"groups",
                    							lv_groups_7_0,
                    							"requirements.dsl.RDSL.RequirementGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRDSL.g:148:4: (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==17) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRDSL.g:149:5: otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) )
                    	    {
                    	    otherlv_8=(Token)match(input,17,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRDSL.g:153:5: ( (lv_groups_9_0= ruleRequirementGroup ) )
                    	    // InternalRDSL.g:154:6: (lv_groups_9_0= ruleRequirementGroup )
                    	    {
                    	    // InternalRDSL.g:154:6: (lv_groups_9_0= ruleRequirementGroup )
                    	    // InternalRDSL.g:155:7: lv_groups_9_0= ruleRequirementGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getModelAccess().getGroupsRequirementGroupParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_groups_9_0=ruleRequirementGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"groups",
                    	    								lv_groups_9_0,
                    	    								"requirements.dsl.RDSL.RequirementGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRequirementGroup"
    // InternalRDSL.g:186:1: entryRuleRequirementGroup returns [EObject current=null] : iv_ruleRequirementGroup= ruleRequirementGroup EOF ;
    public final EObject entryRuleRequirementGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementGroup = null;


        try {
            // InternalRDSL.g:186:57: (iv_ruleRequirementGroup= ruleRequirementGroup EOF )
            // InternalRDSL.g:187:2: iv_ruleRequirementGroup= ruleRequirementGroup EOF
            {
             newCompositeNode(grammarAccess.getRequirementGroupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirementGroup=ruleRequirementGroup();

            state._fsp--;

             current =iv_ruleRequirementGroup; 
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
    // $ANTLR end "entryRuleRequirementGroup"


    // $ANTLR start "ruleRequirementGroup"
    // InternalRDSL.g:193:1: ruleRequirementGroup returns [EObject current=null] : ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'requirements' otherlv_9= '{' ( (lv_requirements_10_0= ruleRequirement ) ) (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )* otherlv_13= '}' )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= ruleRequirementGroup ) ) (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
    public final EObject ruleRequirementGroup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_id_7_0 = null;

        EObject lv_requirements_10_0 = null;

        EObject lv_requirements_12_0 = null;

        EObject lv_children_16_0 = null;

        EObject lv_children_18_0 = null;



        	enterRule();

        try {
            // InternalRDSL.g:199:2: ( ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'requirements' otherlv_9= '{' ( (lv_requirements_10_0= ruleRequirement ) ) (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )* otherlv_13= '}' )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= ruleRequirementGroup ) ) (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalRDSL.g:200:2: ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'requirements' otherlv_9= '{' ( (lv_requirements_10_0= ruleRequirement ) ) (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )* otherlv_13= '}' )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= ruleRequirementGroup ) ) (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalRDSL.g:200:2: ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'requirements' otherlv_9= '{' ( (lv_requirements_10_0= ruleRequirement ) ) (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )* otherlv_13= '}' )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= ruleRequirementGroup ) ) (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalRDSL.g:201:3: () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'requirements' otherlv_9= '{' ( (lv_requirements_10_0= ruleRequirement ) ) (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )* otherlv_13= '}' )? (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= ruleRequirementGroup ) ) (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalRDSL.g:201:3: ()
            // InternalRDSL.g:202:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementGroupAccess().getRequirementGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementGroupAccess().getRequirementGroupKeyword_1());
            		
            // InternalRDSL.g:212:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRDSL.g:213:4: (lv_name_2_0= ruleEString )
            {
            // InternalRDSL.g:213:4: (lv_name_2_0= ruleEString )
            // InternalRDSL.g:214:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementGroupAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"requirements.dsl.RDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRDSL.g:235:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRDSL.g:236:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementGroupAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalRDSL.g:240:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalRDSL.g:241:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalRDSL.g:241:5: (lv_description_5_0= ruleEString )
                    // InternalRDSL.g:242:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementGroupAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:260:3: (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRDSL.g:261:4: otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementGroupAccess().getIdKeyword_5_0());
                    			
                    // InternalRDSL.g:265:4: ( (lv_id_7_0= ruleEString ) )
                    // InternalRDSL.g:266:5: (lv_id_7_0= ruleEString )
                    {
                    // InternalRDSL.g:266:5: (lv_id_7_0= ruleEString )
                    // InternalRDSL.g:267:6: lv_id_7_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementGroupAccess().getIdEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_id_7_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_7_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:285:3: (otherlv_8= 'requirements' otherlv_9= '{' ( (lv_requirements_10_0= ruleRequirement ) ) (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )* otherlv_13= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRDSL.g:286:4: otherlv_8= 'requirements' otherlv_9= '{' ( (lv_requirements_10_0= ruleRequirement ) ) (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementGroupAccess().getRequirementsKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRDSL.g:294:4: ( (lv_requirements_10_0= ruleRequirement ) )
                    // InternalRDSL.g:295:5: (lv_requirements_10_0= ruleRequirement )
                    {
                    // InternalRDSL.g:295:5: (lv_requirements_10_0= ruleRequirement )
                    // InternalRDSL.g:296:6: lv_requirements_10_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getRequirementGroupAccess().getRequirementsRequirementParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_requirements_10_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    						}
                    						add(
                    							current,
                    							"requirements",
                    							lv_requirements_10_0,
                    							"requirements.dsl.RDSL.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRDSL.g:313:4: (otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalRDSL.g:314:5: otherlv_11= ',' ( (lv_requirements_12_0= ruleRequirement ) )
                    	    {
                    	    otherlv_11=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRequirementGroupAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRDSL.g:318:5: ( (lv_requirements_12_0= ruleRequirement ) )
                    	    // InternalRDSL.g:319:6: (lv_requirements_12_0= ruleRequirement )
                    	    {
                    	    // InternalRDSL.g:319:6: (lv_requirements_12_0= ruleRequirement )
                    	    // InternalRDSL.g:320:7: lv_requirements_12_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementGroupAccess().getRequirementsRequirementParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_requirements_12_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requirements",
                    	    								lv_requirements_12_0,
                    	    								"requirements.dsl.RDSL.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRDSL.g:343:3: (otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= ruleRequirementGroup ) ) (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )* otherlv_19= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRDSL.g:344:4: otherlv_14= 'children' otherlv_15= '{' ( (lv_children_16_0= ruleRequirementGroup ) ) (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementGroupAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRDSL.g:352:4: ( (lv_children_16_0= ruleRequirementGroup ) )
                    // InternalRDSL.g:353:5: (lv_children_16_0= ruleRequirementGroup )
                    {
                    // InternalRDSL.g:353:5: (lv_children_16_0= ruleRequirementGroup )
                    // InternalRDSL.g:354:6: lv_children_16_0= ruleRequirementGroup
                    {

                    						newCompositeNode(grammarAccess.getRequirementGroupAccess().getChildrenRequirementGroupParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_children_16_0=ruleRequirementGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_16_0,
                    							"requirements.dsl.RDSL.RequirementGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRDSL.g:371:4: (otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalRDSL.g:372:5: otherlv_17= ',' ( (lv_children_18_0= ruleRequirementGroup ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_7); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRequirementGroupAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRDSL.g:376:5: ( (lv_children_18_0= ruleRequirementGroup ) )
                    	    // InternalRDSL.g:377:6: (lv_children_18_0= ruleRequirementGroup )
                    	    {
                    	    // InternalRDSL.g:377:6: (lv_children_18_0= ruleRequirementGroup )
                    	    // InternalRDSL.g:378:7: lv_children_18_0= ruleRequirementGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementGroupAccess().getChildrenRequirementGroupParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_children_18_0=ruleRequirementGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_18_0,
                    	    								"requirements.dsl.RDSL.RequirementGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRequirementGroup"


    // $ANTLR start "entryRuleEString"
    // InternalRDSL.g:409:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRDSL.g:409:47: (iv_ruleEString= ruleEString EOF )
            // InternalRDSL.g:410:2: iv_ruleEString= ruleEString EOF
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
    // InternalRDSL.g:416:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRDSL.g:422:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRDSL.g:423:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRDSL.g:423:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRDSL.g:424:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRDSL.g:432:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRequirement"
    // InternalRDSL.g:443:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRDSL.g:443:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRDSL.g:444:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
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
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // InternalRDSL.g:450:1: ruleRequirement returns [EObject current=null] : ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'comments' otherlv_29= '{' ( (lv_comments_30_0= ruleComment ) ) (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )* otherlv_33= '}' )? (otherlv_34= 'children' otherlv_35= '{' ( (lv_children_36_0= ruleRequirement ) ) (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_40=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_type_7_0 = null;

        Enumerator lv_priority_9_0 = null;

        AntlrDatatypeRuleToken lv_author_11_0 = null;

        AntlrDatatypeRuleToken lv_created_13_0 = null;

        AntlrDatatypeRuleToken lv_id_15_0 = null;

        Enumerator lv_state_17_0 = null;

        Enumerator lv_resolution_19_0 = null;

        EObject lv_version_27_0 = null;

        EObject lv_comments_30_0 = null;

        EObject lv_comments_32_0 = null;

        EObject lv_children_36_0 = null;

        EObject lv_children_38_0 = null;



        	enterRule();

        try {
            // InternalRDSL.g:456:2: ( ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'comments' otherlv_29= '{' ( (lv_comments_30_0= ruleComment ) ) (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )* otherlv_33= '}' )? (otherlv_34= 'children' otherlv_35= '{' ( (lv_children_36_0= ruleRequirement ) ) (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) )
            // InternalRDSL.g:457:2: ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'comments' otherlv_29= '{' ( (lv_comments_30_0= ruleComment ) ) (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )* otherlv_33= '}' )? (otherlv_34= 'children' otherlv_35= '{' ( (lv_children_36_0= ruleRequirement ) ) (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            {
            // InternalRDSL.g:457:2: ( () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'comments' otherlv_29= '{' ( (lv_comments_30_0= ruleComment ) ) (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )* otherlv_33= '}' )? (otherlv_34= 'children' otherlv_35= '{' ( (lv_children_36_0= ruleRequirement ) ) (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            // InternalRDSL.g:458:3: () otherlv_1= 'Requirement' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'comments' otherlv_29= '{' ( (lv_comments_30_0= ruleComment ) ) (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )* otherlv_33= '}' )? (otherlv_34= 'children' otherlv_35= '{' ( (lv_children_36_0= ruleRequirement ) ) (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )* otherlv_39= '}' )? otherlv_40= '}'
            {
            // InternalRDSL.g:458:3: ()
            // InternalRDSL.g:459:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementAccess().getRequirementAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getRequirementKeyword_1());
            		
            // InternalRDSL.g:469:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRDSL.g:470:4: (lv_name_2_0= ruleEString )
            {
            // InternalRDSL.g:470:4: (lv_name_2_0= ruleEString )
            // InternalRDSL.g:471:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"requirements.dsl.RDSL.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_15); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRDSL.g:492:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRDSL.g:493:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalRDSL.g:497:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalRDSL.g:498:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalRDSL.g:498:5: (lv_description_5_0= ruleEString )
                    // InternalRDSL.g:499:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:517:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==25) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRDSL.g:518:4: otherlv_6= 'type' ( (lv_type_7_0= ruleType ) )
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getTypeKeyword_5_0());
                    			
                    // InternalRDSL.g:522:4: ( (lv_type_7_0= ruleType ) )
                    // InternalRDSL.g:523:5: (lv_type_7_0= ruleType )
                    {
                    // InternalRDSL.g:523:5: (lv_type_7_0= ruleType )
                    // InternalRDSL.g:524:6: lv_type_7_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTypeTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_type_7_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"requirements.dsl.RDSL.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:542:3: (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRDSL.g:543:4: otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) )
                    {
                    otherlv_8=(Token)match(input,26,FOLLOW_19); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getPriorityKeyword_6_0());
                    			
                    // InternalRDSL.g:547:4: ( (lv_priority_9_0= rulePriority ) )
                    // InternalRDSL.g:548:5: (lv_priority_9_0= rulePriority )
                    {
                    // InternalRDSL.g:548:5: (lv_priority_9_0= rulePriority )
                    // InternalRDSL.g:549:6: lv_priority_9_0= rulePriority
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getPriorityPriorityEnumRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_priority_9_0=rulePriority();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"priority",
                    							lv_priority_9_0,
                    							"requirements.dsl.RDSL.Priority");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:567:3: (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==27) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRDSL.g:568:4: otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getAuthorKeyword_7_0());
                    			
                    // InternalRDSL.g:572:4: ( (lv_author_11_0= ruleEString ) )
                    // InternalRDSL.g:573:5: (lv_author_11_0= ruleEString )
                    {
                    // InternalRDSL.g:573:5: (lv_author_11_0= ruleEString )
                    // InternalRDSL.g:574:6: lv_author_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getAuthorEStringParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_author_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_11_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:592:3: (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRDSL.g:593:4: otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) )
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getCreatedKeyword_8_0());
                    			
                    // InternalRDSL.g:597:4: ( (lv_created_13_0= ruleEDate ) )
                    // InternalRDSL.g:598:5: (lv_created_13_0= ruleEDate )
                    {
                    // InternalRDSL.g:598:5: (lv_created_13_0= ruleEDate )
                    // InternalRDSL.g:599:6: lv_created_13_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getCreatedEDateParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_23);
                    lv_created_13_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"created",
                    							lv_created_13_0,
                    							"requirements.dsl.RDSL.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:617:3: (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRDSL.g:618:4: otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getIdKeyword_9_0());
                    			
                    // InternalRDSL.g:622:4: ( (lv_id_15_0= ruleEString ) )
                    // InternalRDSL.g:623:5: (lv_id_15_0= ruleEString )
                    {
                    // InternalRDSL.g:623:5: (lv_id_15_0= ruleEString )
                    // InternalRDSL.g:624:6: lv_id_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getIdEStringParserRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_id_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_15_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:642:3: (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRDSL.g:643:4: otherlv_16= 'state' ( (lv_state_17_0= ruleState ) )
                    {
                    otherlv_16=(Token)match(input,29,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getStateKeyword_10_0());
                    			
                    // InternalRDSL.g:647:4: ( (lv_state_17_0= ruleState ) )
                    // InternalRDSL.g:648:5: (lv_state_17_0= ruleState )
                    {
                    // InternalRDSL.g:648:5: (lv_state_17_0= ruleState )
                    // InternalRDSL.g:649:6: lv_state_17_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getStateStateEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_26);
                    lv_state_17_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_17_0,
                    							"requirements.dsl.RDSL.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:667:3: (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRDSL.g:668:4: otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) )
                    {
                    otherlv_18=(Token)match(input,30,FOLLOW_27); 

                    				newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getResolutionKeyword_11_0());
                    			
                    // InternalRDSL.g:672:4: ( (lv_resolution_19_0= ruleResolution ) )
                    // InternalRDSL.g:673:5: (lv_resolution_19_0= ruleResolution )
                    {
                    // InternalRDSL.g:673:5: (lv_resolution_19_0= ruleResolution )
                    // InternalRDSL.g:674:6: lv_resolution_19_0= ruleResolution
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getResolutionResolutionEnumRuleCall_11_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_resolution_19_0=ruleResolution();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"resolution",
                    							lv_resolution_19_0,
                    							"requirements.dsl.RDSL.Resolution");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:692:3: (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalRDSL.g:693:4: otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,31,FOLLOW_29); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getDependenciesKeyword_12_0());
                    			
                    otherlv_21=(Token)match(input,32,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getLeftParenthesisKeyword_12_1());
                    			
                    // InternalRDSL.g:701:4: ( ( ruleEString ) )
                    // InternalRDSL.g:702:5: ( ruleEString )
                    {
                    // InternalRDSL.g:702:5: ( ruleEString )
                    // InternalRDSL.g:703:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesRequirementCrossReference_12_2_0());
                    					
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRDSL.g:717:4: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==17) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalRDSL.g:718:5: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,17,FOLLOW_5); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getCommaKeyword_12_3_0());
                    	    				
                    	    // InternalRDSL.g:722:5: ( ( ruleEString ) )
                    	    // InternalRDSL.g:723:6: ( ruleEString )
                    	    {
                    	    // InternalRDSL.g:723:6: ( ruleEString )
                    	    // InternalRDSL.g:724:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRequirementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesRequirementCrossReference_12_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_30);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,33,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getRightParenthesisKeyword_12_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getVersionKeyword_13());
            		
            // InternalRDSL.g:748:3: ( (lv_version_27_0= ruleVersion ) )
            // InternalRDSL.g:749:4: (lv_version_27_0= ruleVersion )
            {
            // InternalRDSL.g:749:4: (lv_version_27_0= ruleVersion )
            // InternalRDSL.g:750:5: lv_version_27_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getVersionVersionParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_33);
            lv_version_27_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_27_0,
            						"requirements.dsl.RDSL.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRDSL.g:767:3: (otherlv_28= 'comments' otherlv_29= '{' ( (lv_comments_30_0= ruleComment ) ) (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )* otherlv_33= '}' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalRDSL.g:768:4: otherlv_28= 'comments' otherlv_29= '{' ( (lv_comments_30_0= ruleComment ) ) (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getRequirementAccess().getCommentsKeyword_15_0());
                    			
                    otherlv_29=(Token)match(input,14,FOLLOW_34); 

                    				newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalRDSL.g:776:4: ( (lv_comments_30_0= ruleComment ) )
                    // InternalRDSL.g:777:5: (lv_comments_30_0= ruleComment )
                    {
                    // InternalRDSL.g:777:5: (lv_comments_30_0= ruleComment )
                    // InternalRDSL.g:778:6: lv_comments_30_0= ruleComment
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getCommentsCommentParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_comments_30_0=ruleComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"comments",
                    							lv_comments_30_0,
                    							"requirements.dsl.RDSL.Comment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRDSL.g:795:4: (otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==17) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalRDSL.g:796:5: otherlv_31= ',' ( (lv_comments_32_0= ruleComment ) )
                    	    {
                    	    otherlv_31=(Token)match(input,17,FOLLOW_34); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getRequirementAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalRDSL.g:800:5: ( (lv_comments_32_0= ruleComment ) )
                    	    // InternalRDSL.g:801:6: (lv_comments_32_0= ruleComment )
                    	    {
                    	    // InternalRDSL.g:801:6: (lv_comments_32_0= ruleComment )
                    	    // InternalRDSL.g:802:7: lv_comments_32_0= ruleComment
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getCommentsCommentParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_comments_32_0=ruleComment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"comments",
                    	    								lv_comments_32_0,
                    	    								"requirements.dsl.RDSL.Comment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            // InternalRDSL.g:825:3: (otherlv_34= 'children' otherlv_35= '{' ( (lv_children_36_0= ruleRequirement ) ) (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )* otherlv_39= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==23) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalRDSL.g:826:4: otherlv_34= 'children' otherlv_35= '{' ( (lv_children_36_0= ruleRequirement ) ) (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getRequirementAccess().getChildrenKeyword_16_0());
                    			
                    otherlv_35=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_35, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_16_1());
                    			
                    // InternalRDSL.g:834:4: ( (lv_children_36_0= ruleRequirement ) )
                    // InternalRDSL.g:835:5: (lv_children_36_0= ruleRequirement )
                    {
                    // InternalRDSL.g:835:5: (lv_children_36_0= ruleRequirement )
                    // InternalRDSL.g:836:6: lv_children_36_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getChildrenRequirementParserRuleCall_16_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_children_36_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_36_0,
                    							"requirements.dsl.RDSL.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRDSL.g:853:4: (otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalRDSL.g:854:5: otherlv_37= ',' ( (lv_children_38_0= ruleRequirement ) )
                    	    {
                    	    otherlv_37=(Token)match(input,17,FOLLOW_13); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getCommaKeyword_16_3_0());
                    	    				
                    	    // InternalRDSL.g:858:5: ( (lv_children_38_0= ruleRequirement ) )
                    	    // InternalRDSL.g:859:6: (lv_children_38_0= ruleRequirement )
                    	    {
                    	    // InternalRDSL.g:859:6: (lv_children_38_0= ruleRequirement )
                    	    // InternalRDSL.g:860:7: lv_children_38_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getChildrenRequirementParserRuleCall_16_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_children_38_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_38_0,
                    	    								"requirements.dsl.RDSL.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_39, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_16_4());
                    			

                    }
                    break;

            }

            otherlv_40=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleVersion"
    // InternalRDSL.g:891:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalRDSL.g:891:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalRDSL.g:892:2: iv_ruleVersion= ruleVersion EOF
            {
             newCompositeNode(grammarAccess.getVersionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVersion=ruleVersion();

            state._fsp--;

             current =iv_ruleVersion; 
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
    // $ANTLR end "entryRuleVersion"


    // $ANTLR start "ruleVersion"
    // InternalRDSL.g:898:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' ) ;
    public final EObject ruleVersion() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_major_3_0 = null;

        AntlrDatatypeRuleToken lv_minor_5_0 = null;

        AntlrDatatypeRuleToken lv_service_7_0 = null;



        	enterRule();

        try {
            // InternalRDSL.g:904:2: ( (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' ) )
            // InternalRDSL.g:905:2: (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' )
            {
            // InternalRDSL.g:905:2: (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' )
            // InternalRDSL.g:906:3: otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,37,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getMajorKeyword_2());
            		
            // InternalRDSL.g:918:3: ( (lv_major_3_0= ruleEInt ) )
            // InternalRDSL.g:919:4: (lv_major_3_0= ruleEInt )
            {
            // InternalRDSL.g:919:4: (lv_major_3_0= ruleEInt )
            // InternalRDSL.g:920:5: lv_major_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVersionAccess().getMajorEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_37);
            lv_major_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionRule());
            					}
            					set(
            						current,
            						"major",
            						lv_major_3_0,
            						"requirements.dsl.RDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,38,FOLLOW_36); 

            			newLeafNode(otherlv_4, grammarAccess.getVersionAccess().getMinorKeyword_4());
            		
            // InternalRDSL.g:941:3: ( (lv_minor_5_0= ruleEInt ) )
            // InternalRDSL.g:942:4: (lv_minor_5_0= ruleEInt )
            {
            // InternalRDSL.g:942:4: (lv_minor_5_0= ruleEInt )
            // InternalRDSL.g:943:5: lv_minor_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVersionAccess().getMinorEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_38);
            lv_minor_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionRule());
            					}
            					set(
            						current,
            						"minor",
            						lv_minor_5_0,
            						"requirements.dsl.RDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,39,FOLLOW_36); 

            			newLeafNode(otherlv_6, grammarAccess.getVersionAccess().getServiceKeyword_6());
            		
            // InternalRDSL.g:964:3: ( (lv_service_7_0= ruleEInt ) )
            // InternalRDSL.g:965:4: (lv_service_7_0= ruleEInt )
            {
            // InternalRDSL.g:965:4: (lv_service_7_0= ruleEInt )
            // InternalRDSL.g:966:5: lv_service_7_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVersionAccess().getServiceEIntParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_9);
            lv_service_7_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionRule());
            					}
            					set(
            						current,
            						"service",
            						lv_service_7_0,
            						"requirements.dsl.RDSL.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getVersionAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleVersion"


    // $ANTLR start "entryRuleComment"
    // InternalRDSL.g:991:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRDSL.g:991:48: (iv_ruleComment= ruleComment EOF )
            // InternalRDSL.g:992:2: iv_ruleComment= ruleComment EOF
            {
             newCompositeNode(grammarAccess.getCommentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComment=ruleComment();

            state._fsp--;

             current =iv_ruleComment; 
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
    // $ANTLR end "entryRuleComment"


    // $ANTLR start "ruleComment"
    // InternalRDSL.g:998:1: ruleComment returns [EObject current=null] : ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
    public final EObject ruleComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_subject_4_0 = null;

        AntlrDatatypeRuleToken lv_body_6_0 = null;

        AntlrDatatypeRuleToken lv_author_8_0 = null;

        AntlrDatatypeRuleToken lv_created_10_0 = null;

        EObject lv_children_13_0 = null;

        EObject lv_children_15_0 = null;



        	enterRule();

        try {
            // InternalRDSL.g:1004:2: ( ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalRDSL.g:1005:2: ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalRDSL.g:1005:2: ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalRDSL.g:1006:3: () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalRDSL.g:1006:3: ()
            // InternalRDSL.g:1007:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getCommentKeyword_1());
            		
            otherlv_2=(Token)match(input,14,FOLLOW_39); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRDSL.g:1021:3: (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==41) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRDSL.g:1022:4: otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,41,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommentAccess().getSubjectKeyword_3_0());
                    			
                    // InternalRDSL.g:1026:4: ( (lv_subject_4_0= ruleEString ) )
                    // InternalRDSL.g:1027:5: (lv_subject_4_0= ruleEString )
                    {
                    // InternalRDSL.g:1027:5: (lv_subject_4_0= ruleEString )
                    // InternalRDSL.g:1028:6: lv_subject_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getSubjectEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_40);
                    lv_subject_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"subject",
                    							lv_subject_4_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:1046:3: (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRDSL.g:1047:4: otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommentAccess().getBodyKeyword_4_0());
                    			
                    // InternalRDSL.g:1051:4: ( (lv_body_6_0= ruleEString ) )
                    // InternalRDSL.g:1052:5: (lv_body_6_0= ruleEString )
                    {
                    // InternalRDSL.g:1052:5: (lv_body_6_0= ruleEString )
                    // InternalRDSL.g:1053:6: lv_body_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getBodyEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_body_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_6_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:1071:3: (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRDSL.g:1072:4: otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommentAccess().getAuthorKeyword_5_0());
                    			
                    // InternalRDSL.g:1076:4: ( (lv_author_8_0= ruleEString ) )
                    // InternalRDSL.g:1077:5: (lv_author_8_0= ruleEString )
                    {
                    // InternalRDSL.g:1077:5: (lv_author_8_0= ruleEString )
                    // InternalRDSL.g:1078:6: lv_author_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getAuthorEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_author_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_8_0,
                    							"requirements.dsl.RDSL.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:1096:3: (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRDSL.g:1097:4: otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) )
                    {
                    otherlv_9=(Token)match(input,28,FOLLOW_22); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommentAccess().getCreatedKeyword_6_0());
                    			
                    // InternalRDSL.g:1101:4: ( (lv_created_10_0= ruleEDate ) )
                    // InternalRDSL.g:1102:5: (lv_created_10_0= ruleEDate )
                    {
                    // InternalRDSL.g:1102:5: (lv_created_10_0= ruleEDate )
                    // InternalRDSL.g:1103:6: lv_created_10_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getCreatedEDateParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_created_10_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"created",
                    							lv_created_10_0,
                    							"requirements.dsl.RDSL.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRDSL.g:1121:3: (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==23) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalRDSL.g:1122:4: otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCommentAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,14,FOLLOW_34); 

                    				newLeafNode(otherlv_12, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRDSL.g:1130:4: ( (lv_children_13_0= ruleComment ) )
                    // InternalRDSL.g:1131:5: (lv_children_13_0= ruleComment )
                    {
                    // InternalRDSL.g:1131:5: (lv_children_13_0= ruleComment )
                    // InternalRDSL.g:1132:6: lv_children_13_0= ruleComment
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getChildrenCommentParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_children_13_0=ruleComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_13_0,
                    							"requirements.dsl.RDSL.Comment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRDSL.g:1149:4: (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==17) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalRDSL.g:1150:5: otherlv_14= ',' ( (lv_children_15_0= ruleComment ) )
                    	    {
                    	    otherlv_14=(Token)match(input,17,FOLLOW_34); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCommentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRDSL.g:1154:5: ( (lv_children_15_0= ruleComment ) )
                    	    // InternalRDSL.g:1155:6: (lv_children_15_0= ruleComment )
                    	    {
                    	    // InternalRDSL.g:1155:6: (lv_children_15_0= ruleComment )
                    	    // InternalRDSL.g:1156:7: lv_children_15_0= ruleComment
                    	    {

                    	    							newCompositeNode(grammarAccess.getCommentAccess().getChildrenCommentParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_children_15_0=ruleComment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCommentRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_15_0,
                    	    								"requirements.dsl.RDSL.Comment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleComment"


    // $ANTLR start "entryRuleEDate"
    // InternalRDSL.g:1187:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalRDSL.g:1187:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalRDSL.g:1188:2: iv_ruleEDate= ruleEDate EOF
            {
             newCompositeNode(grammarAccess.getEDateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDate=ruleEDate();

            state._fsp--;

             current =iv_ruleEDate.getText(); 
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
    // $ANTLR end "entryRuleEDate"


    // $ANTLR start "ruleEDate"
    // InternalRDSL.g:1194:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CUSTOM_DATE_SINGLE_QUOTE_0= RULE_CUSTOM_DATE_SINGLE_QUOTE | this_CUSTOM_DATE_DOUBLE_QUOTE_1= RULE_CUSTOM_DATE_DOUBLE_QUOTE ) ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CUSTOM_DATE_SINGLE_QUOTE_0=null;
        Token this_CUSTOM_DATE_DOUBLE_QUOTE_1=null;


        	enterRule();

        try {
            // InternalRDSL.g:1200:2: ( (this_CUSTOM_DATE_SINGLE_QUOTE_0= RULE_CUSTOM_DATE_SINGLE_QUOTE | this_CUSTOM_DATE_DOUBLE_QUOTE_1= RULE_CUSTOM_DATE_DOUBLE_QUOTE ) )
            // InternalRDSL.g:1201:2: (this_CUSTOM_DATE_SINGLE_QUOTE_0= RULE_CUSTOM_DATE_SINGLE_QUOTE | this_CUSTOM_DATE_DOUBLE_QUOTE_1= RULE_CUSTOM_DATE_DOUBLE_QUOTE )
            {
            // InternalRDSL.g:1201:2: (this_CUSTOM_DATE_SINGLE_QUOTE_0= RULE_CUSTOM_DATE_SINGLE_QUOTE | this_CUSTOM_DATE_DOUBLE_QUOTE_1= RULE_CUSTOM_DATE_DOUBLE_QUOTE )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_CUSTOM_DATE_SINGLE_QUOTE) ) {
                alt31=1;
            }
            else if ( (LA31_0==RULE_CUSTOM_DATE_DOUBLE_QUOTE) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalRDSL.g:1202:3: this_CUSTOM_DATE_SINGLE_QUOTE_0= RULE_CUSTOM_DATE_SINGLE_QUOTE
                    {
                    this_CUSTOM_DATE_SINGLE_QUOTE_0=(Token)match(input,RULE_CUSTOM_DATE_SINGLE_QUOTE,FOLLOW_2); 

                    			current.merge(this_CUSTOM_DATE_SINGLE_QUOTE_0);
                    		

                    			newLeafNode(this_CUSTOM_DATE_SINGLE_QUOTE_0, grammarAccess.getEDateAccess().getCUSTOM_DATE_SINGLE_QUOTETerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRDSL.g:1210:3: this_CUSTOM_DATE_DOUBLE_QUOTE_1= RULE_CUSTOM_DATE_DOUBLE_QUOTE
                    {
                    this_CUSTOM_DATE_DOUBLE_QUOTE_1=(Token)match(input,RULE_CUSTOM_DATE_DOUBLE_QUOTE,FOLLOW_2); 

                    			current.merge(this_CUSTOM_DATE_DOUBLE_QUOTE_1);
                    		

                    			newLeafNode(this_CUSTOM_DATE_DOUBLE_QUOTE_1, grammarAccess.getEDateAccess().getCUSTOM_DATE_DOUBLE_QUOTETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEDate"


    // $ANTLR start "entryRuleEInt"
    // InternalRDSL.g:1221:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRDSL.g:1221:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRDSL.g:1222:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRDSL.g:1228:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRDSL.g:1234:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRDSL.g:1235:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRDSL.g:1235:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRDSL.g:1236:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRDSL.g:1236:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRDSL.g:1237:4: kw= '-'
                    {
                    kw=(Token)match(input,43,FOLLOW_43); 

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


    // $ANTLR start "ruleType"
    // InternalRDSL.g:1254:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRDSL.g:1260:2: ( ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) ) )
            // InternalRDSL.g:1261:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) )
            {
            // InternalRDSL.g:1261:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            else if ( (LA33_0==45) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalRDSL.g:1262:3: (enumLiteral_0= 'FUNCTIONAL' )
                    {
                    // InternalRDSL.g:1262:3: (enumLiteral_0= 'FUNCTIONAL' )
                    // InternalRDSL.g:1263:4: enumLiteral_0= 'FUNCTIONAL'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRDSL.g:1270:3: (enumLiteral_1= 'NONFUNCTIONAL' )
                    {
                    // InternalRDSL.g:1270:3: (enumLiteral_1= 'NONFUNCTIONAL' )
                    // InternalRDSL.g:1271:4: enumLiteral_1= 'NONFUNCTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getNONFUNCTIONALEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getNONFUNCTIONALEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleType"


    // $ANTLR start "rulePriority"
    // InternalRDSL.g:1281:1: rulePriority returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) ;
    public final Enumerator rulePriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRDSL.g:1287:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) )
            // InternalRDSL.g:1288:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            {
            // InternalRDSL.g:1288:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt34=1;
                }
                break;
            case 47:
                {
                alt34=2;
                }
                break;
            case 48:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalRDSL.g:1289:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalRDSL.g:1289:3: (enumLiteral_0= 'HIGH' )
                    // InternalRDSL.g:1290:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getPriorityAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRDSL.g:1297:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalRDSL.g:1297:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalRDSL.g:1298:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getPriorityAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPriorityAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRDSL.g:1305:3: (enumLiteral_2= 'LOW' )
                    {
                    // InternalRDSL.g:1305:3: (enumLiteral_2= 'LOW' )
                    // InternalRDSL.g:1306:4: enumLiteral_2= 'LOW'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getPriorityAccess().getLOWEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getPriorityAccess().getLOWEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "rulePriority"


    // $ANTLR start "ruleState"
    // InternalRDSL.g:1316:1: ruleState returns [Enumerator current=null] : ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) ) ;
    public final Enumerator ruleState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRDSL.g:1322:2: ( ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) ) )
            // InternalRDSL.g:1323:2: ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) )
            {
            // InternalRDSL.g:1323:2: ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt35=1;
                }
                break;
            case 50:
                {
                alt35=2;
                }
                break;
            case 51:
                {
                alt35=3;
                }
                break;
            case 52:
                {
                alt35=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalRDSL.g:1324:3: (enumLiteral_0= 'NEW' )
                    {
                    // InternalRDSL.g:1324:3: (enumLiteral_0= 'NEW' )
                    // InternalRDSL.g:1325:4: enumLiteral_0= 'NEW'
                    {
                    enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getNEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateAccess().getNEWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRDSL.g:1332:3: (enumLiteral_1= 'REVIEWED' )
                    {
                    // InternalRDSL.g:1332:3: (enumLiteral_1= 'REVIEWED' )
                    // InternalRDSL.g:1333:4: enumLiteral_1= 'REVIEWED'
                    {
                    enumLiteral_1=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getREVIEWEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateAccess().getREVIEWEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRDSL.g:1340:3: (enumLiteral_2= 'APPROVED' )
                    {
                    // InternalRDSL.g:1340:3: (enumLiteral_2= 'APPROVED' )
                    // InternalRDSL.g:1341:4: enumLiteral_2= 'APPROVED'
                    {
                    enumLiteral_2=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getAPPROVEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStateAccess().getAPPROVEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRDSL.g:1348:3: (enumLiteral_3= 'RESOLVED' )
                    {
                    // InternalRDSL.g:1348:3: (enumLiteral_3= 'RESOLVED' )
                    // InternalRDSL.g:1349:4: enumLiteral_3= 'RESOLVED'
                    {
                    enumLiteral_3=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getRESOLVEDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getStateAccess().getRESOLVEDEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleState"


    // $ANTLR start "ruleResolution"
    // InternalRDSL.g:1359:1: ruleResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) ) ;
    public final Enumerator ruleResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRDSL.g:1365:2: ( ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) ) )
            // InternalRDSL.g:1366:2: ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) )
            {
            // InternalRDSL.g:1366:2: ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt36=1;
                }
                break;
            case 54:
                {
                alt36=2;
                }
                break;
            case 55:
                {
                alt36=3;
                }
                break;
            case 56:
                {
                alt36=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalRDSL.g:1367:3: (enumLiteral_0= 'INVALID' )
                    {
                    // InternalRDSL.g:1367:3: (enumLiteral_0= 'INVALID' )
                    // InternalRDSL.g:1368:4: enumLiteral_0= 'INVALID'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getResolutionAccess().getINVALIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionAccess().getINVALIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRDSL.g:1375:3: (enumLiteral_1= 'ACCEPTED' )
                    {
                    // InternalRDSL.g:1375:3: (enumLiteral_1= 'ACCEPTED' )
                    // InternalRDSL.g:1376:4: enumLiteral_1= 'ACCEPTED'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getResolutionAccess().getACCEPTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResolutionAccess().getACCEPTEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRDSL.g:1383:3: (enumLiteral_2= 'IMPLEMENTED' )
                    {
                    // InternalRDSL.g:1383:3: (enumLiteral_2= 'IMPLEMENTED' )
                    // InternalRDSL.g:1384:4: enumLiteral_2= 'IMPLEMENTED'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getResolutionAccess().getIMPLEMENTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getResolutionAccess().getIMPLEMENTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRDSL.g:1391:3: (enumLiteral_3= 'LATER' )
                    {
                    // InternalRDSL.g:1391:3: (enumLiteral_3= 'LATER' )
                    // InternalRDSL.g:1392:4: enumLiteral_3= 'LATER'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getResolutionAccess().getLATEREnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getResolutionAccess().getLATEREnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleResolution"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000058000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000F40000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000E40000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000C40000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000004FE300000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000004FE200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000004FC200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001C00000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000004F8200000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x00000004F0200000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000004E0200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000004E0000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000004C0000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200020000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800840000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000100L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000060018840000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000040018840000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000018840000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000010840000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000100L});

}