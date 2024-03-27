import java.io.IOException;

public class Controller extends Presenter {
    public Controller(Model m, View v) {
        super(m, v);
    }

    public void calculate(String operation) throws IOException {
        if (operation.equals("+")) {
            view.print(model.sum1(), model.sum2(), "Сумма: ");
        } else if (operation.equals("*")) {
            view.print(model.multi1(), model.multi2(), "Произведение: ");
        } else if (operation.equals("-")) {
            view.print(model.dif1(), model.dif2(), "Разница: ");
        } else if (operation.equals("/")) {
            view.print(model.divide1(), model.divide2(), "Частное: ");
        } else System.out.println("Ошибка! Вы ввели несуществующую операцию: " + operation);
    }
}
