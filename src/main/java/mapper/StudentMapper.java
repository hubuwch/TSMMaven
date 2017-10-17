package mapper;

import java.util.List;

import entry.Student;

public interface StudentMapper {
	
	public List<Student> queryAll();
    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}