package com.superrocket.app;

import java.util.ArrayList;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//Service 클래스를 Repository로 등록함으로서 빈(bean) 클래스로 사용하능하게한다. 
@Repository
public class RestDAOService implements RestDAO {

//Autowired를 사용하여 sqlSession을 사용할수 있다.
   @Autowired
   private SqlSession sqlSession;
   
   @Override
   public ArrayList<Rest> getRest() {
       ArrayList<Rest> result = new ArrayList<Rest>();
       //sqlSession을 통하여 매핑한다.
       RestMapper restMapper = sqlSession.getMapper(RestMapper.class);
       //getRest()의 메소드명과 mapper.mxl과 id는 동일해야한다.
       result = restMapper.getRest();
       
       return result;
   }
   
   @Override
   public void insertRest(Rest rest) {
       RestMapper restMapper = sqlSession.getMapper(RestMapper.class);
       restMapper.insertRest(rest);
   }
   

   
   /*
   //아래부분은 코딩하다 말았음
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
