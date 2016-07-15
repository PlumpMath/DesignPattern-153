/**
 * 
 */
package Prototype;

/**
 * @author LeNoVo
 *
 */
public class MainClass {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		ShapeMapper.loadShape();
		
		Shape shape = ShapeMapper.getShape(1);
		shape.display();
		System.out.println("Shape Type" + shape.getType());
		
		Shape shape2 = ShapeMapper.getShape(2);
		shape2.display();
		System.out.println("Shape Type" + shape2.getType());

	}

}
