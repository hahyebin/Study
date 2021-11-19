package service.board;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import common.BoardService;
import common.ModelAndView;
import dao.BoardDao;
import dto.Board;

public class SelectBoardService implements BoardService {

	@Override
	public ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
	
		Board board =  (Board)(session.getAttribute("board"));
	
	 	String strIdx = request.getParameter("idx");
		Long idx = Long.parseLong(strIdx);
		  
		  
		// 상세보기 첨  열기 
		if(board == null) {
			// 조회수 증가 db 다녀오기 
			BoardDao.getInstance().hit(idx);
			
			// 증가된 조회수 게시글 가져오기
			 board = BoardDao.getInstance().select(idx);
			 
			// 객체 저장을 세션에 하기
			session.setAttribute("board",board);
			System.out.println("저장");

		    } 
		
		// 세션 저장 있으면 
		if (board != null) {
			// 조회수증가 안한 게시글 가져오기		
		   board = BoardDao.getInstance().select(idx);
		   request.setAttribute("board", board);
		   System.out.println("삭제");
			
		}

		return new ModelAndView("views/selectboard.jsp", false);
	}

}
