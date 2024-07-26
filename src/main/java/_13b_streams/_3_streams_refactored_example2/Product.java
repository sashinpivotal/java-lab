package _13b_streams._3_streams_refactored_example2;

public class Product {

	private Integer productId;
	private ProductType productType;
	private Integer price;

	public Product(Integer productId, ProductType productType, Integer price) {
		this.productId = productId;
		this.productType = productType;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product{" +
				"productId=" + productId +
				", productType=" + productType +
				", price=" + price +
				'}';
	}
}
