package smart.entity.hanul;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @Entity
public class Customer {
	@Id private Integer id;
	private String name, gender, phone, email;
}
