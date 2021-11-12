package br.com.memento.foodwaste.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name="T_MEM_BENEFICIARIO")
@SequenceGenerator(sequenceName = "SQ_BENEFICIARIO", name="beneficiario", allocationSize = 1)
public class Beneficiario {
	
	@Id
	@GeneratedValue(generator = "beneficiario", strategy = GenerationType.SEQUENCE)
	@Column(name="cd_beneficiario")
	private int id;
	
	@Column(name="nm_beneficiario", nullable = false, length = 120)
	@NotBlank(message = "O nome é obrigatório")
	private String nome;
	
	@Column(name="nr_cartao", nullable = false, length = 120)
	@NotBlank(message = "O cartão é obrigatório")
	private String cartaoIdentificacao;
}
