package com.kdh.service.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.kdh.entity.People;
import com.kdh.service.PeopleService;

@Service
public class Jdbc implements PeopleService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<People> findAll() {
		String sql = "select * from human_tbl";		
		List<People> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(People.class));
		
		return list;
	}

}
