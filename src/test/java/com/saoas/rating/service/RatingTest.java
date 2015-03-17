package com.saoas.rating.service;

import com.saoas.rating.config.Constants;
import com.saoas.rating.dao.RatingDAO;
import com.saoas.rating.dto.RateDTO;
import com.saoas.rating.model.Event;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

/**
 * Created by s.ahmedouali on 17/03/2015.
 */
public class RatingTest {
    @InjectMocks
    private Rating service;

    @Mock
    private RatingDAO dao;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        Event event = new Event(Constants.NAME, Constants.DESC);
//        Rate[] rates = {new Rate(2, "Bla bla"), new Rate(3, "Bla bla bla")};
//        event.setRates(Arrays.asList(rates));
        when(dao.getByName(Constants.NAME)).thenReturn(event);
    }

    @Test
    public void test() {
        assertThat(0, is(0));
    }

    @Test
    public void testAverageRatingIsEqualZero() {
        //Given
        RateDTO dto = new RateDTO(Constants.NAME);
        //When
        Event e = dao.getByName(Constants.NAME);
        double actual = e.getAverageRating();
        //Then
        assertTrue(actual == 0);
    }

    @Test
    public void testAverageRatingIsEqualFive() {
        //Given
        RateDTO dto1 = new RateDTO(Constants.NAME, 5);
        //When
        Event e = service.addScore(dto1);
        double actual = e.getAverageRating();
        //Then
        assertTrue(actual == 5);
    }

    @Test
    public void testScoreIsNotNull() {
        //Given
        RateDTO dto1 = new RateDTO(Constants.NAME, 5);
        //When
        Event e = service.addScore(dto1);
        List actual = e.getRates();
        //Then
        assertTrue(actual.size() > 0);
    }
}
