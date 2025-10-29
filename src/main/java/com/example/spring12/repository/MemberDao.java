package com.example.spring12.repository;

import java.util.List;

import com.example.spring12.dto.MemberDto;

public interface MemberDao {
	public List<MemberDto> selectAll();
	public void insert(MemberDto dto);
	// update, delete 는 수정, 삭제된 row 의 갯수를 리턴하는 모양으로 Dao 메소드를 정의한다
	public int update(MemberDto dto);
	public int deleteByNum(int num);
	public MemberDto getByNum(int num);	
}
