# Spring Data JPA

## 练习描述
- 学习如何在已有的 `Spring Boot` 项目基础上，添加 `Spring Data JPA` 完成对数据库的各种操作
- 学习使用 `Spring Data JPA` 来操作实体对象，执行对MySQL的 `CRUD (增删改查)` 操作
- 学习使用 `Flyway` 对数据库做版本控制

## 环境要求
- java8
- spring-boot
- Intellij-IDEA
- MySQL

## 如何开始
- 本地安装MySQL数据库，并启动 `MySQL Service` 
- 搭建数据库`employee_db`
- 使用已有的 `Spring Boot` 项目作为 `code base`
- 在项目中添加 `Spring Data JPA` 以及 `Flyway Core` 等依赖
- 并将数据库 `url name password` 配置到项目中
- 执行 `./gradlew test` ，测试都失败

## 输出规范
- 仔细阅读 `src/test/java/EmployeeJPATest` 中的需求描述，并在 `src/main/java/repository` 中将实现补全 
- 执行 `./gradlew test`，出现`BUILD SUCCESS`，即完成题目
