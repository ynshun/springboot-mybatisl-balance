package com.ynshun.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.ynshun.basic.service.CashierOrderService;
import com.ynshun.common.domain.CashierOrder;

@Controller
@RequestMapping("/order")
public class CashierOrderController {
	@Autowired
	private CashierOrderService cashierOrderService;

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "hello";
	}

	/**
	 * 测试插入
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/add")
	public String add(String userName) {
		CashierOrder u = new CashierOrder();
		cashierOrderService.insertUser(u);
		return u.getId() + "    " + u.getFinalAmount();
	}

	/**
	 * 测试读
	 * 
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/get/{id}")
	public Object findById(@PathVariable("id") Integer id) {
		return cashierOrderService.findById(id);
	}

	/**
	 * 测试写然后读
	 * 
	 * @param id
	 * @param userName
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/addAndRead")
	public String addAndRead(@RequestParam(value = "id", defaultValue = "1") int id, String userName) {
		CashierOrder u = new CashierOrder();
		u.setId(id);
		cashierOrderService.writeAndRead(u);
		return u.getId() + "    " + u.getFinalAmount();
	}

	/**
	 * 测试读然后写
	 * 
	 * @param id
	 * @param userName
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/readAndAdd")
	public Object readAndWrite(String id, String userName) {
		CashierOrder u = new CashierOrder();
		try {
			cashierOrderService.readAndWirte(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
	}

	/**
	 * 测试分页插件
	 * 
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/queryPage")
	public String queryPage(Integer id, @RequestParam(value = "pageNum", defaultValue = "1") int pageNum, @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
		PageInfo<CashierOrder> page = cashierOrderService.queryPage(id, pageNum, pageSize);
		StringBuilder sb = new StringBuilder();
		sb.append("<br/>总页数=" + page.getPages());
		sb.append("<br/>总记录数=" + page.getTotal());
		for (CashierOrder u : page.getList()) {
			sb.append("<br/>" + u.getId() + " : " + u.getFinalAmount());
		}
		System.out.println("分页查询....\n" + sb.toString());
		return sb.toString();
	}

}
