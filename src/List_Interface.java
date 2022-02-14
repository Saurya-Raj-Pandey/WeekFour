import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

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
//        System.out.println("Taking the element from the Arraylist to array : ");
//
//        for(Integer NumberOutOfList:numberTobeDisplayed){
//            System.out.print(NumberOutOfList);
//            System.out.print(", ");

        // This is the example of LinkedList
        LinkedList<Integer>numberTobeDisplayed=new LinkedList<>();
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
        System.out.println("After Removing the number we get is :"+numberTobeDisplayed);

        System.out.println("Taking the element from the linked list to array : ");

        for(Integer NumberOutOfList:numberTobeDisplayed){
            System.out.print("Array : "+NumberOutOfList + "   ");
            ArrayList<Integer> ArrayListToArray=new ArrayList<>(Arrays.asList(NumberOutOfList)); // arrays.asList() converts array to arraylist
            System.out.println("Converting the array to arrayllist : "+ArrayListToArray);

        }
        LinkedList<String> SingleLineDisplay=new LinkedList<>(Arrays.asList("Info","Developers","Ltd")); // using this we can print the arrays in the list

        System.out.println("The List we get is : "+SingleLineDisplay);
        Vector<String> VectorAdd=new Vector<>();
        VectorAdd.add("Sanepa");
        VectorAdd.add(0,"Location: ");
        VectorAdd.add(2,"Company name : ");

        VectorAdd.addAll(SingleLineDisplay);
        System.out.println("using the Vector : " + VectorAdd);
        for (String OutfTheArraylist: VectorAdd) {
            System.out.println("Array : "+ OutfTheArraylist);
            LinkedList<String> New=new LinkedList<>(Arrays.asList(OutfTheArraylist));
            System.out.println("ArrayList :  "+New);
        }
        VectorAdd.clear();
        System.out.println("Vector after the clear : "+VectorAdd);


    }
}
