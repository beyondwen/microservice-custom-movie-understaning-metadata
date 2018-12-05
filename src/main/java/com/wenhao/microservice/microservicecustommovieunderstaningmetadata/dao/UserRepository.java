package com.wenhao.microservice.microservicecustommovieunderstaningmetadata.dao;

import com.wenhao.microservice.microservicecustommovieunderstaningmetadata.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
