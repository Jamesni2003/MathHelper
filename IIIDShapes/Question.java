package IIIDShapes;

public class Question {
    private int x;
    private IIIDShape shapes;
    private double answer;
    public Question(String Kind){
        x = 0/* (int) (Math.random() * 6) */;
        if(Kind == "SA"){
            switch(x){
                case 0:
                shapes = new Cube();
                answer = shapes.SA();
                break;
            }
        }
        else{
            switch(x){
                case 0:
                shapes = new Cube();
                answer = shapes.Volume();
                break;
            }
        }
    } 
    public String Answer(){
        return "answer";
    }
    public IIIDShape getShape(){
        return shapes;
    }
}