package com.jax.ws.samples;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <p>
 *     this will be the SEI that declares all the web service methods
 * </p>
 */
@WebService
public interface HelloWorld {

    @WebMethod
    String printWelcomeMessage(String username);
}
