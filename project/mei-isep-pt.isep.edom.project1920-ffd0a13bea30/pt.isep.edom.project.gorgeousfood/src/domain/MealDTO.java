
package domain;

import java.util.List;

/**
 * @generated NOT
 */
public class MealDTO implements DTO {

	public String name;
	public Integer id;
	public String description;


	public List<IngredientDTO> ingredients;	
		

	public List<AllergenDTO> allergens;	
		

	public List<DescriptorDTO> descriptors;	
		

	public MealTypeDTO mealtype;
		


	public MealDTO(){}

}

