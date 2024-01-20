package prototype;

public class NetworkConnection implements Cloneable{
    private String ip;
    private String data;
    
    public String getIp() {
        return ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Prototype [ip=" + ip + ", data=" + data + "]";
    }

    public void loadData(){
        System.out.println("Loading Important Data.....");
        this.data = "Important Data";
        
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }    

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
