
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public abstract class Beverage  implements Iterator<Ingredient>{
    public List<Ingredient> components;
    int index;
    public Beverage() {
        components = new ArrayList<>();
        index = 0;
    }

    public void addComponent(Ingredient component){
        components.add(component);
    }
    @Override
    public boolean hasNext(){
        return index < components.size();
    }
    @Override
    public Ingredient next(){
        return components.get(index++);
    }


}
