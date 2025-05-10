package conversordemoeda.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import conversordemoeda.model.MoedaDTO;

public class ApiService {

    private final HttpClient client = HttpClient.newHttpClient();

    public MoedaDTO responseMoedaDTO(String base_code, String target_code, Double amount)
	    throws IOException, InterruptedException {
	HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create(
			String.format("https://v6.exchangerate-api.com/v6/3ca2403c1161b83b57b115e8/pair/%s/%s/%s",
				base_code, target_code, String.valueOf(amount))))
		.build();
	HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

	JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();

	return new MoedaDTO(jsonObject.get("base_code").getAsString(), jsonObject.get("target_code").getAsString(),
		jsonObject.get("conversion_rate").getAsBigDecimal(),
		jsonObject.get("conversion_result").getAsBigDecimal());
    }
}
