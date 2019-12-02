package demo.services;

public class MealItemDTO {
	public int mealItemId;
	public String name;
	
	public int mealId;
	public String prodDate;
	public String expDate;
	
	public MealItemDTO() {
		this.mealItemId=0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MealItemDTO [mealItemId=" + this.mealItemId + ", name=" + this.name + ", mealI="
        + this.mealId + ", prodDate=" + this.prodDate + ", expDate=" + this.expDate + "]";
	}	
}
