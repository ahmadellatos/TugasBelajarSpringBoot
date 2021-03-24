package com.juaracoding.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.juaracoding.main.model.Absensi;
import com.juaracoding.main.model.AbsensiRowMapper;

@Repository
public class DaoAbsensi {
	
	@Autowired
	JdbcTemplate jdbc ;
	
	public int insertAbsensi(Absensi absensi) {
		return jdbc.update("insert into absensi(id,nik,start_date,end_date) values("+absensi.getId()+",'"+absensi.getNik()+"','"+absensi.getStart_date()+"','"+absensi.getEnd_date()+"')");
	}
	
	public List<Absensi> getAbsensi() {
		
		String sql = "Select * from Absensi";
		
		List <Absensi> absensi =  jdbc.query(sql,new AbsensiRowMapper());
		
		return absensi;
	}
	
	public int updateAbsensi() {
		return 0;
	}
	
	public int deleteAbsensi() {
		return 0;
	}
}
