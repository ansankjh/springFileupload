package goodee.gdj58.springex;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import goodee.gdj58.springex.util.FontColor;
import lombok.extern.slf4j.Slf4j;

// Spring이 WebFilter 애노테이션을 인지 할 수 있도록
// SpringexApplication클래스에 애노테이션 ServletComponentScan 먼저 추가
@Slf4j
@WebFilter("/aop/*")
public class AOPFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.debug(FontColor.RED+"선행코드");
		// 선행 코드
		chain.doFilter(request, response);
		// 후행 코드
		log.debug(FontColor.RED+"후행코드");
	}

}
