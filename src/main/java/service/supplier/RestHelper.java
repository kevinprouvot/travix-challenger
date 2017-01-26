package main.java.service.supplier;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.databind.ObjectMapper;

import main.java.service.supplier.exception.GenericRestException;

public class RestHelper {

	private static RestHelper instance;

	private final Logger LOGGER = LogManager.getLogger(RestHelper.class);

	private RestHelper() {
	}

	public static RestHelper getInstance() {
		if (instance == null) {
			instance = new RestHelper();
		}
		return instance;
	}

	public <S, T> T processRequestBody(ResponseEntity<String> response, Class<T> responseClass,
			Class<S> errorClass) throws GenericRestException {

		String responseBody = response.getBody();
		HttpStatus status = response.getStatusCode();
		HttpStatus.Series series = status.series();
		ObjectMapper objectMapper = new ObjectMapper();

		T result = null;

		try {
			if (HttpStatus.OK.equals(status)) {
				return objectMapper.readValue(responseBody, responseClass);
			} else {
				if (HttpStatus.Series.CLIENT_ERROR.equals(series)) {
					LOGGER.error("Client side error");
					String logRequest = objectMapper.writeValueAsString(responseBody);
					LOGGER.error("Response :");
					LOGGER.error(logRequest);
					S error = objectMapper.readValue(responseBody, errorClass);
					// TODO Be more specific
					GenericRestException ex = new GenericRestException();
					throw ex;
				}
				if (HttpStatus.Series.SERVER_ERROR.equals(series)) {
					LOGGER.error("Server side error");
					// TODO Be more specific
					GenericRestException ex = new GenericRestException();
					throw ex;
				}
			}
		} catch (IOException e) {
			LOGGER.error("Error while parsing eror message");
			LOGGER.error(e);
			// TODO Be more specific
			throw new GenericRestException();
		}

		return result;
	}
}
