![](screenshot.jpg)

## 工程结构
工程名| 描述|
-|-
animation2 | 动图示例
comparison | 结合其它http和图片加载框架的示例
kotlin | Kotlin版的示例
scrollperf | 列表的示例
zoomableapp | 图片缩放的示例
showcase | 所有功能的示例 

## 编译
如果编译出现`ndk-build`的异常，升级NDK即可

## 下载APK
[Releases](https://github.com/dengyuhan/FrescoSample/releases)

# How to run the sample apps

In Android Studio, choose `File > Open..`. and select the `fresco` folder.

## Specify a path to the NDK

Fresco uses native code for a few features. To build Fresco you'll need to specify the path to the NDK.

In Android Studio, go to `File > Project Structure` and in the dialog set the `Android NDK location`. Android Studio stores the NDK location in to your `local.properties` file.

## Run a sample app

The Showcase app is probably the best one to get started with. Select the Showcase app and click run:

![Running a sample Fresco app](https://cloud.githubusercontent.com/assets/346214/24415877/d48d894c-13da-11e7-8601-09627661de67.png)

You can use the drawer to select one of the demos:

<img width="364" alt="Fresco showcase app" src="https://cloud.githubusercontent.com/assets/346214/24416135/a9a4a07a-13db-11e7-9d19-25ae9cbc83d3.png">
