package com.sawpnapurantravels.SawpnaPuranTravels.service.interfc;

import com.sawpnapurantravels.SawpnaPuranTravels.dto.Response;
import com.sawpnapurantravels.SawpnaPuranTravels.entity.Booking;

public interface IBookingService {
    Response saveBooking(Long roomId, Long userId, Booking bookingRequest);

    Response findBookingByConfirmationCode(String confirmationCode);

    Response getAllBookings();

    Response cancelBooking(Long bookingId);
}
