# Restful API 接口规范模板

##「接口请求方式」

**GET（SELECT）：从服务器取出资源（一项或多项）**

**POST（CREATE）：在服务器新建一个资源**

**PUT（UPDATE）：在服务器更新资源（客户端提供改变后的完整资源）**

**DELETE（DELETE）：从服务器删除资源**


##「接口请求格式」

**Content-Type: application/json**

##「签名规则」(待讨论，个人想法)


签名生成的步骤如下：

第一步，设所有发送或者接收到的数据为集合M，将集合M内非空参数值的参数按照参数名ASCII码从小到大排序（字典序），使用URL键值对的格式（即key1=value1&key2=value2…）拼接成字符串stringA。

加密和验证规则：

◆ 参数名ASCII码从小到大排序（字典序）；
◆ 如果参数的值为空不参与签名；
◆ 参数名区分大小写；
◆ 传送的sign参数不参与签名，将生成的签名与该sign值作校验。

第二步，在对stringA进行MD5运算，再将得到的字符串所有字符转换为大写，得到sign值。

举例：

假设传送的参数如下：
```json
{
  "timestamp":"时间戳yyyyMMddHHmmss",
  "userName":"用户名（string,50，必填）",
  "password": "密码(MD5加密，必填)",
  "age":"18",
  "sex":"M"
}
```

第一步：对参数按照key=value的格式，并按照参数名ASCII字典序排序如下：

stringA="age=18&password=123456&sex=M&timestamp=20180821145500&userName=xxx";

第二步，在对stringA进行MD5运算

sign=MD5(stringA).toUpperCase()="9A0A8659F005D6984697E2CA0A9CF3B7" //注：MD5签名方式

最终发送请求参数：
```json
{
  "timestamp":"时间戳yyyyMMddHHmmss",
  "userName":"用户名（string,50，必填）",
  "password": "密码(MD5加密，必填)",
  "age":"18",
  "sex":"M",
  "sign":"9A0A8659F005D6984697E2CA0A9CF3B7"
}
```




## 示例 - 用户User模块

### 1. POST 新增用户

* URL: /v1/user

* request

```json
{
  "timestamp":"时间戳yyyyMMddHHmmss",
  "userName":"用户名（string,50，必填）",
  "password": "密码(MD5加密，必填)",
  "age":"18",
  "sex":"M"
}
```

* response

```json
{
  "status": "SUCCESS",
  "result":{
  	"userId"： "用户ID"
  }
}
```

### 2. GET 用户列表

* URL: /v1/user

* request

```json
{
  "timestamp":"时间戳yyyyMMddHHmmss",
  "userName":"用户名（模糊查询不传查全部）",
  "page": "当前页（不传查全部）",
  "size": "每页条数（不传查全部）"
}
```

* response

```json
{
  "status": "SUCCESS",
  "result": {
  	"total": "总数",
	"userList": [{
	  "userId":1，
      "userName":"用户名",
      "age":"18",
      "sex":"M"
    }]
  }
}
```

### 3. GET 单个用户

* URL: /v1/user/{userId}

* request

```json
{
  "timestamp":"时间戳yyyyMMddHHmmss"
}
```

* response

```json
{
  "status": "SUCCESS",
  "result": {
	"user": {
      "userName":"用户名",
      "age":"18",
      "sex":"M"
    }
  }
}
```

### 4. PUT 修改用户

* URL: /v1/user/{userId}

* request

```json
{
  "timestamp":"时间戳yyyyMMddHHmmss",
  "userName":"用户名（string,50，必填）",
  "password": "密码(MD5加密，必填)",
  "age":"18",
  "sex":"M"
}
```

* response

```json
{
  "status": "SUCCESS",
  "result": null
}
```

### 5. DELETE 删除用户

* URL: /v1/user/{userId}

* request

```json
{
  "timestamp":"时间戳yyyyMMddHHmmss"
}
```

* response

```json
{
  "status": "SUCCESS",
  "result": null
}
```
