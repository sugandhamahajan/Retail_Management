/**
 * 
 */
package com.retail.manager.builder;

/**
 * @author sugandha
 *
 */
import com.retail.manager.domain.ShopAddress;
import com.retail.manager.domain.ShopDetails;

public class ShopDetailsBuilder implements Builder<ShopDetails> {
	
	private String shopName;	
	private ShopAddress shopAddress;	
	private String shopLongitude;	
	private String shopLatitude;
	
	public ShopDetails build() {
		ShopDetails shopDetails = new ShopDetails();
		shopDetails.setShopName(shopName);
		shopDetails.setShopLongitude(shopLongitude);
		shopDetails.setShopLatitude(shopLatitude);
		shopDetails.setShopAddress(shopAddress);
		return shopDetails;
	}
	
	public ShopDetailsBuilder withShopName(String shopName) {
		this.shopName = shopName;
		return this;
	}

	public ShopDetailsBuilder withShopLongitude(String shopLongitude) {
		this.shopLongitude = shopLongitude;
		return this;
	}

	public ShopDetailsBuilder withShopLatitude(String shopLatitude) {
		this.shopLatitude = shopLatitude;
		return this;
	}

	public ShopDetailsBuilder withShopAddress(ShopAddress shopAddress) {
		this.shopAddress = shopAddress;
		return this;
	}
	
	

}
