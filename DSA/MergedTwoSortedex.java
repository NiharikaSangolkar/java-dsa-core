// // Merge Two Sorted Arrays
// arr1=[1,3,5]
// arr2=[2,4,6]

// Output:
// [1,2,3,4,5,6]

import java.util.*;
class MergeArrayEx
{
    public static void main(String[]args)
    {
        int arr1[]={1,3,5};
        int arr2[]={2,4,6};
      ArrayList<Integer>list=new ArrayList<>();
      for(int num:arr1)
      {
          list.add(num);
      }
       for(int num:arr2)
      {
          list.add(num);
      }
      Collections.sort(list);
      System.out.println(list);
    }
}
/*
op:
[1, 2, 3, 4, 5, 6]


*/
