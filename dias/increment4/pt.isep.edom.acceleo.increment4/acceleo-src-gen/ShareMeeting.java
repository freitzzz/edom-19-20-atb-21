
class ShareMeeting implements UseCase {
	Entity entity;
		
	public ShareMeeting() {
		entity = new Entity();
	}
	
	public void execute() {

		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("UseCase ShareMeeting");

					System.out.println("My included use cases are:");
						System.out.println("1-MeetingCRUD");

			System.out.println("0-Exit");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
						case 1:
						{
							MeetingCRUD o=FFactory.getInstance().createMeetingCRUD();
							o.execute();
						}
						break;
				case 0:
					exit=true;
			}
		}
	}
}

