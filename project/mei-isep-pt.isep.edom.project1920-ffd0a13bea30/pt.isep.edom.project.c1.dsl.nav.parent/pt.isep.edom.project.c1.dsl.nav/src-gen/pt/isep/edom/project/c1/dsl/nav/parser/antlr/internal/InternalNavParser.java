package pt.isep.edom.project.c1.dsl.nav.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import pt.isep.edom.project.c1.dsl.nav.services.NavGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNavParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NavModel'", "'{'", "'menu'", "'}'", "'Menu'", "'pages'", "','", "'Page'"
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

        public InternalNavParser(TokenStream input, NavGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "NavModel";
       	}

       	@Override
       	protected NavGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleNavModel"
    // InternalNav.g:64:1: entryRuleNavModel returns [EObject current=null] : iv_ruleNavModel= ruleNavModel EOF ;
    public final EObject entryRuleNavModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavModel = null;


        try {
            // InternalNav.g:64:49: (iv_ruleNavModel= ruleNavModel EOF )
            // InternalNav.g:65:2: iv_ruleNavModel= ruleNavModel EOF
            {
             newCompositeNode(grammarAccess.getNavModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavModel=ruleNavModel();

            state._fsp--;

             current =iv_ruleNavModel; 
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
    // $ANTLR end "entryRuleNavModel"


    // $ANTLR start "ruleNavModel"
    // InternalNav.g:71:1: ruleNavModel returns [EObject current=null] : ( () otherlv_1= 'NavModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'menu' ( (lv_menu_5_0= ruleMenu ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleNavModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_menu_5_0 = null;



        	enterRule();

        try {
            // InternalNav.g:77:2: ( ( () otherlv_1= 'NavModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'menu' ( (lv_menu_5_0= ruleMenu ) ) )? otherlv_6= '}' ) )
            // InternalNav.g:78:2: ( () otherlv_1= 'NavModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'menu' ( (lv_menu_5_0= ruleMenu ) ) )? otherlv_6= '}' )
            {
            // InternalNav.g:78:2: ( () otherlv_1= 'NavModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'menu' ( (lv_menu_5_0= ruleMenu ) ) )? otherlv_6= '}' )
            // InternalNav.g:79:3: () otherlv_1= 'NavModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'menu' ( (lv_menu_5_0= ruleMenu ) ) )? otherlv_6= '}'
            {
            // InternalNav.g:79:3: ()
            // InternalNav.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNavModelAccess().getNavModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getNavModelAccess().getNavModelKeyword_1());
            		
            // InternalNav.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNav.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalNav.g:91:4: (lv_name_2_0= ruleEString )
            // InternalNav.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getNavModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c1.dsl.nav.Nav.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getNavModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalNav.g:113:3: (otherlv_4= 'menu' ( (lv_menu_5_0= ruleMenu ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalNav.g:114:4: otherlv_4= 'menu' ( (lv_menu_5_0= ruleMenu ) )
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_4, grammarAccess.getNavModelAccess().getMenuKeyword_4_0());
                    			
                    // InternalNav.g:118:4: ( (lv_menu_5_0= ruleMenu ) )
                    // InternalNav.g:119:5: (lv_menu_5_0= ruleMenu )
                    {
                    // InternalNav.g:119:5: (lv_menu_5_0= ruleMenu )
                    // InternalNav.g:120:6: lv_menu_5_0= ruleMenu
                    {

                    						newCompositeNode(grammarAccess.getNavModelAccess().getMenuMenuParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_menu_5_0=ruleMenu();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getNavModelRule());
                    						}
                    						set(
                    							current,
                    							"menu",
                    							lv_menu_5_0,
                    							"pt.isep.edom.project.c1.dsl.nav.Nav.Menu");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getNavModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleNavModel"


    // $ANTLR start "entryRuleEString"
    // InternalNav.g:146:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalNav.g:146:47: (iv_ruleEString= ruleEString EOF )
            // InternalNav.g:147:2: iv_ruleEString= ruleEString EOF
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
    // InternalNav.g:153:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalNav.g:159:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalNav.g:160:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalNav.g:160:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalNav.g:161:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalNav.g:169:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleMenu"
    // InternalNav.g:180:1: entryRuleMenu returns [EObject current=null] : iv_ruleMenu= ruleMenu EOF ;
    public final EObject entryRuleMenu() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMenu = null;


        try {
            // InternalNav.g:180:45: (iv_ruleMenu= ruleMenu EOF )
            // InternalNav.g:181:2: iv_ruleMenu= ruleMenu EOF
            {
             newCompositeNode(grammarAccess.getMenuRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMenu=ruleMenu();

            state._fsp--;

             current =iv_ruleMenu; 
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
    // $ANTLR end "entryRuleMenu"


    // $ANTLR start "ruleMenu"
    // InternalNav.g:187:1: ruleMenu returns [EObject current=null] : ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_pages_6_0= rulePage ) ) (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleMenu() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_pages_6_0 = null;

        EObject lv_pages_8_0 = null;



        	enterRule();

        try {
            // InternalNav.g:193:2: ( ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_pages_6_0= rulePage ) ) (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalNav.g:194:2: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_pages_6_0= rulePage ) ) (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalNav.g:194:2: ( () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_pages_6_0= rulePage ) ) (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalNav.g:195:3: () otherlv_1= 'Menu' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'pages' otherlv_5= '{' ( (lv_pages_6_0= rulePage ) ) (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalNav.g:195:3: ()
            // InternalNav.g:196:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMenuAccess().getMenuAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMenuAccess().getMenuKeyword_1());
            		
            // InternalNav.g:206:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNav.g:207:4: (lv_name_2_0= ruleEString )
            {
            // InternalNav.g:207:4: (lv_name_2_0= ruleEString )
            // InternalNav.g:208:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getMenuAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMenuRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c1.dsl.nav.Nav.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalNav.g:229:3: (otherlv_4= 'pages' otherlv_5= '{' ( (lv_pages_6_0= rulePage ) ) (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )* otherlv_9= '}' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==16) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalNav.g:230:4: otherlv_4= 'pages' otherlv_5= '{' ( (lv_pages_6_0= rulePage ) ) (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getMenuAccess().getPagesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getMenuAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalNav.g:238:4: ( (lv_pages_6_0= rulePage ) )
                    // InternalNav.g:239:5: (lv_pages_6_0= rulePage )
                    {
                    // InternalNav.g:239:5: (lv_pages_6_0= rulePage )
                    // InternalNav.g:240:6: lv_pages_6_0= rulePage
                    {

                    						newCompositeNode(grammarAccess.getMenuAccess().getPagesPageParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_pages_6_0=rulePage();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMenuRule());
                    						}
                    						add(
                    							current,
                    							"pages",
                    							lv_pages_6_0,
                    							"pt.isep.edom.project.c1.dsl.nav.Nav.Page");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalNav.g:257:4: (otherlv_7= ',' ( (lv_pages_8_0= rulePage ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==17) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalNav.g:258:5: otherlv_7= ',' ( (lv_pages_8_0= rulePage ) )
                    	    {
                    	    otherlv_7=(Token)match(input,17,FOLLOW_9); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getMenuAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalNav.g:262:5: ( (lv_pages_8_0= rulePage ) )
                    	    // InternalNav.g:263:6: (lv_pages_8_0= rulePage )
                    	    {
                    	    // InternalNav.g:263:6: (lv_pages_8_0= rulePage )
                    	    // InternalNav.g:264:7: lv_pages_8_0= rulePage
                    	    {

                    	    							newCompositeNode(grammarAccess.getMenuAccess().getPagesPageParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_pages_8_0=rulePage();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMenuRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"pages",
                    	    								lv_pages_8_0,
                    	    								"pt.isep.edom.project.c1.dsl.nav.Nav.Page");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,14,FOLLOW_7); 

                    				newLeafNode(otherlv_9, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMenuAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMenu"


    // $ANTLR start "entryRulePage"
    // InternalNav.g:295:1: entryRulePage returns [EObject current=null] : iv_rulePage= rulePage EOF ;
    public final EObject entryRulePage() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePage = null;


        try {
            // InternalNav.g:295:45: (iv_rulePage= rulePage EOF )
            // InternalNav.g:296:2: iv_rulePage= rulePage EOF
            {
             newCompositeNode(grammarAccess.getPageRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePage=rulePage();

            state._fsp--;

             current =iv_rulePage; 
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
    // $ANTLR end "entryRulePage"


    // $ANTLR start "rulePage"
    // InternalNav.g:302:1: rulePage returns [EObject current=null] : ( () otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject rulePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalNav.g:308:2: ( ( () otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalNav.g:309:2: ( () otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalNav.g:309:2: ( () otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) ) )
            // InternalNav.g:310:3: () otherlv_1= 'Page' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalNav.g:310:3: ()
            // InternalNav.g:311:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPageAccess().getPageAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPageAccess().getPageKeyword_1());
            		
            // InternalNav.g:321:3: ( (lv_name_2_0= ruleEString ) )
            // InternalNav.g:322:4: (lv_name_2_0= ruleEString )
            {
            // InternalNav.g:322:4: (lv_name_2_0= ruleEString )
            // InternalNav.g:323:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPageAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPageRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c1.dsl.nav.Nav.EString");
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
    // $ANTLR end "rulePage"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000024000L});

}