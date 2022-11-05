package lt.lhu.lesson14.view;

import java.util.List;

import lt.lhu.lesson14.bean.Train;

public class DepoView {
	public DepoView() {}
	
	public void print(List<Train> trains) {
		for(Train tr: trains) {
			System.out.print("Departure Place: " + tr.getDepaturePlace() +", "+ "Train Number: " + tr.getNumber()
			+", "+ "Departure Time : "  +"  " + tr.getDepatureTime() + ";");
	System.out.println();
	
			
		}
		
	}

}
