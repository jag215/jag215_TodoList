/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList;

import edu.pitt.TodoList.controller.Controller;
import edu.pitt.TodoList.model.Model;
import edu.pitt.TodoList.view.View;

public class MVCMain {

	//Main method to initialize the necessary objects
	public static void main(String[] args) {
		View frame = new View();
		Model model = new Model();
		Controller controller = new Controller(frame, model);
		

	}

}
