
class ManageContacts implements UseCase {
	Entity entity;
		
	public ManageContacts() {
		entity = new Entity();
	}
	
	public void execute() {

		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("UseCase ManageContacts");

					noCRUDUseCase x = new noCRUDUseCase();

			System.out.println("0-Exit");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
				case 0:
					exit=true;
			}
		}
	}
}

