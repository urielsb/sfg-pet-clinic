package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CommonDataServiceOperations<Owner> {

	Owner findByLastName(String lastName); 
}
