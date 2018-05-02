package pl.redblue.shelter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
	
	@Autowired
	AnimalRepository animalRepository;
	
	public List<Animal> allAnimals() {
		List<Animal>animals = new ArrayList<>();
		animalRepository.findAll().forEach(animals :: add);
		return animals;
	}
	
	public Optional<Animal> oneAnimal(Integer id) {
		return animalRepository.findById(id);
	}
	
	public void addNewAnimal(Animal animal) {
		animalRepository.save(animal);
	}

}
