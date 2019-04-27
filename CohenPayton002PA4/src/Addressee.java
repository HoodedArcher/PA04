/**
 * @(#)Addressee.java
 * @author Charlton Cohen
 * @version 1.0 2019/4/25 8:00 PM
 * Program Putpose: Prompts the user for all elements necesssary for creating an address book entry and provides
 * framework for passing this information to the rest of the program for storage and display.
 */ 

import java.util.Scanner;

public class Addressee
{
  private String addressee, street, cityStateZip, phone = "";
  private StringBuilder phoneFormatted = null;
  private int relationship = 0;
  private Scanner input = new Scanner(System.in);
  
  public Addressee()//This allows Addressee to be used by other classes.
  {//START Constructor
  }//END Constructor
  
  public void setAddressee()//Prompt 1 Prompts user for the name of the addressee
  {
    System.out.printf("%nEnter the name of the addressee:  ");
    addressee = input.nextLine();
  }
  public void setStreet(String addresseeName)
  {
    System.out.printf("%nEnter the street for %s:  ", addresseeName);
    street = input.nextLine();
  }
  public void setCityStateZip(String addresseeName)
  {
    System.out.printf("%nEnter the city, state, and zip code for %s:  ", addresseeName);
    cityStateZip = input.nextLine();
  }
  public void setPhone(String addresseeName)
  {
    System.out.printf("%nEnter the 10 digit phone number for %s:  ", addresseeName);
    phone = input.nextLine();
    phoneFormatted = new StringBuilder(phone);
    phoneFormatted.insert(3, '-');
    phoneFormatted.insert(7, '-');
  }
  public void setRelationship()
  {
    System.out.printf("%nRelationship of addressee:  "
                        + "%n%n1. Family"
                        + "%n2. Friends"
                        + "%n3. Work"
                        + "%n%nChooseFrom the above:  ");
    relationship = input.nextInt();
    input.nextLine();
  }
  public String getAddressee()
  {
    return addressee;
  }
  public String getStreet()
  {
    return street;
  }
  public String getCityStateZip()
  {
    return cityStateZip;
  }
  public String getPhone()
  {
    return phone;
  }
  public int getRelationship()
  {
    return relationship;
  }
}