package automationtest;
/*5.1 Create the class with the name "ArrayList_Q5"
5.2	Create the main method
5.3 Declare the string type ArrayList and add the values "Scrum", "Java", "Jira", "Selenium", "Cucumber", "Postman", “Rest Assured”
5.4 Print the list using a forEach loop.

 */
import java.util.ArrayList;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("Scrum");
        arraylist.add("Java");
        arraylist.add("Jira");
        arraylist.add("Selenium");
        arraylist.add("Cucumber");
        arraylist.add("Postman");
        arraylist.add("Rest Assured");

        for (String st : arraylist) {
            System.out.println(st);
        }
    }
}
