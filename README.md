# urlcheckjar
封装url权限匹配解决方案为通用的框架

###0.说明
该jar包可以完成url权限匹配，demo的urlcheck在http://mg0324.github.io/urlcheck/。

###1.传入url格式定义
资源.后缀?参数1&参数2&参数3......&参数n
eg:mg.do?aa&bb&cc&dd

###2.关于实体vo中的5个对象User,Role,Function,UserRole,RoleFunction的说明
2.1User对象中要有getRoleList函数，返回List<Role>集合。<br/>
2.2Role对象中要有getFunList函数，返回List<Function>集合。<br/>
2.3Function对象中要有getResource函数，返回值String。<br/>
2.4Function对象中要有getStffix函数，返回值String。<br/>
2.5Funciton对象中要有getParams函数，返回值String。<br/>

###3.需要修改配置文件urlcheckjar.properties文件中信息
#设置自己系统中用到的User,Role,Function<br/>
user_class = org.mgang.urlcheck.vo.User<br/>
role_class = org.mgang.urlcheck.vo.Role<br/>
function_class = org.mgang.urlcheck.vo.Function<br/>
function_method_getResource = getResource<br/>
function_method_getStuffix = getStuffix<br/>
function_method_getParams = getParams<br/>


###4.test中的单元测试，已经通过

###5.将CheckFunctionTag升级为jsp自定义函数，方便在web的jsp中使用。
一般是结合EL表达式使用，还有jstl的c:if标签。例子如下：<br/>
5.0需要修改tld文件中的部分配置，结合自己的项目的目录结构做调整<br/>
---------------------------------------------------------------------------------------
<pre>
	&lt;short-name&gt;mg&lt;/short-name&gt;
	&lt;uri&gt;http://room.mgang.com/checkFunction&lt;/uri&gt;
	&lt;function&gt;
		&lt;!--EL页面调用名字--&gt;
		&lt;name&gt;check&lt;/name&gt;
		&lt;!--指定标签的处理类，指定了标签由哪个Java类来处理。--&gt;
		&lt;function-class&gt;org.mgang.urlcheck.core.CheckFunctionTag&lt;/function-class&gt;
		&lt;!--指定EL页面调用名字中实际调用的方法.指定处理类的实际方法.参数和回调函数要写完整路径--&gt;
		&lt;function-signature&gt;java.lang.Boolean checkFunctionByUser(org.mgang.urlcheck.vo.User,java.lang.String)&lt;/function-signature&gt;
	&lt;/function&gt;
</pre>
---------------------------------------------------------------------------------------
<br/>
5.1首先将CheckFunctionTag.tld描述文件放到WEB-INF/下，然后在jsp中加入声明。<br/>
<%@ taglib prefix="mg" uri="http://room.mgang.com/checkFunction" %><br/>

5.2配合EL使用：
<br/>
&lt;c:if test="${mg:check(loginUser,'function.do?toUpdateFunctionUI&funId') }"&gt;<br/>
	&lt;a title="修改权限" href="${pageContext.request.contextPath}/function.do?action=toUpdateFunctionUI&funId=${fun.funId}"<br/>
		onclick="return confirm('您真的要修改该权限吗？')"&gt;&lt;i class="cus-lock_edit"&gt;&lt;/i&gt;&lt;/a&gt;<br/>
&lt;/c:if&gt;
