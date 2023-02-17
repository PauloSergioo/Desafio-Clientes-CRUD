package com.challangeClients.CRUD.dto;

import com.challangeClients.CRUD.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDate;

public class ClientDTO {

    private Long id;
    @PastOrPresent(message = "Campo requerido")
    private LocalDate birthDate;
    private Integer children;
    private String cpf;
    private Double income;
    @NotBlank(message = "Campo requerido")
    private String name;

    public ClientDTO(Long id, LocalDate birthDate, Integer children, String cpf, Double income, String name) {
        this.id = id;
        this.birthDate = birthDate;
        this.children = children;
        this.cpf = cpf;
        this.income = income;
        this.name = name;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
        cpf = entity.getCpf();
        income = entity.getIncome();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public String getName() {
        return name;
    }
}
