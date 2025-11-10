public class Main3 {
    public static void main(String[] args) {
        MobilePhone MobilePhone1 = new MobilePhone("brand", "model", 280, 52, true);
        System.out.println(MobilePhone1.displayInfo());
		
		System.out.println(" ");
		MobilePhone1.powerOn();
        System.out.println(MobilePhone1.displayInfo());
		
		System.out.println(" ");
		MobilePhone1.powerOff();
		System.out.println(MobilePhone1.displayInfo());
		
        System.out.println(" ");
		MobilePhone1.chargeBattery(10);
		System.out.println(MobilePhone1.displayInfo());
		
		System.out.println(" ");
		MobilePhone1.useBattery(20);
		System.out.println(MobilePhone1.displayInfo());
    } 
}