package com.kinaraCapital.studentDetails.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.kinaraCapital.studentDetails.model.StudentDetails;

import com.kinaraCapital.studentDetails.repo.StudentDetailsRepository;
import com.kinaraCapital.studentDetails.service.StudentDetailsService;

@Service
public class ServiceDetailServiceImpl implements StudentDetailsService {

	@Autowired
	private StudentDetailsRepository studentDetailsRepository ;
	
	@Override
	public List<StudentDetails> getAllDetails(Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
		
//		int pageNumber = 1;
//		int pageSize = 5;
		
		Pageable p = PageRequest.of(pageNumber, pageSize);
		
	    Page<StudentDetails> pagePost = this.studentDetailsRepository.findAll(p);
		
	    List<StudentDetails> contentPost = pagePost.getContent();
	    
		return contentPost;
	}

	@Override
	public List<StudentDetails> getStudentByCity(String city,Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable p = PageRequest.of(pageNumber,pageSize );
		
		Page<StudentDetails> cityPage = this.studentDetailsRepository.findByCity(city,p);
		
//		List<StudentDetails> cityPost =  cityPage.getContent();
		    
		return cityPage.getContent();
	}

	@Override
	public List<StudentDetails> getStudentByBranch(String branch,Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable p = PageRequest.of(pageNumber,pageSize );	
		
		Page<StudentDetails> branchPage = this.studentDetailsRepository.findByBranch(branch,p);
		
		return branchPage.getContent();
	}

	@Override
	public List<StudentDetails> getStudentByAge(int age,Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable p = PageRequest.of(pageNumber, pageSize);
		
		Page<StudentDetails> agePage = this.studentDetailsRepository.findByAge(age,p);
		
		return agePage.getContent();
	}

	@Override
	public List<StudentDetails> getStudentByGender(String gender,Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable p = PageRequest.of(pageNumber, pageSize);
		
		Page<StudentDetails> genderPage = this.studentDetailsRepository.findByGender(gender,p);
		
		return genderPage.getContent();
	}

	@Override
	public List<StudentDetails> getStudentByPassoutYear(int passOutYear,Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable p = PageRequest.of(pageNumber, pageSize);
		
		Page<StudentDetails> PassoutPage = this.studentDetailsRepository.findByPassOutYear(passOutYear,p);
		
		return PassoutPage.getContent();
	}

	@Override
	public List<StudentDetails> getStudentByExperience(int experience,Integer pageNumber,Integer pageSize) {
		// TODO Auto-generated method stub
		
		Pageable p = PageRequest.of(pageNumber, pageSize);
		
		Page<StudentDetails> experiencePage = this.studentDetailsRepository.findByExperience(experience,p);
		
		return experiencePage.getContent();
	}

//	@Override
//	public List<StudentProjection> getDistinctValues(String distinctValue) {
//		// TODO Auto-generated method stub
//		return this.studentDetailsRepository.findByDistinctValues(distinctValue);
//	}

}
