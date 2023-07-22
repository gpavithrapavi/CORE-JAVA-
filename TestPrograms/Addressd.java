package TestPrograms;

public class Addressd {
	
	private int Hno;
	private String villageName;
	private String dist;
	
	
	public Addressd(int hno, String villageName, String dist) {
		super();
		Hno = hno;
		this.villageName = villageName;
		this.dist = dist;
	}

	@Override
	public String toString() {
		return "Address [Hno=" + Hno + ", villageName=" + villageName + ", dist=" + dist + "]";
	}

	public int getHno() {
		return Hno;
	}

	public void setHno(int hno) {
		Hno = hno;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	
	
	
	
}
