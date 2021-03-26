package coll;

import java.awt.Color;

class Ball {
	int x = 0;
	int y = 0;
	int dx = 2;
	int dy = 2;
	int radius = 5; // Ball radius
	Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

}