package ChapterFive;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AutoPolicyTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        AutoPolicy policy = new AutoPolicy();
        System.out.print("Enter state: ");
        String state = input.nextLine();
        policy.setState(state);

        System.out.print("Enter model: ");
        String model = input.nextLine();
        policy.setMakeAndModel(model);

        System.out.println();
        policyInNoFaultState(policy);
    }

    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy");
        System.out.printf("Make & Model: %s; State: %s%n",
                policy.getMakeAndModel(), policy.getState());
        System.out.printf("State %s %s no-fault state %n%n", policy.getState(), policy.isNoFaultState() ? "is a" : "is not a");
    }


}
