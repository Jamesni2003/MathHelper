package Question;

import Function.*;

public class FuctionQuestion extends QuestionFormat {
    private Function function;
    public FuctionQuestion(String typeProblem){
        switch(typeProblem){
            case "Linear":
            function = new Linear();
            break;
            case "Square":
            function = new Square();
            break;
            case "Absolute":
            function = new Absolute();
            break;
            default:
            break;
        }
    }

    @Override
    public String getQuestion() {
        return function.Question();
    }

    @Override
    public double [] getAnswer() {
        return function.X();
    }
}