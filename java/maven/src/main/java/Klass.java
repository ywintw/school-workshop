import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> stuList;
    private List<Teacher> teaList;
    private List<Monitor> monList;

    public Klass(int number){
        this.setNumber(number);
        this.stuList = new ArrayList<Student>();
        this.teaList = new ArrayList<Teacher>();
        this.monList = new ArrayList<Monitor>();
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public void registerMoni(Monitor monitor){
        monList.add(monitor);
    }

    public void addTeacher(Teacher teacher){
        teaList.add(teacher);
        teacher.addKlass(this);
    }

    public void removeTeacher(Teacher teacher){
        teaList.remove(teacher);
        teacher.removeKlass(this);
    }


    public void isIn(Student stu) {
        if (stu.getKlass() != null && stu.getKlass().getNumber() == number) {
            System.out.println(stu.getName() + " is in this class.");
        }else{
            System.out.println(stu.getName() + " is not in this class.");
        }
    }

    public void appendMember(Student stu){
        if(stu.getKlass() == null){
            stuList.add(stu);
            stu.setKlass(this);
            for(int i=0; i<monList.size()-1; i++) {
                Monitor mon = monList.get(i);
                mon.joinTell(this, stu);
            }
        }else{
            System.out.println(stu.getName() + " has already joined a class.");
        }
    }

    public void removeStudent(Student stu){
        if(stu.getKlass() != null){
            stuList.remove(stu);
            //stu.  ???
        }
    }


    public void assignLeader(Student stu){
        if(stu.getKlass() != null) {
            if(stu.getKlass().getNumber() == number) {
                leader = stu;
                for(int i=0; i<monList.size()-1; i++){
                    monList.get(i).leaderTell(this,stu);
                }
            }else {
                System.out.println("It is not one of us.");
            }
        }else {
            System.out.println(stu.getName() + " is not in a class.");
        }
    }

    public Student getLeader(){
        return leader;
    }



    /*@Override
    public boolean equals(Object obj) {
        return obj!=null && this.number == (Klass)obj;
    }*/



}
