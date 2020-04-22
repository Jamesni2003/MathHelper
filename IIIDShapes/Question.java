package IIIDShapes;

public class Question {
    private int x;
    public IIIDShape shapes;
    public Question(String Kind){
        x = 0/* (int) (Math.random() * 6) */;
        if(Kind == "SA"){
            switch(x){
                case 0:
                shapes = new Cube();
                break;
            }
        }
        else{
            switch(x){
                case 0:
                shapes = new Cube();
                break;
            }
        }
    } 
}