package giftItems;

//public class Chocolate {
//
//}
public class Chocolate extends Sweet implements Comparable<Chocolate>{

	
//	private String name;
//    private int price;
//    private int weight;
	public Chocolate(String name, double cost, double weight) {
//		this.name = name;
		this.name=name;
		this.cost = cost;
		this.weight = weight;
	}
	
	public Chocolate() {
		// TODO Auto-generated constructor stub
	}

	public int compareTo(Chocolate o) {
		return (this.getCost() < o.getCost() ? -1 :
            (this.getCost() == o.getCost() ? 0 : 1));
	}
	

	public String toString() {
        return "Chocolate { " +
                "Name = '" + name + '\'' +
                ", Cost = ₹" + cost +
                " /-, Weight = " + weight + " grams };";
    }
	

	public void addTotalWeight(double weight) {
		this.totalWeight += weight;
	}
	
	public double getTotalWeight() {
		return this.totalWeight;
	}
	

	public void addTotalCost(double weight) {
		this.totalCost += cost;
	}
	
	public double getTotalCost() {
		return this.totalCost;
	}
}