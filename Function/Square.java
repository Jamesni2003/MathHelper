package Function;

public class Square extends Function{
    private int a,
                b,
                c;
    //Integer.signum(
    public Square(){

        a = (int) (Math.random() * 5 + 1) * Sign();
        b = (int) (Math.random() * 20 + 1) * Sign();
        c = (int) (Math.random() * 100 + 1) * Sign();
    }
    @Override
    public double[] X() {
        double x[];
        double determinant = (b*b)-(4*a*c);
        
        if(determinant>0){
            double sqrt = Math.sqrt(determinant);
            double firstRoot = Math.round((-b + sqrt)/(2*a) * 100) / 100;
            double secondRoot = Math.round((-b - sqrt)/(2*a) * 100) / 100;
            x = new double[]{
                firstRoot,
                secondRoot
            };
            return x;
        }else if(determinant == 0){
            double sqrt = Math.sqrt(determinant);
            double root = Math.round((-b + sqrt)/(2*a) * 100) / 100;
            x = new double[]{root};
            return x;
        }else{
            return null;
        }
    }

    @Override
    public String Question() {
        String b = (this.b > 0)? "+ " + this.b : "- " + -this.b;
        String c = (this.c > 0)? "+ " + this.c : "- " + -this.c;
        // TODO Auto-generated method stub
        return "Solve the equation f(x) = " + a + "x² " + b + "x " + c + " (Answer in nearest tenth)";
    }
}