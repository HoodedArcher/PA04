/**
 * @(#)AddressBook.java
 * @author Stephen Payton
 * @version 1.00 2019/4/26 1:30 PM
 * PROGRAM PURPOSE: Prompts the user for their name and variables for an addresss book. Creates an address book for the user. 
 *                  Prompts the user to create entries for addressee's 
 *                  information and stores it in an array and when the user is done inputting, the array is printed.
 */ 

import java.util.Scanner; //Reads user input

public class AddressBook
{
  private Scanner input = new Scanner(System.in);
  private String name = ""; //String variable that calls the name 
  private Addressee[] addressBook; //1D array 
  private int size = 5; //size of array
  
  public AddressBook()
  {
    
  }//END empty constructor
  
  public void start()
  {
    char start = ' ';
    System.out.printf("%nBegin entering addresses?  'Y' or 'N':  "); //Prompts user to enter address
    start = input.nextLine().charAt(0);
    
    if(Character.toUpperCase(start) != 'Y')
    {
      System.out.printf("%nExiting program%n"); //Exits program if the user does not want to begin entering addresses
    }//END if another != 'Y'
    else
    {
      createAddressBook(); //creates address book
      displayAddressBook(); //displays address book information
    }
  }//END start()
  
  public void createAddressBook() //begin creating address book
  { 
    System.out.printf("%nEnter your name:  "); //prompts user to enter name
    name = input.nextLine();
    
    System.out.printf("%nHow many contacts will be recorded in your address book?:  "); //asks user how many contacts is being recorded
    size = input.nextInt();
    input.nextLine();
    addressBook = new Addressee[size]; //gives array a size
    
    for(int i = 0; i < addressBook.length; i++)
    {
      addressBook[i] = new Addressee();
      addressBook[i].setAddressee(); //sets addressee
      addressBook[i].setStreet(); //sets street
      addressBook[i].setCityStateZip(); //sets cityStateZip
      addressBook[i].setPhone(); //set phone
      addressBook[i].setRelationship(); //sets relationship
    }//END for 
  }//END createAddressBook
  
  public void displayAddressBook()
  {
    for(int j = 0; j < addressBook.length; j++)
    {
      String family = String.format("%nFAMILY%n"); //String variable that prints "FAMILY" as relationship
      String friend = String.format("%nFRIENDS%n"); //String variable that prints "FRIENDS" as relationship
      String work = String.format("%nWORK%n"); //String variable that prints "WORK" as relationship
      
      boolean hasFamily = false, hasFriends = false, hasWork = false;
      
      switch(addressBook[size].getRelationship())
      {
        case 1: family += String.format("%nAddressee:  %s"
                                          + "%nStreet:  %s"
                                          + "%nCity, State, Zip:  %s"
                                          + "%nPhone:  %s%n", addressBook[j].getAddressee(), addressBook[j].getStreet(), addressBook[j].getCityStateZip(), addressBook[j].getPhone());
        hasFamily = true;
        break;
        case 2:  friend += String.format("%nAddressee:  %s"
                                           + "%nStreet:  %s"
                                           + "%nCity, State, Zip:  %s"
                                           + "%nPhone:  %s%n", addressBook[j].getAddressee(), addressBook[j].getStreet(), addressBook[j].getCityStateZip(), addressBook[j].getPhone());
        hasFriends = true;
        break;
        case 3:  work += String.format("%nAddressee:  %s"
                                         + "%nStreet:  %s"
                                         + "%nCity, State, Zip:  %s"
                                         + "%nPhone:  %s%n", addressBook[j].getAddressee(), addressBook[j].getStreet(), addressBook[j].getCityStateZip(), addressBook[j].getPhone());
        hasWork = true;
        break;
        
      }//END switch
    }//END for
        System.out.printf("%nADDRESS BOOK FOR: %S%n", name);
        
        if(hasFamily)
        {
          System.out.printf("%nFAMILY%n%S%s%s%d%");
        }
        else if(hasFriends)
        {
          System.out.printf("%nFRIENDS%n%S%s%s%d%");
        }
        else if(hasWork)
        {
          System.out.printf("%nWORK%n%S%s%s%d%");
        }
  }//END displayAddressBook
}//END APPLICATION CLASS AddressBook
