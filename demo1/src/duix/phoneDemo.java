package duix;

public class phoneDemo {
    public static void main(String[] args) {
        Iphone app=new Iphone();
        System.out.println(app.name);
        System.out.println(app.price);
        System.out.println(app.color);
        app.call("乔布斯");
        app.sendMessage();
    }
}
