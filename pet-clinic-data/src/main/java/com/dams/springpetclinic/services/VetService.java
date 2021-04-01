package com.dams.springpetclinic.services;

import com.dams.springpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findByLastName(String lastName);
    Vet findById(Long id);
    Vet save(Vet Vet);
    Set<Vet> findAll();
}
