import java.util.ArrayList;
public interface QueueBehaviour {
    /**
     * Поставить в очередь
     * @param actor
     */
    void takeInQueue(Actor actor);

    /**
     * Прининять заказ
     */
    void takeOrders();

    /**
     * Отдать заказ
     */
    void giveOrders();

    /**
     * Убрать из очереди
     */
    void releaseFromQueue();
}
