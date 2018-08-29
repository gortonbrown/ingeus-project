package ddos.model;

import ddos.productItem.ProductItem;
import org.springframework.beans.factory.annotation.Required;

public class Computer extends ProductItem {
	private String ipAddress;
	private String macAddress;
	private String location;

	@Override
	@Required
	public void setName(String name) {
		this.name = name;
	}

	@Override
	@Required
	public void dateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDateAdded() {
		return dateAdded;
	}
	
	public String getIpAddress() {
		return ipAddress;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public String getLocation() {
		return location;
	}

	@Required
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	@Required
	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
