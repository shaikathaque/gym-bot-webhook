package shaikathaque.gymbot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlateCalculator {
	private int weight;
	private double[] plates = {45, 25, 10, 5, 2.5};
	
	public PlateCalculator() {
		
	}
	
	public PlateCalculator(int number) {
		this.setWeight(number);		
	}
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String calculatePlates() {
		if (this.weight < 45) {
			return "Please enter a valid target weight!";
		}
		
		if (this.weight == 45 ) {
			return "Use an empty barbell!";
		}
		
		ArrayList<Double> finalPlates = new ArrayList<Double>();
		double remainingWeight = this.weight - 45;
		
		int i = 0;
		while (remainingWeight > 0) {
			if (remainingWeight >= plates[i] * 2) {
				finalPlates.add(this.plates[i]);
				remainingWeight -= this.plates[i] * 2;
			}	else {
				i++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("Use these plates on each side: ");
		for (Double weight : finalPlates) {
			sb.append("|");
			if (Math.floor(weight) == weight) {
				sb.append(weight.intValue());
			}	else {
				sb.append(weight);
			}
			sb.append("|");
			
		}
		return sb.toString();
	}
	
	public String buildErrorMessage() {
		return "error message";
	}

}
