package IIIDShapes;

public class Sphere extends IIIDShape{
    private int radius;
    public Sphere(){
        radius = (int) (Math.random() * 25 + 1);
    }

    @Override
    public double Volume() {
        return (double) Math.round(((4/3) * Math.PI * Math.pow(radius, 3)) * 100) / 100;
    }

    @Override
    public double SA() {
        return  (double) Math.round((4 * (Math.PI) * Math.pow(radius, 2)) * 100) / 100;
    }

    @Override
    public String QuestionSA() {
        return "If the Radius of a sphere is " + radius + ". What is the surface Area? (Round to the nearest hundreth)";
    }
    @Override
    public String QuestionVolume() {
        return  "If the Radius of a sphere is " + radius + ". What is the Volume? (Round to the nearest hundreth)";
        
    }
}
