package IIIDShapes;

public class Rectangle extends IIIDShape{
    private int length,
                width,
                height;
    public Rectangle(){
        length = (int) (Math.random() * 25 + 1);
        width = (int) (Math.random() * 25 + 1);
        height = (int) (Math.random() * 25 + 1);
    }

    @Override
    public int Volume() {
        // TODO Auto-generated method stub
        return width * height *height;
    }

    @Override
    public int SA() {
        // TODO Auto-generated method stub
        return 2 * (length * height) + 2* (length * width) + 2*(width * height);
    }

    @Override
    public String QuestionSA() {
        // TODO Auto-generated method stub
        return "If the side lengths of a rectangle are" + length + ", " + width + "," + height + "then what is the surface area";
    }
    @Override
    public String QuestionVolume() {
        // TODO Auto-generated method stub
        return "If the side lengths of a rectangle are" + length + ", " + width + "," + height + "then what is the volume";
    }
}