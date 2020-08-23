package mysns.sns;

import java.util.ArrayList;

/**
 * File : MessageSet.java
 * Desc : SNS �Խñ� �� ����� ���� sns_main.jsp �� ������ ���� DTO(Data Transfer Object) Ŭ����
 * @author Ȳ����(dinfree@dinfree.com)
 */
public class MessageSet {
	// �޽���
	private Message message;
	
	// �ش� �޽����� ���� ��� ���
	private ArrayList<Reply> rlist = new ArrayList<Reply>();
	
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public ArrayList<Reply> getRlist() {
		return rlist;
	}
	public void setRlist(ArrayList<Reply> rlist) {
		this.rlist = rlist;
	}
}
