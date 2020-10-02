package com.devsuperior.dsClient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsClient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

}
