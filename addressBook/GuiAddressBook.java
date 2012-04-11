/*
 * Created by JFormDesigner on Sun Apr 08 15:23:51 BRT 2012
 */

package addressBook;

import java.awt.Container;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import alpha.Buddy;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author Rachael Smith
 */
public class GuiAddressBook extends JFrame {
	private static final long serialVersionUID = -2119343468313478222L;
	private BuddyTableModel dataModel = new BuddyTableModel();


	public GuiAddressBook() {
		initComponents();
		this.buddyList.setModel(dataModel);
	}


	public void populateBuddyTable(List<Buddy> buddies) {
		dataModel.setBuddyList(buddies);
	}


	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		// Generated using JFormDesigner Evaluation license - Rachael Smith
		URL = new JComboBox();
		getBook = new JButton();
		scrollPane1 = new JScrollPane();
		buddyList = new JTable();
		addBuddy = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
				"16*(default, $lcgap), default",
				"9*(default, $lgap), default"));
		contentPane.add(URL, CC.xywh(3, 3, 21, 1));

		//---- getBook ----
		getBook.setText("Grab addressbook entries");
		contentPane.add(getBook, CC.xy(27, 3));

		//======== scrollPane1 ========
		{
			scrollPane1.setViewportView(buddyList);
		}
		contentPane.add(scrollPane1, CC.xywh(3, 7, 25, 11));

		//---- addBuddy ----
		addBuddy.setText("Add selected user as buddy");
		contentPane.add(addBuddy, CC.xy(27, 19));
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	// Generated using JFormDesigner Evaluation license - Rachael Smith
	private JComboBox URL;
	private JButton getBook;
	private JScrollPane scrollPane1;
	private JTable buddyList;
	private JButton addBuddy;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
