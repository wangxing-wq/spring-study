package com.wx.config;

import org.springframework.context.annotation.ComponentScan;

/**
 * @author 22343
 * @version 1.0
 * 过滤类型	表达式例子	描述
 * annotation (default)	org.example.SomeAnnotation	要在目标组件中的类级别出现的注解。
 * assignable	org.example.SomeClass	目标组件可分配给（继承或实现）的类（或接口）。
 * aspectj	org.example..*Service+	要由目标组件匹配的AspectJ类型表达式。
 * regex	org\.example\.Default.*	要由目标组件类名匹配的正则表达式。
 * custom	org.example.MyTypeFilter	org.springframework.core.type .TypeFilter接口的自定义实现。
 */
@ComponentScan()
public class ComponentFilter {
}
