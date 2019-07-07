# 第三章 高级装配

* Spring 可以根据环境来决定创建哪些Bean，不需要重新构建
* `@profile`可以指定某个Bean属于哪个Profile
* `@profile`可以放在class上，也可以放在method上
* spring有个默认的`detault`的profile， 如果没有说明激活哪个的话，则默认激活`default`
* 哪里可以设置active的profile?
    * dispatcher servlet
    * 应用上下文
    * 环境变了
    * jvm系统属性
    * 集成测试类 @ActiveProfile
* 条件化Bean的生成
    * 放在@Bean下 `@Conditional`
    * 传入一个实现了 `Condition` 接口的类
* 自动装配的歧义
    * 在Bean上面加入`@Promary` 来指明默认的
    * 用 `@quanlifier`来指定限定一个Bean的使用
    * 可以在Bean上面 `@quanlifier` 来指定重写的bean的id
* Bean的作用域
    * Spring所有上线文中的Bean都是单利的
    * Spring可以将Bean改为几种作用域 {`Singleton`(单利), `Prototype`(原型), `session`(会话), `request`(请求) }
    * 如在Bean的class上 `@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    * 当一个singleton的bean注入一个session的bean时，在程序启动的时候会拿不到改bean，因为还没有session，可以在session的bean @Scope注解上指明`proxyMode=ScopeProxyMode.INTERFACE` or `proxyMode=ScopeProxyMode.TARGET_CLASS`
* Environment可以手动set PropertySource 或者在Configuration上`@PropertySource("classpath:/third.properties")`
* 属性占位符
    * `@Value("${xxxx}")`, 与AutoWired位置一样
* SPEL
    * 放在 `"#{}"`中
    * `T(B).a` == `B.a()`
    * 同样用@Value包装
    * 语法
        * 字面量, 单引号
        * BeanID 访问其他bean
        * ?. 做npe check == if not null then 
        * ?: 做nul check == if null then
        * T(A).B 做静态调用
        * 可以用 `+ - * / ^ < > == <= >= ?: lt gt eq le ge and or not matches(xxx matches xxx)`
        * 操作集合 
       
    
