package com.saoas.rating.service;

import com.saoas.rating.dao.RatingDAO;
import com.saoas.rating.dto.RateDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by s.ahmedouali on 17/03/2015.
 */
@Service
public class Rating implements IRating {

    @Autowired
    private RatingDAO dao;

    /**
     * Allow people to add comments
     *
     * @param dto
     */
    @Override
    public void addComment(RateDTO dto) {

    }

    /**
     * Allow people to rate an event
     *
     * @param dto
     */
    @Override
    public void addScore(RateDTO dto) {

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
