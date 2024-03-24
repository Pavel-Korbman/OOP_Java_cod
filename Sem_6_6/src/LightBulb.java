public class LightBulb implements OnOff {
    public void turnOn(){
        //Включение лампочки
    }
    public void turnOff(){
        //Выключение лампочки
    }
}

class Switch {
    private OnOff bulb;

    public Switch(OnOff bulb) {
        this.bulb = bulb;
    }
    public void operate(){
        //Работа с выключателем
        bulb.turnOn();
    }
}
