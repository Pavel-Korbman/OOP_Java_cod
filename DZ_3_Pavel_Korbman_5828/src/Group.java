import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Group {
    private String groupName;
    private List<Student> group = new ArrayList<>();

    public Group(String groupName) {
        this.groupName = groupName;
    }

    public List<Student> getGroup() {
        return group;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroup(List<Student> group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Group{" +
                groupName +
                ", студенты=" + group +
                '}';
    }
}
