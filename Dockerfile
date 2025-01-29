# 使用适配 JDK 1.8 的基础镜像
FROM openjdk:8-jdk-alpine AS build

# 设置工作目录
WORKDIR /app

# 复制项目文件
COPY . .

# 使用 Maven 构建 Spring Boot 项目
RUN ./mvnw clean package -DskipTests

# 创建运行环境
FROM openjdk:8-jre-alpine
WORKDIR /app

# 复制打包后的 jar 文件
COPY --from=build /app/target/*.jar app.jar

# 启动 Spring Boot 应用
ENTRYPOINT ["java", "-jar", "app.jar"]
