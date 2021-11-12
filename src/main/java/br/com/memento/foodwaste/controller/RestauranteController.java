package br.com.memento.foodwaste.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.memento.foodwaste.model.Restaurante;
import br.com.memento.foodwaste.repository.RestauranteRepository;

@Controller
public class RestauranteController {

	@Autowired
	private RestauranteRepository repository;
	
	@RequestMapping("/restaurante/new")
	public String create(Restaurante restaurante) {
		return "restaurante-form";
	}
	
	@GetMapping("/restaurante")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("restaurantes");
		List<Restaurante> restaurantes = repository.findAll();
		modelView.addObject("restaurantes", restaurantes);
		return modelView;
	}
	
	@PostMapping("/restaurante")
	public String save(@Valid Restaurante restaurante, BindingResult result) {
		if(result.hasErrors()) {
			return "restaurante-form";
		}
		
		repository.save(restaurante);

		
		return "restaurantes";
	}
}
