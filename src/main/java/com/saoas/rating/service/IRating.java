package com.saoas.rating.service;

import com.saoas.rating.dto.RateDTO;

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
    void addComment(RateDTO dto);

    /**
     * Allow people to rate an event
     *
     * @param dto
     */
    void addScore(RateDTO dto);

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
