package com.contact;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class ApiTest {

	@Test
	public void testService() throws Exception {
		String eResponse = "[{\"id\":1,\"email\":\"ramesh@mail.com\",\"phone\":\"1111111\",\"userId\":1301},{\"id\":2,\"email\":\"suresh@mail.com\",\"phone\":\"2221111\",\"userId\":1301}]";
		
		 HttpUriRequest request = new HttpGet("http://localhost:9002/user/contact/1301");
		 
		 HttpResponse response = HttpClientBuilder.create().build().execute( request );
		 InputStream is = response.getEntity().getContent();
		 int d = is.read();
		 StringBuilder sb = new StringBuilder();
		 while(d != -1) {
			 sb.append((char)d);
			 d = is.read();
		 }
		 
		 assertEquals(eResponse, sb.toString());
	}
}
