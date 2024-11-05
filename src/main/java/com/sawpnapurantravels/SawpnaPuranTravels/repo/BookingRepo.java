package com.sawpnapurantravels.SawpnaPuranTravels.repo;

import com.sawpnapurantravels.SawpnaPuranTravels.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookingRepo  extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}
