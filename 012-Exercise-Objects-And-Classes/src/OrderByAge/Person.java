package OrderByAge;

public class Person {

    private String name;
    private int id;
    private int age;

    public Person(String firstName, int id, int age) {
        this.name = firstName;
        this.id = id;
        this.age = age;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %d is %d years old.", name, id, age);
    }

}
