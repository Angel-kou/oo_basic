package practice11;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> members = new ArrayList<>();
    private List<Teacher> teachers = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
    }

    public void assignLeader(Student leader){
        if(members.contains(leader)){
            this.leader = leader;
            notifyTeacher(leader);
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDisplayName() {
        return "Class "+this.number;
    }


    public List<Student> getMembers() {
        return members;
    }

    public void setMembers(List<Student> members) {
        this.members = members;
    }

    public void appendMember(Student student){
        this.members.add(student);
        notifyTeacher(student);
    }

    private void notifyTeacher(Student student) {
        for (Teacher teacher:teachers) {
            teacher.update(student);
        }

    }

    public void attach(Teacher observer){
        teachers.add(observer);
    }


    public boolean isIn(Student student){
        if(this.members.contains(student)){
            return true;
        }else {
            return false;
        }
    }
}
