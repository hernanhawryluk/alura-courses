public class Movie {
    String name;
    int launchDate;
    int durationInMinutes;
    boolean includedInThePlan;
    private double sumOfEvaluations;
    private int totalOfEvaluations;

    void displayTechnicalSpecifications() {
        System.out.println("The name of the movie is: " + name);
        System.out.println("It was launch on: " + launchDate);
        System.out.println("The duration in minutes is: " + durationInMinutes);
    }

    void evaluate(double note) {
        sumOfEvaluations += note;
        totalOfEvaluations++;
    }

    double calcMedia() {
        return sumOfEvaluations / totalOfEvaluations;
    }
}
