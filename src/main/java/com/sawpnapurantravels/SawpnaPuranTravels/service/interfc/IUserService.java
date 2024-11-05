package com.sawpnapurantravels.SawpnaPuranTravels.service.interfc;

import com.sawpnapurantravels.SawpnaPuranTravels.dto.LoginRequest;
import com.sawpnapurantravels.SawpnaPuranTravels.dto.Response;
import com.sawpnapurantravels.SawpnaPuranTravels.entity.User;

public interface IUserService {
    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
