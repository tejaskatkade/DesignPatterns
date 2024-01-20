package builder.way_2;

import builder.way_2.User.UserBuilder;

public class Client {
    public static void main(String[] args) {
        
        UserBuilder userBuilder1 = User.UserBuilder.userBuilder();
        userBuilder1.setUserId("virat18@gmail.com");
        userBuilder1.setUserName("virat Kohli");
        userBuilder1.setPassword("1234567");
        User user1 = userBuilder1.build();

        System.out.println(user1);
        
        UserBuilder userBuilder2 = User.UserBuilder.userBuilder();
        userBuilder2.setUserId("sachin10@gmail.com");
        userBuilder2.setUserName("Sachin Tendulkar");
        //userBuilder2.setPassword("12345678");
        User user2 = userBuilder2.build();

        System.out.println(user2);
    }
}
