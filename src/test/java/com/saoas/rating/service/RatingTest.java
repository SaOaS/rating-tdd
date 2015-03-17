package com.saoas.rating.service;

import com.saoas.rating.config.Constants;
import com.saoas.rating.dao.RatingDAO;
import com.saoas.rating.model.Event;
import com.saoas.rating.model.Rate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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
        Rate[] rates = {new Rate(2, "Bla bla"), new Rate(3, "Bla bla bla")};
        event.setRates(Arrays.asList(rates));
        Mockito.when(dao.getByName(Constants.NAME)).thenReturn(event);
    }

    @Test
    public void test() {
        assertThat(0, is(0));
    }
}
