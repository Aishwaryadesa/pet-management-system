package com.example.petmanagementsystemm.service;

import com.example.petmanagementsystem.model.Pet;
import com.example.petmanagementsystem.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetServiceImpl implements PetService {

	    @Autowired
	    private PetRepository petRepository;

	    @Override
	    public List<Pet> getAllPets() {
	        return petRepository.findAll();
	    }

	    @Override
	    public Pet getPetById(Long id) {
	        return petRepository.findById(id).orElse(null);
	    }

	    @Override
	    public Pet savePet(Pet pet) {
	        return petRepository.save(pet);
	    }

	    @Override
	    public void deletePet(Long id) {
	        petRepository.deleteById(id);
	    }
	}


