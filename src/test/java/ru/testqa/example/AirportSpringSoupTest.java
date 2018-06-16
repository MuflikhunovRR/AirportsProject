package ru.testqa.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.testqa.NewDatasetAir;
import ru.testqa.modelsairports.Airport;

import javax.xml.bind.JAXB;
import java.io.StringReader;

public class AirportSpringSoupTest {
    private static final Logger LOGGER = LoggerFactory.getLogger(AirportSpringSoupTest.class);
    public static void main(String[] args)  {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-config.xml"});
        Airport bean = context.getBean(Airport.class);
        LOGGER.debug("Start request for VIN={}", bean);
        System.out.println(bean.getAirportSoap().getAirportInformationByAirportCode("LAX"));
        String getAirResp = bean.getAirportSoap().getAirportInformationByAirportCode("LAX");

        NewDatasetAir unmarshal = JAXB.unmarshal(new StringReader(getAirResp), NewDatasetAir.class);
        System.out.println("Airport code: " +unmarshal.getNewDataSets().get(0).getAirportCode());
        System.out.println("Airport name: " +unmarshal.getNewDataSets().get(0).getCityOrAirportName());
        System.out.println("Airport country: " +unmarshal.getNewDataSets().get(0).getCountry());
        System.out.println("Airport country code: " +unmarshal.getNewDataSets().get(0).getCountryAbbrviation());

    }
}
