package ru.testqa.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.testqa.bean.AirportDb;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.List;

public class DbNamedParametrJdbc {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("AIRPORTCODE", "LAX");
        List<AirportDb> newDatasetAirs = new NamedParameterJdbcTemplate
                (context.getBean(DataSource.class)).query("SELECT * FROM WORLDAIRPORTS WA WHERE WA.AIRPORTCODE = :AIRPORTCODE",
                paramMap, new BeanPropertyRowMapper<>(AirportDb.class));

        System.out.println(newDatasetAirs);
        System.out.println(newDatasetAirs.get(0).getId());
        System.out.println(newDatasetAirs.get(0).getAirportCode());
        System.out.println(newDatasetAirs.get(0).getCityOrAirportName());
        System.out.println(newDatasetAirs.get(0).getCountry());
        System.out.println(newDatasetAirs.get(0).getCountryAbbrviation());

    }
}