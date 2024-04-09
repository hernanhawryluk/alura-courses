public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Screen Match!");
        System.out.println("Movie: Matrix");

        int launchDate = 1999;
        boolean includedInThePlan = true;
        double movieReview = 8.2;
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String synopsis = """
                Matrix is a paradox.
                The best movie of the turn of the millennium.
                It was released on: %s""".formatted(launchDate);
        System.out.println(synopsis);

        int classification = (int) media / 2;
        System.out.println("Classification: " + classification);

    }
}