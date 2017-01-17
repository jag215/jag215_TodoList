package edu.pitt.TodoList.controller;

import edu.pitt.TodoList.model.*;
import edu.pitt.TodoList.view.*;

public class Controller {
	
	private View view;
	private Model model;
	private AddButton addButton;
	private DeleteButton deleteButton;
	
	public Controller(View view, Model model)
	{
		this.view = view;
		this.model = model;
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
