package prototype.model;

public abstract class Account implements Cloneable
{
	public abstract void getType();
	
	public Object clone()
	{
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clone;
	}

}
