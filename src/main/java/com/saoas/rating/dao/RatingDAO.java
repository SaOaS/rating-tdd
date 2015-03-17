package com.saoas.rating.dao;

import com.saoas.rating.model.Event;
import org.springframework.stereotype.Component;

/**
 * Created by s.ahmedouali on 17/03/2015.
 */
@Component
public class RatingDAO implements IRatingDAO {
    @Override
    public Event getByName(String name) {
        return null;
    }

    @Override
    public void save(Event e) {

    }

    @Override
    public void update(Event e) {

    }
}
