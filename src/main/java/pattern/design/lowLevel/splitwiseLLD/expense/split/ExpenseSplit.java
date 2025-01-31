package pattern.design.lowLevel.splitwiseLLD.expense.split;

import java.util.List;

public interface ExpenseSplit {

    public void validateSplitRequest(List<Split> splitList, double totalAmount);

}