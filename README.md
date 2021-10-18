# master
[![Java CI with Maven](https://github.com/songyuyuyu/springboot-demo/actions/workflows/maven.yml/badge.svg)](https://github.com/songyuyuyu/springboot-demo/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/songyuyuyu/springboot-demo/branch/main/graph/badge.svg?token=4CMU8QIT5V)](https://codecov.io/gh/songyuyuyu/springboot-demo)
[![Build Status](https://www.travis-ci.com/songyuyuyu/springboot-demo.svg?branch=main)](https://www.travis-ci.com/songyuyuyu/springboot-demo)

<a name="docker快速启动"></a>
# docker快速启动
<a name="启动准备"></a>
### 启动准备
- 需要提前启动docker进程，且支持docker-compose
- 新建一个路径，在该路径下启动（建议）

<a name="启动"></a>
### 启动
xpipe 提供两种启动方式

- 方式一：启动dockerhub上的镜像，运行以下脚本即可

/bin/bash -c "\$(curl -sSL https://raw.githubusercontent.com/ctripcorp/x-pipe/docker_build/redis/dockerPackage/start-xpipe-container.sh)"

注意

        ctripcorp/xpipe-mysql:latest 支持proxy模式
        ctripcorp/xpipe-mysql:2.0 支持非proxy模式

- 方式二：根据最新代码编译本地镜像再启动

  	1.从github上下载源代码
  
  	2.进入redis/dockerPackage目录，然后运行 start-xpipe-container-local.sh脚本
  	如：bash start-xpipe-container-local.sh console-proxy
  	参数代表启动的模式：
  
  		1.默认： console+metaserver+keepercontainer
  		2.console-checker：console+checker+metaserver+keepercontainer
        3.console-proxy: console+metaserver+keepercontainer+proxy
  
  	注意:
  
  		运行模式1或2的时候，需要将mysql中初始化数据（init_data）中的route_tbl及proxy_tbl信息删除

<a name="验证"></a>
### 验证
登陆 localhost:8079 查看redis集群的相关信息及使用xpipe的相关功能

<a name="停止"></a>
### 停止
docker-compose down