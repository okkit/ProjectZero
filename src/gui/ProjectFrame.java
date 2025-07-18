package gui;

import java.awt.HeadlessException;

import javax.swing.JFrame;

/** 
 * The main class of the project
 */
public class ProjectFrame extends JFrame implements GuiConstants{

	public ProjectFrame() throws HeadlessException {
		super(FRAME_TITLE);
		// TODO Numbers -> constants
		setBounds(FRAME_X, FRAME_Y, 300, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		init();

		setVisible(true);
	}

	/**
	 * Initialize the tab-bar and its corresponding panels
	 */
	private void init() {
		
		TabPane tabPane = new TabPane();
		add(tabPane);
		
		PanelOne one = new PanelOne();
		tabPane.addTab(TAB_ONE, one);
	}

	public static void main(String[] args) {

		new ProjectFrame();

	}

}
