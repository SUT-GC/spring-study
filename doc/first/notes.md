# 第一章 Spring 之旅

* Spring 是为了简化JavaEE(java 企业级应用)开发而存在的
* Spring 的核心特性: 依赖注入DI，面向切面AOP，消除模版样式代码
* Spring 为了全方位的简化java开发
    * 给予Pojo的最小侵入性编程
    * 使用DI+AOP进行松耦合
    * 基于AOP与惯例进行声明式编程
    * 基于AOP和模版减少代码开发量

> 侵入式框架特点： 继承框架的某个类或实现框架的某个接口
> DI为什么能解耦？ 比会直接new一个impl类， 而是依赖一个类的interface，外部将这个interface的实现注入进来

* Spring Bean 容器有多个实现，大体分类两类
    * BeanFactory 功能简单
    * ApplicationContext 功能丰富，提供框架级别的服务
        * AnnotationConfigApplicationContext
        * ClassPathXmlApplicationContext
        * FileSystemXmlApplicationContext
        * XmlWebApplicationContext
        * AnnotationConfigWebApplicationContext

* Spring 提供20个模块左右，大致分类6类
    * 核心 Beans, Context
    * 切面 Aop Aspect
    * 织入 Instrumentation
    * 数据访问 JDBC, ORM, Transition
    * Web Service
    * 测试     
   
* Sprint 生态
    * Spring Web Flow
    * Spring Batch
    * Spring Web Service
    * Spring Security
    * Spring Integration
    * Spring Data
    * Spring Social
    * Spring Mobile
    * Spring For Android
    * Spring Boot
    
* Bean 声明周期
    * Bean init
    * Bean set
    * BeanNameAware.setBeanName
    * BeanFactoryAware.setBeanFactory
    * ApplicationContextAware.setApplicationContext
    * BeanPostProcessor.postProcessBeforeInitialization
    * InitializationBean.afterPropertiesBean
    * BeanPostProcessor.postProcessAfterInitialization
    * Context destory
    * DisposableBean.destory
    