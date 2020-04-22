import Question.*;

public class Question {
    private TypeOfProblem type = TypeOfProblem.get_Instance();
    private QuestionFormat questions;
    public Question(){
        switch(type.getTypeProblem()){
            case IIIDShapeSA:
                questions = new IIIDShapeQuestion("SA");
            break;
            case IIIDShapeV:
                questions = new IIIDShapeQuestion("V");
            break;
            default:
            break;
        }
    }
    
    public String getQuestion(){
        return questions.getQuestion();
    }
    public String getAnswer(){
        return questions.getAnswer();
    }
}