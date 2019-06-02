# 第二章 装配 Bean

* spring负责装配bean，并且用DI来调配，但开发需要告诉spring怎么来装配
    * spring 自动化配置
    * JavaConfig 配置
    * XML 配置

* 自动装配
    * 组件扫描（在配置类上面@ComponentScan，会自动扫描同包下所有@Component、@Repository等Bean标示注解
    * 自动装配（Junit4需要用RunWithSpring的Runner来启动上下文，并且将Context的Config加载进去）
    * 命名：Spring会将类的第一个字母小写来作为bean的名称，改名的话可以在@Component里面改
    * 扫包：
        * @ComponentScan 默认会扫描同路径下的包，但他Values里面可以设置要扫描的包
        * @ComponentScan 里的basePackage是为了表达扫描的包是基础包
        * @ComponentScan 有个basePackageClass来提供包中的一个类，代替直接扫包
    * 注入：
        * @Autowired可以放在任何地方，如果没有匹配的Bean会异常，可以将Required设置为false，这样就会空，多个同样的id会抛异常，找到多个impl的bean缺无法区分使用哪个会异常

* 通过javaConfig来装配bean
    * 因为第三方组件上无 @Component这种注解
    * @Configuration 是为了表明 这个类是装配类
    * @Bean标注在要返回的Bean对象上
    * 加入存在Bean的依赖，如果在同方法内，可以直接调用该方法，如果在不同方法哪，则可以将Bean用参数的形式传递（如果在扫描不到的包下，则需要手动@Import）
    * 如何让两个分开的Config互相通呢？ 可以一个Config去@Import另一个，也可以在一个大的Config中去@Import两个，这样就成了通路
    * 一般情况下的做法，抽出一个@Configuration 并在这个Config中引入其他Config，并且启动@ComponentScan
    * 自动扫描是为了让自己的组件生效， javaConfig是为了让第三方的组件生效   