package com.kinaraCapital.studentDetails.service;

import java.util.List;

import com.kinaraCapital.studentDetails.model.StudentDetails;



 public interface StudentDetailsService {
	 
    
	 List<StudentDetails> getAllDetails(Integer pageNumber,Integer pageSize);
	 List<StudentDetails> getStudentByCity(String city, Integer pageNumber, Integer pageSize);
	 List<StudentDetails> getStudentByBranch(String branch, Integer pageNumber, Integer pageSize);
	 List<StudentDetails> getStudentByAge(int age, Integer pageNumber, Integer pageSize);
	 List<StudentDetails> getStudentByGender(String gender, Integer pageNumber, Integer pageSize);
	 List<StudentDetails> getStudentByPassoutYear(int passOutYear, Integer pageNumber, Integer pageSize);
	 List<StudentDetails> getStudentByExperience(int experience, Integer pageNumber, Integer pageSize);
	
	 
 }
