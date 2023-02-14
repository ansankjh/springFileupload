package goodee.gdj58.springex.mapper;

import org.apache.ibatis.annotations.Mapper;

import goodee.gdj58.springex.vo.Student;

@Mapper
public interface StudentMapper {
	int insertStudent(Student s);
}
