import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JDesktopPane;
import java.awt.Insets;
import java.awt.BorderLayout;
import javax.swing.SpringLayout;
import java.awt.GridLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JLayeredPane;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class math {

	private JFrame fMenu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					math window = new math();
					window.fMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public math() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		fMenu = new JFrame();
		fMenu.setTitle("name");
		fMenu.setBounds(100, 100, 750, 600);
		fMenu.setMinimumSize(new Dimension(750, 600));
		fMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fMenu.setVisible(true);
		fMenu.pack();
		
		JPanel panel = new JPanel();
		fMenu.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblTitle = new JLabel("New label");
		lblTitle.setBounds(402, 9, 56, 16);
		panel.add(lblTitle);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.RED);
		menuBar.setBounds(184, 251, 119, 26);
		panel.add(menuBar);
		
		JMenu menuConcept = new JMenu("Concept");
		menuBar.add(menuConcept);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("1");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				lblTitle.setText("asd");
			}
		});
		mntmNewMenuItem.setBackground(Color.RED);
		menuConcept.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("2");
		menuConcept.add(mntmNewMenuItem_1);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblTitle.setText("asd");
			}
		});
		btnNewButton.setBounds(375, 262, 97, 25);
		panel.add(btnNewButton);
	}
}
