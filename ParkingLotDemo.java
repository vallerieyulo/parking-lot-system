public class ParkingLotDemo {

    public static void main(String[] args){

        int nfloors = 3;
        int noOfSlotsPerFlr = 4;
        ParkingLot parkingLot = new ParkingLot("PR1234", nfloors, noOfSlotsPerFlr);
    
        System.out.println("no of open slots for car: " + parkingLot.getNoOfOpenSlots("car"));     
    
        String ticket1 = parkingLot.parkVehicle("car", "MH-03", "red");
        String ticket2 = parkingLot.parkVehicle("car", "MH-04", "purple");
    
        System.out.println("After parking:");
        

        String ticket3 = parkingLot.parkVehicle("truck", "TH-03", "red");
        String ticket4 = parkingLot.parkVehicle("bike", "BH-04", "purple");
        String ticket5 = parkingLot.parkVehicle("car", "CH-04", "purple");
        String ticket6 = parkingLot.parkVehicle("truck", "TH-03", "red");

        
    
        System.out.println("After parking car:");
        parkingLot.displayOccupiedSlots("car");

        System.out.println("After parking truck:");
        parkingLot.displayOccupiedSlots("truck");

        System.out.println("After parking bike:");
        parkingLot.displayOccupiedSlots("bike");
    }
}
