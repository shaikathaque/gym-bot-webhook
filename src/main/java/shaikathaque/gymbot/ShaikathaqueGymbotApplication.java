package shaikathaque.gymbot;

import java.util.Map;

import org.json.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ShaikathaqueGymbotApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShaikathaqueGymbotApplication.class, args);
	}
		
	@RequestMapping(value="/calculatePlates", method=RequestMethod.POST)
	@ResponseBody
	public DialogflowResponse CalculatePlates(@RequestBody DialogflowRequest payload) {
		int weight = payload.getQueryResult().getParameters().getUnit_weight().getAmount();
		String responseString = new PlateCalculator(weight).calculatePlates();
		
		DialogflowResponse responseObj = new DialogflowResponse(responseString);
		return responseObj;
	}
}
