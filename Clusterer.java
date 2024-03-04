//creates clusters

import java.util.*;

public class Clusterer {

	private HashMap<Person, Double> data;
	protected HashMap<Person, TScore> unhealthy;
	protected HashMap<Person, TScore> healthy;
	protected HashMap<Person, TScore> superhealthy;

	public Clusterer(HashMap<Person, Double> data) {
		this.data = data;
		unhealthy = new HashMap<>();
		healthy = new HashMap<>();
		superhealthy = new HashMap<>();

	}

	public void cluster() {

		for (Map.Entry<Person, Double> entry : data.entrySet()) {
				if (entry.getValue() <= 35.0) {
					unhealthy.put(entry.getKey(), new TScore(entry.getValue()));
				} else if (entry.getValue() > 35.0 && entry.getValue() <= 65.0) {
					healthy.put(entry.getKey(), new TScore(entry.getValue()));
				} else if (entry.getValue() > 65.0) {
					superhealthy.put(entry.getKey(), new TScore(entry.getValue()));
				}
			
		}

	}
	
	public void printClusters() {
		System.out.println("Super Healthy Cluster: ");
		for(Map.Entry<Person, TScore> entry : superhealthy.entrySet()) {
			System.out.println("Person ID: " + entry.getKey().ID + "\tTScore " + entry.getValue().tscore);
		}
		
		System.out.println("\nHealthy Cluster: ");
		for(Map.Entry<Person, TScore> entry : healthy.entrySet()) {
			System.out.println("Person ID: " + entry.getKey().ID + "\tTScore " + entry.getValue().tscore);
		}
		
		System.out.println("\nUnhealthy Cluster: ");
		for(Map.Entry<Person, TScore> entry : unhealthy.entrySet()) {
			System.out.println("Person ID: " + entry.getKey().ID + "\tTScore " + entry.getValue().tscore);
		}
	}

}
