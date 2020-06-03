package com.laptrinhjavaweb.controller.web;

import com.laptrinhjavaweb.dto.CartDTO;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.CartEntity;
import com.laptrinhjavaweb.entity.Item;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.service.ICartService;
import com.laptrinhjavaweb.service.ICategoryService;
import com.laptrinhjavaweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;


@Controller(value = "homeControllerOfWeb")
public class HomeController {

	@Autowired
	private IProductService productService;

	@Autowired
	private ICategoryService categoryService;

	@Autowired
	private ICartService cartService;

	@RequestMapping(value = "/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ProductDTO model = new ProductDTO();
		ProductDTO model2 = new ProductDTO();
		ModelAndView mav = new ModelAndView("web/home2");
		mav.addObject("model", model);
		mav.addObject("model2", model2);
		model.setListResult(productService.findTop2ByWeightLessThanOrderByWeightDesc());
		model2.setListResult(productService.findLast2ByWeightLessThanOrderByWeightDesc());
		return mav;
	}

	@RequestMapping(value = "/dang-nhap", method = RequestMethod.GET)
	public ModelAndView loginPage() {
		ModelAndView mav = new ModelAndView("login2");
		return mav;
	}
	@RequestMapping(value = "/about-us", method = RequestMethod.GET)
	public ModelAndView aboutUs() {
		ModelAndView mav = new ModelAndView("web/about-us");
		return mav;
	}
	@RequestMapping(value = "/our-service", method = RequestMethod.GET)
	public ModelAndView ourService() {
		ModelAndView mav = new ModelAndView("web/our-service");
		return mav;
	}
	@RequestMapping(value = "/contact-us", method = RequestMethod.GET)
	public ModelAndView contactUs() {
		ModelAndView mav = new ModelAndView("web/contact-us");
		return mav;
	}

	@RequestMapping(value = "/shop", method = RequestMethod.GET)
	public ModelAndView showList(@RequestParam("page") int page,
								 @RequestParam("limit") int limit, HttpServletRequest request) {
		ProductDTO model = new ProductDTO();
		model.setPage(page);
		model.setLimit(limit);
		ModelAndView mav = new ModelAndView("web/shop");
		Pageable pageable = new PageRequest(page - 1, limit);
		model.setListResult(productService.findAll());
		model.setTotalItem(productService.getTotalItem());
		model.setTotalPage((int) Math.ceil((double) model.getTotalItem() / model.getLimit()));

		mav.addObject("model", model);
		return mav;
	}


	@RequestMapping(value = "/myaccount", method = RequestMethod.GET)
	public ModelAndView myAccount() {
		ModelAndView mav = new ModelAndView("web/myaccount");
		return mav;
	}

	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public ModelAndView checkOut() {
		ModelAndView mav = new ModelAndView("web/checkout");
		return mav;
	}

	@RequestMapping(value = "/cart", method = RequestMethod.GET)
//	@RequestParam("id_user") int idUser
	public ModelAndView cart() {
		ModelAndView mav = new ModelAndView("web/cart");

		List<CartEntity> cartDTOS = cartService.findAllByUserId(3);
		mav.addObject("model",cartDTOS);
		return mav;
	}
	@RequestMapping(value = "/thoat", method = RequestMethod.GET)
	public ModelAndView logoutPage(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return new ModelAndView("redirect:/trang-chu");
	}

	@RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
	public ModelAndView accessDenied() {
		return new ModelAndView("redirect:/dang-nhap?accessDenied");
	}
}
