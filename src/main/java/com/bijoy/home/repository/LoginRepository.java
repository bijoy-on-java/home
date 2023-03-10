package com.bijoy.home.repository;

import com.bijoy.home.entity.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * My app login Repository interface. This interface will get called when a user logged in/ out of the
 * application.
 *
 * Date: Tuesday February 07, 2023 10:49 pm
 * Location: QLD, AU
 * Author: Bijoy Baral
 * email: bijoy.on.java@gmail.com
 * cell: +61 468 373 528
 */
@Repository
public interface LoginRepository extends JpaRepository<LoginUser, Integer>, CustomLoginRepository {
}
