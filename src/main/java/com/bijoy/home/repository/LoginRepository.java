package com.bijoy.home.repository;

import com.bijoy.home.entity.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<LoginUser, Integer> {
}
