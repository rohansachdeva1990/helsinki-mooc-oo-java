import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> loanMap = new HashMap<String, Double>();

    public PromissoryNote() {
    }

    public void setLoan(String toWhom, double value) {
        loanMap.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose) {
        if (loanMap.containsKey(whose)) {
            return loanMap.get(whose);
        }
        return 0;
    }


}
