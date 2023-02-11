import java.util.*;
class arraylist
{
public static void main(String[] args) 
 {
  ArrayList<Integer> list = new ArrayList<Integer>();

  //add elements
  list.add(0);
  list.add(1);
  list.add(2);
  list.add(3);
  list.add(4);
  list.add(5);
  list.add(6);
  System.out.println(list);
   
   //get element
   int element = list.get(5);
   System.out.println(element);
   
   //add element
   list.add(2,8);
   System.out.println(list);

   //set element
   list.set(5,9);
   System.out.println(list);

   //delete element
   list.remove(5);
   System.out.println(list);

   //size
   int size = list.size();
   System.out.println(size);

   //loops
   for(int i=0; i<list.size(); i++)
   System.out.println(list.get(i));

   //collections
   Collections.sort(list);
   System.out.println(list);
 }
}