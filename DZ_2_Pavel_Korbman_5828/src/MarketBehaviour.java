import java.util.ArrayList;

public interface MarketBehaviour {
    /**
     * Прийти в магазин
     * @param actor
     */
    void acceptToMarket(Actor actor);

    /**
     * Уйти из магазина
     */
    void releaseFromMarket(ArrayList<Actor> out); // нужно несколько

    /**
     * Обновить состояния магазина (принимает и отдает заказы)
     */
    void update();
}
