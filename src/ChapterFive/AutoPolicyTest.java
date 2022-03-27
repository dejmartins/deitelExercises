package ChapterFive;

import java.sql.SQLOutput;

public class AutoPolicyTest {
    public static void main(String[] args) {

        AutoPolicy policy = new AutoPolicy(220858127, "Kia Cerato", "NY");
        AutoPolicy policy1 = new AutoPolicy(223344566, "Toyota Camry", "SA");

        policyInNoFaultState(policy);
        policyInNoFaultState(policy1);
    }

    public static void policyInNoFaultState(AutoPolicy policy){
        System.out.println("The auto policy");
        System.out.printf("Account: %d; Make & Model: %s; State: %s%n", policy.getAccountNumber(),
                policy.getMakeAndModel(), policy.getState());
        System.out.printf("State %s %s no-fault state %n%n", policy.getState(), policy.isNoFaultState() ? "is a" : "is not a");
    }


}
