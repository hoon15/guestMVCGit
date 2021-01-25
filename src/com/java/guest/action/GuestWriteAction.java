package com.java.guest.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.java.command.CommandAction;
import com.java.guest.dao.GuestDao;
import com.java.guest.dto.GuestDto;

public class GuestWriteAction implements CommandAction {

	@Override
	public String actionDo(HttpServletRequest request, HttpServletResponse response) throws Throwable {
		
		// WriteAction --> write.jsp 호출 해 줄떄 / 작성, 리스트 출력 해준다.
		// 패이지당 게시물 출력
		
		ArrayList<GuestDto> gestList = GuestDao.gestInstance().getGuestList();
		
		if(gestList != null) {
			System.out.println("사이즈 :" + gestList.size());
			request.setAttribute("guestList", gestList);
		}
		
		return "/WEB-INF/views/guest/write.jsp";
	}

}
