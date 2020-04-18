package guru.springframework.sfgpetclinic.services;

import java.util.Set;

public interface CommonDataServiceOperations<T> {

	T findbyId(Long id);
	
	T save(T model);
	
	Set<T> findAll();
}
