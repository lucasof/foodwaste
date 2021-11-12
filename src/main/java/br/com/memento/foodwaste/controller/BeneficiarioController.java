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

import br.com.memento.foodwaste.model.Beneficiario;
import br.com.memento.foodwaste.repository.BeneficiarioRepository;

@Controller
public class BeneficiarioController {
	@Autowired
	private BeneficiarioRepository repository;
	
	@RequestMapping("/beneficiario/new")
	public String create(Beneficiario beneficiario) {
		return "beneficiario-form";
	}
	
	@GetMapping("/beneficiario")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("beneficiarios");
		List<Beneficiario> beneficiarios = repository.findAll();
		modelView.addObject("beneficiarios", beneficiarios);
		return modelView;
	}
	
	@PostMapping("/beneficiario")
	public String save(@Valid Beneficiario beneficiario, BindingResult result) {
		if(result.hasErrors()) {
			return "beneficiario-form";
		}
		
		repository.save(beneficiario);

		
		return "restaurantes";
	}
}
