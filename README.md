# 项目简介

[nlp-hanzi-similar](https://github.com/houbb/nlp-hanzi-similar) 为汉字提供相似性的计算。

[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.houbb/nlp-hanzi-similar/badge.svg)](http://mvnrepository.com/artifact/com.github.houbb/nlp-hanzi-similar)
[![Build Status](https://www.travis-ci.org/houbb/nlp-hanzi-similar.svg?branch=master)](https://www.travis-ci.org/houbb/nlp-hanzi-similar?branch=master)
[![Coverage Status](https://coveralls.io/repos/github/houbb/nlp-hanzi-similar/badge.svg?branch=master)](https://coveralls.io/github/houbb/nlp-hanzi-similar?branch=master)

## 创作目的

国内对于文本的相似度计算，开源的工具是比较丰富的。

但是对于两个汉字之间的相似度计算，国内基本一片空白。

国内的参考的资料少的可怜，国外相关文档也是如此。

本项目旨在抛砖引玉，实现一个基本的相似度计算工具，为汉字 NLP 贡献一点绵薄之力。

## 特性

- fluent 方法，一行代码搞定一切

- 高度自定义，允许用户定义自己的实现

- 词库自定义，适应各种应用场景

- 丰富的实现策略

默认实现了基于 四角编码+拼音+汉字结构+汉字偏旁+笔画数 的相似度比较。

# 变更日志

> [变更日志](CHANGELOG.md)

# 快速开始 

## 需要 

jdk1.7+

maven 3.x+

## maven 引入 

```xml
<dependency>
    <groupId>com.github.houbb</groupId>
    <artifactId>nlp-hanzi-similar</artifactId>
    <version>1.0.0</version>
</dependency>
```

## 快速开始

### 基本用法

`HanziSimilarHelper.similar` 获取两个汉字的相似度。

```java
double rate1 = HanziSimilarHelper.similar('末', '未');
```

结果为：

```
0.9629629629629629
```

### 自定义权重

默认是根据 四角编码+拼音+汉字结构+汉字偏旁+笔画数 进行相似度比较。

如果默认的系统权重无法满足你的需求，你可以通过自定义权重调整：

```java
double rate = HanziSimilarBs.newInstance()
                .jiegouRate(10)
                .sijiaoRate(8)
                .bushouRate(6)
                .bihuashuRate(2)
                .pinyinRate(1)
                .similar('末', '未');
```

### 自定义相似度

有些情况下，系统的计算是无法满足的。

用户可以在根目录下 `hanzi_similar_define.txt` 进行自定义。

```
入人 0.9
人入 0.9
```

这样在计算 `人` 和 `入` 的相似度时，会优先以用户自定义的为准。

```java
double rate = HanziSimilarHelper.similar('人', '入');
```

此时的结果为用户自定义的值。

# 引导类

## 说明 

为了便于用户自定义，`HanziSimilarBs` 支持用户进行自定义配。

HanziSimilarBs 中允许自定义的配置列表如下：

| 序号 | 属性 | 说明 |
|:---|:---|:---|
| 1 | bihuashuRate | 笔画数权重 |
| 2 | bihuashuData | 笔画数数据 |
| 3 | bihuashuSimilar | 笔画数相似度策略 |
| 4 | jiegouRate | 结构权重 |
| 5 | jiegouData | 结构数据 |
| 6 | jiegouSimilar | 结构相似度策略 |
| 7 | bushouRate | 部首权重 |
| 8 | bushouData | 部首数据 |
| 9 | bushouSimilar | 部首相似度策略 |
| 10 | sijiaoRate | 四角编码权重 |
| 12 | sijiaoData | 四角编码数据 |
| 13 | sijiaoSimilar | 四角编码相似度策略 |
| 14 | pinyinRate | 拼音权重 |
| 15 | pinyinData | 拼音数据 |
| 16 | pinyinSimilar | 拼音相似度策略 |
| 17 | hanziSimilar | 汉字相似度核心策略 |
| 18 | userDefineData | 用户自定义数据 |

所有的配置都可以基于接口，用户进行自定义。

# 后期 Road-MAP

- [ ] 丰富相似度策略

- [ ] 优化默认权重 
