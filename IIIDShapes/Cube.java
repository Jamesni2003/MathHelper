package IIIDShapes;

public class Cube extends IIIDShape{
    private int length,
                width,
                height;
    public Cube(){
        length = (int) (Math.random() * 100 + 1);
        width = (int) (Math.random() * 100 + 1);
        height = (int) (Math.random() * 100 + 1);
    }

    @Override
    public double Volume() {
        // TODO Auto-generated method stub
        return width * height * length;
    }

    @Override
    public double SA() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String Question() {
        // TODO Auto-generated method stub
        return "this is the question";
    }
}