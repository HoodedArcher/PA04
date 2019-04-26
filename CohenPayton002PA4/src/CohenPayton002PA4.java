/**
 * @(#)Addressee.java
 * @author Charlton Cohen
 * @version 1.0 2019/4/25 8:00 PM
 * Program Putpose: Prompts the user for their name and variables for an addresss book. Creates an address book for the user. Prompts the user to create entries for addressee's
 * this information is stored in an array and when the user is done inputting addressee's the array is printed.
 */ 
public class CohenPayton002PA4
{
  public static void main(String[] args)
  {
    AddressBook book = new AddressBook();
    book.start();
    System.exit(0);
  }
}