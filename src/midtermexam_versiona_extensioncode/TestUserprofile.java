 /* 
Name:       Javier Nievas 
Assignment: Midterm Exam
Program:    
Date:       8-Mar-2019
 
Description: [program description in your own words] 
*/



package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author Javier Nievas
 */
public class TestUserprofile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String userFavGenre = "";
            Scanner sc = new Scanner(System.in);
            boolean validGenre = true;
            String[] genres = {"Comedy", "Drama", "Action", "Mystery"};//available genres of movies
            
            System.out.println("Hello, lets create a new user profile");
            System.out.println("*************************************");
            System.out.println("Enter the your Name");
            String userName = sc.nextLine();
                  
            while(validGenre){
                
                System.out.println("Enter Your favorite Genre");
                for (int i = 0; i < genres.length; i++) {
                   System.out.println( (i +1)+ genres[i] + "\n");
                   
                }
            userFavGenre = sc.nextLine();
            
             
            
            if (userFavGenre.matches("[1-4]")) {
                validGenre= false;
                System.out.println("Good choice!");
                }
            
            }
        UserProfile user1 = new UserProfile(userName, userFavGenre);   
        System.out.println("New User Added");
        
                
    }
}
        
        
    


