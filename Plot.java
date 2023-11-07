
public class Plot extends Object {
private int x;
private int y;
private int width;
private int depth;


public Plot() {
	this.depth = 10;
	this.width = 10;
}

public Plot(int x, int y, int width, int depth){
	this.x = x;
	this.y=y;
	this.width= width;
	this.depth = depth;
}
public Plot(Plot otherPlot) {
	this.x = otherPlot.x;
	this.y = otherPlot.y;
	this.width = otherPlot.width;
	this.depth = otherPlot.depth;
}

public void setX(int x) {
	this.x = x;
}
public void setY(int y) {
	this.y = y;
}
public void setwidth(int width) {
	this.width = width;
}
public void setDepth(int depth) {
	this.depth = depth;
}

public int getX() {
	return x;
}
public int getY() {//returns boolean apparently
	return y;
}
public int getWidth() {
	return width;
}
public int getDepth() {
	return depth;
}

public boolean overlaps(Plot plot) {
	System.out.println(" Here is the get shit:"+plot);
	
	
	if((this.x<= plot.getX()) && (this.x+ this.width >= plot.getX()+plot.getWidth())||((this.y+this.depth > plot.getY()+plot.getDepth())&&(this.y <= plot.getY()))) {
		System.out.println("Major fuck ups here");return true;
	}
	else if(((this.x >= plot.getX())&&(this.x <= plot.getX()+plot.getWidth()-1))&&((this.y >= plot.getY())&&(this.y <= plot.getY()+plot.getDepth()-1))){
		System.out.println("BS");return true;
	}
	else if(((this.x+this.width <= plot.getX()+plot.getWidth())&&(this.x+this.width >= plot.getX()+1))&&((this.y+this.depth >= plot.getY()+1)&&(this.y+this.depth <= plot.getDepth()+plot.getY()))) {
		System.out.println("BS2");return true;
	}
	return false;
	
}



public boolean encompass(Plot plot) {
	int x2 = plot.getX();
	int width2 = plot.getWidth();
	int y2 = plot.getY();
	int depth2 = plot.getDepth();
	
		if((x2 + width2) <= 10) {
			return true;
		}
		else if((y2 + depth2) <= 10){
			return true;
		}
		else return false;
	
}

public String toString() {
	String plotString = "";
	
	plotString += x + "," + y + "," + width + "," + depth;
	return plotString;
}




}
