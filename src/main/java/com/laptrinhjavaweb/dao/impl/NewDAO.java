package com.laptrinhjavaweb.dao.impl;

import com.laptrinhjavaweb.dao.INewDAO;
import com.laptrinhjavaweb.mapper.NewMapper;
import com.laptrinhjavaweb.model.NewModel;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findAll() {
		StringBuilder sql = new StringBuilder("SELECT * FROM new");

		return query(sql.toString(), new NewMapper());
	}

	public static void main(String[] args) {
		NewDAO dao= new NewDAO();
		dao.findAll().stream().forEach(System.out::println);
	}

}
