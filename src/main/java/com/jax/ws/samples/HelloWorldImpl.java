package com.jax.ws.samples;

import javax.jws.WebService;

/**
 * <p>
 *     this will be the SIB that implements all the web service methods
 *     declared in the SEI.
 * </p>
 */
@WebService(endpointInterface = "com.jax.ws.samples.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

    @Override
    public String printWelcomeMessage(String username) {
        return "Hello "+username;
    }
}
