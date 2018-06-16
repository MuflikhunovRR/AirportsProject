package ru.testqa;


import io.qameta.allure.Description;
import org.junit.jupiter.api.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testqa.modelsairports.Airport;
import javax.xml.bind.JAXB;
import java.io.StringReader;

import static ru.testqa.constants.Constants.ConstantLax.*;

/**
 * @author Muflikhunov Roman
 */

public class LaxtRqSpringTest {

    private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-config.xml"});
    private static Airport bean = context.getBean(Airport.class);
    private static NewDatasetAir unmarshal;
    private static NewDatasetAir.Table response;
    private static String getAirResp;

    @BeforeAll
    public static void getResponse(){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode(AIRCODE);
        unmarshal = JAXB.unmarshal(new StringReader(getAirResp), NewDatasetAir.class);
        response = unmarshal.getNewDataSets().get(0);
    }

    @Test
    @DisplayName("ID:1 AirportInformationByAirportCode Response positive test. LAX")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest1(){
        Assertions.assertNotNull(response, "Empty response message.");
    }

    @Test
    @DisplayName("ID:2 AirportInformationByAirportCode Response positive test. lax")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest2(){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode("lax");
        unmarshal = JAXB.unmarshal(new StringReader(getAirResp), NewDatasetAir.class);
        response = unmarshal.getNewDataSets().get(0);
        Assertions.assertNotNull(response, "Empty response message.");
    }

    @Test
    @DisplayName("ID:3 AirportInformationByAirportCode Response positive test. AirportCode")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest3(){
        Assertions.assertEquals(AIRCODE, response.getAirportCode(), "Incorrect AirportCode value in response.");
    }

    @Test
    @DisplayName("ID:4 AirportInformationByAirportCode Response positive test. CityOrAirportName")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest4(){
        Assertions.assertEquals(CITYAIRPORT, response.getCityOrAirportName(), "Incorrect CityOrAirportName value in response.");
    }

    @Test
    @DisplayName("ID:5 AirportInformationByAirportCode Response positive test. Country")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest5(){
        Assertions.assertEquals(COUNTRY, response.getCountry(), "Incorrect Country value in response.");
    }

    @Test
    @DisplayName("ID:6 AirportInformationByAirportCode Response positive test. CountryAbbrviation")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest6(){
        Assertions.assertEquals(COUNTRYABBR, response.getCountryAbbrviation(), "Incorrect CountryAbbrviation value in response.");
    }

    @Test
    @DisplayName("ID:7 AirportInformationByAirportCode Response positive test. CountryCode")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest7(){
        Assertions.assertEquals(COUNTRYCODE, Integer.valueOf(response.getCountryCode()), "Incorrect CountryCode value in response.");
    }

    @Test
    @DisplayName("ID:8 AirportInformationByAirportCode Response positive test. GMTOffset")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest8(){
        Assertions.assertEquals(GMTOFFSET, response.getgMTOffset(), "Incorrect GMTOffset value in response.");
    }

    @Test
    @DisplayName("ID:9 AirportInformationByAirportCode Response positive test. RunwayLengthFeet")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest9(){
        Assertions.assertEquals(RUNWAYLENGTHFEET, response.getRunwayLengthFeet(), "Incorrect RunwayLengthFeet value in response.");
    }

    @Test
    @DisplayName("ID:10 AirportInformationByAirportCode Response positive test. RunwayElevationFeet")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest10(){
        Assertions.assertEquals(RUNWAYELEVATIONFEET, response.getRunwayElevationFeet(), "Incorrect RunwayElevationFeet value in response.");
    }

    @Test
    @DisplayName("ID:11 AirportInformationByAirportCode Response positive test. LatitudeDegree")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest11(){
        Assertions.assertEquals(LATITUDEDEG, response.getLatitudeDegree(), "Incorrect LatitudeDegree value in response.");
    }

    @Test
    @DisplayName("ID:12 AirportInformationByAirportCode Response positive test. LatitudeMinute")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest12(){
        Assertions.assertEquals(LATITUDEMIN, response.getLatitudeMinute(), "Incorrect LatitudeMinute value in response.");
    }

    @Test
    @DisplayName("ID:13 AirportInformationByAirportCode Response positive test. LatitudeSecond")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest13(){
        Assertions.assertEquals(LATITUDESEC, response.getLatitudeSecond(), "Incorrect LatitudeSecond value in response.");
    }

    @Test
    @DisplayName("ID:14 AirportInformationByAirportCode Response positive test. LatitudeNpeerS")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest14(){
        Assertions.assertEquals(LATITUDENPEERS, response.getLatitudeNpeerS(), "Incorrect LatitudeNpeerS value in response.");
    }

    @Test
    @DisplayName("ID:15 AirportInformationByAirportCode Response positive test. LongitudeDegree")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest15(){
        Assertions.assertEquals(LONGITUDEDEG, response.getLongitudeDegree(), "Incorrect LongitudeDegree value in response.");
    }

    @Test
    @DisplayName("ID:16 AirportInformationByAirportCode Response positive test. LongitudeMinute")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest16(){
        Assertions.assertEquals(LONGITUDEMIN, response.getLongitudeMinute(), "Incorrect LongitudeMinute value in response.");
    }

    @Test
    @DisplayName("ID:17 AirportInformationByAirportCode Response positive test. LongitudeSeconds")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest17(){
        Assertions.assertEquals(LONGITUDESEC, response.getLongitudeSeconds(), "Incorrect LongitudeSeconds value in response.");
    }

    @Test
    @DisplayName("ID:18 AirportInformationByAirportCode Response positive test. LongitudeEperW")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest18(){
        Assertions.assertEquals(LONGITUDEEPERW, response.getLongitudeEperW(), "Incorrect LongitudeEperW value in response.");
    }

    @Test
    @DisplayName("ID:19 AirportInformationByAirportCode Response Negative test.")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest19(){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode("   " +AIRCODE);
        Assertions.assertEquals(EMPRSLENGHT, getAirResp.length(), "Not empty response.");
    }

    @Test
    @DisplayName("ID:20 AirportInformationByAirportCode Response Negative test.")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest20(){
        //getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode(AIRCODE+ "    ");
        Assertions.assertNotNull(getAirResp, "Empty response message.");
    }

/*    @Test
    @DisplayName("ID:21 AirportInformationByAirportCode Response Negative test. SoapException")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest21(){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode("    ");
        System.out.println(getAirResp.length());
        //Assertions.assertNotNull(getAirResp, "Empty response message.");
    }*/

    @Test
    @DisplayName("ID:22 AirportInformationByAirportCode Response Negative test.")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest22(){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode("123");
        Assertions.assertEquals(EMPRSLENGHT, getAirResp.length(), "Not empty response.");
    }

    @Test
    @DisplayName("ID:23 AirportInformationByAirportCode Response Negative test.")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest23(){
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode("!@#");
        Assertions.assertEquals(EMPRSLENGHT, getAirResp.length(), "Not empty response.");
    }



}