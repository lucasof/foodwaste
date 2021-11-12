package br.com.memento.foodwaste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.memento.foodwaste.model.Beneficiario;

public interface BeneficiarioRepository extends JpaRepository<Beneficiario, Long>{

}
