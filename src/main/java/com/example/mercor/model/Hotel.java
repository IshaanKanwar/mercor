package com.example.mercor.model;

import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "hotel")
@Getter
@Setter
public class Hotel {

  private String name;
  private String city;
  private int rating;

  @Override
  public String toString() {
    return "Hotel{name='" + name + "', city='" + city + "', rating=" + rating + "}";
  }

}
