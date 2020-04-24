package Function;

public abstract class Function {
    public abstract double[] X();
    
    public abstract String Question();

    public static int Sign(){
        int rand = (int) (Math.random() * 100 + 1);
        return (rand <= 50)? -1 : 1;
    }
}