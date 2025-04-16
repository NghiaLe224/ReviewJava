package AboutPolymophism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Adventure("Star War");
//        theMovie.watchMovie();
//        Movie theComedyMovie = new Comedy("Star War");
//        theComedyMovie.watchMovie();
//        Movie theScienceFictionMovie = new ScienceFiction("Star War");
//        theScienceFictionMovie.watchMovie();
//        Movie theMovie = Movie.getMovie("Comedy", "Star Wars");
//        theMovie.watchMovie();

//        Scanner sc = new Scanner(System.in);
//        while(true){
//            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction or Q to Quit: ");
//            String type = sc.nextLine();
//            if("Qq".contains(type)){
//                break;
//            }
//            System.out.print("Enter Movie Title: ");
//            String title = sc.nextLine();
//            Movie movie = Movie.getMovie(type, title);
//            movie.watchMovie();
//        }

        //Casting with VAR
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();
    }
}
