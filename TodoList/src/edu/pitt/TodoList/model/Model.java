/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList.model;

import java.sql.*;
import java.util.Calendar;
import java.util.Vector;

public class Model {
	
	private Vector<ListItem> todoList;
	private Connection con;
	private Statement statement;
	private java.sql.Time timestamp;
	
	public Model()
	{
		todoList = new Vector<ListItem>();
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://sis-teach-01.sis.pitt.edu:3306/jag215is1017","jag215is1017","jag215@pitt.edu");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * @param item		The user-entered item to be added to the vector of items
	 */
	public void addListItem(String item)
	{
		todoList.addElement(new ListItem(item));
		try {
			statement = con.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		timestamp = new java.sql.Time(Calendar.getInstance().getTime().getTime());
		String query = "INSERT INTO jag215is1017.todoList (description, timestamp) VALUES('" + item + "','" + timestamp + "')";
		try {
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	/*
	 * @param a			The index of the element being removed from the vector
	 */
	public void deleteListItem(int a)
	{
		todoList.removeElement(a);
		
		String query = "DELETE FROM jag215is1017.todoList WHERE description='" + todoList.get(a).getDescription() + "'";
		try {
			int rs = statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//@return			The vector of ListItems
	public Vector<ListItem> getList()
	{
		return todoList;
	}

}
