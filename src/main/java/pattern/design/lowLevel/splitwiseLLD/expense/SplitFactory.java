package pattern.design.lowLevel.splitwiseLLD.expense;

import pattern.design.lowLevel.splitwiseLLD.expense.ExpenseSplitType;
import pattern.design.lowLevel.splitwiseLLD.expense.split.EqualExpenseSplit;
import pattern.design.lowLevel.splitwiseLLD.expense.split.ExpenseSplit;
import pattern.design.lowLevel.splitwiseLLD.expense.split.PercentageExpenseSplit;
import pattern.design.lowLevel.splitwiseLLD.expense.split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType splitType) {

        switch (splitType) {
            case EQUAL:
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }
    }


}