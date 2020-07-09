/**
 * 
 */
package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.PetTypeService;

/**
 * @author uriel
 *
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

	@Override
	public PetType findbyId(Long id) {
		return super.findById(id);
	}

	@Override
	public PetType save(PetType model) {
		return super.save(model);
	}

	@Override
	public Set<PetType> findAll() {
		return super.findAll();
	}

	@Override
	public void delete(PetType model) {
		// TODO Auto-generated method stub
		super.delete(model);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
