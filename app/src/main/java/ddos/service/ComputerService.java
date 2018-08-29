package ddos.service;

import java.util.ArrayList;
import ddos.model.Computer;
import org.springframework.stereotype.Component;

@Component
public class ComputerService {

	private ArrayList<Computer> itemStorage = new ArrayList<Computer>();
	
	public void addComputer(Computer item) {
		itemStorage.add(item);
	}

	public ArrayList<Computer> getComputers() {
		return itemStorage;
	}

	public void deleteComputer(Integer id) {
		for (Computer item : itemStorage) {
			if (item.getId().equals(id))
				itemStorage.remove(item);
		}
	}
}
