package urlcheckjar;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mgang.urlcheck.core.CheckFunctionTag;
import org.mgang.urlcheck.vo.Function;
import org.mgang.urlcheck.vo.Role;
import org.mgang.urlcheck.vo.User;

public class TestCheck {
	@Test
	public void test(){
		User user = new User();
		Role role = new Role();
		Function fun = new Function();
		fun.setResource("mg");
		fun.setStuffix(".do");
		fun.setParams("todo,aa,bb,cc");
		List<Function> lf = new ArrayList<Function>();
		lf.add(fun);
		role.setFunList(lf);
		role.setRoleName("role1");
		List<Role> lr = new ArrayList<Role>();
		lr.add(role);
		user.setRoleList(lr);
		String url = "mgx";
		boolean res = CheckFunctionTag.checkFunctionByUser(user, url);
		System.out.println(res);
	}
	@Test
	public void test2(){
		String reqUrl = "mg1xxx.do?todo&aa&bb1&cc";
		String rp = reqUrl.substring(0,reqUrl.indexOf("?"));
		System.out.println(rp);
		String resource = rp.substring(0,rp.indexOf("."));
		System.out.println(resource);
	}
}
