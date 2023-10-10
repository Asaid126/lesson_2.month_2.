public class Circle extends Figure {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public Circle(String name) {
        super(name);


    }
    public int calculatePerimetr() {

        return (int) (2*Math.PI*radius);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE4");
    }
}
