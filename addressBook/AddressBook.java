package net.tsu.TCPort.AddressBook;

import net.tsu.TCPort.APIManager;
import net.tsu.TCPort.Buddy;
import net.tsu.TCPort.listeners.CommandListener;

public class AddressBook {


	private static Listener listener = null;

	/* OPERATIONS */
	// get address books' URL list
	public static final String GET_ADDRESS_BOOK_LIST = "getaddressbooklist";
	// get buddy list from address book
	public static final String GET_BUDDY_LIST = "getbuddylist";
	// add buddy to private list
	public static final String ADD_BUDDY_TO_LIST = "addbuddytolist";


	public static void init() {
		if (listener == null) {
			listener = new Listener();
		}

		// Register operations
		String[] commandIdentifierArray = { GET_ADDRESS_BOOK_LIST, GET_BUDDY_LIST, ADD_BUDDY_TO_LIST };
		for (String commandIdentifier : commandIdentifierArray) {
			APIManager.cmdListeners.put(commandIdentifier, listener);
		}
	}



	private static class Listener implements CommandListener {

		@Override
		public void onCommand(Buddy buddy, String commandString) {

			if (commandString != null && !commandString.trim().equals("")) {

				String commandArguments = null;

				if (commandString.startsWith(GET_ADDRESS_BOOK_LIST)) {

					commandArguments = commandString.substring(GET_ADDRESS_BOOK_LIST.length()).trim();
					getAddressBookList(commandArguments);

				} else if (commandString.startsWith(GET_BUDDY_LIST)) {

					commandArguments = commandString.substring(GET_BUDDY_LIST.length()).trim();
					getBuddyListByAddressBook(commandArguments);

				} else if (commandString.startsWith(ADD_BUDDY_TO_LIST)) {

					commandArguments = commandString.substring(ADD_BUDDY_TO_LIST.length()).trim();
					addBuddyToPrivateList(commandArguments);

				} 
			}
		}
	}


	public static void getAddressBookList(String commandArguments) {
		// TODO Auto-generated method stub
	}


	public static void addBuddyToPrivateList(String commandArguments) {
		// TODO Auto-generated method stub
	}


	public static void getBuddyListByAddressBook(String commandArguments) {
		// TODO Auto-generated method stub
	}
}
