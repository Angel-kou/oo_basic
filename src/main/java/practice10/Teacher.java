package practice10;

import java.util.*;

public class Teacher extends Person{
    private HashSet<Klass> classes = new HashSet<>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Set<Klass> getClasses() {
        return classes;
    }

    public void setClasses(HashSet<Klass> classes) {
        this.classes = classes;
    }

    @Override
    public String introduce() {
        System.out.println("--111----");
        String basic = super.introduce();
        if(this.classes.size() == 0){
            basic += " I am a Teacher. I teach No Class.";
        }else{
            basic += " I am a Teacher. I teach Class ";
            List<Integer> list = new ArrayList<>();
            this.classes.stream().forEach(x->list.add(x.getNumber()));
            list.sort(Comparator.naturalOrder());
            for(int i= 0; i <= list.size()-1 ;i++){
                if(i != list.size()-1){
                    basic += list.get(i)+", ";
                }else{
                    basic += list.get(i)+".";
                }
            }

        }
        return basic;
    }

    public boolean isTeaching(Student student){
        if(this.classes.contains(student.getKlass())){
            return true;
        }else {
            return false;
        }
    }

    public String introduceWith(Student student){
        String basic = super.introduce();
        if(this.classes.contains(student.getKlass())){
            basic += " I am a Teacher. I teach "+student.getName()+".";
        }else{
            basic += " I am a Teacher. I don't teach "+student.getName()+".";
        }
        return basic;
    }
}
