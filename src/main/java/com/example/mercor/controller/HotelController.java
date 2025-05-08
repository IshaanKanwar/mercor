package com.example.mercor.controller;

import com.example.mercor.model.Hotel;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@RestController
@Log4j2
public class HotelController {

  private static final String MOCK_XML = """
          <hotel>
            <name>Grand Hotel</name>
            <city>Paris</city>
            <rating>5</rating>
           </hotel>
          """;

  @GetMapping("/convertXml")
  public Hotel convertXml() throws JAXBException {
    JAXBContext context = JAXBContext.newInstance(Hotel.class);
    Unmarshaller unmarshaller = context.createUnmarshaller();
    StringReader reader = new StringReader(MOCK_XML);

    Hotel hotel = (Hotel) unmarshaller.unmarshal(reader);

    log.info("Converted Hotel: {}", hotel);

    return hotel;
  }
}
