package pattern.chainofcommand.after;

import pattern.chainofcommand.approvalCommon.ApprovalResponse;
import pattern.chainofcommand.approvalCommon.IExpenseReport;

public class EndOfChainExpenseHandler implements IExpenseHandler {
    private static final EndOfChainExpenseHandler instance = new EndOfChainExpenseHandler( );
    
    private EndOfChainExpenseHandler( ) { }

    public static EndOfChainExpenseHandler instance( ) {
        return instance;
    }

    @Override
    public ApprovalResponse approve( IExpenseReport expenseReport ) { 
        return ApprovalResponse.Denied;
    }

    @Override
    public void registerNext( IExpenseHandler next ) {
        throw new UnsupportedOperationException( "End of chain handler must be the end of the chain!");
    }

    
}
