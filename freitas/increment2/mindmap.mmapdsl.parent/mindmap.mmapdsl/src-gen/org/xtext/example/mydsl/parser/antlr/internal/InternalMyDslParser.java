package org.xtext.example.mydsl.parser.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Map'", "'{'", "'title'", "'elements'", "','", "'}'", "'Relationship'", "'type'", "'source'", "'target'", "'Topic'", "'description'", "'start'", "'end'", "'priority'", "'subtopics'", "'('", "')'", "'parent'", "'EDate'", "'DEPENDENCY'", "'INCLUDE'", "'EXTEND'", "'HIGH'", "'MEDIUM'", "'LOW'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Map";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMap"
    // InternalMyDsl.g:65:1: entryRuleMap returns [EObject current=null] : iv_ruleMap= ruleMap EOF ;
    public final EObject entryRuleMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMap = null;


        try {
            // InternalMyDsl.g:65:44: (iv_ruleMap= ruleMap EOF )
            // InternalMyDsl.g:66:2: iv_ruleMap= ruleMap EOF
            {
             newCompositeNode(grammarAccess.getMapRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMap=ruleMap();

            state._fsp--;

             current =iv_ruleMap; 
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
    // $ANTLR end "entryRuleMap"


    // $ANTLR start "ruleMap"
    // InternalMyDsl.g:72:1: ruleMap returns [EObject current=null] : ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleMapElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleMap() throws RecognitionException {
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

        EObject lv_elements_7_0 = null;

        EObject lv_elements_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:78:2: ( ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleMapElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleMapElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalMyDsl.g:79:2: ( () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleMapElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalMyDsl.g:80:3: () otherlv_1= 'Map' otherlv_2= '{' (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )? (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleMapElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            // InternalMyDsl.g:80:3: ()
            // InternalMyDsl.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMapAccess().getMapAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMapAccess().getMapKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:95:3: (otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:96:4: otherlv_3= 'title' ( (lv_title_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getMapAccess().getTitleKeyword_3_0());
                    			
                    // InternalMyDsl.g:100:4: ( (lv_title_4_0= ruleEString ) )
                    // InternalMyDsl.g:101:5: (lv_title_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:101:5: (lv_title_4_0= ruleEString )
                    // InternalMyDsl.g:102:6: lv_title_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getMapAccess().getTitleEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_title_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapRule());
                    						}
                    						set(
                    							current,
                    							"title",
                    							lv_title_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:120:3: (otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleMapElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:121:4: otherlv_5= 'elements' otherlv_6= '{' ( (lv_elements_7_0= ruleMapElement ) ) (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getMapAccess().getElementsKeyword_4_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_6, grammarAccess.getMapAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:129:4: ( (lv_elements_7_0= ruleMapElement ) )
                    // InternalMyDsl.g:130:5: (lv_elements_7_0= ruleMapElement )
                    {
                    // InternalMyDsl.g:130:5: (lv_elements_7_0= ruleMapElement )
                    // InternalMyDsl.g:131:6: lv_elements_7_0= ruleMapElement
                    {

                    						newCompositeNode(grammarAccess.getMapAccess().getElementsMapElementParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_elements_7_0=ruleMapElement();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMapRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_7_0,
                    							"org.xtext.example.mydsl.MyDsl.MapElement");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:148:4: (otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==15) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:149:5: otherlv_8= ',' ( (lv_elements_9_0= ruleMapElement ) )
                    	    {
                    	    otherlv_8=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getMapAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:153:5: ( (lv_elements_9_0= ruleMapElement ) )
                    	    // InternalMyDsl.g:154:6: (lv_elements_9_0= ruleMapElement )
                    	    {
                    	    // InternalMyDsl.g:154:6: (lv_elements_9_0= ruleMapElement )
                    	    // InternalMyDsl.g:155:7: lv_elements_9_0= ruleMapElement
                    	    {

                    	    							newCompositeNode(grammarAccess.getMapAccess().getElementsMapElementParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_elements_9_0=ruleMapElement();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMapRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_9_0,
                    	    								"org.xtext.example.mydsl.MyDsl.MapElement");
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

                    				newLeafNode(otherlv_10, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getMapAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleMap"


    // $ANTLR start "entryRuleMapElement"
    // InternalMyDsl.g:186:1: entryRuleMapElement returns [EObject current=null] : iv_ruleMapElement= ruleMapElement EOF ;
    public final EObject entryRuleMapElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMapElement = null;


        try {
            // InternalMyDsl.g:186:51: (iv_ruleMapElement= ruleMapElement EOF )
            // InternalMyDsl.g:187:2: iv_ruleMapElement= ruleMapElement EOF
            {
             newCompositeNode(grammarAccess.getMapElementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMapElement=ruleMapElement();

            state._fsp--;

             current =iv_ruleMapElement; 
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
    // $ANTLR end "entryRuleMapElement"


    // $ANTLR start "ruleMapElement"
    // InternalMyDsl.g:193:1: ruleMapElement returns [EObject current=null] : (this_Relationship_0= ruleRelationship | this_Topic_1= ruleTopic ) ;
    public final EObject ruleMapElement() throws RecognitionException {
        EObject current = null;

        EObject this_Relationship_0 = null;

        EObject this_Topic_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:199:2: ( (this_Relationship_0= ruleRelationship | this_Topic_1= ruleTopic ) )
            // InternalMyDsl.g:200:2: (this_Relationship_0= ruleRelationship | this_Topic_1= ruleTopic )
            {
            // InternalMyDsl.g:200:2: (this_Relationship_0= ruleRelationship | this_Topic_1= ruleTopic )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:201:3: this_Relationship_0= ruleRelationship
                    {

                    			newCompositeNode(grammarAccess.getMapElementAccess().getRelationshipParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Relationship_0=ruleRelationship();

                    state._fsp--;


                    			current = this_Relationship_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:210:3: this_Topic_1= ruleTopic
                    {

                    			newCompositeNode(grammarAccess.getMapElementAccess().getTopicParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Topic_1=ruleTopic();

                    state._fsp--;


                    			current = this_Topic_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleMapElement"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:222:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:222:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:223:2: iv_ruleEString= ruleEString EOF
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
    // InternalMyDsl.g:229:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:235:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:236:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:236:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:237:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:245:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleRelationship"
    // InternalMyDsl.g:256:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalMyDsl.g:256:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalMyDsl.g:257:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalMyDsl.g:263:1: ruleRelationship returns [EObject current=null] : (otherlv_0= 'Relationship' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:269:2: ( (otherlv_0= 'Relationship' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' ) )
            // InternalMyDsl.g:270:2: (otherlv_0= 'Relationship' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' )
            {
            // InternalMyDsl.g:270:2: (otherlv_0= 'Relationship' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}' )
            // InternalMyDsl.g:271:3: otherlv_0= 'Relationship' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' (otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) )? otherlv_5= 'source' ( ( ruleEString ) ) otherlv_7= 'target' ( ( ruleEString ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getRelationshipKeyword_0());
            		
            // InternalMyDsl.g:275:3: ( (lv_name_1_0= ruleEString ) )
            // InternalMyDsl.g:276:4: (lv_name_1_0= ruleEString )
            {
            // InternalMyDsl.g:276:4: (lv_name_1_0= ruleEString )
            // InternalMyDsl.g:277:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:298:3: (otherlv_3= 'type' ( (lv_type_4_0= ruleType ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:299:4: otherlv_3= 'type' ( (lv_type_4_0= ruleType ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getTypeKeyword_3_0());
                    			
                    // InternalMyDsl.g:303:4: ( (lv_type_4_0= ruleType ) )
                    // InternalMyDsl.g:304:5: (lv_type_4_0= ruleType )
                    {
                    // InternalMyDsl.g:304:5: (lv_type_4_0= ruleType )
                    // InternalMyDsl.g:305:6: lv_type_4_0= ruleType
                    {

                    						newCompositeNode(grammarAccess.getRelationshipAccess().getTypeTypeEnumRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_type_4_0=ruleType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRelationshipRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Type");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationshipAccess().getSourceKeyword_4());
            		
            // InternalMyDsl.g:327:3: ( ( ruleEString ) )
            // InternalMyDsl.g:328:4: ( ruleEString )
            {
            // InternalMyDsl.g:328:4: ( ruleEString )
            // InternalMyDsl.g:329:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationshipAccess().getSourceTopicCrossReference_5_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationshipAccess().getTargetKeyword_6());
            		
            // InternalMyDsl.g:347:3: ( ( ruleEString ) )
            // InternalMyDsl.g:348:4: ( ruleEString )
            {
            // InternalMyDsl.g:348:4: ( ruleEString )
            // InternalMyDsl.g:349:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				

            					newCompositeNode(grammarAccess.getRelationshipAccess().getTargetTopicCrossReference_7_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleTopic"
    // InternalMyDsl.g:371:1: entryRuleTopic returns [EObject current=null] : iv_ruleTopic= ruleTopic EOF ;
    public final EObject entryRuleTopic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTopic = null;


        try {
            // InternalMyDsl.g:371:46: (iv_ruleTopic= ruleTopic EOF )
            // InternalMyDsl.g:372:2: iv_ruleTopic= ruleTopic EOF
            {
             newCompositeNode(grammarAccess.getTopicRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTopic=ruleTopic();

            state._fsp--;

             current =iv_ruleTopic; 
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
    // $ANTLR end "entryRuleTopic"


    // $ANTLR start "ruleTopic"
    // InternalMyDsl.g:378:1: ruleTopic returns [EObject current=null] : ( () otherlv_1= 'Topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'start' ( (lv_start_7_0= ruleEDate ) ) )? (otherlv_8= 'end' ( (lv_end_9_0= ruleEDate ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= rulePriority ) ) )? (otherlv_12= 'subtopics' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parent' ( ( ruleEString ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleTopic() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        AntlrDatatypeRuleToken lv_description_5_0 = null;

        AntlrDatatypeRuleToken lv_start_7_0 = null;

        AntlrDatatypeRuleToken lv_end_9_0 = null;

        Enumerator lv_priority_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:384:2: ( ( () otherlv_1= 'Topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'start' ( (lv_start_7_0= ruleEDate ) ) )? (otherlv_8= 'end' ( (lv_end_9_0= ruleEDate ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= rulePriority ) ) )? (otherlv_12= 'subtopics' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parent' ( ( ruleEString ) ) )? otherlv_20= '}' ) )
            // InternalMyDsl.g:385:2: ( () otherlv_1= 'Topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'start' ( (lv_start_7_0= ruleEDate ) ) )? (otherlv_8= 'end' ( (lv_end_9_0= ruleEDate ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= rulePriority ) ) )? (otherlv_12= 'subtopics' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parent' ( ( ruleEString ) ) )? otherlv_20= '}' )
            {
            // InternalMyDsl.g:385:2: ( () otherlv_1= 'Topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'start' ( (lv_start_7_0= ruleEDate ) ) )? (otherlv_8= 'end' ( (lv_end_9_0= ruleEDate ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= rulePriority ) ) )? (otherlv_12= 'subtopics' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parent' ( ( ruleEString ) ) )? otherlv_20= '}' )
            // InternalMyDsl.g:386:3: () otherlv_1= 'Topic' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )? (otherlv_6= 'start' ( (lv_start_7_0= ruleEDate ) ) )? (otherlv_8= 'end' ( (lv_end_9_0= ruleEDate ) ) )? (otherlv_10= 'priority' ( (lv_priority_11_0= rulePriority ) ) )? (otherlv_12= 'subtopics' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )? (otherlv_18= 'parent' ( ( ruleEString ) ) )? otherlv_20= '}'
            {
            // InternalMyDsl.g:386:3: ()
            // InternalMyDsl.g:387:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTopicAccess().getTopicAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTopicAccess().getTopicKeyword_1());
            		
            // InternalMyDsl.g:397:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:398:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:398:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:399:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTopicAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTopicRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_3, grammarAccess.getTopicAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:420:3: (otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:421:4: otherlv_4= 'description' ( (lv_description_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_5); 

                    				newLeafNode(otherlv_4, grammarAccess.getTopicAccess().getDescriptionKeyword_4_0());
                    			
                    // InternalMyDsl.g:425:4: ( (lv_description_5_0= ruleEString ) )
                    // InternalMyDsl.g:426:5: (lv_description_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:426:5: (lv_description_5_0= ruleEString )
                    // InternalMyDsl.g:427:6: lv_description_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTopicAccess().getDescriptionEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_description_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicRule());
                    						}
                    						set(
                    							current,
                    							"description",
                    							lv_description_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:445:3: (otherlv_6= 'start' ( (lv_start_7_0= ruleEDate ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==23) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:446:4: otherlv_6= 'start' ( (lv_start_7_0= ruleEDate ) )
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_16); 

                    				newLeafNode(otherlv_6, grammarAccess.getTopicAccess().getStartKeyword_5_0());
                    			
                    // InternalMyDsl.g:450:4: ( (lv_start_7_0= ruleEDate ) )
                    // InternalMyDsl.g:451:5: (lv_start_7_0= ruleEDate )
                    {
                    // InternalMyDsl.g:451:5: (lv_start_7_0= ruleEDate )
                    // InternalMyDsl.g:452:6: lv_start_7_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getTopicAccess().getStartEDateParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_start_7_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicRule());
                    						}
                    						set(
                    							current,
                    							"start",
                    							lv_start_7_0,
                    							"org.xtext.example.mydsl.MyDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:470:3: (otherlv_8= 'end' ( (lv_end_9_0= ruleEDate ) ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:471:4: otherlv_8= 'end' ( (lv_end_9_0= ruleEDate ) )
                    {
                    otherlv_8=(Token)match(input,24,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getTopicAccess().getEndKeyword_6_0());
                    			
                    // InternalMyDsl.g:475:4: ( (lv_end_9_0= ruleEDate ) )
                    // InternalMyDsl.g:476:5: (lv_end_9_0= ruleEDate )
                    {
                    // InternalMyDsl.g:476:5: (lv_end_9_0= ruleEDate )
                    // InternalMyDsl.g:477:6: lv_end_9_0= ruleEDate
                    {

                    						newCompositeNode(grammarAccess.getTopicAccess().getEndEDateParserRuleCall_6_1_0());
                    					
                    pushFollow(FOLLOW_18);
                    lv_end_9_0=ruleEDate();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicRule());
                    						}
                    						set(
                    							current,
                    							"end",
                    							lv_end_9_0,
                    							"org.xtext.example.mydsl.MyDsl.EDate");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:495:3: (otherlv_10= 'priority' ( (lv_priority_11_0= rulePriority ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:496:4: otherlv_10= 'priority' ( (lv_priority_11_0= rulePriority ) )
                    {
                    otherlv_10=(Token)match(input,25,FOLLOW_19); 

                    				newLeafNode(otherlv_10, grammarAccess.getTopicAccess().getPriorityKeyword_7_0());
                    			
                    // InternalMyDsl.g:500:4: ( (lv_priority_11_0= rulePriority ) )
                    // InternalMyDsl.g:501:5: (lv_priority_11_0= rulePriority )
                    {
                    // InternalMyDsl.g:501:5: (lv_priority_11_0= rulePriority )
                    // InternalMyDsl.g:502:6: lv_priority_11_0= rulePriority
                    {

                    						newCompositeNode(grammarAccess.getTopicAccess().getPriorityPriorityEnumRuleCall_7_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_priority_11_0=rulePriority();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTopicRule());
                    						}
                    						set(
                    							current,
                    							"priority",
                    							lv_priority_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Priority");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:520:3: (otherlv_12= 'subtopics' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:521:4: otherlv_12= 'subtopics' otherlv_13= '(' ( ( ruleEString ) ) (otherlv_15= ',' ( ( ruleEString ) ) )* otherlv_17= ')'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_21); 

                    				newLeafNode(otherlv_12, grammarAccess.getTopicAccess().getSubtopicsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,27,FOLLOW_5); 

                    				newLeafNode(otherlv_13, grammarAccess.getTopicAccess().getLeftParenthesisKeyword_8_1());
                    			
                    // InternalMyDsl.g:529:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:530:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:530:5: ( ruleEString )
                    // InternalMyDsl.g:531:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTopicAccess().getSubtopicsTopicCrossReference_8_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:545:4: (otherlv_15= ',' ( ( ruleEString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==15) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalMyDsl.g:546:5: otherlv_15= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_15=(Token)match(input,15,FOLLOW_5); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getTopicAccess().getCommaKeyword_8_3_0());
                    	    				
                    	    // InternalMyDsl.g:550:5: ( ( ruleEString ) )
                    	    // InternalMyDsl.g:551:6: ( ruleEString )
                    	    {
                    	    // InternalMyDsl.g:551:6: ( ruleEString )
                    	    // InternalMyDsl.g:552:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getTopicRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getTopicAccess().getSubtopicsTopicCrossReference_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_22);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,28,FOLLOW_23); 

                    				newLeafNode(otherlv_17, grammarAccess.getTopicAccess().getRightParenthesisKeyword_8_4());
                    			

                    }
                    break;

            }

            // InternalMyDsl.g:572:3: (otherlv_18= 'parent' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:573:4: otherlv_18= 'parent' ( ( ruleEString ) )
                    {
                    otherlv_18=(Token)match(input,29,FOLLOW_5); 

                    				newLeafNode(otherlv_18, grammarAccess.getTopicAccess().getParentKeyword_9_0());
                    			
                    // InternalMyDsl.g:577:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:578:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:578:5: ( ruleEString )
                    // InternalMyDsl.g:579:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTopicRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTopicAccess().getParentTopicCrossReference_9_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_20, grammarAccess.getTopicAccess().getRightCurlyBracketKeyword_10());
            		

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
    // $ANTLR end "ruleTopic"


    // $ANTLR start "entryRuleEDate"
    // InternalMyDsl.g:602:1: entryRuleEDate returns [String current=null] : iv_ruleEDate= ruleEDate EOF ;
    public final String entryRuleEDate() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDate = null;


        try {
            // InternalMyDsl.g:602:45: (iv_ruleEDate= ruleEDate EOF )
            // InternalMyDsl.g:603:2: iv_ruleEDate= ruleEDate EOF
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
    // InternalMyDsl.g:609:1: ruleEDate returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'EDate' ;
    public final AntlrDatatypeRuleToken ruleEDate() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMyDsl.g:615:2: (kw= 'EDate' )
            // InternalMyDsl.g:616:2: kw= 'EDate'
            {
            kw=(Token)match(input,30,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEDateAccess().getEDateKeyword());
            	

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


    // $ANTLR start "ruleType"
    // InternalMyDsl.g:624:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'DEPENDENCY' ) | (enumLiteral_1= 'INCLUDE' ) | (enumLiteral_2= 'EXTEND' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:630:2: ( ( (enumLiteral_0= 'DEPENDENCY' ) | (enumLiteral_1= 'INCLUDE' ) | (enumLiteral_2= 'EXTEND' ) ) )
            // InternalMyDsl.g:631:2: ( (enumLiteral_0= 'DEPENDENCY' ) | (enumLiteral_1= 'INCLUDE' ) | (enumLiteral_2= 'EXTEND' ) )
            {
            // InternalMyDsl.g:631:2: ( (enumLiteral_0= 'DEPENDENCY' ) | (enumLiteral_1= 'INCLUDE' ) | (enumLiteral_2= 'EXTEND' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt14=1;
                }
                break;
            case 32:
                {
                alt14=2;
                }
                break;
            case 33:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:632:3: (enumLiteral_0= 'DEPENDENCY' )
                    {
                    // InternalMyDsl.g:632:3: (enumLiteral_0= 'DEPENDENCY' )
                    // InternalMyDsl.g:633:4: enumLiteral_0= 'DEPENDENCY'
                    {
                    enumLiteral_0=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getDEPENDENCYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getDEPENDENCYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:640:3: (enumLiteral_1= 'INCLUDE' )
                    {
                    // InternalMyDsl.g:640:3: (enumLiteral_1= 'INCLUDE' )
                    // InternalMyDsl.g:641:4: enumLiteral_1= 'INCLUDE'
                    {
                    enumLiteral_1=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getINCLUDEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getINCLUDEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:648:3: (enumLiteral_2= 'EXTEND' )
                    {
                    // InternalMyDsl.g:648:3: (enumLiteral_2= 'EXTEND' )
                    // InternalMyDsl.g:649:4: enumLiteral_2= 'EXTEND'
                    {
                    enumLiteral_2=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getTypeAccess().getEXTENDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getEXTENDEnumLiteralDeclaration_2());
                    			

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
    // InternalMyDsl.g:659:1: rulePriority returns [Enumerator current=null] : ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) ;
    public final Enumerator rulePriority() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:665:2: ( ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) ) )
            // InternalMyDsl.g:666:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            {
            // InternalMyDsl.g:666:2: ( (enumLiteral_0= 'HIGH' ) | (enumLiteral_1= 'MEDIUM' ) | (enumLiteral_2= 'LOW' ) )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt15=1;
                }
                break;
            case 35:
                {
                alt15=2;
                }
                break;
            case 36:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:667:3: (enumLiteral_0= 'HIGH' )
                    {
                    // InternalMyDsl.g:667:3: (enumLiteral_0= 'HIGH' )
                    // InternalMyDsl.g:668:4: enumLiteral_0= 'HIGH'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getPriorityAccess().getHIGHEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getPriorityAccess().getHIGHEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:675:3: (enumLiteral_1= 'MEDIUM' )
                    {
                    // InternalMyDsl.g:675:3: (enumLiteral_1= 'MEDIUM' )
                    // InternalMyDsl.g:676:4: enumLiteral_1= 'MEDIUM'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getPriorityAccess().getMEDIUMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getPriorityAccess().getMEDIUMEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:683:3: (enumLiteral_2= 'LOW' )
                    {
                    // InternalMyDsl.g:683:3: (enumLiteral_2= 'LOW' )
                    // InternalMyDsl.g:684:4: enumLiteral_2= 'LOW'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000016000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000027C10000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000027810000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000027010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000026010000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000024010000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020010000L});

}