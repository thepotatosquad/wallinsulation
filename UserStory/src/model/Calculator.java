package model;
/**
 * Back-End for calculator
 * @author ThePotatoSquad
 *
 */
public class Calculator {
	/** to keep track of the number of walls that should not change. **/
	private static int myNumOfWalls;
	/** store my width. **/
	private double myWidth;
	/** store my height. **/
	private double myHeight;
	/** store my length. **/
	private double myLength;
	/** store my price from store. **/
	private double myPrice;
	/** store my total cost of a wall. **/
	private double myCost;
	
	/**
	 * Constructor for calculator.
	 */
	public Calculator(){
		myWidth = 0;
		myHeight = 0;
		myLength = 0;
		myPrice = 1;
		myCost = 0;
	}
	/**
	 * Setter for number of walls 
	 * @param theNum the number of walls
	 */
	public void setNumOfWalls(int theNum){
		myNumOfWalls = theNum;
		//System.out.println("set" + myNumOfWalls);
		
	}
	/**
	 * Getter for number of walls
	 * @return the number of walls
	 */
	public int getNumOfWalls(){
		//System.out.println("get"+ myNumOfWalls);
		return myNumOfWalls;
	}
	/**
	 * Setter for height.
	 * @param theHeight the height to be stored
	 */
	public void setHeight(double theHeight){
		myHeight = theHeight;
	}
	/**
	 * Getter for height.
	 * @return the height
	 */
	public double getHeight (){
		return myHeight;
	}
	/**
	 * Setter for length.
	 * @param theLength the length to be stored
	 */
	public void setLength(double theLength){
		myLength = theLength;
	}
	/**
	 * Getter for length.
	 * @return the length
	 */
	public double getLength(){
		return myLength;
	}
	/**
	 * Setter for width.
	 * @param theWidth the width to be stored
	 */
	public void setWidth(double theWidth){
		myWidth = theWidth;
	}
	/**
	 * Getter for the width.
	 * @return the width
	 */
	public double getWidth(){
		return myWidth;
	}
	/**
	 * Setter for the price.
	 * @param thePrice the price chosen
	 */
	public void setPrice(double thePrice){
		myPrice = thePrice;
	}
	/**
	 * Getter for the price.
	 * @return the price
	 */
	public double getPrice(){
		return myPrice;
	}
	/**
	 * To calculate cost using width, height, and length.
	 * along with the price
	 */
	public void calculateCost(){
		myCost = (myWidth * myHeight * myLength) * myPrice;
	}
	/**
	 * To get the cost after calculating the cost.
	 * @return the cost
	 */
	public double getCost(){
		return myCost;
	}
}
