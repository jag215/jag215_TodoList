/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList.model;

public class ListItem {
	
	private String description;
	
	public ListItem(String description)
	{
		this.description = description;
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public void setDescription(String description)
	{
		this.description = description;
	}

}
