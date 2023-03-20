package oops;
interface mycamera2{
    void snap();
    void recordvideo();
    default void record4kvideo(){
        greet();   //You can use this private method using in default method
        System.out.println("Recording in 4K.....!!");
    }
    private void greet(){
        System.out.println("dhanyavad........");
    }

}
interface mywifi2{
    String[] getnetworks();
    void connectnetwork(String network);

}
class mycellphone2{
    void callnumber(int phonenumber){
        System.out.println("calling "+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting...");
    }
}
class smartphone2 extends mycellphone2 implements mywifi2,mycamera2{
    public  void snap(){
        System.out.println("taking snap");
    }
    public void record4kvideo(){
        System.out.println("Recording 4k with 60fps"); //first this method is call in default method
    }
    public void recordvideo(){
        System.out.println("video recording start");
    }
    public String[] getnetworks(){
        System.out.println("getting list of network");
        String[] networklist={"Shailesh 5G","Hariom 4G","Hardik 3G"};
        return networklist;
    }
    public  void connectnetwork(String network){
        System.out.println("connecting to"+network);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        smartphone2 sm=new smartphone2();
        mycamera2 cam2=new smartphone2();
        cam2.snap();
        cam2.record4kvideo();
       // cam2.getnetworks();// This is a smartphone but, use it as a camera so u can't use
sm.getnetworks();
sm.record4kvideo();
sm.pickcall();
sm.connectnetwork(" Shailesh");
sm.callnumber( 7990);

    }
}
