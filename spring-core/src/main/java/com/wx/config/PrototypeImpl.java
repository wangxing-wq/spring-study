package com.wx.config;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @author 22343
 * @version 1.0
 */
@Scope(proxyMode =ScopedProxyMode.TARGET_CLASS)
@Component
public class PrototypeImpl {
}
