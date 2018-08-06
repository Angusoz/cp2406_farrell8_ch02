public class QuartsToGallons
{
    public static void main(String[] args)
    {

        final int quartsInAGallon = 4;
        int neededQuarts = 18;
        System.out.println("A job that needs " + neededQuarts + " quarts requires " + neededQuarts / quartsInAGallon
                + " gallons plus " + neededQuarts % quartsInAGallon + " quarts.");
    }
}
