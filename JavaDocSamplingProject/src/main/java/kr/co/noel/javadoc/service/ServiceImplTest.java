package kr.co.noel.javadoc.service;

import org.springframework.stereotype.Service;

import kr.co.noel.javadoc.domain.TestVO;

@Service
public class ServiceImplTest implements ServiceTest{

	@Override
	public void testMethod_1() {
		
	}

	@Override
	public TestVO testMethod_2(int no) {
		return null;
	}

}
