import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class math {

	private JFrame fMenu; 
	private JFrame fQuestion;

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
		fMenu.setTitle("Math Helper");
		fMenu.setBounds(100, 100, 750, 600);
		fMenu.setMinimumSize(new Dimension(750, 600));
		fMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fMenu.setVisible(true);
		fMenu.pack();
		
		JPanel pMain = new JPanel();
		fMenu.getContentPane().add(pMain, BorderLayout.CENTER);
		pMain.setLayout(null);
		
		JLabel lblTitle = new JLabel("Math Helper");
		lblTitle.setBounds(191, 5, 274, 59);
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 50));
		pMain.add(lblTitle);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(200, 200, 100, 100);
		pMain.add(menuBar);
		
		JMenu mntypeproblem = new JMenu("Problems");
		menuBar.add(mntypeproblem);
		
		JMenu mn3dshape = new JMenu("3D shapes");
		mntypeproblem.add(mn3dshape);
		
		JMenuItem miVolume = new JMenuItem("Volume");
		miVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fMenu.setVisible(false);
				fQuestion.setVisible(true);
			}
		});
		mn3dshape.add(miVolume);
		
		JMenuItem miSurfaceArea = new JMenuItem("Surface Area");
		miSurfaceArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				fMenu.setVisible(false);
				fQuestion.setVisible(true);
			}
		});
		mn3dshape.add(miSurfaceArea);
		
		
		fQuestion = new JFrame();
		fQuestion.setTitle("asd");
		fQuestion.setBounds(100, 100, 750, 600);
		fQuestion.setMinimumSize(new Dimension(750, 600));
		fQuestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fQuestion.setVisible(false);
		fQuestion.pack();
		fQuestion.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel pQuestion = new JPanel();
		fQuestion.getContentPane().add(pQuestion, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(70, 465, 97, 25);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fMenu.setVisible(true);
				fQuestion.setVisible(false);
			}
		});
		pQuestion.setLayout(null);
		pQuestion.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(535, 465, 97, 25);
		pQuestion.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(182, 48, 56, 16);
		pQuestion.add(lblNewLabel);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(265, 318, 97, 25);
		pQuestion.add(btnNewButton_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(182, 162, 56, 16);
		pQuestion.add(lblNewLabel_1);
	}
}

