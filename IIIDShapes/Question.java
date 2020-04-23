package IIIDShapes;

public class Question {
    private int x;
    private IIIDShape shapes;
    private String answer;
    public Question(String Kind){
        x = (int) (Math.random() * 3);
        switch(x){
            case 0:
            shapes = new Rectangle();
            break;
            case 1:
            shapes = new Sphere();
            break;
            case 2:
            shapes = new Sphere();
            break;
        }
        if(Kind == "SA") answer = String.valueOf(getShape().SA());
        else answer = String.valueOf(getShape().Volume());
        
    } 
    public boolean Answer(String answer){
        System.out.println((answer.equals(this.answer)));
        System.out.println(answer);
        System.out.println(this.answer);
        return (answer.equals(this.answer));
    }
    public IIIDShape getShape(){
        return shapes;
    }
    public void anotherproblem(){
        x = (int) (Math.random() * 3);
    }

}