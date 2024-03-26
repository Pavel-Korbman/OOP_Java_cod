/**
 ПАТТЕРНЫ ПРОЕКТИРОВАНИЯ
 */

public class Main {
    public static void main(String[] args) {
        //PATTERN Decorator
        Shape rectangle = new Rectangle();  // рисуем прямоугольник
        Shape redRectangle = new RedShapeDecorator(new Rectangle()); // Красим красным.
        // Если уберём предыдущую строку - сразу нарисуется красный
        rectangle.draw();
        redRectangle.draw();

        //PATTERN Factory
        Shape circle = ShapeFactory.createShape("circle"); // Если напишем "circle" нарисует круг,
        // если "rectangle" нарисует прямоугольник
        circle.draw();

        //PATTERN Adapter
        LegacyRectangle legacyRectangle = new LegacyRectangle(5, 7); // Экземпляр старого класса
        Shape adaptedRectangle = new RectangleAdapter(legacyRectangle); // Адаптируем к новому классу, чтобы применить .draw()
        adaptedRectangle.draw();
    }
}

/**
 * PATTERN Decorator
 * Структурный паттерн, расширяет объект новой функциональностью
 * не используя наследование
 * Можно улучшить или дополнить класс, не изменяя этот изначальный класс
 */

interface Shape {  // Рисует контуром
    void draw();
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Рисование прямоугольника");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Рисование круга");
    }
}

// Хотим рисовать и закрашивать

class ShapeDecorator implements Shape{
    protected Shape shape;

    public ShapeDecorator(Shape shape) {
        this.shape = shape;
    }
    public void draw(){
        shape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator{ // Взаимодействует с Shape через ShapeDecorator
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }
    @Override
    public void draw(){  // Переопределяем метод draw
        super.draw();
        System.out.println("Закрашиваем красным");
    }
}

/**
 * PATTERN Factory
 * Порождающий паттерн,
 * динамически создающий необходимый класс
 * по интерфейсу из семейства классов.
 * Фабрика - это специальный класс, создающий другие классы
 */
class ShapeFactory {
    public static Shape createShape(String type){
        if (type.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if (type.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null;
    }
}


/**
 * PATTERN Adapter
 * Структурный паттерн, адаптирует один интерфейс под другой (два несовместимых интерфейса или класса)
 * Адаптер - класс или интерфейс выступающий мостиком от старого интерфейса к новому
 */
class LegacyRectangle {  // Старый класс прямоугольник, не использует методы
    private int width;
    private int height;

    public LegacyRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    // Хотим его использовать в новом классе прямоугольник,
    // для этого создаём адаптер
}
class RectangleAdapter implements Shape{
    private LegacyRectangle legacyRectangle;

    public RectangleAdapter(LegacyRectangle legacyRectangle) {
        this.legacyRectangle = legacyRectangle;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем старый прямоугольник");
    }
}




