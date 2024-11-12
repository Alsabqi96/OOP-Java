package OOP.SchoolSystem.Entities;
import java.util.List;


public class Subject {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Short getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(Short creditHours) {
        this.creditHours = creditHours;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }

    private String name;
    private Short creditHours;
    private List<Mark> marks;

}
