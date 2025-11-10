public class MobilePhone{
	private String brand;
	private String model;
	private int storageGB;
	private int batteryLevel;
	private boolean isPoweredOn;
	
	public MobilePhone(){
		this("brand", "model", 280, 52, true);
	}
	
	public MobilePhone(String brand, String model){
		this(brand, model, 280, 52, true);
	}
	
	public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn){
		this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoweredOn = isPoweredOn;
	}
	
	public String displayInfo(){
		String result = brand + "\n" + model + "\n" + storageGB + "\n" + batteryLevel + "\n" + isPoweredOn;
		return result;
	}
	
	public void powerOn(){
        isPoweredOn = true;
    }
	
	public void powerOff(){
        isPoweredOn = false;
    }
	
	public void chargeBattery(int percent){
		if (batteryLevel + percent >= 100){
			batteryLevel = 100;
		}else{
			batteryLevel += percent;
		}
	}
	
	public void useBattery(int percent){
		if (batteryLevel - percent <= 0){
			batteryLevel = 0;
		}else{
			batteryLevel -= percent;
		}
    }
}