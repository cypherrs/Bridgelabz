//Create a EarthVolumeCalculator class to calculate earth volume.
public class EarthVolumeCalculator {
    public static void main(String[] args) {
		//create variable radiusKm
        double radiusKm = 6378;
		
		//Create variable radiusMiles
        double radiusMiles = radiusKm * 0.6;
		
		//Create variable volumeKm3
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
		
		//Create variable volumeMiles3
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
		
		//Print volumeKm3 and volumeMiles3
        System.out.println("The volume of Earth in cubic kilometers is " + String.format("%.2f", volumeKm3) +
                           " and cubic miles is " + String.format("%.2f", volumeMiles3));
    }
}
