/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList.model;

import java.util.Vector;

public class Model {
	
	private Vector<ListItem> todoList;
	
	public Model()
	{
		todoList = new Vector<ListItem>();
	}
	
	/*
	 * @param item		The user-entered item to be added to the vector of items
	 */
	public void addListItem(String item)
	{
		todoList.addElement(new ListItem(item));
	}
	
	/*
	 * @param a			The index of the element being removed from the vector
	 */
	public void deleteListItem(int a)
	{
		todoList.removeElement(a);
	}
	
	//@return			The vector of ListItems
	public Vector<ListItem> getList()
	{
		return todoList;
	}

}
