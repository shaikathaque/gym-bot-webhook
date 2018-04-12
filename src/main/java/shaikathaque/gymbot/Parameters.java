package shaikathaque.gymbot;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Parameters {
	@JsonProperty("unit-weight")
	private UnitWeight unit_weight;
	
	public Parameters() {
		
	}
	
	public Parameters(UnitWeight weight) {
		this.setUnit_weight(weight);
	}

	public UnitWeight getUnit_weight() {
		return unit_weight;
	}

	public void setUnit_weight(UnitWeight unit_weight) {
		this.unit_weight = unit_weight;
	}
	
}
