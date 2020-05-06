package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.VetService;

@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> 
				implements VetService {

	@Override
	public Vet findbyId(Long id) {
		return super.findById(id);
	}

	@Override
	public Vet save(Vet model) {
		return super.save(model.getId(), model);
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Vet model) {
		super.delete(model);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
