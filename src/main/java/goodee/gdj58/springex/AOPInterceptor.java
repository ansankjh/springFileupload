package goodee.gdj58.springex;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import goodee.gdj58.springex.util.FontColor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class AOPInterceptor implements HandlerInterceptor {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		log.debug(FontColor.GREEN + "인터셉트 선행코드");
		return HandlerInterceptor.super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		log.debug(FontColor.GREEN + "인터셉트 후행코드");
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
}
