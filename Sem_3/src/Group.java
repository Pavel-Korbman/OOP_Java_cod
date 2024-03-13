import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Group implements Iterable<Student>{
    private List group = new ArrayList<>();

    public List getGroup() {
        return group;
    }

    public void setGroup(List group) {
        this.group = group;
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(group);
    }

}
