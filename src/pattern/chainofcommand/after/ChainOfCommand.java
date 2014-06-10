package pattern.chainofcommand.after;

import java.math.BigDecimal;

import pattern.chainofcommand.approvalCommon.ApprovalResponse;
import pattern.chainofcommand.approvalCommon.ConsoleInput;
import pattern.chainofcommand.approvalCommon.Employee;
import pattern.chainofcommand.approvalCommon.ExpenseReport;
import pattern.chainofcommand.approvalCommon.IExpenseReport;

public class ChainOfCommand {

    public static void main( String[ ] args ) {
	ExpenseHandler william = new ExpenseHandler( new Employee( "William Worker", BigDecimal.ZERO ) );
        ExpenseHandler mary    = new ExpenseHandler( new Employee( "Mary Manager",    new BigDecimal( 1000 ) ) );
        ExpenseHandler victor  = new ExpenseHandler( new Employee( "Victor Vicepres", new BigDecimal( 5000 ) ) );
        ExpenseHandler paula   = new ExpenseHandler( new Employee( "Paula President", new BigDecimal( 20000 ) ) );

        william.registerNext( mary );
        mary.registerNext( victor );
        victor.registerNext( paula );

        BigDecimal[] expenseReportAmount = new BigDecimal[ 1 ];
        
        if ( ConsoleInput.tryReadDecimal( "Expense report amount:", expenseReportAmount ) ) {
            IExpenseReport expense = new ExpenseReport( expenseReportAmount[ 0 ] );

            ApprovalResponse response = william.approve( expense );

            System.out.println( "The request was " + response );
        }
    }

}
