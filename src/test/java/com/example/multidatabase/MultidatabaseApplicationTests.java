package com.example.multidatabase;

import com.example.multidatabase.service.DynamicServcice;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MultidatabaseApplicationTests {

	@Autowired
	private DynamicServcice dynamicServcice;

	@Test
	public void contextLoads() {
//        Integer integer = dynamicServcice.ds1();
//        logger.info("integer:"+integer);
//        String ds2 = dynamicServcice.ds2();
//        logger.info("ds2:"+ds2);
		String ds3 = dynamicServcice.ds3();
		System.out.println("ds3:"+ds3);
	}

}
