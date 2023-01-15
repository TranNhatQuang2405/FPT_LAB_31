package fpt.lab.model.dto;

public class ItemSaleDto {
	private String itemId;
	private String itemName;
	private String imageUrl;
	private String description;

	public ItemSaleDto(String itemId, String itemName, String imageUrl, String description) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.imageUrl = imageUrl;
		this.description = description;
	}

	public ItemSaleDto() {

	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
