import java.util.LinkedList;
import java.util.List;

public class List_Interface {
    // This is the implementation of the ArrayList
    public static void main(String[] args) {
//        // This is the implementation of the ArrayList
//        // List counting always starts from "Zero".
//        List<Integer> numberTobeDisplayed=new ArrayList<>();
//
//        // now we are adding the element to the list
//        numberTobeDisplayed.add(100);
//        numberTobeDisplayed.add(101);
//        numberTobeDisplayed.add(102);
//        numberTobeDisplayed.add(103);
//        System.out.println("The added number are : "+ numberTobeDisplayed);
//
//        int number= numberTobeDisplayed.get(1);
//        System.out.println("The number we got was : "+number);
//
//        int theRemovingNumber=numberTobeDisplayed.remove(2);
//        System.out.println("The number which was removed is: "+theRemovingNumber); List<Integer> numberTobeDisplayed=new ArrayList<>();

        // This is the example of LinkedList
        List<Integer>numberTobeDisplayed=new LinkedList<>();
        numberTobeDisplayed.add(100);
        numberTobeDisplayed.add(101);
        numberTobeDisplayed.add(102);
        numberTobeDisplayed.add(103);
        System.out.println("The added number are : "+ numberTobeDisplayed);

        int number= numberTobeDisplayed.get(1);  // this gives the position of the number in the list
        System.out.println("The number we got was from 1 is  : "+number);

        int PostionOf=numberTobeDisplayed.indexOf(102);// this display where the number is on the list
        System.out.println("The Position of 102 is : "+PostionOf);

        int theRemovingNumber=numberTobeDisplayed.remove(2); // this removes the element from the list
        System.out.println("The number which was removed is: "+theRemovingNumber);
    }
}
