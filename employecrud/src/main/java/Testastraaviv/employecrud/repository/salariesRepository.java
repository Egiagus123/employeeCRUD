package Testastraaviv.employecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Testastraaviv.employecrud.entities.salaries_entities;

@Repository
public interface salariesRepository extends CrudRepository<salaries_entities, Long> {

}
