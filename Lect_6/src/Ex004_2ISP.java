// Interface segregation principle
// Принцип разделения интерфейса 
// Модули высокого уровня не должны зависеть от модулей нижнего уровня.
//   И те, и другие должны зависеть от абстракций.
// Абстракции не должны зависеть от деталей. Детали должны зависеть от абстракций.
/** Программа - функционала телефонов
 */
//Interface segregation principle Принцип разделения интерфейсов
// Классы клиенты не должны реализовывать интерфейсы, которые они не используют.
// Данный принцип требует разделения «толстых» интерфейсов на несколько специализированных,
// связанных общей функциональностью.
// Классу имплементируем только те интерфейсы которые его полностью касаются


/**
 * Здесь мы выносим отдельный функционал телефонов в отдельные интерфейсы:
 * interface BasePhone только звонки и смс
 * interface Fax только факс
 * interface EMail только мейл
 * и имплементируем к каждому классу модели телефона те интерфейсы, которые он может реализовать
 */
public class Ex004_2ISP {
    public static void main(String[] args) {

    }
}

interface BasePhone {
    void Call();
    void SendSMS();
}

interface Fax {
    void SendFax();

}

interface EMail {
    void SendEMail();
}

class IPhone implements BasePhone, Fax, EMail {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {
       

    }

    @Override
    public void SendEMail() {
        

    }

    @Override
    public void SendFax() {
    }
}

class Nokia3311 implements BasePhone {

    @Override
    public void Call() {
    }

    @Override
    public void SendSMS() {

    }
}