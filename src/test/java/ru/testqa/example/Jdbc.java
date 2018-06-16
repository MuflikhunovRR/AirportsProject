package ru.testqa.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.testqa.bean.AirportDb;

import javax.sql.DataSource;
import java.util.List;

public class Jdbc {
    private static JdbcTemplate jdbc;

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
        jdbc = new JdbcTemplate(context.getBean(DataSource.class));
        List<AirportDb> newDatasetAirs = jdbc.query("SELECT * FROM WORLDAIRPORTS WHERE AIRPORTCODE ='LAX' ", new BeanPropertyRowMapper<>(AirportDb.class));

        System.out.println(newDatasetAirs);
        System.out.println(newDatasetAirs.get(0).getId());
        System.out.println(newDatasetAirs.get(0).getAirportCode());
        System.out.println(newDatasetAirs.get(0).getCityOrAirportName());
        System.out.println(newDatasetAirs.get(0).getCountry());
        System.out.println(newDatasetAirs.get(0).getCountryAbbrviation());



    }
}