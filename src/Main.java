import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        User user = new User(10L, "meder", "tynychbekov", "meder@gmail.com", 23);
        User user1 = new User(23L, "asan", "tairov", "asan@gmail.com", 19);
        User user2 = new User(3L, "uson", "kamylov", "uson@gmail.com", 20);
        User user3 = new User(4L, "Bakyt", "Latibov", "bakyt@gmail.com", 22);

        List<User> users = new ArrayList<>(Arrays.asList(user, user1, user2, user3));

        users.forEach(System.out::println);

        System.out.println("------------------------------");

        Collections.sort(users, user.compareById);

        users.forEach(System.out::println);
    }
}