
package domain;


/**
 * @generated NOT
 */
public class IngredientImpl implements Ingredient {

	private String name;
	private Integer id;



	public static IngredientImpl fromDTO(IngredientDTO dto)
	{
		String _name = dto.name;
		Integer _id = dto.id;
		
		

		return new IngredientImpl
				(
					
				
					_name
				
					,_id
				
				

				);

	}

	public IngredientImpl
		(
		String name
		,
		Integer id
		)
		{
			this.name = name;
			this.id = id;
		
		
		}




	public String name(){return name;}
	public Integer id(){return id;}



}

