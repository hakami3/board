package com.study.community.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Repository;

import com.study.community.model.BoardModel;

@Repository
public class BoardDao {

	@Inject
	private SqlSessionFactory sqlFactory;

	
	public void insert(BoardModel vo) {
		SqlSession session = sqlFactory.openSession();
		session.insert(this.getClass().getName()+".insert", vo); 	
	}
	

	public List<BoardModel> getBoard() {
		SqlSession session = sqlFactory.openSession();
		int count = 0;
		count = session.selectOne(this.getClass().getName()+".countBoardList"); 
		System.out.println("count:"+count);
		List<BoardModel> list = session.selectList(this.getClass().getName() + ".getBoardList");
		for (BoardModel b : list) {
			System.out.println("b:" + b);
		}
		return list;
	}
	
	public BoardModel getBoardDtl(String board_id) {
		SqlSession session = sqlFactory.openSession();
		BoardModel bm = session.selectOne(this.getClass().getName() + ".getBoardDetail", board_id);
		
		return bm;
	}
	
	public void updateView(BoardModel vo) {
		SqlSession session = sqlFactory.openSession();
		session.insert(this.getClass().getName()+".viewcnt", vo); 		
	}
	
	public int countAll() {
		SqlSession session = sqlFactory.openSession();
		int count = 0;
		count = session.insert(this.getClass().getName()+".viewcnt"); 	
		
		return count;
	}
}
