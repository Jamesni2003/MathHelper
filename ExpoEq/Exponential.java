package ExpoEq;

public class Exponential extends Expo {
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
        x = (int) (Math.random() * 25 + 1);
        answer[0] = Math.round((Math.pow(a, (x - h)) + k)*100)/100;
    }
    @Override
    public double[] Answer() {
        // TODO Auto-generated method stub
        return answer;
    }

    @Override
    public String Question() {
        // TODO Auto-generated method stub
        return "If there is an Exponential Equation " + a + "^" + "(x" +"-" + h + ")" + "+" + k + ". Solve if x is " + x + "??";
    }


}