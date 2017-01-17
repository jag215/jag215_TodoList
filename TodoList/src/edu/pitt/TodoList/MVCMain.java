package edu.pitt.TodoList;

import edu.pitt.TodoList.controller.Controller;
import edu.pitt.TodoList.model.Model;
import edu.pitt.TodoList.view.View;

public class MVCMain {

	public static void main(String[] args) {
		View frame = new View();
		Model model = new Model();
		Controller controller = new Controller(frame, model);
		

	}

}
