package practice07;

public class Teacher extends Person{

    private String name;
    private int age;
    private Klass klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, Klass klass) {
        super(name, age);
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
        String basic = super.introduce();
        if(this.klass==null || this.klass.getNumber() == 0){
            basic += " I am a Teacher. I teach No Class.";
        }else{
            basic += " I am a Teacher. I teach Class 2.";
        }
        return basic;
    }

    public String introduceWith(Student student){
        String basic = super.introduce();
        if(student.getKlass().getNumber()==this.klass.getNumber()){
            basic += " I am a Teacher. I teach "+student.getName()+".";
        }else{
            basic += " I am a Teacher. I don't teach "+student.getName()+".";
        }
        return basic;
    }

}
