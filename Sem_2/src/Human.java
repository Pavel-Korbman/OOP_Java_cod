public class Human extends Actor {
    protected String name;
    protected String gender;
    protected int age;
    protected String address;
    protected boolean orderMake;
    protected boolean orderTake;


    public Human(String name, String gender, int age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void setMakeOrder(){
        this.orderMake = false;
        System.out.println(getName() + ", Вы можете оформить заказ");
    }

    public void setTakeOrder(){
        this.orderTake = false;
        System.out.println(getName() + ", Вы можете получить заказ");
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", orderMake=" + orderMake +
                ", orderTake=" + orderTake +
                '}';
    }
}
