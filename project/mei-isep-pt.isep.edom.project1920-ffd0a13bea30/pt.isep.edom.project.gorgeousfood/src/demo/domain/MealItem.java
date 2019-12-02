package demo.domain;

import demo.services.MealItemDTO;

public class MealItem {

	int mealItemId;
	String name;
	
	int mealId;
	String prodDate;
	String expDate;
	
	public MealItem(int mealItemId, String name, int mealId, String prodDate, String expDate) {
		this.mealItemId=mealItemId;
		this.name=name;
		this.mealId=mealId;
		this.prodDate=prodDate;
		this.expDate=expDate;	    
	}
	
	public MealItem(String name, int mealId, String prodDate, String expDate) {
		this.mealItemId=0;
		this.name=name;
		this.mealId=mealId;
		this.prodDate=prodDate;
		this.expDate=expDate;	
	}
	
	public int getMealItemId() {
		return mealItemId;
	}

	public String getName() {
		return name;
	}

	public int getMealId() {
		return mealId;
	}

	public String getProdDate() {
		return prodDate;
	}

	public String getExpDate() {
		return expDate;
	}
	
	public MealItemDTO toDTO() {
		MealItemDTO dto=new MealItemDTO();
	
		dto.mealItemId=this.mealItemId;
		dto.name=this.name;
		dto.mealId=this.mealId;
		dto.expDate=this.expDate;
		dto.prodDate=this.prodDate;
		
		return dto;
	}
	
	public static MealItem fromDTO(MealItemDTO dto) {
		return new MealItem(dto.mealItemId,
				dto.name,
				dto.mealId,
				dto.prodDate,
				dto.expDate);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MealItem [mealItemId()=" + getMealItemId() + ", name()=" + getName() + ", mealId()="
        + getMealId() + ", prodDate()=" + getProdDate() + ", expDate()=" + getExpDate() + "]";
	}
	
}
