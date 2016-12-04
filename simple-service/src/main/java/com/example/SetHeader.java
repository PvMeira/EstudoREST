package com.example;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;

public class SetHeader implements ContainerResponseFilter{

	@Override
	public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
		System.out.println("FOK YOU");
		responseContext.getHeaders().add("Custom-Header", "PEDRO TDFRDRDRRD");
	}
	
	

}
