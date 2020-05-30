package sorting.withCamparableAndComparator;

public class Player implements Comparable<Player>{
	
    private int ranking;
    private String name;
    private int age;
    
   
	public Player(int ranking, String name, int age) {
		super();
		this.ranking = ranking;
		this.name = name;
		this.age = age;
	}
	
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Player otherPlayer) {
		return this.getRanking() - otherPlayer.getRanking();
	}

	@Override
	public String toString() {
		return "Player [ranking=" + ranking + ", name=" + name + ", age=" + age + "]";
	}
     
    
    
    
}