/**
 * Метод можно имплементировать в розничных складах и не имплементировать в оптовых,
 * где удаление только списком Interface segregation principle
 *Метод можно имплементировать в другие классы со списками, напр поставщиков Open-closed principle
 * @param <Object>>
 */
public interface Del<Object>{
    public void del(Object product);
}
