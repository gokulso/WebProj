package test.multithread.datashare;

public class DataInfo {
	
	private int id;
	private String name;
	
	public DataInfo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "DataInfo [id=" + id + ", name=" + name + "]";
	}
	
	

}
