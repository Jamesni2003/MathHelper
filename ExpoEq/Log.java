package ExpoEq;

public class Log extends Expo {
private double a;
private double h;
private double k;
private double x;
private double [] answer;
    public Log(){
        answer = new double[1];
        a = 9;//(int) (Math.random() * 25 + 1);
        h = 4;//(int) (Math.random() * 25 + 1);
        k = 11;//(int) (Math.random() * 25 + 1);
        x = 0; //(int) (Math.random() * 25 + 1);
        answer[0] = Math.round(((Math.log10(x-h))/(Math.log10(a)) + k)*100)/100;
    }
    @Override
    public double[] Answer() {
        // TODO Auto-generated method stub
        return answer;
    }

    @Override
    public String Question() {
        // TODO Auto-generated method stub
        return "If there is an Logarithmic Equation Log base " + a + " argument " + "(x" +"-" + h + ")" + "+" + k + ". Solve if x is " + x + "??" + " If there is no solution put 0";
    }


}