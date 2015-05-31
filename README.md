# urlcheckjar
封装url权限匹配解决方案为通用的框架

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
<code>
#设置自己系统中用到的User,Role,Function<br/>
user_class = org.mgang.urlcheck.vo.User<br/>
role_class = org.mgang.urlcheck.vo.Role<br/>
function_class = org.mgang.urlcheck.vo.Function<br/>
function_method_getResource = getResource<br/>
function_method_getStuffix = getStuffix<br/>
function_method_getParams = getParams<br/>
</code>

###4.test中的单元测试，已经通过

###5.将CheckFunctionTag升级为jsp自定义函数，方便在web的jsp中使用。
一般是结合EL表达式使用，还有jstl的c:if标签。例子如下：<br/>
5.1首先将CheckFunctionTag.tld描述文件放到WEB-INF/下，然后在jsp中加入声明。<br/>
<%@ taglib prefix="mg" uri="http://room.mgang.com/checkFunction" %><br/>

5.2配合EL使用：
<code><br/>
&lt;c:if test="${mg:check(loginUser,'function.do?toUpdateFunctionUI&funId') }"&gt;<br/>
	&lt;a title="修改权限" href="${pageContext.request.contextPath}/function.do?action=toUpdateFunctionUI&funId=${fun.funId}"<br/>
		onclick="return confirm('您真的要修改该权限吗？')"&gt;&lt;i class="cus-lock_edit"&gt;&lt;/i&gt;&lt;/a&gt;<br/>
&lt;/c:if&gt;
</code>