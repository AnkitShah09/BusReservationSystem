package com.busreservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusReservationRepository extends JpaRepository<Integer, Long> {}
