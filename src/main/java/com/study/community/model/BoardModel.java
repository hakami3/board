package com.study.community.model;

public class BoardModel {
	private String board_id;
	private String title;
	private String view_cnt;
	private String reco_cnt;
	private String opst_cnt;
	private String insert_dtm;
	private String insert_user_id;
	private String content;
	private String update_user_id;
	private String update_dtm;
	private String disp_yn;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getUpdate_user_id() {
		return update_user_id;
	}
	public void setUpdate_user_id(String update_user_id) {
		this.update_user_id = update_user_id;
	}
	public String getUpdate_dtm() {
		return update_dtm;
	}
	public void setUpdate_dtm(String update_dtm) {
		this.update_dtm = update_dtm;
	}
	public String getDisp_yn() {
		return disp_yn;
	}
	public void setDisp_yn(String disp_yn) {
		this.disp_yn = disp_yn;
	}
	
	public String getInsert_user_id() {
		return insert_user_id;
	}
	public void setInsert_user_id(String insert_user_id) {
		this.insert_user_id = insert_user_id;
	}

	public String getBoard_id() {
		return board_id;
	}
	public void setBoard_id(String board_id) {
		this.board_id = board_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getView_cnt() {
		return view_cnt;
	}
	public void setView_cnt(String view_cnt) {
		this.view_cnt = view_cnt;
	}
	public String getReco_cnt() {
		return reco_cnt;
	}
	public void setReco_cnt(String reco_cnt) {
		this.reco_cnt = reco_cnt;
	}
	public String getOpst_cnt() {
		return opst_cnt;
	}
	public void setOpst_cnt(String opst_cnt) {
		this.opst_cnt = opst_cnt;
	}
	public String getInsert_dtm() {
		return insert_dtm;
	}
	public void setInsert_dtm(String insert_dtm) {
		this.insert_dtm = insert_dtm;
	}

	@Override
	public String toString() {
		return "BoardModel [idx=" + board_id + ", title=" + title + ", viewCount=" + view_cnt + ", recoCount=" + reco_cnt
				+ ", opstCount=" + opst_cnt + ", insertDt=" + insert_dtm + "]";
	}
	
}
