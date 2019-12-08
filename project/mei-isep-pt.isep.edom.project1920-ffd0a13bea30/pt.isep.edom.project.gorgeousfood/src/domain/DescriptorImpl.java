
package domain;


/**
 * @generated NOT
 */
public class DescriptorImpl implements Descriptor {

	private String name;
	private Integer id;
	private Double quantity;
	private String quantityUnit;



	public static DescriptorImpl fromDTO(DescriptorDTO dto)
	{
		String _name = dto.name;
		Integer _id = dto.id;
		Double _quantity = dto.quantity;
		String _quantityUnit = dto.quantityUnit;
		
		

		return new DescriptorImpl
				(
					
				
					_name
				
					,_id
				
					,_quantity
				
					,_quantityUnit
				
				

				);

	}

	public DescriptorImpl
		(
		String name
		,
		Integer id
		,
		Double quantity
		,
		String quantityUnit
		)
		{
			this.name = name;
			this.id = id;
			this.quantity = quantity;
			this.quantityUnit = quantityUnit;
		
		
		}




	public String name(){return name;}
	public Integer id(){return id;}
	public Double quantity(){return quantity;}
	public String quantityUnit(){return quantityUnit;}



}

