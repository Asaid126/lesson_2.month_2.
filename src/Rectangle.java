public class Rectangle extends Figure{
    private int l,l2;

    public Rectangle(String name, int l, int l2) {
        super(name);
        this.l = l;
        this.l2 = l2;
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public int calculatePerimetr() {
        return l*l2;
    }

    @Override
    public void draw() {
        System.out.println("▅");
    }
}
