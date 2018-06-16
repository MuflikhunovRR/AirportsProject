package ru.testqa.bean;

public class AirportDb {

    private Integer id;
    private String AirportCode;
    private String CityOrAirportName;
    private String Country;
    private String CountryAbbrviation;
    private Integer CountryCode;
    private Integer GMTOffset;
    private Integer RunwayLengthFeet;
    private Integer RunwayElevationFeet;
    private Integer LatitudeDegree;
    private Integer LatitudeMinute;
    private Integer LatitudeSecond;
    private String LatitudeNpeerS;
    private Integer LongitudeDegree;
    private Integer LongitudeMinute;
    private Integer LongitudeSeconds;
    private String LongitudeEperW;

    public AirportDb() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAirportCode() {
        return AirportCode;
    }

    public void setAirportCode(String airportCode) {
        AirportCode = airportCode;
    }

    public String getCityOrAirportName() {
        return CityOrAirportName;
    }

    public void setCityOrAirportName(String cityOrAirportName) {
        CityOrAirportName = cityOrAirportName;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getCountryAbbrviation() {
        return CountryAbbrviation;
    }

    public void setCountryAbbrviation(String countryAbbrviation) {
        CountryAbbrviation = countryAbbrviation;
    }

    public Integer getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(Integer countryCode) {
        CountryCode = countryCode;
    }

    public Integer getGMTOffset() {
        return GMTOffset;
    }

    public void setGMTOffset(Integer GMTOffset) {
        this.GMTOffset = GMTOffset;
    }

    public Integer getRunwayLengthFeet() {
        return RunwayLengthFeet;
    }

    public void setRunwayLengthFeet(Integer runwayLengthFeet) {
        RunwayLengthFeet = runwayLengthFeet;
    }

    public Integer getRunwayElevationFeet() {
        return RunwayElevationFeet;
    }

    public void setRunwayElevationFeet(Integer runwayElevationFeet) {
        RunwayElevationFeet = runwayElevationFeet;
    }

    public Integer getLatitudeDegree() {
        return LatitudeDegree;
    }

    public void setLatitudeDegree(Integer latitudeDegree) {
        LatitudeDegree = latitudeDegree;
    }

    public Integer getLatitudeMinute() {
        return LatitudeMinute;
    }

    public void setLatitudeMinute(Integer latitudeMinute) {
        LatitudeMinute = latitudeMinute;
    }

    public Integer getLatitudeSecond() {
        return LatitudeSecond;
    }

    public void setLatitudeSecond(Integer latitudeSecond) {
        LatitudeSecond = latitudeSecond;
    }

    public String getLatitudeNpeerS() {
        return LatitudeNpeerS;
    }

    public void setLatitudeNpeerS(String latitudeNpeerS) {
        LatitudeNpeerS = latitudeNpeerS;
    }

    public Integer getLongitudeDegree() {
        return LongitudeDegree;
    }

    public void setLongitudeDegree(Integer longitudeDegree) {
        LongitudeDegree = longitudeDegree;
    }

    public Integer getLongitudeMinute() {
        return LongitudeMinute;
    }

    public void setLongitudeMinute(Integer longitudeMinute) {
        LongitudeMinute = longitudeMinute;
    }

    public Integer getLongitudeSeconds() {
        return LongitudeSeconds;
    }

    public void setLongitudeSeconds(Integer longitudeSeconds) {
        LongitudeSeconds = longitudeSeconds;
    }

    public String getLongitudeEperW() {
        return LongitudeEperW;
    }

    public void setLongitudeEperW(String longitudeEperW) {
        LongitudeEperW = longitudeEperW;
    }

    @Override
    public String toString() {
        return "AirportDb{" +
                "id=" + id +
                ", AirportCode='" + AirportCode + '\'' +
                ", CityOrAirportName='" + CityOrAirportName + '\'' +
                ", Country='" + Country + '\'' +
                ", CountryAbbrviation='" + CountryAbbrviation + '\'' +
                ", CountryCode=" + CountryCode +
                ", GMTOffset=" + GMTOffset +
                ", RunwayLengthFeet=" + RunwayLengthFeet +
                ", RunwayElevationFeet=" + RunwayElevationFeet +
                ", LatitudeDegree=" + LatitudeDegree +
                ", LatitudeMinute=" + LatitudeMinute +
                ", LatitudeSecond=" + LatitudeSecond +
                ", LatitudeNpeerS='" + LatitudeNpeerS + '\'' +
                ", LongitudeDegree=" + LongitudeDegree +
                ", LongitudeMinute=" + LongitudeMinute +
                ", LongitudeSeconds=" + LongitudeSeconds +
                ", LongitudeEperW='" + LongitudeEperW + '\'' +
                '}';
    }
}
