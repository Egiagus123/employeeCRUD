package Testastraaviv.employecrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Testastraaviv.employecrud.entities.dept_managerentities;

@Repository
public interface dept_managerRepository extends CrudRepository<dept_managerentities, Long> {

}
