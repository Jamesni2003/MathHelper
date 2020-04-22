package Question;

import IIIDShapes.*;

public class IIIDShapeQuestion extends QuestionFormat {
    private int x;
    private IIIDShape shapes;
    private double answer;

    public IIIDShapeQuestion(String Kind) {
        x = 0/* (int) (Math.random() * 6) */;
        switch(x){
            case 0:
            shapes = new Cube();
            break;
        }
        
        if(Kind == "SA") answer = shapes.SA();
        else answer = shapes.Volume();
        
    }

    @Override
    public String getQuestion() {
        return shapes.Question();
    }

    @Override
    public String getAnswer() {
        return "" + answer;
    }
}