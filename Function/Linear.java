package Function;

public class Linear extends Function{
    private double m,
                   b;
    //Integer.signum(
    public Linear(){
        m = (int) (Math.random() * 20 + 1) * Sign();
        b = (int) (Math.random() * 50 + 1) * Sign();
    }
    @Override
    public double[] X() {
        double x[] = {(double) Math.round(-b / m * 100) / 100};
        return x;
    }

    @Override
    public String Question() {
        String m = (this.m == 1)? "" : "" + (int)this.m;
        String b = (this.m == 1)? "" : (this.b > 0)? "+ " + (int) this.b : "- " + (int) -this.b;
        return "Solve the equation f(x) = " + m + "x " + b + " (Round to the nearest hundreth)";
    }
    public static void main(String[] args) {
        Linear x = new Linear();
        System.out.println(x.Question());
    }
}