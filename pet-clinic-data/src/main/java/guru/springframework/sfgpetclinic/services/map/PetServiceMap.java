package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.PetService;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> 
			implements PetService {

	@Override
	public Pet findbyId(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet model) {
		return super.save(model.getId(), model);
	}

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Pet model) {
		super.delete(model);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
