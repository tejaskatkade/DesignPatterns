package iterator;

import java.util.ArrayList;

public class UserMangement {
    
    private ArrayList<User> arrayList = new ArrayList<>();

    public void addUser(User user){
        arrayList.add(user);
    }

    public Object getUser(int index){
        return arrayList.get(index);
    }

    public Iterator getIterator(){
        return new Iterators(arrayList);
    }
}
