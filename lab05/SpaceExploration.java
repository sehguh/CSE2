//Ryan Hughes
//2/20/15
//CSE002
//Program that prints a timeline of space exploration from a set group of years

    public class SpaceExploration { //declares the class
        public static void main(String [] args) {//declares that the main method is to be used
            
            int year = (int) (Math.random() * 11) + 2000;//sets a random number to the year variable
            
            System.out.println("Here is a list of space exploration events from " + year + " to 2000: ");//prints they years that the space data will be printed for
            
            switch (year) {//starts the switch statement
                case 2010: 
                    System.out.println("2010: SpaceX successfully sends spacecraft tinto orbit and back."); //if year is 2010 it prints the data for that year and all the years below it too
                    
                case 2009:
                    System.out.println("2009: N/A");//if year is 2009 it prints the data for that year and all the years below it too
                    
                case 2008:
                    System.out.println("2008: Kepler launched to deep space.");//if year is 2008 it prints the data for that year and all the years below it too
                    
                case 2007:
                    System.out.println("2007: N/A");//if year is 2007 it prints the data for that year and all the years below it too
                    
                case 2006:
                    System.out.println("2006: Spacecraft returns with collections from a comet.");//if year is 2006 it prints the data for that year and all the years below it too
                    
                case 2005:
                    System.out.println("2005: Spacecraft collides with comet.");//if year is 2005 it prints the data for that year and all the years below it too
                
                case 2004:
                    System.out.println("2004: N/A");//if year is 2004 it prints the data for that year and all the years below it too
                    
                case 2003:
                    System.out.println("2003: Largest infrared telescope released.");//if year is 2003 it prints the data for that year and all the years below it too
                    
                case 2002:
                    System.out.println("2002: N/A");//if year is 2002 it prints the data for that year and all the years below it too
                    
                case 2001:
                    System.out.println("2001: First spacecraft lands on asteroid.");//if year is 2001 it prints the data for that year and all the years below it too
                    
                case 2000:
                    System.out.println("2000: First spacecraft orbits an asteroid");//if year is 2000 it prints the data for that year
                    break;//ends the switch statement
            }
            
            
            
        }
    }