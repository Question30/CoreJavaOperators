//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AssignmentOperatorDemo {
    public static void main(String[] args) {
        //Assigning Primitive Value
        int j , k;
        j = 10; //j gets the value 10
        j = 5;// j gets reassigned to 5
        k = j;//k gets the value 5 from j

        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        //Multiple assignments
        k = j = 10;// k = (j = 10)
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
    }
}