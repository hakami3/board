package com.study.community;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.community.dao.BoardDao;
import com.study.community.model.BoardModel;

@Service
public class BoardService {

	@Autowired
	private BoardDao bo;
	
	public List<BoardModel> getBoardList() throws Exception{
		return bo.getBoard();
	}
	
	public void createBoard(BoardModel bm) throws Exception{
		bo.insert(bm);
	}
	
	public void updateView(BoardModel bm) throws Exception{
		bo.insert(bm);
	}	
	
	public BoardModel getBoardDetail(String board_id) throws Exception{
		return bo.getBoardDtl(board_id);
	}
}
