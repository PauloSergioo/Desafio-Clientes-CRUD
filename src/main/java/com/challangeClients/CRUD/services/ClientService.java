package com.challangeClients.CRUD.services;

import com.challangeClients.CRUD.dto.ClientDTO;
import com.challangeClients.CRUD.entities.Client;
import com.challangeClients.CRUD.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).get();
        return new ClientDTO(client);
    }
}
