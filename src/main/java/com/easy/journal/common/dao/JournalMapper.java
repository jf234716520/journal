package com.easy.journal.common.dao;

import java.util.List;
import org.springframework.stereotype.Service;
import com.easy.journal.common.model.Journal;

@Service
public interface JournalMapper {
	
	public List<Journal> getJournalList(String uuid, int belongWeek);
	
	public void insert(Journal journal);
}
