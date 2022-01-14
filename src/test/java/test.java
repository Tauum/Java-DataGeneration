import java.time.LocalDate;

public class test {


    public static LocalDate PastDateGenerator2(int minYear, int maxYear){
        boolean fail = false;
        int x = (int) ((Math.random() * (maxYear - minYear)) + minYear);
        int y = (int) ((Math.random() * (12 - 1)) + 1);
        int z;

        if (y == 2 ){
            if (x % 4 == 0){
                if (x % 100 == 0){
                    if (x % 400 == 0){ fail = false; }

                    else { fail = true;}
                }
                else { fail = false; }
            }
            else { fail = false; }

            if (fail == false){ z = (int) ((Math.random() * (29 - 1)) + 1); }

            else { z = (int) ((Math.random() * (28 - 1)) + 1); }
        }
        else if (y == 4 || y == 6 || y == 9 || y == 11){
            z = (int) ((Math.random() * (30 - 1)) + 1);
        }
        else{
            z = (int) ((Math.random() * (31 - 1)) + 1);
        }

        LocalDate output = LocalDate.of(x,y,z);
        System.out.println(x + " " + y + " " + z + " " + output );

        return output;
    }
}


