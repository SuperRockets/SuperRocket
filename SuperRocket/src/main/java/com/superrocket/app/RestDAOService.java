package com.superrocket.app;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//Service Ŭ������ Repository�� ��������μ� ��(bean) Ŭ������ ����ϴ��ϰ��Ѵ�. 
@Repository
public class RestDAOService implements RestDAO {

//Autowired�� ����Ͽ� sqlSession�� ����Ҽ� �ִ�.
   @Autowired
   private SqlSession sqlSession;
   
   @Override
   public ArrayList<Rest> getRest() {
       ArrayList<Rest> result = new ArrayList<Rest>();
       //sqlSession�� ���Ͽ� �����Ѵ�.
       RestMapper restMapper = sqlSession.getMapper(RestMapper.class);
       //getRest()�� �޼ҵ��� mapper.mxl�� id�� �����ؾ��Ѵ�.
       result = restMapper.getRest();
       
       return result;
   }
   
   @Override
   public void insertRest(Rest rest) {
       RestMapper restMapper = sqlSession.getMapper(RestMapper.class);
       restMapper.insertRest(rest);
   }
   

   
   /*
   //�Ʒ��κ��� �ڵ��ϴ� ������
   @Override
   public void updateRest(String name) {
   }
   @Override
   public void deleteRest(String name) {
       RestMapper restMapper = sqlSession.getMapper(RestMapper.class);
       restMapper.deleteRest(name);
   }
   */
}
