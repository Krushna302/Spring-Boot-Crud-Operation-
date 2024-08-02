package Com.Example.Crud.Service;

import java.util.List;

import Com.Example.Crud.Model.Student;

public interface ServiceInter {

	
	
	
	
	public void addStudentData(Student student);
	
	public List <Student> getAllStudent();
	
	
	public Student getStudentSingleData(int id);
	
	void  insertAllDataSaveDataBase(List<Student> list);
	
	void updateStudentSingleData(Student student);
	
	void deleteSingleStudentDetailData(int stuid);
	
	void deleteAllStduentData();
	
	void blukdeleteStudentDetailIds(List<Integer> ids);
	
	Long countStudentId();
	
	boolean givenExistsStudentId(int id);
	
	
	
}
