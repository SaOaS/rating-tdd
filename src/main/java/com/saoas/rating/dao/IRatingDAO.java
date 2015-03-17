package com.saoas.rating.dao;

import com.saoas.rating.model.Event;

/**
 * Created by s.ahmedouali on 17/03/2015.
 */
public interface IRatingDAO {

    Event getByName(String name);

    void save(Event e);

    void update(Event e);


}
