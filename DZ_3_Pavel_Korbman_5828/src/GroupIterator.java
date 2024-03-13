import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GroupIterator implements Iterator<Group>{
    public GroupIterator(List<Group> groups) {
        this.groups = groups;
    }

    private List<Group> groups = new ArrayList<>();

    private int count;

    @Override
    public boolean hasNext() {
        return count < groups.size();
    }

    @Override
    public Group next() {
        return groups.get(count++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
