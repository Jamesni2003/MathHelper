import javax.script.ScriptException;

import Question.*;

public class Question {
    private TypeOfProblem type = TypeOfProblem.get_Instance();
    public QuestionFormat questions;

    public Question(){
        switch(type.getTypeProblem()){
            case IIIDShapeSA:
                questions = new IIIDShapeQuestion("SA");
            break;
            case IIIDShapeV:
                questions = new IIIDShapeQuestion("V");
            break;
            case Linear:
                questions = new FuctionQuestion("Linear");
            break;
            case Square:
                questions = new FuctionQuestion("Square");
            break;
            case Absolute:
                questions = new FuctionQuestion("Absolute");
            break;
            case Expo:
                questions = new FuctionQuestion("EXPO");
            break;
            case Log:
                questions = new FuctionQuestion("LOG");
            break;
            default:
            break;
        }
    }
    public Question(String customQuestion, String customFormula) throws ScriptException {
        questions = new Custom(customQuestion, customFormula);
    }
    public String getQuestion(){
        return questions.getQuestion();
    }
    public double[] getAnswer() {
        return questions.getAnswer();
    }
}