package pt.isep.edom.parser.antlr.internal;

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
import pt.isep.edom.services.RequirementsDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRequirementsDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Model'", "'{'", "'title'", "'groups'", "','", "'}'", "'RequirementGroup'", "'description'", "'id'", "'children'", "'requirements'", "'Requirement'", "'type'", "'priority'", "'author'", "'created'", "'state'", "'resolution'", "'dependencies'", "'('", "')'", "'version'", "'comments'", "'Version'", "'major'", "'minor'", "'service'", "'Comment'", "'subject'", "'body'", "'-'", "'FUNCTIONAL'", "'NONFUNCTIONAL'", "'HIGH'", "'MEDIUM'", "'LOW'", "'NEW'", "'REVIEWED'", "'APPROVED'", "'RESOLVED'", "'INVALID'", "'ACCEPTED'", "'IMPLEMENTED'", "'LATER'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
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
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
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
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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


        public InternalRequirementsDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRequirementsDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRequirementsDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRequirementsDsl.g"; }



     	private RequirementsDslGrammarAccess grammarAccess;

        public InternalRequirementsDslParser(TokenStream input, RequirementsDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected RequirementsDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalRequirementsDsl.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalRequirementsDsl.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalRequirementsDsl.g:66:2: iv_ruleModel= ruleModel EOF
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
    // InternalRequirementsDsl.g:72:1: ruleModel returns [EObject current=null] : ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
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
            // InternalRequirementsDsl.g:78:2: ( ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalRequirementsDsl.g:79:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalRequirementsDsl.g:79:2: ( () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalRequirementsDsl.g:80:3: () otherlv_1= 'Model' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalRequirementsDsl.g:80:3: ()
            // InternalRequirementsDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getModelAccess().getModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getModelAccess().getModelKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRequirementsDsl.g:95:3: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRequirementsDsl.g:96:4: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getModelAccess().getTitleKeyword_3_0());
                    			
                    // InternalRequirementsDsl.g:100:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalRequirementsDsl.g:101:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:101:5: (lv_title_4_0= ruleEString )
                    // InternalRequirementsDsl.g:102:6: lv_title_4_0= ruleEString
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
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:120:3: (otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRequirementsDsl.g:121:4: otherlv_5= 'groups' otherlv_6= '{' ( (lv_groups_7_0= ruleRequirementGroup ) ) (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getModelAccess().getGroupsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalRequirementsDsl.g:129:4: ( (lv_groups_7_0= ruleRequirementGroup ) )
                    // InternalRequirementsDsl.g:130:5: (lv_groups_7_0= ruleRequirementGroup )
                    {
                    // InternalRequirementsDsl.g:130:5: (lv_groups_7_0= ruleRequirementGroup )
                    // InternalRequirementsDsl.g:131:6: lv_groups_7_0= ruleRequirementGroup
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
                    							"pt.isep.edom.RequirementsDsl.RequirementGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsDsl.g:148:4: (otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRequirementsDsl.g:149:5: otherlv_8= ',' ( (lv_groups_9_0= ruleRequirementGroup ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalRequirementsDsl.g:153:5: ( (lv_groups_9_0= ruleRequirementGroup ) )
                    	    // InternalRequirementsDsl.g:154:6: (lv_groups_9_0= ruleRequirementGroup )
                    	    {
                    	    // InternalRequirementsDsl.g:154:6: (lv_groups_9_0= ruleRequirementGroup )
                    	    // InternalRequirementsDsl.g:155:7: lv_groups_9_0= ruleRequirementGroup
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
                    	    								"pt.isep.edom.RequirementsDsl.RequirementGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEString"
    // InternalRequirementsDsl.g:186:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRequirementsDsl.g:186:47: (iv_ruleEString= ruleEString EOF )
            // InternalRequirementsDsl.g:187:2: iv_ruleEString= ruleEString EOF
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
    // InternalRequirementsDsl.g:193:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRequirementsDsl.g:199:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRequirementsDsl.g:200:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRequirementsDsl.g:200:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRequirementsDsl.g:201:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRequirementsDsl.g:209:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRequirementGroup"
    // InternalRequirementsDsl.g:220:1: entryRuleRequirementGroup returns [EObject current=null] : iv_ruleRequirementGroup= ruleRequirementGroup EOF ;
    public final EObject entryRuleRequirementGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementGroup = null;


        try {
            // InternalRequirementsDsl.g:220:57: (iv_ruleRequirementGroup= ruleRequirementGroup EOF )
            // InternalRequirementsDsl.g:221:2: iv_ruleRequirementGroup= ruleRequirementGroup EOF
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
    // InternalRequirementsDsl.g:227:1: ruleRequirementGroup returns [EObject current=null] : ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleRequirementGroup ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )* otherlv_13= '}' )? (otherlv_14= 'requirements' otherlv_15= '{' ( (lv_requirements_16_0= ruleRequirement ) ) (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) ;
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

        EObject lv_children_10_0 = null;

        EObject lv_children_12_0 = null;

        EObject lv_requirements_16_0 = null;

        EObject lv_requirements_18_0 = null;



        	enterRule();

        try {
            // InternalRequirementsDsl.g:233:2: ( ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleRequirementGroup ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )* otherlv_13= '}' )? (otherlv_14= 'requirements' otherlv_15= '{' ( (lv_requirements_16_0= ruleRequirement ) ) (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )* otherlv_19= '}' )? otherlv_20= '}' ) )
            // InternalRequirementsDsl.g:234:2: ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleRequirementGroup ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )* otherlv_13= '}' )? (otherlv_14= 'requirements' otherlv_15= '{' ( (lv_requirements_16_0= ruleRequirement ) ) (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            {
            // InternalRequirementsDsl.g:234:2: ( () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleRequirementGroup ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )* otherlv_13= '}' )? (otherlv_14= 'requirements' otherlv_15= '{' ( (lv_requirements_16_0= ruleRequirement ) ) (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )* otherlv_19= '}' )? otherlv_20= '}' )
            // InternalRequirementsDsl.g:235:3: () otherlv_1= 'RequirementGroup' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )? (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleRequirementGroup ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )* otherlv_13= '}' )? (otherlv_14= 'requirements' otherlv_15= '{' ( (lv_requirements_16_0= ruleRequirement ) ) (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )* otherlv_19= '}' )? otherlv_20= '}'
            {
            // InternalRequirementsDsl.g:235:3: ()
            // InternalRequirementsDsl.g:236:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRequirementGroupAccess().getRequirementGroupAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementGroupAccess().getRequirementGroupKeyword_1());
            		
            // InternalRequirementsDsl.g:246:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRequirementsDsl.g:247:4: (lv_name_2_0= ruleEString )
            {
            // InternalRequirementsDsl.g:247:4: (lv_name_2_0= ruleEString )
            // InternalRequirementsDsl.g:248:5: lv_name_2_0= ruleEString
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
            						"pt.isep.edom.RequirementsDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRequirementsDsl.g:269:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRequirementsDsl.g:270:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementGroupAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalRequirementsDsl.g:274:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalRequirementsDsl.g:275:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:275:5: (lv_description_5_0= ruleEString )
                    // InternalRequirementsDsl.g:276:6: lv_description_5_0= ruleEString
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
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:294:3: (otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRequirementsDsl.g:295:4: otherlv_6= 'id' ( (lv_id_7_0= ruleEString ) )
                    {
                    otherlv_6=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementGroupAccess().getIdKeyword_5_0());
                    			
                    // InternalRequirementsDsl.g:299:4: ( (lv_id_7_0= ruleEString ) )
                    // InternalRequirementsDsl.g:300:5: (lv_id_7_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:300:5: (lv_id_7_0= ruleEString )
                    // InternalRequirementsDsl.g:301:6: lv_id_7_0= ruleEString
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
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:319:3: (otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleRequirementGroup ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )* otherlv_13= '}' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRequirementsDsl.g:320:4: otherlv_8= 'children' otherlv_9= '{' ( (lv_children_10_0= ruleRequirementGroup ) ) (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )* otherlv_13= '}'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementGroupAccess().getChildrenKeyword_6_0());
                    			
                    otherlv_9=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalRequirementsDsl.g:328:4: ( (lv_children_10_0= ruleRequirementGroup ) )
                    // InternalRequirementsDsl.g:329:5: (lv_children_10_0= ruleRequirementGroup )
                    {
                    // InternalRequirementsDsl.g:329:5: (lv_children_10_0= ruleRequirementGroup )
                    // InternalRequirementsDsl.g:330:6: lv_children_10_0= ruleRequirementGroup
                    {

                    						newCompositeNode(grammarAccess.getRequirementGroupAccess().getChildrenRequirementGroupParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_children_10_0=ruleRequirementGroup();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_10_0,
                    							"pt.isep.edom.RequirementsDsl.RequirementGroup");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsDsl.g:347:4: (otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==15) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalRequirementsDsl.g:348:5: otherlv_11= ',' ( (lv_children_12_0= ruleRequirementGroup ) )
                    	    {
                    	    otherlv_11=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_11, grammarAccess.getRequirementGroupAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalRequirementsDsl.g:352:5: ( (lv_children_12_0= ruleRequirementGroup ) )
                    	    // InternalRequirementsDsl.g:353:6: (lv_children_12_0= ruleRequirementGroup )
                    	    {
                    	    // InternalRequirementsDsl.g:353:6: (lv_children_12_0= ruleRequirementGroup )
                    	    // InternalRequirementsDsl.g:354:7: lv_children_12_0= ruleRequirementGroup
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementGroupAccess().getChildrenRequirementGroupParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_children_12_0=ruleRequirementGroup();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_12_0,
                    	    								"pt.isep.edom.RequirementsDsl.RequirementGroup");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_13=(Token)match(input,16,FOLLOW_13); 

                    				newLeafNode(otherlv_13, grammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            // InternalRequirementsDsl.g:377:3: (otherlv_14= 'requirements' otherlv_15= '{' ( (lv_requirements_16_0= ruleRequirement ) ) (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )* otherlv_19= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalRequirementsDsl.g:378:4: otherlv_14= 'requirements' otherlv_15= '{' ( (lv_requirements_16_0= ruleRequirement ) ) (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementGroupAccess().getRequirementsKeyword_7_0());
                    			
                    otherlv_15=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_15, grammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRequirementsDsl.g:386:4: ( (lv_requirements_16_0= ruleRequirement ) )
                    // InternalRequirementsDsl.g:387:5: (lv_requirements_16_0= ruleRequirement )
                    {
                    // InternalRequirementsDsl.g:387:5: (lv_requirements_16_0= ruleRequirement )
                    // InternalRequirementsDsl.g:388:6: lv_requirements_16_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getRequirementGroupAccess().getRequirementsRequirementParserRuleCall_7_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_requirements_16_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    						}
                    						add(
                    							current,
                    							"requirements",
                    							lv_requirements_16_0,
                    							"pt.isep.edom.RequirementsDsl.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsDsl.g:405:4: (otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalRequirementsDsl.g:406:5: otherlv_17= ',' ( (lv_requirements_18_0= ruleRequirement ) )
                    	    {
                    	    otherlv_17=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getRequirementGroupAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRequirementsDsl.g:410:5: ( (lv_requirements_18_0= ruleRequirement ) )
                    	    // InternalRequirementsDsl.g:411:6: (lv_requirements_18_0= ruleRequirement )
                    	    {
                    	    // InternalRequirementsDsl.g:411:6: (lv_requirements_18_0= ruleRequirement )
                    	    // InternalRequirementsDsl.g:412:7: lv_requirements_18_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementGroupAccess().getRequirementsRequirementParserRuleCall_7_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_requirements_18_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementGroupRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"requirements",
                    	    								lv_requirements_18_0,
                    	    								"pt.isep.edom.RequirementsDsl.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_19, grammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRequirement"
    // InternalRequirementsDsl.g:443:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // InternalRequirementsDsl.g:443:52: (iv_ruleRequirement= ruleRequirement EOF )
            // InternalRequirementsDsl.g:444:2: iv_ruleRequirement= ruleRequirement EOF
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
    // InternalRequirementsDsl.g:450:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'Requirement' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'children' otherlv_29= '{' ( (lv_children_30_0= ruleRequirement ) ) (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )* otherlv_33= '}' )? (otherlv_34= 'comments' otherlv_35= '{' ( (lv_comments_36_0= ruleComment ) ) (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
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
        AntlrDatatypeRuleToken lv_title_3_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        Enumerator lv_type_7_0 = null;

        Enumerator lv_priority_9_0 = null;

        AntlrDatatypeRuleToken lv_author_11_0 = null;

        AntlrDatatypeRuleToken lv_created_13_0 = null;

        AntlrDatatypeRuleToken lv_id_15_0 = null;

        Enumerator lv_state_17_0 = null;

        Enumerator lv_resolution_19_0 = null;

        EObject lv_version_27_0 = null;

        EObject lv_children_30_0 = null;

        EObject lv_children_32_0 = null;

        EObject lv_comments_36_0 = null;

        EObject lv_comments_38_0 = null;



        	enterRule();

        try {
            // InternalRequirementsDsl.g:456:2: ( (otherlv_0= 'Requirement' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'children' otherlv_29= '{' ( (lv_children_30_0= ruleRequirement ) ) (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )* otherlv_33= '}' )? (otherlv_34= 'comments' otherlv_35= '{' ( (lv_comments_36_0= ruleComment ) ) (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )* otherlv_39= '}' )? otherlv_40= '}' ) )
            // InternalRequirementsDsl.g:457:2: (otherlv_0= 'Requirement' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'children' otherlv_29= '{' ( (lv_children_30_0= ruleRequirement ) ) (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )* otherlv_33= '}' )? (otherlv_34= 'comments' otherlv_35= '{' ( (lv_comments_36_0= ruleComment ) ) (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            {
            // InternalRequirementsDsl.g:457:2: (otherlv_0= 'Requirement' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'children' otherlv_29= '{' ( (lv_children_30_0= ruleRequirement ) ) (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )* otherlv_33= '}' )? (otherlv_34= 'comments' otherlv_35= '{' ( (lv_comments_36_0= ruleComment ) ) (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )* otherlv_39= '}' )? otherlv_40= '}' )
            // InternalRequirementsDsl.g:458:3: otherlv_0= 'Requirement' otherlv_1= '{' (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )? (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )? (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )? (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )? (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )? (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )? (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )? (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )? (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )? otherlv_26= 'version' ( (lv_version_27_0= ruleVersion ) ) (otherlv_28= 'children' otherlv_29= '{' ( (lv_children_30_0= ruleRequirement ) ) (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )* otherlv_33= '}' )? (otherlv_34= 'comments' otherlv_35= '{' ( (lv_comments_36_0= ruleComment ) ) (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )* otherlv_39= '}' )? otherlv_40= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalRequirementsDsl.g:466:3: (otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRequirementsDsl.g:467:4: otherlv_2= 'title' ( (lv_title_3_0= ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getTitleKeyword_2_0());
                    			
                    // InternalRequirementsDsl.g:471:4: ( (lv_title_3_0= ruleEString ) )
                    // InternalRequirementsDsl.g:472:5: (lv_title_3_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:472:5: (lv_title_3_0= ruleEString )
                    // InternalRequirementsDsl.g:473:6: lv_title_3_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTitleEStringParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_title_3_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_3_0,
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:491:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==18) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRequirementsDsl.g:492:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
                    			
                    // InternalRequirementsDsl.g:496:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalRequirementsDsl.g:497:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:497:5: (lv_description_5_0= ruleEString )
                    // InternalRequirementsDsl.g:498:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:516:3: (otherlv_6= 'type' ( (lv_type_7_0= ruleType ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRequirementsDsl.g:517:4: otherlv_6= 'type' ( (lv_type_7_0= ruleType ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_18); 

                    				newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getTypeKeyword_4_0());
                    			
                    // InternalRequirementsDsl.g:521:4: ( (lv_type_7_0= ruleType ) )
                    // InternalRequirementsDsl.g:522:5: (lv_type_7_0= ruleType )
                    {
                    // InternalRequirementsDsl.g:522:5: (lv_type_7_0= ruleType )
                    // InternalRequirementsDsl.g:523:6: lv_type_7_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getTypeTypeEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_19);
                    lv_type_7_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_7_0,
                    							"pt.isep.edom.RequirementsDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:541:3: (otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRequirementsDsl.g:542:4: otherlv_8= 'priority' ( (lv_priority_9_0= rulePriority ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_20); 

                    				newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getPriorityKeyword_5_0());
                    			
                    // InternalRequirementsDsl.g:546:4: ( (lv_priority_9_0= rulePriority ) )
                    // InternalRequirementsDsl.g:547:5: (lv_priority_9_0= rulePriority )
                    {
                    // InternalRequirementsDsl.g:547:5: (lv_priority_9_0= rulePriority )
                    // InternalRequirementsDsl.g:548:6: lv_priority_9_0= rulePriority
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getPriorityPriorityEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_21);
                    lv_priority_9_0=rulePriority();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"priority",
                    							lv_priority_9_0,
                    							"pt.isep.edom.RequirementsDsl.Priority");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:566:3: (otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==25) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalRequirementsDsl.g:567:4: otherlv_10= 'author' ( (lv_author_11_0= ruleEString ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_10, grammarAccess.getRequirementAccess().getAuthorKeyword_6_0());
                    			
                    // InternalRequirementsDsl.g:571:4: ( (lv_author_11_0= ruleEString ) )
                    // InternalRequirementsDsl.g:572:5: (lv_author_11_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:572:5: (lv_author_11_0= ruleEString )
                    // InternalRequirementsDsl.g:573:6: lv_author_11_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getAuthorEStringParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_author_11_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_11_0,
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:591:3: (otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==26) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalRequirementsDsl.g:592:4: otherlv_12= 'created' ( (lv_created_13_0= ruleEDate ) )
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getCreatedKeyword_7_0());
                    			
                    // InternalRequirementsDsl.g:596:4: ( (lv_created_13_0= ruleEDate ) )
                    // InternalRequirementsDsl.g:597:5: (lv_created_13_0= ruleEDate )
                    {
                    // InternalRequirementsDsl.g:597:5: (lv_created_13_0= ruleEDate )
                    // InternalRequirementsDsl.g:598:6: lv_created_13_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getCreatedEDateParserRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_created_13_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"created",
                    							lv_created_13_0,
                    							"pt.isep.edom.RequirementsDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:616:3: (otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==19) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalRequirementsDsl.g:617:4: otherlv_14= 'id' ( (lv_id_15_0= ruleEString ) )
                    {
                    otherlv_14=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getIdKeyword_8_0());
                    			
                    // InternalRequirementsDsl.g:621:4: ( (lv_id_15_0= ruleEString ) )
                    // InternalRequirementsDsl.g:622:5: (lv_id_15_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:622:5: (lv_id_15_0= ruleEString )
                    // InternalRequirementsDsl.g:623:6: lv_id_15_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getIdEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_25);
                    lv_id_15_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_15_0,
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:641:3: (otherlv_16= 'state' ( (lv_state_17_0= ruleState ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==27) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalRequirementsDsl.g:642:4: otherlv_16= 'state' ( (lv_state_17_0= ruleState ) )
                    {
                    otherlv_16=(Token)match(input,27,FOLLOW_26); 

                    				newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getStateKeyword_9_0());
                    			
                    // InternalRequirementsDsl.g:646:4: ( (lv_state_17_0= ruleState ) )
                    // InternalRequirementsDsl.g:647:5: (lv_state_17_0= ruleState )
                    {
                    // InternalRequirementsDsl.g:647:5: (lv_state_17_0= ruleState )
                    // InternalRequirementsDsl.g:648:6: lv_state_17_0= ruleState
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getStateStateEnumRuleCall_9_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_state_17_0=ruleState();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"state",
                    							lv_state_17_0,
                    							"pt.isep.edom.RequirementsDsl.State");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:666:3: (otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==28) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalRequirementsDsl.g:667:4: otherlv_18= 'resolution' ( (lv_resolution_19_0= ruleResolution ) )
                    {
                    otherlv_18=(Token)match(input,28,FOLLOW_28); 

                    				newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getResolutionKeyword_10_0());
                    			
                    // InternalRequirementsDsl.g:671:4: ( (lv_resolution_19_0= ruleResolution ) )
                    // InternalRequirementsDsl.g:672:5: (lv_resolution_19_0= ruleResolution )
                    {
                    // InternalRequirementsDsl.g:672:5: (lv_resolution_19_0= ruleResolution )
                    // InternalRequirementsDsl.g:673:6: lv_resolution_19_0= ruleResolution
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getResolutionResolutionEnumRuleCall_10_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_resolution_19_0=ruleResolution();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						set(
                    							current,
                    							"resolution",
                    							lv_resolution_19_0,
                    							"pt.isep.edom.RequirementsDsl.Resolution");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:691:3: (otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalRequirementsDsl.g:692:4: otherlv_20= 'dependencies' otherlv_21= '(' ( ( ruleEString ) ) (otherlv_23= ',' ( ( ruleEString ) ) )* otherlv_25= ')'
                    {
                    otherlv_20=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getDependenciesKeyword_11_0());
                    			
                    otherlv_21=(Token)match(input,30,FOLLOW_5); 

                    				newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalRequirementsDsl.g:700:4: ( ( ruleEString ) )
                    // InternalRequirementsDsl.g:701:5: ( ruleEString )
                    {
                    // InternalRequirementsDsl.g:701:5: ( ruleEString )
                    // InternalRequirementsDsl.g:702:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRequirementRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesRequirementCrossReference_11_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsDsl.g:716:4: (otherlv_23= ',' ( ( ruleEString ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==15) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalRequirementsDsl.g:717:5: otherlv_23= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_23=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getCommaKeyword_11_3_0());
                    	    				
                    	    // InternalRequirementsDsl.g:721:5: ( ( ruleEString ) )
                    	    // InternalRequirementsDsl.g:722:6: ( ruleEString )
                    	    {
                    	    // InternalRequirementsDsl.g:722:6: ( ruleEString )
                    	    // InternalRequirementsDsl.g:723:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getRequirementRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getDependenciesRequirementCrossReference_11_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_31);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_25=(Token)match(input,31,FOLLOW_32); 

                    				newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getRightParenthesisKeyword_11_4());
                    			

                    }
                    break;

            }

            otherlv_26=(Token)match(input,32,FOLLOW_33); 

            			newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getVersionKeyword_12());
            		
            // InternalRequirementsDsl.g:747:3: ( (lv_version_27_0= ruleVersion ) )
            // InternalRequirementsDsl.g:748:4: (lv_version_27_0= ruleVersion )
            {
            // InternalRequirementsDsl.g:748:4: (lv_version_27_0= ruleVersion )
            // InternalRequirementsDsl.g:749:5: lv_version_27_0= ruleVersion
            {

            					newCompositeNode(grammarAccess.getRequirementAccess().getVersionVersionParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_34);
            lv_version_27_0=ruleVersion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRequirementRule());
            					}
            					set(
            						current,
            						"version",
            						lv_version_27_0,
            						"pt.isep.edom.RequirementsDsl.Version");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRequirementsDsl.g:766:3: (otherlv_28= 'children' otherlv_29= '{' ( (lv_children_30_0= ruleRequirement ) ) (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )* otherlv_33= '}' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==20) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalRequirementsDsl.g:767:4: otherlv_28= 'children' otherlv_29= '{' ( (lv_children_30_0= ruleRequirement ) ) (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )* otherlv_33= '}'
                    {
                    otherlv_28=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_28, grammarAccess.getRequirementAccess().getChildrenKeyword_14_0());
                    			
                    otherlv_29=(Token)match(input,12,FOLLOW_14); 

                    				newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_14_1());
                    			
                    // InternalRequirementsDsl.g:775:4: ( (lv_children_30_0= ruleRequirement ) )
                    // InternalRequirementsDsl.g:776:5: (lv_children_30_0= ruleRequirement )
                    {
                    // InternalRequirementsDsl.g:776:5: (lv_children_30_0= ruleRequirement )
                    // InternalRequirementsDsl.g:777:6: lv_children_30_0= ruleRequirement
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getChildrenRequirementParserRuleCall_14_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_children_30_0=ruleRequirement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"children",
                    							lv_children_30_0,
                    							"pt.isep.edom.RequirementsDsl.Requirement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsDsl.g:794:4: (otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==15) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalRequirementsDsl.g:795:5: otherlv_31= ',' ( (lv_children_32_0= ruleRequirement ) )
                    	    {
                    	    otherlv_31=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_31, grammarAccess.getRequirementAccess().getCommaKeyword_14_3_0());
                    	    				
                    	    // InternalRequirementsDsl.g:799:5: ( (lv_children_32_0= ruleRequirement ) )
                    	    // InternalRequirementsDsl.g:800:6: (lv_children_32_0= ruleRequirement )
                    	    {
                    	    // InternalRequirementsDsl.g:800:6: (lv_children_32_0= ruleRequirement )
                    	    // InternalRequirementsDsl.g:801:7: lv_children_32_0= ruleRequirement
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getChildrenRequirementParserRuleCall_14_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_children_32_0=ruleRequirement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"children",
                    	    								lv_children_32_0,
                    	    								"pt.isep.edom.RequirementsDsl.Requirement");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);

                    otherlv_33=(Token)match(input,16,FOLLOW_35); 

                    				newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_14_4());
                    			

                    }
                    break;

            }

            // InternalRequirementsDsl.g:824:3: (otherlv_34= 'comments' otherlv_35= '{' ( (lv_comments_36_0= ruleComment ) ) (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )* otherlv_39= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalRequirementsDsl.g:825:4: otherlv_34= 'comments' otherlv_35= '{' ( (lv_comments_36_0= ruleComment ) ) (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )* otherlv_39= '}'
                    {
                    otherlv_34=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_34, grammarAccess.getRequirementAccess().getCommentsKeyword_15_0());
                    			
                    otherlv_35=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_35, grammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalRequirementsDsl.g:833:4: ( (lv_comments_36_0= ruleComment ) )
                    // InternalRequirementsDsl.g:834:5: (lv_comments_36_0= ruleComment )
                    {
                    // InternalRequirementsDsl.g:834:5: (lv_comments_36_0= ruleComment )
                    // InternalRequirementsDsl.g:835:6: lv_comments_36_0= ruleComment
                    {

                    						newCompositeNode(grammarAccess.getRequirementAccess().getCommentsCommentParserRuleCall_15_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_comments_36_0=ruleComment();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRequirementRule());
                    						}
                    						add(
                    							current,
                    							"comments",
                    							lv_comments_36_0,
                    							"pt.isep.edom.RequirementsDsl.Comment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsDsl.g:852:4: (otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==15) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalRequirementsDsl.g:853:5: otherlv_37= ',' ( (lv_comments_38_0= ruleComment ) )
                    	    {
                    	    otherlv_37=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getCommaKeyword_15_3_0());
                    	    				
                    	    // InternalRequirementsDsl.g:857:5: ( (lv_comments_38_0= ruleComment ) )
                    	    // InternalRequirementsDsl.g:858:6: (lv_comments_38_0= ruleComment )
                    	    {
                    	    // InternalRequirementsDsl.g:858:6: (lv_comments_38_0= ruleComment )
                    	    // InternalRequirementsDsl.g:859:7: lv_comments_38_0= ruleComment
                    	    {

                    	    							newCompositeNode(grammarAccess.getRequirementAccess().getCommentsCommentParserRuleCall_15_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_comments_38_0=ruleComment();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"comments",
                    	    								lv_comments_38_0,
                    	    								"pt.isep.edom.RequirementsDsl.Comment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_39=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_39, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_15_4());
                    			

                    }
                    break;

            }

            otherlv_40=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_40, grammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_16());
            		

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


    // $ANTLR start "entryRuleEDate"
    // InternalRequirementsDsl.g:890:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalRequirementsDsl.g:890:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalRequirementsDsl.g:891:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalRequirementsDsl.g:897:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalRequirementsDsl.g:903:2: (this_STRING_0= RULE_STRING )
            // InternalRequirementsDsl.g:904:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getEDateAccess().getSTRINGTerminalRuleCall());
            	

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


    // $ANTLR start "entryRuleVersion"
    // InternalRequirementsDsl.g:914:1: entryRuleVersion returns [EObject current=null] : iv_ruleVersion= ruleVersion EOF ;
    public final EObject entryRuleVersion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVersion = null;


        try {
            // InternalRequirementsDsl.g:914:48: (iv_ruleVersion= ruleVersion EOF )
            // InternalRequirementsDsl.g:915:2: iv_ruleVersion= ruleVersion EOF
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
    // InternalRequirementsDsl.g:921:1: ruleVersion returns [EObject current=null] : (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' ) ;
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
            // InternalRequirementsDsl.g:927:2: ( (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' ) )
            // InternalRequirementsDsl.g:928:2: (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' )
            {
            // InternalRequirementsDsl.g:928:2: (otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}' )
            // InternalRequirementsDsl.g:929:3: otherlv_0= 'Version' otherlv_1= '{' otherlv_2= 'major' ( (lv_major_3_0= ruleEInt ) ) otherlv_4= 'minor' ( (lv_minor_5_0= ruleEInt ) ) otherlv_6= 'service' ( (lv_service_7_0= ruleEInt ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVersionAccess().getVersionKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_37); 

            			newLeafNode(otherlv_1, grammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,35,FOLLOW_38); 

            			newLeafNode(otherlv_2, grammarAccess.getVersionAccess().getMajorKeyword_2());
            		
            // InternalRequirementsDsl.g:941:3: ( (lv_major_3_0= ruleEInt ) )
            // InternalRequirementsDsl.g:942:4: (lv_major_3_0= ruleEInt )
            {
            // InternalRequirementsDsl.g:942:4: (lv_major_3_0= ruleEInt )
            // InternalRequirementsDsl.g:943:5: lv_major_3_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVersionAccess().getMajorEIntParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_39);
            lv_major_3_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionRule());
            					}
            					set(
            						current,
            						"major",
            						lv_major_3_0,
            						"pt.isep.edom.RequirementsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,36,FOLLOW_38); 

            			newLeafNode(otherlv_4, grammarAccess.getVersionAccess().getMinorKeyword_4());
            		
            // InternalRequirementsDsl.g:964:3: ( (lv_minor_5_0= ruleEInt ) )
            // InternalRequirementsDsl.g:965:4: (lv_minor_5_0= ruleEInt )
            {
            // InternalRequirementsDsl.g:965:4: (lv_minor_5_0= ruleEInt )
            // InternalRequirementsDsl.g:966:5: lv_minor_5_0= ruleEInt
            {

            					newCompositeNode(grammarAccess.getVersionAccess().getMinorEIntParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_40);
            lv_minor_5_0=ruleEInt();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVersionRule());
            					}
            					set(
            						current,
            						"minor",
            						lv_minor_5_0,
            						"pt.isep.edom.RequirementsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,37,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getVersionAccess().getServiceKeyword_6());
            		
            // InternalRequirementsDsl.g:987:3: ( (lv_service_7_0= ruleEInt ) )
            // InternalRequirementsDsl.g:988:4: (lv_service_7_0= ruleEInt )
            {
            // InternalRequirementsDsl.g:988:4: (lv_service_7_0= ruleEInt )
            // InternalRequirementsDsl.g:989:5: lv_service_7_0= ruleEInt
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
            						"pt.isep.edom.RequirementsDsl.EInt");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

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
    // InternalRequirementsDsl.g:1014:1: entryRuleComment returns [EObject current=null] : iv_ruleComment= ruleComment EOF ;
    public final EObject entryRuleComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComment = null;


        try {
            // InternalRequirementsDsl.g:1014:48: (iv_ruleComment= ruleComment EOF )
            // InternalRequirementsDsl.g:1015:2: iv_ruleComment= ruleComment EOF
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
    // InternalRequirementsDsl.g:1021:1: ruleComment returns [EObject current=null] : ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) ;
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
            // InternalRequirementsDsl.g:1027:2: ( ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' ) )
            // InternalRequirementsDsl.g:1028:2: ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            {
            // InternalRequirementsDsl.g:1028:2: ( () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}' )
            // InternalRequirementsDsl.g:1029:3: () otherlv_1= 'Comment' otherlv_2= '{' (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )? (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )? (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )? (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )? (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )? otherlv_17= '}'
            {
            // InternalRequirementsDsl.g:1029:3: ()
            // InternalRequirementsDsl.g:1030:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getCommentAccess().getCommentAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,38,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCommentAccess().getCommentKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_41); 

            			newLeafNode(otherlv_2, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalRequirementsDsl.g:1044:3: (otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalRequirementsDsl.g:1045:4: otherlv_3= 'subject' ( (lv_subject_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,39,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getCommentAccess().getSubjectKeyword_3_0());
                    			
                    // InternalRequirementsDsl.g:1049:4: ( (lv_subject_4_0= ruleEString ) )
                    // InternalRequirementsDsl.g:1050:5: (lv_subject_4_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:1050:5: (lv_subject_4_0= ruleEString )
                    // InternalRequirementsDsl.g:1051:6: lv_subject_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getSubjectEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_42);
                    lv_subject_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"subject",
                    							lv_subject_4_0,
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:1069:3: (otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalRequirementsDsl.g:1070:4: otherlv_5= 'body' ( (lv_body_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,40,FOLLOW_5); 

                    				newLeafNode(otherlv_5, grammarAccess.getCommentAccess().getBodyKeyword_4_0());
                    			
                    // InternalRequirementsDsl.g:1074:4: ( (lv_body_6_0= ruleEString ) )
                    // InternalRequirementsDsl.g:1075:5: (lv_body_6_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:1075:5: (lv_body_6_0= ruleEString )
                    // InternalRequirementsDsl.g:1076:6: lv_body_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getBodyEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_43);
                    lv_body_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_6_0,
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:1094:3: (otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==25) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalRequirementsDsl.g:1095:4: otherlv_7= 'author' ( (lv_author_8_0= ruleEString ) )
                    {
                    otherlv_7=(Token)match(input,25,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getCommentAccess().getAuthorKeyword_5_0());
                    			
                    // InternalRequirementsDsl.g:1099:4: ( (lv_author_8_0= ruleEString ) )
                    // InternalRequirementsDsl.g:1100:5: (lv_author_8_0= ruleEString )
                    {
                    // InternalRequirementsDsl.g:1100:5: (lv_author_8_0= ruleEString )
                    // InternalRequirementsDsl.g:1101:6: lv_author_8_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getAuthorEStringParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_44);
                    lv_author_8_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"author",
                    							lv_author_8_0,
                    							"pt.isep.edom.RequirementsDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:1119:3: (otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalRequirementsDsl.g:1120:4: otherlv_9= 'created' ( (lv_created_10_0= ruleEDate ) )
                    {
                    otherlv_9=(Token)match(input,26,FOLLOW_23); 

                    				newLeafNode(otherlv_9, grammarAccess.getCommentAccess().getCreatedKeyword_6_0());
                    			
                    // InternalRequirementsDsl.g:1124:4: ( (lv_created_10_0= ruleEDate ) )
                    // InternalRequirementsDsl.g:1125:5: (lv_created_10_0= ruleEDate )
                    {
                    // InternalRequirementsDsl.g:1125:5: (lv_created_10_0= ruleEDate )
                    // InternalRequirementsDsl.g:1126:6: lv_created_10_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getCommentAccess().getCreatedEDateParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_45);
                    lv_created_10_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCommentRule());
                    						}
                    						set(
                    							current,
                    							"created",
                    							lv_created_10_0,
                    							"pt.isep.edom.RequirementsDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRequirementsDsl.g:1144:3: (otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalRequirementsDsl.g:1145:4: otherlv_11= 'children' otherlv_12= '{' ( (lv_children_13_0= ruleComment ) ) (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )* otherlv_16= '}'
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getCommentAccess().getChildrenKeyword_7_0());
                    			
                    otherlv_12=(Token)match(input,12,FOLLOW_36); 

                    				newLeafNode(otherlv_12, grammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalRequirementsDsl.g:1153:4: ( (lv_children_13_0= ruleComment ) )
                    // InternalRequirementsDsl.g:1154:5: (lv_children_13_0= ruleComment )
                    {
                    // InternalRequirementsDsl.g:1154:5: (lv_children_13_0= ruleComment )
                    // InternalRequirementsDsl.g:1155:6: lv_children_13_0= ruleComment
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
                    							"pt.isep.edom.RequirementsDsl.Comment");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRequirementsDsl.g:1172:4: (otherlv_14= ',' ( (lv_children_15_0= ruleComment ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==15) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalRequirementsDsl.g:1173:5: otherlv_14= ',' ( (lv_children_15_0= ruleComment ) )
                    	    {
                    	    otherlv_14=(Token)match(input,15,FOLLOW_36); 

                    	    					newLeafNode(otherlv_14, grammarAccess.getCommentAccess().getCommaKeyword_7_3_0());
                    	    				
                    	    // InternalRequirementsDsl.g:1177:5: ( (lv_children_15_0= ruleComment ) )
                    	    // InternalRequirementsDsl.g:1178:6: (lv_children_15_0= ruleComment )
                    	    {
                    	    // InternalRequirementsDsl.g:1178:6: (lv_children_15_0= ruleComment )
                    	    // InternalRequirementsDsl.g:1179:7: lv_children_15_0= ruleComment
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
                    	    								"pt.isep.edom.RequirementsDsl.Comment");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_16=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_16, grammarAccess.getCommentAccess().getRightCurlyBracketKeyword_7_4());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,16,FOLLOW_2); 

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


    // $ANTLR start "entryRuleEInt"
    // InternalRequirementsDsl.g:1210:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // InternalRequirementsDsl.g:1210:44: (iv_ruleEInt= ruleEInt EOF )
            // InternalRequirementsDsl.g:1211:2: iv_ruleEInt= ruleEInt EOF
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
    // InternalRequirementsDsl.g:1217:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;


        	enterRule();

        try {
            // InternalRequirementsDsl.g:1223:2: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // InternalRequirementsDsl.g:1224:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // InternalRequirementsDsl.g:1224:2: ( (kw= '-' )? this_INT_1= RULE_INT )
            // InternalRequirementsDsl.g:1225:3: (kw= '-' )? this_INT_1= RULE_INT
            {
            // InternalRequirementsDsl.g:1225:3: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==41) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalRequirementsDsl.g:1226:4: kw= '-'
                    {
                    kw=(Token)match(input,41,FOLLOW_46); 

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
    // InternalRequirementsDsl.g:1243:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalRequirementsDsl.g:1249:2: ( ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) ) )
            // InternalRequirementsDsl.g:1250:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) )
            {
            // InternalRequirementsDsl.g:1250:2: ( (enumLiteral_0= 'FUNCTIONAL' ) | (enumLiteral_1= 'NONFUNCTIONAL' ) )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==42) ) {
                alt33=1;
            }
            else if ( (LA33_0==43) ) {
                alt33=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalRequirementsDsl.g:1251:3: (enumLiteral_0= 'FUNCTIONAL' )
                    {
                    // InternalRequirementsDsl.g:1251:3: (enumLiteral_0= 'FUNCTIONAL' )
                    // InternalRequirementsDsl.g:1252:4: enumLiteral_0= 'FUNCTIONAL'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getFUNCTIONALEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsDsl.g:1259:3: (enumLiteral_1= 'NONFUNCTIONAL' )
                    {
                    // InternalRequirementsDsl.g:1259:3: (enumLiteral_1= 'NONFUNCTIONAL' )
                    // InternalRequirementsDsl.g:1260:4: enumLiteral_1= 'NONFUNCTIONAL'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalRequirementsDsl.g:1270:1: rulePriority returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) ;
    public final Enumerator rulePriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRequirementsDsl.g:1276:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) )
            // InternalRequirementsDsl.g:1277:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            {
            // InternalRequirementsDsl.g:1277:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt34=1;
                }
                break;
            case 45:
                {
                alt34=2;
                }
                break;
            case 46:
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
                    // InternalRequirementsDsl.g:1278:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalRequirementsDsl.g:1278:3: (enumLiteral_0= 'HIGH' )
                    // InternalRequirementsDsl.g:1279:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getPriorityAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsDsl.g:1286:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalRequirementsDsl.g:1286:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalRequirementsDsl.g:1287:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getPriorityAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPriorityAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsDsl.g:1294:3: (enumLiteral_2= 'LOW' )
                    {
                    // InternalRequirementsDsl.g:1294:3: (enumLiteral_2= 'LOW' )
                    // InternalRequirementsDsl.g:1295:4: enumLiteral_2= 'LOW'
                    {
                    enumLiteral_2=(Token)match(input,46,FOLLOW_2); 

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
    // InternalRequirementsDsl.g:1305:1: ruleState returns [Enumerator current=null] : ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) ) ;
    public final Enumerator ruleState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRequirementsDsl.g:1311:2: ( ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) ) )
            // InternalRequirementsDsl.g:1312:2: ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) )
            {
            // InternalRequirementsDsl.g:1312:2: ( (enumLiteral_0= 'NEW' ) | (enumLiteral_1= 'REVIEWED' ) | (enumLiteral_2= 'APPROVED' ) | (enumLiteral_3= 'RESOLVED' ) )
            int alt35=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt35=1;
                }
                break;
            case 48:
                {
                alt35=2;
                }
                break;
            case 49:
                {
                alt35=3;
                }
                break;
            case 50:
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
                    // InternalRequirementsDsl.g:1313:3: (enumLiteral_0= 'NEW' )
                    {
                    // InternalRequirementsDsl.g:1313:3: (enumLiteral_0= 'NEW' )
                    // InternalRequirementsDsl.g:1314:4: enumLiteral_0= 'NEW'
                    {
                    enumLiteral_0=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getNEWEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getStateAccess().getNEWEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsDsl.g:1321:3: (enumLiteral_1= 'REVIEWED' )
                    {
                    // InternalRequirementsDsl.g:1321:3: (enumLiteral_1= 'REVIEWED' )
                    // InternalRequirementsDsl.g:1322:4: enumLiteral_1= 'REVIEWED'
                    {
                    enumLiteral_1=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getREVIEWEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getStateAccess().getREVIEWEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsDsl.g:1329:3: (enumLiteral_2= 'APPROVED' )
                    {
                    // InternalRequirementsDsl.g:1329:3: (enumLiteral_2= 'APPROVED' )
                    // InternalRequirementsDsl.g:1330:4: enumLiteral_2= 'APPROVED'
                    {
                    enumLiteral_2=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getStateAccess().getAPPROVEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getStateAccess().getAPPROVEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsDsl.g:1337:3: (enumLiteral_3= 'RESOLVED' )
                    {
                    // InternalRequirementsDsl.g:1337:3: (enumLiteral_3= 'RESOLVED' )
                    // InternalRequirementsDsl.g:1338:4: enumLiteral_3= 'RESOLVED'
                    {
                    enumLiteral_3=(Token)match(input,50,FOLLOW_2); 

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
    // InternalRequirementsDsl.g:1348:1: ruleResolution returns [Enumerator current=null] : ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) ) ;
    public final Enumerator ruleResolution() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalRequirementsDsl.g:1354:2: ( ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) ) )
            // InternalRequirementsDsl.g:1355:2: ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) )
            {
            // InternalRequirementsDsl.g:1355:2: ( (enumLiteral_0= 'INVALID' ) | (enumLiteral_1= 'ACCEPTED' ) | (enumLiteral_2= 'IMPLEMENTED' ) | (enumLiteral_3= 'LATER' ) )
            int alt36=4;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt36=1;
                }
                break;
            case 52:
                {
                alt36=2;
                }
                break;
            case 53:
                {
                alt36=3;
                }
                break;
            case 54:
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
                    // InternalRequirementsDsl.g:1356:3: (enumLiteral_0= 'INVALID' )
                    {
                    // InternalRequirementsDsl.g:1356:3: (enumLiteral_0= 'INVALID' )
                    // InternalRequirementsDsl.g:1357:4: enumLiteral_0= 'INVALID'
                    {
                    enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getResolutionAccess().getINVALIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getResolutionAccess().getINVALIDEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRequirementsDsl.g:1364:3: (enumLiteral_1= 'ACCEPTED' )
                    {
                    // InternalRequirementsDsl.g:1364:3: (enumLiteral_1= 'ACCEPTED' )
                    // InternalRequirementsDsl.g:1365:4: enumLiteral_1= 'ACCEPTED'
                    {
                    enumLiteral_1=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getResolutionAccess().getACCEPTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getResolutionAccess().getACCEPTEDEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRequirementsDsl.g:1372:3: (enumLiteral_2= 'IMPLEMENTED' )
                    {
                    // InternalRequirementsDsl.g:1372:3: (enumLiteral_2= 'IMPLEMENTED' )
                    // InternalRequirementsDsl.g:1373:4: enumLiteral_2= 'IMPLEMENTED'
                    {
                    enumLiteral_2=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getResolutionAccess().getIMPLEMENTEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getResolutionAccess().getIMPLEMENTEDEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRequirementsDsl.g:1380:3: (enumLiteral_3= 'LATER' )
                    {
                    // InternalRequirementsDsl.g:1380:3: (enumLiteral_3= 'LATER' )
                    // InternalRequirementsDsl.g:1381:4: enumLiteral_3= 'LATER'
                    {
                    enumLiteral_3=(Token)match(input,54,FOLLOW_2); 

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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003D0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000390000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000310000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000013F8C2000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000013F8C0000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000013F880000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000000013F080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000013E080000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000013C080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000138080000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000138000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0007800000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000130000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000120000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080008000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000200110000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200010000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000020000000040L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000018006110000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000010006110000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000006110000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000004110000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000040L});

}