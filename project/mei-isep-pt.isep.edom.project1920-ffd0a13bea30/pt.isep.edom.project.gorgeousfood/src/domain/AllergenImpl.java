
package domain;


/**
 * @generated NOT
 */
public class AllergenImpl implements Allergen {

	private String name;
	private Integer id;



	public static AllergenImpl fromDTO(AllergenDTO dto)
	{
		String _name = dto.name;
		Integer _id = dto.id;
		
		

		return new AllergenImpl
				(
					
				
					_name
				
					,_id
				
				

				);

	}

	public AllergenImpl
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

