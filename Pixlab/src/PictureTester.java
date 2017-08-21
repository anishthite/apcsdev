/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 *
 * Edited by Anish Thite April 17 2017
 * Notre Dame High School
 *
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  //Added by Anish Thite
  public static void testMirrorVerticalRighttoLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRighttoLeft();
    caterpillar.explore();
  }
  //Added by Anish Thite 
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  //Added by Anish Thite
  public static void testMirrorHorizontalBottoTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottoTop();
    caterpillar.explore();
  }
  //Added by Anish Thite
  public static void testMirrorDiagonal(){
	  Picture caterpillar = new Picture("caterpillar.jpg");
	  caterpillar.explore();
	  caterpillar.mirrorDiagonal();
	  caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
//Added by Anish Thite
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
//Added by Anish Thite
  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorgull();
    seagull.explore();
  }

  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  //Added by Anish
  public static void testKeepOnlyBlue(){
	 Picture beach = new Picture("beach.jpg");
	 beach.KeepOnlyBlue();
	 beach.explore();
  }
//Added by Anish
  public static void testNegate(){
	  Picture beach = new Picture("beach.jpg");
		 beach.Negate();
		 beach.explore();
	  
  }
//Added by Anish
public static void testGrayscale(){
	 Picture beach = new Picture("beach.jpg");
	 beach.Grayscale();
	 beach.explore();
	
	
}
//Added by Anish
public static void testFixUnderwater(){
	 Picture water = new Picture("water.jpg");
	 water.explore();
	 water.FixUnderwater();
	 water.explore();
	
	
}
//Added by Anish Thite
public static void testMyCollage(){
	 Picture myCanvas = new Picture("640x480.jpg");
	 myCanvas.createMyCollage();
	 myCanvas.explore();
	
	
}
//Added by Anish Thite
public static void testsecondCopy(){
	Picture beach = new Picture("beach.jpg");
	beach.explore();
	beach.secondCopy(beach, 150, 150, 250, 250);
	beach.explore();
}
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRighttoLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalBottoTop();
    //testMirrorDiagonal();
	//testMirrorArms();
	//testMirrorGull();
	  //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testsecondCopy();
    testMyCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}