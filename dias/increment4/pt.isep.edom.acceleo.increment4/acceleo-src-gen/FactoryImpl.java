
public class FactoryImpl implements Factory {

	public Agenda createAgenda() {
		return new Agenda();
	}

	public Administrator createAdministrator() {
		return new Administrator();
	}

	public ShareMeeting createShareMeeting() {
		return new ShareMeeting();
	}
	public MeetingCRUD createMeetingCRUD() {
		return new MeetingCRUD();
	}
	public ManageContacts createManageContacts() {
		return new ManageContacts();
	}
}
