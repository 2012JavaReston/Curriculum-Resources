package com.revature;

import com.revature.dao.PlanetDao;

public class MainDriver {

	public static void main(String[] args) {
		
		
		PlanetDao pDao = new PlanetDao();
		
//		System.out.println(pDao.selectAll());
		System.out.println(pDao.selectVenusByName());

	}

}
