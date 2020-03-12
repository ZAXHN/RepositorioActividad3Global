package mx.edu.utng.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import mx.edu.utng.crud.entity.Profesor;

public interface IProfesorRepository extends JpaRepository<Profesor, Long>{

}
