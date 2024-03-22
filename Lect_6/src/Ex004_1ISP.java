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
 * Здесь в интерфейсе interface Phone собранны все возможные функции телефона.
 * В результате в классе class Nokia3310 реализовываются методы
 * SendEMail() и SendFax(), которые этот телефон не умеет делать.
 */
public class Ex004_1ISP {
    public static void main(String[] args) {

    }
}


interface Phone {
    void Call();    
    void SendSMS();    
    void SendEMail();
    void SendFax();
}


class Siemens implements Phone {

    @Override
    public void Call() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendEMail() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendFax() {
        // TODO Auto-generated method stub
        
    }
}

 
class Nokia3310 implements Phone {

    @Override
    public void Call() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendSMS() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendEMail() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void SendFax() {
        // TODO Auto-generated method stub
        
    }

    
}