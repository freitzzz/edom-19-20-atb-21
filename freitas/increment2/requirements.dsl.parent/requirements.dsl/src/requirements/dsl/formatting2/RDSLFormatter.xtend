/*
 * generated by Xtext 2.19.0
 */
package requirements.dsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import requirements.Model
import requirements.RequirementGroup
import requirements.dsl.services.RDSLGrammarAccess
import requirements.Requirement
import requirements.Version
import requirements.Comment

class RDSLFormatter extends AbstractFormatter2 {
	
	@Inject extension RDSLGrammarAccess
	
	/**
	 * We want our Model to be formatted in the following format: 
	 * 
	 * Model {
	 * 	title ...
	 * 	groups {...}
	 * }
	 */
	
	def dispatch void format(Model model, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		
		val model_keyword = model.regionFor.keyword(modelAccess.modelKeyword_1)
		val open_bracket_keyword = model.regionFor.keyword(modelAccess.leftCurlyBracketKeyword_4_1)
		val close_bracket_keyword = model.regionFor.keyword(modelAccess.rightCurlyBracketKeyword_4_4)
		var title_keyword = model.regionFor.keyword(modelAccess.titleKeyword_3_0)
		var groups_keyword = model.regionFor.keyword(modelAccess.groupsKeyword_4_0)
		
		// space after model keyword
		model_keyword.append[space = " "]
		
		// new line before title keyword
		title_keyword.prepend[newLine]
		
		interior(open_bracket_keyword, close_bracket_keyword)[indent]
		
		// two spaces before title keyword
		title_keyword.prepend[space = "  "]
		
		// space after model keyword
		title_keyword.append[space = " "]
		
		// new line before groups keyword
		groups_keyword.prepend[newLine]
		
		// two spaces before groups keyword
		groups_keyword.prepend[space = "  "]
		
		// indent before groups keyword
		groups_keyword.append[space = " "]
		
		
		open_bracket_keyword.append[newLine]
		
		for (requirementGroup : model.groups) {
			requirementGroup.format
			requirementGroup.append[newLine]
		}
	}
	
	
}
