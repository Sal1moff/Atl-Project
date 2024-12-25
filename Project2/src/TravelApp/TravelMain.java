package TravelApp;

import java.util.ArrayList;

public class TravelMain {
    public static void main(String[] args) {
        Tour tour1 = new Tour(1, "Sunny Beach Holiday", 200.0, TourPackage.BEACH_HOLIDAY);
        Tour tour2 = new Tour(2, "Urban City Adventure", 150.0, TourPackage.CITY_TOUR);
        Tour tour3 = new Tour(3, "Mountain Trekking", 300.0, TourPackage.MOUNTAIN_ADVENTURE);

        ArrayList<Tour> agency=new ArrayList<>();
        agency.add(tour1);
        agency.add(tour2);
        agency.add(tour3);




        tour1.reserveTour();
        tour1.cancelReservation();
        tour2.reserveTour();
    }
}
