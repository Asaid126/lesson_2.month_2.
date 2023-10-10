public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 12);
        Triangle triangle = new Triangle("Треугольник", 2, 4, 5);
        Square square = new Square("Квадрат", 45);
        Rectangle rectangle = new Rectangle("Пямоугольник", 10, 5);
        Dog dog = new Dog("Rex");
        Cat cat = new Cat("Marusya");
        // Figure[] figures={circle,triangle,square,rectangle};  //шаг до создания интерфейса Drawable и обьединения ирархии Drawable
        Drawable[] drawables = {circle, triangle, square, rectangle, dog, cat};
        for (int i = 0; i < drawables.length; i++) {
            if (drawables[i] instanceof Figure) {
                System.out.println(((Figure) drawables[i]).getName() + " Периметр->" + ((Figure) drawables[i]).calculatePerimetr());
            }
            if (drawables[i] instanceof Animal) {
                System.out.println(((Animal) drawables[i]).getName());

            }
            drawables[i].draw();

        }
    }
}