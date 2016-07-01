import java.util.List;

public class Student extends Person {
    private Klass klass;
    //private List teachers;
    private Student leader;

    public Student(String name, int id, int age, Klass klass){
        super(name,id,age);
        this.klass = klass;
    }

    public Klass getKlass(){
        return this.klass;
    }
    public void setKlass(Klass klass){
        this.klass = klass;
    }

    /*public void removeKlass(Klass klass){
        this.getKlass() == null;
    }*/



    public boolean isInKlass(Klass klass) {
        return this.klass == klass;
    }

    public void introduce(){
        Student leader = klass.getLeader();
        String leaderName = leader.getName();
        if(leaderName.equals(super.getName())
            && leader.isInKlass(klass)){
            super.introduce();
            System.out.println(" I am a Student. I am Leader of Class "+ klass.getNumber() + ".");  //要添加换行吗
        }else{
            super.introduce();
            System.out.println(" I am a Student. I am at Class " + klass.getNumber() + ".");
        }
    }


}
