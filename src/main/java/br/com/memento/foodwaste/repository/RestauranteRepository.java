package br.com.memento.foodwaste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.memento.foodwaste.model.Restaurante;

public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

}
