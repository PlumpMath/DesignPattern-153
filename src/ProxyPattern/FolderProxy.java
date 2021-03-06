package ProxyPattern;

public class FolderProxy implements IFolder {

	Folder folder;
	User user;

	public FolderProxy(User user) {
		this.user = user;
	}

	public void performOperations() {

		if (user.getUserName().equalsIgnoreCase("toufiq")
				&& user.getPassword().equalsIgnoreCase("toufiq")) {
			folder = new Folder();
			folder.performOperations();
		} else {
			System.out.println("You don't have access to this folder");
		}
	}

	@Override
	public void downloadFile() {
		// TODO Auto-generated method stub
		folder = new Folder();
		folder.downloadFile();
	}
}