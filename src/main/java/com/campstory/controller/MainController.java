package com.campstory.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.campstory.bean.KeywordDTO;
import com.campstory.bean.MemberDTO;
import com.campstory.service.CampService;
import com.campstory.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Log4j
@AllArgsConstructor
@Controller
public class MainController {
	
	@Autowired
	private MemberService service;
	private CampService campservice;
	
	@RequestMapping("main")
	public String main(HttpSession session, MemberDTO dto,KeywordDTO kdto, HttpServletRequest req,Model model) {
		String id = null;
		if(session.getAttribute("kakaoId") == null) {
			id = (String)session.getAttribute("memId");
		}else {
			id = (String)session.getAttribute("kakaoId");
		}
		
		if(id != null) {
			model.addAttribute("memberDTO", service.memberUserInfo(id));
		}

		List<KeywordDTO> mainkeywordlist = campservice.getKeywordList();
		
		model.addAttribute("keywordlist",mainkeywordlist);	
		log.info(" ===========list" +mainkeywordlist);
			
		
		return "main";
	}

}
