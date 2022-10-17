package EX_07;

public class Rectangle{
	public float width;
	public float height;
	
	public float surfaceArea() {
		return width * height;
	}
	
	public float getWidth(){
		return this.width;
	}
	
	public float getHeight() {
		return this.height;
	}
	
	public Rectangle(float w,float h){
		width = w;
		height = h;
	}
}