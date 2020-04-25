package Function;

public class Absolute extends Function{
    private double a,
                   b,
                   c;
    //Integer.signum(
    public Absolute(){
        a = (double) Math.round(((Math.random() * 4) - 2) * 100 + 1) / 100 * Sign();
        b = (int) (Math.random() * 20 + 1) * Sign();
        c = (int) (Math.random() * 50 + 1) * Sign();
    }
    @Override
    public double[] X() {
        double x[];
        if((a > 0 && c < 0) || (a < 0 && c > 0))
            x = new double[]{-(-c / a) + -b, (-c / a) + b};
        else
            return null;
        return x;
    }

    @Override
    public String Question() {
        String a = (this.a == 1)? "" : "" + this.a;
        String b = (this.b == 1)? "" : (this.b > 0)? "+ " + (int) this.b : "- " + (int) -this.b;
        String c = (this.c == 1)? "" : (this.c > 0)? "+ " + (int) this.c : "- " + (int) -this.c;
        return "Solve the equation f(x) = " + a + "|x " + b + "| " + c + " (Round to the nearest hundreth)\nDon't put anything if is no solution";
    }
}