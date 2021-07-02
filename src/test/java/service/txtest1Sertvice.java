package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.service.Txtest1Service;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class txtest1Sertvice {
	
	@Setter(onMethod_ = @Autowired)
	private Txtest1Service service;
	
	@Test
	public void testInsertOK() {
		service.insert("ab");
	}
	
	@Test(expected = Exception.class)
	public void testInsertFail() { // 모두 실패
		service.insert("abc");
	}
}
