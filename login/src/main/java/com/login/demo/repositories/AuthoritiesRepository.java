package com.login.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.demo.entities.Authorities;

public interface AuthoritiesRepository extends JpaRepository<Authorities, String> {

}
