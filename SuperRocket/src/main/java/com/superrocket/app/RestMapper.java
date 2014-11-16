package com.superrocket.app;

import java.util.ArrayList;

public interface RestMapper {
	ArrayList<Rest> getRest();
	void insertRest(Rest rest);
	//void updateRest(String name);
	//void deleteRest(String name);
}