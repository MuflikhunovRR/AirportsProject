package ru.testqa.bean;

public class QueryStore {

    public static String getAirDataDb(){
        return "SELECT * FROM WorldAirports WHERE AirportCode = ?";
    }

}
