#1.安装配置kafka
#下载kafka_2.11-0.9.0.1.tgz

#解压文件
tar zxvf kafka_2.11-0.9.0.1.tgz

#修改配置文件(server.properties)
vim kafka_2.11-0.10.0.1/config/server.properties
broker.id=0 (集群唯一)
listeners=PLAINTEXT://xx.xx.xx.xx:9092
port=9092 
zookeeper服务器地址可指向到多台, 隔开
zookeeper.connect=xx.xx.xx.xx:2181


#kafka启动 (如需启动多个broker 请复制server,properties 修改配置)
bin/kafka-server-start.sh config/server.properties &


#kafka关闭
bin/kafka-server-stop.sh 

#查看topic
bin/kafka-topics.sh --list --zookeeper xx.xx.xx.xx:2181
__consumer_offsets
event

#删除topic
bin/kafka-topics.sh --delete --zookeeper xx.xx.xx.xx:2181 --topic mhb-test
Topic mhb-test is marked for deletion.
Note: This will have no impact if delete.topic.enable is not set to true.

#创建topic
bin/kafka-topics.sh —create --zookeeper xx.xx.xx.xx:2181 --topic test-topic

#启动consumer控制台
bin/kafka-console-consumer.sh --zookeeper xx.xx.xx.xx:2181 --topic event --from-beginning

#启动producer控制台
bin/kafka-console-producer.sh --broker-list xx.xx.xx.xx:9092 --topic event
