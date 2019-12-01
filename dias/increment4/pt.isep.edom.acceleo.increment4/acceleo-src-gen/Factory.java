
public interface Factory {

	public Agenda createAgenda();
	public Administrator createAdministrator();

	public ShareMeeting createShareMeeting();
	public MeetingCRUD createMeetingCRUD();
	public ManageContacts createManageContacts();
}
