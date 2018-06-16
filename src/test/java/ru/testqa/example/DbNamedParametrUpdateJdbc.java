package ru.testqa.example;


import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;


import javax.sql.DataSource;
import java.util.HashMap;

//@TransactionConfiguration(defaultRollback=false)
public class DbNamedParametrUpdateJdbc {

    @Test
     void main1() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("db.xml");
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("ID", 4);
        int count = new NamedParameterJdbcTemplate
                (context.getBean(DataSource.class)).update("DELETE FROM WorldAirports WHERE ID = :ID",
                paramMap);
        System.out.println(count);


    }
}