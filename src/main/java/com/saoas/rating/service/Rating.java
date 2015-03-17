package com.saoas.rating.service;

import com.saoas.rating.dao.RatingDAO;
import com.saoas.rating.dto.RateDTO;
import com.saoas.rating.model.Event;
import com.saoas.rating.model.Rate;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by s.ahmedouali on 17/03/2015.
 */
@Service
public class Rating implements IRating {

    Logger LOG = Logger.getLogger(Rating.class);
    @Autowired
    private RatingDAO dao;

    /**
     * Allow people to add comments
     *
     * @param dto
     */
    @Override
    public Event addComment(RateDTO dto) {
        return null;
    }

    /**
     * Allow people to rate an event
     *
     * @param dto
     */
    @Override
    public Event addScore(RateDTO dto) {
        Event event = dao.getByName(dto.geteName());
        LOG.debug(event);
        Rate rate = new Rate(dto.getScore());
        event.getRates().add(rate);
        return event;
    }

    /**
     * Provide comments about their rating
     *
     * @param dto
     * @return
     */
    @Override
    public List<String> getComments(RateDTO dto) {
        return null;
    }

    /**
     * see how others rate events
     *
     * @param dto
     * @return
     */
    @Override
    public List<Integer> getScores(RateDTO dto) {
        return null;
    }
}
