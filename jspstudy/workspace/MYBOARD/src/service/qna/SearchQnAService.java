package service.qna;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.ModelAndView;
import common.Page;
import dao.QnADao;
import dto.QnA;

public class SearchQnAService implements QnAService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String column = request.getParameter("column");
		String query = request.getParameter("query");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("column", column);
		map.put("query", "%"+ query + "%");
		
		
		
		
		// 검색된 수 
		int cnt = QnADao.getInstance().searchQnACount(map);
		
		
		// 페이징2. 현재 페이지 번호 확인하기
		// page가 안 넘어오면 page = 1로 처리함.
		Optional<String> opt = Optional.ofNullable(request.getParameter("page"));
		int page = Integer.parseInt(opt.orElse("1"));
			
		// 페이징3. 페이징에 필요한 모든 계산 처리하기
		Page p = new Page();
		p.setPageEntity(cnt, page);
		
		// 페이징4. String으로 < 1 2 3 4 5 > 만들기
		String pageEntity = p.getPageEntity("search.qna?column="+column+"&query="+query);        // 찾기를 하기위해 column과 query를 추가해서 보낸다.
		
		
		// 페이징5. DB로 보낼 beginRecord, endRecord 작업 
		map.put("beginRecord", p.getBeginRecord()+"");
		map.put("endRecord", p.getEndRecord()+"");
		
		List<QnA> list = QnADao.getInstance().searchQnA(map);
		
		request.setAttribute("cnt", cnt);
		request.setAttribute("list", list);
		request.setAttribute("pageEntity", pageEntity);
		request.setAttribute("startNum", cnt - (page - 1) * p.getRecordPerPage());
		
		return new ModelAndView("qna/selectList.jsp", false);
	}

}
