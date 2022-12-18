package com.univlittoral.philippe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.univlittoral.philippe.dto.LivreDto;
import com.univlittoral.philippe.entity.LivreEntity;
import com.univlittoral.philippe.mapper.LivreMapper;
import com.univlittoral.philippe.service.LivreService;

@RestController //-> est utilisé pour marquer les classes en tant que contrôleur Spring.
@RequestMapping(value = "rest/bd/livres/") //=> l’URL d’accès à votre controller.
public class LivreController {

	@Autowired
	private LivreService service;
	
	@GetMapping
	public List<LivreDto> ListeLivres(){
		return LivreMapper.map(service.ListeLivres());
	}
	@RequestMapping(value="{id}")
	public LivreDto findOneBook(@PathVariable Long id) {
		return LivreMapper.map(service.findById(id));
	}
	@DeleteMapping(value="{id}")
	public void deleteLivre(@PathVariable Long id) {
		service.deleteById(id);
	}
	@PostMapping
	public void AddLivre(@RequestBody LivreEntity livre){
		service.AddLivre(livre);
	}
	@PutMapping(value="{id}")
	public LivreEntity updatelivre(@RequestBody LivreEntity livre,@PathVariable Long id){
		return service.updatelivre(livre, id);
	}
}

