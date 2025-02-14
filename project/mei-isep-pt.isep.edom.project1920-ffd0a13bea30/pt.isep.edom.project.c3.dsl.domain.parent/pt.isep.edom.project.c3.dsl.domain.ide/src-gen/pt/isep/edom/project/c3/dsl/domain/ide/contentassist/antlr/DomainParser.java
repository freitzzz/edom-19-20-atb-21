/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c3.dsl.domain.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import pt.isep.edom.project.c3.dsl.domain.ide.contentassist.antlr.internal.InternalDomainParser;
import pt.isep.edom.project.c3.dsl.domain.services.DomainGrammarAccess;

public class DomainParser extends AbstractContentAssistParser {

	@Inject
	private DomainGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalDomainParser createParser() {
		InternalDomainParser result = new InternalDomainParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getFieldTypeAccess().getAlternatives(), "rule__FieldType__Alternatives");
					put(grammarAccess.getDomainModelAccess().getGroup(), "rule__DomainModel__Group__0");
					put(grammarAccess.getDomainModelAccess().getGroup_4(), "rule__DomainModel__Group_4__0");
					put(grammarAccess.getDomainModelAccess().getGroup_4_3(), "rule__DomainModel__Group_4_3__0");
					put(grammarAccess.getEntityAccess().getGroup(), "rule__Entity__Group__0");
					put(grammarAccess.getEntityAccess().getGroup_4(), "rule__Entity__Group_4__0");
					put(grammarAccess.getEntityAccess().getGroup_4_3(), "rule__Entity__Group_4_3__0");
					put(grammarAccess.getEntityAccess().getGroup_5(), "rule__Entity__Group_5__0");
					put(grammarAccess.getEntityAccess().getGroup_5_3(), "rule__Entity__Group_5_3__0");
					put(grammarAccess.getEntityAccess().getGroup_6(), "rule__Entity__Group_6__0");
					put(grammarAccess.getEntityAccess().getGroup_6_3(), "rule__Entity__Group_6_3__0");
					put(grammarAccess.getFieldAccess().getGroup(), "rule__Field__Group__0");
					put(grammarAccess.getFieldAccess().getGroup_4(), "rule__Field__Group_4__0");
					put(grammarAccess.getSubEntityAccess().getGroup(), "rule__SubEntity__Group__0");
					put(grammarAccess.getSubEntityAccess().getGroup_4(), "rule__SubEntity__Group_4__0");
					put(grammarAccess.getSubEntityAccess().getGroup_5(), "rule__SubEntity__Group_5__0");
					put(grammarAccess.getReferenceAccess().getGroup(), "rule__Reference__Group__0");
					put(grammarAccess.getReferenceAccess().getGroup_4(), "rule__Reference__Group_4__0");
					put(grammarAccess.getReferenceAccess().getGroup_5(), "rule__Reference__Group_5__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getDomainModelAccess().getNameAssignment_2(), "rule__DomainModel__NameAssignment_2");
					put(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_2(), "rule__DomainModel__EntitiesAssignment_4_2");
					put(grammarAccess.getDomainModelAccess().getEntitiesAssignment_4_3_1(), "rule__DomainModel__EntitiesAssignment_4_3_1");
					put(grammarAccess.getEntityAccess().getNameAssignment_2(), "rule__Entity__NameAssignment_2");
					put(grammarAccess.getEntityAccess().getFieldsAssignment_4_2(), "rule__Entity__FieldsAssignment_4_2");
					put(grammarAccess.getEntityAccess().getFieldsAssignment_4_3_1(), "rule__Entity__FieldsAssignment_4_3_1");
					put(grammarAccess.getEntityAccess().getSubentitiesAssignment_5_2(), "rule__Entity__SubentitiesAssignment_5_2");
					put(grammarAccess.getEntityAccess().getSubentitiesAssignment_5_3_1(), "rule__Entity__SubentitiesAssignment_5_3_1");
					put(grammarAccess.getEntityAccess().getReferencesAssignment_6_2(), "rule__Entity__ReferencesAssignment_6_2");
					put(grammarAccess.getEntityAccess().getReferencesAssignment_6_3_1(), "rule__Entity__ReferencesAssignment_6_3_1");
					put(grammarAccess.getFieldAccess().getNameAssignment_2(), "rule__Field__NameAssignment_2");
					put(grammarAccess.getFieldAccess().getTypeAssignment_4_1(), "rule__Field__TypeAssignment_4_1");
					put(grammarAccess.getSubEntityAccess().getNameAssignment_2(), "rule__SubEntity__NameAssignment_2");
					put(grammarAccess.getSubEntityAccess().getUpperBoundAssignment_4_1(), "rule__SubEntity__UpperBoundAssignment_4_1");
					put(grammarAccess.getSubEntityAccess().getEntityAssignment_5_1(), "rule__SubEntity__EntityAssignment_5_1");
					put(grammarAccess.getReferenceAccess().getNameAssignment_2(), "rule__Reference__NameAssignment_2");
					put(grammarAccess.getReferenceAccess().getUpperBoundAssignment_4_1(), "rule__Reference__UpperBoundAssignment_4_1");
					put(grammarAccess.getReferenceAccess().getEntityAssignment_5_1(), "rule__Reference__EntityAssignment_5_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public DomainGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DomainGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
