package Function;

public class Log extends Function {
private double a;
private double h;
private double k;
private double x;
private double [] answer;
    public Log(){
        answer = new double[1];
        a = (int) (Math.random() * 25 + 1);
        h = (int) (Math.random() * 25 + 1);
        k = (int) (Math.random() * 25 + 1);
        x = (int) (Math.random() * 25 + 1);
        answer[0] = ((double) Math.round((Math.pow(a, (x - k)) + h)*100))/100;
    }
    @Override
    public double[] X() {
        return answer;
    }

    @Override
    public String Question() {
        return "If there is an Logarithmic Equation Log base " + a + " argument " + "(x" +"-" + h + ")" + "+" + k + ". Solve for x if y is " + x + "??" + " If there is no solution put 0. (Round to the nearest hundreth)";
    }


}