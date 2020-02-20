package com.springbook.view.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.springbook.biz.board.BoardService;
import com.springbook.biz.board.BoardVO;
import com.springbook.biz.user.UserVO;
import com.springbook.biz.user.impl.UserDAO;



@SessionAttributes("board")
@Controller
public class BoardController {
									// Component�� Controller�� �������� Controller ��ü�� �����ʰ� ���ÿ� Autowired �� ���� ���Խ�Ų��.
	@Autowired						// BoardService�� ���Խ�Ű�� boardDAO�� ���� ������� �ʴ´�.
	private BoardService boardService;
	

	
	@RequestMapping("/deleteBoard.do")
	public String deleteBoard(@ModelAttribute("board") BoardVO vo){// handleRequest(HttpServletRequest request, HttpServletResponse response) 
		
		boardService.deleteBoard(vo);

		return "getBoardList.do";

	
	}
	
	@RequestMapping("/getBoard.do")
	public String getBoard(BoardVO vo , Model model) {//handleRequest(HttpServletRequest request, HttpServletResponse response)
		
		model.addAttribute("board",boardService.getBoard(vo));
		return "getBoard.jsp";
		
	}
	
	@RequestMapping("/getBoardList.do")
	public String getBoardList(@RequestParam(value = "searchCondition", defaultValue = "TITLE", required = false) String contition
			,@RequestParam(value = "searchKeyword", defaultValue = "", required = false) String keyword, BoardVO vo
			, Model model){ // handleRequest(HttpServletRequest request, HttpServletResponse response) 
		
		
		if(vo.getSearchCondition() ==null) vo.setSearchCondition("TITLE");
		if(vo.getSearchKeyword()==null) vo.setSearchKeyword("");
		// Ű���� ���� ���� ������ �⺻������ ���� �ش�Ǵ� ��� ���� ��� 
		
		
		System.out.println(keyword);
		System.out.println(contition);
		model.addAttribute("boardList", boardService.getBoardList(vo));
		
		return "getBoardList.jsp";
	}
	
	
	@RequestMapping(value = "/insertBoard.do")	// xml���� HandlerMapping �ȿ� property�� �ִ� ���� ������̼� 
	public String insertBoard(BoardVO vo)//insertBoard(HttpServletRequest request)
	
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
		boardService.insertBoard(vo);

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
	public String UpdateBoard( BoardVO vo) {//handleRequest(HttpServletRequest request, HttpServletResponse response)
	
	
		boardService.updateBoard(vo);
		
		return "getBoardList.do";


	}
	
	
}
