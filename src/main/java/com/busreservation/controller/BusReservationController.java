package com.busreservation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.busreservation.service.BusReservationService;

@RestController
@RequestMapping(value = "/reservation")
public class BusReservationController {

  @Autowired BusReservationService busReservationService;

  @GetMapping("/stops")
  public List<String> getAllStops() {
    return busReservationService.getAllStops();
  }
}
