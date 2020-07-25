package tech.appscale.apps.service.kafka.hellokafka.view;

public class ServiceProvider {
	
	String id;
	String name;
	String occupation;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ServiceProvider [id=").append(id).append(", name=").append(name).append(", occupation=").append(occupation)
				.append("]");
		return builder.toString();
	}

}
