package com.easy.journal.common.service;

import java.util.List;
import com.easy.journal.common.model.Journal;

public interface JournalService {
	
	/**
	 * 查询
	 * @param uuid
	 * @param belongWeek
	 * @return
	 */
	public List<Journal> getJournalList(String creatorUUID,int belongWeek);
}
