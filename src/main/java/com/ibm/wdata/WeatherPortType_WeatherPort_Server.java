
package com.ibm.wdata;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.2.7.fuse-sb2-740016-redhat-00001
 * 2020-03-30T12:13:45.048-04:00
 * Generated source version: 3.2.7.fuse-sb2-740016-redhat-00001
 *
 */

public class WeatherPortType_WeatherPort_Server{

    protected WeatherPortType_WeatherPort_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new WeatherPortImpl();
        String address = "https://api.us.apiconnect.ibmcloud.com/apiconnected-getstarted/sb/wdata/current";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new WeatherPortType_WeatherPort_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}
