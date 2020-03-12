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

import mx.edu.utng.crud.entity.Oficina;
import mx.edu.utng.crud.service.OficinaService;

@RestController
@RequestMapping("/Oficina")
public class OficinaController {
	private OficinaService service;

	public OficinaController(OficinaService service) {
		super();
		this.service = service;
	}
	@GetMapping
	private ResponseEntity<List<Oficina>> listar(){
		return ResponseEntity.ok(service.findAll());
	}
	@PostMapping
	public ResponseEntity<Oficina> create(@Valid @RequestBody Oficina ofi){
		return ResponseEntity.ok(service.save(ofi));
	}
	@GetMapping("/={id}")
	public ResponseEntity<Oficina> findById(@PathVariable Long id){
		Optional<Oficina> bi = service.findById(id);
		if(!bi.isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		return ResponseEntity.ok(bi.get());
	}
	@DeleteMapping("/={id}")
	public ResponseEntity<Oficina> delete(@PathVariable Long id){
		if(!service.findById(id).isPresent()) {
			return ResponseEntity.badRequest().build();
		}
		service.deleteById(id);
		return ResponseEntity.badRequest().build();
	}
}
