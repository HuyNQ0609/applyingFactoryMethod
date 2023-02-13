public class Client {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeType.circle);
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape(ShapeType.square);
        shape2.draw();
        Shape shape3 = ShapeFactory.getShape(ShapeType.rectangle);
        shape3.draw();
    }
}