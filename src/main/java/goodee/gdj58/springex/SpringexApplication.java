package goodee.gdj58.springex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@ServletComponentScan
public class SpringexApplication implements WebMvcConfigurer {
	@Autowired AOPInterceptor aopInterceptor;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringexApplication.class, args);
	}
	
	// 인터셉터 맵핑을 설정할 수 있도록 WebMvcConfigurer를 구현 후 addInterceptors메서드를 오버라이딩
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 여러 인터셉터 중 사용될 인터셉터만 registry(List)에 등록
		registry.addInterceptor(aopInterceptor).addPathPatterns("/aop/*");
		WebMvcConfigurer.super.addInterceptors(registry);
	}
}
