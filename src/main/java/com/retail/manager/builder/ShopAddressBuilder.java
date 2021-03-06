/**
 * 
 */
package com.retail.manager.builder;

/**
 * @author sugandha
 *
 */
import com.retail.manager.domain.ShopAddress;

public class ShopAddressBuilder implements Builder<ShopAddress>{
	
	private String number;
	private String postCode;
	
	public ShopAddress build() {
		ShopAddress shopAddress = new ShopAddress();
		shopAddress.setNumber(number);
		shopAddress.setPostCode(postCode);
		return shopAddress;
	}
	
	public ShopAddressBuilder withNumber(String number) {
		this.number = number;
		return this;
	}

	public ShopAddressBuilder withPostCode(String postCode) {
		this.postCode = postCode;
		return this;
	}

}
