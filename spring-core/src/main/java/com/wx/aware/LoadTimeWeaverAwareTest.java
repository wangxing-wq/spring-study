package com.wx.aware;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.weaving.LoadTimeWeaverAware;
import org.springframework.instrument.classloading.LoadTimeWeaver;

/**
 * @author 22343
 * @version 1.0
 */
public class LoadTimeWeaverAwareTest implements MessageSourceAware {
	
	private MessageSource messageSource;
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
}
