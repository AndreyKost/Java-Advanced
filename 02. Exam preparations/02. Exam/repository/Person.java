package repository;

public class Person {
    private String name;
    private int age;
    private String birthDate;

    public int getAge() {
        return age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public Person(String name, int age, String birthDay) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDay;
    }

    @Override
    public String toString(){
        return String.format("Name: %s%nAge: %d%nBirthday: %s%n"
        ,getName()
        ,getAge()
        ,getBirthDate());
    }


}
