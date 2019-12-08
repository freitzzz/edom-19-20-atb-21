
package domain;

public class FactoryImpl implements Factory {

	public Entity createMeal(MealDTO meal){
		return MealImpl.fromDTO(meal);
	}

	public Entity createIngredient(IngredientDTO ingredient){
		return IngredientImpl.fromDTO(ingredient);
	}

	public Entity createAllergen(AllergenDTO allergen){
		return AllergenImpl.fromDTO(allergen);
	}

	public Entity createDescriptor(DescriptorDTO descriptor){
		return DescriptorImpl.fromDTO(descriptor);
	}

	public Entity createMealType(MealTypeDTO mealtype){
		return MealTypeImpl.fromDTO(mealtype);
	}

	
}
