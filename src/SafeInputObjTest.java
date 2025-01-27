import java.util.Scanner;

public class SafeInputObjTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SafeInputObj object = new SafeInputObj(in);
        String testsPassed = "";

        String testString = "";
        int testInt;
        double testDouble;
        boolean testBool;





        testString = object.getNonZeroLenString("enter a String");
        System.out.println(testString);
        testsPassed = "getNonZeroLenString passed \n";

        testInt = object.getRangedInt("test ranged int", 1, 1000);
        System.out.println(testInt);
        testsPassed += "getRangedInt passed \n";

        testInt = object.getInt("test any int");
        System.out.println(testInt);
        testsPassed += "getInt passed \n";

        testDouble = object.getRangedDouble("Test Ranged Double", 1, 1000);
        System.out.println(testDouble);
        testsPassed += "getRangedDouble passed \n";

        testDouble = object.getDouble("Test Any Double");
        System.out.println(testDouble);
        testsPassed += "getDouble passed \n";

        testBool = object.getYNConfirm("test Y/N");
        System.out.println(testBool);
        testsPassed += "getYNConfirm passed \n";

        testString = object.getRegExString("a string that contains only numbers, no letters", "^\\d+$");
        System.out.println(testString);
        testsPassed += "getRegExString passed";

        System.out.println(testsPassed);





    }
}
