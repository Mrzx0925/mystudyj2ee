package com.action;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.dao.NoticeDao;
import com.entity.Notice;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class NoticeAction {

	Notice notice;
	NoticeDao noticeDao;
	
	public void info() {
		List<Notice> s = noticeDao.findByExample(notice);
		ajax(s);
	}

	
	
	
	
	public NoticeDao getNoticeDao() {
		return noticeDao;
	}

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}
	
	
	
	//传递的是数组json

	public String ajax(Object out) {
		PrintWriter writer = null;
		try {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setContentType("application/json;charset=utf-8");
			writer = response.getWriter();
			response.setDateHeader("Expires", 0);
			JSONArray object = JSONArray.fromObject(out);
			writer.write(object.toString());
			writer.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				writer.close();
			}
		}
		return null;
	}

}
