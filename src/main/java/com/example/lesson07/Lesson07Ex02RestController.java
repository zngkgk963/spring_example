package com.example.lesson07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lesson07.dao.StudentRepository;
import com.example.lesson07.entity.StudentEntity;

@RequestMapping("/lesson07/ex02")
@RestController
public class Lesson07Ex02RestController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/1")
	public List<StudentEntity> getStudentList() {
		
//		return studentRepository.findAllByOrderByIdDesc();
		
		// 4) 이름이 박재현인 데이터 조회
//		return studentRepository.findByName("박재현");
//		
//		// 5) in문으로 일치하는 값 모두 조회
//		return studentRepository.findByNameIn(Arrays.asList("유재석", "조세호", "박재현"));
		
		// 6) 여러 컬럼값과 일치하는 데이터 조회
//		return studentRepository.findByNameAndDreamJob("조세호", "변호사");
		
		// 7) email 컬럼에 naver 키워드가 포함된 데이터 조회(like문) - %naver%
//		return studentRepository.findByEmailContaining("naver");
		
		// 8) 이름이 신으로 시작하는 데이터 조회(like문) - 신%
//		return studentRepository.findByNameStartingWith("박");
		
		// 9) where id >= 1 and id <= 5
		//	  id between 1 and 5
		// id가 1~5 데이터 조회(between)
		return studentRepository.findByIdBetween(1, 5);
	}
	
	@GetMapping("/2")
	public List<StudentEntity> getStudent() {
		// 장래희망이 래퍼인 데이터 조회
		return studentRepository.findByDreamJob("래퍼");
	}
}
