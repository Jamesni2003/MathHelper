import javax.swing.*;

import Question.TypeOfProblem;

import java.awt.*;
import java.awt.event.*;

public class math {
	private JFrame fMenu;
	private JFrame fQuestion;
	private TypeOfProblem typeofproblem = TypeOfProblem.get_Instance();
	private Question question;
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
				question = new Question();
			}
		});
		;
		btnBack.setBounds(565, 465, 155, 75);
		pQuestion.add(btnBack);

		JLabel lblanswer = new JLabel("");
		lblanswer.setVerticalAlignment(SwingConstants.TOP);
		lblanswer.setBounds(12, 139, 678, 267);
		pQuestion.add(lblanswer);
		JButton btnAnswer = new JButton("Show Answer");

		btnAnswer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblanswer.setText(question.getAnswer());
			}
		});
		btnAnswer.setBounds(289, 192, 132, 60);
		pQuestion.add(btnAnswer);

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
				typeofproblem.setTypeOfProblem(TypeOfProblem.TypeProblem.IIIDShapeV);
				question = new Question();
				lblQuestion.setText(question.getQuestion());
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

