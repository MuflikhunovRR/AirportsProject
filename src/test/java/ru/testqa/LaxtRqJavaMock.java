package ru.testqa;


import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.testqa.modelsairports.AirportSoap;
import static org.mockito.Mockito.*;


import static ru.testqa.constants.Constants.ConstantLax.*;

/**
 * @author Muflikhunov Roman
 */

public class LaxtRqJavaMock {
    private NewDatasetAir unmarshal;
    private NewDatasetAir.Table response;
    private AirportSoap airportSoap;

    @BeforeEach
    public void getResponse(){
        //Airport airport = new Airport();
        //AirportSoap airportSoap = airport.getAirportSoap();
/*        String airportInformationByAirportCode = airportSoap.getAirportInformationByAirportCode(AIRCODE);
        unmarshal = JAXB.unmarshal(new StringReader(airportInformationByAirportCode), NewDatasetAir.class);
        response = unmarshal.getNewDataSets().get(0);*/

        this.airportSoap = mock(AirportSoap.class);
        when(airportSoap.getAirportInformationByAirportCode(anyString()))
                .thenReturn(TEST);

    }

    @Test
    @DisplayName("AirportInformationByAirportCode Response positive test.")
    @Description("Test AirportInformationByAirportCode Request and Response. Assertion response web service with constant data. (Java)")
    public  void responseConstTest(){

        Assertions.assertEquals(TEST, airportSoap.getAirportInformationByAirportCode("123"));
/*        Assertions.assertNotNull(response, "Empty response message.");
        Assertions.assertEquals(AIRCODE, response.getAirportCode(), "Incorrect AirportCode value in response.");
        Assertions.assertEquals(CITYAIRPORT, response.getCityOrAirportName(), "Incorrect CityOrAirportName value in response.");
        Assertions.assertEquals(COUNTRY, response.getCountry(), "Incorrect Country value in response.");
        Assertions.assertEquals(COUNTRYABBR, response.getCountryAbbrviation(), "Incorrect CountryAbbrviation value in response.");
        Assertions.assertEquals(COUNTRYCODE, response.getCountryCode(), "Incorrect CountryCode value in response.");
        Assertions.assertEquals(GMTOFFSET, response.getgMTOffset(), "Incorrect GMTOffset value in response.");
        Assertions.assertEquals(RUNWAYLENGTHFEET, response.getRunwayLengthFeet(), "Incorrect RunwayLengthFeet value in response.");
        Assertions.assertEquals(RUNWAYELEVATIONFEET, response.getRunwayElevationFeet(), "Incorrect RunwayElevationFeet value in response.");
        Assertions.assertEquals(LATITUDEDEG, response.getLatitudeDegree(), "Incorrect LatitudeDegree value in response.");
        Assertions.assertEquals(LATITUDEMIN, response.getLatitudeMinute(), "Incorrect LatitudeMinute value in response.");
        Assertions.assertEquals(LATITUDESEC, response.getLatitudeSecond(), "Incorrect LatitudeSecond value in response.");
        Assertions.assertEquals(LATITUDENPEERS, response.getLatitudeNpeerS(), "Incorrect LatitudeNpeerS value in response.");
        Assertions.assertEquals(LONGITUDEDEG, response.getLongitudeDegree(), "Incorrect LongitudeDegree value in response.");
        Assertions.assertEquals(LONGITUDEMIN, response.getLongitudeMinute(), "Incorrect LongitudeMinute value in response.");
        Assertions.assertEquals(LONGITUDESEC, response.getLongitudeSeconds(), "Incorrect LongitudeSeconds value in response.");
        Assertions.assertEquals(LONGITUDEEPERW, response.getLongitudeEperW(), "Incorrect LongitudeEperW value in response.");*/
    }

}