package com.nsv.jsmbaba.app;

import com.nsv.jsmbaba.domain.Address;
import com.nsv.jsmbaba.domain.Student;
import com.nsv.jsmbaba.utility.JsonUtility;
import com.nsv.jsmbaba.utility.XmlUtility;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XmlApp {


    public static void main(String[] args) throws IOException, JAXBException {

        Address homeAddress = new Address("3 Capano Drive", "Newark");
        Address officeAddress = new Address("880 Powder Mill Rd", "Wilmington");
        List<Address> addressList = new ArrayList<Address>();
        addressList.add(homeAddress);
        addressList.add(officeAddress);


        System.out.println("*******************************************");
        Student naga = new Student("Naga","Nagaraj",addressList,Arrays.asList(new String[]{"Java", "Spring"}));
        System.out.println(naga);

        System.out.println("*******************************************");
        //String jsonStrNaga = JsonUtility.convertJavaObjectToJson(naga);
        String xmlStrNaga = XmlUtility.convertJavaObjectToXML(naga);
        System.out.println(xmlStrNaga);

        System.out.println("*******************************************");
        Student nagaparsed = XmlUtility.convertXmlToJavaObject(xmlStrNaga);
        System.out.println(nagaparsed);


    }
}
