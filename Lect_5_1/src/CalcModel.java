public class CalcModel extends DataModel {

    public CalcModel() {

    }
    // do_it
    @Override
    public int result() {
        return x + y;
    }
    public int resultM() { return x * y; }
    public int resultD() { return x - y; }
    public double resultDi() { return (double) x / y; }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }


}