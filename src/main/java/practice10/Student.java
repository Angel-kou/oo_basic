package practice10;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String intro = "";
        if(this.klass.getLeader()!= null && this.klass.getLeader().getId() == this.getId()) {
            intro = super.introduce() + " I am a Student. I am Leader of Class "+this.klass.getNumber()+".";
        }else {
            intro = super.introduce() + " I am a Student. I am at Class "+this.klass.getNumber()+".";
        }

        return intro;
    }
}
