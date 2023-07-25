package Serialization;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "address")
public class Address {

    @XmlElement(name = "country")
    private List<Country> countries = new ArrayList<>();

    public void add(Country country) {
        countries.add(country);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(countries.toArray());
    }
}

