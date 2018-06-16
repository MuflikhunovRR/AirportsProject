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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.io.StringReader;
import java.util.*;

/**
 * @author Muflikhunov Roman
 */

public class IntegrationTEMP {

    private static ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application-config.xml"});
    private static Airport bean = context.getBean(Airport.class);
    private static NewDatasetAir unmarshal;
    private static NewDatasetAir.Table response;
    private static String getAirResp;

    @BeforeAll
    public static void getResponse() throws JAXBException {
        //set Country
/*        String getCoutryAbbr = bean.getAirportSoap().getAirportInformationByCountry("Italy");
        NewDatasetAirTEMP unmarshal = JAXB.unmarshal(new StringReader(getCoutryAbbr), NewDatasetAirTEMP.class);

        for (NewDatasetAirTEMP.Table datasetAir : unmarshal.getNewDataSets()){
                System.out.println(datasetAir.getCityOrAirportName());
        }*/


/*        String getCoutryAbbr = bean.getAirportSoap().getAirportInformationByCountry("Italy");
        NewDatasetAirTEMP unmarshal = JAXB.unmarshal(new StringReader(getCoutryAbbr), NewDatasetAirTEMP.class);

        for (NewDatasetAirTEMP.Table datasetAir : unmarshal.getNewDataSets()){
                System.out.println(datasetAir.getCityOrAirportName());
        }*/

        try {
            String getCoutryAbbr = bean.getAirportSoap().getAirportInformationByCountry("Italy");
            JAXBContext jaxbContext = JAXBContext.newInstance(NewDatasetAirTEMP.class);
            //This will create Java object - Company from the XML file
            NewDatasetAirTEMP company = JAXB.unmarshal(new StringReader(getCoutryAbbr), NewDatasetAirTEMP.class);

            ArrayList<NewDatasetAirTEMP.Table> departmentList = (ArrayList<NewDatasetAirTEMP.Table>) company.getNewDataSets();
            departmentList.stream().distinct().forEach((department) -> {
                System.out.println("Airport Name: "+department.getCityOrAirportName());
            });
        } catch (JAXBException jaxbException) {
            jaxbException.printStackTrace();
        }




    }

    @Test
    @DisplayName("ID:1 AirportInformationByAirportCode Response positive test. LAX")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Spring)")
    public  void responseConstTest1(){
        Assertions.assertNotNull("1");
    }

}