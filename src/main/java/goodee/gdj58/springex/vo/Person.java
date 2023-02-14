package goodee.gdj58.springex.vo;

import java.util.List;

import lombok.Data;

@Data
public class Person {
	private String name;
	// private String[] hobby;
	private List<String> hobby;
}
