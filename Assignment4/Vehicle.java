

public class Vehicle {
	 String typeOfVehicle;
	 String name;
	 float capacity;
	 int tyres;
	 
	 public void propertiesOfCar(String typeOfVehicle,float capacity){
	        this.typeOfVehicle = typeOfVehicle;
	        this.capacity = capacity;
	        System.out.println(" TypeofVehicle: "+this.typeOfVehicle+"  Capacity:  "+this.capacity);

	    }

	  public void propertiesOfCar(String name,String typeOfVehicle,float capacity){
	        this.name = name;
	        this.typeOfVehicle = typeOfVehicle;
	        this.capacity = capacity;
	        System.out.println(" Name:  "+this.name+"  TypeofVehicle: "+this.typeOfVehicle+"  Capacity:  "+this.capacity);

	    }
	  
	  public void propertiesOfCar(String name, int tyres,float capacity){
	        this.name = name;
	        this.tyres = tyres;
	        this.capacity = capacity;
	        System.out.println(" Name:  "+this.name+"  Tyres: "+this.tyres+"  Capacity:  "+this.capacity);

	    }

	public static void main(String[] args) {
		  Vehicle vh = new Vehicle();
	      vh.propertiesOfCar("SUV",20000);
	      vh.propertiesOfCar("Mercedes" ,"SUV",20000);
	      vh.propertiesOfCar("BMW",4, 50f);

		

	}

}
