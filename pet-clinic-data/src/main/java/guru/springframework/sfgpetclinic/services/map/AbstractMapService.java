package guru.springframework.sfgpetclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import guru.springframework.sfgpetclinic.model.BaseEntity;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();
	
	Set<T> findAll() {
		return new HashSet<>(map.values());
	}
	
	T findById(ID id) {
		return map.get(id);
	}
	
	T save(T value) {
		if(value != null) {
			if(value.getId() == null) {
				value.setId(getNextId());
			}
			
			map.put(value.getId(), value);
		} else {
			throw new IllegalArgumentException("Parameter is null");
		}
		return value;
	}
	
	void deleteById(ID id) {
		map.remove(id);
	}
	
	void delete(T object) {
		map.entrySet()
			.removeIf(es -> es.getValue().equals(object));
	}
	
	private Long getNextId() {
		if(map.keySet().isEmpty()) {
			return 1L;
		} else {
			return Collections.max(map.keySet()) + 1;
		}
	}
	
}
