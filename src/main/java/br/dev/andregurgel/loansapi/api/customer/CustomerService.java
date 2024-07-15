package br.dev.andregurgel.loansapi.api.customer;

import br.dev.andregurgel.loansapi.api.config.exception.NoLoansAvaliableException;
import br.dev.andregurgel.loansapi.api.customer.aggregated.StateEnum;
import br.dev.andregurgel.loansapi.api.loan.CustomerLoan;
import br.dev.andregurgel.loansapi.api.loan.Loan;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public CustomerLoan customerLoans(Customer customer) {
        CustomerLoan customerLoan = new CustomerLoan();
        customerLoan.setName(customer.getName());

        if ((customer.getIncome() <= 3000) || ((customer.getIncome() >= 3000 && customer.getIncome() <= 5000) && (customer.getAge() < 30) && (customer.getLocation().equals(StateEnum.SP)))) {
            customerLoan.getLoans().add(getPersonalLoan());
        }

        if ((customer.getIncome() <= 3000) || ((customer.getIncome() >= 3000 && customer.getIncome() <= 5000) && (customer.getAge() < 30) && (customer.getLocation().equals(StateEnum.SP)))) {
            customerLoan.getLoans().add(getGuaranteedLoan());
        }

        if (customer.getIncome() >= 5000) {
            customerLoan.getLoans().add(getConsignmentLoan());
        }

        if (customerLoan.getLoans().isEmpty()) {
            throw new NoLoansAvaliableException();
        }

        return customerLoan;
    }

    private Loan getPersonalLoan() {
        Loan personalLoan = new Loan();
        personalLoan.setType("PERSONAL");
        personalLoan.setInterestRate(4);
        return personalLoan;
    }

    private Loan getGuaranteedLoan() {
        Loan guaranteedLoan = new Loan();
        guaranteedLoan.setType("GUARANTEED");
        guaranteedLoan.setInterestRate(3);
        return guaranteedLoan;
    }

    private Loan getConsignmentLoan() {
        Loan consignmentLoan = new Loan();
        consignmentLoan.setType("CONSIGNMENT");
        consignmentLoan.setInterestRate(2);
        return consignmentLoan;
    }
}
