package goodee.gdj58.springex.vo;

import java.util.List;

import lombok.Data;

@Data
public class Member {
	private String name;
	private List<String> pic;
	// 도메인객체와 커맨드객체의 필드 불일치
	// private List<String> pic;
}