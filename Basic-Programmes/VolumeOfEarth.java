public class VolumeOfEarth{
    public static void main(String[] args){
	int r_inKm = 6378;
	double volume_inKm = (4.0/3)* (3.14)* r_inKm* r_inKm* r_inKm;
	double r_inMiles = r_inKm * 0.621371;
	double volume_inMiles = (4.0/3)* (3.14)* r_inMiles* r_inMiles* r_inMiles;
	System.out.println("The volume of earth in cubic kilometers is " + volume_inKm + " and cubic miles is "+ volume_inMiles);
	}
}	