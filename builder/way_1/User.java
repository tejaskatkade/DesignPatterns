package builder.way_1;

public class User {
    private String userId;
    private String userName;
    private String password;

    private User(UserBuilder userBuilder){
        this.userId = userBuilder.userId;        
        this.userName= userBuilder.userName;
        this.password = userBuilder.password;        
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + "]";
    }
    
    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }


// Inner class to create object
    static class UserBuilder{

        private String userId;
        private String userName;
        private String password;
            
        UserBuilder(){

        }

        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user; 
        }
    
    }


    

}
