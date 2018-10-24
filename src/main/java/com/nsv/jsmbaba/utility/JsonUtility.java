package com.nsv.jsmbaba.utility;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nsv.jsmbaba.domain.Student;

import java.io.IOException;

public class JsonUtility {

    public static ObjectMapper objectMapper = new ObjectMapper();

    public static String convertJavaObjectToJson(Object object) throws JsonProcessingException {
        return objectMapper.writeValueAsString(object);

    }

    public static String convertJavaObjectToJsonPrettyPrint(Object object) throws JsonProcessingException {
        return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
    }

    public static Student convertJsonToJavaObject(String jsonString) throws IOException {
        return objectMapper.readValue(jsonString, Student.class);
    }
}
