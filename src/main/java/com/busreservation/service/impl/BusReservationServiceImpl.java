package com.busreservation.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.busreservation.service.BusReservationService;

@Service
public class BusReservationServiceImpl implements BusReservationService {

  @Override
  public List<String> getAllStops() {
    return Stream.of("Ahmedabad", "Nadiad", "Vadodara", "Bharuch", "Surat", "Mumbai")
        .collect(Collectors.toList());
  }
}
