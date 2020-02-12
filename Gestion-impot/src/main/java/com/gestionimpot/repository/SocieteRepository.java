package com.gestionimpot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionimpot.bean.Societe;

@Repository
public interface SocieteRepository extends JpaRepository<Societe, Long>{

}
