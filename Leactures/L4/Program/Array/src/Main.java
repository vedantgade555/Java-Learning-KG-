//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] myArr= new int[5];
        myArr[0]=98;
        myArr[1]=93;
        myArr[2]=94;
        myArr[3]=95;
        myArr[4]=96;

        System.out.println(myArr[2]);
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);

        int[] Arr={1,2,5,4,6};
//        System.out.println(Arr[3]);
//        int index=2;

//        System.out.println(Arr[index]);


        int index=0;

        while (index<myArr.length)
        {
            System.out.println(myArr[index]);
            index++;
        }

    }
}