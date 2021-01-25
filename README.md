# ContextProvider
通过 ContentProvider 提供全局 Context 访问。

1.在项目根 build.gradle 文件中添加 Maven 仓库：
```
allprojects {
    repositories {
        maven {
            url "http://maven.ituns.org/repository/maven-public/"
        }
    }
}
```

2.在模块 build.gradle 中添加引用：
```
dependencies {
    implementation "org.ituns.android:provider:1.0.0"
}
```
