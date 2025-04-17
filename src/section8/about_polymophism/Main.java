package about_polymophism;

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
//        Movie movie = Movie.getMovie("A", "Jaws");
//        movie.watchMovie();
//
//        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
//        jaws.watchMovie();
//
//        Object comedy = Movie.getMovie("C", "Airplane");
//        Comedy comedyMovie = (Comedy) comedy;
//        comedyMovie.watchComedy();
//
//        var airplane = Movie.getMovie("C", "Airplane");
//        airplane.watchMovie();
//
//        System.out.println("----------");
//        Object unknownObject = Movie.getMovie("C", "Unknown");
//        if(unknownObject.getClass().getSimpleName().equals("Comedy")){
//            Comedy unknownComedy = (Comedy) unknownObject;
//            unknownComedy.watchComedy();
//        } else if (unknownObject instanceof Adventure){
//            ((Adventure) unknownObject).watchAdventure();
//        }else if (unknownObject instanceof ScienceFiction syfy){
//            syfy.watchScienceFiction();
//        }


        //Car
        Car car = new Car("202 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("---------");
        Car ferrari = new ElectricCar("202 Blue Ferrari 296 GTS", 15.4, 6);
        runRace(ferrari);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3");
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);
//        AnotherCar car = new AnotherCar(8, "Base car");
//        System.out.println(car.startEngine());
//        System.out.println(car.accelerate());
//        System.out.println(car.brake());
//
//        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
//        System.out.println(mitsubishi.startEngine());
//        System.out.println(mitsubishi.accelerate());
//        System.out.println(mitsubishi.brake());
//
//        Ford ford = new Ford(6, "Ford Falcon");
//        System.out.println(ford.startEngine());
//        System.out.println(ford.accelerate());
//        System.out.println(ford.brake());
//
//        Holden holden = new Holden(6, "Holden Commodore");
//        System.out.println(holden.startEngine());
//        System.out.println(holden.accelerate());
//        System.out.println(holden.brake());
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
