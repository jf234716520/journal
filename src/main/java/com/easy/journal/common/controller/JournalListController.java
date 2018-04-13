package com.easy.journal.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JournalListController {
	
	/**
	 * 返回日列表页面
	 * @return
	 */
	@RequestMapping("/journalList/list")
	public String toJournalList(){
		
		return "journal/list";
	}
	
}
