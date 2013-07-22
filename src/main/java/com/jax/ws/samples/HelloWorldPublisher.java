package com.jax.ws.samples;

import javax.xml.ws.Endpoint;
/**
 * <p>
 *     this will be the sample web service publisher class
 *     whose responsibility to publish the given web service
 * </p>
 */
public class HelloWorldPublisher {

    public static void main(String []args){
        //1st argument - web service publication URL
        //2nd argument - instance of SIB
        Endpoint.publish("http://localhost:6666/sayHello",new HelloWorldImpl());
    }
}
