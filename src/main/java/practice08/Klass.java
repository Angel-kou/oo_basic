package practice08;

import java.util.List;

public class Klass {
    private int Number;
    private Student leader;

    public Klass(int number) {
        Number = number;
    }

    public void assignLeader(Student leader){
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    public String getDisplayName() {
        return "Class "+this.Number;
    }
}
