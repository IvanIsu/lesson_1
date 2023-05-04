package lesson1.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(String firstName, String lastName, String middleName, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.country = country;
    }

    @Override
    public String toString() {
        return "PersonBuilder{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                '}';
    }


    public static PersonBuilder builder() {
        return new PersonBuilder();
    }


    public static class PersonBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
//        private String address;
//        private String phone;
//        private int age;
//        private String gender;

        PersonBuilder() {
        }

        public PersonBuilder firstName(final String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(final String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder middleName(final String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PersonBuilder country(final String country) {
            this.country = country;
            return this;
        }

        public Person build() {
            return new Person(this.firstName, this.lastName, this.middleName, this.country);
        }




        //    1. Создать builder для класса Person со следующими полями: String firstName, String lastName,
//    String middleName, String country, String address, String phone, int age, String gender.
}

}
