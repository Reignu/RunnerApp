package helpers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mga
 */
public class InputHelper {
    private final Scanner reader;
    
    /**
     * Instantiates the reader object using a Scanner with the
     * standard input stream i.e. keyboard
     *
     */
    public InputHelper() {
        reader = new Scanner(System.in);
    } 

    /**
     * Accepts and displays a prompt and returns a char value
     * entered at the keyboard
     * 
     * @param prompt
     * @return character
     */
        public char readCharacter(String prompt) {
        
        System.out.println(prompt + ": ");
        char inputText = reader.nextLine().charAt(0);
        return inputText;
    }    

    /**
     * Accepts and displays a prompt and a set of  valid character options
     * and returns a valid char value entered at the keyboard
     * 
     * @param prompt
     * @param validCharacters
     * @return character
     */
        public char readCharacter(String prompt, String validCharacters) {
        char inputText;
        boolean inputError;        
        do {
            inputError = false;             
            System.out.println(prompt + ": ");
            inputText = reader.nextLine().toUpperCase().charAt(0);
            if (validCharacters.indexOf(inputText) == -1) {
                inputError = true;
                System.out.println("Character out of range: please re-enter: "); 
            }
        } while (inputError);        
        return inputText;
    }     

    /**
     * Accepts and displays a prompt
     * and returns a String  value entered at the keyboard
     * 
     * @param prompt
     * @return String
     */
        public String readString(String prompt) {
        
        System.out.println(prompt + ": ");
        String inputText = reader.nextLine();
        return inputText;
    }

    /**
     * Accepts and displays a prompt and a maximum and minimum
     * and returns a valid int  value entered at the keyboard
     * 
     * @param prompt
     * @param max
     * @param min
     * @return int
     */
        public int readInt(String prompt, int max, int min) {
        int inputNumber = 0;
        boolean inputError;
        do {
            inputError = false;                
            System.out.println(prompt + ": ");

            try {
                inputNumber = Integer.parseInt(reader.nextLine());
                if (inputNumber < min || inputNumber > max) {
                    inputError = true;
                    System.out.println("Number out of range: please re-enter\n");                        
                }
            } catch (NumberFormatException e) {
                inputError = true;
                System.out.println("Not a valid number: please re-enter: ");
            }
        } while (inputError);
        return inputNumber;
    } 

    /**
     * Accepts and displays a prompt
     * and returns a valid int  value entered at the keyboard
     * 
     * @param prompt
     * @return int
     */
        public int readInt(String prompt) {
        int inputNumber = 0;
        boolean inputError;
        do {
            inputError = false;                
            System.out.println(prompt + ": ");

            try {
                inputNumber = Integer.parseInt(reader.nextLine());
            } catch (NumberFormatException e) {
                inputError = true;
                System.out.println("Not a valid number: please re-enter: ");
            }
        } while (inputError);
        return inputNumber;
    } 

    /**
     * Accepts and displays a prompt and a String representing a date format
     * and returns a Calendar value from text entered at the keyboard
     * 
     * @param prompt
     * @param format
     * @return Calendar
     */
        public Calendar readDate(String prompt, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateInString = readString("Enter date yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(dateInString);
        } catch (ParseException ex) {
            Logger.getLogger(InputHelper.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);  
        return calendar;
    }

    /**
     * Accepts and displays a prompt and a String representing a date format
     * and returns a String value from text entered at the keyboard
     * 
     * @param prompt
     * @param format
     * @return String
     */
        public String readDateString(String prompt, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String dateInString = readString(prompt + " (" + format + ")");
        Date date = null;
        try {
            date = sdf.parse(dateInString);
            return dateInString;
        } catch (ParseException ex) {
            return "Incorrect Date Format";
        }  
    }    
}
