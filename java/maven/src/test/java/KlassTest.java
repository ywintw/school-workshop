import org.junit.Before;
import org.junit.Test;

/**
 * Created by sndjgkwn on 7/1/16.
 */
public class KlassTest {

    private Klass klass1;
    private Klass klass2;
    private Student stu1;
    private Student stu2;
    private Student stu3;
    private Student stu4;
    private Teacher teacher1;
    private Teacher teacher2;
    private Computer computer;

    @Before
    public void Klass_setup(){
        klass1 = new Klass(1);
        klass2 = new Klass(2);
        teacher1 = new Teacher("Tom",11,33);
        teacher2 = new Teacher("John",12,33);

        klass1.registerMoni(teacher1);
        klass1.registerMoni(computer);

        klass2.registerMoni(teacher2);
        klass2.registerMoni(computer);

        stu1 = new Student("Jim",01,22,klass1);
        stu2 = new Student("James",02,22,klass2);
        stu3 = new Student("Helen",03,22,null);
        stu4 = new Student("George",04,22,null);
    }

    @Test
    public void Klass_isInClass(){
        klass1.isIn(stu1);
        klass1.isIn(stu2);
        klass1.isIn(stu3);
    }


    @Test
    public void Klass_joinTell(){

        klass1.appendMember(stu3);
        klass2.appendMember(stu4);
        klass2.appendMember(stu3);

    }

    @Test
    public void Klass_leaderTell(){
        klass1.assignLeader(stu1);
        klass1.assignLeader(stu2);
        klass1.assignLeader(stu3);
    }
}
