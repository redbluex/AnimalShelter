package pl.redblue.shelter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SiteController {

	@Autowired
	AnimalService animalService;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/newanimal")
	public String siteform(Model model) {
		model.addAttribute("animal", new Animal());
		return "addnewanimal";
	}
	
	@PostMapping("newanimal")
	public String siteformpost(@ModelAttribute Animal animal) {
		animalService.addNewAnimal(animal);
		return "index";
	}
	
	
	
	
}
