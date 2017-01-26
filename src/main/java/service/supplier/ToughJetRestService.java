package main.java.service.supplier;

import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import main.java.service.supplier.exception.GenericRestException;
import main.java.service.supplier.model.ToughJetErrorResponse;
import main.java.service.supplier.model.ToughJetRequest;
import main.java.service.supplier.model.ToughJetResponse;

@Service
public class ToughJetRestService {
private RestTemplate restTemplate;
	
	private String url;
	
	private static final String GET_FLIGHT_END_POINT = "/get/flight";
	
	public ToughJetRestService() {
		this.restTemplate = new RestTemplate();
		this.url = "http://toughjet.co.uk";
	}
	
	private URI buildToughJet(String endPoint) throws GenericRestException{
		try {	
			return new URI(url + endPoint);
		}
		catch (URISyntaxException e) {
			// TODO Be more specific about the exception
			throw new GenericRestException();
		}
	}
	
	public ToughJetResponse getCrazyAirResponse(ToughJetRequest request) throws GenericRestException {
		
		URI uri = buildToughJet(GET_FLIGHT_END_POINT);
		
		HttpEntity<ToughJetRequest> body = new HttpEntity<ToughJetRequest>(request);

		ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.POST, body, String.class);
		
		return RestHelper.getInstance().processRequestBody(response, ToughJetResponse.class,ToughJetErrorResponse.class);
	}
}
