package ddos.productItem;

public abstract class ProductItem {
	protected String name;
	protected String dateAdded;
	protected Integer id;

	public abstract void setName(String name);

	public abstract void dateAdded(String date);

	public abstract String getName();

	public abstract String getDateAdded();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
