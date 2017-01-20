/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList.controller;

import edu.pitt.TodoList.model.*;
import edu.pitt.TodoList.view.*;

public class Controller {
	
	private View view;
	private Model model;
	private AddButton addButton;
	private DeleteButton deleteButton;
	
	//intitializes objects passed through as parameters, connects button controllers to button actionListeners
	public Controller(View view, Model model)
	{
		this.view = view;
		this.model = model;
		this.addButton = new AddButton(this);
		this.view.getAdd().addActionListener(addButton);
		this.deleteButton = new DeleteButton(this);
		this.view.getDelete().addActionListener(deleteButton);
	}
	
	public View getView()
	{
		return view;
	}
	
	public Model getModel()
	{
		return model;
	}
	
	public AddButton getAddButton()
	{
		return addButton;
	}
	
	public DeleteButton getDeleteButton()
	{
		return deleteButton;
	}

}
