import java.util.*;
//Array list in java
//-it is a inbuilt data struture
//-linear
//-Dynamic size

public class  basicsArrayList{
    public static void swap(ArrayList<Integer>list,int i,int j){
        int temp = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
    }
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> l2 = new ArrayList<>();

        // //Add elements in a array list
        // list.add(2);
        // list.add(3);
        // list.add(5);
        // list.add(4);
        // list.add(6);
        // list.add(8);
        // list.add(7);

        // System.out.println(list); //Print the ArrayList
        // //System.out.println(list.get(2));
        // //list.remove(4); //Remove elements from ArrayList

        // list.add(5,10);
        // System.out.println(list);
        // System.out.println(list.size());
        // System.out.println("Swap");
        // int i =0 ;
        // int j = 4;
        // swap(list,i,j);
        // System.out.println(list);
        // System.out.println("After Sorting");
        // Collections.sort(list);
        // System.out.println(list);
        // System.out.println("Reverse order");
        // Collections.sort(list,Collections.reverseOrder());
        // System.out.println(list);

        System.out.println("Multi Dimensional ArrayList:");
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);

        System.out.println(mainList);

    }
}