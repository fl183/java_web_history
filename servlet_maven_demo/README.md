#### 简介
用于了解servlet与JSP的demo，配套博客文章：[Java web 技术与架构演进历史](https://congzhou09.github.io/knowledge/Java-web-%E6%8A%80%E6%9C%AF%E4%B8%8E%E6%9E%B6%E6%9E%84%E6%BC%94%E8%BF%9B%E5%8E%86%E5%8F%B2.html)；

#### 项目组织
◆jar包依赖以及Tomcat配置与IDEA配置混在一起不方便版本管理，改用maven组织项目，servlet容器改用maven+jetty-maven-plugin；

#### 启动
◇控制台项目根目录下运行：mvn jetty:run；

◇访问 http://localhost:8080/servlet_demo/index.jsp 得到jsp运行结果内容；

◇访问 http://localhost:8080/servlet_demo/index 将由servlet“Hello”处理，并最终forward到“info.jsp”页面；

◇通过filter机制实现日志功能，访问任何servlet地址将在服务器控制台打印时间和访问url；

◇通过listener机制实现在Context初始化时获取Context配置值并打印信息；