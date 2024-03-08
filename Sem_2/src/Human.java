public class Human extends Actor {
    //    protected String name;
    protected String gender;
    protected int age;
    protected String address;
    protected boolean readyMake;
    protected boolean orderMake;
    protected boolean readyTake;
    protected boolean orderTake;


    public Human(String name, String gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void setMakeOrder(boolean readyMake, boolean orderMake) {
        this.readyMake = readyMake;
        this.orderMake = orderMake;
        if (readyMake && !orderMake) System.out.println(getName() + ", Можно оформить заказ");
        else if (orderMake) {
            System.out.println(getName() + ", Заказ оформлен");}
    }

    public void setMakeOrder(boolean readyMake) {
        this.readyMake = readyMake;
        if (readyMake) System.out.println(getName() + ", Можно оформить заказ");
    }

    public void setTakeOrder(boolean readyTake, boolean orderTake) {
        this.readyTake = readyTake;
        this.orderTake = orderTake;
        if (readyTake && !orderTake) System.out.println(getName() + ", Можно забрать заказ");
        else if (orderMake) {
            System.out.println(getName() + ", Заказ получен");
        }
    }
    public void setTakeOrder(boolean readyTake) {
        this.readyTake = readyTake;
        if (readyMake) System.out.println(getName() + ", Можно забрать заказ");
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public boolean isReadyMake() {
        return readyMake;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setOrderMake(boolean orderMake) {
        this.orderMake = orderMake;
    }

    public void setOrderTake(boolean orderTake) {
        this.orderTake = orderTake;
    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", gender='" + gender + '\'' +
//                ", age=" + age +
//                ", address='" + address + '\'' +
//                ", orderMake=" + orderMake +
//                ", orderTake=" + orderTake +
//                '}';
//    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                "gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", readyMake=" + readyMake +
                ", orderMake=" + orderMake +
                ", readyTake=" + readyTake +
                ", orderTake=" + orderTake +
                '}';
    }
}
