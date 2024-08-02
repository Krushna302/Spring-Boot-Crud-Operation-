package Com.Example.Crud.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Com.Example.Crud.Model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
