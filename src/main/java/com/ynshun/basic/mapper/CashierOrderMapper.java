package com.ynshun.basic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ynshun.common.domain.CashierOrder;

@Mapper
public interface CashierOrderMapper {

	@Insert("insert cashier_order(id) values(null)")
	void insert(CashierOrder u);

	@Select("select * from cashier_order where id=#{id}")
	CashierOrder findById(@Param("id") Integer id);

	List<CashierOrder> queryOrderDetail(@Param("id") Integer id);

}
