package com.example.petmanagementsystemm.service;

import com.example.petmanagementsystem.model.Pet;

import java.util.List;

@Service
public interface PetService {
	    public List<Pet> getAllPets();
	    public Pet getPetById(Long id);
	    public Pet savePet(Pet pet);
	    public void deletePet(Long id);
	}
