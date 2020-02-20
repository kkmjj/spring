package com.springbook.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

@Controller
public class GetBoardListController  {//implements Controller

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

}
