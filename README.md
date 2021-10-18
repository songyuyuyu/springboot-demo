# master
[![Java CI with Maven](https://github.com/songyuyuyu/springboot-demo/actions/workflows/maven.yml/badge.svg)](https://github.com/songyuyuyu/springboot-demo/actions/workflows/maven.yml)
[![codecov](https://codecov.io/gh/songyuyuyu/springboot-demo/branch/main/graph/badge.svg?token=4CMU8QIT5V)](https://codecov.io/gh/songyuyuyu/springboot-demo)
[![Build Status](https://www.travis-ci.com/songyuyuyu/springboot-demo.svg?branch=main)](https://www.travis-ci.com/songyuyuyu/springboot-demo)

<a name="docker��������"></a>
# docker��������
<a name="����׼��"></a>
### ����׼��
- ��Ҫ��ǰ����docker���̣���֧��docker-compose
- �½�һ��·�����ڸ�·�������������飩

<a name="����"></a>
### ����
xpipe �ṩ����������ʽ

- ��ʽһ������dockerhub�ϵľ����������½ű�����

/bin/bash -c "\$(curl -sSL https://raw.githubusercontent.com/ctripcorp/x-pipe/docker_build/redis/dockerPackage/start-xpipe-container.sh)"

ע��

        ctripcorp/xpipe-mysql:latest ֧��proxyģʽ
        ctripcorp/xpipe-mysql:2.0 ֧�ַ�proxyģʽ

- ��ʽ�����������´�����뱾�ؾ���������

  	1.��github������Դ����
  
  	2.����redis/dockerPackageĿ¼��Ȼ������ start-xpipe-container-local.sh�ű�
  	�磺bash start-xpipe-container-local.sh console-proxy
  	��������������ģʽ��
  
  		1.Ĭ�ϣ� console+metaserver+keepercontainer
  		2.console-checker��console+checker+metaserver+keepercontainer
        3.console-proxy: console+metaserver+keepercontainer+proxy
  
  	ע��:
  
  		����ģʽ1��2��ʱ����Ҫ��mysql�г�ʼ�����ݣ�init_data���е�route_tbl��proxy_tbl��Ϣɾ��

<a name="��֤"></a>
### ��֤
��½ localhost:8079 �鿴redis��Ⱥ�������Ϣ��ʹ��xpipe����ع���

<a name="ֹͣ"></a>
### ֹͣ
docker-compose down