package mysns.member;

import java.util.Date;

/**
 * File : Member.java
 * Desc : SNS ȸ�� Data Object Ŭ����
 * @author Ȳ����(dinfree@dinfree.com)
 *
 */
public class Member {	
	// ȸ�� �̸�
	private String name;
	
	// ȸ�� ���̵�(�α��ο�)
	private String uid;
	
	// �α��� ��й�ȣ
	private String passwd;
	
	// �̸��� �ּ�
	private String email;
	
	// ������
	private Date date;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String id) {
		this.uid = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
