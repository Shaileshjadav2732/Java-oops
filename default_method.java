package oops;
interface mycamera{
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
interface mywifi{
    String[] getnetworks();
    void connectnetwork(String network);

}
class mycellphone{
    void callnumber(int phonenumber){
        System.out.println("calling"+phonenumber);
    }
    void pickcall(){
        System.out.println("connecting...");
    }
}
class smartphone extends mycellphone implements mywifi,mycamera{
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
public class default_method {
    public static void main(String[] args) {
        smartphone sm=new smartphone();
        String[] ar=sm.getnetworks();
        for(String item:ar){
            System.out.println(item);
        }
        sm.record4kvideo();
      //  sm.greet();  //You can't direct use of this method because this method is private
    }
}
