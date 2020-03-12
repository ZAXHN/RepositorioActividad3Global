package mx.edu.utng.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.edu.utng.crud.entity.Oficina;
import mx.edu.utng.crud.repository.IOficinaRepository;

@Service
public class OficinaService {
	private IOficinaRepository service;

	public OficinaService(IOficinaRepository service) {
		super();
		this.service = service;
	}
	public Oficina save(Oficina p) {
		return service.save(p);
	}
	
	
	public void deleteById(Long id) {
		service.deleteById(id);
	}
	
	
	public List<Oficina> findAll(){
		return service.findAll();
	}
	
	
	public Optional<Oficina> findById(Long id){
		return service.findById(id);
	}
}
