import java.util.LinkedList;
import java.util.Queue;

public class Queue_Examples {
    public static void main(String[] args) {
        Queue<Integer> numbers=new LinkedList<>();
        // offer works just like the add() but in add() it throws exception when the
        // capacity of the container is full but in this it doesnt throw exception instead
        // it throws false which is more convinient .
        numbers.offer(27);
        numbers.offer(21);
        numbers.offer(9);
        System.out.println("Queue : "+numbers);

        int NumberAccesser = numbers.peek(); // prints the head of the list
        System.out.println("The element accessed is : " +NumberAccesser );

        int RemovingNumber= numbers.poll();
        System.out.println("The Number which are removed is : " +RemovingNumber );

        System.out.println("Remainig number in the list is : "+ numbers);

    }
}
