package demo.presentation;

import java.util.List;

import demo.services.MealItemDTO;
import demo.services.MealItemService;

public class ManageMealItem {

	/**
	 * Displays page for use case Manage MealItem 
	 */
	public static void execute() {
		
		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("Manage MealItem Page");

			System.out.println("0-Exit");
			
			System.out.println("1-Create MealItem");
			System.out.println("2-Read MealItem");
			System.out.println("3-Update MealItem");
			System.out.println("4-Delete MealItem");
			System.out.println("5-Read All MealItem");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
				case 0:
					exit=true;
					break;
				case 1:
					create();
					break;					
				case 2:
					read();
					break;
				case 3:
					update();
					break;
				case 4:
					delete();
					break;
				case 5:
					readAll();
					break;
			}
		}		
	}
	
	static void readAll() {
		MealItemService mealItemService=new MealItemService();

		List<MealItemDTO> list=mealItemService.get();
		System.out.println("All MealItemDTO:");
		for (MealItemDTO m3: list) {
			System.out.println(m3.toString());
		}
	}
	
	static void read() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		MealItemService mealItemService=new MealItemService();

		System.out.println("Please enter");
		System.out.println("MealItemId:");
		// Read an integer from the input
		int mealItemId = in.nextInt();		
		
		MealItemDTO m=mealItemService.get(mealItemId);
		System.out.println(m.toString());
	}
	
	static void delete() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		MealItemService mealItemService=new MealItemService();

		System.out.println("Please enter");
		System.out.println("MealItemId:");
		// Read an integer from the input
		int mealItemId = in.nextInt();		
		
		int r=mealItemService.delete(mealItemId);
		if (r==-1)
			System.out.println("Error deleting!");
		else
			System.out.println("Deletion sucessfull");
	}	
	
	static void create() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		MealItemService mealItemService=new MealItemService();

		System.out.println("Please enter");
		System.out.println("Name:");
		String name = in.nextLine();
		System.out.println("MealId:");
		String mealIdString=in.nextLine();
		int mealId = Integer.parseInt(mealIdString);
		System.out.println("ProdDate:");
		String prodDate = in.nextLine();
		System.out.println("ExpDate:");
		String expDate = in.nextLine();
		
		MealItemDTO dto=new MealItemDTO();
		dto.name=name;
		dto.expDate=expDate;
		dto.mealId=mealId;
		dto.prodDate=prodDate;
		
		dto=mealItemService.post(dto);
		System.out.println(dto.toString());
	}	

	static void update() {
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		MealItemService mealItemService=new MealItemService();

		System.out.println("Please enter");
		System.out.println("MealItemId:");
		String mealItemIdString=in.nextLine();
		int mealItemId = Integer.parseInt(mealItemIdString);
		System.out.println("Name:");
		String name = in.nextLine();
		System.out.println("MealId:");
		String mealIdString=in.nextLine();
		int mealId = Integer.parseInt(mealIdString);
		System.out.println("ProdDate:");
		String prodDate = in.nextLine();
		System.out.println("ExpDate:");
		String expDate = in.nextLine();
		
		MealItemDTO dto=new MealItemDTO();
		dto.mealItemId=mealItemId;
		dto.name=name;
		dto.expDate=expDate;
		dto.mealId=mealId;
		dto.prodDate=prodDate;
		
		dto=mealItemService.put(dto);
		System.out.println(dto.toString());
	}
}
