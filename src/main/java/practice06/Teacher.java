package practice06;

public class Teacher extends Person{
    private String name;
    private int age;
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    @Override
    public String introduce() {
        String basic = super.introduce();
        if(this.klass == 0){
            basic += " I am a Teacher. I teach No Class.";
        }else{
            basic += " I am a Teacher. I teach Class 2.";
        }
        return basic;
    }
}
