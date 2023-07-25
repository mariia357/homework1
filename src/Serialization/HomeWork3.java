package Serialization;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

//Створіть клас, використовуючи SAXParser, де опишіть ієрархію XML файлу. Необхідно,
// щоб проект створював XML-файл і будував дерево (місто, назва вулиці, будинок).
// У місті використовуйте аттрибут (наприклад, <city size=”big>Kiev</city>).
public class HomeWork3 {

    public static void main(String[] args) {

        final String fileName = "D:\\restTable\\ProjectTest\\src\\Serialization\\address.xml";
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            DefaultHandler handler = new DefaultHandler() {

                boolean name = false;
                boolean city = false;
                boolean city_size = false;
                boolean street = false;
                boolean building = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    // Якщо тег має ім'я name, ми цей момент відзначаємо - почався тег name
                    if (qName.equalsIgnoreCase("name")) {
                        name = true;
                    }
                    if (qName.equalsIgnoreCase("city")) {
                        city = true;
                    }
                    if (qName.equalsIgnoreCase("street")) {
                        street = true;
                    }
                    if (qName.equalsIgnoreCase("building")) {
                        building = true;
                    }

                }

                @Override
                public void characters(char ch[], int start, int length) throws SAXException {
                    if (name) {
                        System.out.println("name: " + new String(ch, start, length));
                        name = false;
                    }
                    if (city) {
                        System.out.println("city: " + new String(ch, start, length));
                        city = false;
                    }
                    if (street) {
                        System.out.println("street: " + new String(ch, start, length));
                        street = false;
                    }
                    if (building) {
                        System.out.println("building: " + new String(ch, start, length));
                        building = false;
                    }
                }
            };
            saxParser.parse(fileName, handler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}



