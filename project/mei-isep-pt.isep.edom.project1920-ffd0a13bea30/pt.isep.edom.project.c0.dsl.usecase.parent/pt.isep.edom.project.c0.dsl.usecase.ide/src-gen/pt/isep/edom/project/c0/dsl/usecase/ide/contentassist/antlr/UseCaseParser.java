/*
 * generated by Xtext 2.12.0
 */
package pt.isep.edom.project.c0.dsl.usecase.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import pt.isep.edom.project.c0.dsl.usecase.ide.contentassist.antlr.internal.InternalUseCaseParser;
import pt.isep.edom.project.c0.dsl.usecase.services.UseCaseGrammarAccess;

public class UseCaseParser extends AbstractContentAssistParser {

	@Inject
	private UseCaseGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUseCaseParser createParser() {
		InternalUseCaseParser result = new InternalUseCaseParser(null);
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
					put(grammarAccess.getUseCaseModelAccess().getGroup(), "rule__UseCaseModel__Group__0");
					put(grammarAccess.getUseCaseModelAccess().getGroup_4(), "rule__UseCaseModel__Group_4__0");
					put(grammarAccess.getUseCaseModelAccess().getGroup_4_3(), "rule__UseCaseModel__Group_4_3__0");
					put(grammarAccess.getUseCaseModelAccess().getGroup_5(), "rule__UseCaseModel__Group_5__0");
					put(grammarAccess.getUseCaseModelAccess().getGroup_5_3(), "rule__UseCaseModel__Group_5_3__0");
					put(grammarAccess.getUseCaseModelAccess().getGroup_6(), "rule__UseCaseModel__Group_6__0");
					put(grammarAccess.getUseCaseModelAccess().getGroup_6_3(), "rule__UseCaseModel__Group_6_3__0");
					put(grammarAccess.getActorAccess().getGroup(), "rule__Actor__Group__0");
					put(grammarAccess.getAssociationAccess().getGroup(), "rule__Association__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup(), "rule__UseCase__Group__0");
					put(grammarAccess.getUseCaseAccess().getGroup_4(), "rule__UseCase__Group_4__0");
					put(grammarAccess.getUseCaseAccess().getGroup_4_3(), "rule__UseCase__Group_4_3__0");
					put(grammarAccess.getUseCaseAccess().getGroup_5(), "rule__UseCase__Group_5__0");
					put(grammarAccess.getUseCaseAccess().getGroup_5_3(), "rule__UseCase__Group_5_3__0");
					put(grammarAccess.getUseCaseAccess().getGroup_6(), "rule__UseCase__Group_6__0");
					put(grammarAccess.getUseCaseAccess().getGroup_6_3(), "rule__UseCase__Group_6_3__0");
					put(grammarAccess.getExtendAccess().getGroup(), "rule__Extend__Group__0");
					put(grammarAccess.getIncludeAccess().getGroup(), "rule__Include__Group__0");
					put(grammarAccess.getCommentAccess().getGroup(), "rule__Comment__Group__0");
					put(grammarAccess.getCommentAccess().getGroup_3(), "rule__Comment__Group_3__0");
					put(grammarAccess.getUseCaseModelAccess().getNameAssignment_2(), "rule__UseCaseModel__NameAssignment_2");
					put(grammarAccess.getUseCaseModelAccess().getActorAssignment_4_2(), "rule__UseCaseModel__ActorAssignment_4_2");
					put(grammarAccess.getUseCaseModelAccess().getActorAssignment_4_3_1(), "rule__UseCaseModel__ActorAssignment_4_3_1");
					put(grammarAccess.getUseCaseModelAccess().getAssociationAssignment_5_2(), "rule__UseCaseModel__AssociationAssignment_5_2");
					put(grammarAccess.getUseCaseModelAccess().getAssociationAssignment_5_3_1(), "rule__UseCaseModel__AssociationAssignment_5_3_1");
					put(grammarAccess.getUseCaseModelAccess().getUsecaseAssignment_6_2(), "rule__UseCaseModel__UsecaseAssignment_6_2");
					put(grammarAccess.getUseCaseModelAccess().getUsecaseAssignment_6_3_1(), "rule__UseCaseModel__UsecaseAssignment_6_3_1");
					put(grammarAccess.getActorAccess().getNameAssignment_2(), "rule__Actor__NameAssignment_2");
					put(grammarAccess.getAssociationAccess().getNameAssignment_1(), "rule__Association__NameAssignment_1");
					put(grammarAccess.getAssociationAccess().getActorAssignment_4(), "rule__Association__ActorAssignment_4");
					put(grammarAccess.getAssociationAccess().getUsecaseAssignment_6(), "rule__Association__UsecaseAssignment_6");
					put(grammarAccess.getUseCaseAccess().getNameAssignment_2(), "rule__UseCase__NameAssignment_2");
					put(grammarAccess.getUseCaseAccess().getExtendAssignment_4_2(), "rule__UseCase__ExtendAssignment_4_2");
					put(grammarAccess.getUseCaseAccess().getExtendAssignment_4_3_1(), "rule__UseCase__ExtendAssignment_4_3_1");
					put(grammarAccess.getUseCaseAccess().getIncludeAssignment_5_2(), "rule__UseCase__IncludeAssignment_5_2");
					put(grammarAccess.getUseCaseAccess().getIncludeAssignment_5_3_1(), "rule__UseCase__IncludeAssignment_5_3_1");
					put(grammarAccess.getUseCaseAccess().getCommentAssignment_6_2(), "rule__UseCase__CommentAssignment_6_2");
					put(grammarAccess.getUseCaseAccess().getCommentAssignment_6_3_1(), "rule__UseCase__CommentAssignment_6_3_1");
					put(grammarAccess.getExtendAccess().getNameAssignment_1(), "rule__Extend__NameAssignment_1");
					put(grammarAccess.getExtendAccess().getUsecaseAssignment_4(), "rule__Extend__UsecaseAssignment_4");
					put(grammarAccess.getIncludeAccess().getNameAssignment_1(), "rule__Include__NameAssignment_1");
					put(grammarAccess.getIncludeAccess().getUsecaseAssignment_4(), "rule__Include__UsecaseAssignment_4");
					put(grammarAccess.getCommentAccess().getDescriptionAssignment_3_1(), "rule__Comment__DescriptionAssignment_3_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UseCaseGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UseCaseGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
