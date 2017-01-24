package com.dangdangcompany.dangdang.main.paging;

public class PagingDTO {

	private int pageSize; // 한 페이지에 보일 게시글 수
	private int firstPageNo; // 첫 번째 페이지 번호
	private int prevPageNo; // 이전 페이지 번호
	private int startPageNo; // 시작 페이지 (페이징 네비 기준)
	private int pageNo; // 페이지 번호
	private int endPageNo; // 끝 페이지 (페이징 네비 기준)
	private int nextPageNo; // 다음 페이지 번호
	private int finalPageNo; // 마지막 페이지 번호
	private int totalCount; // 게시글 전체 수
	private int blockSize; // 페이지 번호 링크 개수
	private int startRowNum; // 게시글 조회 쿼리에 들어갈 row 시작점
	private int endRowNum; // 게시글 조회 쿼리에 들어갈 row 끝점
	private int categoryId;
	private int pageGroup;
	public PagingDTO(){}
	public PagingDTO(int pageSize, int firstPageNo, int prevPageNo, int startPageNo, int pageNo, int endPageNo,
			int nextPageNo, int finalPageNo, int totalCount, int blockSize, int startRowNum, int endRowNum,
			int categoryId, int pageGroup) {
		super();
		this.pageSize = pageSize;
		this.firstPageNo = firstPageNo;
		this.prevPageNo = prevPageNo;
		this.startPageNo = startPageNo;
		this.pageNo = pageNo;
		this.endPageNo = endPageNo;
		this.nextPageNo = nextPageNo;
		this.finalPageNo = finalPageNo;
		this.totalCount = totalCount;
		this.blockSize = blockSize;
		this.startRowNum = startRowNum;
		this.endRowNum = endRowNum;
		this.categoryId = categoryId;
		this.pageGroup = pageGroup;
	}


	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getFirstPageNo() {
		return firstPageNo;
	}

	public void setFirstPageNo(int firstPageNo) {
		this.firstPageNo = firstPageNo;
	}

	public int getPrevPageNo() {
		return prevPageNo;
	}

	public void setPrevPageNo(int prevPageNo) {
		this.prevPageNo = prevPageNo;
	}

	public int getStartPageNo() {
		return startPageNo;
	}

	public void setStartPageNo(int startPageNo) {
		this.startPageNo = startPageNo;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getEndPageNo() {
		return endPageNo;
	}

	public void setEndPageNo(int endPageNo) {
		this.endPageNo = endPageNo;
	}

	public int getNextPageNo() {
		return nextPageNo;
	}

	public void setNextPageNo(int nextPageNo) {
		this.nextPageNo = nextPageNo;
	}

	public int getFinalPageNo() {
		return finalPageNo;
	}

	public void setFinalPageNo(int finalPageNo) {
		this.finalPageNo = finalPageNo;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	public int getBlockSize() {
		return blockSize;
	}

	public void setBlockSize(int blockSize) {
		this.blockSize = blockSize;
	}
	
	public int getStartRowNum() {
		return startRowNum;
	}

	public void setStartRowNum(int startRowNum) {
		this.startRowNum = startRowNum;
	}

	public int getEndRowNum() {
		return endRowNum;
	}

	public void setEndRowNum(int endRowNum) {
		this.endRowNum = endRowNum;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}


	@Override
	public String toString() {
		return "PagingDTO [pageSize=" + pageSize + ", firstPageNo=" + firstPageNo + ", prevPageNo=" + prevPageNo
				+ ", startPageNo=" + startPageNo + ", pageNo=" + pageNo + ", endPageNo=" + endPageNo + ", nextPageNo="
				+ nextPageNo + ", finalPageNo=" + finalPageNo + ", totalCount=" + totalCount + ", blockSize="
				+ blockSize + ", startRowNum=" + startRowNum + ", endRowNum=" + endRowNum + ", categoryId=" + categoryId
				+ "]";
	}
	public int getPageGroup() {
		return pageGroup;
	}
	public void setPageGroup(int pageGroup) {
		this.pageGroup = pageGroup;
	}
	
}

