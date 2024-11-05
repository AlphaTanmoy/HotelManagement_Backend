package com.sawpnapurantravels.SawpnaPuranTravels.repo;

import com.sawpnapurantravels.SawpnaPuranTravels.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

}
