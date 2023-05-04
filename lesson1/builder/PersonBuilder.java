package lesson1.builder;

public class PersonBuilder {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;


    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public PersonBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }
    public PersonBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }
    public PersonBuilder middleName(String middleName){
        this.middleName = middleName;
        return this;
    }
    public PersonBuilder country(String country){
        this.country = country;
        return this;
    }

    public Person build() {
        return new Person(this.firstName, this.lastName, this.middleName, this.country );
    }


}
