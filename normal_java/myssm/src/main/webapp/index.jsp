<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<h2>学习ssm框架</h2>
<body>
<a href="/users/findUsers">用户查询</a>
<hr>
<form method="post" action="/users/login/insert">
    用户:<input type="text" name="username"><br>
    密码：<input type="text" name="PASSWORD"><br>
        <input type="submit" value="注册"><br>
</form>
<hr>
<form method="post" action="/users/login">
    用户:<input type="text" name="username"><br>
    密码：<input type="text" name="PASSWORD"><br>
    <input type="submit" value="登录"><br>
</form>
</body>
</html>
