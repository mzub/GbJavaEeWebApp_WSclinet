package ru.geekbrains.shop;

import java.net.MalformedURLException;
import java.net.URL;

public class WsClient {
    public static void main(String[] args) throws MalformedURLException {
        URL wsUrl = new URL("http://localhost:8080/GbJavaEeWebApp2/ProductService/ProductServiceImpl?wsdl");
        ProductService productService = new ProductService(wsUrl);
        ProductServiceWs servicePort = productService.getProductServiceImplPort();

        servicePort.findAll().forEach(p -> System.out.println(p.getName()))

    }
}
