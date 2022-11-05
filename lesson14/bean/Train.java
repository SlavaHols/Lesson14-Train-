package lt.lhu.lesson14.bean;

import java.util.Date;
import java.util.Objects;

public class Train {

	private int number;
	private String depaturePlace;
	private Date depatureTime;

	public Train(String depaturePlace, int number, Date depatureTime) {
		this.number = number;
		this.depaturePlace = depaturePlace;
		this.depatureTime = depatureTime;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return this.number;
	}

	public void setDepaturePlace(String depaturePlace) {
		this.depaturePlace = depaturePlace;
	}

	public String getDepaturePlace() {
		return this.depaturePlace;
	}

	public void setDepatureTime(Date depatureTime) {
		this.depatureTime = depatureTime;
	}

	public Date getDepatureTime() {
		return this.depatureTime;
	}

	@Override
	public int hashCode() {
		return Objects.hash(depaturePlace, depatureTime, number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		return Objects.equals(depaturePlace, other.depaturePlace) && Objects.equals(depatureTime, other.depatureTime)
				&& number == other.number;
	}

	@Override
	public String toString() {
		return "Train [number= " + number + ", depaturePlace = " + depaturePlace + ", depatureTime = " + depatureTime + "]";
	}
}