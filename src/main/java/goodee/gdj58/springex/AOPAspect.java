package goodee.gdj58.springex;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import goodee.gdj58.springex.util.FontColor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Aspect
public class AOPAspect {
	@Before("execution(* goodee.gdj58.springex.controller.AOPController.hello(..))")
	public void beforedAspect() {
		log.debug(FontColor.BLUE + "AOP 선행 코드");
	}
	
	
	@After("execution(* goodee.gdj58.springex.controller.AOPController.hello(..))")
	public void afterAspect() {
		log.debug(FontColor.BLUE + "AOP 후행 코드");
	}
}
