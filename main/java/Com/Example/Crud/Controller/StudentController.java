package Com.Example.Crud.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import Com.Example.Crud.Model.Student;
import Com.Example.Crud.Service.ServiceInter;
import sun.print.resources.serviceui;


@RestController
public class StudentController {
	
	
	@Autowired
	private ServiceInter serviceinter ;
	
	
	@PostMapping(value="/reg")
	public String  addStudentData(@RequestBody Student student) {
		
		System.out.println("Check Student Data"+student);
		
		serviceinter.addStudentData(student);
		
		return "Add Student All Data Successfully";
		
	}
	
	
	@GetMapping(value="/getall")
	public List<Student> getAllStudentData() {
		
		System.out.println("Student All Data Get");
		
		
		return serviceinter.getAllStudent();
		
	}
	
	
	@GetMapping(value="/get/{id}")
	public Student getSingleData(@PathVariable int id) {
		
		System.out.println("Get Id Student Data Successfully :- "+id);
		
		System.out.println("Get Student Data In Single Id");

		
	Student student =	serviceinter.getStudentSingleData(id);
	
	
		
		return student;
		
	}
	
	
	@PostMapping(value="/insertAllData")
	public String insertAllStudentData(@RequestBody List<Student> list) {
		
		System.out.println("Insert All Student Data :-" +list);
		
		serviceinter.insertAllDataSaveDataBase(list);
		
		return"Check Insert All Student Data";
		
		
	}
	
	
	@PutMapping(value="/updateSingleData")
	public String updateStudentSingleData(@RequestBody Student student) {
		
		System.out.println("Update Student Single Data :-" +student);
	
		serviceinter.updateStudentSingleData(student);
		
		return"Check Update Student Data ";
		
	}
	
	
	@DeleteMapping(value="/deleteById/{id}")
	public String deleteSingleStudentDetailData(@PathVariable("id") int stuid) {
		
		System.out.println("Delete Single Student  Detail Data By ID :- "+stuid);
		
		
		serviceinter.deleteSingleStudentDetailData(stuid);
		
		return"Delete Single Student  Detail Data Successfully";
		
	}
	
	@DeleteMapping(value="/deleteAll")
	public String deleteAllStudentData(){
	
		System.out.println("Delete Student All Detail In Data Table : -");
		
	
		serviceinter.deleteAllStduentData();
		
		return"Delete Student All Detail In Data Table Successfully";

	}
	
	
	
	@DeleteMapping(value="/blukdelete/{ids}")
	public String blukdeleteStudentDetailIds(@PathVariable List<Integer> ids){
		
		serviceinter.blukdeleteStudentDetailIds(ids);
		
		
		return"Delete Multiple Student Data Successfully";
	}
	
	
	@GetMapping(value="/count")
	public long countStudentId() {
		
		
		 
		 return serviceinter.countStudentId();

		
	}
	
	
	@GetMapping(value="/exists/{id}")
	public boolean existsStudentId(@PathVariable int id) {
		
		
		System.out.println("Given Any Exists Student Id "+id);
		
		return serviceinter.givenExistsStudentId(id);
		
	}
	
	
	
	
}
