package com.superrocket.app;

import java.util.ArrayList;

/**
 * RestMapper�� ������ ������ DAO�� Mapper�� ��Ȱ�μ� �Բ� ���� ������ �߻��ϱ⿡ ���� �����Ͽ� ����ϴ� ���� ����!!! 
 * �߿��ϴ�!! �̰Ŷ����� �ð� ���� ��� �Ծ���!
 */
public interface RestDAO {
	ArrayList<Rest> getRest();
	void insertRest(Rest rest);
	//void updateRest(String name);
	//void deleteRest(String name);
}