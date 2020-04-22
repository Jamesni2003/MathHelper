package IIIDShapes;

public class Question {
    private int x;
    private IIIDShape shapes;
    private double answer;
    public Question(String Kind){
        x = 0/* (int) (Math.random() * 6) */;
        switch(x){
            case 0:
            shapes = new Cube();
            break;
        }
        if(Kind == "SA") answer = getShape().SA();
        else answer = getShape().Volume();
        
    } 
    public String Answer(){
        return "" + answer;
    }
    public IIIDShape getShape(){
        return shapes;
    }
}