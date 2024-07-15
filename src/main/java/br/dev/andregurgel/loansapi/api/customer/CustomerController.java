package br.dev.andregurgel.loansapi.api.customer;

import br.dev.andregurgel.loansapi.api.loan.CustomerLoan;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<CustomerLoan> customerLoans(@Valid @RequestBody Customer customer) {
        return ResponseEntity.ok(this.customerService.customerLoans(customer));
    }
}
