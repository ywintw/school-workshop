


public class Person {
    private String name;
    private int age;
    private int id;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public Person(String name, int id, int age){
        this.setName(name);
        this.setId(id);
        this.setAge(age);
    }

    public void introduce(){
        System.out.print("My name is " + getName() + ". I am " + getAge() + " years old.");  //要添加换行吗
    }
}
