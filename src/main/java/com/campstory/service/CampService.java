package com.campstory.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.campstory.bean.CampDTO;


public interface CampService {
	
	public int getCount();
	
	public List<CampDTO> getList(int startRow, int endRow);
	
	public CampDTO getContent(String contentid);
	
	public int getDSearchCount(String sql);
	
	public List<CampDTO> getDSearchList(String sql);
	
	public int getKSearchCount(String keyword);
	
	public List<CampDTO> getKSearchList(String keyword, int startRow, int endRow);
	
	public int readcountUp(String contentid);
	
	public int goodCheck(String contentid , String id);
	
	public int goodUp(String contentid);
	
	public int goodDown(String contentid);
	
	public int goodInsert(String contentid , String id);
	
	public int goodDelete(String contentid , String id);

}
