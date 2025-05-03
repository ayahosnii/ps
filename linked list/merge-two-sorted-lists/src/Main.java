import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> listOne = new LinkedList<>();
        LinkedList<Integer> listTwo = new LinkedList<>();
        LinkedList<Integer> outPut = new LinkedList<>();

        listOne.addFirst(1);
        listOne.add(2);
        listOne.addLast(4);
        System.out.println(listOne);


        listTwo.addFirst(1);
        listTwo.add(3);
        listTwo.addLast(4);
        for (Integer item : listOne) {
            System.out.println(item);
        }
    }
}