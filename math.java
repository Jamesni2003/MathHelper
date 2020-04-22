import javax.swing.*;

import IIIDShapes.Question;

import java.awt.*;
import java.awt.event.*;

public class math {
	private Question question;
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
		
		JButton btnNewButton = new JButton("Other Kind Problems");
		btnNewButton.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent arg0) {
				fMenu.setVisible(true);
				fQuestion.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 465, 155, 75);
		pQuestion.setLayout(null);
		pQuestion.add(btnNewButton);
		
		JButton btnBack = new JButton("More Problems");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});;
		btnBack.setBounds(565, 465, 155, 75);
		pQuestion.add(btnBack);
		
		JButton btnAnswer = new JButton("Show Answer");
		btnAnswer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		btnAnswer.setBounds(289, 192, 132, 60);
		pQuestion.add(btnAnswer);
		
		JLabel lblanswer = new JLabel("");
		lblanswer.setVerticalAlignment(SwingConstants.TOP);
		lblanswer.setBounds(12, 139, 678, 267);
		pQuestion.add(lblanswer);
	
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

		JLabel lblQuestion = new JLabel("");
		lblQuestion.setBounds(12, 13, 678, 87);
		pQuestion.add(lblQuestion);
		
		JMenuItem miVolume = new JMenuItem("Volume");
		miVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				question = new Question("Volume");
				lblQuestion.setText(question.getShape().Question());
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
	}
}

