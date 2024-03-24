public interface Worker {
    void work();
}

class Engineer implements Worker, Eater {
    @Override
    public void work() {
        // Реализация работы инженера
    }
    @Override
    public void eat() {
        // Реализация питания инженера
    }
}


