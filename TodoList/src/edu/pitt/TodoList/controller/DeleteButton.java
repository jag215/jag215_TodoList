/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList.controller;

import java.awt.event.*;

public class DeleteButton implements ActionListener{
	
	private Controller controller;
	
	public DeleteButton(Controller controller)
	{
		this.controller = controller;
	}
	
	//Button will use int a, the index of the selected element in the JList todo, and remove it from the list
	public void actionPerformed (ActionEvent e)
	{
		int a = controller.getView().getTodo().getSelectedIndex();
		controller.getView().getListModel().removeElementAt(a);
		controller.getModel().deleteListItem(a);
	}

}
