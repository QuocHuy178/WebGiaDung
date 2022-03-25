package giadung.Entity;

import java.util.Date;

public class Products {
	private int id;
	private int id_Category;
	private String name;
	private Double price;
	private String image;
	private String description;
	private boolean hot_product;
	private boolean new_product;
	private Date create_date;
	private Date update_date;

	public Products() {
		super();
	}

	public Products(int id, int id_Category, String name, Double price, String image, String description,
			boolean hot_product, boolean new_product, Date create_date, Date update_date) {
		super();
		this.id = id;
		this.id_Category = id_Category;
		this.name = name;
		this.price = price;
		this.image = image;
		this.description = description;
		this.hot_product = hot_product;
		this.new_product = new_product;
		this.create_date = create_date;
		this.update_date = update_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_Category() {
		return id_Category;
	}

	public void setId_Category(int id_Category) {
		this.id_Category = id_Category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isHot_product() {
		return hot_product;
	}

	public void setHot_product(boolean hot_product) {
		this.hot_product = hot_product;
	}

	public boolean isNew_product() {
		return new_product;
	}

	public void setNew_product(boolean new_product) {
		this.new_product = new_product;
	}

	public Date getCreate_date() {
		return create_date;
	}

	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

}
