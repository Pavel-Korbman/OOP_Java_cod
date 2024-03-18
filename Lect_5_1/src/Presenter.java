import java.util.Objects;

public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        int a = view.getValue("a: ");
        String d = view.getD("+, -, *, / :");
        int b = view.getValue("b: ");
        model.setX(a);
        model.setY(b);
        if (d.equals("+")) {
            int result = model.result();
            view.print(result, "Сумма: ");
        } else if (d.equals("*")){
            int result = model.resultM();
            view.print(result, "Произведение: ");
        } else if (d.equals("-")){
            int result = model.resultD();
            view.print(result, "Разница: ");
        } else if (d.equals("/")){
            double result = model.resultDi();
            view.print(result, "Частное: ");
        }
    }
}