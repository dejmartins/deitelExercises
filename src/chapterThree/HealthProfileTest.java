package chapterThree;

public class HealthProfileTest {
    public static void main(String[] args){


        HealthProfile newProfile = new HealthProfile("Jonathan", "Martins", "Male",
                "November", 23, 1999, 6.4, 100);

        System.out.printf("Welcome %s%s%n", newProfile.getLastName(), newProfile.getFirstName());
        System.out.println("Here are your details:");
        System.out.printf("Firstname: %s%n", newProfile.getFirstName());
        System.out.printf("Lastname: %s%n", newProfile.getLastName());
        System.out.printf("Gender: %s%n", newProfile.getGender());
        System.out.printf("Date of birth: %s %d, %d%n", newProfile.getMonth(), newProfile.getDay(), newProfile.getYear());
        System.out.printf("Height: %.1f%n", newProfile.getHeight());
        System.out.printf("Weight: %.1f%n", newProfile.getWeight());
        System.out.printf("Age: %d%n", newProfile.usersAge());
        System.out.printf("BMI: %.3f%n", newProfile.bodyMaxIndex());
        System.out.printf("Maximum heart rate: %.2f%n", newProfile.maximumHeartRate());
        System.out.printf("Target heart rate: %s%n%n", newProfile.targetHeartRate());


        System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal: between 18.5 and 24.9");
        System.out.println ("Overweight: between 25 and 29.9");
        System.out.println ("Obese: 30 or greater");
    }
}
