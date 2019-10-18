import java.util.*;
class Hotel_management
{
   public static void main(String s[])
  {
     int i,days,booking_number,room_number,room_cost,food_cost,service_cost;
     String name,feedback,time;
     long arrival,departure,contact_number;

Scanner sc = new Scanner (System.in);
System.out.println("*****************************************");
System.out.println("           OBEROI HOTELS          ");
System.out.println("*****************************************");
System.out.println("|        1. Booking                     |");
System.out.println("|        2. Cancellation                |");
System.out.println("|        3. Check In                    |");
System.out.println("|        4. Check Out                   |");
System.out.println("*****************************************");
System.out.print("Enter your choice : "); 		
i = sc.nextInt();

if (i == 3)
{				
System.out.println("\n #### Check In #### \n ");
        System.out.println("Enter Booking number: ");
        booking_number = sc.nextInt();       
        System.out.println("Enter customer's name: ");
        name = sc.next();
        System.out.println("Enter customer's contact number: ");
        contact_number = sc.nextInt();
        System.out.println("Enter room number: ");
        room_number = sc.nextInt();
        System.out.println("Enter time of Check in: ");
        time=sc.next();
        System.out.println("___________________________________________");
}
else if (i == 1)
{	
System.out.println("\n #### Booking #### \n ");
               
        System.out.println("Enter customer's name: ");
        name = sc.next();
        System.out.println("Enter customer's contact number: ");
        contact_number = sc.nextLong();
        System.out.println("Enter the date of arrival (dd.mm.yyyy): ");
        arrival= sc.nextLong();
        System.out.println("Enter the booking number given: ");
        booking_number= sc.nextInt();
        System.out.println("Enter the date of departure(dd.mm.yyyy): ");
        departure= sc.nextLong();
        System.out.println("YOUR BOOKING IS CONFIRMED ");        
        System.out.println("___________________________________________");       
}
else if (i == 2)
{
System.out.println("\n #### Cancellation #### \n ");
     
        System.out.println("Enter customer's name: ");
        name= sc.next();
        System.out.println("Enter customer's contact number: ");
        contact_number = sc.nextLong();
        System.out.println("Enter the booking number given: ");
        booking_number= sc.nextInt();
        System.out.println("Enter the number of days from booking till now: ");
        days= sc.nextInt();
	if (days<2)
		{
		 System.out.println("60 percent payment is returned.");
		}
	else if (days>2 && days<10)
		{
		 System.out.println("40 percent payment is returned. ");
		}
	else if (days>10 && days<15)
		{
		 System.out.println(" 20 percent payment is returned. ");
		}
	else
		{
		 System.out.println("No refund.");
		}
        System.out.println("___________________________________________");
}
else if (i == 4)
{
System.out.println("\n #### Check Out #### \n ");
        System.out.println("Enter Booking number: ");
        booking_number= sc.nextInt();
        System.out.println("Enter customer's name: ");
        name= sc.next();
        System.out.println("Enter customer's contact number: ");
        contact_number = sc.nextLong();
        System.out.println("Enter cost of room: ");
        room_cost= sc.nextInt();
        System.out.println("Enter cost of food: ");
        food_cost = sc.nextInt();
        System.out.println("Enter cost of services: ");
        service_cost= sc.nextInt();
System.out.println("*****************************************");
System.out.println("                BILL             ");
System.out.println("*****************************************");
System.out.println("|        1.Cost of room                 |" +room_cost);
System.out.println("|        2. Cost of food                |" +food_cost);
System.out.println("|        3. Cost of service             |" +service_cost);
System.out.println("|                    TOTAL              |" +(room_cost+food_cost+service_cost));
System.out.println("*****************************************");
System.out.print(" ####         FEEDBACK:  ");
feedback = sc.next();
System.out.println("*****************************************");
System.out.println("THANK YOU FOR YOUR VISIT !");
System.out.println("________ We hope to meet you again.____________");
System.out.println("___________________________________________");
}  
else 
{ 
System.out.println(" WRONG INPUT !!");     
}   
         

}
}

