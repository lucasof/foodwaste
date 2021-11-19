package br.com.memento.foodwaste.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="T_MEM_REFEICAO")
@SequenceGenerator(sequenceName = "SQ_REFEICAO", name="refeicao", allocationSize = 1)
public class Refeicao {
	@Id
	@GeneratedValue(generator = "refeicao", strategy = GenerationType.SEQUENCE)
	@Column(name="cd_refeicao")
	private int id;
	
	@Column(name="nr_refeicoesDisponiveis")
	private int quatidadeDisponível;
	
	@Column(name="dt_retirada")
	private Date data;
	
	@ManyToOne
	private Beneficiario beneficiario;
	
	@ManyToOne
	private Restaurante restaurante;
}
