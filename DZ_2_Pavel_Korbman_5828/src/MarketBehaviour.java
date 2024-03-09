import java.util.ArrayList;

public interface MarketBehaviour {
    /**
     * Добавляет в магазин
     *
     * @param actor
     */
    static void acceptToMarket(Actor actor) {}

    /**
     * Убирает из магазина
     */
    static void releaseFromMarket(ArrayList<Actor> out) {}

    /**
     * Обновляет состояния магазина
     */
    static void update() {}
}
