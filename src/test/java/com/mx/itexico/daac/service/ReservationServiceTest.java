package com.mx.itexico.daac.service;

import com.mx.itexico.daac.repository.ReservationRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReservationServiceTest {

    @MockBean
    ReservationRepository reservationRepository;

    @Autowired
    ReservationService reservationService;


    @Test
    public void TestReservationSize(){
        assertEquals(5, reservationService.findAllReservations().size());
    }

    @Test
    public void TestMockRepositoryWhenCallReservationServiceAndCheckIsEmpty(){
        when(reservationRepository.findAll()).thenReturn(new ArrayList<>());
        assertTrue(reservationService.findAllReservations().isEmpty());
        verify(reservationRepository,times(1)).findAll();

    }


}
