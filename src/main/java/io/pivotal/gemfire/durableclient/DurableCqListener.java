package io.pivotal.gemfire.durableclient;

import com.gemstone.gemfire.cache.query.CqEvent;

public class DurableCqListener  {


	public void handleEvent(CqEvent event) {

		System.out.println("Key: " +event.getKey() +"\t" + event.getNewValue());
	}

}
