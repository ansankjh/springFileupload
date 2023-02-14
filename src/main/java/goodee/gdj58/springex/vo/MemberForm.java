package goodee.gdj58.springex.vo;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class MemberForm {
	private String name;
	// 도메인객체와 커맨드객체의 필드 불일치
	// private List<String> pic;
	private List<MultipartFile> pic;
	
	//파일이 저장될 폴더위치(path)
	private String path;
}
