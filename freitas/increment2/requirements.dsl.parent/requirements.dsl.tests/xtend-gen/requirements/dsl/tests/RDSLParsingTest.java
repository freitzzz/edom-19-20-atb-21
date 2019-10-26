/**
 * generated by Xtext 2.19.0
 */
package requirements.dsl.tests;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import requirements.Model;
import requirements.dsl.tests.RDSLInjectorProvider;

@ExtendWith(InjectionExtension.class)
@InjectWith(RDSLInjectorProvider.class)
@SuppressWarnings("all")
public class RDSLParsingTest {
  @Inject
  private ParseHelper<Model> parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Model { title \"Gorgeous Food Application Requirements\" ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("groups { ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("RequirementGroup \"Functional Requirements\" { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("description \"This group details Gorgeous Food Application functional requirements\" ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("children { ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("RequirementGroup \"Manage Meals\" { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("description \"Details functionalities regarding meals management.\" ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("requirements { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Save Meal\" description \"The software should be able to save a meal that is served to students and non students. A meal is identified by its designation, has a type, nutritional data, list of ingredients, can also contain allergens, has a cost-price and is available at a specific location. Once a meal is saved it is only available for the next 24 hours in the specified location.\" author EDOM created \'2018-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Meal Designation\" description \"The software should be able to show a meal designation.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Meal Nutritional Data\" description \"The software should be able to show a meal nutritional data.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Meal Type\" description \"The software should be able to show a meal type.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Meal Location\" description \"The software should be able to show the location in which a meal is available.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Meal Price\" description \"The software should be able to show the price of a meal.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"List Meal Ingreditens\" description \"The software should be able to list the ingredients of a meal.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"List Meal Allergens\" description \"The software should be able to list the allergens of a meal if existent.\" author EDOM created \'2019-10-26T18:51:52.009+0100 id \"0\" version Version { major 0 minor 0 service 1 } } , Requirement { title \"Check Meal Availability\" description \"The software should be able to check if a meal is available. A meal is only available in a period of 24 hours and at a specific location.\" author EDOM created 2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Pay Meal\" description \"The software should be able handle a meal payment. The type of user that is paying for the meal should be recorded. It should not be possible to pay for an unavailable meal or a meal that is unavailable at the payment location.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } }");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("} , ");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("RequirementGroup \"Manage Unserved Meals\" { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("description \"Details functionalities regarding unserved meals management.\" ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("requirements { ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Save Unserved Meal\" description \"The software should be able to save an unserved meal that will be packaged in the latter. It is identified by an identification number, has a production and expiration date and a designation of the meal. An unserved meal also has a state, and once saved its state is set to frozen.\" author EDOM created \'2019-10-26T18:51:52.009+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Unserved Meal Identification Number\" description \"The software should be able to show an unserved meal identification number.\" author EDOM created \'2019-10-26T18:51:52.010+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Unserved Meal Designation\" description \"The software should be able to show an unserved meal designation.\" author EDOM created \'2019-10-26T18:51:52.010+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Unserved Meal Production Date\" description \"The software should be able to show an unserved meal production date.\" author EDOM created \'2019-10-26T18:51:52.010+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Unserved Meal Expiration Date\" description \"The software should be able to show an unserved meal expiration date.\" author EDOM created \'2019-10-26T18:51:52.010+0100\' id \"0\" version Version { major 0 minor 0 service 1 } } , ");
      _builder.newLine();
      _builder.append("\t\t\t\t\t\t");
      _builder.append("Requirement { title \"Show Unserved Meal State\" description \"The software should be able to show an unserved meal state.\" author EDOM created \'2019-10-26T18:51:52.010+0100\' id \"0\" version Version { major 0 minor 0 service 1 } }");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} , ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("RequirementGroup \"Quality Attributes\" { ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("description \"This group details Gorgeous Food Application quality attributes\"");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("} ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final Model result = this.parseHelper.parse(_builder);
      Assertions.assertNotNull(result);
      final EList<Resource.Diagnostic> errors = result.eResource().getErrors();
      boolean _isEmpty = errors.isEmpty();
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("Unexpected errors: ");
      String _join = IterableExtensions.join(errors, ", ");
      _builder_1.append(_join);
      Assertions.assertTrue(_isEmpty, _builder_1.toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
