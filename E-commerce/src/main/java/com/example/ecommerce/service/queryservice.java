package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.model.querymodal;
import com.example.ecommerce.repository.queryrepo;

import jakarta.transaction.Transactional;

@Service
public class queryservice
{
	@Autowired
	queryrepo ar;
	public List<querymodal> fetchStudentsByNamePrefix(String prefix)
	{
		return ar.findByNameStartingWith(prefix);
	}
	public List<querymodal> fetchStudentsByNameSufix(String sufix)
	{
		return ar.findByNameEndingWith(sufix);
	}
	public List<querymodal> fetchStudentsByDepartment(String dept)
	{
		return ar.findByDepartment(dept);
	}
	public List<querymodal> getStudentsByDepartment(String dept,String name)
	{
		return ar.getStudentsByDepartment(dept, name);
	}
	@Transactional
	public int deleteStudentByName(String name)
	{
		return ar.deleteStudentByName(name);
	}
	public List<querymodal> findAll()
	{
		return ar.findAll();
	}
	@Transactional
	public int updateStudentByName(String department,String name)
	{
		return ar.updateStudentByName(department,name);
	}
}
