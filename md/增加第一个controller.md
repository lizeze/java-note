# 添加第一个controller
![](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/fb88d099a39845a987f7acc5dea044db~tplv-k3u1fbpfcp-watermark.image)

内容如下
![](https://p1-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/a768060995cc46e3b2b2f1b09649ec4c~tplv-k3u1fbpfcp-watermark.image)

到这里已经创建了含有一个`get`请求方法的`controller`,方法很简单，只是返回了一个字符串，现在可以看一下效果
![](https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/5a5b1cd3dd6848f887940d57b1b583e0~tplv-k3u1fbpfcp-watermark.image)

服务端口默认是8080，如果要修改端口可以在配置文件中或者在命令行启动的时候修改端口，这个后面会讲。
# controller里面的注解

  ##  @RestController
  修饰`class`，用来创建处理http请求的对象，加上这个注解之后所有的方法都会返回`json`格式的数据
  ## @RequestMapping
  * 在`controller`类定义及方法定义处都可标注@RequestMapping
  * @`RequestMapping`的`value`，`method`表示请求URL、请求方法。
  ![](https://p9-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/88ae4462020a4ff1bacf23e509b30d50~tplv-k3u1fbpfcp-watermark.image)
