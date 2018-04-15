package com.easy.journal.common.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easy.journal.common.model.Journal;
import com.easy.journal.common.service.JournalService;

@Controller
public class JournalListController {
	
	@Autowired
	private JournalService journalService;
	/**
	 * 返回日列表页面
	 * @return
	 */
	@RequestMapping("/journalList/list")
	public String toJournalList(){
		
		return "journal/list";
	}
	
	
	@RequestMapping("/journal/getJournalList")
	@ResponseBody
	public List<J      2