package it.uniroma3.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Centro {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String nome;

	@Column(nullable=false)
	private String indirizzo;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private Integer telefono;
	
	@Column(nullable=false)	
	private Integer capienzamax;
	
	@OneToOne	//ok
	private Responsabile responsabile;
	
	@OneToMany(mappedBy="centro")	//ok
	private List<Attivita> attivita;
	
}
