package IIIDShapes;

public class Sphere extends IIIDShape{
    private int radius;
    public Sphere(){
        radius = (int) (Math.random() * 25 + 1);
    }

    @Override
    public int Volume() {
        // TODO Auto-generated method stub
        return (int) ((1.3333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333333)*(Math.PI) *radius*radius*radius);
    }

    @Override
    public int SA() {
        // TODO Auto-generated method stub
        return (int) (4 * (Math.PI) * radius * radius);
    }

    @Override
    public String QuestionSA() {
        // TODO Auto-generated method stub
        return "If the Radius of a sphere is" + radius + ". What is the surface Area";
    }
    @Override
    public String QuestionVolume() {
        // TODO Auto-generated method stub
        return  "If the Radius of a sphere is" + radius + ". What is the Volume";
    }
}
