package com.example.ezbytes.repository;

import com.example.ezbytes.model.Holiday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public interface HolidaysRepository extends CrudRepository <Holiday, String> {

}
