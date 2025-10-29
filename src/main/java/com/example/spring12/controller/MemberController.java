package com.example.spring12.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring12.dto.MemberDto;
import com.example.spring12.service.MemberService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/v1")
@RestController
@RequiredArgsConstructor
public class MemberController {
	//의존객체 생성자 주입 
	private final MemberService service;
	
	@GetMapping("/members")
	public List<MemberDto> members(){
		return service.getAll();
	}
	
	@PostMapping("/members")
	public ResponseEntity<Void> createMember(@RequestBody MemberDto dto){
		service.addMember(dto);	
		return ResponseEntity.ok().build();
	}
	
}	













