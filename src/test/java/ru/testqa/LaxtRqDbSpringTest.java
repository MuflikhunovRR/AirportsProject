package ru.testqa;


import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import ru.testqa.bean.AirportDb;
import ru.testqa.modelsairports.Airport;

import javax.sql.DataSource;
import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.util.HashMap;
import java.util.List;

import static ru.testqa.constants.Constants.ConstantLax.*;

/**
 * @author Muflikhunov Roman
 */

public class LaxtRqDbSpringTest {

    private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-config.xml"});
    private static Airport bean = context.getBean(Airport.class);
    private static ClassPathXmlApplicationContext contextdb = new ClassPathXmlApplicationContext("db.xml");
    private static JdbcTemplate jdbc = new JdbcTemplate(contextdb.getBean(DataSource.class));
    private static List<AirportDb> newDatasetAirs;
    private static NewDatasetAir unmarshal;
    private static NewDatasetAir.Table response;
    private static String getAirResp;
    private static AirportDb selectDb;

    @BeforeAll
    public static void getResponse(){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode(AIRCODE);
        unmarshal = JAXB.unmarshal(new StringReader(getAirResp), NewDatasetAir.class);
        response = unmarshal.getNewDataSets().get(0);

        NamedParameterJdbcTemplate nqu = new NamedParameterJdbcTemplate(contextdb.getBean(DataSource.class));
        HashMap<String, Object> param = new HashMap<>();
        param.put("AirportCode", AIRCODE);
        List<AirportDb> newDatasetAirs = nqu.query("SELECT * FROM WorldAirports WHERE AirportCode = :AirportCode",
                param,
                new BeanPropertyRowMapper<>(AirportDb.class));

        //newDatasetAirs = jdbc.query(QueryStore.getAirDataDb(), new BeanPropertyRowMapper<>(AirportDb.class), AIRCODE);
        selectDb = newDatasetAirs.get(0);
    }

    @Test
    @DisplayName("ID:24 AirportInformationByAirportCode Response positive test. AirportCode")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest24(){
        Assertions.assertEquals(selectDb.getAirportCode(), response.getAirportCode(), "Incorrect AirportCode value in response.");
    }

    @Test
    @DisplayName("ID:25 AirportInformationByAirportCode Response positive test. CityOrAirportName")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest25(){
        Assertions.assertEquals(selectDb.getCityOrAirportName(), response.getCityOrAirportName(), "Incorrect CityOrAirportName value in response.");
    }

    @Test
    @DisplayName("ID:26 AirportInformationByAirportCode Response positive test. Country")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest26(){
        Assertions.assertEquals(selectDb.getCountry(), response.getCountry(), "Incorrect Country value in response.");
    }

    @Test
    @DisplayName("ID:27 AirportInformationByAirportCode Response positive test. CountryAbbrviation")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest27(){
        Assertions.assertEquals(selectDb.getCountryAbbrviation(), response.getCountryAbbrviation(), "Incorrect CountryAbbrviation value in response.");
    }

    @Test
    @DisplayName("ID:28 AirportInformationByAirportCode Response positive test. CountryCode")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest28(){
        Assertions.assertEquals(selectDb.getCountryCode(), response.getCountryCode(), "Incorrect CountryCode value in response.");
    }

    @Test
    @DisplayName("ID:29 AirportInformationByAirportCode Response positive test. GMTOffset")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest29(){
        Assertions.assertEquals(selectDb.getGMTOffset(), response.getgMTOffset(), "Incorrect GMTOffset value in response.");
    }

    @Test
    @DisplayName("ID:30 AirportInformationByAirportCode Response positive test. RunwayLengthFeet")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest30(){
        Assertions.assertEquals(selectDb.getRunwayLengthFeet(), response.getRunwayLengthFeet(), "Incorrect RunwayLengthFeet value in response.");
    }

    @Test
    @DisplayName("ID:31 AirportInformationByAirportCode Response positive test. RunwayElevationFeet")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest31(){
        Assertions.assertEquals(selectDb.getRunwayElevationFeet(), response.getRunwayElevationFeet(), "Incorrect RunwayElevationFeet value in response.");
    }

    @Test
    @DisplayName("ID:32 AirportInformationByAirportCode Response positive test. LatitudeDegree")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest32(){
        Assertions.assertEquals(selectDb.getLatitudeDegree(), response.getLatitudeDegree(), "Incorrect LatitudeDegree value in response.");
    }

    @Test
    @DisplayName("ID:33 AirportInformationByAirportCode Response positive test. LatitudeMinute")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest33(){
        Assertions.assertEquals(selectDb.getLatitudeMinute(), response.getLatitudeMinute(), "Incorrect LatitudeMinute value in response.");
    }

    @Test
    @DisplayName("ID:34 AirportInformationByAirportCode Response positive test. LatitudeSecond")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest34(){
        Assertions.assertEquals(selectDb.getLatitudeSecond(), response.getLatitudeSecond(), "Incorrect LatitudeSecond value in response.");
    }

    @Test
    @DisplayName("ID:35 AirportInformationByAirportCode Response positive test. LatitudeNpeerS")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest35(){
        Assertions.assertEquals(selectDb.getLatitudeNpeerS(), response.getLatitudeNpeerS(), "Incorrect LatitudeNpeerS value in response.");
    }

    @Test
    @DisplayName("ID:36 AirportInformationByAirportCode Response positive test. LongitudeDegree")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest36(){
        Assertions.assertEquals(selectDb.getLongitudeDegree(), response.getLongitudeDegree(), "Incorrect LongitudeDegree value in response.");
    }

    @Test
    @DisplayName("ID:37 AirportInformationByAirportCode Response positive test. LongitudeMinute")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest37(){
        Assertions.assertEquals(selectDb.getLongitudeMinute(), response.getLongitudeMinute(), "Incorrect LongitudeMinute value in response.");
    }

    @Test
    @DisplayName("ID:38 AirportInformationByAirportCode Response positive test. LongitudeSeconds")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest38(){
        Assertions.assertEquals(selectDb.getLongitudeSeconds(), response.getLongitudeSeconds(), "Incorrect LongitudeSeconds value in response.");
    }

    @Test
    @DisplayName("ID:39 AirportInformationByAirportCode Response positive test. LongitudeEperW")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with data base. (Spring)")
    public  void responseConstTest39(){
        Assertions.assertEquals(selectDb.getLongitudeEperW(), response.getLongitudeEperW(), "Incorrect LongitudeEperW value in response.");
    }



}