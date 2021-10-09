package Testastraaviv.employecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Testastraaviv.employecrud.entities.titles_entities;

@Repository
public interface titlesRepository extends CrudRepository<titles_entities, Long> {

}
