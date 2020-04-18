package guru.springframework.sfgpetclinic.model;

/**
 * Created by jt on 7/13/18.
 */
public class PetType extends BaseEntity {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3916053990363115879L;
	private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
