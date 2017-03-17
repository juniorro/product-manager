package controller;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import model.Person;
import service.PersonService;

@RestController
public class Controller {

	@Autowired
	private PersonService personService;

	@GetMapping("/hello")
	public String hello(){
		return "I am working. Please finish the controller";
	}
