package data;

public class User {
    public final String name;
    public final String phone;
    public final String email;
    public final int userId;

    private static int userCount = 0;

    public User(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        userId = userCount;
        userCount++;
    }
}
