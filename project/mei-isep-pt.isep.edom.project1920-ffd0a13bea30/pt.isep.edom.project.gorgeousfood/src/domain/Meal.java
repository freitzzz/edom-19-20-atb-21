
package domain;

import java.util.List;

/**
 * @generated NOT
 */
public interface Meal extends Entity {


	public String name();		


	public Integer id();		


	public String description();		



	public List<Ingredient> ingredients();	
		

	public List<Allergen> allergens();	
		

	public List<Descriptor> descriptors();	
		


	public MealType mealtype();
		

}

