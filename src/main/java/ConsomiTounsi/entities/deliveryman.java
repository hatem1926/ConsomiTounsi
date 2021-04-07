package ConsomiTounsi.entities;

import javax.persistence.*;

@Entity
@Table(name ="deliveryman")
public class deliveryman {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iddeliveryman")
	private int iddeliveryman;
	
	@Column(name="firstnameD")
	private String firstname;
	
	@Column(name="lastnameD")
	private String lastname;
	
	@Column(name="passwordD")
	private String passwordD;
	
	@Column(name="phonenumber")
	private String phonenumber;
	
	@Column(name="salary")
	private String salary;
	
	@Column(name="deliveriesnbr")
	private int deliveriesnbr;
}
