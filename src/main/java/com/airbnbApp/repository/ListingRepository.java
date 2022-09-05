package com.airbnbApp.repository;

import com.airbnbApp.domain.Listing;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ListingRepository extends MongoRepository<Listing, String> {
//     long count();
//     Optional<Listing> findListingsByName(String name);
     List<Listing> findByName(String name);

}
