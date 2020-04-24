package Question;

import ExpoEq.*;

public class ExpoEqQuestion extends QuestionFormat{
    Expo expo;
    public ExpoEqQuestion(String kind){
        switch(kind){
            case "EXPO":
                expo = new Exponential();
            break;
            case "LOG":
                expo = new Log();
            break;
            default:
            break;
        }

    }
    @Override
    public String getQuestion() {
        // TODO Auto-generated method stub
        return expo.Question();
    }

    @Override
    public double[] getAnswer() {
        // TODO Auto-generated method stub
        return expo.Answer();
    }

}