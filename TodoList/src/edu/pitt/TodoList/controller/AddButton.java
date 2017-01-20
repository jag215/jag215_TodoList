/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList.controller;

import java.awt.event.*;

public class AddButton implements ActionListener{
	
	private Controller controller;
	
	public AddButton(Controller controller)
	{
		this.controller = controller;
	}
	
	//Button will use String item, taken from the text field, and add it to the ListModel
	public void actionPerformed(ActionEvent e)
	{
		String item = controller.getView().getEntry().getText();
		controller.getView().getListModel().addElement(item);
		controller.getModel().addListItem(item);
	}

}
