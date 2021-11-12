package br.com.memento.foodwaste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name="T_MEM_RESTAURANTE")
@SequenceGenerator(sequenceName = "SQ_RESTAURANTE", name="restaurante", allocationSize = 1)
public class Restaurante {
	

	// Atributos
	@Id
	@GeneratedValue(generator = "restaurante", strategy = GenerationType.SEQUENCE)
	@Column(name="cd_restaurante")
	private int id;
	
	@Column(name="nm_restaurante", nullable = false, length = 120)
	@NotBlank(message = "O nome é obrigatório")
	private String nome;
	
	@Column(name="nr_cnpj", nullable = false, length = 120)
	@Size(min=10, message = "CNPJ deve 10 caracteres")
	private String cnpj;
	
	
}
