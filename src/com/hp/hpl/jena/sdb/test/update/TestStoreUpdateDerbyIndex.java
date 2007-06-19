package com.hp.hpl.jena.sdb.test.update;

import com.hp.hpl.jena.sdb.store.Store;
import com.hp.hpl.jena.sdb.test.StoreCreator;

public class TestStoreUpdateDerbyIndex extends TestStoreUpdateBase {

	@Override
	Store getStore() {
		return StoreCreator.getIndexDerby();
	}

}
