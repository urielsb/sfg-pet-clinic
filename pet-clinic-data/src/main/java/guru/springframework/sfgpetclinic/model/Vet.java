package guru.springframework.sfgpetclinic.model;

import java.util.Set;

/**
 * Created by jt on 7/13/18.
 */
public class Vet extends Person {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 5719734850419870704L;
	
	private Set<Speciality> specialities;

	public Set<Speciality> getSpecialities() {
		return specialities;
	}

	public void setSpecialities(Set<Speciality> specialities) {
		this.specialities = specialities;
	}
}
