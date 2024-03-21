/**
 * программа предоставляет клиенту скидку
 */
// Open-closed principle
// Принцип открытости/закрытости
// Можно улучшать, но нельзя изменять
// Классы должны быть открыты для расширения
// и одновременно закрыты для модификации.
// Иными словами,
// должна быть возможность добавлять новые свойства и расширять класс
// без изменения внутренней реализации существующих свойств.

/** Здесь только о два вида скидок, для добавления ещё видов надо переписывать*/
public class Ex002_1OCP {
    public static void main(String[] args) {
        System.out.println(new Client(1).getDiscount(100));
    }
}

class Client {
    public int clientType;

    public Client(int type) {
        clientType = type;
    }

    public double getDiscount(double price) {
        return (clientType == 1) ? price *0.85 : price *0.95;
    }
}

// Больше клиентов = больше if'ов
