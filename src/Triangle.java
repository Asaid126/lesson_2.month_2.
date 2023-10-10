public class Triangle extends Figure {
    private int sA,sB,sC;

    public Triangle(String name, int sA, int sB, int sC) {
        super(name);
        this.sA = sA;
        this.sB = sB;
        this.sC = sC;
    }





    @Override
    public int calculatePerimetr() {
        return sA+sB+sC;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDD3B");

    }
}
