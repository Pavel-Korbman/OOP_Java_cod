public abstract class DataModel implements Model {
    double x, y, x1, y1;
    @Override
    public void setX(double value) { x = value; }
    @Override
    public void setY(double value) { y = value; }
    @Override
    public void setX1(double value) { x1 = value; }
    @Override
    public void setY1(double value) { y1 = value; }
}

