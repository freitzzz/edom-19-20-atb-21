
class MeetingCRUD implements UseCase {
	Entity entity;
		
	public MeetingCRUD() {
		entity = new Entity();
	}
	
	public void execute() {

		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("UseCase MeetingCRUD");

				System.out.println("1-Read");
				System.out.println("2-Create");
				System.out.println("3-Update");
				System.out.println("4-Delete");

			System.out.println("0-Exit");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
				case 1: {
					entity.readAll();
				}
				break;
				case 2: {
					entity.create();
				}
				break;
				case 3: {
					entity.update();
				}
				break;
				case 4: {
					entity.delete();
				}
				break;
				case 0:
					exit=true;
			}
		}
	}
}

