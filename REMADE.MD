# 概述
从 Spring Framework 5.0 开始，Spring 需要 JDK 8(Java SE 8+)，并且已经为 JDK 9 提供了现成的支持。
Spring在不同的背景下有这不同的含义。它可以指 Spring Framework项目本身，这也是创建他的初衷。随着时间的推移，其他的"Spring" 项目已经构建在Spring框架之上。大多数时候，当人们说 "Spring"，他们指的是整个项目家族。本参考文档主要侧重于Spring的基本：也就是Spring框架本身。

整个Spring框架被分成多个模块，应用程序可以选择需要的部分。core是核心容器的模块，包括模块配置和依赖注入机制 。Spring框架还为不同的应用程序体系结构提供了基础支持，包括消息传递，事务数据和持久化以及Web，还包括基于Servlet的Spring MVC Web框架 ，以及Spring WebFlux响应式Web框架。

关于模块的说明: Spring Framework 的jar包允许部署到JDK 9的模块路径("Jigsaw")。为了在支持Jigsaw的应用程序中使用， Spring Framework 5的jar带有 "Automatic-Module-Name" 清单条目，它定义了稳定的语言级模块名称(例如"spring.code","spring.context"等)独立于jar部件名称(jar遵循相同的命名模式使用"-"号代替"."， 例如"spring-core" 和 "spring-context")。当然，Spring Framework 的jar包在JDK 8和9的类路径上都能保持正常工作。

# 核心
