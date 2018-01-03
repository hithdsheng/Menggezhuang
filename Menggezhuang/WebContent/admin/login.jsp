<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>登录</title>
		<link type="text/css" rel="stylesheet" href="css/login.css?version=1" />
	</head>
	<body>
		<div id="wrap">
			<div id="one">欢迎使用本系统</div>
			<div id="two">
				<!-- 如果div设置了行高，该div中的表格每一行都会是行高值 -->
				<table>
					<tr><td></td><td></td></tr>
					<tr><td class="td1">用户名：</td>
						<td class="td2">
							<input class="td2_input" type="text" name=""/>
						</td>
					</tr>
					<tr><td class="td1">密码：</td>
						<td class="td2">
							<input class="td2_input" type="password" name=""/>
						</td>
					</tr>
					<tr><td></td><td></td></tr>
				</table>
			</div>
			<div id="three">
				<table>
					<tr>
						<td><input class="btn" name="" type="button" value="确定"/></td>
						<td><input class="btn" name="" type="button" value="重置"/></td>
					</tr>
				</table>
			</div>
		</div>
	</body>
</html>