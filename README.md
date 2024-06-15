### Counterparty credit risk demo

### Spark
Spring Boot and Apache Spark 3.5.1, you should use Spring Boot 2.7.x or earlier versions.

Multi module maven:

```
my-multi-module-project
│
├── core
│   └── pom.xml
├── processing
│   └── pom.xml
├── domain
│   └── pom.xml
└── pom.xml
```

#### Spark config:

Install Spark
`version 3.5.1`

Setup spark env variables:
``` 
export SPARK_HOME=/Users/yourusername/spark
export PATH=$SPARK_HOME/bin:$PATH
```

Spark shell:

```shell
spark-shell
spark-submit
```


```
spark-submit \
  --class com.cdx.ccr.core.CoreDemoApplication.java \
  --master local \
  ccr-core/target/ccr-core-0.0.1-SNAPSHOT.jar
```