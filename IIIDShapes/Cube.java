package IIIDShapes;

public class Cube extends IIIDShape{
    private int length;
    public Cube(){
        length = (int) (Math.random() * 25 + 1);
    }

    @Override
    public int Volume() {
        // TODO Auto-generated method stub
        return length * length *length;
    }

    @Override
    public int SA() {
        // TODO Auto-generated method stub
        return 6 * (length * length);
    }

    @Override
    public String QuestionSA() {
        // TODO Auto-generated method stub
        return "If the side lengths of a cube are" + length + ", " + length + "," + length + "then what is the surface area";
    }
    @Override
    public String QuestionVolume() {
        // TODO Auto-generated method stub
        return "If the side lengths of a cube are" + length + ", " + length + "," + length + "then what is the volume";
    }
}