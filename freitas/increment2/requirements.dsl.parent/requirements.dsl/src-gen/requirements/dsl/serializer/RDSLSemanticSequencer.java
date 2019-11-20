/*
 * generated by Xtext 2.19.0
 */
package requirements.dsl.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import requirements.Comment;
import requirements.Model;
import requirements.Requirement;
import requirements.RequirementGroup;
import requirements.RequirementsPackage;
import requirements.Version;
import requirements.dsl.services.RDSLGrammarAccess;

@SuppressWarnings("all")
public class RDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RDSLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RequirementsPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RequirementsPackage.COMMENT:
				sequence_Comment(context, (Comment) semanticObject); 
				return; 
			case RequirementsPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case RequirementsPackage.REQUIREMENT:
				sequence_Requirement(context, (Requirement) semanticObject); 
				return; 
			case RequirementsPackage.REQUIREMENT_GROUP:
				sequence_RequirementGroup(context, (RequirementGroup) semanticObject); 
				return; 
			case RequirementsPackage.VERSION:
				sequence_Version(context, (Version) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Comment returns Comment
	 *
	 * Constraint:
	 *     (subject=EString? body=EString? author=EString? created=EDate? (children+=Comment children+=Comment*)?)
	 */
	protected void sequence_Comment(ISerializationContext context, Comment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     (title=EString? (groups+=RequirementGroup groups+=RequirementGroup*)?)
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RequirementGroup returns RequirementGroup
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         description=EString? 
	 *         id=EString? 
	 *         (requirements+=Requirement requirements+=Requirement*)? 
	 *         (children+=RequirementGroup children+=RequirementGroup*)?
	 *     )
	 */
	protected void sequence_RequirementGroup(ISerializationContext context, RequirementGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Requirement returns Requirement
	 *
	 * Constraint:
	 *     (
	 *         name=EString 
	 *         description=EString? 
	 *         type=Type? 
	 *         priority=Priority? 
	 *         author=EString? 
	 *         created=EDate? 
	 *         id=EString? 
	 *         state=State? 
	 *         resolution=Resolution? 
	 *         (dependencies+=[Requirement|EString] dependencies+=[Requirement|EString]*)? 
	 *         version=Version 
	 *         (comments+=Comment comments+=Comment*)? 
	 *         (children+=Requirement children+=Requirement*)?
	 *     )
	 */
	protected void sequence_Requirement(ISerializationContext context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Version returns Version
	 *
	 * Constraint:
	 *     (major=EInt minor=EInt service=EInt)
	 */
	protected void sequence_Version(ISerializationContext context, Version semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RequirementsPackage.Literals.VERSION__MAJOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RequirementsPackage.Literals.VERSION__MAJOR));
			if (transientValues.isValueTransient(semanticObject, RequirementsPackage.Literals.VERSION__MINOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RequirementsPackage.Literals.VERSION__MINOR));
			if (transientValues.isValueTransient(semanticObject, RequirementsPackage.Literals.VERSION__SERVICE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RequirementsPackage.Literals.VERSION__SERVICE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVersionAccess().getMajorEIntParserRuleCall_3_0(), semanticObject.getMajor());
		feeder.accept(grammarAccess.getVersionAccess().getMinorEIntParserRuleCall_5_0(), semanticObject.getMinor());
		feeder.accept(grammarAccess.getVersionAccess().getServiceEIntParserRuleCall_7_0(), semanticObject.getService());
		feeder.finish();
	}
	
	
}
