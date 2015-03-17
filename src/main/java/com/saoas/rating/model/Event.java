package com.saoas.rating.model;

import org.apache.commons.collections.CollectionUtils;

import java.util.List;

/**
 * Created by s.ahmedouali on 13/03/2015.
 */
public class Event {

    private String name;
    private String description;
    private List<Rate> rates;
    private int averageRating;

    public Event(String name) {
        this.name = name;
    }

    public Event(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public double getAverageRating() {
        Integer avg = 0;
        if (!CollectionUtils.isEmpty(rates)) {
            for (Rate rate : rates) {
                avg += rate.getScore() / rates.size();
            }
            return avg.doubleValue();
        }
        return avg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
