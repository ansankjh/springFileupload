package goodee.gdj58.springex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import goodee.gdj58.springex.mapper.StudentMapper;
import goodee.gdj58.springex.vo.Student;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class StudentController {
	@Autowired StudentMapper studentMapper;
	
	@GetMapping("addStudent")
	public String addStudent() {
		
		Student s = new Student();
		s.setStudentId("keytest2");
		s.setStudentPw("1234");
		s.setStudentName("키테스트2");
		
		studentMapper.insertStudent(s);
		// 매개변수 s객체의 studentNo는 insert 쿼리실행 후 생성된 
		// auto_incremnt값으로 채워지도록 쿼리를 실행
		
		log.debug("s.getStudentNo : " + s.getStudentNo());
		
		return "";
	}
}
