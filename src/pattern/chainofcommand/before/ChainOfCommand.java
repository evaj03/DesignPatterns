package pattern.chainofcommand.before;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import pattern.chainofcommand.approvalCommon.ApprovalResponse;
import pattern.chainofcommand.approvalCommon.ConsoleInput;
import pattern.chainofcommand.approvalCommon.Employee;
import pattern.chainofcommand.approvalCommon.ExpenseReport;

public class ChainOfCommand {

    public static void main( String[ ] args ) {
	List< Employee > managers = new ArrayList< Employee >( );
	
	managers.add( new Employee( "William Worker", BigDecimal.ZERO ) );
	managers.add(new Employee( "Mary Manager",    new BigDecimal( 1000 ) ) );
	managers.add(new Employee( "Victor Vicepres", new BigDecimal( 5000 ) ) );
	managers.add(new Employee( "Paula President", new BigDecimal( 20000 ) ) );

	BigDecimal[] expenseReportAmount = new BigDecimal[ 1 ];
	
        while ( ConsoleInput.tryReadDecimal( "Expense report amount:", expenseReportAmount ) ) {
            ExpenseReport expense = new ExpenseReport( expenseReportAmount[ 0 ] );

            boolean expenseProcessed = false;

            for ( Employee approver : managers ) {
                ApprovalResponse response = approver.approveExpense( expense );

                if ( response != ApprovalResponse.BeyondApprovalLimit ) {
                    System.out.println( "The request was " + response );
                    expenseProcessed = true;
                    break;
                }
            }

            if ( ! expenseProcessed ) {
                System.out.println( "No one was able to approve your expense." );
            }
        }
    }
}