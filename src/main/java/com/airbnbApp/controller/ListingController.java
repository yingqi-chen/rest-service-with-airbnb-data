package com.airbnbApp.controller;

import com.airbnbApp.domain.Listing;
import com.airbnbApp.repository.ListingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ListingController {

    @Autowired
    private ListingRepository repository;

    @GetMapping(value = "/listings")
    public Page<Listing> listings() {
        return repository.findAll(PageRequest.of(1, 3));
    }

    @GetMapping(value = "/listing-count")
    public String listingCount() {
        Long count = repository.count();
        return "There are total " + count + " listings";
    }

    @RequestMapping(value = "/listing/{id}", method = RequestMethod.GET)
    public Optional<Listing> findListingById(@PathVariable(value = "id") String id) {
        return repository.findById(id);
    }

}
