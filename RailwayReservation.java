import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

import javax.swing.JOptionPane;
class RailwayReservation{

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public void Reservation()throws IOException
    {
        Scanner input = new Scanner(System.in);

        String username;
        String password;
        clrscr();
        JOptionPane.showMessageDialog(null, "***Welcome to Online Reservation System*** \n To access the functionings \n please click on 'OK' button","Online Reservation System",3);
        JOptionPane.showMessageDialog(null, "***Welcome to LOGIN PAGE\n Click OK and enter details in the Screen","Online Reservation System",3);
        System.out.println(" ******************************* ");
        System.out.println("|         LOGIN PAGE             |");
        System.out.println(" ******************************* ");
        System.out.println(" ------------------------------");
        System.out.println("|           username:           |");
        System.out.println(" ------------------------------");
        username = input.next();
        System.out.println("\n");
        System.out.println(" ------------------------------");
        System.out.println("|           password:           |");
        System.out.println(" ------------------------------");
        password = input.next();
    
        if(username.equals(username) && password.equals(password)) {
            JOptionPane.showMessageDialog(null, "***Logged In Successfully*** \n Click OK For REGISTRATION PAGE","Online Reservation System",3);
            System.out.println("You are successfully logged in");

        String stations [] ={"Adilabad ","Benguluru","chennai  ","Delhi    ","Gujarat  ","Haryana  ","Jharkhand","Kerala   ","Lucknow  ","Mumbai  ","Nagaland",
            "Orissa  ","Punjab  ","Rajastan","Srinagar","Tirupati","Undi    ","Vizag   ","Meghalai","Yelanaka"};

        double charges[] ={20.0,25,30,10,20,25,25,25,25,30,15,15,30,25,25,25,40,30,10,15};

        while(true){

            System.out.println("\f Welcome To Railway Reservation System");
            System.out.println(" =====================================================================");
            System.out.println("|   Press                   Stations                 Charges           |");
             System.out.println("======================================================================");
            for(int i=0;i<stations.length;i++)
            {
                System.out.println("   "+(i+1)+"                      "+stations[i]+"                   "+charges[i]);

            }
            System.out.println(" ----------------------------------------------------------------");
            System.out.println("|                      Please enter any number                   |");
            System.out.println(" ----------------------------------------------------------------");
            int option = Integer.parseInt(r.readLine());
            if(option>0 && option<=24)
            {
                System.out.println(" ----------------------------------------------------------------");
                System.out.println("|           Please enter the number of passengers:                |");
                System.out.println(" ----------------------------------------------------------------");
                int p= Integer.parseInt(r.readLine());
                System.out.println(" ----------------------------------------------------------------");
                System.out.println("|    Press E for Express and L for Local/Passenger Ticket:        |");
                System.out.println(" ----------------------------------------------------------------");
                int factor=1;String type;
               while(true)
                {
                type = r.readLine();
                if(type.equalsIgnoreCase("E"))
                {factor=3;
                 break;
                }

                else if(!type.equalsIgnoreCase("L"))
                {
                    System.out.println("Wrong Choice. Enter Again:: ");
                    continue;
                }
                else{
                    break;
                }
            }
                type=type.toUpperCase();
                System.out.println(" -----------------------------------------------------------------------------");
                System.out.println("|   Do you want a RETURN ticket? Y for YES , Any other character for NO :      |");
                System.out.println(" -----------------------------------------------------------------------------");
                String ret=r.readLine();
                boolean returnTkt=ret.equalsIgnoreCase("Y")|| ret.equalsIgnoreCase("Yes")?true:false;
                printTicket(stations[option-1],charges[option-1],p,factor,type, returnTkt);
                System.out.println(" ---------------------------------------------------------------------------------------------");
                System.out.println("|      Do you want to continue to next reservation?  Y for YES , Any other character for NO :  |");
                System.out.println(" ---------------------------------------------------------------------------------------------");
                 String choice=r.readLine();
                 if(choice.equalsIgnoreCase("Y")|| choice.equalsIgnoreCase("Yes"))
                 continue;
                 else{
                 break;}
                 

            }

            else{
                System.out.println("Entered Wrong choice.Do you want to continue with correct choice? Press Y for YES , Any other character for Exiting : ");
                 String choice=r.readLine();
                 if(choice.equalsIgnoreCase("Y")|| choice.equalsIgnoreCase("Yes"))
                 continue;
                 else
                 break;
            }

        }
        }
    }

    private void clrscr() {
    }
    int pnr=2004;
    void  printTicket(String station,double charges,int p,int factor,String type,boolean returnTkt) throws IOException{

        System.out.println("------------------------------------------------------------------");
        System.out.println("--------------------RAILWAY TICKET ------------------------------");
        System.out.println(" ------------------------------");
        System.out.println("|           enter source        |");
        System.out.println(" ------------------------------");
        Scanner sc= new Scanner(System.in);
        String source = sc.nextLine();
        System.out.println(" ------------------------------");
        System.out.println("|       enter destination       |");
        System.out.println(" ------------------------------");
        String destination = sc.nextLine();
        JOptionPane.showMessageDialog(null, "***REGISTRATION SUCCESSFUL*** \n please click on 'OK' button","Online Reservation System",3);
        System.out.println("Your Ticket was Confirmed");
        System.out.println("Your PNR Number is :"+pnr++);
        System.out.println("Journey from : "+source+"\nJourney to : "+destination+"\nNo of Passengers : "+p+"\nTicket Type :"+type);
        String ret=returnTkt==true?"Return Ticket":"Not Return Ticket";
        System.out.println("\nJourney Return Type? : "+ret+"\n");
        System.out.println("Date of Journey : "+LocalDate.now());
        System.out.println("------------------------------------------------------------------");
        double totalcharges = charges*factor*p;
        if(returnTkt)
        totalcharges*=2;
        System.out.println(" Total charges :: Rs "+totalcharges);
        System.out.println("------------------------------------------------------------------");
        JOptionPane.showMessageDialog(null, "***Welcome to CANCELLATION PAGE\n Click OK for further steps","Online Reservation System",3);
        System.out.println(" -----------------------------------------------------------------");
        System.out.println("|               Do You want to cancel the ticket  :                |");
        System.out.println(" -----------------------------------------------------------------");
        String choose=r.readLine();
        
        //System.out.println("Successfully Ticket Cancelled");
        if(choose.equalsIgnoreCase("Y")|| choose.equalsIgnoreCase("Yes"))
        {
            cancelAll();
            JOptionPane.showMessageDialog(null, "***TICKET SUCCESSFULLY CANCELLED*** \n To access the functionings \n please click on 'OK' button","Online Reservation System",3);
            
        }
        else{
            //System.out.println("");
            JOptionPane.showMessageDialog(null, "***Your Ticket was not Cancelled *** \n To access the functionings \n please click on 'OK' button","Online Reservation System",3);
        }
    }

    private void cancelAll() {
        boolean shouldStop = true;
    }
    

}
class OnlineReservation{
    public static void main(String[]args) throws IOException {
        RailwayReservation rr = new RailwayReservation();
        rr.Reservation();
        rr.printTicket(null, 0, 0, 0, null, false);
    }
}