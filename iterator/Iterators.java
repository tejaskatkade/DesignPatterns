package iterator;

import java.util.List;

public class Iterators implements Iterator{

    private int position = 0;
    private int length;
    private List<User> list;

    Iterators(List<User> list){
        this.list = list;
        this.length = list.size();
    }
    @Override
    public boolean haxNext() {
        if(position >= this.length){
            return false;
        }else{
            return true;
        }
    }

    @Override
    public Object next() {
        User user = list.get(position);
        position = position + 1;
        return user;
    }
    
}
