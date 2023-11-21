package murlev.springframework.msscbrewery.web.services;

import murlev.springframework.msscbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBear(UUID beerId, BeerDto beerDto);

    void deleteById(UUID beerId);
}
