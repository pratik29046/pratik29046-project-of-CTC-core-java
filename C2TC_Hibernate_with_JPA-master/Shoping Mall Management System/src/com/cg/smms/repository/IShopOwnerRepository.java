package com.cg.smms.repository;

import com.cg.smms.entities.ShopOwner;

public interface IShopOwnerRepository {

	public ShopOwner addShopOwner(ShopOwner shopOwner);
	public ShopOwner updateShopOwner(ShopOwner shopOwner);
	public ShopOwner searchShopOwnerById(int id);
	public boolean deleteShopOwner(int id);
	
	public abstract void beginTransactio();
	public abstract void commitTransaction();
}
