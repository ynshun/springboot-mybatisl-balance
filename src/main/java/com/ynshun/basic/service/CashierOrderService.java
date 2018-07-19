package com.ynshun.basic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ynshun.basic.mapper.CashierOrderMapper;
import com.ynshun.common.annotation.ReadDataSource;
import com.ynshun.common.annotation.WriteDataSource;
import com.ynshun.common.domain.CashierOrder;

/**
 * 
 * 如果需要事务，自行在方法上添加@Transactional
 * 如果方法有内部有数据库操作，则必须指定@WriteDataSource还是@ReadDataSource
 * 
 * 注：AOP ，内部方法之间互相调用时，如果是xxx()这形式，不会触发AOP拦截，可能会 导致无法决定数据库是走写库还是读库 方法：
 * 为了触发AOP的拦截，调用内部方法时，需要特殊处理下，看方法this
 * 
 * @author ynshun
 * @since 2018年6月30日
 * @version 1.0
 */
@Service
public class CashierOrderService {
	@Autowired
	private CashierOrderMapper cashierOrderMapper;

	@Transactional
	@WriteDataSource
	public void insertUser(CashierOrder u) {
		cashierOrderMapper.insert(u);
	}

	/**
	 * 写事务里面调用读
	 * 
	 * @param u
	 */
	@WriteDataSource
	public void writeAndRead(CashierOrder u) {
		insertUser(u);
		CashierOrder uu = findById(u.getId());
		System.out.println("==读写混合测试中的读(刚刚插入的)====id=" + u.getId() + ",  user_name=" + uu.getFinalAmount());
		CashierOrder uuu = findById(1);
		System.out.println("==读写混合测试中的读====id=1,  user_name=" + uuu.getFinalAmount());
	}

	@Transactional
	@WriteDataSource
	public void readAndWirte(CashierOrder u) throws Exception {
		CashierOrder uu = findById(1);
		System.out.println("==读写混合测试中的读====id=1,user_name=" + uu.getFinalAmount());
		insertUser(u);
		// throw new NullPointerException("测试异常看事务");
	}

	@ReadDataSource
	public CashierOrder findById(Integer id) {
		return cashierOrderMapper.findById(id);
	}

	@ReadDataSource
	public PageInfo<CashierOrder> queryPage(Integer id, int pageNum, int pageSize) {
		Page<CashierOrder> page = PageHelper.startPage(pageNum, pageSize);
		cashierOrderMapper.queryOrderDetail(id);
		return page.toPageInfo();
	}


}
