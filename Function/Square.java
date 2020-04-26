package Function;

public class Square extends Function{
    private double a,
                   b,
                   c;
    //Integer.signum(
    public Square(){

        a = (int) Math.round(Math.random() * 5 + 1) * Sign();
        b = (int) (Math.random() * 20 + 1) * Sign();
        c = (int) (Math.random() * 100 + 1) * Sign();
    }
    @Override
    public double[] X() {
        double x[];
        double determinant = (b*b)-(4*a*c);
        
        if(determinant>0){
            double sqrt = Math.sqrt(determinant);
            double firstRoot = (double) Math.round((-b + sqrt)/(2*a) * 100) / 100;
            double secondRoot = (double) Math.round((-b - sqrt)/(2*a) * 100) / 100;
            x = new double[]{
                firstRoot,
                secondRoot
            };
            return x;
        }else if(determinant == 0){
            double sqrt = Math.sqrt(determinant);
            double root = (double) Math.round((-b + sqrt)/(2*a) * 100) / 100;
            x = new double[]{root};
            return x;
        }else{
            return null;
        }
    }

    @Override
    public String Question() {
        String a = (this.a == 1)? "" : "" + (int) this.a;
        String b = (this.b == 1)? "" : (this.b > 0)? "+ " + (int) this.b : "- " + (int) -this.b;
        String c = (this.c == 1)? "" : (this.c > 0)? "+ " + (int) this.c : "- " + (int) -this.c;
        // TODO Auto-generated method stub
        return "Solve the equation for the x intercept f(x) = " + a + "x² " + b + "x " + c + " (Round to the nearest hundreth)\nDon't put anything if is no solution";
    }
}