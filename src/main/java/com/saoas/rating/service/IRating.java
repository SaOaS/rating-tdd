package com.saoas.rating.service;

import com.saoas.rating.dto.RateDTO;
import com.saoas.rating.model.Event;

import java.util.List;

/**
 * Created by s.ahmedouali on 17/03/2015.
 */
public interface IRating {

    /**
     * Allow people to add comments
     *
     * @param dto
     */
    Event addComment(RateDTO dto);

    /**
     * Allow people to rate an event
     *
     * @param dto
     */
    Event addScore(RateDTO dto);

    /**
     * Provide comments about their rating
     *
     * @param dto
     * @return
     */
    List<String> getComments(RateDTO dto);

    /**
     * see how others rate events
     *
     * @param dto
     * @return
     */
    List<Integer> getScores(RateDTO dto);

}
