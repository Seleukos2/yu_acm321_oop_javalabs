
public class Triangle {
	private int width;
	
	public Triangle(int aWidth)
	{
		width = aWidth;
	}
	
	   public int getArea()
	   {
	      if (width <= 0) { return 0; }
	      else if (width == 1) { return 1; }
	      else 
	      {
	         Triangle smallerTriangle = new Triangle(width - 1);
	         int smallerArea = smallerTriangle.getArea();
	         return smallerArea + width;
	      }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Triangle triangle1 = new Triangle(3);
		int triangle1_area = triangle1.getArea();
		System.out.print(triangle1_area);

	}

}
