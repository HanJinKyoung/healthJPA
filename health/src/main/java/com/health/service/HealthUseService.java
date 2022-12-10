package com.health.service;

import com.health.entity.HealthUseVO;

public interface HealthUseService {
	
	public boolean create(HealthUseVO hvo);  	//이용권 생성
	public int use(int healthUseNo,boolean plusMinus);         	//이용권 사용(회차 차감)
	public boolean deprecated(int healthUseNo); //이용권 소멸
	public HealthUseVO userInfo(String userId); //이용권 정보 조회(사용자 ID를 이용)
}
