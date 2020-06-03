package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.paging.Pageble;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface INewService {
	List<NewDTO> findAll(Pageable pageable);
	int getTotalItem();
	NewDTO findById(long id);
	NewDTO save(NewDTO dto);
	void delete(long[] ids);
}
