public class CalcModel extends DataModel {

    public CalcModel() { }

    @Override
    public double resultP1() {
        return x + x1;
    }
    @Override
    public double resultP2() { return y + y1; }
    @Override
    public double resultM1() { return x * x1 - y * y1; }
    @Override
    public double resultM2() { return y * x1 + x * y1; }
    @Override
    public double resultD1() { return x - x1; }
    @Override
    public double resultD2() { return y - y1; }
    @Override
    public double resultDi1() { return (double) (x * x1 + y * y1) / (Math.pow(x1, 2) + Math.pow(y1, 2)); }
    @Override
    public double resultDi2() { return (double) (y * x1 - x * y1) / (Math.pow(x1, 2) + Math.pow(y1, 2)); }

    @Override
    public void setX(double value) {
        super.x = value;
    }
    @Override
    public void setY(double value) {
        super.y = value;
    }
    @Override
    public void setX1(double value) { super.x1 = value; }
    @Override
    public void setY1(double value) {
        super.y1 = value;
    }

}