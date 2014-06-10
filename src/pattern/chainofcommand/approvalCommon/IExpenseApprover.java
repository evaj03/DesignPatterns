package pattern.chainofcommand.approvalCommon;

public interface IExpenseApprover {
    ApprovalResponse approveExpense( IExpenseReport expenseReport );
}