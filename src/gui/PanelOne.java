package gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The first panel, which is corresponded to tab one
 */
public class PanelOne extends JPanel implements ActionListener, GuiConstants {

	ATextField textField;
	JLabel messageLabel;

	/**
	 * Constructs an instance of the class.<br>
	 * Calls the method init() to initialize the nested components.
	 */
	public PanelOne() {
		super();
		setBackground(Color.ORANGE);
		setLayout(new GridLayout(0, 1));

		init();
	}

	/**
	 * Initializes all components, whose parent this panel is.
	 */
	private void init() {

		JLabel label = new JLabel(LABEL_TITLE);
		add(label);

		textField = new ATextField();
		add(textField);

		messageLabel = new JLabel();
		add(messageLabel);

		JButton button = new JButton(BUTTON_CLICK_TITLE);
		button.setActionCommand(COMMAND_CLICK);
		add(button);
		button.addActionListener(this);

		// TODO Strings -> constants
		JButton resetButton = new JButton("reset");
		resetButton.setActionCommand("Command2");
		resetButton.addActionListener(this);
		add(resetButton);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals(COMMAND_CLICK)) {
			messageLabel.setText(textField.getText());
		} else if (e.getActionCommand().equals("Command2")) {
			messageLabel.setText(null);
			textField.setText(null);
		}

	}

}
