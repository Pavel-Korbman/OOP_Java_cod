/**
 * Метод можно имплементировать в розничных складах и не имплементировать в оптовых,
 * где добавление только списком Interface segregation principle
 * @param <Object>
 */
public interface Add<Object>{
    void add(Object product, Object supplier);

}
