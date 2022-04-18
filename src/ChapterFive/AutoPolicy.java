package ChapterFive;

import java.util.Objects;

public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getMakeAndModel() {
        return makeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        this.makeAndModel = makeAndModel;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (Objects.equals(state, "CT") || Objects.equals(state, "MA") || Objects.equals(state, "NJ")
                || Objects.equals(state, "ME") || Objects.equals(state, "NH") || Objects.equals(state, "NY")
                || Objects.equals(state, "PA") || Objects.equals(state, "VT"))
        this.state = state;
        else System.out.println("Error!");
    }

    public boolean isNoFaultState(){
        boolean noFaultState = switch (getState()) {
            case "MA", "NJ", "NY", "PA" -> true;
            default -> false;
        };

        return  noFaultState;
    }
}