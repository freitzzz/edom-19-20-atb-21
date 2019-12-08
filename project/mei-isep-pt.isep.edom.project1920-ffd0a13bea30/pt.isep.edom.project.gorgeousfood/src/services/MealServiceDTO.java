package services;

public class MealServiceDTO {
	public String name;
	
	public int mealId;
	
	public MealServiceDTO() {
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MealDTO [name=" + this.name + ", mealI="
        + this.mealId + ", ]";
	}	
}
