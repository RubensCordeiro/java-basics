package enums;
import enums.RandomConstant;

public class EnumExample {
    public static void main (String[] args) {
        RandomConstant constOne = RandomConstant.FIRST;
        RandomConstant constTwo = RandomConstant.SECOND;
        RandomConstant constThree = RandomConstant.THIRD;

        System.out.println(constOne.getName() + ": " + constOne.getValue());
        System.out.println(constTwo.getName() + ": " + constOne.getValue());
        System.out.println(constThree.getName() + ": " + constOne.getValue());
    }
}
