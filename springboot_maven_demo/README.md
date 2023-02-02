#### 简介
♀用于了解SpringBoot的demo，配套博客文章：[Java web 技术与架构演进历史](https://congzhou09.github.io/knowledge/Java-web-%E6%8A%80%E6%9C%AF%E4%B8%8E%E6%9E%B6%E6%9E%84%E6%BC%94%E8%BF%9B%E5%8E%86%E5%8F%B2.html)；

♀将之前的[spring demo](https://github.com/congzhou09/spring_maven_demo)迁移为SpringBoot项目；

♀将所有Spring的xml配置改成注解方式实现；

#### 测试

♂SpringBoot方式启动项目：运行SpringbootMavenDemoApplication中的main函数；

♂访问 http://localhost:8080/user/about 返回Content-Type为 "text/html;charset=utf-8" 类型的字符串内容；

♂访问 http://localhost:8080/user/getList 返回Content-Type为 "application/json;charset=utf-8" 类型的JSON对象；

♂访问 http://localhost:8080/user/say 与 http://localhost:8080/role/say 除了返回字符串内容也会在say()方法调用前后在控制台打印信息；