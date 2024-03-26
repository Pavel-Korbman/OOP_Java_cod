public class Presenter {
    View view;
    Model model;

    public Presenter(Model m, View v) {
        model = m;
        view = v;
    }

    public void buttonClick(){
        double a = view.getValue("Для комплексного числа a+bi, введите a: ");
        double b = view.getValue("Для комплексного числа a+bi, введите b: ");
        String operation = view.getOperation("Выберите действие (+ - * /): ");
        double c = view.getValue("Для комплексного числа c+di, введите c: ");
        double d = view.getValue("Для комплексного числа c+di, введите d: ");

        model.setX(a);
        model.setY(b);
        model.setX1(c);
        model.setY1(d);

        if (operation.equals("+")) {
            view.print(model.resultP1(), model.resultP2(),"Сумма: ");
        } else if (operation.equals("*")){
            view.print(model.resultM1(), model.resultM2(), "Произведение: ");
        } else if (operation.equals("-")){
            view.print(model.resultD1(), model.resultD2(), "Разница: ");
        } else if (operation.equals("/")){
            view.print(model.resultDi1(), model.resultDi2(), "Частное: ");
        } else System.out.println("Ошибка! Вы ввели несуществующую операцию: " + operation);
    }

}