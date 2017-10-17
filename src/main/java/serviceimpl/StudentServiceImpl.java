package serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entry.Student;
import mapper.StudentMapper;
import service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;

	public StudentMapper getStudentMapper() {
		return studentMapper;
	}

	@Override
	public List<Student> queryAll() {
		
		return this.getStudentMapper().queryAll();
	}

}
