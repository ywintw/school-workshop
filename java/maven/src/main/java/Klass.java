import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Klass {
    private int number;
    private Student leader;
    private List<Student> stuList = new ArrayList<Student>();

    public Klass(int number){
        this.setNumber(number);
    }

    public boolean isIn(Student stu){
        return stu.getKlass().getNumber() == number;
    }

    //stuList = new ArrayList<Student>();

    public void appendMember(Student stu){
        stuList.add(stu);
        stu.setKlass(this);
    }

    /*public void appendTeacher(Teacher teacher){
        this.teaList.add(teacher);
        teacher.setKlass(this);
    }*/

    public void assignLeader(Student stu){
        if(stu.getKlass().getNumber() == number){
            leader = stu;
        }else{
            System.out.println("It is not one of us.");
        }
    }


    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public Student getLeader(){
        return leader;
    }

    /*当学生加入Teacher教的班级的时候，Teacher会打印一个句话,形如：
    I am Tom. I know Jerry has joined Class 2.*/

    /*public void joinTell(Student stu, Teacher teacher){
        Klass klass = stu.getKlass();
        if(klass.getNumber() == this.number && teacher.getKlassList().contains(stu.getKlass())){
            System.out.println("I am " + teacher.getName() + ". I know " + stu.getName() + " has joined Class " + number + ".");
        }
    }
*/
    /*当学生成为Teacher教的班级的班长的时候，Teacher会打印一个句话,形如：
    I am Tom. I know Jerry become Leader of Class 2.*/

    /*public void leaderTell(Student stu, Teacher teacher){
        if(stu.getId() == leader.getId() && teacher.getKlassList().contains(stu.getKlass())){
            System.out.println("I am " + teacher.getName() + ". I know " + stu.getName() + " become Leader of Class " + number + "." );
        }

    }*/






    /*@Override
    public boolean equals(Object obj) {
        return obj!=null && this.number == (Klass)obj;
    }*/



}
