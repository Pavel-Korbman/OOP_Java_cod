import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Перебирает всех студентов в коллекции List (в группе)
 *
 */
class StudentIterator implements Iterator<Student>{
    public StudentIterator(List<Student> people) {
        this.people = people;
    }

    private List<Student> people = new ArrayList<>();

    private int count;

    @Override
    public boolean hasNext() {
        return count < people.size();
    }

    @Override
    public Student next() {
        return people.get(count++);
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
