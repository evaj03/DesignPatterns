package pattern.chainofcommand.after;

import pattern.chainofcommand.approvalCommon.ApprovalResponse;
import pattern.chainofcommand.approvalCommon.IExpenseApprover;
import pattern.chainofcommand.approvalCommon.IExpenseReport;

public class ExpenseHandler implements IExpenseHandler {
    private final IExpenseApprover approver;
    private IExpenseHandler        next;
    
    public ExpenseHandler( IExpenseApprover expenseApprover ) {
        approver = expenseApprover;
        next     = EndOfChainExpenseHandler.instance( );
    }

    @Override
    public ApprovalResponse approve( IExpenseReport expenseReport )
    {
        ApprovalResponse response = approver.approveExpense( expenseReport );

        if ( response == ApprovalResponse.BeyondApprovalLimit ) {
            return next.approve( expenseReport );
        }

        return response;
    }

    @Override
    public void registerNext( IExpenseHandler next ) {
        this.next = next;
    }
}
