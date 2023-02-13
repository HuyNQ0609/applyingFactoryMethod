public class ShapeFactory {
    private ShapeFactory() {}

    public static Shape getShape(ShapeType shapeType) {
        return switch (shapeType) {
            case circle -> new Circle();
            case square -> new Square();
            case rectangle -> new Rectangle();
            default -> throw new IllegalArgumentException("No drawings exist!");
        };
    }
}
