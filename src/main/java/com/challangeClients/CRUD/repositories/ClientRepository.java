package com.challangeClients.CRUD.repositories;

import com.challangeClients.CRUD.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository  extends JpaRepository<Client, Long> {
}
