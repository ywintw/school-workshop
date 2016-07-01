/**
 * Created by sndjgkwn on 6/29/16.
 */
public class Computer implements Monitor {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    /*当学生加入Teacher教的班级的时候，Teacher会打印一个句话,形如：
    I am Tom. I know Jerry has joined Class 2.*/

    public void joinTell(Klass klass,Student stu){
        System.out.println("I am the Machine. I know " + stu.getName() + " has joined Class " + klass.getNumber() + ".");
    }

    /*当学生成为Teacher教的班级的班长的时候，Teacher会打印一个句话,形如：
    I am Tom. I know Jerry become Leader of Class 2.*/

    public void leaderTell(Klass klass,Student stu){
        System.out.println("I am the Machine. I know " + stu.getName() + " become Leader of Class " + klass.getNumber() + ".");
    }





}
