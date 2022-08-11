package DSA;

import java.util.List;

public class BillDivision {

    public String bonAppetite(List<Integer> bill, int k, int b) {
        bill.remove(k);
        int splitedBill = bill.stream().mapToInt(x -> x).sum() / 2;
        int charged = b - splitedBill;
        if (charged != 0) {
            return charged + "";
        }
        else {
            return "Bon Appetit";
        }
    }
}
