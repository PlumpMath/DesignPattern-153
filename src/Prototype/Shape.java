/**
 * 
 */
package Prototype;

/**
 * @author LeNoVo
 * 
 */
public abstract class Shape implements Cloneable {

	private int id;
	private int type;

	public abstract void display();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
