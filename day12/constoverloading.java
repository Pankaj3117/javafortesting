package day12;

public class constoverloading {

	double height, weight;

	constoverloading() {
		height = 0;
		weight = 0;
	}

	constoverloading(double h, double w) {
		height = h;
		weight = w;
	}

	constoverloading(double l) {
		height = weight = l;
	}

	double v() 
	{
           return height*weight;
	}
}