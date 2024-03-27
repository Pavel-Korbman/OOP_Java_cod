public class Calculator extends DataModel {

    public Calculator() {
    }

    @Override
    public double sum1() { return x + x1; }
    @Override
    public double sum2() { return y + y1; }
    @Override
    public double dif1() { return x - x1; }
    @Override
    public double dif2() { return y - y1; }
    @Override
    public double multi1() { return x * x1 - y * y1; }
    @Override
    public double multi2() { return y * x1 + x * y1; }
    @Override
    public double divide1() { return (double) (x * x1 + y * y1) / (Math.pow(x1, 2) + Math.pow(y1, 2)); }
    @Override
    public double divide2() { return (double) (y * x1 - x * y1) / (Math.pow(x1, 2) + Math.pow(y1, 2)); }


}