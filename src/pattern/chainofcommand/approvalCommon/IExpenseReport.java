package pattern.chainofcommand.approvalCommon;

import java.math.BigDecimal;

public interface IExpenseReport {
    public BigDecimal getTotal( );
    public void setTotal( BigDecimal value );
}

