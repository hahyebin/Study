package common;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BoardService {
	public  ModelAndView execute(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
