package pattern.chainofcommand.after;

import pattern.chainofcommand.approvalCommon.ApprovalResponse;
import pattern.chainofcommand.approvalCommon.IExpenseReport;

public interface IExpenseHandler {
    ApprovalResponse approve( IExpenseReport expenseReport );
    void registerNext( IExpenseHandler next );
}
