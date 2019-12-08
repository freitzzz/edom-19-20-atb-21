package presentation;

public class GorgeousMealApp {

	public static void main(String[] args) {
		execute();
	}

	/**
	 * Displays main menu of App
	 */
	public static void execute() {
		
		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("Gorgeous Food App");

			System.out.println("0-Exit");
			
			System.out.println("1-Staff Menu");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
				case 0:
					exit=true;
					break;
				case 1:
					StaffMenu.execute();
					break;
			}
		}		
	}
}
