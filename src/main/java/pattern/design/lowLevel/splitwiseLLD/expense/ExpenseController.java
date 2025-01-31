package pattern.design.lowLevel.splitwiseLLD.expense;

import pattern.design.lowLevel.splitwiseLLD.BalanceSheetController;
import pattern.design.lowLevel.splitwiseLLD.user.User;
import pattern.design.lowLevel.splitwiseLLD.expense.split.ExpenseSplit;
import pattern.design.lowLevel.splitwiseLLD.expense.split.Split;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;

    public ExpenseController() {
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, splitType, splitDetails);

        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;

    }
}