package com.mx.itexico.daac.controller;

import com.mx.itexico.daac.model.Reservation;
import com.mx.itexico.daac.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.ResponseEntity.status;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservations")
public class ReservationController {

    private ReservationService reservationService;

    @GetMapping
    public ResponseEntity<List<Reservation>> getReservation(){
        return status(HttpStatus.OK).body(reservationService.findAllReservations());
    }
}
