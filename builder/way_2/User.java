package builder.way_2;

public class User {
    private final String userId;
    private final String userName;
    private final String password;

    private User(UserBuilder userBuilder){
        this.userId = userBuilder.userId ;        
        this.userName = userBuilder.userName;     
        this.password = userBuilder.password;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    // Inner class to create objec

    static class UserBuilder{
        private String userId;
        private String userName;
        private String password;
        
        private UserBuilder(){

        }
        public static UserBuilder userBuilder(){
            return new UserBuilder();
        }
        public void setUserId(String userId) {
            this.userId = userId;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        public User build(){
            return new User(this);
        }
        


    }

    
}
