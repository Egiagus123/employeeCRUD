package Testastraaviv.employecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Testastraaviv.employecrud.entities.employees_entities;

@Repository
public interface employeesRepository extends CrudRepository<employees_entities, Long> {

}
