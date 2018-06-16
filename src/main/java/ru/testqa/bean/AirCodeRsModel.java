package ru.testqa.bean;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.codehaus.jackson.annotate.JsonProperty;

import javax.xml.bind.annotation.*;
import java.util.List;

/**
 * @author Muflikhunov Roman
 */

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AirCodeRsModel {

    @XmlType
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class NewDataSet {
        private List<AirportCode> airportCode;
    }

    @XmlType
    @XmlAccessorType(XmlAccessType.FIELD)
    public static class AirportCode {
        private String AirportCode;
    }



}
