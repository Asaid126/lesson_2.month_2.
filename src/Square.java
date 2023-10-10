public class Square extends Figure{
    private int s;

    public Square(String name, int s) {
        super(name);
        this.s = s;
    }

    public Square(String name) {
        super(name);
    }

    @Override
    public int calculatePerimetr() {
        return s*4;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFEB");

    }
}
