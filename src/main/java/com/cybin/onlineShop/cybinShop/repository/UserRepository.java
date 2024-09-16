package com.cybin.onlineShop.cybinShop.repository;

import com.cybin.onlineShop.cybinShop.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
