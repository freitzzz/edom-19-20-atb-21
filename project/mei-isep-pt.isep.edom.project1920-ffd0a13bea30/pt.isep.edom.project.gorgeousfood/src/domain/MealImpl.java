
package domain;

import java.util.List;
import java.util.ArrayList;

/**
 * @generated NOT
 */
public class MealImpl implements Meal {

	private String name;
	private Integer id;
	private String description;


	private List<Ingredient> ingredients;	
		

	private List<Allergen> allergens;	
		

	private List<Descriptor> descriptors;	
		

	private MealType mealtype;
		

	public static MealImpl fromDTO(MealDTO dto)
	{
		String _name = dto.name;
		Integer _id = dto.id;
		String _description = dto.description;
		
		List<IngredientDTO> _ingredientDTO = dto.ingredients;
		List<Ingredient> _ingredients = new ArrayList<>();
		
		if(_ingredientDTO != null){
			for(int i = 0; i < _ingredientDTO.size(); i++){
				_ingredients.add(IngredientImpl.fromDTO(_ingredientDTO.get(i)));
			}
		}
		List<AllergenDTO> _allergenDTO = dto.allergens;
		List<Allergen> _allergens = new ArrayList<>();
		
		if(_allergenDTO != null){
			for(int i = 0; i < _allergenDTO.size(); i++){
				_allergens.add(AllergenImpl.fromDTO(_allergenDTO.get(i)));
			}
		}
		List<DescriptorDTO> _descriptorDTO = dto.descriptors;
		List<Descriptor> _descriptors = new ArrayList<>();
		
		if(_descriptorDTO != null){
			for(int i = 0; i < _descriptorDTO.size(); i++){
				_descriptors.add(DescriptorImpl.fromDTO(_descriptorDTO.get(i)));
			}
		}
		
		MealType _mealtype = MealTypeImpl.fromDTO(dto.mealtype);

		return new MealImpl
				(
					
				
					_name
				
					,_id
				
					,_description
				
				
					,_ingredients
						
				
					,_allergens
						
				
					,_descriptors
						
				
					,_mealtype
						

				);

	}

	public MealImpl
		(
		String name
		,
		Integer id
		,
		String description

		,List<Ingredient> ingredients

		,List<Allergen> allergens

		,List<Descriptor> descriptors
		,MealType mealtype
		)
		{
			this.name = name;
			this.id = id;
			this.description = description;
		
		
			this.ingredients = new ArrayList<>(ingredients);	
				
		
			this.allergens = new ArrayList<>(allergens);	
				
		
			this.descriptors = new ArrayList<>(descriptors);	
				
		
		
			this.mealtype = mealtype;
				
		}


	public MealImpl
		(
		String name
		,
		Integer id
		,
		String description
	

		,List<Ingredient> ingredients
	
	

		,List<Descriptor> descriptors
		,MealType mealtype
		)
		{
			this.name = name;
			this.id = id;
			this.description = description;
		
		

			this.ingredients = new ArrayList<>(ingredients);
	
				
		

	
				
		

			this.descriptors = new ArrayList<>(descriptors);
	
				
		
		
			this.mealtype = mealtype;
				
		}


	public String name(){return name;}
	public Integer id(){return id;}
	public String description(){return description;}


	public List<Ingredient> ingredients(){return new ArrayList<Ingredient>(ingredients);}
		

	public List<Allergen> allergens(){return new ArrayList<Allergen>(allergens);}
		

	public List<Descriptor> descriptors(){return new ArrayList<Descriptor>(descriptors);}
		


	public MealType mealtype(){return mealtype;}
		

}

