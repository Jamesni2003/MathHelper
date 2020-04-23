import javax.script.ScriptException;
import javax.swing.*;

import IIIDShapes.*;
import Question.TypeOfProblem;

import java.awt.*;
import java.awt.event.*;

public class math {
	private Question question;
	private TypeOfProblem typeofproblem = TypeOfProblem.get_Instance();
	private JFrame fMenu;
	private JFrame fQuestion;
	private JFrame fCustom;

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
		fCustom = new JFrame();
		fCustom.setTitle("Custom Question");
		fCustom.setBounds(100, 100, 750, 600);
		fCustom.setMinimumSize(new Dimension(750, 600));
		fCustom.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fCustom.setVisible(false);
		fCustom.pack();
		fCustom.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pCustom = new JPanel();
		fCustom.getContentPane().add(pCustom, BorderLayout.CENTER);

		JButton btnBackCustom = new JButton("Back");
		btnBackCustom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fMenu.setVisible(true);
				fQuestion.setVisible(false);
				fCustom.setVisible(false);
			}
		});
		btnBackCustom.setBounds(12, 465, 155, 75);
		pCustom.setLayout(null);
		pCustom.add(btnBackCustom);


		JLabel lblCustomDirections = new JLabel("Write out your Solving x Question and where you want variables use / and dont use y= in you equation");
		lblCustomDirections.setBounds(20, 15, 750, 59);
		lblCustomDirections.setFont(new Font("Arial", Font.PLAIN, 13));
		pCustom.add(lblCustomDirections);

		JTextField customQuestionInput = new JTextField();
		customQuestionInput.setBounds(350, 70, 155, 75);
		pCustom.add(customQuestionInput);

		JLabel lblCustomDirectionsProblem = new JLabel("<html>Write out the formula to solving you question and use / where you would put a variable,<br> and make sure to have the same number of / in your question as you formula.<br> Also pu 1* at the begining of the equation and *1 at the end</html>");
		lblCustomDirectionsProblem.setBounds(20, 150, 750, 59);
		lblCustomDirectionsProblem.setFont(new Font("Arial", Font.PLAIN, 13));
		pCustom.add(lblCustomDirectionsProblem);

		JTextField customQuestionInputProblem = new JTextField();
		customQuestionInputProblem.setBounds(350, 220, 155, 75);
		pCustom.add(customQuestionInputProblem);

		fQuestion = new JFrame();
		fQuestion.setTitle("Questions");
		fQuestion.setBounds(100, 100, 750, 600);
		fQuestion.setMinimumSize(new Dimension(750, 600));
		fQuestion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fQuestion.setVisible(false);
		fQuestion.pack();
		fQuestion.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel pQuestion = new JPanel();
		fQuestion.getContentPane().add(pQuestion, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("Other Kind Problems");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fMenu.setVisible(true);
				fQuestion.setVisible(false);
			}
		});
		btnNewButton.setBounds(12, 465, 155, 75);
		pQuestion.setLayout(null);
		pQuestion.add(btnNewButton);

		JLabel lblanswerCorr = new JLabel("");
		lblanswerCorr.setVerticalAlignment(SwingConstants.TOP);
		lblanswerCorr.setBounds(12, 139, 678, 267);
		pQuestion.add(lblanswerCorr);

		JTextField answerBox = new JTextField();
		answerBox.setBounds(150, 150, 155, 75);
		pQuestion.add(answerBox);

		JButton btnAnswer = new JButton("Show Answer");
		btnAnswer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				if (question.questions.getAnswer().equals(answerBox.getText())) {
					lblanswerCorr.setText("You got the answer correct");
				} else {
					lblanswerCorr.setText("You got the answer incorrect");
					question.questions.getAnswer().equals(answerBox.getText());
					System.out.println(answerBox.getText());
					System.out.println(question.questions.getAnswer());
				}
			}
		});
		btnAnswer.setBounds(289, 280, 132, 60);
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

		JButton customQuestion = new JButton("Custon Question");
		customQuestion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				fCustom.setVisible(true);
				fMenu.setVisible(false);
				fQuestion.setVisible(false);
			}
		});
		customQuestion.setBounds(200, 200, 132, 60);
		pMain.add(customQuestion);

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
				typeofproblem.setTypeOfProblem(TypeOfProblem.TypeProblem.IIIDShapeSA);
				question = new Question();
				lblQuestion.setText(question.getQuestion());
				fMenu.setVisible(false);
				fQuestion.setVisible(true);
			}
		});
		mn3dshape.add(miSurfaceArea);
		
		JButton btnBack = new JButton("More Problems");
		btnBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				question = new Question();
				fMenu.setVisible(false);
				fQuestion.setVisible(true);
				lblQuestion.setText(question.getQuestion());
			}
		});;
		btnBack.setBounds(565, 465, 155, 75);
		pQuestion.add(btnBack);

		JButton btnDone = new JButton("Done");
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				typeofproblem.setTypeOfProblem(TypeOfProblem.TypeProblem.Custom);
				try {
					question = new Question(customQuestionInput.getText(), customQuestionInputProblem.getText());
				} catch (ScriptException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblQuestion.setText(question.getQuestion());
				fMenu.setVisible(false);
				fQuestion.setVisible(true);
				fCustom.setVisible(false);
			}
		});
		;
		btnDone.setBounds(565, 465, 155, 75);
		pCustom.add(btnDone);

	}
}
