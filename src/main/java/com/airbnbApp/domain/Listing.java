package com.airbnbApp.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document(collection = "listingsAndReviews")
public class Listing {

    @Id private String id;

    private String name;

    private String summary;

    private String description;

    @Field("minimum_nights")
    private String minimumNights;

    @Field("maximum_nights")
    private String maximumNights;

    private Integer bedrooms;

    private Integer beds;

    @Field("property_type")
    private String propertyType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Listing(String id, String name, String summary, String description, String minimumNights, String maximumNights, Integer bedrooms, Integer beds) {
        this.id=id;
        this.name = name;
        this.summary = summary;
        this.description = description;
        this.minimumNights = minimumNights;
        this.maximumNights = maximumNights;
        this.bedrooms = bedrooms;
        this.beds = beds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMinimumNights() {
        return minimumNights;
    }

    public void setMinimumNights(String minimumNights) {
        this.minimumNights = minimumNights;
    }

    public String getMaximumNights() {
        return maximumNights;
    }

    public void setMaximumNights(String maximumNights) {
        this.maximumNights = maximumNights;
    }

    public Integer getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        this.bedrooms = bedrooms;
    }

    public Integer getBeds() {
        return beds;
    }

    public void setBeds(Integer beds) {
        this.beds = beds;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }
}