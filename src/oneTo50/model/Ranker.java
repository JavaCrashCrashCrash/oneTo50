package oneTo50.model;

public class Ranker implements Comparable<Ranker> {
	String name;
	int record;

	public Ranker(String name, int record) {
		this.name = name;
		this.record = record;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRecord() {
		return record;
	}

	public void setRecord(int record) {
		this.record = record;
	}

	@Override
	public int compareTo(Ranker ranker) {
		// TODO Auto-generated method stub
		if (ranker.record < record) {
			return 1;
		} else if (ranker.record > record) {
			return -1;
		}
		return 0;
	}
}
