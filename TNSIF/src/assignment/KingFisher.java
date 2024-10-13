package assignment;

class KingFisher implements Airfare{
	private int hours;
	private double costPerHour;
	
	//default constructor
		public KingFisher() {
			hours=0;
			costPerHour=0.0;
		}
		
		//parameterized constructor
		public KingFisher(int hours,double costPerHour) {
			this.hours = hours;
			this.costPerHour = costPerHour;
		}
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public double getCostPerHour() {
		return costPerHour;
	}
	public void setCostPerHour(double costPerHour) {
		this.costPerHour = costPerHour;
	}
	
	//implementation of interface methods
	public double calculateAmount() {
		return hours*costPerHour*4;
	}
}
