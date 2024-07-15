package br.dev.andregurgel.loansapi.api.loan;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class CustomerLoan {
    private String name;
    private Set<Loan> loans = new HashSet<>();
}
