package ru.testqa;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Muflikhunov Roman
 */

@XmlRootElement(name="NewDataSet")
@XmlAccessorType(XmlAccessType.NONE)
public class NewDatasetAir {
    @XmlElement(name = "Table")
    @JsonProperty("Table")
    @JacksonXmlProperty(localName = "Table")
    private List<Table> newDataSets;


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

        @XmlElement(name = "CountryCode")
        @JsonProperty("CountryCode")
        @JacksonXmlProperty(localName = "CountryCode")
        private Integer countryCode;

        @XmlElement(name = "GMTOffset")
        @JsonProperty("GMTOffset")
        @JacksonXmlProperty(localName = "GMTOffset")
        private Integer gMTOffset;

        @XmlElement(name = "RunwayLengthFeet")
        @JsonProperty("RunwayLengthFeet")
        @JacksonXmlProperty(localName = "RunwayLengthFeet")
        private Integer runwayLengthFeet;

        @XmlElement(name = "RunwayElevationFeet")
        @JsonProperty("RunwayElevationFeet")
        @JacksonXmlProperty(localName = "RunwayElevationFeet")
        private Integer runwayElevationFeet;

        @XmlElement(name = "LatitudeDegree")
        @JsonProperty("LatitudeDegree")
        @JacksonXmlProperty(localName = "LatitudeDegree")
        private Integer latitudeDegree;

        @XmlElement(name = "LatitudeMinute")
        @JsonProperty("LatitudeMinute")
        @JacksonXmlProperty(localName = "LatitudeMinute")
        private Integer latitudeMinute;

        @XmlElement(name = "LatitudeSecond")
        @JsonProperty("LatitudeSecond")
        @JacksonXmlProperty(localName = "LatitudeSecond")
        private Integer latitudeSecond;

        @XmlElement(name = "LatitudeNpeerS")
        @JsonProperty("LatitudeNpeerS")
        @JacksonXmlProperty(localName = "LatitudeNpeerS")
        private String latitudeNpeerS;

        @XmlElement(name = "LongitudeDegree")
        @JsonProperty("LongitudeDegree")
        @JacksonXmlProperty(localName = "LongitudeDegree")
        private Integer longitudeDegree;

        @XmlElement(name = "LongitudeMinute")
        @JsonProperty("LongitudeMinute")
        @JacksonXmlProperty(localName = "LongitudeMinute")
        private Integer longitudeMinute;

        @XmlElement(name = "LongitudeSeconds")
        @JsonProperty("LongitudeSeconds")
        @JacksonXmlProperty(localName = "LongitudeSeconds")
        private Integer longitudeSeconds;

        @XmlElement(name = "LongitudeEperW")
        @JsonProperty("LongitudeEperW")
        @JacksonXmlProperty(localName = "LongitudeEperW")
        private String longitudeEperW;

        @Override
        public String toString() {
            return "Table{" +
                    "airportCode='" + airportCode + '\'' +
                    ", cityOrAirportName='" + cityOrAirportName + '\'' +
                    ", country='" + country + '\'' +
                    ", countryAbbrviation='" + countryAbbrviation + '\'' +
                    ", countryCode=" + countryCode +
                    ", gMTOffset=" + gMTOffset +
                    ", runwayLengthFeet=" + runwayLengthFeet +
                    ", runwayElevationFeet=" + runwayElevationFeet +
                    ", latitudeDegree=" + latitudeDegree +
                    ", latitudeMinute=" + latitudeMinute +
                    ", latitudeSecond=" + latitudeSecond +
                    ", latitudeNpeerS='" + latitudeNpeerS + '\'' +
                    ", longitudeDegree=" + longitudeDegree +
                    ", longitudeMinute=" + longitudeMinute +
                    ", longitudeSeconds=" + longitudeSeconds +
                    ", longitudeEperW='" + longitudeEperW + '\'' +
                    '}';
        }

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

        public Integer getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(Integer countryCode) {
            this.countryCode = countryCode;
        }

        public Integer getgMTOffset() {
            return gMTOffset;
        }

        public void setgMTOffset(Integer gMTOffset) {
            this.gMTOffset = gMTOffset;
        }

        public Integer getRunwayLengthFeet() {
            return runwayLengthFeet;
        }

        public void setRunwayLengthFeet(Integer runwayLengthFeet) {
            this.runwayLengthFeet = runwayLengthFeet;
        }

        public Integer getRunwayElevationFeet() {
            return runwayElevationFeet;
        }

        public void setRunwayElevationFeet(Integer runwayElevationFeet) {
            this.runwayElevationFeet = runwayElevationFeet;
        }

        public Integer getLatitudeDegree() {
            return latitudeDegree;
        }

        public void setLatitudeDegree(Integer latitudeDegree) {
            this.latitudeDegree = latitudeDegree;
        }

        public Integer getLatitudeMinute() {
            return latitudeMinute;
        }

        public void setLatitudeMinute(Integer latitudeMinute) {
            this.latitudeMinute = latitudeMinute;
        }

        public Integer getLatitudeSecond() {
            return latitudeSecond;
        }

        public void setLatitudeSecond(Integer latitudeSecond) {
            this.latitudeSecond = latitudeSecond;
        }

        public String getLatitudeNpeerS() {
            return latitudeNpeerS;
        }

        public void setLatitudeNpeerS(String latitudeNpeerS) {
            this.latitudeNpeerS = latitudeNpeerS;
        }

        public Integer getLongitudeDegree() {
            return longitudeDegree;
        }

        public void setLongitudeDegree(Integer longitudeDegree) {
            this.longitudeDegree = longitudeDegree;
        }

        public Integer getLongitudeMinute() {
            return longitudeMinute;
        }

        public void setLongitudeMinute(Integer longitudeMinute) {
            this.longitudeMinute = longitudeMinute;
        }

        public Integer getLongitudeSeconds() {
            return longitudeSeconds;
        }

        public void setLongitudeSeconds(Integer longitudeSeconds) {
            this.longitudeSeconds = longitudeSeconds;
        }

        public String getLongitudeEperW() {
            return longitudeEperW;
        }

        public void setLongitudeEperW(String longitudeEperW) {
            this.longitudeEperW = longitudeEperW;
        }
    }

    public List<Table> getNewDataSets() {
        return newDataSets;
    }

    public void setNewDataSets(List<Table> newDataSets) {
        this.newDataSets = newDataSets;
    }
}