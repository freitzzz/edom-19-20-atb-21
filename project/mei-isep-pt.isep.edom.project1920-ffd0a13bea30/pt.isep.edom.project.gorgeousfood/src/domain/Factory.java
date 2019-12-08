
package domain;

public interface Factory {

	public Entity createMeal(MealDTO meal);

	public Entity createIngredient(IngredientDTO ingredient);

	public Entity createAllergen(AllergenDTO allergen);

	public Entity createDescriptor(DescriptorDTO descriptor);

	public Entity createMealType(MealTypeDTO mealtype);

	
}
