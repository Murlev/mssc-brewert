package murlev.springframework.msscbrewery.web.services;

import murlev.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID beerId);
}
