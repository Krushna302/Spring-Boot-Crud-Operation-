package Com.Example.Crud.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Example.Crud.Model.Student;
import Com.Example.Crud.Repo.StudentRepository;

@Service
public class ServiceImplement implements ServiceInter{
	
	
	
	@Autowired
	private StudentRepository studentrepository;
	

	@Override
	public void  addStudentData(Student student) {
		
		System.out.println("Student Data Check Repository"+student);
		
		 studentrepository.save(student);
		


	}


	@Override
	public List<Student> getAllStudent() {
		
			
			return (List<Student>) studentrepository.findAll();

			

	}


	@Override
	public Student getStudentSingleData(int id) {
		
		
	Student student  =	studentrepository.findById(id).get();
		
		return student;
	}


	@Override
	public void insertAllDataSaveDataBase(List<Student> list) {
		
		System.out.println("ServiceImp Insert All Student Data");
		
		studentrepository.saveAll(list);
	
		System.out.println("Insert Data Save All Data Base Any..... Data Save In Data Base "
				+ "Than Using Service Interface And Sevice Implements And Repository  :-" +list);
		
	}


	@Override
	public void updateStudentSingleData(Student student) {
		
		System.out.println("Save Method In Update And Save Data ");
		
		studentrepository.save(student);
	}


	@Override
	public void deleteSingleStudentDetailData(int stuid) {
		
		
		System.out.println("Delete Single Student Detail Data Using In deleteById Method");
		
		studentrepository.deleteById(stuid);
		
		
		
	}


	@Override
	public void deleteAllStduentData() {

		System.out.println("Delete Student All Details In Data Table ");
		
		studentrepository.deleteAll();

				

	}


	@Override
	public void blukdeleteStudentDetailIds(List<Integer> ids) {
		
	Iterable<Student> studentIdsdelete = studentrepository.findAllById(ids);
		
	studentrepository.deleteAll(studentIdsdelete);
		
		
	}


	@Override
	public Long countStudentId() {
		
		
	return studentrepository.count();
		
	}


	@Override
	public boolean givenExistsStudentId(int id) {
		
		
		
		return studentrepository.existsById(id);
		
		
	}

	
	
	
	
	
	
	
}
