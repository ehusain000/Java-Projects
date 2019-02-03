public class Hello {

    public static void main (String[] args){

        System.out.println("Hello Eftekher!");

        int myFirstNumber = (5 + 10) + (2 *10);
        int mySecondNumber = 12 * myFirstNumber;
        int myThirdNumber = 10 * mySecondNumber;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println("First you wrote " + myFirstNumber);
        System.out.println("Then you wrote " + mySecondNumber);
        System.out.println("And then you wrote " + myThirdNumber);
        System.out.println( "so your total is: " + myTotal);

        int quiz = 1000 - myTotal;
        System.out.println( "The answer of the quiz: " + quiz);

    }
}
