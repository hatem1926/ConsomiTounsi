package ConsomiTounsi.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name ="delivery")
public class delivery {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="iddelivery")
	private int iddelivery;
	
	@Column(name="deliverydescription")
	private String deliverydescription;
	
	@Column(name="deliveryprice")
	private float deliveryprice;
	
	@Column(name="deliverydate")
	private Date deliverydate;
	
	@Column(name="deliveryaddress")
	private String deliveryaddress;
}
