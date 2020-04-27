1、echo $java_home 查看java版本命令

2、maven常用命令：
mvn clean：清理项目生产的临时文件,一般是模块下的target目录
mvn package：项目打包工具,会在模块下的target目录生成jar或war等文件
mvn test: 测试命令,或执行src/test/java/下junit的测试用例
mvn install:模块安装命令 将打包的的jar/war文件复制到你的本地仓库中,供其他模块使用 
-Dmaven.test.skip=true 跳过测试(同时会跳过test compile)
mvn deploy:发布命令 将打包的文件发布到远程参考,提供其他人员进行下载依赖 ,一般是发布到公司的私服

3、mkdir -p 生成多级目录
  rmdir 删除文件夹
  del 删除文件

4、