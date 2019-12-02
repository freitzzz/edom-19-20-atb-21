package pt.isep.edom.project.c4.dsl.dbase.parser.antlr.internal;

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
import pt.isep.edom.project.c4.dsl.dbase.services.DbaseGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDbaseParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'DbaseModel'", "'{'", "'tables'", "','", "'}'", "'Table'", "'entity'", "'columns'", "'key'", "'Column'", "'type'", "'foreignKey'", "'VARCHAR'", "'INTEGER'", "'REAL'"
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

        public InternalDbaseParser(TokenStream input, DbaseGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "DbaseModel";
       	}

       	@Override
       	protected DbaseGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDbaseModel"
    // InternalDbase.g:65:1: entryRuleDbaseModel returns [EObject current=null] : iv_ruleDbaseModel= ruleDbaseModel EOF ;
    public final EObject entryRuleDbaseModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDbaseModel = null;


        try {
            // InternalDbase.g:65:51: (iv_ruleDbaseModel= ruleDbaseModel EOF )
            // InternalDbase.g:66:2: iv_ruleDbaseModel= ruleDbaseModel EOF
            {
             newCompositeNode(grammarAccess.getDbaseModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDbaseModel=ruleDbaseModel();

            state._fsp--;

             current =iv_ruleDbaseModel; 
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
    // $ANTLR end "entryRuleDbaseModel"


    // $ANTLR start "ruleDbaseModel"
    // InternalDbase.g:72:1: ruleDbaseModel returns [EObject current=null] : ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleDbaseModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_tables_6_0 = null;

        EObject lv_tables_8_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:78:2: ( ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalDbase.g:79:2: ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalDbase.g:79:2: ( () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalDbase.g:80:3: () otherlv_1= 'DbaseModel' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            // InternalDbase.g:80:3: ()
            // InternalDbase.g:81:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDbaseModelAccess().getDbaseModelAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDbaseModelAccess().getDbaseModelKeyword_1());
            		
            // InternalDbase.g:91:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDbase.g:92:4: (lv_name_2_0= ruleEString )
            {
            // InternalDbase.g:92:4: (lv_name_2_0= ruleEString )
            // InternalDbase.g:93:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getDbaseModelAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDbaseModelRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDbase.g:114:3: (otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalDbase.g:115:4: otherlv_4= 'tables' otherlv_5= '{' ( (lv_tables_6_0= ruleTable ) ) (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,13,FOLLOW_4); 

                    				newLeafNode(otherlv_4, grammarAccess.getDbaseModelAccess().getTablesKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getDbaseModelAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalDbase.g:123:4: ( (lv_tables_6_0= ruleTable ) )
                    // InternalDbase.g:124:5: (lv_tables_6_0= ruleTable )
                    {
                    // InternalDbase.g:124:5: (lv_tables_6_0= ruleTable )
                    // InternalDbase.g:125:6: lv_tables_6_0= ruleTable
                    {

                    						newCompositeNode(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_tables_6_0=ruleTable();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDbaseModelRule());
                    						}
                    						add(
                    							current,
                    							"tables",
                    							lv_tables_6_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Table");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDbase.g:142:4: (otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalDbase.g:143:5: otherlv_7= ',' ( (lv_tables_8_0= ruleTable ) )
                    	    {
                    	    otherlv_7=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getDbaseModelAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalDbase.g:147:5: ( (lv_tables_8_0= ruleTable ) )
                    	    // InternalDbase.g:148:6: (lv_tables_8_0= ruleTable )
                    	    {
                    	    // InternalDbase.g:148:6: (lv_tables_8_0= ruleTable )
                    	    // InternalDbase.g:149:7: lv_tables_8_0= ruleTable
                    	    {

                    	    							newCompositeNode(grammarAccess.getDbaseModelAccess().getTablesTableParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_tables_8_0=ruleTable();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getDbaseModelRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"tables",
                    	    								lv_tables_8_0,
                    	    								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Table");
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

                    				newLeafNode(otherlv_9, grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getDbaseModelAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDbaseModel"


    // $ANTLR start "entryRuleEString"
    // InternalDbase.g:180:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalDbase.g:180:47: (iv_ruleEString= ruleEString EOF )
            // InternalDbase.g:181:2: iv_ruleEString= ruleEString EOF
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
    // InternalDbase.g:187:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalDbase.g:193:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalDbase.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalDbase.g:194:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalDbase.g:195:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalDbase.g:203:3: this_ID_1= RULE_ID
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


    // $ANTLR start "entryRuleTable"
    // InternalDbase.g:214:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalDbase.g:214:46: (iv_ruleTable= ruleTable EOF )
            // InternalDbase.g:215:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalDbase.g:221:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
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

        AntlrDatatypeRuleToken lv_entity_5_0 = null;

        EObject lv_columns_8_0 = null;

        EObject lv_columns_10_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:227:2: ( ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' ) )
            // InternalDbase.g:228:2: ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            {
            // InternalDbase.g:228:2: ( () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}' )
            // InternalDbase.g:229:3: () otherlv_1= 'Table' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )? (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )? otherlv_12= '}'
            {
            // InternalDbase.g:229:3: ()
            // InternalDbase.g:230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            // InternalDbase.g:240:3: ( (lv_name_2_0= ruleEString ) )
            // InternalDbase.g:241:4: (lv_name_2_0= ruleEString )
            {
            // InternalDbase.g:241:4: (lv_name_2_0= ruleEString )
            // InternalDbase.g:242:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTableRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_9); 

            			newLeafNode(otherlv_3, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalDbase.g:263:3: (otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==17) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDbase.g:264:4: otherlv_4= 'entity' ( (lv_entity_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getTableAccess().getEntityKeyword_4_0());
                    			
                    // InternalDbase.g:268:4: ( (lv_entity_5_0= ruleEString ) )
                    // InternalDbase.g:269:5: (lv_entity_5_0= ruleEString )
                    {
                    // InternalDbase.g:269:5: (lv_entity_5_0= ruleEString )
                    // InternalDbase.g:270:6: lv_entity_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getEntityEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_10);
                    lv_entity_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						set(
                    							current,
                    							"entity",
                    							lv_entity_5_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDbase.g:288:3: (otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalDbase.g:289:4: otherlv_6= 'columns' otherlv_7= '{' ( (lv_columns_8_0= ruleColumn ) ) (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_6, grammarAccess.getTableAccess().getColumnsKeyword_5_0());
                    			
                    otherlv_7=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_7, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalDbase.g:297:4: ( (lv_columns_8_0= ruleColumn ) )
                    // InternalDbase.g:298:5: (lv_columns_8_0= ruleColumn )
                    {
                    // InternalDbase.g:298:5: (lv_columns_8_0= ruleColumn )
                    // InternalDbase.g:299:6: lv_columns_8_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_columns_8_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTableRule());
                    						}
                    						add(
                    							current,
                    							"columns",
                    							lv_columns_8_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDbase.g:316:4: (otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalDbase.g:317:5: otherlv_9= ',' ( (lv_columns_10_0= ruleColumn ) )
                    	    {
                    	    otherlv_9=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getTableAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalDbase.g:321:5: ( (lv_columns_10_0= ruleColumn ) )
                    	    // InternalDbase.g:322:6: (lv_columns_10_0= ruleColumn )
                    	    {
                    	    // InternalDbase.g:322:6: (lv_columns_10_0= ruleColumn )
                    	    // InternalDbase.g:323:7: lv_columns_10_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getTableAccess().getColumnsColumnParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_columns_10_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTableRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"columns",
                    	    								lv_columns_10_0,
                    	    								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_11, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalDbase.g:354:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalDbase.g:354:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalDbase.g:355:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalDbase.g:361:1: ruleColumn returns [EObject current=null] : ( () ( (lv_key_1_0= 'key' ) )? otherlv_2= 'Column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= ruleColumnType ) ) )? (otherlv_7= 'foreignKey' otherlv_8= '{' ( (lv_foreignKey_9_0= ruleColumn ) ) (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token lv_key_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;

        Enumerator lv_type_6_0 = null;

        EObject lv_foreignKey_9_0 = null;

        EObject lv_foreignKey_11_0 = null;



        	enterRule();

        try {
            // InternalDbase.g:367:2: ( ( () ( (lv_key_1_0= 'key' ) )? otherlv_2= 'Column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= ruleColumnType ) ) )? (otherlv_7= 'foreignKey' otherlv_8= '{' ( (lv_foreignKey_9_0= ruleColumn ) ) (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )* otherlv_12= '}' )? otherlv_13= '}' ) )
            // InternalDbase.g:368:2: ( () ( (lv_key_1_0= 'key' ) )? otherlv_2= 'Column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= ruleColumnType ) ) )? (otherlv_7= 'foreignKey' otherlv_8= '{' ( (lv_foreignKey_9_0= ruleColumn ) ) (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            {
            // InternalDbase.g:368:2: ( () ( (lv_key_1_0= 'key' ) )? otherlv_2= 'Column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= ruleColumnType ) ) )? (otherlv_7= 'foreignKey' otherlv_8= '{' ( (lv_foreignKey_9_0= ruleColumn ) ) (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )* otherlv_12= '}' )? otherlv_13= '}' )
            // InternalDbase.g:369:3: () ( (lv_key_1_0= 'key' ) )? otherlv_2= 'Column' ( (lv_name_3_0= ruleEString ) ) otherlv_4= '{' (otherlv_5= 'type' ( (lv_type_6_0= ruleColumnType ) ) )? (otherlv_7= 'foreignKey' otherlv_8= '{' ( (lv_foreignKey_9_0= ruleColumn ) ) (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )* otherlv_12= '}' )? otherlv_13= '}'
            {
            // InternalDbase.g:369:3: ()
            // InternalDbase.g:370:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            // InternalDbase.g:376:3: ( (lv_key_1_0= 'key' ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalDbase.g:377:4: (lv_key_1_0= 'key' )
                    {
                    // InternalDbase.g:377:4: (lv_key_1_0= 'key' )
                    // InternalDbase.g:378:5: lv_key_1_0= 'key'
                    {
                    lv_key_1_0=(Token)match(input,19,FOLLOW_12); 

                    					newLeafNode(lv_key_1_0, grammarAccess.getColumnAccess().getKeyKeyKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getColumnRule());
                    					}
                    					setWithLastConsumed(current, "key", true, "key");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getColumnKeyword_2());
            		
            // InternalDbase.g:394:3: ( (lv_name_3_0= ruleEString ) )
            // InternalDbase.g:395:4: (lv_name_3_0= ruleEString )
            {
            // InternalDbase.g:395:4: (lv_name_3_0= ruleEString )
            // InternalDbase.g:396:5: lv_name_3_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_3_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getColumnRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_3_0,
            						"pt.isep.edom.project.c4.dsl.dbase.Dbase.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalDbase.g:417:3: (otherlv_5= 'type' ( (lv_type_6_0= ruleColumnType ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDbase.g:418:4: otherlv_5= 'type' ( (lv_type_6_0= ruleColumnType ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_14); 

                    				newLeafNode(otherlv_5, grammarAccess.getColumnAccess().getTypeKeyword_5_0());
                    			
                    // InternalDbase.g:422:4: ( (lv_type_6_0= ruleColumnType ) )
                    // InternalDbase.g:423:5: (lv_type_6_0= ruleColumnType )
                    {
                    // InternalDbase.g:423:5: (lv_type_6_0= ruleColumnType )
                    // InternalDbase.g:424:6: lv_type_6_0= ruleColumnType
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getTypeColumnTypeEnumRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_type_6_0=ruleColumnType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"type",
                    							lv_type_6_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.ColumnType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalDbase.g:442:3: (otherlv_7= 'foreignKey' otherlv_8= '{' ( (lv_foreignKey_9_0= ruleColumn ) ) (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )* otherlv_12= '}' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalDbase.g:443:4: otherlv_7= 'foreignKey' otherlv_8= '{' ( (lv_foreignKey_9_0= ruleColumn ) ) (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )* otherlv_12= '}'
                    {
                    otherlv_7=(Token)match(input,22,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getColumnAccess().getForeignKeyKeyword_6_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_6_1());
                    			
                    // InternalDbase.g:451:4: ( (lv_foreignKey_9_0= ruleColumn ) )
                    // InternalDbase.g:452:5: (lv_foreignKey_9_0= ruleColumn )
                    {
                    // InternalDbase.g:452:5: (lv_foreignKey_9_0= ruleColumn )
                    // InternalDbase.g:453:6: lv_foreignKey_9_0= ruleColumn
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_foreignKey_9_0=ruleColumn();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						add(
                    							current,
                    							"foreignKey",
                    							lv_foreignKey_9_0,
                    							"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalDbase.g:470:4: (otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==14) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalDbase.g:471:5: otherlv_10= ',' ( (lv_foreignKey_11_0= ruleColumn ) )
                    	    {
                    	    otherlv_10=(Token)match(input,14,FOLLOW_11); 

                    	    					newLeafNode(otherlv_10, grammarAccess.getColumnAccess().getCommaKeyword_6_3_0());
                    	    				
                    	    // InternalDbase.g:475:5: ( (lv_foreignKey_11_0= ruleColumn ) )
                    	    // InternalDbase.g:476:6: (lv_foreignKey_11_0= ruleColumn )
                    	    {
                    	    // InternalDbase.g:476:6: (lv_foreignKey_11_0= ruleColumn )
                    	    // InternalDbase.g:477:7: lv_foreignKey_11_0= ruleColumn
                    	    {

                    	    							newCompositeNode(grammarAccess.getColumnAccess().getForeignKeyColumnParserRuleCall_6_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_7);
                    	    lv_foreignKey_11_0=ruleColumn();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getColumnRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"foreignKey",
                    	    								lv_foreignKey_11_0,
                    	    								"pt.isep.edom.project.c4.dsl.dbase.Dbase.Column");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    otherlv_12=(Token)match(input,15,FOLLOW_8); 

                    				newLeafNode(otherlv_12, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_6_4());
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "ruleColumnType"
    // InternalDbase.g:508:1: ruleColumnType returns [Enumerator current=null] : ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) ;
    public final Enumerator ruleColumnType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalDbase.g:514:2: ( ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) ) )
            // InternalDbase.g:515:2: ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            {
            // InternalDbase.g:515:2: ( (enumLiteral_0= 'VARCHAR' ) | (enumLiteral_1= 'INTEGER' ) | (enumLiteral_2= 'REAL' ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case 25:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalDbase.g:516:3: (enumLiteral_0= 'VARCHAR' )
                    {
                    // InternalDbase.g:516:3: (enumLiteral_0= 'VARCHAR' )
                    // InternalDbase.g:517:4: enumLiteral_0= 'VARCHAR'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getColumnTypeAccess().getVARCHAREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalDbase.g:524:3: (enumLiteral_1= 'INTEGER' )
                    {
                    // InternalDbase.g:524:3: (enumLiteral_1= 'INTEGER' )
                    // InternalDbase.g:525:4: enumLiteral_1= 'INTEGER'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getColumnTypeAccess().getINTEGEREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalDbase.g:532:3: (enumLiteral_2= 'REAL' )
                    {
                    // InternalDbase.g:532:3: (enumLiteral_2= 'REAL' )
                    // InternalDbase.g:533:4: enumLiteral_2= 'REAL'
                    {
                    enumLiteral_2=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getColumnTypeAccess().getREALEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleColumnType"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000608000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000408000L});

}