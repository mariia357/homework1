package Serialization;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "country")
public class Country{
    private String name;
    private String city;
    private String street;
    private int building;

    public Country() {
    }

    public Country(String name, String city, String street, int building) {
        this.name = name;
        this.city = city;
        this.street = street;
        this.building = building;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", city=" + city +
                ", street='" + street + '\'' +
                ", building=" + building +
                '}';
    }

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String country) {
        this.name = country;
    }

    public String getCity() {
        return city;
    }

    @XmlElement(name = "city")
    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    @XmlElement(name = "street")
    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    @XmlElement(name = "building")
    public void setBuilding(int house) {
        this.building = house;
    }
}
