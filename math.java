import javax.script.ScriptException;
import javax.swing.*;

import Question.TypeOfProblem;

import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

public class math {
	private Question question;
	private TypeOfProblem typeofproblem = TypeOfProblem.get_Instance();
	private JFrame fMathHelper;

	private JPanel pMenu,
				   pQuestion,
				   pCustom;

	private JButton btncustomMenu,
					btnBackCustom,
					btnOtherP,
					btnAnswer,
					btnMoreP,
					btnDone;

	private JLabel lblTitle,
				   lblQuestion,
				   lblanswerCorr,
				   lblCustomDirections,
				   lblCustomDirectionsProblem
				   ;
				   
	private JMenuBar menuBar; 
	private JTextField tfAnswer,
					   tfcustomQuestion,
					   tfcustomQuestionProblem;

	




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					math window = new math();
					window.fMathHelper.setVisible(true);
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
		//frame
		fMathHelper = new JFrame();
		fMathHelper.setVisible(true);
		fMathHelper.setTitle("Math Helper");
		fMathHelper.setBounds(100, 100, 750, 600);
		fMathHelper.setMinimumSize(new Dimension(750, 600));
		fMathHelper.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fMathHelper.pack();

		pMenu = new JPanel();
		pMenu.setLayout(null);

		pQuestion = new JPanel();
		pQuestion.setLayout(null);

		pCustom = new JPanel();
		pCustom.setLayout(null);

		fMathHelper.setContentPane(pMenu);

		
		btnDone = new JButton("Done");
		//buttons
		btncustomMenu = new JButton("Custon Question");
		btnOtherP = new JButton("Other Kind Problems");
		btnMoreP = new JButton("More Problems");
		btnAnswer = new JButton("Show Answer");
		btnBackCustom = new JButton("Back");
		
		//lable
		lblTitle = new JLabel("Math Helper");
		lblanswerCorr = new JLabel("");
		lblQuestion = new JLabel("");
		lblCustomDirectionsProblem = new JLabel("<html>Write out the formula to solving you question and use / where you would put a variable,<br> and make sure to have the same number of / in your question as you formula.<br> Also pu 1* at the begining of the equation and *1 at the end</html>");
		lblCustomDirections = new JLabel("Write out your Solving x Question and where you want variables use / and dont use y= in you equation");

		
		//textfield
		tfAnswer = new JTextField();
		tfcustomQuestion = new JTextField();
		tfcustomQuestionProblem = new JTextField();

		//menu bar
		menuBar = new JMenuBar();
		
		//add to panal
		pMenu.add(menuBar);
		pMenu.add(lblTitle);
		pMenu.add(btncustomMenu);

		pQuestion.add(btnMoreP);
		pQuestion.add(tfAnswer);
		pQuestion.add(btnAnswer);
		pQuestion.add(btnOtherP);
		pQuestion.add(lblQuestion);
		pQuestion.add(lblanswerCorr);

		pCustom.add(btnDone);
		pCustom.add(tfcustomQuestionProblem);
		pCustom.add(lblCustomDirections);
		pCustom.add(btnBackCustom);
		pCustom.add(tfcustomQuestion);
		pCustom.add(lblCustomDirectionsProblem);

		//font
		lblTitle.setFont(new Font("Arial", Font.PLAIN, 50));
		lblCustomDirections.setFont(new Font("Arial", Font.PLAIN, 13));
		lblCustomDirectionsProblem.setFont(new Font("Arial", Font.PLAIN, 13));

		//layout
		btncustomMenu.setBounds(200, 200, 132, 60);
		btnBackCustom.setBounds(12, 465, 155, 75);
		btnAnswer.setBounds(289, 280, 132, 60);
		btnOtherP.setBounds(12, 465, 155, 75);
		btnMoreP.setBounds(565, 465, 155, 75);
		btnDone.setBounds(565, 465, 155, 75);

		
		lblQuestion.setBounds(12, 13, 678, 87);
		lblanswerCorr.setBounds(12, 139, 678, 267);
		lblanswerCorr.setVerticalAlignment(SwingConstants.TOP);
		lblTitle.setBounds(191, 5, 274, 59);

		lblCustomDirections.setBounds(20, 15, 750, 59);
		lblCustomDirectionsProblem.setBounds(20, 150, 750, 59);


		menuBar.setBounds(200, 200, 100, 100);

		tfAnswer.setBounds(150, 150, 155, 75);
		tfcustomQuestion.setBounds(350, 70, 155, 75);
		tfcustomQuestionProblem.setBounds(350, 220, 155, 75);

		
		//menu
		JMenu mntypeproblem = new JMenu("Problems");
		menuBar.add(mntypeproblem);
		
		//3d shape
		JMenu mn3dshape = new JMenu("3D shapes");
		mntypeproblem.add(mn3dshape);
		JMenuItem miVolume = new JMenuItem("Volume");
		mn3dshape.add(miVolume);
		JMenuItem miSurfaceArea = new JMenuItem("Surface Area");
		mn3dshape.add(miSurfaceArea);

		//function
		btnOtherP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Menu();
			}
		});

		

		//type answer
		tfAnswer.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent ke) {
				int key = ke.getKeyCode();
				char Char = ke.getKeyChar();
			   if ((Char >= '0' && Char <= '9') || key == 127 || key == 8 || key == 46 || Char == ',' || Char == ' ')
				tfAnswer.setEditable(true);
			   else
				tfAnswer.setEditable(false);
			}
		});

		btnAnswer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String[] basicNumber = tfAnswer.getText().replaceAll(" ", "").split(",");
				double useranswer[] = new double[basicNumber.length];
				double answer[] = question.getAnswer();
				for (int i = 0; i<basicNumber.length; i++) useranswer[i] = Double.valueOf(basicNumber[i]);
				Arrays.sort(useranswer);
				Arrays.sort(answer);

				if(Arrays.equals(answer, useranswer))
					lblanswerCorr.setText("You got the answer correct");
				else
					lblanswerCorr.setText("You got the answer incorrect");
			}
		});
		
		//menus
		btnBackCustom.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Menu();
			}
		});
		
		btncustomMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				CustomMenu();
			}
		});

		//questions
		miVolume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				typeofproblem.setTypeOfProblem(TypeOfProblem.TypeProblem.IIIDShapeV);
				newQuestion();
			}
		});
		
		miSurfaceArea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				typeofproblem.setTypeOfProblem(TypeOfProblem.TypeProblem.IIIDShapeSA);
				newQuestion();
			}
		});

		btnMoreP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				newQuestion();
			}
		});
		
		btnDone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				typeofproblem.setTypeOfProblem(TypeOfProblem.TypeProblem.Custom);
				
				newQuestion();
			}
		});
	}
	public void Menu(){
		fMathHelper.setContentPane(pMenu);
		fMathHelper.revalidate();
	}
	public void CustomMenu(){
		fMathHelper.setContentPane(pCustom);
		fMathHelper.revalidate();
	}
	public void Question(){
		fMathHelper.setContentPane(pQuestion);
		lblQuestion.setText(question.getQuestion());
		fMathHelper.revalidate();
	}
	public void newQuestion(){
		if(typeofproblem.getTypeProblem() == TypeOfProblem.TypeProblem.Custom){
			try {
				question = new Question(tfcustomQuestion.getText(), tfcustomQuestionProblem.getText());
			} catch (ScriptException e1) {
				//TODO: here can set a lable say this is a question
			}
		}else
			question = new Question();
		lblQuestion.setText(question.getQuestion());
		Question();
	}
}
