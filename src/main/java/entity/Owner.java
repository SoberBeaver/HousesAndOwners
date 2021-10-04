package entity;

public class Owner {
    private final String name;
    private final String surname;
    private int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getOwnerInfo() {
        return String.format("%s %s is %d years old.", this.name, this.surname, this.age);
    }


}
