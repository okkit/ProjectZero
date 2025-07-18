package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

/**
 * Superclass for all TextFields in this project
 */
public class ATextField extends JTextField {

	/**
	 * Constructs a TextF´field and set appearance for it
	 */
	public ATextField() {
		super();
		
		setForeground(Color.BLACK);
		setFont(new Font("Arial", Font.PLAIN, 12));
	}
	
}


