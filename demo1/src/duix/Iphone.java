package duix;

public class Iphone {
    String name;
    double price;
    String color;

    public Iphone(){}
    public Iphone(String name,double price,String color){

    }
    public void call(String who){
        System.out.println(who+"打电话");
    }
    public void sendMessage(){
        System.out.println("群发短信");
    }

    public String getName() {
        return name;
    }
}
