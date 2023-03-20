package oops;

interface instrument{
    String piano="me hu na";
    void guitar();
    void tabla();
        }
        interface newinstrument{
    void tamburo();
    void manjira();
        }

        class musician implements instrument,newinstrument{
          public  void guitar(){
                System.out.println("Musician play guitar");
            }
             public void tabla(){
                System.out.println("tabalchi play tabla");
            }
            public void tamburo(){
                System.out.println("play tamburo");
            }
            public void manjira(){
                System.out.println("play manjira");
            }
        }
public class interfaces{
    public static void main(String[] args) {
        musician mymusician=new musician();
        mymusician.tabla();
       // mymusician.piano("tu hai na ")://You can"t changes
        mymusician.manjira();
        mymusician.guitar();
        mymusician.tamburo();
    }
}