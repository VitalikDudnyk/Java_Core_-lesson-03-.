package ua.lviv.lgs;

public class Rectangle {
	
	private int widht;
	private int height;
	private int w;
	private int h;
	
	Rectangle (int widht, int height){
	this.widht = widht;
    this.height = height;
    
	}
	
    void Perimetr (int widht, int height){
    this.widht = w;
    this.height = h;
    }
    
    public void Rectangele() {  
		System.out.println("Area of the rectangle = there will be an area");
	}
	public void Perimetr() {  
	    System.out.println("Perimeter of the rectangle = here will be the perimeter");
	}	        

		
 public static void main(String[] args) {
		
	 
	 
	 int widht = 5;
	 int height = 6;
	 int w = 7;
	 int h = 2;
	 
	int r =  widht * height;
	int p = 2 * (w + h);
	
	System.out.println(r);  
	System.out.println(p); 	 
		 
	    }
	}
