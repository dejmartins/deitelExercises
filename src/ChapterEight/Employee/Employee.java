package ChapterEight.Employee;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final Date birthDate;
    private final Date hireDate;

    public Employee(String firstName, String lastName, Date birthDate, Date hireDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

    public String toString(){
        return String.format("Name: %s %s%nBirthday: %s%nHire date:%s", firstName, lastName, birthDate, hireDate);
    }

}
