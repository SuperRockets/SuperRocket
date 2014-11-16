package com.superrocket.app;

import java.util.ArrayList;

/**
 * RestMapper와 내용은 같으나 DAO를 Mapper의 역활로서 함께 사용시 문제가 발생하기에 따로 구분하여 사용하는 것이 좋다!!! 
 * 중요하다!! 이거때문에 시간 많이 잡아 먹었다!
 */
public interface RestDAO {
	ArrayList<Rest> getRest();
	void insertRest(Rest rest);
	//void updateRest(String name);
	//void deleteRest(String name);
}