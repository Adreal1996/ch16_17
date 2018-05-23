package ch16;

/*
Write a method called removeRange that accepts a starting and ending index as parameters and removes
the elements at those indexes (inclusive) from the list. For example, if a variable list stores
the values [8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92], the call of listRange.removeRange(3, 8);
should remove values between index 3 and index 8 (the values 4 and 7), leaving the list of
[8, 13, 17, 23, 0, 92]. The method should throw an IllegalArgumentException if either of the positions is negative.
Otherwise you may assume that the positions represent a legal range of the list (0 start end size).
 */

public class opg17
{
    public static void main(String[] args)
    {
        LinkedIntList myList = new LinkedIntList();
        myList.add(8);
        myList.add(13);
        myList.add(17);
        myList.add(4);
        myList.add(9);
        myList.add(12);
        myList.add(98);
        myList.add(41);
        myList.add(7);
        myList.add(23);
        myList.add(0);
        myList.add(92);
        myList.removeRange(3, 8);
        System.out.println(myList);
    }
}
