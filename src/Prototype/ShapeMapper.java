/**
 * 
 */
package Prototype;

import java.util.Hashtable;

/**
 * @author LeNoVo
 * 
 */
public class ShapeMapper {

	private static Hashtable<Integer, Shape> shapeMap = new Hashtable<>();

	public static Shape getShape(int id) throws CloneNotSupportedException {
		Shape shape = shapeMap.get(id);
		return (Shape) shape.clone();
	}

	public static void loadShape() {

		Circle circle = new Circle();
		circle.setId(1);
		circle.setType(1);
		shapeMap.put(circle.getId(), circle);

		Rectenagle rectenagle = new Rectenagle();
		rectenagle.setId(2);
		rectenagle.setType(2);
		shapeMap.put(rectenagle.getId(), rectenagle);
	}

}
