package Question;

import javax.script.ScriptException;

public class Custom extends QuestionFormat{
    private String done;
    private String doneFormula;
    private int[] vars;
    private String xRep;
    String[] questionParts;
    String[] formulaParts;
    private double [] answer;
    private String stringAnswer;
    private static Custom custom;

    public Custom(String Question, String Formula) throws ScriptException {
        answer = new double[1];
        Question = Question + " ";
        Formula = "1*" + Formula + "*1";
        xRep = Integer.toString((int) (Math.random() * 9 + 1));
        for(int i = 0; i < Question.length(); i++){
            questionParts = Question.split("/");
        }
        vars = new int[questionParts.length -1];
        for(int j = 0; j < questionParts.length - 1; j++){
            vars[j] = (int) (Math.random() * 25 + 1);
        }
        for(int m = 0; m < questionParts.length - 1; m++){
        	if(m == 0)
        		done = questionParts[m] + vars[m];
        	else
                done = done + questionParts[m] + vars[m];

        }
        done = done + questionParts[questionParts.length - 1] + " solve if x is " + (xRep) + "?";

        for(int i = 0; i < Formula.length(); i++){
            formulaParts = Formula.split("/");
        }



        for(int m = 0; m < formulaParts.length - 1; m++){
        	if(m!= 0) {
        		doneFormula = doneFormula + formulaParts[m] + vars[m];
        	}
        	else
                doneFormula = formulaParts[m] + vars[m];

        }
        doneFormula = doneFormula + formulaParts[formulaParts.length - 1];
        doneFormula = doneFormula.replace("*x+", "*" + xRep + "+");
        doneFormula = doneFormula.replace("*x-", "*" + xRep + "-");
        doneFormula = doneFormula.replace("*x/", "*" + xRep + "/");
        doneFormula = doneFormula.replace("*x*", "*" + xRep + "*");
        doneFormula = doneFormula.replace("/x+", "/" + xRep + "+");
        doneFormula = doneFormula.replace("/x-", "/" + xRep + "-");
        doneFormula = doneFormula.replace("/x*", "/" + xRep + "*");
        doneFormula = doneFormula.replace("/x/", "/" + xRep + "/");
        doneFormula = doneFormula.replace("-x+", "-" + xRep + "+");
        doneFormula = doneFormula.replace("-x/", "-" + xRep + "/");
        doneFormula = doneFormula.replace("-x*", "-" + xRep + "*");
        doneFormula = doneFormula.replace("-x-", "-" + xRep + "-");
        doneFormula = doneFormula.replace("+x-", "+" + xRep + "-");
        doneFormula = doneFormula.replace("+x/", "+" + xRep + "/");
        doneFormula = doneFormula.replace("+x*", "+" + xRep + "*");
        doneFormula = doneFormula.replace("+x+", "+" + xRep + "+");
        System.out.println(doneFormula);
        answer[0] = Math.round(Solve.solve(doneFormula) *100)/100;
        for(int i = 0; i < vars.length; i++){
            System.out.println(vars[i]);
        }
    }

    
    public String getQuestion() {
        // TODO Auto-generated method stub
        return done;
    }

    public double [] getAnswer() {
        // TODO Auto-generated method stub
        return answer;
    }

}