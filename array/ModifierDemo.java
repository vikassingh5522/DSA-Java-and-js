import java.util.ArrayList;

public class ModifierDemo {
    public static void main(String[] args) {

        ArrayList <Integer> ob  = new  ArrayList<>();
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        ob.add(7);
        ob.add(8);
        ob.add(9);
        ob.add(10);
        System.out.println(ob);

        //push
         ob.add(11);
         System.out.println(ob);

        //pop
        ob.remove(ob.size()-1);  // ✅
        System.out.println(ob);

        //shift
        ob.remove(3);
        System.out.println(ob);

        //unshift
        ob.add(9,50);
        System.out.println(ob);

        //splice
      
        // splice (remove 2 items starting from index 2)
        for (int i = 0; i < 5; i++) {
            ob.remove(1)    ;
        }
        System.out.println(ob);


        
       

        
        






    }
    
}
