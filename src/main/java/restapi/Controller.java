package restapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {
		
	@GetMapping("/getMovie")
	public String getMovie(@RequestParam String title,@RequestParam(required=false) String year,@RequestParam String plotType ){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://www.omdbapi.com/?t="+title+"&y="+year+"&plot="+plotType+"&apikey=fcd9ca9d", String.class);
		return response.getBody();
	}
	
	@GetMapping("/getBook")
	public String getBook(@RequestParam String isbn) {		
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity("http://openlibrary.org/isbn/"+isbn+".json", String.class);
		return response.getBody();	
	}
	
}
