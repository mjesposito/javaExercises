package day3core;

public class Animal4 {
	private String furColor = "defualt";
	
	public Animal4 makeNoise(String noise) {
		System.out.println(noise);
		return this;
	}

	public String getFurColor() {
		return furColor;
	}

	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}

}
