package ru.testqa.example;


import ru.testqa.NewDatasetAir;
import ru.testqa.modelsairports.Airport;
import ru.testqa.modelsairports.AirportSoap;
import javax.xml.bind.JAXB;
import java.io.StringReader;
import static ru.testqa.constants.Constants.ConstantLax.*;

public class AirportJavaSoupTest {

    public static void main(String[] args) {
        Airport airport = new Airport();
        AirportSoap airportSoap = airport.getAirportSoap();

        System.out.println("--------------------------------------");
        System.out.println("getAirportInformationByAirportCode");
        String airportInformationByAirportCode = airportSoap.getAirportInformationByAirportCode(AIRCODE);
        //System.out.println(airportInformationByAirportCode);
        System.out.println("---------- БЛЯ Я СДЕЛАЛ ЭТО! ---------");
        System.out.println("--------------------------------------");
        NewDatasetAir unmarshal = JAXB.unmarshal(new StringReader(airportInformationByAirportCode), NewDatasetAir.class);
        //JAXB.marshal(unmarshal, System.out);
        System.out.println("Airport code: " +unmarshal.getNewDataSets().get(0).getAirportCode());
        System.out.println("Airport name: " +unmarshal.getNewDataSets().get(0).getCityOrAirportName());
        System.out.println("Airport country: " +unmarshal.getNewDataSets().get(0).getCountry());
        System.out.println("Airport country code: " +unmarshal.getNewDataSets().get(0).getCountryAbbrviation());



        System.out.println("--------------------------------------");
        System.out.println("getAirportInformationByCityOrAirportName : ");
        System.out.println("--------------------------------------");
        String airportInformationByCity=airportSoap.getAirportInformationByCityOrAirportName(CITYAIRPORT);
        NewDatasetAir unmarsha2 = JAXB.unmarshal(new StringReader(airportInformationByCity), NewDatasetAir.class);
        System.out.println("Airport code: " +unmarsha2.getNewDataSets().get(0).getAirportCode());
        System.out.println("Airport name: " +unmarsha2.getNewDataSets().get(0).getCityOrAirportName());
        System.out.println("Airport country: " +unmarsha2.getNewDataSets().get(0).getCountry());
        System.out.println("Airport country code: " +unmarsha2.getNewDataSets().get(0).getCountryAbbrviation());
        System.out.println("--------------------------------------");

        //Долгий запрос, возвращает всю БД по стране
/*        System.out.println("--------------------------------------");
        System.out.println("getAirportInformationByCountry : ");
        System.out.println("--------------------------------------");
        String airportInformationByCountry = airportSoap.getAirportInformationByCountry(COUNTRY);
        NewDatasetAir unmarsha3 = JAXB.unmarshal(new StringReader(airportInformationByCountry), NewDatasetAir.class);
        System.out.println("Airport code: " +unmarsha3.getNewDataSets().get(0).getAirportCode());
        System.out.println("Airport name: " +unmarsha3.getNewDataSets().get(0).getCityOrAirportName());
        System.out.println("Airport country: " +unmarsha3.getNewDataSets().get(0).getCountry());
        System.out.println("Airport country code: " +unmarsha3.getNewDataSets().get(0).getCountryAbbrviation());
        System.out.println("--------------------------------------");*/

    }
}