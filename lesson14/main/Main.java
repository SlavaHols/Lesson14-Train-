package lt.lhu.lesson14.main;

import java.util.Date;

import lt.lhu.lesson14.bean.Depo;
import lt.lhu.lesson14.bean.Month;
import lt.lhu.lesson14.bean.Train;
import lt.lhu.lesson14.logic.DepoLogic;
import lt.lhu.lesson14.view.DepoView;

public class Main {
	public static void main(String[] args) {
		Date d1 = new Date(2022 - 1900, Month.JANUARY, 12, 15, 00);
		Date d2 = new Date(2022 - 1900, Month.FEBRYARY, 11, 25, 11);
		Date d3 = new Date(2022 - 1900, Month.MARCH, 1, 20, 35);
		Date d4 = new Date(2022 - 1900, Month.APRIL, 9, 15, 2);
		Date d5 = new Date(2022 - 1900, Month.MAY, 14, 20, 00);

		Train t1 = new Train("Minsk", 23, d1);
		Train t2 = new Train("Vitsebsk", 10, d2);
		Train t3 = new Train("Brest", 15, d3);
		Train t4 = new Train("Minsk", 1, d4);
		Train t5 = new Train("Pinsk", 11, d5);

		Depo depo = new Depo();

		depo.addTrains(t1);
		depo.addTrains(t2);
		depo.addTrains(t3);
		depo.addTrains(t4);
		depo.addTrains(t5);

		DepoLogic dl = new DepoLogic();

		dl.sortByNumber(depo.getTrains());

		DepoView dv = new DepoView();
		dv.print(depo.getTrains());

		dl.find(11, depo.getTrains());

		dl.sortByDepartureAndTime(depo.getTrains());
		dv.print(depo.getTrains());

	}
}
