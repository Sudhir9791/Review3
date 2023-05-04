package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.model.querymodal;




@Repository
public interface queryrepo extends JpaRepository<querymodal,Integer>
{
	//positional parameter
	@Query("Select a from querymodal a where a.department=?1 and a.name=?2")
	public List<querymodal> getStudentsByDepartment(String dept,String name);
	
	//named parameter
	@Query("Select a from querymodal a where a.department=:dept")
	public List<querymodal> getStudentsByDepartment(String dept);
	
	//DML
	@Modifying
	@Query("delete from querymodal a where a.name=?1")
	public int deleteStudentByName(String name);
	
	@Modifying
	@Query("update querymodal a set a.department=?1 where a.name=?2")
	public int updateStudentByName(String department,String name);
	
	@Query(value="select * from Student  s where  s.email= ?1",nativeQuery=true)
	public List<querymodal> fetchStudentByMail(String  mail);
	
	List<querymodal>findByNameStartingWith(String prefix);
	List<querymodal>findByNameEndingWith(String sufix);
	List<querymodal>findByDepartment(String dept);
}
