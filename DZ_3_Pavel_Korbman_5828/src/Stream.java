import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<Group>{
    private String streamName;
    private List<Group> stream = new ArrayList<>();

    public Stream(List<Group> strream, String streamName) {
        this.stream = strream;
        this.streamName = streamName;
    }

    public List<Group> getStream() {
        return stream;
    }

    public void setStream(List<Group> stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Stream{" +
                streamName+" " + stream +
                '}';
    }

    @Override
    public Iterator<Group> iterator() {
        return new GroupIterator(stream);
    }
}
