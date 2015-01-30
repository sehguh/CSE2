//Ryan Hughes
//1/30/15
//CSE 002
//Cyclometer program that measures and prints the data of a cyclomter on a bicycle

    public class Cyclometer {
        
        public static void main(String [] args) {
            	   	int secsTrip1=480;  //time for trip 1
       	            int secsTrip2=3220;  //time for trip 2
		            int countsTrip1=1561;  //rotation counts for trip 1
		            int countsTrip2=9037; //rotation counts for trip 2
		           
		           double wheelDiameter=27.0,  //declares wheel diameter
  	                PI=3.14159, //creates number for pi
  	                feetPerMile=5280,  //declares feet per mile
  	                inchesPerFoot=12,   //declares inches per foot
  	                secondsPerMinute=60;  //declares seconds per minute
	                double distanceTrip1; 
	                double distanceTrip2;
	                double totalDistance;  //creates double values for the trip distances
	                
	                System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute) +" minutes and had "+ countsTrip1 +" counts."); //prints data for trip 1
	                System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute) +" minutes and had "+ countsTrip2 +" counts."); //prints data for trip 2
	                
	                distanceTrip1=countsTrip1*wheelDiameter*PI; // Above gives distance in inches
    	                                                        //(for each count, a rotation of the wheel travels
    	                                                        //the diameter in inches times PI)
	                distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	                distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; //computes distance for trip 1
	                totalDistance=distanceTrip1+distanceTrip2; //compute the total distance
	                
	                  System.out.println("Trip 1 was "+ distanceTrip1 +" miles"); //prints out the data for trip 1
	                  System.out.println("Trip 2 was "+ distanceTrip2 +" miles"); //prints out the data for trip 2
	                  System.out.println("The total distance was "+ totalDistance +" miles"); // prints the total distance
	                
        }
    }