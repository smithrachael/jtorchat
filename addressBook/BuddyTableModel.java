package net.tsu.TCPort.AddressBook;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import net.tsu.TCPort.Buddy;

public class BuddyTableModel extends AbstractTableModel {
	private static final long serialVersionUID = 6840829070420240924L;
	private static final int NUM_ROWS = 10;
	private static final int NUM_COLUMNS = 4;

	private List<Buddy> buddyList;



	public int getColumnCount() {
		return NUM_COLUMNS; 
	}

	public int getRowCount() {
		return NUM_ROWS;
	}

	public String getValueAt(int row, int col) {
		//return String.valueOf(row * col); // FIXME DEBUG only


		//*
		String cellValue = "";

		if (buddyList.size() >= row) {

			Buddy buddy = buddyList.get(row);
			if (col == 0) {
				cellValue = buddy.getName();
			} else if (col == 1) {
				cellValue = buddy.getProfile_name();
			} else if (col == 2) {
				cellValue = String.valueOf(buddy.getConnectTime());
			} else if (col == 3) {
				cellValue = buddy.getAddress();
			}

		}
		return cellValue; 
		// */
	}

	public void setBuddyList(List<Buddy> buddyList) {
		this.buddyList = buddyList;
	}
}
