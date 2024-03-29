package service.member;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import common.ModelAndView;
import dao.MemberDao;
import dto.Member;

public class MemberIdDoubleCheck implements MemberService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
	    
		String id = request.getParameter("id");
		
		Member member = new Member();
		member.setId(id);
		
		// 가입하려는 아이디를 가진 회원 확인
		Member user = MemberDao.getInstance().searchId(id);
		
		// 반환할 JSON 데이터
		// 가입하려는 아이디를 가진 회원이 없으면(가입해도되는 아이디== 중복없음)
		// {"result": true} 데이터를 ajax로 반환함
		JSONObject obj = new JSONObject();
		obj.put("result", user==null);
		
		response.setContentType("application/json; charset=UTF-8");
		// JSON 데이터 반환 
		PrintWriter out = response.getWriter();
		out.println(obj);
		out.close();
		
		return null;
		
	
	}

}
