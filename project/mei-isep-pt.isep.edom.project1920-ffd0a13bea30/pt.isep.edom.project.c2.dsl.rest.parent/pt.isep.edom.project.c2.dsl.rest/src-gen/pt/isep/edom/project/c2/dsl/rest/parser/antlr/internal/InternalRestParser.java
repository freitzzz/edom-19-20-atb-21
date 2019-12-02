package pt.isep.edom.project.c2.dsl.rest.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.edom.project.c2.dsl.rest.services.RestGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRestParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'RestModel'", "'{'", "'url'", "'resources'", "','", "'}'", "'put'", "'post'", "'delete'", "'get'", "'Resource'", "'entity'", "'reference'", "'('", "')'", "'subresource'"
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

        public InternalRestParser(TokenStream input, RestGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "RestModel";
       	}

       	@Override
       	protected RestGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleRestModel"
    // InternalRest.g:64:1: entryRuleRestModel returns [EObject current=null] : iv_ruleRestModel= ruleRestModel EOF ;
    public final EObject entryRuleRestModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestModel = null;


        try {
            // InternalRest.g:64:50: (iv_ruleRestModel= ruleRestModel EOF )
            // InternalRest.g:65:2: iv_ruleRestModel= ruleRestModel EOF
            {
             newCompositeNode(grammarAccess.getRestModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRestModel=ruleRestModel();

            state._fsp--;

             current =iv_ruleRestModel; 
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
    // $ANTLR end "entryRuleRestModel"


    // $ANTLR start "ruleRestModel"
    // InternalRest.g:71:1: ruleRestModel returns [EObject current=null] : ( () otherlv_1= 'RestModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'resources' otherlv_7= '{' ( (lv_resources_8_0= ruleResource ) ) (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleRestModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_url_5_0 = null;

        EObject lv_resources_8_0 = null;

        EObject lv_resources_10_0 = null;



        	enterRule();

        try {
            // InternalRest.g:77:2: ( ( () otherlv_1= 'RestModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'resources' otherlv_7= '{' ( (lv_resources_8_0= ruleResource ) ) (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalRest.g:78:2: ( () otherlv_1= 'RestModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'resources' otherlv_7= '{' ( (lv_resources_8_0= ruleResource ) ) (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalRest.g:78:2: ( () otherlv_1= 'RestModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'resources' otherlv_7= '{' ( (lv_resources_8_0= ruleResource ) ) (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalRest.g:79:3: () otherlv_1= 'RestModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )? (otherlv_6= 'resources' otherlv_7= '{' ( (lv_resources_8_0= ruleResource ) ) (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalRest.g:79:3: ()
            // InternalRest.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getRestModelAccess().getRestModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getRestModelAccess().getRestModelKeyword_1());
            		
            // InternalRest.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalRest.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalRest.g:91:4: (lv_name_2_0= ruleEString )
            // InternalRest.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRestModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRestModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c2.dsl.rest.Rest.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalRest.g:113:3: (otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalRest.g:114:4: otherlv_4= 'url' ( (lv_url_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getRestModelAccess().getUrlKeyword_4_0());
                    			
                    // InternalRest.g:118:4: ( (lv_url_5_0= ruleEString ) )
                    // InternalRest.g:119:5: (lv_url_5_0= ruleEString )
                    {
                    // InternalRest.g:119:5: (lv_url_5_0= ruleEString )
                    // InternalRest.g:120:6: lv_url_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getRestModelAccess().getUrlEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_url_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestModelRule());
                    						}
                    						set(
                    							current,
                    							"url",
                    							lv_url_5_0,
                    							"pt.isep.edom.project.c2.dsl.rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:138:3: (otherlv_6= 'resources' otherlv_7= '{' ( (lv_resources_8_0= ruleResource ) ) (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )* otherlv_11= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRest.g:139:4: otherlv_6= 'resources' otherlv_7= '{' ( (lv_resources_8_0= ruleResource ) ) (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getRestModelAccess().getResourcesKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getRestModelAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalRest.g:147:4: ( (lv_resources_8_0= ruleResource ) )
                    // InternalRest.g:148:5: (lv_resources_8_0= ruleResource )
                    {
                    // InternalRest.g:148:5: (lv_resources_8_0= ruleResource )
                    // InternalRest.g:149:6: lv_resources_8_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getRestModelAccess().getResourcesResourceParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_resources_8_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRestModelRule());
                    						}
                    						add(
                    							current,
                    							"resources",
                    							lv_resources_8_0,
                    							"pt.isep.edom.project.c2.dsl.rest.Rest.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:166:4: (otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalRest.g:167:5: otherlv_9= ',' ( (lv_resources_10_0= ruleResource ) )
                    	    {
                    	    otherlv_9=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getRestModelAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalRest.g:171:5: ( (lv_resources_10_0= ruleResource ) )
                    	    // InternalRest.g:172:6: (lv_resources_10_0= ruleResource )
                    	    {
                    	    // InternalRest.g:172:6: (lv_resources_10_0= ruleResource )
                    	    // InternalRest.g:173:7: lv_resources_10_0= ruleResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getRestModelAccess().getResourcesResourceParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_resources_10_0=ruleResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getRestModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"resources",
                    	    								lv_resources_10_0,
                    	    								"pt.isep.edom.project.c2.dsl.rest.Rest.Resource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_11, grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getRestModelAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleRestModel"


    // $ANTLR start "entryRuleEString"
    // InternalRest.g:204:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalRest.g:204:47: (iv_ruleEString= ruleEString EOF )
            // InternalRest.g:205:2: iv_ruleEString= ruleEString EOF
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
    // InternalRest.g:211:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalRest.g:217:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalRest.g:218:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalRest.g:218:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalRest.g:219:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalRest.g:227:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleResource"
    // InternalRest.g:238:1: entryRuleResource returns [EObject current=null] : iv_ruleResource= ruleResource EOF ;
    public final EObject entryRuleResource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResource = null;


        try {
            // InternalRest.g:238:49: (iv_ruleResource= ruleResource EOF )
            // InternalRest.g:239:2: iv_ruleResource= ruleResource EOF
            {
             newCompositeNode(grammarAccess.getResourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleResource=ruleResource();

            state._fsp--;

             current =iv_ruleResource; 
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
    // $ANTLR end "entryRuleResource"


    // $ANTLR start "ruleResource"
    // InternalRest.g:245:1: ruleResource returns [EObject current=null] : ( () ( (lv_put_1_0= 'put' ) )? ( (lv_post_2_0= 'post' ) )? ( (lv_delete_3_0= 'delete' ) )? ( (lv_get_4_0= 'get' ) )? otherlv_5= 'Resource' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'entity' ( (lv_entity_9_0= ruleEString ) ) )? (otherlv_10= 'reference' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'subresource' otherlv_17= '{' ( (lv_subresource_18_0= ruleResource ) ) (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) ;
    public final EObject ruleResource() throws RecognitionException {
        EObject current = null;

        Token lv_put_1_0=null;
        Token lv_post_2_0=null;
        Token lv_delete_3_0=null;
        Token lv_get_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_name_6_0 = null;

        AntlrDatatypeRuleToken lv_entity_9_0 = null;

        EObject lv_subresource_18_0 = null;

        EObject lv_subresource_20_0 = null;



        	enterRule();

        try {
            // InternalRest.g:251:2: ( ( () ( (lv_put_1_0= 'put' ) )? ( (lv_post_2_0= 'post' ) )? ( (lv_delete_3_0= 'delete' ) )? ( (lv_get_4_0= 'get' ) )? otherlv_5= 'Resource' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'entity' ( (lv_entity_9_0= ruleEString ) ) )? (otherlv_10= 'reference' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'subresource' otherlv_17= '{' ( (lv_subresource_18_0= ruleResource ) ) (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )* otherlv_21= '}' )? otherlv_22= '}' ) )
            // InternalRest.g:252:2: ( () ( (lv_put_1_0= 'put' ) )? ( (lv_post_2_0= 'post' ) )? ( (lv_delete_3_0= 'delete' ) )? ( (lv_get_4_0= 'get' ) )? otherlv_5= 'Resource' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'entity' ( (lv_entity_9_0= ruleEString ) ) )? (otherlv_10= 'reference' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'subresource' otherlv_17= '{' ( (lv_subresource_18_0= ruleResource ) ) (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            {
            // InternalRest.g:252:2: ( () ( (lv_put_1_0= 'put' ) )? ( (lv_post_2_0= 'post' ) )? ( (lv_delete_3_0= 'delete' ) )? ( (lv_get_4_0= 'get' ) )? otherlv_5= 'Resource' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'entity' ( (lv_entity_9_0= ruleEString ) ) )? (otherlv_10= 'reference' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'subresource' otherlv_17= '{' ( (lv_subresource_18_0= ruleResource ) ) (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )* otherlv_21= '}' )? otherlv_22= '}' )
            // InternalRest.g:253:3: () ( (lv_put_1_0= 'put' ) )? ( (lv_post_2_0= 'post' ) )? ( (lv_delete_3_0= 'delete' ) )? ( (lv_get_4_0= 'get' ) )? otherlv_5= 'Resource' ( (lv_name_6_0= ruleEString ) ) otherlv_7= '{' (otherlv_8= 'entity' ( (lv_entity_9_0= ruleEString ) ) )? (otherlv_10= 'reference' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )? (otherlv_16= 'subresource' otherlv_17= '{' ( (lv_subresource_18_0= ruleResource ) ) (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )* otherlv_21= '}' )? otherlv_22= '}'
            {
            // InternalRest.g:253:3: ()
            // InternalRest.g:254:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getResourceAccess().getResourceAction_0(),
            					current);
            			

            }

            // InternalRest.g:260:3: ( (lv_put_1_0= 'put' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRest.g:261:4: (lv_put_1_0= 'put' )
                    {
                    // InternalRest.g:261:4: (lv_put_1_0= 'put' )
                    // InternalRest.g:262:5: lv_put_1_0= 'put'
                    {
                    lv_put_1_0=(Token)match(input,17,FOLLOW_10); 

                    					newLeafNode(lv_put_1_0, grammarAccess.getResourceAccess().getPutPutKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourceRule());
                    					}
                    					setWithLastConsumed(current, "put", true, "put");
                    				

                    }


                    }
                    break;

            }

            // InternalRest.g:274:3: ( (lv_post_2_0= 'post' ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRest.g:275:4: (lv_post_2_0= 'post' )
                    {
                    // InternalRest.g:275:4: (lv_post_2_0= 'post' )
                    // InternalRest.g:276:5: lv_post_2_0= 'post'
                    {
                    lv_post_2_0=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(lv_post_2_0, grammarAccess.getResourceAccess().getPostPostKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourceRule());
                    					}
                    					setWithLastConsumed(current, "post", true, "post");
                    				

                    }


                    }
                    break;

            }

            // InternalRest.g:288:3: ( (lv_delete_3_0= 'delete' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalRest.g:289:4: (lv_delete_3_0= 'delete' )
                    {
                    // InternalRest.g:289:4: (lv_delete_3_0= 'delete' )
                    // InternalRest.g:290:5: lv_delete_3_0= 'delete'
                    {
                    lv_delete_3_0=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(lv_delete_3_0, grammarAccess.getResourceAccess().getDeleteDeleteKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourceRule());
                    					}
                    					setWithLastConsumed(current, "delete", true, "delete");
                    				

                    }


                    }
                    break;

            }

            // InternalRest.g:302:3: ( (lv_get_4_0= 'get' ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalRest.g:303:4: (lv_get_4_0= 'get' )
                    {
                    // InternalRest.g:303:4: (lv_get_4_0= 'get' )
                    // InternalRest.g:304:5: lv_get_4_0= 'get'
                    {
                    lv_get_4_0=(Token)match(input,20,FOLLOW_13); 

                    					newLeafNode(lv_get_4_0, grammarAccess.getResourceAccess().getGetGetKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getResourceRule());
                    					}
                    					setWithLastConsumed(current, "get", true, "get");
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getResourceAccess().getResourceKeyword_5());
            		
            // InternalRest.g:320:3: ( (lv_name_6_0= ruleEString ) )
            // InternalRest.g:321:4: (lv_name_6_0= ruleEString )
            {
            // InternalRest.g:321:4: (lv_name_6_0= ruleEString )
            // InternalRest.g:322:5: lv_name_6_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getResourceAccess().getNameEStringParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_6_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getResourceRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_6_0,
            						"pt.isep.edom.project.c2.dsl.rest.Rest.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_7, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalRest.g:343:3: (otherlv_8= 'entity' ( (lv_entity_9_0= ruleEString ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalRest.g:344:4: otherlv_8= 'entity' ( (lv_entity_9_0= ruleEString ) )
                    {
                    otherlv_8=(Token)match(input,22,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getResourceAccess().getEntityKeyword_8_0());
                    			
                    // InternalRest.g:348:4: ( (lv_entity_9_0= ruleEString ) )
                    // InternalRest.g:349:5: (lv_entity_9_0= ruleEString )
                    {
                    // InternalRest.g:349:5: (lv_entity_9_0= ruleEString )
                    // InternalRest.g:350:6: lv_entity_9_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getEntityEStringParserRuleCall_8_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_entity_9_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						set(
                    							current,
                    							"entity",
                    							lv_entity_9_0,
                    							"pt.isep.edom.project.c2.dsl.rest.Rest.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalRest.g:368:3: (otherlv_10= 'reference' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalRest.g:369:4: otherlv_10= 'reference' otherlv_11= '(' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* otherlv_15= ')'
                    {
                    otherlv_10=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_10, grammarAccess.getResourceAccess().getReferenceKeyword_9_0());
                    			
                    otherlv_11=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getResourceAccess().getLeftParenthesisKeyword_9_1());
                    			
                    // InternalRest.g:377:4: ( ( ruleEString ) )
                    // InternalRest.g:378:5: ( ruleEString )
                    {
                    // InternalRest.g:378:5: ( ruleEString )
                    // InternalRest.g:379:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getResourceRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getResourceAccess().getReferenceResourceCrossReference_9_2_0());
                    					
                    pushFollow(FOLLOW_17);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:393:4: (otherlv_13= ',' ( ( ruleEString ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==15) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalRest.g:394:5: otherlv_13= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_13, grammarAccess.getResourceAccess().getCommaKeyword_9_3_0());
                    	    				
                    	    // InternalRest.g:398:5: ( ( ruleEString ) )
                    	    // InternalRest.g:399:6: ( ruleEString )
                    	    {
                    	    // InternalRest.g:399:6: ( ruleEString )
                    	    // InternalRest.g:400:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getResourceRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getReferenceResourceCrossReference_9_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_17);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_15=(Token)match(input,25,FOLLOW_18); 

                    				newLeafNode(otherlv_15, grammarAccess.getResourceAccess().getRightParenthesisKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalRest.g:420:3: (otherlv_16= 'subresource' otherlv_17= '{' ( (lv_subresource_18_0= ruleResource ) ) (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )* otherlv_21= '}' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==26) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRest.g:421:4: otherlv_16= 'subresource' otherlv_17= '{' ( (lv_subresource_18_0= ruleResource ) ) (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )* otherlv_21= '}'
                    {
                    otherlv_16=(Token)match(input,26,FOLLOW_4); 

                    				newLeafNode(otherlv_16, grammarAccess.getResourceAccess().getSubresourceKeyword_10_0());
                    			
                    otherlv_17=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getResourceAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalRest.g:429:4: ( (lv_subresource_18_0= ruleResource ) )
                    // InternalRest.g:430:5: (lv_subresource_18_0= ruleResource )
                    {
                    // InternalRest.g:430:5: (lv_subresource_18_0= ruleResource )
                    // InternalRest.g:431:6: lv_subresource_18_0= ruleResource
                    {

                    						newCompositeNode(grammarAccess.getResourceAccess().getSubresourceResourceParserRuleCall_10_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_subresource_18_0=ruleResource();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getResourceRule());
                    						}
                    						add(
                    							current,
                    							"subresource",
                    							lv_subresource_18_0,
                    							"pt.isep.edom.project.c2.dsl.rest.Rest.Resource");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRest.g:448:4: (otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalRest.g:449:5: otherlv_19= ',' ( (lv_subresource_20_0= ruleResource ) )
                    	    {
                    	    otherlv_19=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getResourceAccess().getCommaKeyword_10_3_0());
                    	    				
                    	    // InternalRest.g:453:5: ( (lv_subresource_20_0= ruleResource ) )
                    	    // InternalRest.g:454:6: (lv_subresource_20_0= ruleResource )
                    	    {
                    	    // InternalRest.g:454:6: (lv_subresource_20_0= ruleResource )
                    	    // InternalRest.g:455:7: lv_subresource_20_0= ruleResource
                    	    {

                    	    							newCompositeNode(grammarAccess.getResourceAccess().getSubresourceResourceParserRuleCall_10_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_subresource_20_0=ruleResource();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getResourceRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subresource",
                    	    								lv_subresource_20_0,
                    	    								"pt.isep.edom.project.c2.dsl.rest.Rest.Resource");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_21, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_22=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getResourceAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleResource"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004C10000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002008000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004010000L});

}