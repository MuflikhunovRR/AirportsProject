package ru.testqa;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.testqa.bean.AirportDb;
import ru.testqa.bean.QueryStore;
import ru.testqa.modelsairports.Airport;

import javax.sql.DataSource;
import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.util.List;

/**
 * @author Muflikhunov Roman
 */

@DisplayName("Airports Parameterized Test")
public class AirportParamTest {
    //Spring bean
    private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-config.xml"});
    private static Airport bean = context.getBean(Airport.class);

    //Spring jdbc context
    private static ClassPathXmlApplicationContext contextdb = new ClassPathXmlApplicationContext("db.xml");
    private static JdbcTemplate jdbc = new JdbcTemplate(contextdb.getBean(DataSource.class));
    private static List<AirportDb> newDatasetAirs;
    private static NewDatasetAir unmarshal;
    private static NewDatasetAir.Table response;
    private static String getAirResp;
    private static AirportDb selectDb;


    @ParameterizedTest(name = "{index} => Testing airport: ''{0}''")
    @DisplayName("Test Suite Airports")
    @ValueSource(strings = { "LAX", "FCO", "SFO" })
    void getResponse(String aiport){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode(aiport);
        unmarshal = JAXB.unmarshal(new StringReader(getAirResp), NewDatasetAir.class);
        response = unmarshal.getNewDataSets().get(0);

        //jdbc connect & get data from db, use QueryStore
        newDatasetAirs = jdbc.query(QueryStore.getAirDataDb(), new BeanPropertyRowMapper<>(AirportDb.class), aiport);
        selectDb = newDatasetAirs.get(0);

        //Assert db value with soap response value from web service
        Assertions.assertEquals(selectDb.getAirportCode(), response.getAirportCode(), "Incorrect AirportCode value in response.");
        Assertions.assertEquals(selectDb.getCityOrAirportName(), response.getCityOrAirportName(), "Incorrect CityOrAirportName value in response.");
        Assertions.assertEquals(selectDb.getCountry(), response.getCountry(), "Incorrect Country value in response.");
        Assertions.assertEquals(selectDb.getCountryAbbrviation(), response.getCountryAbbrviation(), "Incorrect CountryAbbrviation value in response.");
        Assertions.assertEquals(selectDb.getCountryCode(), response.getCountryCode(), "Incorrect CountryCode value in response.");
        Assertions.assertEquals(selectDb.getGMTOffset(), response.getgMTOffset(), "Incorrect GMTOffset value in response.");
        Assertions.assertEquals(selectDb.getRunwayLengthFeet(), response.getRunwayLengthFeet(), "Incorrect RunwayLengthFeet value in response.");
        Assertions.assertEquals(selectDb.getRunwayElevationFeet(), response.getRunwayElevationFeet(), "Incorrect RunwayElevationFeet value in response.");
        Assertions.assertEquals(selectDb.getLatitudeDegree(), response.getLatitudeDegree(), "Incorrect LatitudeDegree value in response.");
        Assertions.assertEquals(selectDb.getLatitudeMinute(), response.getLatitudeMinute(), "Incorrect LatitudeMinute value in response.");
        Assertions.assertEquals(selectDb.getLatitudeSecond(), response.getLatitudeSecond(), "Incorrect LatitudeSecond value in response.");
        Assertions.assertEquals(selectDb.getLatitudeNpeerS(), response.getLatitudeNpeerS(), "Incorrect LatitudeNpeerS value in response.");
        Assertions.assertEquals(selectDb.getLongitudeDegree(), response.getLongitudeDegree(), "Incorrect LongitudeDegree value in response.");
        Assertions.assertEquals(selectDb.getLongitudeMinute(), response.getLongitudeMinute(), "Incorrect LongitudeMinute value in response.");
        Assertions.assertEquals(selectDb.getLongitudeSeconds(), response.getLongitudeSeconds(), "Incorrect LongitudeSeconds value in response.");
        Assertions.assertEquals(selectDb.getLongitudeEperW(), response.getLongitudeEperW(), "Incorrect LongitudeEperW value in response.");
    }

}