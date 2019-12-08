package presentation;

import java.util.List;

import services.MealServiceDTO;
import services.MealService;

public class ManageMeal {

	/**
	 * Displays page for use case Manage Meal
	 */
	public static void execute() {

		boolean exit = false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("Manage Meal Page");

			System.out.println("0-Exit");

			System.out.println("1-Create Meal");
			System.out.println("2-Read Meal");
			System.out.println("3-Update Meal");
			System.out.println("4-Delete Meal");
			System.out.println("5-Read All Meal");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
			case 0:
				exit = true;
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
		services.MealService MealService = new services.MealService();

		List<MealServiceDTO> list = MealService.get();
		System.out.println("All MealServiceDTO:");
		for (MealServiceDTO m3 : list) {
			System.out.println(m3.toString());
		}
	}

	static void read() {
		java.util.Scanner in = new java.util.Scanner(System.in);

		MealService MealService = new MealService();

		System.out.println("Please enter");
		System.out.println("MealId:");
		// Read an integer from the input
		int MealId = in.nextInt();

		MealServiceDTO m = MealService.get(MealId);
		System.out.println(m.toString());
	}

	static void delete() {
		java.util.Scanner in = new java.util.Scanner(System.in);

		MealService MealService = new MealService();

		System.out.println("Please enter");
		System.out.println("MealId:");
		// Read an integer from the input
		int MealId = in.nextInt();

		int r = MealService.delete(MealId);
		if (r == -1)
			System.out.println("Error deleting!");
		else
			System.out.println("Deletion sucessfull");
	}

	static void create() {
		java.util.Scanner in = new java.util.Scanner(System.in);

		MealService MealService = new MealService();

		System.out.println("Please enter");
		System.out.println("Name:");
		String name = in.nextLine();
		System.out.println("MealId:");
		String mealIdString = in.nextLine();
		int mealId = Integer.parseInt(mealIdString);

		MealServiceDTO dto = new MealServiceDTO();
		dto.name = name;
		dto.mealId = mealId;

		dto = MealService.post(dto);
		System.out.println(dto.toString());
	}

	static void update() {
		java.util.Scanner in = new java.util.Scanner(System.in);

		MealService MealService = new MealService();

		System.out.println("Please enter");
		System.out.println("MealId:");
		String MealIdString = in.nextLine();
		System.out.println("Name:");
		String name = in.nextLine();
		System.out.println("MealId:");
		String mealIdString = in.nextLine();
		int mealId = Integer.parseInt(mealIdString);

		MealServiceDTO dto = new MealServiceDTO();
		dto.name = name;
		dto.mealId = mealId;

		dto = MealService.put(dto);
		System.out.println(dto.toString());
	}
}
