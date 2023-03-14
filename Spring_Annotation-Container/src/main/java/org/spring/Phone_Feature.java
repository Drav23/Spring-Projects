package org.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Phone_Feature 
{
//	@Autowired
//	@Qualifier("samFeatr")  //we can use Qualifier annotation like this also
     Phone phone;
     @Autowired
     public Phone_Feature(@Qualifier(value = "nokia") Phone phone) {
 		
 		this.phone = phone;
 	}	
 	
	public void feature()
	{
		phone.Features();
	}
     
     
	
     
}
