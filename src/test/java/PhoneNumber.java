import java.util.Random;


//the default package number supplies only US based
// despite having English instanciated above
// so this basic number generator was implemented
// for UK +447 based in 12char

public class PhoneNumber {

    public static String Generate(){
        String phoneNumber = "";
        Random random = new Random();

        while (phoneNumber.length() < 3) {
            phoneNumber += "+447";
        };
        while (phoneNumber.length() > 3 && phoneNumber.length() < 12){

            int b = random.nextInt(9 * 1);
            phoneNumber += b;
        }
        return phoneNumber;
    }
}
