package fpt.lab.model.dto;

public class ItemHomeDto {
	private String itemId;
	private String itemName;
	private String imageUrl;
	private String shortDescription;

	public ItemHomeDto(String itemId, String itemName, String imageUrl, String shortDescription) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.imageUrl = imageUrl;
		this.shortDescription = shortDescription;
	}

	public ItemHomeDto() {
		super();
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

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

}
