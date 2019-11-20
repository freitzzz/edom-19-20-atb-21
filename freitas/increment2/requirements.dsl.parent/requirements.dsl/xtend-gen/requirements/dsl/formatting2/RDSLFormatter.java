/**
 * generated by Xtext 2.19.0
 */
package requirements.dsl.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.formatting2.regionaccess.ISemanticRegion;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import requirements.Comment;
import requirements.Model;
import requirements.Requirement;
import requirements.RequirementGroup;
import requirements.Version;
import requirements.dsl.services.RDSLGrammarAccess;

@SuppressWarnings("all")
public class RDSLFormatter extends AbstractFormatter2 {
  /**
   * We want our Model to be formatted in the following format:
   * 
   * Model {
   * 	title ...
   * 	groups {...}
   * }
   */
  @Inject
  @Extension
  private RDSLGrammarAccess _rDSLGrammarAccess;
  
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    final ISemanticRegion open_bracket = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getLeftCurlyBracketKeyword_2());
    final ISemanticRegion close_bracket = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getRightCurlyBracketKeyword_5());
    final ISemanticRegion groups_open_bracket = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
    final ISemanticRegion groups_close_bracket = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket, close_bracket, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getGroupsKeyword_4_0()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(groups_open_bracket, _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(groups_open_bracket, groups_close_bracket, _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(groups_close_bracket, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(close_bracket, _function_6);
    EList<RequirementGroup> _groups = model.getGroups();
    for (final RequirementGroup requirementGroup : _groups) {
      {
        document.<RequirementGroup>format(requirementGroup);
        final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<RequirementGroup>append(requirementGroup, _function_7);
      }
    }
  }
  
  /**
   * We want our RequirementGroup to be formatted in the following format:
   * 
   * RequirentGroup {
   * 	name ...
   * 	description ...
   *  id ...
   *  parent ...
   *  requirements {...}
   *  children {...}
   * }
   */
  protected void _format(final RequirementGroup requirementGroup, @Extension final IFormattableDocument document) {
    final ISemanticRegion open_bracket = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_3());
    final ISemanticRegion close_bracket = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_8());
    final ISemanticRegion requirements_open_bracket = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_6_1());
    final ISemanticRegion requirements_close_bracket = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_6_4());
    final ISemanticRegion children_open_bracket = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_7_1());
    final ISemanticRegion children_close_bracket = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_7_4());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket, close_bracket, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getDescriptionKeyword_4_0()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getIdKeyword_5_0()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getChildrenKeyword_7_0()), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getRequirementsKeyword_6_0()), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(requirements_open_bracket, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(requirements_open_bracket, requirements_close_bracket, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(requirements_close_bracket, _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(children_open_bracket, _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(children_open_bracket, children_close_bracket, _function_10);
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(children_close_bracket, _function_11);
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(close_bracket, _function_12);
    EList<Requirement> _requirements = requirementGroup.getRequirements();
    for (final Requirement requirement : _requirements) {
      {
        document.<Requirement>format(requirement);
        final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Requirement>append(requirement, _function_13);
      }
    }
    EList<RequirementGroup> _children = requirementGroup.getChildren();
    for (final RequirementGroup _requirementGroup : _children) {
      {
        document.<RequirementGroup>format(_requirementGroup);
        final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<RequirementGroup>append(_requirementGroup, _function_13);
      }
    }
  }
  
  /**
   * We want our Requirement to be formatted in the following format:
   * 
   * Requirement {
   * 	title ...
   * 	description ...
   *  type ...
   *  priority ...
   *  author ...
   *  created ...
   *  id ...
   *  state ...
   *  resolution ...
   *  version {...}
   *  dependencies {...}
   *  children {...}
   *  comments {...}
   * }
   */
  protected void _format(final Requirement requirement, @Extension final IFormattableDocument document) {
    final ISemanticRegion open_bracket = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_3());
    final ISemanticRegion close_bracket = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_17());
    final ISemanticRegion comments_open_bracket = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_15_1());
    final ISemanticRegion comments_close_bracket = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_15_4());
    final ISemanticRegion children_open_bracket = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_16_1());
    final ISemanticRegion children_close_bracket = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_16_4());
    final ISemanticRegion dependencies_open_parenthesis = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getLeftParenthesisKeyword_12_1());
    final ISemanticRegion dependencies_close_parenthesis = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getRightParenthesisKeyword_12_4());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket, close_bracket, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getAuthorKeyword_7_0()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getCreatedKeyword_8_0()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getDependenciesKeyword_12_0()), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getDescriptionKeyword_4_0()), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getIdKeyword_9_0()), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getPriorityKeyword_6_0()), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getResolutionKeyword_11_0()), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getStateKeyword_10_0()), _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getTypeKeyword_5_0()), _function_10);
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getVersionKeyword_13()), _function_11);
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getChildrenKeyword_16_0()), _function_12);
    final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getCommentsKeyword_15_0()), _function_13);
    Version _version = requirement.getVersion();
    boolean _tripleNotEquals = (_version != null);
    if (_tripleNotEquals) {
      document.<Version>format(requirement.getVersion());
    }
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(comments_open_bracket, _function_14);
    final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(comments_open_bracket, comments_close_bracket, _function_15);
    final Procedure1<IHiddenRegionFormatter> _function_16 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(comments_close_bracket, _function_16);
    final Procedure1<IHiddenRegionFormatter> _function_17 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(children_open_bracket, _function_17);
    final Procedure1<IHiddenRegionFormatter> _function_18 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(children_open_bracket, children_close_bracket, _function_18);
    final Procedure1<IHiddenRegionFormatter> _function_19 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(children_close_bracket, _function_19);
    final Procedure1<IHiddenRegionFormatter> _function_20 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(dependencies_open_parenthesis, _function_20);
    final Procedure1<IHiddenRegionFormatter> _function_21 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(dependencies_open_parenthesis, dependencies_close_parenthesis, _function_21);
    final Procedure1<IHiddenRegionFormatter> _function_22 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(dependencies_close_parenthesis, _function_22);
    final Procedure1<IHiddenRegionFormatter> _function_23 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(close_bracket, _function_23);
    EList<Requirement> _dependencies = requirement.getDependencies();
    for (final Requirement dependency : _dependencies) {
      {
        document.<Requirement>format(dependency);
        final Procedure1<IHiddenRegionFormatter> _function_24 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Requirement>append(dependency, _function_24);
      }
    }
    EList<Requirement> _children = requirement.getChildren();
    for (final Requirement children : _children) {
      {
        document.<Requirement>format(children);
        final Procedure1<IHiddenRegionFormatter> _function_24 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Requirement>append(children, _function_24);
      }
    }
    EList<Comment> _comments = requirement.getComments();
    for (final Comment comment : _comments) {
      {
        document.<Comment>format(comment);
        final Procedure1<IHiddenRegionFormatter> _function_24 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Comment>append(comment, _function_24);
      }
    }
  }
  
  /**
   * We want our Version to be formatted in the following format:
   * 
   * Version {
   * 	major ...
   * 	minor ...
   * 	service ...
   * }
   */
  protected void _format(final Version version, @Extension final IFormattableDocument document) {
    final ISemanticRegion open_bracket = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1());
    final ISemanticRegion close_bracket = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getRightCurlyBracketKeyword_8());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket, close_bracket, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getMinorKeyword_4()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getMajorKeyword_2()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getServiceKeyword_6()), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getRightCurlyBracketKeyword_8()), _function_5);
  }
  
  /**
   * We want our Comment to be formatted in the following format:
   * 
   * Comment {
   * 	body ...
   * 	author ...
   * 	created ...
   * 	children {...}
   * }
   */
  protected void _format(final Comment comment, @Extension final IFormattableDocument document) {
    final ISemanticRegion open_bracket = this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_2());
    final ISemanticRegion close_bracket = this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getRightCurlyBracketKeyword_8());
    final ISemanticRegion children_open_bracket = this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getLeftCurlyBracketKeyword_7_1());
    final ISemanticRegion children_close_bracket = this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getRightCurlyBracketKeyword_7_4());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket, close_bracket, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getBodyKeyword_4_0()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getSubjectKeyword_3_0()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getAuthorKeyword_5_0()), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(comment).keyword(this._rDSLGrammarAccess.getCommentAccess().getCreatedKeyword_6_0()), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(children_open_bracket, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(children_open_bracket, children_close_bracket, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(children_close_bracket, _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(close_bracket, _function_9);
    EList<Comment> _children = comment.getChildren();
    for (final Comment _comment : _children) {
      {
        document.<Comment>format(_comment);
        final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Comment>append(_comment, _function_10);
      }
    }
  }
  
  public void format(final Object comment, final IFormattableDocument document) {
    if (comment instanceof XtextResource) {
      _format((XtextResource)comment, document);
      return;
    } else if (comment instanceof Comment) {
      _format((Comment)comment, document);
      return;
    } else if (comment instanceof Model) {
      _format((Model)comment, document);
      return;
    } else if (comment instanceof Requirement) {
      _format((Requirement)comment, document);
      return;
    } else if (comment instanceof RequirementGroup) {
      _format((RequirementGroup)comment, document);
      return;
    } else if (comment instanceof Version) {
      _format((Version)comment, document);
      return;
    } else if (comment instanceof EObject) {
      _format((EObject)comment, document);
      return;
    } else if (comment == null) {
      _format((Void)null, document);
      return;
    } else if (comment != null) {
      _format(comment, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(comment, document).toString());
    }
  }
}
