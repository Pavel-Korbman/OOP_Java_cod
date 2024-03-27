import java.io.IOException;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick() throws IOException {
        double a = view.getValue("Для комплексного числа a+bi, введите a: ");
        double b = view.getValue("Для комплексного числа a+bi, введите b: ");
        String operation = view.getOperation("Выберите действие (+ - * /): ");
        double c = view.getValue("Для комплексного числа c+di, введите c: ");
        double d = view.getValue("Для комплексного числа c+di, введите d: ");

        model.setX(a);
        model.setY(b);
        model.setX1(c);
        model.setY1(d);

        Controller controller = new Controller(model, view);
        controller.calculate(operation);
    }

}