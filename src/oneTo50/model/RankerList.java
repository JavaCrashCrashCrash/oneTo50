package oneTo50.model;

import java.util.ArrayList;

public class RankerList {
	ArrayList<ranker> rankerList = new ArrayList();
}

class ranker {
	String name;
	int record;

	ranker(String name, int record) {
		this.name = name;
		this.record = record;
	}
}