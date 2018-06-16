package ru.testqa;


import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testqa.modelsairports.Airport;
import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;


import static ru.testqa.constants.Constants.ConstantLax.*;

/**
 * @author Muflikhunov Roman
 */

public class LaxtRqSpringIntegrationTestExample {

    private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-config.xml"});
    private static Airport bean = context.getBean(Airport.class);
    private static NewDatasetAir unmarshal;
    private static NewDatasetAir.Table response;
    private static String getAirResp;

    @BeforeAll
    public static void getResponse() {
        getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode(AIRCODE);
        unmarshal = JAXB.unmarshal(new StringReader(getAirResp), NewDatasetAir.class);
        response = unmarshal.getNewDataSets().get(0);

        StringWriter sw = new StringWriter();
        JAXB.marshal(getAirResp, sw);
        //System.out.println(sw.toString());

        //1 set AirportCode get CityOrAirportName
        String airportCode = unmarshal.getNewDataSets().get(0).getCityOrAirportName();
        System.out.println(unmarshal.getNewDataSets().get(0).getCityOrAirportName());

        //2 set CityOrAirportName get Country
        String getCountry = bean.getAirportSoap().getAirportInformationByCityOrAirportName(airportCode);
        NewDatasetAir unmarshal = JAXB.unmarshal(new StringReader(getCountry), NewDatasetAir.class);
        String country = unmarshal.getNewDataSets().get(0).getCountry();
        System.out.println(country);

        //3 set Country get CountryAbbrviation
        String getCoutryAbbr = bean.getAirportSoap().getAirportInformationByCountry(country);
        NewDatasetAir unmarshal1 = JAXB.unmarshal(new StringReader(getCoutryAbbr), NewDatasetAir.class);

        //1th method input (Use operator FOR)
/*        for (NewDatasetAir.Table datasetAir : unmarshal1.getNewDataSets()){
            System.out.println(datasetAir.getCityOrAirportName());
        }*/

        //2nd method input (Use ->)
        ArrayList<NewDatasetAir.Table> tableArrayList = (ArrayList<NewDatasetAir.Table>) unmarshal1.getNewDataSets();
        tableArrayList.stream().distinct().forEach((airports) -> {
            System.out.println("Airport Name: "+airports.getCityOrAirportName());
        });


        String countryAbbrviation = unmarshal1.getNewDataSets().get(0).getCountryAbbrviation();
        System.out.println(countryAbbrviation);


        //4 set CountryAbbrviation and get data for assert test block
        String airByISOCode = bean.getAirportSoap().getAirportInformationByISOCountryCode(countryAbbrviation);
        NewDatasetAir unmarshal2 = JAXB.unmarshal(new StringReader(airByISOCode), NewDatasetAir.class);
        NewDatasetAir.Table finTable = unmarshal2.getNewDataSets().get(0);
        System.out.println("----------- Final data --------------");
        System.out.println(finTable.getAirportCode());
        System.out.println(finTable.getCityOrAirportName());
        System.out.println(finTable.getCountry());
        System.out.println(finTable.getCountryAbbrviation());
        System.out.println(finTable.getCountryCode());
        System.out.println(finTable.getAirportCode());
        System.out.println(finTable.getgMTOffset());
        System.out.println(finTable.getRunwayLengthFeet());



    }

    @Test
    @DisplayName("ID:1 AirportInformationByAirportCode Response positive test. LAX")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest1(){
        Assertions.assertNotNull(response, "Empty response message.");
    }

}