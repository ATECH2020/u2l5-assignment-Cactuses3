//Name: Patrick McNulty
//Date: 9-24-20
//Assignment: HowFarAway

import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        Scanner myScan = new Scanner(System.in);

        //gets the first latitude
        System.out.print("Enter the latitude of the starting location: ");
        double latOne = myScan.nextDouble();

        //gets the first longitude
        System.out.print("Enter the longitude of the starting location: ");
        double lonOne = myScan.nextDouble();

        //gets the second latitude
        System.out.print("Enter the latitude of the ending location: ");
        double latTwo = myScan.nextDouble();

        //gets the second longitude
        System.out.print("Enter the longitude of the ending location: ");
        double lonTwo = myScan.nextDouble();

        //constructs two GeoLocation objects
        GeoLocation geoLo1 = new GeoLocation(latOne, lonOne);
        GeoLocation geoLo2 = new GeoLocation(latTwo, lonTwo);

        //calculates the distance
        double distance = geoLo1.distanceFrom(geoLo2);

        //prints the distance
        System.out.print("The distance is " + distance + " miles.");

    }//ends public static void main(String[] args)
}//ends HowFarAway class