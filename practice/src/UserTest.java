import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserTest {

          public static void main(String arg[]){
            List<User> userList = new ArrayList<>();
            userList.add(new User("user", "password12345"));
            userList.add(new User("user1", "password123451"));

            User user = new User();
            user.setUserName("user");
            user.setPassword("password12345");
            userList.add(user);

            User user2 = new User();
            user2.setUserName("user3");
            user2.setPassword("password12");
            userList.add(user2);

            Predicate<String> techmPredicate = predicate -> predicate.equalsIgnoreCase("techm");
            System.out.println(techmPredicate.test("Techm"));

            System.out.println("-----------------------this is------User and Password Validations-----------------");

            Predicate<User> validataionPredicate = predicate -> predicate.getUserName().equalsIgnoreCase("user") && predicate.getPassword().equalsIgnoreCase("password12345");
            for(User u:userList) {
                System.out.println(validataionPredicate.test(u));

            }
        }
    }


