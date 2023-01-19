import java.util.Scanner;

public class TemperatureConversion 
{

    public static void main(String[] args) 
	{
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the Temprature(in celcius):- ");
		
        double temp = sc.nextDouble();	
        double farenTemp = temp * (9/5) + 32 ;
        System.out.println("celcius:- " + temp +" = " + farenTemp + "F");

        System.out.println();
        
        System.out.println("Enter the Temprature(in farhenheit):-");
        temp = sc.nextDouble();
		
        double celcTemp = (temp - 32 ) * (5/9);
        System.out.println("Fahtenheit:- " + temp +" = " + celcTemp + "C");
		
		System.out.print("Enter the wind speed per hour:- ");
        double speed = sc.nextDouble();

        double windChill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) +  0.4275 * temp * Math.pow(speed, 0.16);
		
        System.out.println("The wind chill index is:- " + windChill);
		
		 sc.close();
    }
}