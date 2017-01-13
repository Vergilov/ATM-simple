/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankomat;
 import java.util.Scanner;

/**
 *
 * @author Vergil
 */
public class Bankomat {   

        public static void main(String args[] )

        { 

            int balance = 5000, withdraw, deposit;

            Scanner s = new Scanner(System.in);

            while(true)

            {

                System.out.println("Witamy w Bankomacie");

                System.out.println("Wybór 1: Wypłacanie banknotów");

                System.out.println("Wybór 2: Wpłacanie banknotów");

                System.out.println("Wybór 3: Sprawdź stan konta");

                System.out.println("Wybór 4: Wyjdź");

                System.out.print("Wybierz Numer Operacji");

                int n = s.nextInt();

                switch(n)

                {

                    case 1:

                    System.out.print("Wybierz kwotę do wybrania:");

                    withdraw = s.nextInt();

                    if(balance >= withdraw)

                    {

                        balance = balance - withdraw;

                        System.out.println("Proszę zabrać pieniądze w ciągu 30 sekund");

                    }

                    else

                    {

                        System.out.println("Za mało pieniędzy na koncie");

                    }

                    System.out.println("");

                    break;

     

                    case 2:

                    System.out.print("Wybierz kwotę do wpłacenia:");

                    deposit = s.nextInt();

                    balance = balance + deposit;

                    System.out.println("Pieniądzę wpłyneły na konto!");

                    System.out.println("");

                    break;

     

                    case 3:

                    System.out.println("Stan konta : "+balance);

                    System.out.println("");

                    break;

     

                    case 4:

                    System.exit(0);

                }

            }

        }

    }
    /**
     * @param args the command line arguments
     */

    
