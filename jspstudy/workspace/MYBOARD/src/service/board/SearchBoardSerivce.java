package service.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.BoardService;
import common.ModelAndView;
import common.Page;
import dao.BoardDao;
import dto.Board;

public class SearchBoardSerivce implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String column = request.getParameter("column");
		String query = request.getParameter("query");
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("column", column);
		map.put("query", "%"+query+"%");    // 어떤 검색어든 검색될수 있게 앞 뒤로 만능문자 주어 가능하게 한다.
		
		
		int cnt = BoardDao.getInstance().getSearchCount(map);
		
		Optional<String> opt = Optional.ofNullable(request.getParameter("page"));
		int page = Integer.parseInt(opt.orElse("1"));
		
		Page p = new Page();
		p.setPageEntity(cnt, page);
		
		String pageEntity =  p.getPageEntity("search.do?column="+column+"&query="+query);        // 찾기를 하기위해 column과 query를 추가해서 보낸다.
		
		// 페이징5. DB로 보낼 beginRecord, endRecord 작업 
		map.put("beginRecord", p.getBeginRecord()+"");
		map.put("endRecord", p.getEndRecord()+"");
		
		
		
		
		List<Board> list = BoardDao.getInstance().searchBoard(map);
		
		Logger logger =  Logger.getLogger(SearchBoardSerivce.class.getName());
	    logger.info("검색 : "+list.toString());
		
		request.setAttribute("list", list);
		request.setAttribute("cnt", cnt);
		request.setAttribute("pageEntity", pageEntity);
		request.setAttribute("startNum", cnt - (page - 1) * p.getRecordPerPage());
	
		return new ModelAndView("views/selectList.jsp", false);
	}

}
