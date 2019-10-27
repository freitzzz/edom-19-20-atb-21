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
  @Inject
  @Extension
  private RDSLGrammarAccess _rDSLGrammarAccess;
  
  /**
   * We want our Model to be formatted in the following format:
   * 
   * Model {
   * 	title ...
   * 	groups {...}
   * }
   */
  protected void _format(final Model model, @Extension final IFormattableDocument document) {
    final ISemanticRegion model_keyword = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getModelKeyword_1());
    final ISemanticRegion open_bracket_keyword = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getLeftCurlyBracketKeyword_4_1());
    final ISemanticRegion close_bracket_keyword = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getRightCurlyBracketKeyword_4_4());
    ISemanticRegion title_keyword = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getTitleKeyword_3_0());
    ISemanticRegion groups_keyword = this.textRegionExtensions.regionFor(model).keyword(this._rDSLGrammarAccess.getModelAccess().getGroupsKeyword_4_0());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(model_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(title_keyword, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket_keyword, close_bracket_keyword, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.setSpace("  ");
    };
    document.prepend(title_keyword, _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(title_keyword, _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(groups_keyword, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace("  ");
    };
    document.prepend(groups_keyword, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(groups_keyword, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket_keyword, _function_8);
    EList<RequirementGroup> _groups = model.getGroups();
    for (final RequirementGroup requirementGroup : _groups) {
      {
        document.<RequirementGroup>format(requirementGroup);
        final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<RequirementGroup>append(requirementGroup, _function_9);
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
    final ISemanticRegion requirement_group_keyword = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getRequirementGroupKeyword_1());
    final ISemanticRegion description_keyword = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getDescriptionKeyword_4_0());
    final ISemanticRegion id_keyword = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getIdKeyword_5_0());
    final ISemanticRegion requirements_keyword = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getRequirementsKeyword_6_0());
    final ISemanticRegion children_keyword = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getChildrenKeyword_7_0());
    final ISemanticRegion open_bracket_keyword = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getLeftCurlyBracketKeyword_6_1());
    final ISemanticRegion close_bracket_keyword = this.textRegionExtensions.regionFor(requirementGroup).keyword(this._rDSLGrammarAccess.getRequirementGroupAccess().getRightCurlyBracketKeyword_6_4());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(requirement_group_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(description_keyword, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(description_keyword, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(id_keyword, _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(id_keyword, _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(requirements_keyword, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(requirements_keyword, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(children_keyword, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(children_keyword, _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket_keyword, close_bracket_keyword, _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket_keyword, _function_10);
    EList<Requirement> _requirements = requirementGroup.getRequirements();
    for (final Requirement requirement : _requirements) {
      {
        document.<Requirement>format(requirement);
        final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Requirement>append(requirement, _function_11);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket_keyword, _function_11);
    EList<RequirementGroup> _children = requirementGroup.getChildren();
    for (final RequirementGroup _requirementGroup : _children) {
      {
        document.<RequirementGroup>format(_requirementGroup);
        final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<RequirementGroup>append(_requirementGroup, _function_12);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(close_bracket_keyword, _function_12);
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
    final ISemanticRegion requirement_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getRequirementKeyword_0());
    final ISemanticRegion title_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getTitleKeyword_2_0());
    final ISemanticRegion description_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
    final ISemanticRegion type_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getTypeKeyword_4_0());
    final ISemanticRegion priority_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getPriorityKeyword_5_0());
    final ISemanticRegion author_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getAuthorKeyword_6_0());
    final ISemanticRegion created_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getCreatedKeyword_7_0());
    final ISemanticRegion id_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getIdKeyword_8_0());
    final ISemanticRegion state_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getStateKeyword_9_0());
    final ISemanticRegion resolution_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getResolutionKeyword_10_0());
    final ISemanticRegion version_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getVersionKeyword_12());
    final ISemanticRegion dependencies_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getDependenciesKeyword_11_0());
    final ISemanticRegion children_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getChildrenKeyword_15_0());
    final ISemanticRegion comments_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getCommentsKeyword_14_0());
    final ISemanticRegion open_bracket_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getLeftCurlyBracketKeyword_14_1());
    final ISemanticRegion close_bracket_keyword = this.textRegionExtensions.regionFor(requirement).keyword(this._rDSLGrammarAccess.getRequirementAccess().getRightCurlyBracketKeyword_14_4());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(requirement_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(title_keyword, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(title_keyword, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(description_keyword, _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(description_keyword, _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(type_keyword, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(type_keyword, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(priority_keyword, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(priority_keyword, _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(author_keyword, _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(author_keyword, _function_10);
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(created_keyword, _function_11);
    final Procedure1<IHiddenRegionFormatter> _function_12 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(created_keyword, _function_12);
    final Procedure1<IHiddenRegionFormatter> _function_13 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(id_keyword, _function_13);
    final Procedure1<IHiddenRegionFormatter> _function_14 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(id_keyword, _function_14);
    final Procedure1<IHiddenRegionFormatter> _function_15 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(state_keyword, _function_15);
    final Procedure1<IHiddenRegionFormatter> _function_16 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(state_keyword, _function_16);
    final Procedure1<IHiddenRegionFormatter> _function_17 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(resolution_keyword, _function_17);
    final Procedure1<IHiddenRegionFormatter> _function_18 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(resolution_keyword, _function_18);
    final Procedure1<IHiddenRegionFormatter> _function_19 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(version_keyword, _function_19);
    final Procedure1<IHiddenRegionFormatter> _function_20 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(version_keyword, _function_20);
    document.<Version>format(requirement.getVersion());
    final Procedure1<IHiddenRegionFormatter> _function_21 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(dependencies_keyword, _function_21);
    final Procedure1<IHiddenRegionFormatter> _function_22 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(dependencies_keyword, _function_22);
    final Procedure1<IHiddenRegionFormatter> _function_23 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(children_keyword, _function_23);
    final Procedure1<IHiddenRegionFormatter> _function_24 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(children_keyword, _function_24);
    final Procedure1<IHiddenRegionFormatter> _function_25 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(comments_keyword, _function_25);
    final Procedure1<IHiddenRegionFormatter> _function_26 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(comments_keyword, _function_26);
    final Procedure1<IHiddenRegionFormatter> _function_27 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket_keyword, close_bracket_keyword, _function_27);
    final Procedure1<IHiddenRegionFormatter> _function_28 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket_keyword, _function_28);
    EList<Requirement> _dependencies = requirement.getDependencies();
    for (final Requirement dependency : _dependencies) {
      {
        document.<Requirement>format(dependency);
        final Procedure1<IHiddenRegionFormatter> _function_29 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Requirement>append(dependency, _function_29);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_29 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket_keyword, _function_29);
    EList<Requirement> _children = requirement.getChildren();
    for (final Requirement children : _children) {
      {
        document.<Requirement>format(children);
        final Procedure1<IHiddenRegionFormatter> _function_30 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Requirement>append(children, _function_30);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_30 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(open_bracket_keyword, _function_30);
    EList<Comment> _comments = requirement.getComments();
    for (final Comment comment : _comments) {
      {
        document.<Comment>format(comment);
        final Procedure1<IHiddenRegionFormatter> _function_31 = (IHiddenRegionFormatter it) -> {
          it.newLine();
        };
        document.<Comment>append(comment, _function_31);
      }
    }
    final Procedure1<IHiddenRegionFormatter> _function_31 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(close_bracket_keyword, _function_31);
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
    final ISemanticRegion version_keyword = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getVersionKeyword_0());
    final ISemanticRegion major_keyword = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getMajorKeyword_2());
    final ISemanticRegion minor_keyword = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getMinorKeyword_4());
    final ISemanticRegion service_keyword = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getServiceKeyword_6());
    final ISemanticRegion open_bracket_keyword = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getLeftCurlyBracketKeyword_1());
    final ISemanticRegion close_bracket_keyword = this.textRegionExtensions.regionFor(version).keyword(this._rDSLGrammarAccess.getVersionAccess().getRightCurlyBracketKeyword_8());
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(version_keyword, _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(major_keyword, _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(major_keyword, _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(minor_keyword, _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(minor_keyword, _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(service_keyword, _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.setSpace(" ");
    };
    document.append(service_keyword, _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    document.<ISemanticRegion, ISemanticRegion>interior(open_bracket_keyword, close_bracket_keyword, _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(close_bracket_keyword, _function_8);
  }
  
  public void format(final Object model, final IFormattableDocument document) {
    if (model instanceof XtextResource) {
      _format((XtextResource)model, document);
      return;
    } else if (model instanceof Model) {
      _format((Model)model, document);
      return;
    } else if (model instanceof Requirement) {
      _format((Requirement)model, document);
      return;
    } else if (model instanceof RequirementGroup) {
      _format((RequirementGroup)model, document);
      return;
    } else if (model instanceof Version) {
      _format((Version)model, document);
      return;
    } else if (model instanceof EObject) {
      _format((EObject)model, document);
      return;
    } else if (model == null) {
      _format((Void)null, document);
      return;
    } else if (model != null) {
      _format(model, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(model, document).toString());
    }
  }
}
