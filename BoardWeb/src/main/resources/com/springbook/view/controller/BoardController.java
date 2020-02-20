package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;



@SessionAttributes("board")
@Controller
public class BoardController {

	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(@ModelAttribute("board") BoardVO vo,BoardDAO boardDAO){// handleRequest(HttpServletRequest request, HttpServletResponse response) 
		
		boardDAO.deleteBoard(vo);

		return "getBoardList.do";

	
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo , BoardDAO boardDAO, Model model) {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		
		model.addAttribute("board",boardDAO.getBoard(vo));
		return "getBoard.jsp";
		
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String contition
			,@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword, BoardVO vo,
			BoardDAO boardDAO, Model model){ // handleRequest(HttpServletRequest request, HttpServletResponse response) 
		//BoardVO vo = new 	BoardVO();
	//	BoardDAO boardDAO = new BoardDAO();

	//	List<BoardVO> boardList = boardDAO.getBoardList(vo);
		
	//	HttpSession session = request.getSession();
	//	session.setAttribute("boardList", boardList);
	//	return "getBoardList";
		
		
	//	ModelAndView mav = new ModelAndView();
		System.out.println(keyword);
		System.out.println(contition);
		model.addAttribute("boardList", boardDAO.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	
	
	@RequestMapping(value = "/insertBoard.do")	// xml���� HandlerMapping �ȿ� property�� �ִ� ���� ������̼� 
	public String insertBoard(BoardVO vo,BoardDAO boardDAO)//insertBoard(HttpServletRequest request)
	
	{
//		String title = request.getParameter("title");
//		String writer = request.getParameter("writer");
//		String content = request.getParameter("content");
//
//
//		BoardVO vo = new BoardVO(); // USERDTO�� ����
//		vo.setTitle(title);
//		vo.setWriter(writer);
//		vo.setContent(content);


		//BoardDAO boardDAO = new BoardDAO();	// �̷��� ó���ϸ� �ٷ� ����� �Է� ���� vo ��ü �׸� �� ������ ��� �ڵ����� ó�� 
		boardDAO.insertBoard(vo);

			//ModelAndView mav = new ModelAndView();
			//	mav.setViewName("getBoardList.do");
			//return mav;
	return "getBoardList.do";
	}
	
	@RequestMapping("/login.do")
	public String login(UserVO vo, UserDAO userDAO, HttpSession session)  {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		UserVO user = userDAO.getUser(vo);
		
		if(user!=null)
		{
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
			
		}else
		{
			return "login.jsp";
		}
		
	
	}

	
	@RequestMapping("/logout.do")
	public String logout(HttpSession session)  {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		
		session.invalidate();
		
		return "login.jsp";

	}
	
	

	@RequestMapping("/updateBoard.do")
	public String UpdateBoard( BoardVO vo,BoardDAO boardDAO) {//handleRequest(HttpServletRequest request, HttpServletResponse response)
	
	
		boardDAO.updateBoard(vo);
		
		return "getBoardList.do";


	}
	
	
}
