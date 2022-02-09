package oneTo50.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class RankerList {
	static ArrayList<Ranker> rankerList;
	RankerDB rankerDB;

	public RankerList() {
		rankerList = new ArrayList<>();
		rankerDB = new RankerDB();
	}

	public void addRanker(String name, int record) {
		Ranker ranker = new Ranker(name, record);
		rankerList.add(ranker);
		rankerDB.insertRankerDB(name, record);
	}

	public void rankerSort(ArrayList<Ranker> rankerList) {
		Collections.sort(rankerList);
	}

	public void rankerCheck(int record, ArrayList<Ranker> rankerList) {
		boolean rankerCheck;
		Ranker worstRanker = null;
		int worstRecord = 10000;
		for (Ranker r : rankerList) {
			if (r.record < worstRecord) {
				worstRanker = r;
				worstRecord = r.record;
			}
		}
		if (record < worstRecord) {
			rankerCheck = true;
		} else {
			rankerCheck = false;
		}
		if (rankerCheck == true) {
			rankerList.remove(worstRanker);
			
		}

	}
}