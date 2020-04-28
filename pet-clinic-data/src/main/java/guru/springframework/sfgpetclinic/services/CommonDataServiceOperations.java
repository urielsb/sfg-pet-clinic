package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CommonDataServiceOperations<T, ID> {

	T findbyId(ID id);
	
	T save(T model);
	
	Set<T> findAll();
	
	void delete(T model);
	
	void deleteById(ID id);
}
