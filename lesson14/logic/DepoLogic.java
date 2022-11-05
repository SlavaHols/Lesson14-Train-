package lt.lhu.lesson14.logic;

import java.util.Collections;
import java.util.List;
import java.util.Comparator;
import lt.lhu.lesson14.bean.Train;

public class DepoLogic {
	public List<Train> sortByNumber(List<Train> trains) {
		trains.sort((t1, t2) -> t2.getNumber() - t2.getNumber());
		return trains;

	}

	public void sortByDepartureAndTime(List<Train> trains) {
		Collections.sort(trains, new Comparator<Train>() {
			public int compare(Train t1, Train t2) {
				if (t1.getDepaturePlace() == t2.getDepaturePlace()) {
					return t1.getDepatureTime().compareTo(t2.getDepatureTime());
				} else {
					return t1.getDepaturePlace().compareTo(t2.getDepaturePlace());

				}
			}
		});
	}

	public void find(int number, List<Train> trains) {
		for (Train t : trains) {
			if (t.getNumber() == number) {
				System.out.print("Departure Place: " + t.getDepaturePlace() + ", " + "Train Number: " + t.getNumber()
						+ ", " + "Departure Time : " + t.getDepatureTime());
				System.out.println();
			}
		}

	}

}
