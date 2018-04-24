#注意:
1:服务器上kafka的版本要跟工程中的kafka-clients-xx.jar版本一致。
2:kafka0.8跟kafka0.9的命令文件以及相关命令有一些区别
3:kafka安装目录下的server.properties文件中需要配置
port=9092
listeners=PLAINTEXT://:9092
advertised.listeners=PLAINTEXT://192.168.0.7:9092
host.name = 192.168.0.7
