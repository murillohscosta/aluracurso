package br.com.alura.classes;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class main {

	public static void main(String[] args) throws URISyntaxException, Exception, InterruptedException {
		
		String url = "https://imdb-api.com/en/API/Top250Movies/k_eshudr5g";
		 HttpRequest request = HttpRequest.newBuilder()
	                .uri(new URI(url))
	                .GET()
	                .build();
		
		 HttpClient Client = HttpClient.newHttpClient();
	        
		 HttpResponse<String> response = Client.send(request, HttpResponse.BodyHandlers.ofString());
	        
	        
	        System.out.println(response.body());
		
	}

}
