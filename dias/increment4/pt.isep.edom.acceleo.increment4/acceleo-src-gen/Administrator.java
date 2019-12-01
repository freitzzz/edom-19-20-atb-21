
class Administrator implements Actor {

	public void execute() {

		boolean exit=false;

		java.util.Scanner in = new java.util.Scanner(System.in);

		while (!exit) {

			System.out.println("Actor Administrator");


			System.out.println("My use cases are:");

			System.out.println("1-ShareMeeting");
			System.out.println("2-ManageContacts");

			System.out.println("0-Exit");

			System.out.println(">>Please enter you option");

			// Read an integer from the input
			int num = in.nextInt();

			switch (num) {
				case 1:
					{
						ShareMeeting o=FFactory.getInstance().createShareMeeting();
						o.execute();
					}
					break;
				case 2:
					{
						ManageContacts o=FFactory.getInstance().createManageContacts();
						o.execute();
					}
					break;
				case 0:
					exit=true;
			}
		}
	}
}

