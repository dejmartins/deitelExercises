package ChapterEight.Employee;

public class EmployeeMain {
    public static void main(String[] args) {
        try{
            Date birth = new Date(1945, 11, 27);
            Date hire = new Date(2020, 12, 30);

            Employee employee = new Employee("Kehinde", "Okegun", birth, hire);

            System.out.println(employee + "\n");

            for (int date = 0; date < 10; date++){
                birth.nextDay();
                hire.nextDay();
            }
            System.out.println("10 DAYS ADDED:\n" + employee);
        } catch (IllegalArgumentException erm){
            System.out.printf("Error: %s%n", erm.getMessage());
        }
    }
}
