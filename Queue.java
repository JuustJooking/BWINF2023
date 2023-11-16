package bwinf2023;

public class Quader {
    private int xCoordinate; //wie breit es in x ist laut texteingabe
    private int yCoordinate; //wie breit es ist in y laut texteingabe
    private int zCoordinate; //wie breit es ist in z laut texteingabe
    private int surface; //id des Quaders
    private int closestx; //x am nähesten am nullpunkt
    private int closesty; //y am nähesten am nullpunkt
    private int closestz; //z am nähesten am nullpunkt
  
  
    // Constructor
    public Quader(int x, int y, int z, int px, int py, int pz) {
        this.xCoordinate = x;
        this.yCoordinate = y;
        this.zCoordinate = z;
        
        this.closestx = px;
        this.closesty = py;
        this.closestz = pz;
        this.surface = 2*x*y+2*x*z+2*y*z;
    }
  
    //override methoden 
    
    // Getters and Setters
    // ...
    public int getX()
    {
    	return xCoordinate;
    }
    public int getY()
    {
    	return yCoordinate;
    }
    public int getZ()
    {
    	return zCoordinate;
    }
    public int getSurface()
    {
    	return surface;
    }
    public int currentX()
    {
    	return closestx;
    }
    public int currentY()
    {
    	return closesty;
    }
    public int currentZ()
    {
    	return closestz;
    }
    public boolean getAll()
    {
     System.out.println(getX() +" "+ getY() +" "+ getZ() +" "+ getSurface() + " "+currentX() + " "+currentY() + " "+ currentZ() );
    return true;
    }
}
