
class Fruit<T extends Fruit> implements Comparable<Fruit> {

	private final int weigth;

	public Fruit(int weight) {
		this.weigth = weight;
	}

	@Override
	public int compareTo(Fruit other) {
		return Integer.compare(this.weigth, other.weigth);
	}

	public int getWeigth() {
		return this.weigth;
	}

}

class Apple extends Fruit {

	public Apple(int weight) {
		super(weight);
	}

}

class Orange extends Fruit {

	public Orange(int weight) {
		super(weight);
	}

}