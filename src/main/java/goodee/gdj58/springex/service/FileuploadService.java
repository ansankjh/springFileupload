package goodee.gdj58.springex.service;

import java.io.File;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import goodee.gdj58.springex.vo.MemberForm;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class FileuploadService {
	
	public void addMember(MemberForm memberForm) {
		// 1+2+3+4 -> 트랜잭션 처리
		
		// member테이블(1) : (N)pic테이블
		
		
		// 1. member mapper호출(insert -> key반환)
			int memberNo = 0; // insert후 key반환값
			
		// 2. 파일 업로드
		List<MultipartFile> pic = memberForm.getPic();
		if(pic != null) { // pic이 null이 아니면 한개 이상의 업로드할 파일이 있다.
			log.debug("in for...");
			for(MultipartFile mf : pic) {
				// 3. 파일 저장
				String originName = mf.getOriginalFilename(); // 확장자 포함 이름
				log.debug(originName);
				String newName = UUID.randomUUID().toString().replace("-", ""); // 확장자 포함x
				String ext = originName.substring(originName.lastIndexOf(".")+1);
				String newFullName = memberForm.getPath()+newName + "." + ext;
				log.debug(newFullName);
				File f = new File(newFullName); // 풀네임으로 빈파일을 생성
				// 빈파일에 mf안의 업로드된 파일을 복사 
				try {
					mf.transferTo(f);
				} catch(Exception e) {
					e.printStackTrace();
					// 파일업로드에 실패하면
					// try..catch절이 필요로 하지 않는 RuntimeException을 발생시켜서
					// 애노테이션 Transacactional
					throw new RuntimeException();
				}
				
				
				// 4. 파일정보를 pic테이블에 저장
			}
		}
		
	}
}
