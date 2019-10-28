/*
 * generated by Xtext 2.19.0
 */
package requirements.dsl.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith
import requirements.Model
import org.junit.jupiter.api.BeforeAll

@ExtendWith(InjectionExtension)
@InjectWith(RDSLInjectorProvider)
class RDSLParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Model { 
				title "Gorgeous Food Application Requirements" 
				groups { 
					RequirementGroup "Functional Requirements" { 
						description "This group details Gorgeous Food Application functional requirements" 
						children { 
							RequirementGroup "Manage Meals" { 
								description "Details functionalities regarding meals management." 
								requirements { 
									Requirement { title "Save Meal" description "The software should be able to save a meal that is served to students and non students. A meal is identified by its designation, has a type, nutritional data, list of ingredients, can also contain allergens, has a cost-price and is available at a specific location. Once a meal is saved it is only available for the next 24 hours in the specified location." author EDOM created '2018-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Meal Designation" description "The software should be able to show a meal designation." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Meal Nutritional Data" description "The software should be able to show a meal nutritional data." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Meal Type" description "The software should be able to show a meal type." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Meal Location" description "The software should be able to show the location in which a meal is available." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Meal Price" description "The software should be able to show the price of a meal." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "List Meal Ingreditens" description "The software should be able to list the ingredients of a meal." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "List Meal Allergens" description "The software should be able to list the allergens of a meal if existent." author EDOM created '2019-10-26T18:51:52.009+0100 id "0" version Version { major 0 minor 0 service 1 } } , Requirement { title "Check Meal Availability" description "The software should be able to check if a meal is available. A meal is only available in a period of 24 hours and at a specific location." author EDOM created 2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Pay Meal" description "The software should be able handle a meal payment. The type of user that is paying for the meal should be recorded. It should not be possible to pay for an unavailable meal or a meal that is unavailable at the payment location." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } }
								}
							} , 
							RequirementGroup "Manage Unserved Meals" { 
								description "Details functionalities regarding unserved meals management." 
								requirements { 
									Requirement { title "Save Unserved Meal" description "The software should be able to save an unserved meal that will be packaged in the latter. It is identified by an identification number, has a production and expiration date and a designation of the meal. An unserved meal also has a state, and once saved its state is set to frozen." author EDOM created '2019-10-26T18:51:52.009+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Unserved Meal Identification Number" description "The software should be able to show an unserved meal identification number." author EDOM created '2019-10-26T18:51:52.010+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Unserved Meal Designation" description "The software should be able to show an unserved meal designation." author EDOM created '2019-10-26T18:51:52.010+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Unserved Meal Production Date" description "The software should be able to show an unserved meal production date." author EDOM created '2019-10-26T18:51:52.010+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Unserved Meal Expiration Date" description "The software should be able to show an unserved meal expiration date." author EDOM created '2019-10-26T18:51:52.010+0100' id "0" version Version { major 0 minor 0 service 1 } } , 
									Requirement { title "Show Unserved Meal State" description "The software should be able to show an unserved meal state." author EDOM created '2019-10-26T18:51:52.010+0100' id "0" version Version { major 0 minor 0 service 1 } }
								}
							}
						}
					} , 
					RequirementGroup "Quality Attributes" { 
						description "This group details Gorgeous Food Application quality attributes"
					}
				} 
			}
		''')
		Assertions.assertNotNull(result)
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
	
	@Test
	def void testNoModelDefinitionFailsParse() {
		
		var model = ''''''
		
		var result = parseHelper.parse(model)
		
		var errors = result.eResource.errors
		
		var hasErrors = !errors.empty
		
		Assertions.assertTrue(hasErrors)
	}
	
	@Test
	def void testModelWithNoTitleDefinitionFailsParse() {
		
		var model = '''
			Model {}
		'''
		
		var result = parseHelper.parse(model)
		
		var errors = result.eResource.errors
		
		var hasErrors = !errors.empty
		
		Assertions.assertTrue(hasErrors)
	}
	
	
	@Test
	def void testModelWithTitleLengthLessThanThreeFailsParse() {
		
		var model = '''
			Model {
				title tw
			}
		'''
		
		var result = parseHelper.parse(model)
		
		var errors = result.eResource.errors
		
		var hasErrors = !errors.empty
		
		Assertions.assertTrue(hasErrors)
	}
	
	
	@Test
	def void testModelWithTitleLengthGreaterOrEqualThanThreeSucceedsParse() {
		
		var model = '''
			Model {
				title two
			}
		'''
		
		var result = parseHelper.parse(model)
		
		var errors = result.eResource.errors
		
		var succeeds = errors.empty
		
		Assertions.assertTrue(succeeds)
	}
	
	
	@Test
	def void testRequirementGroupWithNameLengthLessThanFiveFailsParse(){}
	
	
	@Test
	def void testRequirementGroupWithNameLengthGreaterOrEqualThanFiveSucceedsParse(){}
	
	
	@Test
	def void testRequirementGroupWithoutDescriptionFailsParse(){}
	
	
	@Test
	def void testRequirementGroupWithDescriptionLengthLessThanTenFailsParse(){}
	
	
	@Test
	def void testRequirementGroupWithDescriptionLengthGreaterOrEqualThanTenSucceedsParse(){}
	
	
	@Test
	def void testRequirementGroupWithSubRequirementGroupsWithSameNameFailsParse(){}
	
	
	@Test
	def void testRequirementWithoutTitleFailsParse(){}
	
	
	@Test
	def void testRequirementWithTitleLengthLessThanFiveFailsParse(){}
	
	
	@Test
	def void testRequirementWithTitleLengthGreaterOrEqualThanFiveSucceedsParse(){}
	
	
	@Test
	def void testRequirementWithoutDescriptionFailsParse(){}
	
	
	@Test
	def void testRequirementWithDescriptionLengthLessThanTenFailsParse(){}
	
	
	@Test
	def void testRequirementWithDescriptionLengthGreaterOrEqualThanTenSucceedsParse(){}
	
	
	@Test
	def void testRequirementWithResolvedStateAndInvalidResolutionFailsParse(){}
	
	
	@Test
	def void testRequirementWithApprovedStateAndInvalidResolutionFailsParse(){}
	
	
	@Test
	def void testRequirementWithReviewedStateAndInvalidResolutionFailsParse(){}
	
	
	@Test
	def void testRequirementWithoutCreationDateFailsParse(){}
	
	
	@Test
	def void testRequirementWithoutAuthorFailsParse(){}
	
	
	@Test
	def void testRequirementWithAuthorLengthLessThanThreeFailsParse(){}
	
	
	@Test
	def void testRequirementWithAuthorLengthGreaterOrEqualThanThreeSucceedsParse(){}
	
	
	@Test
	def void testVersionWithMajorLowerThanZeroFailsParse(){}
	
	
	@Test
	def void testVersionWithMinorLowerThanZeroFailsParse(){}
	
	
	@Test
	def void testVersionWithServiceLowerThanZeroFailsParse(){}
	
	
	@Test
	def void testCommentWithoutAuthorFailsParse(){}
	
	
	@Test
	def void testCommentWithAuthorLengthLessThanThreeFailsParse(){}
	
	
	@Test
	def void testCommentWithAuthorLengthGreaterOrEqualThanThreeSucceedsParse(){}
	
	
	@Test
	def void testCommentWithoutBodyFailsParse(){}
	
	
	@Test
	def void testCommentWithBodyLengthLessThanFifteenFailsParse(){}
	
	
	@Test
	def void testCommentWithBodyLengthGreaterOrEqualThanFifteenSucceedsParse(){}
	
	
	@Test
	def void testCommentWithoutSubjectFailsParse(){}
	
	
	@Test
	def void testCommentWithSubjectLengthLessThanTenFailsParse(){}
	
	
	@Test
	def void testCommentWithSubjectLengthGreaterOrEqualThanTenSucceedsParse(){}
	
	
	@Test
	def void testCommentWithoutCreationDateFailsParse(){}
}
