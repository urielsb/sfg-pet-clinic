package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> 
			implements OwnerService {

	@Override
	public Owner findbyId(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner model) {
		return super.save(model.getId(), model);
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(Owner model) {
		super.delete(model);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return this.findAll()
				.stream().filter(e -> e.getLastName().equalsIgnoreCase(lastName))
				.findFirst()
				.orElse(null);
	}

}
