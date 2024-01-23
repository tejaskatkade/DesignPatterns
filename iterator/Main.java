package iterator;
public class Main {

    public static void main(String[] args) {
        UserMangement userMangement = new UserMangement();

        userMangement.addUser(new User(101, "Tejas Katkade"));
        userMangement.addUser(new User(102, "Ashutosh Katkade"));
        userMangement.addUser(new User(103, "Rushikesh Kakad"));
        userMangement.addUser(new User(104, "Kunal Kakad"));
        userMangement.addUser(new User(105, "Omkar Nagare"));
        userMangement.addUser(new User(106, "Amol Nagare"));
        userMangement.addUser(new User(107, "Abhijit Kute"));
        userMangement.addUser(new User(107, "Gokul Kute"));
        userMangement.addUser(new User(107, "Akash Kute"));
    
        Iterator itr = userMangement.getIterator();
        
        while(itr.haxNext()){
            System.out.println((User)itr.next());
        }

        

    }
}