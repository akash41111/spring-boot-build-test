package com.example.pipeline_build_test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PipelineBuildTestApplicationTests {

	@Test
	void contextLoads() {
		
		var democal = new DemoCalculator();
		assertEquals(6, democal.add(3, 3));
		assertEquals(12, democal.multiply(4, 3));
	}

}
