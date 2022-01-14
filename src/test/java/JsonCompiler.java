import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Random;

public class JsonCompiler {

    //having to generate json output in all the classes would be a pain in the ass
    //this function takes any object and converts it to a string based json output for database population via api json put/post
    public static String ObjectToJson(Object inputObject){
        String outString="";
        ArrayList<String> elements = new ArrayList<String>();
        Random random = new Random();

        //int variation = (int) Math.floor(Math.random() * (3 - 1) + 1);
        // this math would be to randomly generate to have varied outputs
        //System.out.println(variation);
        int variation = 1;

        if(variation == 1){
            Field[] fields = inputObject.getClass().getDeclaredFields();     //puts an instance of an objects fields split into array
            for(Field field: fields) {
                try {
                    boolean a = field.canAccess(inputObject);        //ensuring access to field either T or F
                    String b = field.get(inputObject).toString();    //grabs the name of object
                    String c = field.toString();                     //assigns field contents
                    //field.set(object, newValue) //the value can also be changed/set using this

                    // System.out.println(a + " | " + b + " | " + c); //testing purposes
                    String e = c.substring(c.lastIndexOf('.') + 1); // grabbing the suffix of entire string length
                    var result = String.format("\"%s\" : \"%s\" ", e, b); //formatting results within quotes
                    elements.add(result);
                    //System.out.println(result); //testing purposes
                }
                catch (Exception e) {
                    System.out.println(e); //error display
                }
            }

            for(int i = 0; i< elements.size(); i++){ //actual json formatting of the string
                if (i == 0){
                    outString += "{\n";
                }
                else if (i >= 1 && i < elements.size()-1){
                    outString += elements.get(i) + ",\n";
                }
                else if (i == elements.size()-1){
                    outString += elements.get(i) + " \n}";
                }
            }
        }
        else if (variation == 2){ //another object variation can be generated here

        }
        else { //perhaps base constructor for minimalistic data?

        }
        return outString;
    }

    public static String ObjectListToJson(ArrayList<Object> elements){

        String outString = "";
        for(int i = 0; i< elements.size(); i++){ //for each object do this loop

            if (i == 0){
                outString += "[\n"; // opening json list formatting
                String result = ObjectToJson(elements.get(i)); // doing a single json conversion of object
                outString += result; // adding object to output string
            }
            else if (i >= 1 && i < elements.size()-1){
                String result = ObjectToJson(elements.get(i));
                outString += ",\n" + result;
            }
            else if (i == elements.size()-1){ // ending json list formatting
                outString +=  ",\n" + ObjectToJson(elements.get(i)) + " \n]";
            }
            else{}
        }
        // System.out.println("print: \n" + outString + "\n" ); //testing purposes
        return outString;
    }

}
