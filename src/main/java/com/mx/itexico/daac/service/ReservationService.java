package com.mx.itexico.daac.service;

import com.mx.itexico.daac.model.Reservation;
import com.mx.itexico.daac.repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService {

    private ReservationRepository reservationRepository;

    @Transactional(readOnly = true)
    public List<Reservation> getReservations(){
       return reservationRepository.findAll();
    }


}
