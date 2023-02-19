import java.util.Comparator;

//public class User implements Comparable<User>
public class User {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private int age;

    public User(Long id, String name, String lastname, String email, int age) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    //    @Override
//    public int compareTo(User o) {
//        return id.compareTo(o.id);
//    }
    Comparator<User> compareById = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.id.compareTo(o2.id);
        }
    };
    Comparator<User> compareByAge = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.age - o2.age;
        }
    };
}
