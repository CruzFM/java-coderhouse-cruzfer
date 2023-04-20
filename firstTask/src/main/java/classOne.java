public class classOne {
    public static void main(String[] args) {

        //We declare a variable that will contain a float number.
        float mainNumber = 3.9405830f;

        //We declare a variable that will cast our mainNumber into an integer.
        int intPart = (int) mainNumber;

        //We use operators to obtain the floating part out of our mainNumber.
        float floatPart = mainNumber - intPart;

        //We print the results as requested in the task.
        System.out.println("The integer part of our main number is: " + intPart);
        System.out.println("The float part of our main number is: " + floatPart);
    }
}
