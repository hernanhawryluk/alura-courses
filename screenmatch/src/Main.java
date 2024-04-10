public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        myMovie.name = "Encanto";
        myMovie.launchDate = 2021;
        myMovie.durationInMinutes = 120;

        myMovie.displayTechnicalSpecifications();
        myMovie.evaluate(10);
        myMovie.evaluate(7.8);
        System.out.println("The sum of the evaluations is: " + myMovie.sumOfEvaluations);
        System.out.println("The total of evaluations is: " + myMovie.totalOfEvaluations);
        System.out.println("The rating of the movie is: " + myMovie.calcMedia());

        Movie otherMovie = new Movie();
        otherMovie.name = "Matrix";
        otherMovie.launchDate = 1998;
        otherMovie.durationInMinutes = 180;
//        otherMovie.displayTechnicalSpecifications();

    }
}