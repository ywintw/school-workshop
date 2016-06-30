import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person implements X{
    private List<Klass> klassList = null;

    public Teacher(String name, int id, int age, List<Klass> klassList){
        super(name,id,age);
        this.klassList = klassList;
    }

    public void addKlass(Klass klass){
        klassList.add(klass);
    }

    public void removeKlass(Klass klass){
        klassList.remove(klass);
    }

    public List<Klass> getKlassList(){
        return klassList;
    }

    public void introduce(){
        int size = this.klassList.size();
        if(size!=0){
            super.introduce();
            //System.out.println(" I am a Teacher. I teach Class " + getKlass() + ".");
            System.out.print(" I am a Teacher. I teach Class ");

            for(int i=0; i < size; i++){
                System.out.print(klassList.get(i).getNumber());
                if(i < size-1){
                    System.out.print(",");
                }
            }
            System.out.println(".");
        }else{
            super.introduce();
            System.out.println(" I am a Teacher. I teach No Class.");
        }
    }

    public void isTeaching(Student stu){
        if(this.klassList.contains(stu.getKlass())){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }

    /*当学生加入Teacher教的班级的时候，Teacher会打印一个句话,形如：
    I am Tom. I know Jerry has joined Class 2.*/

    public void joinTell(Klass klass,Student stu){
        if(klass.getNumber() == stu.getKlass().getNumber() && klassList.contains(stu.getKlass())){
            System.out.println("I am " + super.getName() + ". I know " + stu.getName() + " has joined Class " + klass.getNumber() + ".");
        }
    }

    /*当学生成为Teacher教的班级的班长的时候，Teacher会打印一个句话,形如：
    I am Tom. I know Jerry become Leader of Class 2.*/

    public void leaderTell(Klass klass,Student stu){
        if(klass.getLeader().getId() == stu.getId() && klassList.contains(stu.getKlass())){
            System.out.println("I am " + super.getName() + ". I know " + stu.getName() + " become Leader of Class " + klass.getNumber() + ".");
        }
    }



    /*public void introduceWith(Student stu){
        if(stu.getKlass().getNumber() == getKlass()){
            super.introduce();
            System.out.println(" I am a Teacher. I teach " + stu.getName() + ".");
        }else{
            super.introduce();
            System.out.println(" I am a Teacher. I don't teach " + stu.getName() + ".");
        }
    }*/
}

