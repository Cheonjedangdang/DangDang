package com.dangdangcompany.dangdang.main.paging;

public class PagingDTO {

	private int pageSize; // �� �������� ���� �Խñ� ��
	private int firstPageNo; // ù ��° ������ ��ȣ
	private int prevPageNo; // ���� ������ ��ȣ
	private int startPageNo; // ���� ������ (����¡ �׺� ����)
	private int pageNo; // ������ ��ȣ
	private int endPageNo; // �� ������ (����¡ �׺� ����)
	private int nextPageNo; // ���� ������ ��ȣ
	private int finalPageNo; // ������ ������ ��ȣ
	private int totalCount; // �Խñ� ��ü ��
	private int blockSize; // ������ ��ȣ ��ũ ����
	private int startRowNum; // �Խñ� ��ȸ ������ �� row ������
	private int endRowNum; // �Խñ� ��ȸ ������ �� row ����
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

