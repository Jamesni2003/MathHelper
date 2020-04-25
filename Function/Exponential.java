package Function;

public class Exponential extends Function {
private double a;
private double h;
private double k;
private double y;
    public Exponential(){
        a = (int) (Math.random() * 25 + 1);
        h = (int) (Math.random() * 25 + 1);
        k = (int) (Math.random() * 25 + 1);
        y = (int) (Math.random() * 25 + 1);
    }
    @Override
    public double[] X() {
        double [] answer = {((double) Math.round(((Math.log10(y-k))/(Math.log10(a)) + h)*100))/100};
        return answer;
    }

    @Override
    public String Question() {
        String a = (this.a > 0)? (int) this.a + "" : "-" + (int) -this.a; 
        String h = (this.h == 0)? "" : (this.h > 0)? "+ " + (int) this.h : "- " + (int) -this.h;
        String k = (this.k == 0)? "" : (this.k > 0)? "+ " + (int) this.k : "- " + (int) -this.k;
        return (int)y + " = " + a + "^" + "(x " + h + ") " + k + ". Solve for x?(round answer to hundreth)";
    }

}