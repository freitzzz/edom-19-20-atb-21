
class Agenda {
	public void execute() {

		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("UseCaseModel Agenda");

			System.out.println("My actors are:");

			System.out.println("1-Administrator");
			System.out.println("0-Exit");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
				case 1:
					{
						Administrator o=FFactory.getInstance().createAdministrator();
						o.execute();
					}
					break;
				case 0:
					exit=true;
			}
		}
	}
}
