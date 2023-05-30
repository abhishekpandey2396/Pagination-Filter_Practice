package com.kinaraCapital.studentDetails.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kinaraCapital.studentDetails.model.StudentDetails;


public interface StudentDetailsRepository extends JpaRepository<StudentDetails, Integer> {

	Page<StudentDetails> findByCity(String city,Pageable p);

	Page<StudentDetails> findByBranch(String branch,Pageable p);

	Page<StudentDetails> findByAge(int age,Pageable p);

	Page<StudentDetails> findByGender(String gender,Pageable p);
	
	Page<StudentDetails> findByPassOutYear(int passOutYear,Pageable p);

	Page<StudentDetails> findByExperience(int experience,Pageable p);
    
////	@Query(value="select Distinct s.city as stringList from student_details as s",nativeQuery = true)
////	List<StudentProjection> findByDistinctValues(String Stringvalue);
//	
//	@Query(value = "SELECT DISTINCT ?1 AS stringList FROM student_details as", nativeQuery = true)
//    List<StudentProjection> findByDistinctValues(String column);
	
	//List<StudentProjection> findByDistinctValues();
	
	

	



}
