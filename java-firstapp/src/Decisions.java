public class Decisions {
    public static void main(String[] args) {
        int launchDate = 1999;
        boolean includedInThePlan = true;
        String planType = "plus";
        double movieReview = 8.2;


        if (launchDate >= 2022) {
            System.out.println("Most popular movies");
        } else {
            System.out.println("Retro movies that are worth to watch");
        }

        if (includedInThePlan && planType.equals("plus")) {
            System.out.println("Enjoy the movie");
        } else {
            System.out.println("The movie is not available in your current plan");
        }
    }
}
