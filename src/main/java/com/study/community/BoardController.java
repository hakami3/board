package com.study.community;

import java.util.HashMap;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.study.community.model.BoardModel;

@Controller
@RequestMapping(value="/board")
public class BoardController {
	
	@Inject
	private BoardService bs;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String getBoardList(Model model) throws Exception {		
		model.addAttribute("boardList", bs.getBoardList());
		return "board/list";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.GET)
	public String createBoard() throws Exception {
		return "board/create";
	}	
	
	@RequestMapping(value="/create/dtl", method=RequestMethod.POST)
	public String createBoard(
			@RequestParam("title") String title,
			@RequestParam("content") String content, Model model) throws Exception {
		BoardModel bm = new BoardModel();
		bm.setTitle(title);
		bm.setContent(content);
		bs.createBoard(bm);
		model.addAttribute("result", "글쓰기 성공");
		return "board/list";
	}	
	
	@RequestMapping(value="/list/dtl", method=RequestMethod.GET)
	public String getBoardDetail
			(@RequestParam("board_id") String board_id, Model model) throws Exception {
		model.addAttribute("boardDetail", bs.getBoardDetail(board_id));	
		return "board/list/dtl";
	}
}
