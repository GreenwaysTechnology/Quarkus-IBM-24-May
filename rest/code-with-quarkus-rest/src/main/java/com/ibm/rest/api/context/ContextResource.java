package com.ibm.rest.api.context;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.UriInfo;

@Path("context")
public class ContextResource {
    @GET
    public String getUrlInfo(@Context UriInfo uriInfo) {
        var absPath = uriInfo.getAbsolutePath().toString();
        var baseUri = uriInfo.getBaseUri();
        System.out.println(absPath);
        System.out.println(baseUri);
        return "Context Info" + absPath.toString() + " " + baseUri.toString();
    }
    @GET
    @Path("headers")
    public String getHeaderInfo(@Context HttpHeaders httpHeaders) {
        return httpHeaders.getRequestHeaders().toString();
    }
}
