
package domain;


/**
 * @generated NOT
 */
public class MealTypeImpl implements MealType {

	private String name;
	private Integer id;



	public static MealTypeImpl fromDTO(MealTypeDTO dto)
	{
		String _name = dto.name;
		Integer _id = dto.id;
		
		

		return new MealTypeImpl
				(
					
				
					_name
				
					,_id
				
				

				);

	}

	public MealTypeImpl
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

