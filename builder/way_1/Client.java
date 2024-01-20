package builder.way_1;

public class Client {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder()
            .setUserId("tejas@gmail.com")
            .setUserName("Tejas")
            .setPassword("abc@1234")
            .build();

        // here we can specified only two things not all
        User user2 = new User.UserBuilder()
            .setUserId("pavan@gmail.com")
            .setPassword("pqr@1234")
            .build();

        System.out.println(user1);
        System.out.println(user2);

    }
}
