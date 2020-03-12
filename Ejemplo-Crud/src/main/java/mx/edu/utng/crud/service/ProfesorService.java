package mx.edu.utng.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import mx.edu.utng.crud.entity.Profesor;
import mx.edu.utng.crud.repository.IProfesorRepository;

@Service
public class ProfesorService {
	private IProfesorRepository service;

		public ProfesorService(IProfesorRepository service) {
		super();
		this.service = service;
	}


		public Profesor save(Profesor p) {
			return service.save(p);
		}
		
		
		public void deleteById(Long id) {
			service.deleteById(id);
		}
		
		
		public List<Profesor> findAll(){
			return service.findAll();
		}
		
		
		public Optional<Profesor> findById(Long id){
			return service.findById(id);
		}
}
