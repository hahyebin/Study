package dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import dto.Member;
import mybatis.config.DBService;
import oracle.net.aso.f;

public class MemberDao {
private SqlSessionFactory factory;
	
	private static MemberDao instance;
	private MemberDao(){
		factory = DBService.getInstance().getFactory();
	}
	public static MemberDao getInstance() {
		if( instance == null ) {
			instance = new MemberDao();
		}return instance;
	}
	
	
	
	// 로그인 가능 회원 있는지 확인하기 
	public Member selectMember(Member member) {
		SqlSession ss = factory.openSession();
		Member user = ss.selectOne("dao.Member.selectMember", member);
		ss.close();
		return user;
	}
	
	// 로그인 기록 남기기 
	public int loginLog(String id) {
		SqlSession ss = factory.openSession(false);
		int result = ss.insert("dao.Member.loginLog", id);
		if(result>0) ss.commit();
		ss.close();
		return result;
	}
	
	// 회원가입하기 
	public int join(Member member) {
		SqlSession ss= factory.openSession(false);
		int result = ss.insert("dao.Member.join", member);
		if(result>0) ss.commit();
		ss.close();
		return result;
	}
	
	// 로그인 가능 회원 있는지 확인하기 
		public Member selectAdmin(Member admin) {
			SqlSession ss = factory.openSession();
			Member user = ss.selectOne("dao.Member.selectAdmin", admin);
			ss.close();
			return user;
		}
	
	// 회원검색 
		public Member searchId(String id) {
			SqlSession ss = factory.openSession();
			Member user = ss.selectOne("dao.Member.searchId", id);
			ss.close();
			return user;
		}
	
	
	
	
	
	
	
	
	
} // end of class
