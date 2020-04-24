package Question;

import IIIDShapes.*;

public class IIIDShapeQuestion extends QuestionFormat {
    private int x;
    private IIIDShape shapes;
    private double answer;
    private String Kind;

    public IIIDShapeQuestion(String Kind) {
        this.Kind = Kind;
        x = (int) (Math.random() * 3);
        switch(x){
            case 0:
            shapes = new Rectangle();
            break;
            case 1:
            shapes = new Sphere();
            break;
            case 2:
            shapes = new Cube();
            break;
        }
        if(Kind == "SA") answer = shapes.SA();
        else answer = shapes.Volume();
        
    }
 
    @Override
    public String getQuestion(){
        if(Kind == "SA"){
            return shapes.QuestionSA();
        }
        else{
            return shapes.QuestionVolume();

        }
    }

    @Override
    public double [] getAnswer() {
        double x[] = {
            answer
        };
        return x;
    }
}