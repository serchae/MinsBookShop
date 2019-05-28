package com.bookshop.main;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookshop.domain.GoodsVO;
import com.bookshop.service.GoodsService;

@Controller("mainController")
@EnableAspectJAutoProxy
public class MainController {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping(value="/main/main.do",method= {RequestMethod.POST, RequestMethod.GET})
	public ModelAndView main(HttpServletRequest req, HttpServletResponse res)
	throws Exception{
		HttpSession session;
		ModelAndView mav= new ModelAndView();
		String viewName=(String)req.getAttribute("viewName");
		mav.setViewName(viewName);
		session=req.getSession();
		session.setAttribute("side_menu", "user");
		Map<String, List<GoodsVO>> goodsMap=goodsService.listGoods();
		mav.addObject("goodsmap", goodsMap);
		return mav;
	}
}
