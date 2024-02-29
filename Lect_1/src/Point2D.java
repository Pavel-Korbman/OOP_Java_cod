
/**
* Описание надо писать через "/**" перед методом или классом - ТАК ОПИСАНИЕ БУДЕТ ВИДНО В КЛИЕНТСКОМ КОДЕ
* ЭТО КЛАСС ДЛЯ ЗАДАНИЯ ТОЧЕК НА ПЛОСКОСТИ
* */
public class Point2D {
    private int x, y;  // По умолчанию public

    /**
     * ЭТО КОНСТРУКТОР ДЛЯ ЗАДАНИЯ КООРДИНАТ ТОЧКИ
     * @param valueX Это координата х
     * @param valueY Это координата у
     */
    public Point2D(int valueX, int valueY) {  // Для заполнения в скобках 2 значений при вызове метода
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) { // Для заполнения в скобках 1 значения при вызове метода (оба становяться равны)
        this(value, value);  // this использует предыдущий метод Point2D
    }

    public Point2D() {  // Для заполнения по умолчанию при вызове метода (оба становяться равны 0)
        this(0);
    }

//    public Point2D() {
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value) {
//        x = value;
//        y = value;
//    }


//    public String getInfo() {
//        return String.format("x: %d; y: %d", x, y);
//    }

//    @Override
//    public String toString() {
//        return getInfo();
//    }

    /**
     * Для возвращения private x
     * @return возвращает х
     */
    public int getX(){
        return x;
    }
    /**
     * Для возвращения private у
     * @return возвращает у
     */
    public int getY(){  // Для возвращения private y
        return y;
    }

    /**
     * Для изменения х
     * @param val новый х
     */
    public void setX(int val){
        this.x=val;  // this не обязателен, но лучше привыкать использовать с базовыми для класса полями
    }
    /**
     * Для изменения у
     * @param val новый у
     */
    public void setY(int val){
        this.y=val;// this не обязателен, но лучше привыкать использовать с базовыми для класса полями
    }

    /**
     * Для форматирования вывода данных
      * @return возвращает в формате x: %d; y: %d
     */
    @Override
    public String toString() {  // Для форматирования вывода данных
        return String.format("x: %d; y: %d", x, y);
    }

    /**
     *  * Для вычисления расстояния между точками на плоскости
     * @param a первая точка
     * @param b вторая точка
     * @return
     */

    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
