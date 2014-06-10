package pattern.chainofcommand.approvalCommon;

import java.math.BigDecimal;

public class ExpenseReport implements IExpenseReport {
    private BigDecimal total;
    
    public ExpenseReport( BigDecimal total ) {
        this.setTotal( total );
    }

    @Override
    public BigDecimal getTotal( ) {
	return total;
    }


    @Override
    public void setTotal( BigDecimal total ) {
	this.total = total;
    }
}
