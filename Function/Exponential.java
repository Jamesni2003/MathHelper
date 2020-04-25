package Function;

public class Exponential extends Function {
private double a;
private double h;
private double k;
private double x;
private double [] answer;
    public Exponential(){
        answer = new double[1];
        a = (int) (Math.random() * 25 + 1);
        h = (int) (Math.random() * 25 + 1);
        k = (int) (Math.random() * 25 + 1);
        x= (int) (Math.random() * 25 + 1);
        answer[0] = ((double) Math.round(((Math.log10(x-k))/(Math.log10(a)) + h)*100))/100;
    }
    @Override
    public double[] X() {
        System.out.println(answer[0]);
        return answer;
    }

    @Override
    public String Question() {
        
        return "If there is an Exponential Equation " + a + "^" + "(x" +"-" + h + ")" + "+" + k + ". Solve for x if y is " + x + "??" + " If there is no solution put 0";
    }


}