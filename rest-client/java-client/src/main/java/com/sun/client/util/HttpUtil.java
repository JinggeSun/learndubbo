package com.sun.client.util;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class HttpUtil {

    public static String get(String baseUri) throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet request=new HttpGet(baseUri);
        request.setHeader("Content-Type", "application/json;charset=UTF-8");
        CloseableHttpResponse response = httpClient.execute(request);
        return parseResponse(response);
    }

    private static String parseResponse(CloseableHttpResponse response) throws IOException {
        int statusCode = response.getStatusLine().getStatusCode();
        String resp=null;
        if(statusCode==200) {
            resp= EntityUtils.toString(response.getEntity());
        }
        return resp;
    }
}
