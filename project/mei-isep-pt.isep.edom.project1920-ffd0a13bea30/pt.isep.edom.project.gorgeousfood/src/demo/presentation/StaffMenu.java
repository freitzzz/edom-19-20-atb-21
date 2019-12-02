package demo.presentation;

public class StaffMenu {
	
	/**
	 * Displays menu for actor Staff 
	 */
	public static void execute() {
		
		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("Staff Menu");

			System.out.println("0-Exit");
			
			System.out.println("1-Manage MealItem");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
				case 0:
					exit=true;
					break;
				case 1:
					ManageMealItem.execute();
					break;
			}
		}		
	}

}
