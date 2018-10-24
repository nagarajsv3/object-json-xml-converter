package com.nsv.jsmbaba.utility;

import com.nsv.jsmbaba.domain.Student;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;
import java.io.StringReader;
import java.io.StringWriter;

public class XmlUtility {

    public static  JAXBContext jaxbContext;

    static {
        try {
            jaxbContext = JAXBContext.newInstance(Student.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static String convertJavaObjectToXML(Object object) throws JAXBException {
        Marshaller jaxbmarshaller = jaxbContext.createMarshaller();
        jaxbmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        StringWriter sw = new StringWriter();
        jaxbmarshaller.marshal(object, sw);
        return sw.toString();
    }

    public static Student convertXmlToJavaObject(String xml) throws JAXBException {
        Unmarshaller jaxbunmarshaller = jaxbContext.createUnmarshaller();
        return (Student)jaxbunmarshaller.unmarshal(new StringReader(xml));
    }

}
