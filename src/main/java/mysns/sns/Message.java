package mysns.sns;

/**
 * File : Message.java
 * Desc : SNS �Խñ� Data Object Ŭ����
 * @author Ȳ����(dinfree@dinfree.com)
 *
 */
public class Message {
	// �Խñ� ������ id
	private int mid;
	
	// �Խñ� �ۼ���
	private String uid;
	
	// �Խñ� ����
	private String msg;
	
	// �Խñ� �ۼ���, �ð�
	private String date;
	
	// ���ƿ� ȸ��
	private int favcount;
	
	// ��� ����
	private int replycount;
	
	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getFavcount() {
		return favcount;
	}

	public void setFavcount(int favcount) {
		this.favcount = favcount;
	}

	public int getReplycount() {
		return replycount;
	}

	public void setReplycount(int replycount) {
		this.replycount = replycount;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}
	
}