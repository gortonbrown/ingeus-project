package ddos.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import ddos.service.*;
import ddos.model.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/ddos-service")
public class ApplicationController {
	
	@Autowired
	private ComputerService service;

	@GetMapping("/display-items")
	public @ResponseBody List<Computer> displayItems() {
		for (Object o : service.getComputers()) {
			Computer computer = (Computer)o;
			System.out.println("->computer.getIpAddress(): "+computer.getIpAddress());
			System.out.println("->computer.getMacAddress(): "+computer.getMacAddress());
			System.out.println("->computer.getDateAdded(): "+computer.getDateAdded());
			System.out.println("->computer.getLocation(): "+computer.getLocation());
		}
		return service.getComputers();
	}

	@PostMapping(value = "/add-item")
	public @ResponseBody boolean addItem(@RequestBody Computer computer) {
		if (computer != null || 
				(computer.getName() != null &&
				computer.getIpAddress() != null &&
				computer.getMacAddress() != null &&
				computer.getDateAdded() != null)) {
			int id = service.getComputers().size()+1;
			System.out.println("+computer.getIpAddress(): "+computer.getIpAddress());
			System.out.println("+computer.getMacAddress(): "+computer.getMacAddress());
			System.out.println("+computer.getDateAdded(): "+computer.getDateAdded());
			System.out.println("+computer.getLocation(): "+computer.getLocation());
			computer.setId(id);
			service.addComputer(computer);
			return true;
		} else {
			return false;
		}
	}
	
	@PostMapping(value = "/delete-item")
	public void deleteItem(@RequestBody String computerid) {
		if (computerid != null) {
			Integer computerId = Integer.valueOf(computerid);
			service.deleteComputer(computerId);
		}
	}
}
