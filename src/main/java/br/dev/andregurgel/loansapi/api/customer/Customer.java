package br.dev.andregurgel.loansapi.api.customer;

import br.dev.andregurgel.loansapi.api.customer.aggregated.StateEnum;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

import java.math.BigDecimal;

@Getter
@Setter
public class Customer {

    @NotNull
    private String name;

    @CPF
    private String cpf;

    @NotNull
    private Integer age;

    @NotNull
    private Double income;

    @NotNull
    private StateEnum location;
}
