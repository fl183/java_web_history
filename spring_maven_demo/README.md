#### 简介
用于了解Spring和SpringMVC的demo，配套博客文章：[Java web 技术与架构演进历史](https://congzhou09.github.io/knowledge/Java-web-%E6%8A%80%E6%9C%AF%E4%B8%8E%E6%9E%B6%E6%9E%84%E6%BC%94%E8%BF%9B%E5%8E%86%E5%8F%B2.html)；

#### 项目创建过程tips
◇创建空的maven项目；

◇pom.xml添加Spring相关依赖；

◇bean的xml配置需要存放到"src/main/java/resources"目录下才能被ClassPathXmlApplicationContext找到；


#### IoC机制测试
◆运行Application中的main方法，可以正常获取到IoC实例和调用其方法；

◆UserServiceImpl依赖了UserDao，UserDao实例通过xml配置以及setter方式注入；


#### Spring注解的应用与tips
◇UserServiceImpl依赖了Logger，Logger实例通过Spring注解方式实现注入；

◇使用Spring注解需要为xml配置增加"context"的schema；

◇Logger读取项目配置文件"application.properties"信息并在初始化完毕后打印；

◇Value注解获取项目配置文件需要定义名为"propertyConfigurer"的bean；


#### AOP的应用与tips
●对service包下所有类的say()方法的before和after做了切面处理；

●使用AOP还需引入"aspectjweaver"；

#### 增加SpringMVC支持tips
△web.xml使用servlet-mapping映射所有请求到 DispatcherServlet 类型的servlet；

△maven增加"spring-webmvc"的引入；

△SpringMVC的全局配置可以在"app-contex.xml"中通过mvc schema实现，也可以使用@Configuration注释；

#### SpringMVC测试
■启动项目运行：mvn jetty:run

■访问 http://localhost:8080/user/about 返回Content-Type为 "text/html;charset=utf-8" 类型的字符串内容；

■访问 http://localhost:8080/user/getList 返回Content-Type为 "application/json;charset=utf-8" 类型的JSON对象；