package pre.propertiesEx2;

public class Drama implements Comparable<Drama>{
//필드
	private String name;
	private int 출시년도;
	private int 부작;
//메서드
	//Setter
	public void setName(String name) {
		this.name = name;
	}
	public void set출시년도(int 출시년도) {
		this.출시년도 = 출시년도;
	}
	public void set부작(int 부작) {
		this.부작 = 부작;
	}
	//Getter
	public String getName() {
		return name;
	}
	public int get출시년도() {
		return 출시년도;
	}
	public int get부작() {
		return 부작;
	}
	//기본생성자
	public Drama() {
		// TODO Auto-generated constructor stub
	}
	//필수생성자
	public Drama(String name, int 출시년도, int 부작) {
		this.name = name;
		this.출시년도 = 출시년도;
		this.부작 = 부작;
	}
	//toString
	@Override
	public String toString() {
		return "name=" + name + ", 출시년도=" + 출시년도 + ", 부작=" + 부작;
	}
	//compareTo
	@Override
	public int compareTo(Drama o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
}
