/*
 * @author jag215 (Jack Gamache)
 */
package edu.pitt.TodoList.view;
import javax.swing.*;

import edu.pitt.TodoList.controller.Controller;

public class View {
	
	//All swing components needed are declared
	private JFrame frame;
	private JPanel panel;
	private JButton add;
	private JButton delete;
	private JList todo;
	private DefaultListModel listModel;
	private JTextField entry;
	private JLabel entryLabel;
	private JLabel todoLabel;
	
	
	private Controller controller;
	
	//Builds GUI interface
	public View()
	{
		frame = new JFrame("Todo List App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(500,  650);
		frame.setLayout(null);
		panel = new JPanel();
		
		add = new JButton("Add");
		add.setBounds(100, 100, 100, 100);
		
		delete = new JButton("Delete");
		delete.setBounds(200, 100, 100, 100);
		
		listModel = new DefaultListModel();
		todo = new JList(listModel);
		todo.setBounds(100, 300, 200, 300);
		
		entry = new JTextField();
		entry.setBounds(100, 50, 100, 20);
		
		entryLabel = new JLabel("Enter here: ");
		entryLabel.setBounds(100, 30, 100, 20);
		
		todoLabel = new JLabel("Todo List");
		todoLabel.setBounds(100, 280, 100, 20);
		
		
		frame.getContentPane().add(panel);
		frame.getContentPane().add(entryLabel);
		frame.getContentPane().add(entry);
		frame.getContentPane().add(add);
		frame.getContentPane().add(delete);
		frame.getContentPane().add(todoLabel);
		frame.getContentPane().add(todo);
		
		frame.setVisible(true);
		
	}
	
	//Getters for components, to be used in Controller package
	public JTextField getEntry()
	{
		return entry;
	}
	
	public DefaultListModel getListModel()
	{
		return listModel;
	}
	
	public JList getTodo()
	{
		return todo;
	}
	
	public JButton getAdd()
	{
		return add;
	}
	
	public JButton getDelete()
	{
		return delete;
	}

}
