package Testastraaviv.employecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Testastraaviv.employecrud.entities.dept_empEntities;

@Repository
public interface dept_empRepository extends CrudRepository<dept_empEntities, Long> {

}
