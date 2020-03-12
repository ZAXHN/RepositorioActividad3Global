package mx.edu.utng.crud.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import mx.edu.utng.crud.entity.Profesor;
import mx.edu.utng.crud.service.ProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorControler {
	private ProfesorService service;

	public ProfesorControler(ProfesorService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	private ResponseEntity<List<Profesor>> listar(){
		return ResponseEntity.ok(service.findAll());
	}
	@PostMapping
	public ResponseEntity<Profesor> create(@Valid @RequestBody Profesor pro){
		return ResponseEntity.ok(service.save(pro));
	}
	@GetMapping("/={id}")
	public ResponseEntity<Profesor> findById(@PathVariable Long id){
		Optional<Profesor> bi = service.findById(id);
		if(!bi.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(bi.get());
	}
	@DeleteMapping("/={id}")
	public ResponseEntity<Profesor> delete(@PathVariable Long id){
		if(!service.findById(id).isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		service.deleteById(id);
		return ResponseEntity.badRequest().build();
	}
	
}
