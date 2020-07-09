package guru.springframework.sfgpetclinic.model;

public class Speciality extends BaseEntity {

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 5332413550472646168L;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
