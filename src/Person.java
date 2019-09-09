public class Person {
    //data: field (member variables in C++)
    public String name;
    public int age;
    public static boolean dignity = true;

    public Person(){
        System.out.println("just to make sure this is called");
        name = "na";
        age = 0;
    }

    //actions: methods (member function in C++)
    public void sayHello(){
        System.out.println("Hello buddies!");
    }

    public void introduceOneself(){
        System.out.println("My name is " + name + ", age is " + age);
    }
}
