import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Java_Faker_Test {

    public static void main(String[] args) {

        // documentation on classes: http://dius.github.io/java-faker/apidocs/index.html
        // source of project: https://github.com/DiUS/java-faker
        Faker fake = new Faker(Locale.ENGLISH);

        //example stuff

        // CollectionUtils.
        // ListUtils.

        //        SpaceShip a = new SpaceShip( fake.number().numberBetween(0,10),
//                                     fake.pokemon().name(),
//                                     fake.number().numberBetween(0,10),
//                                     fake.number().randomDouble(9,0, 1),
//                                     fake.lorem().character(),
//                                     fake.color().name(),
//                                    fake.random().nextBoolean()
//                );

//        String name = fake.name().fullName(); // Miss Samanta Schmidt
//        String firstName = fake.name().firstName(); // Emory
//        String lastName = fake.name().lastName(); // Barton
//        String streetAddress = fake.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
//        String phoneNumber = fake.phoneNumber().cellPhone();
//

//
//        //Date DOB = PastDateGenerator2(int minYear, int maxYear) //ALTERNATE DATE GENERATOR
//        //Date DOB = fake.date().birthday(); //regular date
//        LocalDate LocalFakeDOB = convertToLocalDateViaInstant(fake.date().birthday()); //set to localdate instead
//


//
//        String fakeRole = fake.job().title();
//        String fakePhonenumber = PhoneNumberGenerator();
//        String placeHolderImageURL = "placeholder URL";
//        String fakeEmployeeCode = fake.lorem().characters().substring(0,12);
//
//      //  Employee newEmployee = new Employee(1L,fakeFName + " " + fakeLName, fakeEmail, fakeRole, fakePhonenumber, placeHolderImageURL, fakeEmployeeCode );
//       // JsonCompiler(newEmployee);
//

//



        //generating list of objects into json
//        ArrayList users = new ArrayList();
//        for (int i = 0; i < 5; i++) {
//
//            Random random = new Random();
//            String fakeFName2 = fake.name().firstName();
//            String fakeLName2 = fake.name().lastName();
//            int fakeAge = random.nextInt(55);
//            //Long id = new Long(i);
//            User newUser2 = new User(1L, fakeFName2 + " " + fakeLName2,fakeAge );
//            users.add(newUser2);
       // }

         //JsonListCompiler(users);
        //System.out.println(JsonListCompiler(users));

    PhoneNumber phoneNumber = new PhoneNumber();
    PastDate pastDate = new PastDate();
    JsonCompiler jsoncompiler = new JsonCompiler();
    RandomGenderator rd = new RandomGenderator();

    String fakePhoneNumber = phoneNumber.Generate();
    char rdchar = rd.generate(fake.random().nextBoolean());
    LocalDate fakePastDate = pastDate.Generate(1980, 2002);
    String fakeFName = fake.name().firstName();
    String fakeLName = fake.name().lastName();
    String fakeEmail = fakeFName.charAt(0)
          + "." + fakeLName + "@" + fake.funnyName().name().replace(" ", "").toString() + ".com";

    String fakePassword = GenerateFakePassword(fakeLName, fakePastDate);

   //
   //student output test
   //
       // Student newStudent = new Student(1L, fakeFName, fakeLName,fakePastDate,fakeEmail, fakePassword, rdchar );
  // jsoncompiler.(newStudent);
  // String output = jsoncompiler.ObjectToJson(newStudent);

    //
    // user output test
    //

    User newUser = new User(1L, fakeFName, fakeLName,fakeEmail,fakePassword,fakePastDate, fake.random().nextBoolean());
    String user = jsoncompiler.ObjectToJson(newUser);
    System.out.println(user);


   }

   //just outputs a persons last name and birthday digits
    public static String GenerateFakePassword(String fakeLName, LocalDate fakePastDate)
    {
        final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MMMM uuuu", Locale.ENGLISH);
        String output = dtf.format(fakePastDate);
        String fakePassword = fakeLName + output.substring(output.length() -2);
        return fakePassword;
    }

    public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) { //better solution found to convert dates
        return dateToConvert.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate(); }
}


