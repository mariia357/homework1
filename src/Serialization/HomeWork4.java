package Serialization;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
public class HomeWork4 {

    public static void main(String[] args) {
        Address address = new Address();
        address.add(new Country("Ukraine", "Kyiv", "Khreshchatyk", 1));
        address.add(new Country("Austria", "Graz", "Stalhofstrasse", 2));

        try {

            File file = new File("D:\\restTable\\ProjectTest\\src\\Serialization\\address.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Address.class);

            Marshaller mar = jaxbContext.createMarshaller();


            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            mar.marshal(address, file);
            mar.marshal(address, System.out);

            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            address = (Address) unmar.unmarshal(file);
            System.out.println(address);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}

