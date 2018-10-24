package com.nsv.jsmbaba.app;

import com.nsv.jsmbaba.domain.Address;
import com.nsv.jsmbaba.domain.Student;
import com.nsv.jsmbaba.utility.JsonUtility;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JsonApp {


    public static void main(String[] args) throws IOException {

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
        String jsonStrNaga = JsonUtility.convertJavaObjectToJsonPrettyPrint(naga);
        System.out.println(jsonStrNaga);

        System.out.println("*******************************************");
        Student nagaparsed = JsonUtility.convertJsonToJavaObject(jsonStrNaga);
        System.out.println(nagaparsed);


    }
}
