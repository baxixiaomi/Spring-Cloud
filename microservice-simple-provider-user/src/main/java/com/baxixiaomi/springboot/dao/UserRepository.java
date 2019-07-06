package com.baxixiaomi.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.baxixiaomi.springboot.pojo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
