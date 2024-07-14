package com.example.demo.dao;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dao.impl.MemberDaoImpl;
import com.example.demo.model.Member;

@SpringBootTest
public class MemberDaoImplTest {
	@Autowired
	MemberDaoImpl mdi;
	
	//@Test
	public void addTest()
	{
		
		Member m=new Member("aa","ii","456","台北","789");
		mdi.add(m);
		
		System.out.println("add success");
	}
	
	//@Test
	public void selectAllTest()
	{
		List<Member> l=mdi.selectAll();
		
		for(Member m:l)
		{
			System.out.println("id:"+m.getId()+"\tname:"+m.getName());
			
		}
	}
	
	//Test
	public void selectMemberTest()
	{
		List<Member> l=mdi.selectMember("ii", "456");
		
		for(Member m:l)
		{
			System.out.println("id:"+m.getId()+"\tname:"+m.getName());
			
		}
	}
	
	//@Test
	public void selectUsernameTest()
	{
		List<Member> l=mdi.selectUsername("o");
			
		for(Member m:l)
		{
			System.out.println("id:"+m.getId()+"\tname:"+m.getName());
				
		}
	}
	
	//@Test
	public void selectByidTest()
	{
		List<Member> l=mdi.selectById(999);
		System.out.println(l.size());
		for(Member m:l)
		{
			System.out.println("id:"+m.getId()+"\tname:"+m.getName());
				
		}
	}
	//@Test
	public void updateTest()
	{
		List<Member> l=mdi.selectById(18);
		Member[] m=l.toArray(new Member[1]);
				
		m[0].setName("tecaher");
		m[0].setAddress("高雄");
				
		mdi.update(m[0]);
				
		System.out.println("update success");
	}
			
	//@Test
	public void deleteTest()
	{
		mdi.delete(19);
				
		System.out.println("delete success");
	}
}