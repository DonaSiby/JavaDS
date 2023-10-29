package problems;

import java.util.LinkedList;
import java.util.List;

public class LL {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(
                List.of(1,2,3,4,5)
        );
        deleteNode(3,linkedList);
    }
    private static void deleteNode(int n,LinkedList<Integer> linkedList){
        if(linkedList.isEmpty() || n<=0 || n>linkedList.size()){
            System.out.println("Invalid operation !! Unable to delete the requested element");
        }
        else {
            linkedList.remove(n-1);
            System.out.println(linkedList);
        }
    }
}
