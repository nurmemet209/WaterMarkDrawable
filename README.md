# WaterMarkDrawable
仿钉钉聊天背景添加水印效果防止被截屏

下面是效果图  
![](secreenshot/water_mark.png)  
使用方法项目根build.gradle中  
```groovy
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
        jcenter()

    }
}
```
model的build.gradle中
```groovy
compile 'com.github.nurmemet209:WaterMarkDrawable:0.1'

```
