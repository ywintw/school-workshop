import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;


public class TeacherTest {

    private Klass klass1;
    private Klass klass2;
    private Teacher teacher1;
    private Teacher teacher2;
    private Teacher teacher3;
    private Student stu1;
    private Student stu2;
    private Computer com1;


    @Before
    public void setUp(){
        klass1 = new Klass(1);
        klass2 = new Klass(2);

        teacher1 = new Teacher("Tom", 11, 21, Arrays.asList(klass1,klass2));
        teacher2 = new Teacher("Jerry", 12, 22, Arrays.asList(klass1));
        teacher3 = new Teacher("Jerry", 13, 22, Arrays.asList(klass2));

        stu1 = new Student("Mike",01,22,klass1);
        stu2 = new Student("Helen",02,22,klass2);

        com1 = new Computer();
    }

    @Test
    public void Teacher_introduce() {
        teacher1.introduce();
        teacher2.introduce();
        teacher3.introduce();
    }

    @Test
    public void  teacher_isTeaching(){
        teacher1.isTeaching(stu1);
        teacher2.isTeaching(stu1);
        teacher3.isTeaching(stu1);
    }


    /*@Test
    public void teacher_joinTell(){
        Student stu3 = new Student("Jim",03,22,null);
        klass1.appendMember(stu3);
        klass1.joinTell(stu3,teacher1);
        klass2.joinTell(stu3,teacher1);
        klass1.joinTell(stu3,teacher3);
    }

    @Test
    public void teacher_leaderTell() {
        klass1.assignLeader(stu1);
        klass1.leaderTell(stu1, teacher1);
        klass1.leaderTell(stu2, teacher1);
        klass1.leaderTell(stu1, teacher2);
    }*/


    @Test
    public void teacher_joinTell(){
        Student stu3 = new Student("Jim",03,22,null);
        Student stu4 = new Student("James",04,22,null);
        klass1.appendMember(stu3);
        klass2.appendMember(stu4);
        teacher1.joinTell(klass1,stu3);
        teacher1.joinTell(klass2,stu3);
        teacher1.joinTell(klass1,stu2);
        teacher1.joinTell(klass1,stu4);

        com1.joinTell(klass1,stu3);
        com1.joinTell(klass2,stu3);
        com1.joinTell(klass1,stu2);
        com1.joinTell(klass1,stu4);


    }



        /*Klass klass1 = new Klass(2);
        Student stu1 = new Student("Jerry",13,klass1);
        //teacher1.introduceWith(stu1);

        Klass klass2 = new Klass(3);
        Student stu2 = new Student("Jerry",14,klass2);
        //teacher1.introduceWith(stu2);*/


}
