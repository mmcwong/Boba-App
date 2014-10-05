package data;

public class User {
    private String name;
    private String phone;
    private String email;
    private int userId;

    private static int userCount = 0;

    public User(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        userId = userCount;
        userCount++;
    }
}
