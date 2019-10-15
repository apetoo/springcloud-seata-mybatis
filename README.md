# 项目说明
项目采用springboot+springCloud+mybatis-plus,聚合工程管理jar包

## file.conf中添加配置:
- DataSourceProxy加载 只有spring.datasource.autoproxy为true才会使用seata的DataSource
- 具体代码请看io.seata.spring.annotation.GlobalTransactionScanner.postProcessBeforeInitialization
```
support {
  ## spring
  spring {
    # auto proxy the DataSource bean
    datasource.autoproxy = true
  }
}
```
## seata版本
- 2019-10-15 version:0.8.1