package Testastraaviv.employecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Testastraaviv.employecrud.entities.departments_entities;

@Repository
public interface departmentsRepository extends CrudRepository<departments_entities, Long>{

}
