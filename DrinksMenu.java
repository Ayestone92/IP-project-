import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DrinksMenu {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int numberofdrinks = 0;
        int numberofpeople = 0; 

        List<String> people = new ArrayList<>();
        List<String> drinks = new ArrayList<>();

        Map<String, String> order = new HashMap<>();

        String inputline = input.nextLine();

        String [] numbers = inputline.split(" ");

        numberofdrinks = Integer.parseInt(numbers[0]);
        numberofpeople = Integer.parseInt(numbers[1]);

        for (int i = 0; i < numberofdrinks; i++) {
            drinks.add(input.nextLine().trim());
        }
        for (int i = 0; i < numberofpeople; i++) {
            people.add(input.nextLine().toLowerCase().trim());
        }

        List<String> finallist = new ArrayList<>();

        int indexoflastdrink = 0;
        int newdrink = 0;

        try{

            for (int i = 0; i < people.size(); i++) {

                if(order.containsKey(people.get(i))){

                    for (int j = 0; j < drinks.size(); j++) {

                        if(order.get(people.get(i)).equals(drinks.get(j))){

                            indexoflastdrink = drinks.indexOf(drinks.get(j));
                        }

                    }
                    newdrink = indexoflastdrink +1;
                
                    finallist.add(drinks.get(newdrink));

                } else {

                    order.put(people.get(i), drinks.get(0));

                    finallist.add(drinks.get(indexoflastdrink));
                
                }

            }

        } catch(Exception e){
        
        }

        for (String string : finallist) {
            System.out.println(string);
        }
        
    }
//

}
