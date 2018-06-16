package ru.testqa;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;


/**
 * @author Muflikhunov Roman
 */

@XmlRootElement(name="NewDataSet")
@XmlAccessorType(XmlAccessType.NONE)
public class NewDatasetAirTEMP {
    @XmlElement(name = "Table")
    @JsonProperty("Table")
    @JacksonXmlProperty(localName = "Table")
    private ArrayList<Table> newDataSets = new ArrayList<Table>();

    public ArrayList<Table> getNewDataSets() {
        return newDataSets;
    }

    public void setNewDataSets(ArrayList<Table> newDataSets) {
        this.newDataSets = newDataSets;
    }

    @XmlType
    @XmlAccessorType(XmlAccessType.NONE)
    public static class Table {
        @XmlElement(name = "AirportCode")
        @JsonProperty("AirportCode")
        @JacksonXmlProperty(localName = "AirportCode")
        private String airportCode;

        @XmlElement(name = "CityOrAirportName")
        @JsonProperty("CityOrAirportName")
        @JacksonXmlProperty(localName = "CityOrAirportName")
        private String cityOrAirportName;

        @XmlElement(name = "Country")
        @JsonProperty("Country")
        @JacksonXmlProperty(localName = "Country")
        private String country;

        @XmlElement(name = "CountryAbbrviation")
        @JsonProperty("CountryAbbrviation")
        @JacksonXmlProperty(localName = "CountryAbbrviation")
        private String countryAbbrviation;

        public String getAirportCode() {
            return airportCode;
        }

        public void setAirportCode(String airportCode) {
            this.airportCode = airportCode;
        }

        public String getCityOrAirportName() {
            return cityOrAirportName;
        }

        public void setCityOrAirportName(String cityOrAirportName) {
            this.cityOrAirportName = cityOrAirportName;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCountryAbbrviation() {
            return countryAbbrviation;
        }

        public void setCountryAbbrviation(String countryAbbrviation) {
            this.countryAbbrviation = countryAbbrviation;
        }
    }




}