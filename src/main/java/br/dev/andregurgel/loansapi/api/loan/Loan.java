package br.dev.andregurgel.loansapi.api.loan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Setter;

@Setter
public class Loan {
    private String type;

    @JsonProperty("interest_rate")
    private Integer interestRate;
}
